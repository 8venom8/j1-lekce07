package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  /**
   * Testuje metodu {@link Svatky#kdyMaSvatek(String)}
   */
  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
  }



  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() {
    //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
    Svatky svatky = new Svatky();
    assertFalse(svatky.jeVSeznamu("Vendula"));
    assertFalse(svatky.jeVSeznamu("xxxxxxx"));
    assertTrue(svatky.jeVSeznamu("Monika"));
  }



  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    //TODO Otestovat, že vrací počet jmen, která máme v seznamu
    Svatky svatky = new Svatky();
    assertEquals(37, svatky.getPocetJmen());
    assertNotNull(svatky.getPocetJmen());
  }



  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  void getSeznamJmen() {
    //TODO Zkontrolovat, že seznam jmen má správný počet položek.
    Svatky svatky = new Svatky();
    assertNotNull(svatky.getSeznamJmen());
    assertEquals(37, svatky.getPocetJmen());
  }



  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 21), svatky.kdyMaSvatek("Monika"));
    assertNotEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Monika"));
  }



  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 22), svatky.kdyMaSvatek("Emil"));
    assertNotEquals(MonthDay.of(5, 11), svatky.kdyMaSvatek("Emil"));
  }



  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 21), svatky.kdyMaSvatek("Monika"));
    assertNotEquals(MonthDay.of(5, 13), svatky.kdyMaSvatek("Monika"));
  }



  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    Svatky svatky = new Svatky();
    svatky.smazatSvatek("Monika");
    assertEquals(36, svatky.getPocetJmen());
  }
}
