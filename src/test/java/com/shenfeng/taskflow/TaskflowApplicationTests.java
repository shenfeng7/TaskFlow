package com.shenfeng.taskflow;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskflowApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		List<String> a = new ArrayList<>();
		a.add(null);

		System.out.println(a);
		
	}

}
