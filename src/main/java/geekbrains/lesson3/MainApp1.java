package geekbrains.lesson3;

public class MainApp1 {
    //try catch finally throw throws
    public static void main(String[] args) {
//        int x = Integer.parseInt("2s0");
//        System.out.println(x);

//        String str = null;
//        System.out.println(str.length());

//        ServerSocket serverSocket = null;
//
//        try {
//            serverSocket = new ServerSocket(8189);
//        } catch (IOException e) {
//            e.printStackTrace();
//           try {
//               serverSocket.close();
//           } catch (IOException eIO) {
//               eIO.printStackTrace();
//           }
//        }
//        int x = 10;
//        System.out.println(1);
//        try {
//            x /= 0;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("AE catch");
//            e.printStackTrace();
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

//        System.out.println(x);

        try {
            a();
        } catch (ArithmeticException e) {
            System.out.println("main cath AE exception");
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        int x = 10 / 0;
    }
}
