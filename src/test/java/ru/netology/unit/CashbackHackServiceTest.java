package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountMore1000() {assertEquals(0, service.remain(2000)); }

    @Test
    public void amountLess1000() {
        assertEquals(900, service.remain(100));
    }

    @Test
    public void amountEquals1000() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void negativeAmount() {
        assertEquals(1000, service.remain(-100));
    }

    @Test
    public void zeroAmount() {
        assertEquals(1000, service.remain(0));
    }
}