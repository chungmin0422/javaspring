package com.kgitbank.service;


import org.springframework.stereotype.Component;


//스프링의 root-context에 컴포넌트로서 등록할것
@Component
public class RockPaperScissors {
	//가위바위보중 하나를 입력받으면 승/무/패 결과가 리턴되는 메서드를 하나 작성
	private String[] result = {"승","무","패"};
			

	public String versus(String user) {
	
	return result[(int)(Math.random()*result.length)];
}

//JUnit 테스트로 메서드를 20회 테스트하고 파일에 메서드 실행 결과에 대한 로그를 남겨보세요
}





