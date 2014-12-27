package pl.keruzam.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Test
 * 
 * @author keruzam
 *
 */
public class App 
{
    private static final String SPRING_BEANS = "Beans.xml";
	private static final String BEAN_NAME = "bean";

	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_BEANS);
		Bean bean = (Bean) context.getBean(BEAN_NAME);
		bean.printName();
	}
}
