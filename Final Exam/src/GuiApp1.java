//This code was never implemented, was not finished in time to be used
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JComboBox;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JList;
//import java.awt.BorderLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class GuiApp1 {
//
//    //Note: Typically the main method will be in a
//    //separate class. As this is a simple one class
//    //example it's all in the one class.
//    public static void main(String[] args) {
//        
//        new GuiApp1();
//    }
//
//    public GuiApp1()
//    {
//        JFrame guiFrame = new JFrame();
//        
//        //make sure the program exits when the frame closes
//        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        guiFrame.setTitle("TicTacToe");
//        guiFrame.setSize(300,300);
//      
//        //This will center the JFrame in the middle of the screen
//        guiFrame.setLocationRelativeTo(null);
//        
//        //Options for the JComboBox 
//        String[] xOrO = {"X", "O"};
//        
//        //The first JPanel contains a JLabel and JCombobox
//        final JPanel comboPanel = new JPanel();
//        JLabel comboLbl = new JLabel("Play as:");
//        JComboBox selectType = new JComboBox(xOrO);
//        
//        comboPanel.add(comboLbl);
//        comboPanel.add(selectType);
//        
//        //Create the second JPanel. Add a JLabel and JList and
//        //make use the JPanel is not visible.
//
//        JButton XO = new JButton( "Enter");
//        
//        //The ActionListener class is used to handle the
//        //event that happens when the user clicks the button.
//        //As there is not a lot that needs to happen we can 
//        //define an anonymous inner class to make the code simpler.
//        XO.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent event)
//            {
//            }
//        });
//        
//        //The JFrame uses the BorderLayout layout manager.
//        //Put the two JPanels and JButton in different areas.
//        
//        //make sure the JFrame is visible
//        comboPanel.add(XO);
//        guiFrame.add(comboPanel);
//        guiFrame.setVisible(true);
//    }
//    
// }