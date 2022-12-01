
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;
import javax.swing.RowSorter;

public class App{

   
    public static void main(String[] args)
    {
   
        
        App app = new App();
		
		app.baseInterface();
        System.out.print("Connected!");
            
    }

    //ATTRIBUTES
    //establishing attributes of gui
    JTextField jtf_id, jtf_name, jtf_quant, jtf_cost;
    JTextArea jtf_desc;
    JLabel jl_id, jl_name, jl_desc, jl_quant, jl_cost;
    JButton jb_add, jb_del, jb_update, jb_search;
    JTable jt;
    JFrame jframe; //initialising frame
    String header[] = new String[] {
        "ID",
        "Name",
        "Quantity",
        "Cost",
        "Description"
};

    DefaultTableModel modl = new DefaultTableModel(0, 0) {
    @Override
    public boolean isCellEditable(int row, int column) {
        return true;
    }
};
    

  


//the main interface of the program
    public void baseInterface(){
        jframe = new JFrame();

        jl_id = new JLabel();
        jl_id.setText("Product ID: ");
        jl_id.setBounds(10, 10, 100, 50);
        jframe.add(jl_id);

        jl_name = new JLabel();
        jl_name.setText("Name: ");
        jl_name.setBounds(10, 35, 100, 50);
        jframe.add(jl_name);

        jl_desc = new JLabel();
        jl_desc.setText("Description: ");
        jl_desc.setBounds(10, 60, 100, 50);
        jframe.add(jl_desc);

        jl_quant= new JLabel();
        jl_quant.setText("Quantity: ");
        jl_quant.setBounds(10, 90, 100, 50);
        jframe.add(jl_quant);

        jl_cost= new JLabel();
        jl_cost.setText("Cost: ");
        jl_cost.setBounds(10, 120, 100, 50);
        jframe.add(jl_cost);

        jtf_id = new JTextField();
        jtf_id.setBounds(100, 25, 250, 25);
        jframe.add(jtf_id);

        jtf_name = new JTextField();
        jtf_name.setBounds(100, 50, 250, 25);
        jframe.add(jtf_name);

        jtf_quant = new JTextField();
        jtf_quant.setBounds(100, 75, 250, 25);
        jframe.add(jtf_quant);

        jtf_cost = new JTextField();
        jtf_cost.setBounds(100, 100, 250, 25);
        jframe.add(jtf_cost);

		jtf_desc = new JTextArea();
        jtf_desc.setBounds(100, 125, 250, 25);
        jframe.add(jtf_desc);

        jb_add = new JButton();
        jb_add.setText("Add");
        jb_add.setBounds(500, 180, 100, 25);
        jframe.add(jb_add);
        jb_add.addActionListener(addItemListener);

        jb_del = new JButton();
        jb_del.setText("Delete");
        jb_del.setBounds(500, 240, 100, 25);
        jframe.add(jb_del);
        jb_del.addActionListener(delListener);

        jb_update = new JButton();
        jb_update.setText("Update");
        jb_update.setBounds(500, 300, 100, 25);
        jframe.add(jb_update);
        jb_update.addActionListener(upListener);

        jb_search = new JButton();
        jb_search.setText("Search");
        jb_search.setBounds(500, 360, 100, 25);
        jframe.add(jb_search);
        jb_search.addActionListener(searchListener);

        //table
        jt = new JTable();
        jt.setModel(modl);
        modl.setColumnIdentifiers(header);
        JScrollPane pan = new JScrollPane(jt);
        pan.setBounds(10, 170, 430, 600);
        jframe.add(pan);
        

        jframe.setSize(1080, 1920);
        jframe.setLayout(null); 
        jframe.setVisible(true);
	}
	
    ActionListener addItemListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String productID = jtf_id.getText().toString();
            String productName = jtf_name.getText().toString();
            String productQuantity = jtf_quant.getText().toString();
            String productCost = jtf_cost.getText().toString();
            String productDescription = jtf_desc.getText().toString();
            
        int result = JOptionPane.showConfirmDialog(jframe, "Insert " + productName + " into the databse?", "Insert",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {

            Object[] row = { productID, productName, productQuantity, productCost, productDescription};

            
        
            modl.addRow(row);
            JOptionPane.showMessageDialog(jframe, "Added sucessfully!");

    }
}

};
   
//jt.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    ActionListener delListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(jt.getSelectedRow() != -1) {
                // remove selected row from the model
                modl.removeRow(jt.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
             }
        }
    };

    ActionListener upListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String input1 = jtf_id.getText().toString();
            String input2 = jtf_name.getText().toString();
            String input3 = jtf_quant.getText().toString();
            String input4 = jtf_cost.getText().toString();
            String input5 = jtf_desc.getText().toString();
        }
    };

  
    
    ActionListener searchListener = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String find = JOptionPane.showInputDialog("Enter item name");
            System.out.println(find);
            
        }
    };

}




