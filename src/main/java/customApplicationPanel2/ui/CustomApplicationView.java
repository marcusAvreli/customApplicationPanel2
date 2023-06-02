package customApplicationPanel2.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import customApplicationPanel2.components.completer.AutocompleteJComboBox;
import customApplicationPanel2.components.completer.StringSearchable;
import customApplicationPanel2.entity.CustomApplication;
import customApplicationPanel2.generic.DropDownBoxColumnDefinition;


public class CustomApplicationView extends JPanel{

	private JLabel lblCa;
	
	public CustomApplicationView() {
		initComponents();
	}
	
	public void initComponents() {
		
	
		
	lblCa = new JLabel();
	lblCa.setText("Custom Application view");
		
	List<CustomApplication> myWords = new ArrayList<CustomApplication>();

    myWords.add(new CustomApplication("bo","Business Object"));
    myWords.add(new CustomApplication("atlas","Atlas"));
	
	

	
	DropDownBoxColumnDefinition def = new DropDownBoxColumnDefinition("name", "displayName");
	   StringSearchable searchable = new StringSearchable(myWords);
	   searchable.setColDef(def);
	   searchable.setType(CustomApplication.class);
       AutocompleteJComboBox<CustomApplication> combo = new AutocompleteJComboBox<CustomApplication>(searchable);


	
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				
		.addComponent(lblCa, GroupLayout.DEFAULT_SIZE, 100, GroupLayout.PREFERRED_SIZE)
		//.addComponent(field, GroupLayout.DEFAULT_SIZE, 100,  GroupLayout.PREFERRED_SIZE)
		.addComponent(combo, GroupLayout.DEFAULT_SIZE, 100,  GroupLayout.PREFERRED_SIZE)
		);
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
					
		.addPreferredGap(ComponentPlacement.RELATED)
		.addComponent(lblCa, GroupLayout.DEFAULT_SIZE, 100, GroupLayout.PREFERRED_SIZE)
		//.addComponent(field, GroupLayout.DEFAULT_SIZE, 100, GroupLayout.PREFERRED_SIZE)
		.addComponent(combo, GroupLayout.DEFAULT_SIZE, 100,  GroupLayout.PREFERRED_SIZE)
		));
		 //add(jScrollPane1, java.awt.BorderLayout.CENTER);
	}
	/*
	   public void addView(JComponent view)
	    {
	        if(view != null)
	        {
	            rootPanel.add(view);
	            rootPanel.repaint(view.getBounds());
	        }
	    }

	    
	    public void cleanView() 
	    {
	        rootPanel.removeAll();
	        rootPanel.repaint();
	    }
	    */
}
