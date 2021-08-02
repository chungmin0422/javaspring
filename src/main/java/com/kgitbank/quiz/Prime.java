package com.kgitbank.quiz;

import org.springframework.stereotype.Component;

@Component
public class Prime {

	public boolean isPrime(int num) {
	
		//소수인지 아닌지 복잡한 판별코드
		return num % 2 == 0 ? true : false;
   }
	public void veryAwesomeFunction(int num) throws ClassNotFoundException {
		if (num > 0) {
			throw new ClassNotFoundException();
		}
	}
	
}
