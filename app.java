import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextField;

import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class app {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtType;
	private JTextField txtLowerb_1;
	private JTextField txtUpperb;
	private JPanel varsScrollPanel;

	private ArrayList<Variable> varList;
	private HashMap<String, Variable> varMap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app window = new app();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public app() {
		initialize();
		varList = new ArrayList<>();
		varMap = new HashMap<>();
	}

	private JPanel generateSubPanel() {
		JPanel panel_1 = new JPanel();
		varsScrollPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));

		txtName = new JTextField();
		txtName.setText("Name");
		panel_1.add(txtName);
		txtName.setColumns(10);

		txtType = new JTextField();
		txtType.setText("Type");
		panel_1.add(txtType);
		txtType.setColumns(10);

		txtLowerb_1 = new JTextField();
		txtLowerb_1.setText("lowerB");
		panel_1.add(txtLowerb_1);
		txtLowerb_1.setColumns(10);

		txtUpperb = new JTextField();
		txtUpperb.setText("upperB");
		panel_1.add(txtUpperb);
		txtUpperb.setColumns(10);

		Component[] c = panel_1.getComponents();
		/*
		 * // add var to global list Variable newVar = new Variable(txtName.getText(),
		 * txtType.getText(), Integer.parseInt(txtLowerb_1.getText()),
		 * Integer.parseInt(txtUpperb.getText())); varList.add(newVar);
		 */

		return panel_1;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 446, 272);
		frame.getContentPane().add(tabbedPane);

		JPanel variablesPanel = new JPanel();
		tabbedPane.addTab("variables", null, variablesPanel, null);
		variablesPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 5, 421, 194);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		variablesPanel.add(scrollPane);

		varsScrollPanel = new JPanel();
		scrollPane.add(varsScrollPanel);
		scrollPane.setViewportView(varsScrollPanel);
		varsScrollPanel.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		varsScrollPanel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));

		txtName = new JTextField();
		txtName.setText("Name");
		panel_1.add(txtName);
		txtName.setColumns(10);

		txtType = new JTextField();
		txtType.setText("Type");
		panel_1.add(txtType);
		txtType.setColumns(10);

		txtLowerb_1 = new JTextField();
		txtLowerb_1.setText("lowerB");
		panel_1.add(txtLowerb_1);
		txtLowerb_1.setColumns(10);

		txtUpperb = new JTextField();
		txtUpperb.setText("upperB");
		panel_1.add(txtUpperb);
		txtUpperb.setColumns(10);

		JButton btnAddAnotherV = new JButton("add another variable");
		btnAddAnotherV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				varsScrollPanel.add(generateSubPanel());
				varsScrollPanel.revalidate();
			}
		});
		btnAddAnotherV.setBounds(32, 210, 133, 23);
		variablesPanel.add(btnAddAnotherV);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Component c : varsScrollPanel.getComponents()) {
					if (c instanceof JPanel) {
						JPanel panel = ((JPanel) c);
						int cnt = ((JPanel) c).getComponentCount();

						String txtName = ((JTextField) panel.getComponent(0)).getText();
						String txtType = ((JTextField) panel.getComponent(1)).getText();
						Integer lowerB = Integer.parseInt(((JTextField) panel.getComponent(2)).getText());
						Integer upperB = Integer.parseInt(((JTextField) panel.getComponent(3)).getText());

						Variable newVar = new Variable(txtName, txtType, lowerB, upperB);
						varMap.put(txtName, newVar);

					}

				}

				/*
				 * for (Map.Entry<String, Variable> set : varMap.entrySet()) {
				 * 
				 * // Printing all elements of a Map System.out.println(set.getKey() + " = " +
				 * set.getValue()); }
				 */

			}
		});

		btnSubmit.setBounds(254, 210, 65, 23);
		variablesPanel.add(btnSubmit);

		JPanel FuzzySetsPanel = new JPanel();
		tabbedPane.addTab("FuzzySets", null, FuzzySetsPanel, null);
		FuzzySetsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		
		  for (Map.Entry<String, Variable> set : varMap.entrySet()) {
		  
			  System.out.println(set.getKey() + " = " +set.getValue()); 
			  JButton btnNewButton = new JButton(set.getKey());
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				FuzzySetsPanel.add(btnNewButton);
		  }
		 
		
	}
}
