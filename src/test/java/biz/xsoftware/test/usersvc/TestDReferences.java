package biz.xsoftware.test.usersvc;

import biz.xsoftware.api.usersvc.User;

public class TestDReferences extends TestBUserService {

	public TestDReferences(String name) {
		super(name);
	}
	
	public void testBasic() {
		int id1 = 4;
		String name1 = "dean";
		
		User employee = userSvc.createUser(id1, name1, "hiller");
		
		employee.setId(5);
		employee.setFirstName("xxx");

		assertEquals(5, employee.getId());
		assertEquals("xxx", employee.getFirstName());

		employee.setId(id1);
		employee.setFirstName(name1);
		
		User employee2 = userSvc.getUser(id1);
		assertEquals(id1, employee2.getId());
		assertEquals(name1, employee2.getFirstName());
		
	}
}
