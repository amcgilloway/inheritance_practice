import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String args[]){
Configuration cfg = new Configuration().configure();
SessionFactory factory = cfg.buildSessionFactory();
Session session = factory.openSession();
Transaction tx = session.beginTransaction();
IndoorGame indoorGame = new IndoorGame();
indoorGame.setAgeGroup("2+");
indoorGame.setName("Clay Game");
indoorGame.setNumberOfPlayers(2);
OutdoorGame outdoorGame = new OutdoorGame();
outdoorGame.setName("Cricket");
outdoorGame.setRequiredArea("22 yards");
session.save(indoorGame);
session.save(outdoorGame);
tx.commit();
session.close();

factory.close();
}
}