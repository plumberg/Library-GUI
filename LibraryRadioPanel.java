package gui_1;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LibraryRadioPanel extends JPanel{
	private JRadioButton reference;
	private JRadioButton toBorrow;
	
	public JRadioButton getRadioButton() {
		if (reference.isSelected()) {
		return reference;}
		else if (toBorrow.isSelected()) {
			return toBorrow;
		}
		else return null;
	}
	public LibraryRadioPanel() {
		
		Box verticalBox = Box.createVerticalBox();
		
		ButtonGroup choice = new ButtonGroup();
		
		//I don`t want to leave radio buttons not checked so reference button is checked by default
		reference = new JRadioButton("Reference material", true);
		toBorrow = new JRadioButton("Can be borrowed");
		choice.add(reference);
		choice.add(toBorrow);
		
		verticalBox.add(reference);
		verticalBox.add(toBorrow);
		
	//this.add(reference);
	//this.add(toBorrow);
		this.add(verticalBox);
	
	}

}
