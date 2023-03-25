package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountIfLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(750);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAmountIfMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 250;
        int actual = service.remain(1750);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAmountIfZero() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }
}