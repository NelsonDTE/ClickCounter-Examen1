package es.ulpgc.eite.cleancode.clickcounter;

import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

//@RunWith(AndroidJUnit4ClassRunner.class)
@RunWith(RobolectricTestRunner.class)
@LargeTest
public class CounterUnitTests {

  CounterUnitRobot robot = new CounterUnitRobot();

  @Test
  public void pulsar_boton_1_vez() { // 1

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra DESACTIVADO")
    robot.botón_CLICKS_se_encuentra(false);


    // When("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();

    // Then("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

  }



  @Test
  public void pulsar_boton_1_vez_rotando_pantalla() { // 2

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra DESACTIVADO")
    robot.botón_CLICKS_se_encuentra(false);
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

  }

  @Test
  public void pulsar_boton_10_veces() { // 3

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra DESACTIVADO")
    robot.botón_CLICKS_se_encuentra(false);

    // When("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

  }


  @Test
  public void pulsar_boton_10_veces_rotando_pantalla() { // 4

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra DESACTIVADO")
    robot.botón_CLICKS_se_encuentra(false);
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

  }



  @Test
  public void pulsar_boton_10_veces_y_ver_numero_clicks() { // 5

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();

    // When("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();

    // Then("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("texto en COUNTER muestra 10")
    robot.texto_en_CLICKS_muestra(10);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);

  }


  @Test
  public void pulsar_boton_10_veces_y_ver_numero_clicks_rotando_pantalla() { // 6

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en COUNTER muestra 10")
    robot.texto_en_CLICKS_muestra(10);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);

  }

  @Test
  public void pulsar_boton_11_veces_y_resetear_clicks() { // 7

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("texto en COUNTER muestra 11")
    robot.texto_en_CLICKS_muestra(11);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);

    // When("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_CLICKS_muestra(0);
    // And("botón CLEAR se encuentra DESACTIVADO")
    robot.botón_CLEAR_se_encuentra(false);
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
  }



  @Test
  public void pulsar_boton_11_veces_y_resetear_clicks_rotando_pantalla() { // 8

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("texto en COUNTER muestra 11")
    robot.texto_en_CLICKS_muestra(11);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);
    // And("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();
    // And("texto en COUNTER muestra 0")
    robot.texto_en_CLICKS_muestra(0);
    // And("botón CLEAR se encuentra DESACTIVADO")
    robot.botón_CLEAR_se_encuentra(false);
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
  }


  @Test
  public void pulsar_boton_12_veces_y_resetear_contador() { // 9

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("texto en COUNTER muestra 2")
    robot.texto_en_COUNTER_muestra(2);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

    // When("hacemos clic en botón RESET")
    robot.hacemos_clic_en_botón_RESET();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
  }


  @Test
  public void pulsar_boton_12_veces_y_resetear_contador_rotando_pantalla() { // 10

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("texto en COUNTER muestra 2")
    robot.texto_en_COUNTER_muestra(2);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
    // And("hacemos clic en botón RESET")
    robot.hacemos_clic_en_botón_RESET();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();

    // Then("texto en COUNTER muestra 0")
    robot.texto_en_COUNTER_muestra(0);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra DESACTIVADO")
    robot.botón_RESET_se_encuentra(false);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
  }


  @Test
  public void pulsar_boton_13_veces_y_ver_numero_clicks() { // 11

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
    // And("hacemos clic en botón RESET")
    robot.hacemos_clic_en_botón_RESET();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);

    // When("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();

    // Then("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("texto en CLICKS muestra 2")
    robot.texto_en_CLICKS_muestra(2);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);
  }


  @Test
  public void pulsar_boton_13_veces_y_ver_numero_clicks_rotando_pantalla() { // 12

    // Given("iniciamos pantalla COUNTER")
    robot.iniciamos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();
    // And("hacemos clic en botón CLEAR")
    robot.hacemos_clic_en_botón_CLEAR();
    // And("finalizamos pantalla CLICKS")
    robot.finalizamos_pantalla_CLICKS();
    // And("resumimos pantalla COUNTER")
    robot.resumimos_pantalla_COUNTER();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
    // And("hacemos clic en botón RESET")
    robot.hacemos_clic_en_botón_RESET();
    // And("hacemos clic en botón INCREMENT")
    robot.hacemos_clic_en_botón_INCREMENT();
    // And("texto en COUNTER muestra 1")
    robot.texto_en_COUNTER_muestra(1);
    // And("botón INCREMENT se encuentra ACTIVADO")
    robot.botón_INCREMENT_se_encuentra(true);
    // And("botón RESET se encuentra ACTIVADO")
    robot.botón_RESET_se_encuentra(true);
    // And("botón CLICKS se encuentra ACTIVADO")
    robot.botón_CLICKS_se_encuentra(true);
    // And("hacemos clic en botón CLICKS")
    robot.hacemos_clic_en_botón_CLICKS();
    // And("pausamos pantalla COUNTER")
    robot.pausamos_pantalla_COUNTER();
    // And("iniciamos pantalla CLICKS")
    robot.iniciamos_pantalla_CLICKS();

    // When("rotamos pantalla COUNTER")
    robot.rotamos_pantalla_COUNTER();
    // And("rotamos pantalla CLICKS")
    robot.rotamos_pantalla_CLICKS();

    // Then("texto en CLICKS muestra 2")
    robot.texto_en_CLICKS_muestra(2);
    // And("botón CLEAR se encuentra ACTIVADO")
    robot.botón_CLEAR_se_encuentra(true);
  }
}
