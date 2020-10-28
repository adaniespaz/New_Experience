package com.newexperience.tasks;

import com.newexperience.userinterfaces.CasualDressesPage;
import com.newexperience.userinterfaces.DressesPage;
import com.newexperience.userinterfaces.WomenPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LookForCasualDress implements Task {
	
	private String size;

	public LookForCasualDress(String size) {
		this.size = size;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(WomenPage.BTN_DRESSES),
				Click.on(DressesPage.BTN_CASUAL_DRESSES)
				);
		if(size.equalsIgnoreCase("s")) {
			actor.attemptsTo(Click.on(CasualDressesPage.INP_SIZE_S));
		}
		actor.attemptsTo(Click.on(CasualDressesPage.BTN_PRINTED_DRESS));

	}
	
	public static LookForCasualDress inTheCatalog(String size) {
		return new LookForCasualDress(size);
	}

}
