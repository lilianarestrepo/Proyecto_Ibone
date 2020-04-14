package co.com.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certification.userinterfaces.youtubecampos.FT_FILTRAR;

public class answer implements Question<Boolean>
{    	@Override 	public Boolean answeredBy(Actor actor)
{ 		return
    (Text.of(FT_FILTRAR).viewedBy(actor).asString().equals("Filtrar"));
    }
     public static answer d()
     { 		 		return new answer (); 	} }
