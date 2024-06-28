package hash_tables.get_method;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println(myHashTable.get("lumber"));

        System.out.println("\nBolts:");
        System.out.println(myHashTable.get("bolts"));

        System.out.println("\nTile:");
        System.out.println(myHashTable.get("tile"));

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

    }

}