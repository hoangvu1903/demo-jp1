package ss6;

public class main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            if( y == 0){
                // phat ngoai le chu dong
                throw new NullPointerException();
            }
            System.out.println(x + ":" + y + "=" );
            int z = x/y;
            System.out.println(z);

        }catch (ArithmeticException ae) {
            // ngoai le toan hoc
            System.out.println("tona toan sai roi, xem lai di");
        }catch (NullPointerException n) {
            // xay ra khi 1 bien chua duoc cap o nho

            System.out.println("Null....");
        }
        catch (Exception e){
            System.out.println("Loi roi, check lai di");
        }finally {
         // luc nao cung chay qua day

        }
    }
}
