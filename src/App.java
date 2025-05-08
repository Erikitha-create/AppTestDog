public class App {
    public static void main(String[] args) {


        // Criando o objeto da classe Dog
        Dog cao1 = new Dog();

        // Atribuição de valores
        cao1.dogName = "Rex";
        cao1.dogAge = 3;


        cao1.bark();
        cao1.celebrateTheDogsBirthday();
        cao1.bark();

        System.out.println("----------------------");

        Dog cao2 = new Dog();
        cao2.dogName = "Paçoca";
        cao2.dogAge = 4;

        cao2.bark();
        cao2.celebrateTheDogsBirthday();
        cao2.bark();


    }
}