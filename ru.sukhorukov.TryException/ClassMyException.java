import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

/**
 * Created by Администратор on 03.10.2015.
 */
public class ClassMyException implements ExceptionGenerator {
    @Override
    public void generateNullPointerException() {
        int[] a = null;
        a[0] = 0;
    }

    @Override
    public void generateClassCastException() {
        Object sb = new StringBuilder();
        StringStack st = (StringStack)sb;
    }

    @Override
    public void generateNumberFormatException() {
        short s = Short.valueOf("aaa");
    }

    @Override
    public void generateStackOverflowException() {

        class C {
           public void m(){
            this.m();};
        }

        C a = new C();
        a.m();
    }

    @Override
    public void generateOutOfMemoryException() {

    }

    @Override
    public void generateMyException(String message) throws MyException {
        throw new MyException();
    }
}
