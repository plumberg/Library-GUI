package gui_1;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CategoriesPanel extends JPanel {
	private String[] categories;
	private JComboBox<String> comboCategories;

	public CategoriesPanel() {
		categories = new String[] { "Romance", "Drama", "Fantasy", "Autobiographies", "Poetry", "Adventure" };
		comboCategories = new JComboBox<String>(categories);
		
		this.add(comboCategories);
	}
	public String getCategory() {
		return String.valueOf(comboCategories.getSelectedItem());
	}

}
