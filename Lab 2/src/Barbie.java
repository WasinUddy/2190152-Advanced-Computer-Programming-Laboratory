public class Barbie extends Doll{
    public Barbie(String name, String material, Float price) {
        super(name, material, price);
    }

    public Barbie(String name, Float price) {
        super(name, "Plastic", price);
    }

    @Override
    public void play() {
        System.out.println("Barbie sings: I'm a Barbie girl in a Barbie world!");
    }

}


