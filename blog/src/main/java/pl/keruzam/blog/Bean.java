package pl.keruzam.blog;

/**
 * Spring Test
 * 
 * @author keruzam
 *
 */
public class Bean {
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printName() {
		System.out.println("Bean name: " + name);
	}
	
}
