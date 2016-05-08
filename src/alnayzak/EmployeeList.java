/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author BaRa' DwEiKaT
 */
public class EmployeeList extends JFrame {
    
    JList list=null; 
    JButton done=null;
    public List<Employee> selectedEmployee=null;
    
    public EmployeeList(List<Employee> employee){
        super("add employee");
        String[] employeeName=new String[employee.size()];
        for(int i=0 ; i<employeeName.length;i++){
            employeeName[i]=employee.get(i).getPeople().getFname()+" "+employee.get(i).getPeople().getMinname()+" "+employee.get(i).getPeople().getLname();
        }
        setLayout(new FlowLayout());
        list=new JList(employeeName);
        list.setVisibleRowCount(20);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add( new JScrollPane( list ) );
        done=new JButton("done");
        add(done);
        selectedEmployee=new ArrayList<Employee>();
        done.addActionListener((ActionEvent event) -> {
            int[] temp=list.getSelectedIndices();
            for (int i=0;i<temp.length;i++){
                selectedEmployee.add(employee.get(temp[i]));
               
            }
             //System.out.println(selectedEmployee);
            this.dispose();
        });
    }
    public List<Employee> retrive(){
        return selectedEmployee;
    
    }
}

