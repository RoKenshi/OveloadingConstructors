import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(10,20,15);
        Box mucube = new Box(7);

        Box myclone = new Box(mybox2);

        System.out.println(mucube.volume());
    }
}
