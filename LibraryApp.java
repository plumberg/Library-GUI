package gui_1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class LibraryApp extends JFrame {

	private LibraryRadioPanel radioPanel;
	private LibraryTextfieldsPanel textFieldsPanel;
	private OkButtonPanel okButtonPanel;
	private CategoriesPanel categories;

	public LibraryApp() {
		this.setTitle("My Library");
		this.setSize(340, 230);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		textFieldsPanel = new LibraryTextfieldsPanel();
		this.add(textFieldsPanel,BorderLayout.NORTH);
		
		radioPanel = new LibraryRadioPanel();
		this.add(radioPanel);
		
		categories = new CategoriesPanel();
		this.add(categories);
		
		okButtonPanel = new OkButtonPanel(radioPanel,textFieldsPanel,categories);
		this.add(okButtonPanel, BorderLayout.SOUTH);
		
		
		
		JSplitPane split = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT );
		this.add(split, BorderLayout.CENTER);
		split.setLeftComponent(radioPanel);
		split.setRightComponent(categories);
		
	
	}


	public static void main(String[] args) {
	new LibraryApp().setVisible(true);

	}

}
