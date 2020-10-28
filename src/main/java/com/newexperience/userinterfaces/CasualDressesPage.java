package com.newexperience.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CasualDressesPage {

	public static final Target BTN_PRINTED_DRESS = Target.the("The button for select printed dress").locatedBy("//div[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	public static final Target INP_SIZE_S = Target.the("The check for select the s size").locatedBy("//input[@id='layered_id_attribute_group_1']");
}
