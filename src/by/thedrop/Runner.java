package by.thedrop;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.*;

/**
 * Created by Kuryakov on 04-Oct-16.
 */
public class Runner {
    public static void main(String[] args) {
        //List<Integer> список = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> список = asList(1, 2, 3, 4, 5);

        //Выбрасывается NullPointer  и тут же исчезает
        try {
            throw new Исключение(new Строка("Кукарек"));
        } finally {
            return;
        }
    }
}

class Исключение extends Выбрасываемое {
    public Исключение(Строка кукарек) {
        super(кукарек);
        Система.наружу.кукарекнуть(кукарек);
        Система.наружу.кукарекнуть(super.получитьКукарек());
    }

}
class Выбрасываемое extends Throwable{
    public Выбрасываемое(Строка полныйПипец){
        super(полныйПипец.строка);
    }
    public Строка получитьКукарек(){
        return  new Строка(super.getMessage());
    }
}

