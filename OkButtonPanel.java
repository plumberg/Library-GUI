package gui_1;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OkButtonPanel extends JPanel {
	private JButton ok;
	private JButton cancel;
	private LibraryRadioPanel radioPanel;
	private LibraryTextfieldsPanel textFieldsPanel;
	private CategoriesPanel categories;

	public OkButtonPanel(LibraryRadioPanel radioPanel, LibraryTextfieldsPanel textFieldsPanel,
			CategoriesPanel categories) {
		this.setLayout((LayoutManager) new FlowLayout(FlowLayout.RIGHT));
		ok = new JButton("OK");
		cancel = new JButton("CANCEL");
		this.add(ok);
		this.add(cancel);
		this.radioPanel = radioPanel;
		this.textFieldsPanel = textFieldsPanel;
		this.categories = categories;

		ok.addActionListener(new ButtonListener());
		cancel.addActionListener(new ButtonListener());
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			JButton theButton = (JButton) arg0.getSource();

			if (theButton == ok) {
				
				String radio = radioPanel.getRadioButton().getText();
				Integer copy = textFieldsPanel.getCopyID();
				Integer isbn = textFieldsPanel.getISBN();
				String author = textFieldsPanel.getAuthor();
				String title = textFieldsPanel.getTitle();
				String category = categories.getCategory();
				try {
					File f = new File("MyLibrary.txt");
					if(f.exists() && !f.isDirectory()) { 
						//If the txt file already exists, We will just add new lines 
					BufferedWriter out = new BufferedWriter(new FileWriter("MyLibrary.txt", true));
						out.newLine();
						out.append("Category: "+category + " ID " + copy + " ISBN #" + isbn + " Title: "+ title+" Author: " + author+" | "+radio);
						out.close();
					}else {
					PrintWriter out = new PrintWriter(f);
					out.append("Category: "+category + " ID " + copy + " ISBN #" + isbn + " Title: "+title+" Author: " + author+" | "+radio);
					out.close();}
				} catch (FileNotFoundException e) {
					System.out.println("File Not Found Exception");
				} catch (IOException e) {
					System.out.println("IO Exception");
				}

			} else if (theButton == cancel) {
				textFieldsPanel.setEmpty();
			}
		}

	}

}
