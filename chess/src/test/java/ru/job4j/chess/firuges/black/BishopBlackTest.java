package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.copy(Cell.A2).position(), is(Cell.A2));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void way1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertThat(bishopBlack.way(Cell.D4), is(new Cell[] {Cell.B2, Cell.C3, Cell.D4}));
    }
}