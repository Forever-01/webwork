package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.IGoodService;
import vo.Good;

//让测试在Spring容器环境下执行
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger log = LogManager.getLogger(Test.class.getName());

	@Autowired
	private IGoodService goodService;
	@Test
	public void test1() {
//		log.info("查询结果："+goodService.queryByPid(0).toString());
		log.info("查询结果："+String.valueOf(goodService.updateGood(new Good(33,"456",1))));
	}
}
