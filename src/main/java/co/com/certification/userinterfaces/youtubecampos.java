package co.com.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class youtubecampos {

    public static Target BTN_BUSCAR= Target.the("Boton para buscar videos").located(By.id("search-icon-legacy"));
    public static Target SPC_NOMBRE_VIDEO=Target.the("Espacio donde ingresar el nombre del video").locatedBy("//input[@placeholder='Buscar']");
    public  static Target FT_FILTRAR = Target.the("Filtar tema").locatedBy("//yt-formatted-string[text()='Filtrar']");
}
