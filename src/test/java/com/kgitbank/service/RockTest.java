package com.kgitbank.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class RockTest {
	
	Logger logs = Logger.getLogger(RockPaperScissors.class);
	
	@Autowired
	RockPaperScissors game;
	
	@Test
	public void rock() {
		
		for(int i=0;i<20;++i) {
			log.info(game.versus("�ָ�"));
		}
		
	
	}
}
