package com.newexperience.tasks;

import com.newexperience.userinterfaces.MainPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectWomenCategory implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MainPage.BTN_WOMEN));

	}
	
	public static SelectWomenCategory inThePage() {
		return new SelectWomenCategory();
	}

}
