import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.security.auth.login.FailedLoginException;
import javax.swing.text.FieldView;

public class Serializator {

    private String pachname;

    public boolean serialization(Cat cat) {

        boolean flag = false;

        File file = new File("C:/Users/Asus/Desktop/Java/OOP_I/Soxpanu/cat.txt");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return flag;
    }

    // public Cat deserialization() throws ClassNotFoundException,
    // //InvalidObjectException {
    // File file = //new File("C:/Users/Asus/Desktop/Java/OOP_I/Soxpanu/cat.txt");
    // ObjectInputStream ois = null;

    // try {
    // FileInputStream fis = new FileInputStream(file);
    // if(fis!=null){
    // ois = new ObjectInputStream(fis);
    // Cat cat = (Cat) ois.readObject();
    // return cat;
    // }

    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // } finally {
    // try {
    // ois.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    // throw new InvalidObjectException("Object fail");

    // }

}
