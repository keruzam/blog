package pl.keruzam.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Test
 * 
 * @author keruzam
 * 
 */
public class App {

	private static final String SPRING_BEANS = "Beans.xml";
	private static final String BEAN_NAME = "bean";

	public static void main(final String[] args) {
		ApplicationContext context = getAppContext();
		Bean bean = getAppBean(context);
		System.out.println("Bean name: " + bean.getName());
	}

	public static Bean getAppBean(final ApplicationContext context) {
		return (Bean) context.getBean(BEAN_NAME);
	}

	public static ApplicationContext getAppContext() {
		return new ClassPathXmlApplicationContext(SPRING_BEANS);
	}
}
