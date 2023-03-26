package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnAmountIfLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(750);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnAmountIfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(1750);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnAmountIfZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        org.junit.Assert.assertEquals(expected, actual);
    }
}