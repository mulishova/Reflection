package study.studyProject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationWork {

    @MyAnnotation("Katya")
    public void foo(String name) {
        System.out.println("Hi " + name);
    }

    @MyAnnotation()
    public void bar(String name) {
        System.out.println("Hi " + name);
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        AnnotationWork annotationWork = new AnnotationWork();

        Method [] methods = AnnotationWork.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.getAnnotation(MyAnnotation.class) != null) {
                MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
                m.invoke(annotationWork, myAnnotation.value());
            }
        }
    }
}
