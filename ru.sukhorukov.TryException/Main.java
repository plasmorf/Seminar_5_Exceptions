/**
 * Created by Администратор on 03.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        ClassMyException c = new ClassMyException();
//        for (int i = 0; i < 6; i++){
        try {
            //c.generateNullPointerException();
            //c.generateClassCastException();
            //c.generateNumberFormatException();
            c.generateStackOverflowException();
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
         catch (ClassCastException n){
            n.printStackTrace();
        }
        catch (NumberFormatException n){
            n.printStackTrace();
        }
        catch (StackOverflowError n){
            n.printStackTrace();
        }

    }
}
