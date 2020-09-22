package study.studyProject.Lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class aClass = TestClass1.class;

        start(aClass);
        start(TestClass2.class);
        start(Class.forName("study.studyProject.Lesson7.TestClass3"));
    }

    static  void start(Class myClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {

        Method methodBefore = null;
        Method methodAfter = null;
        Method[] methods = myClass.getDeclaredMethods();

        List<Method> testList = new LinkedList<>();

        Object obj = null;

        try {
            obj = myClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Method m : methods) {
            if(m.getAnnotation(BeforeSuite.class) != null) {
                if (methodBefore == null)
                    methodBefore = m;
                else
                    throw new RuntimeException("RuntimeException: More than one BeforeSuite");
            } else {
                if(m.getAnnotation(AfterSuite.class) != null) {
                    if (methodAfter == null)
                        methodAfter = m;
                    else
                        throw new RuntimeException("RuntimeException: More than one AfterSuite");
                } else {
                    if (m.getAnnotation(Test.class) != null)
                            testList.add(m);
                }
            }
        }

        if (methodBefore != null)
            methodBefore.invoke(obj);

        testList.sort(new Comparator<Method> () {
            @Override
            public int compare(Method o1, Method o2) {
                return Integer.compare(o1.getAnnotation(Test.class).testPriority(), o2.getAnnotation(Test.class).testPriority());
            }
        } );

        for (Method m : testList) {
            m.invoke(obj);
        }

        if (methodAfter != null)
            methodAfter.invoke(obj);

        System.out.println();

    }
}