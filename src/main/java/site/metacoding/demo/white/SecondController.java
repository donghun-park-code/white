package site.metacoding.demo.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecondController {

// 데이터 받기
// GET -> QueryString -> http body가 없음 -> QueryString. PathVariable -> From(GET) -> 브라우저 (주소 뒤 ? 붙이기)
// POST.PUT -> http body 담아준다 -> Form(POST) -> JS
// DELETE -> http body가 없음 -> QueryString. PathVariable(PK)
	@GetMapping("/second/{id}") //PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id :"+id;
	}
	
	// QueryString = x-www-머시기 타입이다.
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title :" +title+", content : " +content;
	}
	
	//body에 담아 보낸다.
	@PostMapping("/second")
	public String postData(String title, String content) { // 스프링 파싱 기본전략 : x-www-form-???
		return "title :" +title+", content : " +content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) { // 스프링 파싱 기본전략 : x-www-form-???
		return "title :" +title+", content : " +content;
	}
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) {
		return id +" delete ok";
	}
}
