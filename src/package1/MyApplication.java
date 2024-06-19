package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.synth.SynthStyleFactory;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class MyApplication {

	static public JFrame frmMyFirstApplication;
	private JLabel scoreTextFieldX;
	private JLabel scoreTextFieldY;
	int b1=2,b2=2,b3=2,b4=2,b5=2,b6=2,b7=2,b8=2,b9=2;
	int playerX;
	int playerO;
	int count=0;
	boolean win = false;
	String btnText = "X";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMyFirstApplication.setVisible(true);
				} catch (Exception e) {
					System.out.println("Program can be initiated only with Welcome Page");
					e.printStackTrace();
				}
			}
		});
	}
	public void checkWinning() {
		if(b1==1 && b2==1 && b3==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b4==1 && b5==1 && b6==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b7==1 && b8==1 && b9==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b1==1 && b4==1 && b7==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b2==1 && b5==1 && b8==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b3==1 && b6==1 && b9==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b1==1 && b5==1 && b9==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b3==1 && b5==1 && b7==1) {
			playerX++;
			scoreTextFieldX.setText(String.valueOf(playerX));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player X Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b1==0 && b2==0 && b3==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b4==0 && b5==0 && b6==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b7==0 && b8==0 && b9==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b1==0 && b4==0 && b7==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b2==0 && b5==0 && b8==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b3==0 && b6==0 && b9==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b1==0 && b5==0 && b9==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(b3==0 && b5==0 && b7==0) {
			playerO++;
			scoreTextFieldY.setText(String.valueOf(playerO));
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Player O Wins ", "Winner", JOptionPane.INFORMATION_MESSAGE);
			btnText="X";
			win=true;
		}
		else if(count==9) {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "No One Wins - Tie ", "Winner", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Create the application.
	 */
	public MyApplication() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyFirstApplication = new JFrame();
		frmMyFirstApplication.setIconImage(Toolkit.getDefaultToolkit().getImage(MyApplication.class.getResource("/Images/2076261.png")));
		frmMyFirstApplication.setTitle("Tic Tac Toe");
		frmMyFirstApplication.setBounds(100, 100, 600, 400);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmMyFirstApplication.setSize(width,height);
		frmMyFirstApplication.setLocationRelativeTo(null);
		frmMyFirstApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		frmMyFirstApplication.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		Color c1 = new Color(248,255,165);
		JButton btn1 = new JButton("");
		btn1.setToolTipText("");
		btn1.setBackground(c1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn1.getText().equalsIgnoreCase("x") ||btn1.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn1.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn1.setForeground(Color.RED);
						btnText = "O";
						b1=1;
						count++;
						checkWinning();
					}
					else {
						btn1.setForeground(Color.GREEN);
						btnText = "X";
						b1=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_1.add(btn1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btn2 = new JButton("");
		btn2.setToolTipText("");
		btn2.setBackground(c1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn2.getText().equalsIgnoreCase("x") || btn2.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn2.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn2.setForeground(Color.RED);
						btnText = "O";
						b2=1;
						count++;
						checkWinning();

					}
					else {
						btn2.setForeground(Color.GREEN);
						btnText = "X";
						b2=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_2.add(btn2, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btn3 = new JButton("");
		btn3.setToolTipText("");
		btn3.setBackground(c1);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn3.getText().equalsIgnoreCase("x") ||btn3.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn3.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn3.setForeground(Color.RED);
						btnText = "O";
						b3=1;
						count++;
						checkWinning();

					}
					else {
						btn3.setForeground(Color.GREEN);
						btnText = "X";
						b3=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_3.add(btn3, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 0, 0));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("PLAYER X");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_4.add(lblNewLabel, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(0, 0, 0));
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		scoreTextFieldX = new JLabel();
		scoreTextFieldX.setForeground(new Color(0, 0, 255));
		scoreTextFieldX.setFont(new Font("Tahoma", Font.BOLD, 25));
		scoreTextFieldX.setHorizontalAlignment(SwingConstants.CENTER);
		scoreTextFieldX.setText("0");
		panel_5.add(scoreTextFieldX, BorderLayout.CENTER);


		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(0, 0, 0));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JButton btn4 = new JButton("");
		btn4.setToolTipText("");
		btn4.setBackground(c1);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn4.getText().equalsIgnoreCase("x") ||btn4.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn4.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn4.setForeground(Color.RED);
						btnText = "O";
						b4=1;
						count++;
						checkWinning();

					}
					else {
						btn4.setForeground(Color.GREEN);
						btnText = "X";
						b4=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}


			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_6.add(btn4, BorderLayout.CENTER);

		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(0, 0, 0));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JButton btn5 = new JButton("");
		btn5.setToolTipText("");
		btn5.setBackground(c1);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn5.getText().equalsIgnoreCase("x") ||btn5.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn5.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn5.setForeground(Color.RED);
						btnText = "O";
						b5=1;
						count++;
						checkWinning();

					}
					else {
						btn5.setForeground(Color.GREEN);
						btnText = "X";
						b5=0;
						count++;
						checkWinning();

					}

				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_7.add(btn5, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(0, 0, 0));
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btn6 = new JButton("");
		btn6.setToolTipText("");
		btn6.setBackground(c1);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn6.getText().equalsIgnoreCase("x") ||btn6.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn6.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn6.setForeground(Color.RED);
						btnText = "O";
						b6=1;
						count++;
						checkWinning();

					}
					else {
						btn6.setForeground(Color.GREEN);
						btnText = "X";
						b6=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}


			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_8.add(btn6, BorderLayout.CENTER);

		JPanel panel_9 = new JPanel();
		panel_9.setForeground(new Color(0, 0, 0));
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("PLAYER O");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_9.add(lblNewLabel_1, BorderLayout.CENTER);

		JPanel panel_10 = new JPanel();
		panel_10.setForeground(new Color(0, 0, 0));
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		scoreTextFieldY = new JLabel();
		scoreTextFieldY.setForeground(new Color(0, 0, 255));
		scoreTextFieldY.setFont(new Font("Tahoma", Font.BOLD, 25));
		scoreTextFieldY.setHorizontalAlignment(SwingConstants.CENTER);
		scoreTextFieldY.setText("0");	
		panel_10.add(scoreTextFieldY, BorderLayout.CENTER);

		JPanel panel_11 = new JPanel();
		panel_11.setForeground(new Color(0, 0, 0));
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JButton btn7 = new JButton("");
		btn7.setToolTipText("");
		btn7.setBackground(c1);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn7.getText().equalsIgnoreCase("x") ||btn7.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn7.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn7.setForeground(Color.RED);
						btnText = "O";
						b7=1;
						count++;
						checkWinning();

					}
					else {
						btn7.setForeground(Color.GREEN);
						btnText = "X";
						b7=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_11.add(btn7, BorderLayout.CENTER);

		JPanel panel_12 = new JPanel();
		panel_12.setForeground(new Color(0, 0, 0));
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JButton btn8 = new JButton("");
		btn8.setToolTipText("");
		btn8.setBackground(c1);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn8.getText().equalsIgnoreCase("x") ||btn8.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn8.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn8.setForeground(Color.RED);
						btnText = "O";
						b8=1;
						count++;
						checkWinning();

					}
					else {
						btn8.setForeground(Color.GREEN);
						btnText = "X";
						b8=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 80));
		panel_12.add(btn8, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setForeground(new Color(0, 0, 0));
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JButton btn9 = new JButton("");
		btn9.setToolTipText("");
		btn9.setBackground(c1);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 80));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(btn9.getText().equalsIgnoreCase("x") ||btn9.getText().equalsIgnoreCase("o")) {

				}
				else if(win==false){
					btn9.setText(btnText);
					if(btnText.equalsIgnoreCase("X")) {
						btn9.setForeground(Color.RED);
						btnText = "O";
						b9=1;
						count++;
						checkWinning();

					}
					else {
						btn9.setForeground(Color.GREEN);
						btnText = "X";
						b9=0;
						count++;
						checkWinning();

					}
				}
				else {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Click On Reset To Play Again", "Reset", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		panel_13.add(btn9, BorderLayout.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setForeground(new Color(0, 0, 0));
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				win=false;
				b1=b2=b3=b4=b5=b6=b7=b8=b9=2;
				count=0;

			}
		});
		btnReset.setToolTipText("Click To Reset The Game");
		btnReset.setBackground(new Color(0, 128, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setForeground(new Color(0, 0, 0));
		panel_14.add(btnReset, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setForeground(new Color(0, 0, 0));
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnExit = new JButton("EXIT");
		btnExit.setToolTipText("Click To Exit Application");
		btnExit.setBackground(new Color(0, 128, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame,"Do You Want To Exit", "Exit Frame", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){

					System.exit(0);
				}
			}
		});
		panel_15.add(btnExit, BorderLayout.CENTER);



	}

}
