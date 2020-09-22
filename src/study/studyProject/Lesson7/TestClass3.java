package study.studyProject.Lesson7;

public class TestClass3 {

    @BeforeSuite
    void beforeMethod_3 () {
        System.out.println("beforeMethod_3");
    }

    @Test(testPriority = 1)
    void testMethod_Priority1 () {
        System.out.println("testMethod_Priority 1");
    }

    @Test(testPriority = 2)
    void testMethod_Priority2 () {
        System.out.println("testMethod_Priority 2 or 3");
    }

    @Test(testPriority = 2)
    void testMethod_Priority3 () {
        System.out.println("testMethod_Priority 2 or 3");
    }

    @AfterSuite
    void afterMethod_3 () {
        System.out.println("afterMethod_3");
    }

}
