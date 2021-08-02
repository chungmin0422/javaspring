package com.kgitbank.quiz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgitbank.quiz.Prime;



@RunWith(SpringJUnit4ClassRunner.class) 	
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class QuizTest {
@Autowired
Prime prime;
//Prime prime = new Prime();

//1�� �Ҽ��� �ƴ϶�� ������ ����ϴ� �׽�Ʈ�� �ۼ�
@Test
public void check1() {
	assertFalse("1�� �Ҽ��� �ƴ϶�� ���;���",prime.isPrime(1));

	}


//3�� �Ҽ���� �Ǻ��Ǹ� ����ϴ� �׽�Ʈ
@Test 
@Ignore
public void check3() {
	assertTrue("3�� �Ҽ���� ���;���",prime.isPrime(3));

	}
//���ϴ� ���ܰ� �߻��ؾ� ����ϴ� �׽�Ʈ
@Test(expected =ClassNotFoundException.class )
public void expectedTest() throws ClassNotFoundException {
	prime.veryAwesomeFunction(123);
	}

//�ð����Ѿȿ� �����ؾ��ϴ� �׽�Ʈ
@Test(timeout = 100)
public void timeoutTest() {
	for(int i=0;i<1000000;++i) {
		System.out.println(i+"���� ���");
	}
	}
}
