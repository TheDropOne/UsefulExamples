package by.thedrop;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

import static java.util.Arrays.*;

/**
 * Created by Kuryakov on 04-Oct-16.
 */
public class Runner {
    public static void main(String[] args) {
        //List<Integer> список = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> список = asList(1, 2, 3, 4, 5);

        // /^\w\w/a
        char a = 'f';

        int[] array = {1,2,3,4,5};
        //медленно
        String s = array[0]+"";
        //быстро
        String s2 = String.valueOf(array[0]);

        String result = "";
        //slow
        if(result.equals(""));
        //fast
        if(result.isEmpty());

        //плохо
        if (result.equals("broadcast")) ;
        //хорошо
        if ("broadcast".equals(result)) ;

        StringBuilder stringBuilder = new StringBuilder(result);
        for (int b : array){
            // slow
            result += b+"";
            //fast
            stringBuilder.append(b);
        }

        //Выбрасывается NullPointer  и тут же исчезает
        try {
            throw null;
        } finally {
            return;
        }
    }
}
