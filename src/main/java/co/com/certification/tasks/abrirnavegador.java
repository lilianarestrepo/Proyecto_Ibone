package co.com.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

// implemento la tarea ("implements Task luego Alt + Enter hasta que genere el actor")
public class abrirnavegador implements Task {

    //creo un objeto
    private PageObject pez;
    //creo el constructor con el mismo nombre de la clase

    public abrirnavegador(PageObject p){
        this.pez=p;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(pez));

    }

//Un método va siempre afuera de otro método, la p viene del stepdefinitios

    public static abrirnavegador on (PageObject p){
        return  instrumented(abrirnavegador.class,p);
    }




}
