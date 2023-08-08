import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();

        store.addToy(1, "YUla", 20);
        store.addToy(2, "Dog", 10);
        store.addToy(3, "Cat", 60);
        store.addToy(4, "Pig", 30);
        store.addToy(5, "Car", 40);
        store.addToy(6, "Beer", 50);


        store.setToyWeight(2, 30);
  
        store.play();

        store.getPrizeToy();
          
        
    }
}