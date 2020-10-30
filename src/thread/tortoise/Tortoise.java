package thread.tortoise;
import javax.swing.*;

public class Tortoise extends Thread{
    private static final int MILESTONES = 5;
    private final Thread tortoise;
    public Tortoise(){
        this.tortoise = new Thread(this,"Tortoise");

    }
    public Thread getTortoise(){
        return tortoise;
    }

}
