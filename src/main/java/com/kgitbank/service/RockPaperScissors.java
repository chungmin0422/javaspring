package com.kgitbank.service;


import org.springframework.stereotype.Component;


//�������� root-context�� ������Ʈ�μ� ����Ұ�
@Component
public class RockPaperScissors {
	//������������ �ϳ��� �Է¹����� ��/��/�� ����� ���ϵǴ� �޼��带 �ϳ� �ۼ�
	private String[] result = {"��","��","��"};
			

	public String versus(String user) {
	
	return result[(int)(Math.random()*result.length)];
}

//JUnit �׽�Ʈ�� �޼��带 20ȸ �׽�Ʈ�ϰ� ���Ͽ� �޼��� ���� ����� ���� �α׸� ���ܺ�����
}





