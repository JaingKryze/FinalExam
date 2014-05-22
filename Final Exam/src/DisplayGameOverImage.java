import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayGameOverImage
	{
	public static void displayGameOver()
		{
		Image image = null;

		try
			{
			URL url = new URL(
					"http://www.paperspencils.com/wp-content/uploads/2012/09/A_Link_To-The_Past_Game_Over.png");
			image = ImageIO.read(url);
			} catch (IOException e)
			{
			}

		JFrame frame = new JFrame();
		JLabel lblimage = new JLabel(new ImageIcon(image));
		frame.getContentPane().add(lblimage, BorderLayout.CENTER);
		frame.setSize(500, 400);
		frame.setVisible(true);
		}
	}