package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main (String[] args){
        Class personClass = Person.class; //클래스 객체에 Person의 정보를 담는다.

        Constructor[] cons = personClass.getConstructors();
        for(Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println();

        Method[] methods = personClass.getMethods();

        for(Method m : methods) {
            System.out.println(m);
        }

        //field´Â public ¸¸ º¸ÀÔ´Ï´Ù.
        System.out.println();
        Field[] fields = personClass.getFields();
        for(Field f : fields) {
            System.out.println(f);
            System.out.println(f.getName());
        }
    }
}

