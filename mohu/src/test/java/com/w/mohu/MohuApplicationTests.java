package com.w.mohu;

import com.w.mohu.mapper.UserMapper;
import com.w.mohu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MohuApplicationTests {
  @Autowired
  private UserMapper userMapper;
	@Test
	public void contextLoads() {
		List<User> name = userMapper.findByName("李");
		for (User a:name){
			System.out.println(a);
		}
	}

}

