package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void more1000(){
        assertEquals(service.remain(2000), 1000);
    }
    @Test
    public void less1000(){
        assertEquals(service.remain(100), 900);
    }
    @Test
    public void equals1000(){
        assertEquals(service.remain(1000), 1000);
    }
    @Test
    public void negative(){
        assertEquals(service.remain(-100), 1100);
    }
    @Test
    public void zero(){
        assertEquals(service.remain(0), 1000);
    }
}