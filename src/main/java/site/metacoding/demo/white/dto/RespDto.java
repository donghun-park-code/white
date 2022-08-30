package site.metacoding.demo.white.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RespDto<T> {
	
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과를 메세지에 담기
	private T body; // T <- 바디로도 받을수 있기 떄문에 속성을 t로 설정
	
}
