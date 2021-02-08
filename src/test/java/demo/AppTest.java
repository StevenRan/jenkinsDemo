package demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	private App appi = new App();
	
	@Test
	public void TestMethod1() {
		System.out.println("testMethod1 executed.");
	}
	
	@Test(groups= {"group1"})
	public void testAdd() {
		int expected = 10;
		Assert.assertEquals(appi.add(3,  7), expected);
	}

	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite executed");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test executed");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method executed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method executed");
	}
	
	@BeforeGroups("group1")
	public void beforeGroup() {
		System.out.println("before group executed");
	}
	
	@AfterGroups("group1")
	public void afterGroup() {
		System.out.println("after group executed");
	}
}
