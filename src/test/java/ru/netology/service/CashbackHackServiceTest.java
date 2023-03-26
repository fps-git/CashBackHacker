package ru.netology.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    //JUnit4

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

    //JUnitJupiter

    @org.junit.jupiter.api.Test
    public void shouldReturnAmountIfLessThan1000JJ() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(750);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnAmountIfMoreThan1000JJ() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(1750);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnZeroJJ() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnAmountIfZeroJJ() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }
}