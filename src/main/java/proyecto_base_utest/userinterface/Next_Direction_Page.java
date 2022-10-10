package proyecto_base_utest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Next_Direction_Page extends PageObject {

    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("postal code").located(By.id("zip"));
    public static final Target COUTENER = Target.the("contenedor").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target COUNTRY = Target.the("COUNTRY").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public  static final Target BUTTON_DEVICES = Target.the("boton que lleva a la seccion dispositivo").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
