package ru.netology.service;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnAmountIfLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(750);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnAmountIfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(1750);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnAmountIfZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }
}