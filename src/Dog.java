public class Dog {

    // Atributos do objeto
    String dogName;
    int dogAge;


    // Métodos
    void bark () {
        System.out.println(dogName + " diz: Au au!");
    }

    void celebrateTheDogsBirthday () {
        dogAge++;
        System.out.println(dogName + " agora tem " + dogAge + " anos.");
    }
}
