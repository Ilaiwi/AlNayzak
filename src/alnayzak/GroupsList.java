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
 * @author Ahmad Ilaiwi
 */
    class GroupsList  extends JFrame {
    JList list=null; 
    JButton done=null;
    public List<Pgroup> selectedGroups=null;
    public GroupsList(List<Pgroup>groups){
        super("add groups");
        String[] groupsName=new String[groups.size()];
        for(int i=0 ; i<groupsName.length;i++){
            groupsName[i]=groups.get(i).getGroupname();
        }
        setLayout(new FlowLayout());
        list=new JList(groupsName);
        list.setVisibleRowCount(20);
        list.setFixedCellWidth(130);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add( new JScrollPane( list ) );
        done=new JButton("done");
        add(done);
        selectedGroups=new ArrayList<Pgroup>();
        done.addActionListener((ActionEvent event) -> {
            int[] temp=list.getSelectedIndices();
            for (int i=0;i<temp.length;i++){
                selectedGroups.add(groups.get(temp[i]));
            }
            this.dispose();
        });
    }
        public List<Pgroup> retrive(){
        return selectedGroups;
    
    }
}
