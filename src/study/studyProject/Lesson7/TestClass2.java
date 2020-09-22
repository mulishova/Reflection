package study.studyProject.Lesson7;

public class TestClass2 {

    @BeforeSuite
    void beforeMethod_2 () {
        System.out.println("beforeMethod_2");
    }

    @Test(testPriority = 3)
    void testMethod_Priority3 () {
        System.out.println("testMethod_Priority 3");
    }

    @Test(testPriority = 2)
    void testMethod_Priority2 () {
        System.out.println("testMethod_Priority 2");
    }

    @Test(testPriority = 1)
    void testMethod_Priority1 () {
        System.out.println("testMethod_Priority 1");
    }

    @AfterSuite
    void afterMethod_2 () {
        System.out.println("afterMethod_2");
    }

}
