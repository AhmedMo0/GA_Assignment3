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
import java.util.Arrays;
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
	public JPanel varsScrollPanel;
	public JPanel fuzzySetsContainer;
	String currentVariableName = "";

	ArrayList<Variable> varList;
	HashMap<String, Variable> varMap;
	private JTextField textType;
	private JTextField textField_1;
	private JTextField textClassName;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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

		return panel_1;
	}
	
	private JPanel generateSubClassPanel() {
		JPanel subFuzzySetPanel = new JPanel();
		fuzzySetsContainer.add(subFuzzySetPanel);
		subFuzzySetPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		subFuzzySetPanel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		textClassName = new JTextField();
		textClassName.setText("className");
		textClassName.setColumns(10);
		panel_1_1.add(textClassName);
		
		textType = new JTextField();
		textType.setText("Type");
		textType.setColumns(10);
		panel_1_1.add(textType);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		panel_1_1.add(textField_1);
		
		
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		panel_1_1.add(textField_5);

		
		return subFuzzySetPanel;
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

		

		JPanel FuzzySetsPanel = new JPanel();
		tabbedPane.addTab("FuzzySets", null, FuzzySetsPanel, null);
		FuzzySetsPanel.setLayout(new CardLayout(0, 0));
		
		JPanel varButtonsPanel = new JPanel();
		FuzzySetsPanel.add(varButtonsPanel, "name_9802729175500");
		
		
		
		
		JPanel varClassesPanel = new JPanel();
		FuzzySetsPanel.add(varClassesPanel, "name_9838177275700");
		varClassesPanel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 431, 183);
		varClassesPanel.add(scrollPane_1);
		
		fuzzySetsContainer = new JPanel();
		scrollPane_1.setViewportView(fuzzySetsContainer);
		fuzzySetsContainer.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel subFuzzySetPanel = new JPanel();
		fuzzySetsContainer.add(subFuzzySetPanel);
		subFuzzySetPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1_1 = new JPanel();
		subFuzzySetPanel.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textClassName = new JTextField();
		textClassName.setText("className");
		textClassName.setColumns(10);
		panel_1_1.add(textClassName);
		
		textType = new JTextField();
		textType.setText("Type");
		textType.setColumns(10);
		panel_1_1.add(textType);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		panel_1_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		panel_1_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		panel_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		panel_1_1.add(textField_5);
		
		JButton btnAddAnotherClass = new JButton("add another class");
		btnAddAnotherClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fuzzySetsContainer.add(generateSubClassPanel());
				fuzzySetsContainer.revalidate();
			}
		});
		
		btnAddAnotherClass.setBounds(35, 210, 133, 23);
		varClassesPanel.add(btnAddAnotherClass);
		
		// to assign fuzzySets to its variable
		
		
		JButton btnSubmit_1 = new JButton("Submit");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Component c : subFuzzySetPanel.getComponents()) {
					if (c instanceof JPanel) {
						JPanel panel = ((JPanel) c);
						int cnt = ((JPanel) c).getComponentCount();

						String txtName = ((JTextField) panel.getComponent(0)).getText();
						String txtType = ((JTextField) panel.getComponent(1)).getText();
						Integer aVal = Integer.parseInt(((JTextField) panel.getComponent(2)).getText());
						Integer bVal = Integer.parseInt(((JTextField) panel.getComponent(3)).getText());
						Integer cVal = Integer.parseInt(((JTextField) panel.getComponent(4)).getText());
						Integer dVal = Integer.parseInt(((JTextField) panel.getComponent(5)).getText());
						
						FuzzySet newSet = new FuzzySet(txtName, txtType, new ArrayList<>(Arrays.asList(aVal, bVal, cVal, dVal)) );
						varMap.get(currentVariableName).addFuzzySet(newSet);

					}

				}
				
				System.out.println("*******************");
				System.out.println(varMap.toString());
				System.out.println("*******************");
				
			}
		});
		btnSubmit_1.setBounds(206, 210, 65, 23);
		varClassesPanel.add(btnSubmit_1);

		
		  
		  
		  
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

					
					// add variables' buttons to fuzzySetsLayout
					for (Map.Entry<String, Variable> set : varMap.entrySet()) {
						  
						  System.out.println(set.getKey() + " = " +set.getValue()); 
						  JButton btnNewButton = new JButton(set.getKey());
							btnNewButton.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									currentVariableName = set.getKey();
									varClassesPanel.setVisible(true);
									varButtonsPanel.setVisible(false);
								}
							});
							varButtonsPanel.add(btnNewButton);
					  }
				}
			});

			btnSubmit.setBounds(254, 210, 65, 23);
			variablesPanel.add(btnSubmit);
			
			
			/*
			 * for (Component component : varButtonsPanel.getComponents()) { if (component
			 * instanceof JButton) { ((JButton) component).addActionListener(new
			 * ActionListener() { public void actionPerformed(ActionEvent e) {
			 * varClassesPanel.setVisible(true); varButtonsPanel.setVisible(false);
			 * 
			 * System.out.println("heree?????");
			 * 
			 * } }); } }
			 */
			 
		
	}
}
