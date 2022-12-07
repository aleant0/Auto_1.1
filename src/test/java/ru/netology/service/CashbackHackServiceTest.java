package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}