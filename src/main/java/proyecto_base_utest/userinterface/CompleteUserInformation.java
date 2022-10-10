package proyecto_base_utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteUserInformation extends PageObject {

    public static final Target First_NAME = Target.the("user name").located(By.id("firstName"));
    public static final Target Last_NAME = Target.the("user last name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("user email").located(By.id("email"));

    public static final Target MONTH_OF_BIRTH = Target.the("user month of birht").located(By.id("birthMonth"));
    public static final Target DAY_OF_BIRTH = Target.the("user day of birth").located(By.id("birthDay"));
    public static final Target YEAR_OF_BIRTH = Target.the("user year of birth").located(By.id("birthYear"));

    public static final Target botton_location = Target.the("next location button").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));



}
