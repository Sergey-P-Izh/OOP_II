import java.io.InvalidObjectException;

import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Human human = new Human("Смирнов Василий Степанович", "25.05.1988", "Смирнова Антонина Васильевна", "Смирнов Степан Юрьевич", "Смирнова Анна Игоревна", "Смирнов Антон Васильевич");

        Wife wife = new Wife("Смирнова Анна Игоревна", "01.04.1988", "Петрова Татьяна Ивановна", "Петров Игорь Иванович", "Смирнов Василий Степанович", "Смирнов Антон Васильевич");

        FamilyTree familyTree = new FamilyTree();
        familyTree.addHuman(human);
        
       
        System.out.println(human);
        System.out.println(wife);

       Cat cat = new Cat(); // Вывод при выкл. deserialization
       cat.setName("Tom");
       Serializator serializator = new Serializator();
       System.out.println(serializator.serialization(cat));
       System.out.println(cat.getName());

       //Serializator serializator = new Serializator(); // Вывод при  deserialization
      // try{
       // Cat cat = serializator.deserialization();
        //System.out.println(cat.getName());

      // } catch (InvalidObjectException e) {
       // e.printStackTrace();
      // }
       
    
    }


}