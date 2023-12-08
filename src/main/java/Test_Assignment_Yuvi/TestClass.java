package Test_Assignment_Yuvi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBaseClass {

	@Test
	public void validateemailaddresspresent() {
		Objectclass oc = new Objectclass(driver);

		oc.entercity();

		log.info("clear present city and enter chennai");

		oc.clickgo();

		log.info("continue clicking go by entering chennai");

		oc.clicknext();

		log.info("move to service by clicking next");

		Objectclass2 oc2 = new Objectclass2(driver);

		oc2.clickTap();

		log.info("select check box tap");

		oc2.clciknextbutton();

		log.info("move to next");

		oc2.clcikreplacebutton();

		log.info("select checkbox replace");

		oc2.clciknextbutton2();

		log.info("move to next");

		oc2.selectleakinpipe();

		log.info("select check box leakinpipe");

		oc2.clciknextbutton3();

		log.info("move to next");

		Objectclass3 oc3 = new Objectclass3(driver);

		oc3.entertext();

		log.info("Enter water flow is very high");

		oc3.clicknext();

		log.info("move to next");

		Objectclass4 oc4 = new Objectclass4(driver);

		oc4.selectonspecificdate();

		log.info("select on specific date option");

		oc4.clicknext();

		log.info("move to next");

		oc4.selectdecember14();

		log.info("select date 14 december");

		oc4.clicknext2();

		log.info("move to next");

		oc4.clickdropdown();

		log.info("select time dropdown");

		oc4.selecttime();

		log.info("select time 03:00");

		oc4.clicknext3();

		log.info("move to next");

		ObjectClass5 oc5 = new ObjectClass5(driver);

		boolean expectedresult = oc5.enteremailaddress();

		boolean actualresult = true;

		log.info("Enter email address");

		Assert.assertEquals(expectedresult, actualresult);

	}

}
