public class L3HW_Java_JdanovAlexandr {
    public static void main(String[] args) {

        boolean p, q;
        int x; // x = 1 means true, x = 0 means false
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");


        p = true;
        q = true;
        x = 0;
        if (p) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p&q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p|q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p^q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (!p) x++;
        System.out.println(x + "\t\t");


        p = true;
        q = false;
        x = 0;
        if (p) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p&q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p|q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p^q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (!p) x++;
        System.out.println(x + "\t\t");


        p = false;
        q = true;
        x = 0;
        if (p) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p&q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p|q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p^q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (!p) x++;
        System.out.println(x + "\t\t");


        p = false;
        q = false;
        x = 0;
        if (p) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p&q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p|q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (p^q) x++;
        System.out.print(x + "\t\t");
        x = 0;
        if (!p) x++;
        System.out.println(x + "\t\t");
    }
}
