import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.socialCalendar.controller.EventMgtController;
import com.socialCalendar.service.CommentService;


public class Test2 {
	private ApplicationContext applicationContext;
	@Before
	public void init() throws Exception {

		applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
	}
	
	@Test
	public void EventMgtControllerTest()throws Exception {
		EventMgtController event = new EventMgtController();
//		CommentService commentService = (CommentService) applicationContext.getBean("commentService");
//		System.out.println(commentService.findCommentByEventId(1));
//		System.out.println(event.getEventComment("{\"activeId\"=\"1\"}"));
		System.out.println(event.listEvent("1"));
	}
}
