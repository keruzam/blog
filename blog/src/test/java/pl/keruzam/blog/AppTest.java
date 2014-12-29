package pl.keruzam.blog;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void shouldShowNewSetName() throws Exception {
		// given
		ApplicationContext context = App.getAppContext();
		Bean bean = App.getAppBean(context);

		// when
		bean.setName("Swiezak");
		String name = bean.getName();

		// then
		Assert.assertEquals(name, "Swiezak");
	}

}
