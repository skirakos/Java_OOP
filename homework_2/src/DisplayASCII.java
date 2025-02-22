public class DisplayASCII {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 256; i++) {
            ch = (char) i;
            System.out.print(i + " " + ch + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
