public class App {
    public static void main(String[] args) {
        Doll[] dolls = new Doll[5];

        dolls[0] = new Barbie("Barbie1", 29.99f);
        dolls[1] = new Barbie("Barbie2", 34.99f);
        dolls[2] = new TeddyDoll("Teddy", 19.99f);
        dolls[3] = new PorcelainDoll("Porcelain1", 49.99f);
        dolls[4] = new PorcelainDoll("Porcelain2", 59.99f);

        for (Doll doll : dolls) {
            doll.displayInfo();
            if (!doll.isFragile()) {
                doll.play();
            } else {
                System.out.println("This doll is fragile. Not playing with it.");
            }
            System.out.println();
        }
    }
}