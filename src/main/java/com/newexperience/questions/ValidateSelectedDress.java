package com.newexperience.questions;

import com.newexperience.userinterfaces.ProductDescription;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateSelectedDress implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(ProductDescription.TITLE).viewedBy(actor).asString();
	}
	
	public static ValidateSelectedDress inTheDescription() {
		return new ValidateSelectedDress();
	}

}
