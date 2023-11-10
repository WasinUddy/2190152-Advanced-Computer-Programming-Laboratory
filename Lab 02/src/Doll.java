public class Doll {
    private String name;
    private String material;
    private Float price;

    public Doll(String name, String material, Float price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String toString() {
        return this.name;
    }

    public void play() {
        System.out.println("I don't know. How to play");
    }

    public String getMaterial() {
        return this.material;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Material: " + this.material);
        System.out.println("Price: $" + this.price);
    }

    public Boolean isFragile() {
        var meth = getMaterial();
        return (meth.equals("Porcelain") || meth.equals("Glass"));
         
    }
}
