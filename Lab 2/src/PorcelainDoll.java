public class PorcelainDoll extends Doll{
    public PorcelainDoll(String name, String material, Float price) {
        super(name, material, price);
    }

    public PorcelainDoll(String name, Float price) {
        super(name, "Porcelain", price);
    }
}
