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
import javax.swing.*;

/**
 *
 * @author Ahmad Ilaiwi
 */
class StudantsList extends JFrame {
    JList list=null; 
    JButton done=null;
    public List<Student> selectedStudents=null;
    //List<Student> selectedStudents=null;
    public StudantsList(List<Student> students){
        super("add students");
        String[] studentsName=new String[students.size()];
        for(int i=0 ; i<studentsName.length;i++){
            studentsName[i]=students.get(i).getPeople().getFname()+" "+students.get(i).getPeople().getMinname()+" "+students.get(i).getPeople().getLname();
        }
        setLayout(new FlowLayout());
        list=new JList(studentsName);
        list.setVisibleRowCount(20);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add( new JScrollPane( list ) );
        done=new JButton("done");
        add(done);
        selectedStudents=new ArrayList<Student>();
        done.addActionListener((ActionEvent event) -> {
            int[] temp=list.getSelectedIndices();
            for (int i=0;i<temp.length;i++){
                selectedStudents.add(students.get(temp[i]));
            }
            this.dispose();
        });
    }
      public List<Student> retrive(){
        return selectedStudents;
    
    }
}
