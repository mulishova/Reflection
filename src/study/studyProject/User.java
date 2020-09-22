package study.studyProject;

public class User {
    private String name;
    public String namePublic;
    protected String nameProtected;
    String nameDefault;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foo (String name) {
        this.name = name;
    }

    public void bar (String name) {
        System.out.println(name);
    }

    public static void sBar (String name) {
        System.out.println(name);
    }
}
