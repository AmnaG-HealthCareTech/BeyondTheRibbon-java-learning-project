import javax.swing.*;
import java.awt.*;
//import java.awt.geom.RoundRectangle2D;

class RoundedPanel extends JPanel
{
    Color PanelColor;

    RoundedPanel(Color color)
    {
        PanelColor = color;
        setOpaque(false);
    }

    @Override 
    protected void paintComponent (Graphics g)
    {
        g.setColor (PanelColor);
        g.fillRoundRect (0,0,getWidth(),getHeight(),30,30);

    }

}
public class BeyondTheRibbon 
{
    public static void main(String[] args) 
    
    {

        JFrame frame = new JFrame ("Beyond the Ribbon");
        frame.setBounds(0,0,900,650);
        ///frame.setBackground(new Color (235,223,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(246,242,239));

        frame.setLayout(null);
        
       
        RoundedPanel panel1 = new RoundedPanel(new Color(235, 203, 213));
        frame.add (panel1);
        panel1.setBounds(20,100,850, 150);
        panel1.setBackground(new Color (237,224,226));
        panel1.setLayout(null);

        JLabel text1 = new JLabel("Knowledge is a powerful place to start" );
        panel1.add(text1);
        text1.setBounds(30,25,600,35);
        text1.setFont(new Font("Arial", Font.BOLD, 24));
        text1.setForeground(new Color(123, 53, 77));


        JLabel text2 = new JLabel("Explore breast health information, learn about changes to look out for, and find trusted support" );
        panel1.add(text2);
        text2.setBounds(30,40,600,95);
        text2.setFont(new Font("Arial", 0, 12));
        text2.setForeground(new Color(158, 140, 146));

        JLabel text3 = new JLabel("BREAST CANCER AWARENESS" );
        panel1.add(text3);
        text3.setBounds(30,-30,600,95);
        text3.setFont(new Font("Arial", 0, 11));
        text3.setForeground(new Color(123, 53, 77));

        




        JLabel text4 = new JLabel("Beyond the Ribbon" );
        frame.add(text4);
        text4.setBounds(70,0,600,95);
        text4.setFont(new Font("Arial", 1, 14));
        text4.setForeground(new Color(123, 53, 77));



        JLabel text5 = new JLabel("BREAST HEALTH. EDUCATION. SUPPORT" );
        frame.add(text5);
        text5.setBounds(70,20,600,95);
        text5.setFont(new Font("Arial", 0, 8));
        text5.setForeground(new Color(158,140,146));



        JLabel text6 = new JLabel("Explore and Learn" );
        frame.add(text6);
        text6.setBounds(50,230,600,95);
        text6.setFont(new Font("Arial", 1, 15));
        text6.setForeground(new Color(123, 53, 77));




        RoundedPanel panel2 = new RoundedPanel(Color.white);
        frame.add (panel2);
        panel2.setBounds(20,300,400, 120);
        panel2.setLayout(null);
        

       
        JLabel text7 = new JLabel("Know the Signs" );
        panel2.add(text7);
        text7.setBounds(50, 40, 200, 60);
        text7.setFont(new Font("Arial", 1, 17));
        text7.setForeground(new Color(123, 53, 77));



        JLabel text8 = new JLabel("Changes worth discussing with a healthcare professional" );
        panel2.add(text8);
        text8.setBounds(50, 40, 400, 120);
        text8.setFont(new Font("Arial", 0, 10));
        text8.setForeground(new Color(158,140,146));

        
        


        RoundedPanel panel3 = new RoundedPanel(Color.white);
        frame.add (panel3);
        panel3.setBounds(475,300,400, 120);
        panel3.setLayout(null);

        JLabel text9 = new JLabel("Screening" );
        panel3.add(text9);
        text9.setBounds(75, 15, 400, 120);
        text9.setFont(new Font("Arial", 1, 17));
        text9.setForeground(new Color(123, 53, 77));


        JLabel text10= new JLabel("Learn about screening and individual risk" );
        panel3.add(text10);
        text10.setBounds(75, 40, 400, 120);
        text10.setFont(new Font("Arial", 0, 10));
        text10.setForeground(new Color(158,140,146));
       

        RoundedPanel panel4 = new RoundedPanel(Color.white);
        frame.add (panel4);
        panel4.setBounds(20,450,400, 120);
        panel4.setLayout(null);


        JLabel text11 = new JLabel("Support" );
        panel4.add(text11);
        text11.setBounds(50, 15, 400, 120);
        text11.setFont(new Font("Arial", 1, 17));
        text11.setForeground(new Color(123, 53, 77));


        JLabel text12= new JLabel("Find information for patients and families" );
        panel4.add(text12);
        text12.setBounds(50, 40, 400, 120);
        text12.setFont(new Font("Arial", 0, 10));
        text12.setForeground(new Color(158,140,146));
       
       
        

        RoundedPanel panel5 = new RoundedPanel(Color.white);
        frame.add (panel5);
        panel5.setBounds(475,450,400, 120);
        panel5.setLayout(null);

        JLabel text13 = new JLabel("Ask your doctor" );
        panel5.add(text13);
        text13.setBounds(50, 16, 400, 120);
        text13.setFont(new Font("Arial", 1, 17));
        text13.setForeground(new Color(123, 53, 77));



        JLabel text14= new JLabel("Find information for patients and families" );
        panel5.add(text14);
        text14.setBounds(50, 40, 400, 120);
        text14.setFont(new Font("Arial", 0, 10));
        text14.setForeground(new Color(158,140,146));
 


        RoundedPanel panel6 = new RoundedPanel(new Color (123,53,77));
        frame.add (panel6);
        panel6.setBounds(20,35,40, 40);
        panel6.setLayout(null);
        
       

        JButton button = new JButton("Explore Resources");
        button.setBounds(20, 100, 150, 35);
        button.setBackground(new Color(123, 53, 77));
  
        button.setForeground(Color.black);
        button.setFocusPainted(false);
     
        panel1.add(button);
        











       
        
        
        
        
       
        
        
        
        frame.setVisible(true);

        
    }
    



}
