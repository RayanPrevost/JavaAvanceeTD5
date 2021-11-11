package eu.dauphine.rayanPrevost.td5.javaAvancee;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList implements Iterable {

    private int start;
    private int end;
    private int currentInt;

    Panel(int start, int end) {
        this.start = start;
        this.end = end;
        this.currentInt = start;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return currentInt <= end;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(currentInt++);
            }
            
        };
    }
    
    @Override
    public Object get(int index) {
        return start + index;
    }

    @Override
    public int size() {
        return end - start + 1;
    }
    
    public static Iterator<Integer> panel1(int start, int end) {
    	Iterator<Integer> res; 
    	if(end>start) {
    		throw new IllegalArgumentException();
    	}
    	else {
    		res = new Panel(start, end).iterator();
    	}
    
    	return res;
    }


    public static Iterable<Integer> panel2(int start, int end) {
        return new Panel(start, end);
    }
    
    public static List<Integer> panel(int start, int end) {
        return new Panel(start, end);
    }

}
