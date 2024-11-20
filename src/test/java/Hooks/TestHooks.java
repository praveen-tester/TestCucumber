package Hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class TestHooks {
	
	@Before
	public void hook1() {
		System.out.println("Dummy before");
	}
		
}
