package comedu.hpugs.spring.text;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.hpugs.spring.IBlankService;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2017年9月13日 下午2:48:25
 */
public class UserTest {
	
	private IBlankService blankService;
	
	@Before
	public void before(){
		ApplicationContext appletContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		blankService = (IBlankService) appletContext.getBean("blankService");
	}
	
	@Test
	public void userTest(){
		blankService.transferAccounts("aa", "bb", 100);
	}

}
