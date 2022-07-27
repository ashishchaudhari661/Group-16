package test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Openbrowser;
@Listeners (Listner.class)

public class Ashish {
@Test
public void test1() {
	System.out.println("test1");
}
@Test(timeOut=1000)
public void test2() throws InterruptedException {
	Openbrowser.browser();
	Thread.sleep(3000);
	System.out.println("test2");
	}
@Test
public void test3() {
	System.out.println("test");
}
@Test
public void test() {
	System.out.println("test");
}
}
