package org.eugensavca.windowsdesktopautomation;

import org.eugensavca.windowsdesktopautomation.driver.DesktopDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = WindowsDesktopAutomationApplication.class)
class WindowsDesktopAutomationApplicationTests extends AbstractTestNGSpringContextTests {


	@Test
	void contextLoads() {
	}

}
