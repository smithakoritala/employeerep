package employee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class employeeJunit {
   
	 employee e=new employee();
	 
	@Test
	 public void testname() {
		e.setname("jasmeen");
		Assert.assertEquals("jasmeen", e.getname());
    }
	@Test
	
	public void testsalary() {
		e.setsalary(4000);
		Assert.assertEquals(4000, e.getsalary(),0);
    }
@Test
public void testage() {
		e.setage(20);
		Assert.assertEquals(20, e.getage());
    }
@Test
public void testdesignation() {
	e.setdesignation("QA");
	Assert.assertEquals("QA", e.getdesignation());
}

@Test
public void testbonus() {
	Assert.assertEquals(100, e.paybonus(e.getsalary()));
	
}

}
