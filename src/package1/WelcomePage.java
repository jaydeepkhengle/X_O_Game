package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class WelcomePage {

	private JFrame frmTicTacToe;
	private JLabel welcomePageLabelImg;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frmTicTacToe.setVisible(true);

					// Set a timer to hide the frame after 5 seconds
					Timer timer = new Timer(3000, new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							window.frmTicTacToe.setVisible(false); // Hide the frame
							window.frmTicTacToe.dispose(); // Dispose the frame resources
							MyApplication window = new MyApplication();
							MyApplication.main(null);
						}
					});
					timer.setRepeats(false); // Set to fire only once
					timer.start();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WelcomePage() {
		initialize();
	}

	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setIconImage(Toolkit.getDefaultToolkit().getImage(WelcomePage.class.getResource("/Images/2076261.png")));
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmTicTacToe.setSize(width, height);
		frmTicTacToe.setLocationRelativeTo(null);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		welcomePageLabelImg = new JLabel();
		welcomePageLabelImg.setIcon(new ImageIcon(WelcomePage.class.getResource("/Images/TicTacToeWelcomePage.png")));
		welcomePageLabelImg.setSize(width, height);
		frmTicTacToe.getContentPane().add(welcomePageLabelImg);

		System.out.println(width);
		System.out.println(height);
	}
}
