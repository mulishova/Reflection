package study.studyProject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        /*Class aClass = User.class;

        Field[] arrDeclaredFields = aClass.getDeclaredFields();
        Field[] arrFields = aClass.getFields();

        for (Field f : arrDeclaredFields) {
            System.out.println(f.getName());
        }

        System.out.println();

        for (Field f : arrFields) { // только public
            System.out.println(f.getName());
        }*/

        //Class aClass = Class.forName("study.studyProject.User");

        /*User user = new User("NO");
        System.out.println(user.getName());
        Class aClass = User.class;
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(user, "YES");
        System.out.println(user.getName());*/

        /*User user = new User("NO");
        Class aClass = User.class;
        Method method = aClass.getMethod("foo", String.class);
        Method[] methods = aClass.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName() + " " + m.getReturnType() + " " + m.getParameterCount() + " " + Arrays.toString(m.getParameterTypes()) + " " + m.getModifiers());
            System.out.println();
        }*/

        /*Constructor constructor = User.class.getConstructor(String.class);
        User user = (User)constructor.newInstance("Victor"); // т.к. newInstance всегда возвращает Object
        System.out.println(user.getName());

        Class aClass = User.class;
        user = (User)aClass.newInstance(); // всегда требует дефолтный public конструктор
        System.out.println(user.getName());*/

        /*User user = new User("NO");
        Class aClass = User.class;
        Method method = aClass.getMethod("bar", String.class);
        method.invoke(user, "bar");

        Method methodS = aClass.getMethod("sBar", String.class);
        methodS.invoke(User.class, "sBar");*/
    }
}
