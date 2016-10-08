import javax.swing.*;

/**
 * Created by amyzhu on 16/10/7.
 * Use model-view-controller pattern for this vector drawing program.
 * Construct new view and controller in main function.
 */
public class Main {
    public static void main(String[] args){
        View view = new View();
        Controller controller = new Controller(view);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(640, 480);
        view.setVisible(true);
    }
}
