package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountMore1000() {
        assertEquals(0, service.remain(2000));
    }

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

    @org.junit.jupiter.api.Test
    public void amountMore1000v2() {assertEquals(0, service.remain(2000));}

    @org.junit.jupiter.api.Test
    public void amountLess1000v2() {
        assertEquals(900, service.remain(100));
    }

    @org.junit.jupiter.api.Test
    public void amountEquals1000v2() {
        assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void negativeAmountV2() {
        assertEquals(1000, service.remain(-100));
    }

    @org.junit.jupiter.api.Test
    public void zeroAmountv2() {
        assertEquals(1000, service.remain(0));
    }

}