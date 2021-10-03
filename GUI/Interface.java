import javax.swing.JOptionPane;
public class Interface {

	public static void main(String[] args) {

    String name = JOptionPane.showInputDialog("Enter your name");

    JOptionPane.showMessageDialog(null, "Hello " +name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

    JOptionPane.showMessageDialog(null, "your are " +age+ " years old");

    double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    
    JOptionPane.showMessageDialog(null, "your are " +Height+ " cm tall.");
	}

}
