package gui_1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LibraryTextfieldsPanel extends JPanel {
	private JTextField copyID;
	private JTextField ISBN;
	private JTextField author;
	private JTextField title;
	
	public LibraryTextfieldsPanel() {
		this.setLayout(new GridLayout(4, 1));
	//	Container choiceBox = new Container();

		this.add(new JLabel("Copy ID "));
		copyID = new JTextField();
		this.add(copyID);

		this.add(new JLabel("ISBN "));
		ISBN = new JTextField();
		this.add(ISBN);

		this.add(new JLabel("Title "));
		title = new JTextField();
		this.add(title);
		
		this.add(new JLabel("Author "));
		author = new JTextField();
		this.add(author);

		// choiceBox.add(copyID);
		// choiceBox.add(ISBN);
		// choiceBox.add(author);
		//
		// this.add(choiceBox);

	}

	 public void setEmpty() {
	 this.copyID.setText("");
	 this.ISBN.setText("");
	 this.author.setText("");
	 this.title.setText("");
	 }
	

	public Integer getCopyID() {
		try {
			return Integer.valueOf(copyID.getText());
		} catch (NullPointerException ex) {
			return 0;
		} catch (NumberFormatException ex2) {
			JOptionPane.showMessageDialog(null, "ID should be in numerical format");
			return 0;
		}
	}

	public Integer getISBN() {
		try {
			return Integer.valueOf(ISBN.getText());
		} catch (NullPointerException ex) {
			return 0;
		} catch (NumberFormatException ex2) {
			JOptionPane.showMessageDialog(null, "ISBN should be in numerical format");
			return 0;
		}
	}

	public String getTitle() {
		return title.getText();
	}
	
	public String getAuthor() {
		//Author's name should not contain any other symbols than letters, 
		if(author.getText().matches(".*\\d+.*")) {
			return "NONAME";}
		else 
		return author.getText();
	}

}
