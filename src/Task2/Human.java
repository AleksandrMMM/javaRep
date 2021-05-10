package Task2;

public class Human implements Movementable {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int jump(int age) {
        if (age == 18) {

            return 3;
        }
        return 2;
    }

    @Override
    public int run(int age) {
        if (age >= 18) {
            return 100;
        }
        return 75;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
