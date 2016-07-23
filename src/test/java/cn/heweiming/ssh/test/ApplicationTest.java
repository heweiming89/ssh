package cn.heweiming.ssh.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext*.xml"})
public class ApplicationTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void contextTest(){
		System.err.println(dataSource);
	}

}
