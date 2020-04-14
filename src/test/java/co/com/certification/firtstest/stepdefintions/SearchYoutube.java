package co.com.certification.firtstest.stepdefintions;

import co.com.certification.questions.answer;
import co.com.certification.tasks.abrirnavegador;
import co.com.certification.userinterfaces.login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;
import net.serenitybdd.screenplay.questions.Visibility;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static co.com.certification.tasks.buscartema.*;

import static co.com.certification.userinterfaces.youtubecampos.FT_FILTRAR;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class SearchYoutube {

    @Managed(driver = "chrome")

    private WebDriver TheNavigator;
    private Actor lindo = Actor.named("lindo");
    //Alt + Enter : ver errores que salen
    private login simulatorpage;

   // private OpenSimulationCardCreditPage simulatorpage;
    @Before
    public void SetUp(){
        lindo.can(BrowseTheWeb.with(TheNavigator));
        TheNavigator.manage().window().maximize();
    }
    /***@Entonces("^el podra ingresar exitasamente al Home de Facebook$")
    public void elPodraIngresarExitasamenteAlHomeDeFacebook() throws Exception {
       // buyer.attemptsTo(CheckResultSimulation.with(datasimulations.get(CERO)));
        //buyer.should(seeThat(withdata(), Matchers.equalTo(TRUE)).orComplainWith(notFoundMatchAnswerException.class,notFoundMatchAnswerException.getNotMatchMessage()));

    }
     ***/

    @Dado("^que el usuario esta en Youtube$")
    public void queElUsuarioEstaEnYoutube() throws Exception {
        lindo.wasAbleTo(abrirnavegador.on(simulatorpage));
    }

    /***     @Cuando("^ingresa los datos de busqueda(.*)$")
   public void ingresaLosDatosDeBusqueda(List<DatosSong> datos)
                 throws Exception {
        System.out.print("Hola");
       lindo.attemptsTo(buscartema.on(datos.get(0)));
    }***/
    /**@Cuando("^ingresa los datos de busqueda$")
    public void ingresaLosDatosDeBusqueda(List<DatosSong> datos) throws Exception {

    }
     **/
/**
    @Cuando("^ingresa los datos de busqueda$")
    public void ingresaLosDatosDeBusqueda() throws Exception {
       lindo.wasAbleTo(buscartema.on());
    }
    **/

    @Cuando("^ingresa los datos de busqueda \"([^\"]*)\"$")
    public void ingresaLosDatosDeBusqueda(String datos) throws Exception {
        lindo.wasAbleTo(on(datos));

    }

    @Entonces("^el observa la cancion$")
    public void elObservaLaCancion() throws Exception {
        //lindo.should(seeThat(Text.of(FT_FILTRAR),hasItem("Filtrar")));
       // Text.of(FT_FILTRAR).viewedBy(lindo) .asString();
        lindo.should( seeThat(answer.d(), equalTo(FALSE)));
    }




}
