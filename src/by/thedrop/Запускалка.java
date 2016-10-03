package by.thedrop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.*;

/**
 * Created by Kuryakov on 04-Oct-16.
 */
public class Запускалка {
    public static void main(String[] args) {
        //List<Integer> список = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> список = asList(1,2,3,4,5);

        try {
            throw null;
        } finally {
            return;
        }
    }
}
