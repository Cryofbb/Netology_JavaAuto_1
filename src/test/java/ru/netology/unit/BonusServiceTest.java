package ru.netology.unit;


import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class BonusServiceTest {
    BonusService service = new BonusService();

    @Test
    public void shouldReturn10IfAmountIs2000() {
        int amount = 2000;
        assertEquals(service.calculateBonus(amount), 10);
    }

    @Test
    public void shouldReturnZeroIfAmountLowerThan1000() {
        int amount = 900;
        assertEquals(service.calculateBonus(amount), 0);
    }
}