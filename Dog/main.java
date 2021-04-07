package Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobik", BREED.BULLDOG, 2);
        Dog dog2 = new Dog("Jack", BREED.DOBERMAN, 6);
        Dog dog3 = new Dog("Rex", BREED.SPANIEL, 4);


        Dog dog = new Dog();
        // verify if is not presented two dogs with same name
        dog.dogEquals(dog1, dog2, dog3);

        // oldest dog
        dog.ageOfOldest(dog1, dog2, dog3);

    }

}
© 2021 GitHub, Inc.