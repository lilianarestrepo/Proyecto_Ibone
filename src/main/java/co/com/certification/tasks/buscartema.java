package co.com.certification.tasks;

import co.com.certification.model.DatosSong;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

import java.util.List;
import java.util.Map;

import static co.com.certification.userinterfaces.youtubecampos.BTN_BUSCAR;
import static co.com.certification.userinterfaces.youtubecampos.SPC_NOMBRE_VIDEO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class buscartema implements Task {
  public String datos;

    public buscartema(String datos)
    { 		this.datos=datos; 	}

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.print(datos);
           actor.attemptsTo(Enter.theValue(datos).into(SPC_NOMBRE_VIDEO),
           Click.on(BTN_BUSCAR)

   );

    }

    //Un método va siempre afuera de otro método, la p viene del stepdefinitios

    public static buscartema on(String datos){
        return instrumented(buscartema.class, datos);
    }
}
