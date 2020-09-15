package grafico;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * @author marcn
 */
public class Grafico extends JFrame implements ActionListener
{
    private JLabel      greetingLabel;
    private JTextField  ageField;
    private JButton     button;
    private JTextField  desicionField;
    private JTextField  commentaryField;
    private JTextField  signOffField;
    private JTextField  prueba;

    public static void main(String[] args)
    {
        Grafico demo = new Grafico();
        demo.setSize(500,500);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        greetingLabel = new JLabel("Ingresa tu edad: ");
        window.add(greetingLabel);
        
        ageField = new JTextField(15);
        window.add(ageField);
        
        button = new JButton("Check");
        window.add(button);
        button.addActionListener(this);
        
        desicionField = new JTextField(15);
        window.add(desicionField);
        
        commentaryField = new JTextField(15);
        window.add(commentaryField);
        
        prueba = new JTextField(15);
        window.add(prueba);
        
        signOffField = new JTextField(15);
        window.add(signOffField);
    }

    public void actionPerformed(ActionEvent event)
    {
        int age;
        age = Integer.parseInt(ageField.getText());
        if(age < 17){
            desicionField.setText("Puedes votar");
            commentaryField.setText("Congrats");
        }else{
            desicionField.setText("you may not vote");
            commentaryField.setText("Sorry bro");
        }
        signOffField.setText("Best Wishes");
        prueba.setText("Adios");
    }
}
