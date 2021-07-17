package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountMore1000() {
        assertEquals(service.remain(2000), 0);
    }

    @Test
    public void amountLess1000() {
        assertEquals(service.remain(100), 900);
    }

    @Test
    public void amountEquals1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void negativeAmount() {
        assertEquals(service.remain(-100), 1000);
    }

    @Test
    public void zeroAmount() {
        assertEquals(service.remain(0), 1000);
    }
}