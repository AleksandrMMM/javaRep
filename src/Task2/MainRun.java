package Task2;

public class MainRun {
    public static void main(String[] args) {
        Human human = new Human(18, "Ivan");

        System.out.println( human.jump(human.getAge()));
    }

}
