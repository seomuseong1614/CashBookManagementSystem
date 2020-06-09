package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CashBookViewer extends JPanel {
	
	WindowFrame frame;

	public CashBookViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date");
		model.addColumn("In");
		model.addColumn("Out");


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
		
	}
}