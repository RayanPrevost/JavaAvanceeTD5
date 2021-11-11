package eu.dauphine.rayanPrevost.td5.javaAvancee;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel implements Iterable{

    private int start, end, current;

    Panel(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(current++);
            }
            
        };
    }

    public static Iterator<Integer> panel1(int start, int end) {
        return new Panel(start, end).iterator();
    }

    public static Iterable<Integer> panel2(int start, int end) {
        return new Panel(start, end);
    }



}
