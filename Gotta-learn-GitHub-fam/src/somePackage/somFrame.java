package somePackage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class somFrame extends JFrame {

	/**
	 *  Shrug.
	 */
	private static final long serialVersionUID = 6958992162916714839L;
	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtInput2;
	private JButton btnAdd;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnSubstract;
	private JLabel lblTehAnsr;
	private JLabel label;
	private JLabel answerLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					somFrame frame = new somFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public somFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 115, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblHeeyyy = new JLabel("Heeyyy");
		lblHeeyyy.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		GridBagConstraints gbc_lblHeeyyy = new GridBagConstraints();
		gbc_lblHeeyyy.insets = new Insets(0, 0, 5, 5);
		gbc_lblHeeyyy.gridx = 1;
		gbc_lblHeeyyy.gridy = 1;
		contentPane.add(lblHeeyyy, gbc_lblHeeyyy);

		txtInput = new JTextField();
		txtInput.setText("Input");
		GridBagConstraints gbc_txtInput = new GridBagConstraints();
		gbc_txtInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInput.insets = new Insets(0, 0, 5, 0);
		gbc_txtInput.gridx = 3;
		gbc_txtInput.gridy = 1;
		contentPane.add(txtInput, gbc_txtInput);
		txtInput.setColumns(10);

		JLabel lblGuessWhat = new JLabel("gUeSS WhAT");
		lblGuessWhat.setFont(new Font("Comic Sans MS", Font.ITALIC, 21));
		GridBagConstraints gbc_lblGuessWhat = new GridBagConstraints();
		gbc_lblGuessWhat.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuessWhat.gridx = 1;
		gbc_lblGuessWhat.gridy = 3;
		contentPane.add(lblGuessWhat, gbc_lblGuessWhat);

		txtInput2 = new JTextField();
		txtInput2.setText("Second input fam");
		GridBagConstraints gbc_txtInput2 = new GridBagConstraints();
		gbc_txtInput2.insets = new Insets(0, 0, 5, 0);
		gbc_txtInput2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInput2.gridx = 3;
		gbc_txtInput2.gridy = 3;
		contentPane.add(txtInput2, gbc_txtInput2);
		txtInput2.setColumns(10);

		btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				answerLabel.setText(Double
						.toString((Double.parseDouble(txtInput.getText()) + Double.parseDouble(txtInput2.getText()))));
			}
		});
		btnAdd.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent arg0) {
				System.out.println("Autistic screeching !");
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 2;
		gbc_btnAdd.gridy = 6;
		contentPane.add(btnAdd, gbc_btnAdd);

		btnSubstract = new JButton("Substract");
		btnSubstract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				answerLabel.setText(Double
						.toString((Double.parseDouble(txtInput.getText()) - Double.parseDouble(txtInput2.getText()))));
			}
		});
		GridBagConstraints gbc_btnSubstract = new GridBagConstraints();
		gbc_btnSubstract.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubstract.gridx = 2;
		gbc_btnSubstract.gridy = 7;
		contentPane.add(btnSubstract, gbc_btnSubstract);

		btnMultiply = new JButton("Multiply");
		btnMultiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerLabel.setText(Double
						.toString((Double.parseDouble(txtInput.getText()) * Double.parseDouble(txtInput2.getText()))));
			}
		});
		GridBagConstraints gbc_btnMultiply = new GridBagConstraints();
		gbc_btnMultiply.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiply.gridx = 2;
		gbc_btnMultiply.gridy = 8;
		contentPane.add(btnMultiply, gbc_btnMultiply);

		btnDivide = new JButton("Divide");
		btnDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				answerLabel.setText(Double
						.toString((Double.parseDouble(txtInput.getText()) / Double.parseDouble(txtInput2.getText()))));
			}
		});
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.insets = new Insets(0, 0, 5, 5);
		gbc_btnDivide.gridx = 2;
		gbc_btnDivide.gridy = 9;
		contentPane.add(btnDivide, gbc_btnDivide);

		lblTehAnsr = new JLabel("& teh ans\u00E8r is");
		GridBagConstraints gbc_lblTehAnsr = new GridBagConstraints();
		gbc_lblTehAnsr.insets = new Insets(0, 0, 0, 5);
		gbc_lblTehAnsr.gridx = 1;
		gbc_lblTehAnsr.gridy = 10;
		contentPane.add(lblTehAnsr, gbc_lblTehAnsr);

		label = new JLabel("...");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 10;
		contentPane.add(label, gbc_label);

		answerLabel = new JLabel("[ANSWER GOES HERE]");
		GridBagConstraints gbc_answerLabel = new GridBagConstraints();
		gbc_answerLabel.gridx = 3;
		gbc_answerLabel.gridy = 10;
		contentPane.add(answerLabel, gbc_answerLabel);
	}

}
