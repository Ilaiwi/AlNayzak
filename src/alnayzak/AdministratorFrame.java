/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;


public class AdministratorFrame extends javax.swing.JFrame {
    
    AddSessionFrame asef = null;
    AddLocationFrame alf = null;
    AddGeneralGroupFrame aggf = null;
    AddOfficeFrame aof = null;
    AddEmployeeFrame aef = null;
    AddResearchandDevelopmentProjectFrame ardpf = null;
    AddPartTimeEmployeeHoursFrame aptehf = null;
    AddStudentFrame asf = null;
    AddSubGroupFrame asgf = null;
    AddToolByOfficeFrame atbof = null;
    AddToolByGroupFrame atbgf = null;
    AddTrainingFrame atrf = null;
    AddVolunteerFrame avf = null;
    SearchEmployeeFrame sef = null;
    SearchGeneralGroupFrame sggf = null;
    SearchLocationFrame slf = null;
    SearchOfficeFrame sof = null;
    SearchResearchandDevelopmentProjectFrame srdpf = null;
    SearchStudentFrame ssf = null;
    SearchSubGroupFrame ssgf = null;
    SearchToolFrame stf = null;
    SearchTrainingFrame strf = null;
    SearchVolunteerFrame svf = null;
    DeleteEmployeeFrame def = null;
    DeleteGeneralGroupFrame dggf = null;
    DeleteLocationFrame dlf = null;
    DeleteOfficeFrame dof = null;
    DeleteResearchandDevelopmentProjectFrame drdpf = null;
    DeleteStudentFrame dsf = null;
    //DeleteSessionFrame dsef = null;
    DeleteSubGroupFrame dsgf = null;
    DeleteToolFrame dtf = null;
    DeleteTrainingFrame dtrf = null;
    DeleteVolunteerFrame dvf = null;
    ChangeDepartmentGeneralManagerFrame cdgmf = null;
    //CreateYoungResearcherNewYearFrame cyrnyf = null;
    ChangeADPasswordFrame cadpf = null;
    ChangeYRManagersFrame cyrmf = null;
    SEmployeeFrame Ssef = null;
    SGeneralGroupFrame Ssggf = null;
    SLocationFrame Sslf = null;
    SOfficeFrame Ssof = null;
    SResearchandDevelopmentProjectFrame Ssrdpf = null;
    SStudentFrame Sssf = null;
    SSessionFrame Sssef = null;
    SSubGroupFrame Sssgf = null;
    SToolFrame Sstf = null;
    STrainingFrame Sstrf = null;
    SVolunteerFrame Ssvf = null;
    
    Connection con=null;
    InputStream input=null;
    
    JasperDesign jasperDesign=null;
    JasperReport jasperReport=null;
    JasperPrint jasperPrint=null;
    OutputStream output=null;
    OracleDataSource ods=null;

    public AdministratorFrame() {
        initComponents();
         asef= new AddSessionFrame();
         alf= new AddLocationFrame();
         aggf = new AddGeneralGroupFrame();
         aof = new AddOfficeFrame();
         aef = new AddEmployeeFrame();
         ardpf = new AddResearchandDevelopmentProjectFrame();
         aptehf = new AddPartTimeEmployeeHoursFrame();
         asf = new AddStudentFrame();
         asgf = new AddSubGroupFrame();
         atbof = new AddToolByOfficeFrame();
         atbof = new AddToolByOfficeFrame();
         atbgf = new AddToolByGroupFrame();
         atbgf = new AddToolByGroupFrame();
         atrf = new AddTrainingFrame();
         avf = new AddVolunteerFrame();
         sef = new SearchEmployeeFrame();
         sggf = new SearchGeneralGroupFrame();
         slf = new SearchLocationFrame();
         sof = new SearchOfficeFrame();
         srdpf = new SearchResearchandDevelopmentProjectFrame();
         ssf = new SearchStudentFrame();
         ssgf = new SearchSubGroupFrame();
         stf  = new SearchToolFrame();
         strf = new SearchTrainingFrame();
         svf = new SearchVolunteerFrame();
         def = new DeleteEmployeeFrame();
         dggf = new DeleteGeneralGroupFrame();
         dlf = new DeleteLocationFrame();
         dof = new DeleteOfficeFrame();
         drdpf = new DeleteResearchandDevelopmentProjectFrame();
         dsf = new DeleteStudentFrame();
        // dsef = new DeleteSessionFrame();
         dsgf = new DeleteSubGroupFrame();
         dtf = new DeleteToolFrame();
         dtrf = new DeleteTrainingFrame();
         dvf = new DeleteVolunteerFrame();
         cdgmf = new ChangeDepartmentGeneralManagerFrame();
         //cyrnyf = new CreateYoungResearcherNewYearFrame();
         cadpf = new ChangeADPasswordFrame();
         cyrmf = new ChangeYRManagersFrame();
         Ssef = new SEmployeeFrame();
         Ssggf = new SGeneralGroupFrame();
         Sslf = new SLocationFrame();
         Ssof = new SOfficeFrame();
         Ssrdpf = new SResearchandDevelopmentProjectFrame();
         Sssf = new SStudentFrame();
         Sssef = new SSessionFrame();
         Sssgf = new SSubGroupFrame();
         Sstf  = new SToolFrame();
         Sstrf = new STrainingFrame();
         Ssvf = new SVolunteerFrame();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        AdministratorMenuBar = new javax.swing.JMenuBar();
        ToolByGroupMenuItem = new javax.swing.JMenu();
        AddEmpolyeeMenuItem = new javax.swing.JMenuItem();
        AddGeneralGroupMenuItem = new javax.swing.JMenuItem();
        AddLocationMenuItem = new javax.swing.JMenuItem();
        AddOfficeMenuItem = new javax.swing.JMenuItem();
        AddPartTimeEHMenuItem = new javax.swing.JMenuItem();
        AddRDProjectMenuItem = new javax.swing.JMenuItem();
        AddStudentMenuItem = new javax.swing.JMenuItem();
        AddSessionMenuItem = new javax.swing.JMenuItem();
        AddSubGroupMenuItem = new javax.swing.JMenuItem();
        AddToolByOfficeMenuItem = new javax.swing.JMenuItem();
        AddToolByGroupMenuFame = new javax.swing.JMenuItem();
        AddTrainingMenuItem = new javax.swing.JMenuItem();
        AddVolunteerMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        EditDepartmentGeneralManagerMenuItem = new javax.swing.JMenuItem();
        EditEmpolyeeMenuItem = new javax.swing.JMenuItem();
        EditGeneralGroupMenuItem = new javax.swing.JMenuItem();
        EditLocationMenuItem = new javax.swing.JMenuItem();
        EditOfficeMenuItem = new javax.swing.JMenuItem();
        EditRDProjectMenuItem = new javax.swing.JMenuItem();
        EditStudentMenuItem = new javax.swing.JMenuItem();
        EditSubGroupMenuItem = new javax.swing.JMenuItem();
        EditToolMenuItem = new javax.swing.JMenuItem();
        EditTrainingMenuItem = new javax.swing.JMenuItem();
        YoungResearcherManagersMenuItem = new javax.swing.JMenuItem();
        EditVolunteerMenuItem = new javax.swing.JMenuItem();
        DeleteMenu = new javax.swing.JMenu();
        DeleteEmpolyeeMenuItem = new javax.swing.JMenuItem();
        DeleteGeneralGroupMenuItem = new javax.swing.JMenuItem();
        DeleteLocationMenuItem = new javax.swing.JMenuItem();
        DeleteOfficeMenuItem = new javax.swing.JMenuItem();
        DeleteRDProjectMenuItem = new javax.swing.JMenuItem();
        DeleteStudentMenuItem = new javax.swing.JMenuItem();
        DeleteSubGroupMenuItem = new javax.swing.JMenuItem();
        DeleteToolMenuItem = new javax.swing.JMenuItem();
        DeleteTrainingMenuItem = new javax.swing.JMenuItem();
        DeleteVolunteerMenuItem = new javax.swing.JMenuItem();
        SearchMenu = new javax.swing.JMenu();
        SearchEmpolyeeMenuItem = new javax.swing.JMenuItem();
        SearchGeneralGroupMenuItem = new javax.swing.JMenuItem();
        SearchLocationMenuItem = new javax.swing.JMenuItem();
        SearchOfficeMenuItem = new javax.swing.JMenuItem();
        SearchRDProjectMenuItem = new javax.swing.JMenuItem();
        SearchSessionMenuItem = new javax.swing.JMenuItem();
        SearchStudentMenuItem = new javax.swing.JMenuItem();
        SearchSubGroupMenuItem = new javax.swing.JMenuItem();
        SearchToolMenuItem = new javax.swing.JMenuItem();
        SearchTrainingMenuItem = new javax.swing.JMenuItem();
        SearchVolunteerMenuItem = new javax.swing.JMenuItem();
        ReportsMenu = new javax.swing.JMenu();
        EmployeeInformationMenu = new javax.swing.JMenu();
        AllEmployeeInformationMenuItem = new javax.swing.JMenuItem();
        FullTimeEmployeeInformationMenuItem = new javax.swing.JMenuItem();
        PartTimeEmployeeInformationMenuItem = new javax.swing.JMenuItem();
        ToolsInformationMenu = new javax.swing.JMenu();
        AllToolsInformationMenuItem = new javax.swing.JMenuItem();
        ToolsByOfficeInformationMenuItem = new javax.swing.JMenuItem();
        ToolsByGroupsInformationMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SessionTrainerInformationMenuItem = new javax.swing.JMenuItem();
        SessionsStudentsInformationMenuItem = new javax.swing.JMenuItem();
        SessionsDurationMenuItem = new javax.swing.JMenuItem();
        StudentsInformationMenuItem = new javax.swing.JMenuItem();
        LocationsMenuItem = new javax.swing.JMenuItem();
        VolunteerInformationMenuItem = new javax.swing.JMenuItem();
        GroupsLocationMenuItem = new javax.swing.JMenuItem();
        OfficeManagerInformationMenuItem = new javax.swing.JMenuItem();
        ProjectsVolunteerInformationMenuItem = new javax.swing.JMenuItem();
        YRManagersInformationMenuItem = new javax.swing.JMenuItem();
        OptionsMenu = new javax.swing.JMenu();
        ChangePasswordMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator - Alnayzak");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alnayzak/AlNayzak Logo.jpg"))); // NOI18N

        AdministratorMenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdministratorMenuBar.setPreferredSize(new java.awt.Dimension(107, 30));

        ToolByGroupMenuItem.setText("Add");
        ToolByGroupMenuItem.setToolTipText("");
        ToolByGroupMenuItem.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N

        AddEmpolyeeMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddEmpolyeeMenuItem.setText("Employee");
        AddEmpolyeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpolyeeMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddEmpolyeeMenuItem);

        AddGeneralGroupMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddGeneralGroupMenuItem.setText("General Group");
        AddGeneralGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGeneralGroupMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddGeneralGroupMenuItem);

        AddLocationMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddLocationMenuItem.setText("Location");
        AddLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLocationMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddLocationMenuItem);

        AddOfficeMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddOfficeMenuItem.setText("Office");
        AddOfficeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOfficeMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddOfficeMenuItem);

        AddPartTimeEHMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddPartTimeEHMenuItem.setText("Part Time Employee Hours");
        AddPartTimeEHMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPartTimeEHMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddPartTimeEHMenuItem);

        AddRDProjectMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddRDProjectMenuItem.setText("Research and Development Project");
        AddRDProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRDProjectMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddRDProjectMenuItem);

        AddStudentMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddStudentMenuItem.setText("Student");
        AddStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddStudentMenuItem);

        AddSessionMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddSessionMenuItem.setText("Session");
        AddSessionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSessionMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddSessionMenuItem);

        AddSubGroupMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddSubGroupMenuItem.setText("Sub Group");
        AddSubGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSubGroupMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddSubGroupMenuItem);

        AddToolByOfficeMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddToolByOfficeMenuItem.setText("Tool By Office");
        AddToolByOfficeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToolByOfficeMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddToolByOfficeMenuItem);

        AddToolByGroupMenuFame.setForeground(new java.awt.Color(0, 0, 153));
        AddToolByGroupMenuFame.setText("Tool By Group");
        AddToolByGroupMenuFame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToolByGroupMenuFameActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddToolByGroupMenuFame);

        AddTrainingMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddTrainingMenuItem.setText("Training");
        AddTrainingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainingMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddTrainingMenuItem);

        AddVolunteerMenuItem.setForeground(new java.awt.Color(0, 0, 153));
        AddVolunteerMenuItem.setText("Volunteer");
        AddVolunteerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVolunteerMenuItemActionPerformed(evt);
            }
        });
        ToolByGroupMenuItem.add(AddVolunteerMenuItem);

        AdministratorMenuBar.add(ToolByGroupMenuItem);

        EditMenu.setText("Edit");
        EditMenu.setToolTipText("");
        EditMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        EditMenu.setPreferredSize(new java.awt.Dimension(29, 50));

        EditDepartmentGeneralManagerMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditDepartmentGeneralManagerMenuItem.setText("Department General Manager");
        EditDepartmentGeneralManagerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDepartmentGeneralManagerMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditDepartmentGeneralManagerMenuItem);

        EditEmpolyeeMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditEmpolyeeMenuItem.setText("Employee");
        EditEmpolyeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpolyeeMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditEmpolyeeMenuItem);

        EditGeneralGroupMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditGeneralGroupMenuItem.setText("General Group");
        EditGeneralGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditGeneralGroupMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditGeneralGroupMenuItem);

        EditLocationMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditLocationMenuItem.setText("Location");
        EditLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditLocationMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditLocationMenuItem);

        EditOfficeMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditOfficeMenuItem.setText("Office");
        EditOfficeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOfficeMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditOfficeMenuItem);

        EditRDProjectMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditRDProjectMenuItem.setText("Research and Development Project");
        EditRDProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRDProjectMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditRDProjectMenuItem);

        EditStudentMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditStudentMenuItem.setText("Student");
        EditStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditStudentMenuItem);

        EditSubGroupMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditSubGroupMenuItem.setText("Sub Group");
        EditSubGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSubGroupMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditSubGroupMenuItem);

        EditToolMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditToolMenuItem.setText("Tool");
        EditToolMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditToolMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditToolMenuItem);

        EditTrainingMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditTrainingMenuItem.setText("Training");
        EditTrainingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTrainingMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditTrainingMenuItem);

        YoungResearcherManagersMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        YoungResearcherManagersMenuItem.setText("Young Researcher Managers");
        YoungResearcherManagersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YoungResearcherManagersMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(YoungResearcherManagersMenuItem);

        EditVolunteerMenuItem.setForeground(new java.awt.Color(255, 0, 102));
        EditVolunteerMenuItem.setText("Volunteer");
        EditVolunteerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditVolunteerMenuItemActionPerformed(evt);
            }
        });
        EditMenu.add(EditVolunteerMenuItem);

        AdministratorMenuBar.add(EditMenu);

        DeleteMenu.setText("Delete");
        DeleteMenu.setToolTipText("");
        DeleteMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N

        DeleteEmpolyeeMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteEmpolyeeMenuItem.setText("Employee");
        DeleteEmpolyeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmpolyeeMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteEmpolyeeMenuItem);

        DeleteGeneralGroupMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteGeneralGroupMenuItem.setText("General Group");
        DeleteGeneralGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteGeneralGroupMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteGeneralGroupMenuItem);

        DeleteLocationMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteLocationMenuItem.setText("Location");
        DeleteLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLocationMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteLocationMenuItem);

        DeleteOfficeMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteOfficeMenuItem.setText("Office");
        DeleteOfficeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOfficeMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteOfficeMenuItem);

        DeleteRDProjectMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteRDProjectMenuItem.setText("Research and Development Project");
        DeleteRDProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRDProjectMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteRDProjectMenuItem);

        DeleteStudentMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteStudentMenuItem.setText("Student");
        DeleteStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteStudentMenuItem);

        DeleteSubGroupMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteSubGroupMenuItem.setText("Sub Group");
        DeleteSubGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSubGroupMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteSubGroupMenuItem);

        DeleteToolMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteToolMenuItem.setText("Tool");
        DeleteToolMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteToolMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteToolMenuItem);

        DeleteTrainingMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteTrainingMenuItem.setText("Training");
        DeleteTrainingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTrainingMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteTrainingMenuItem);

        DeleteVolunteerMenuItem.setForeground(new java.awt.Color(51, 153, 0));
        DeleteVolunteerMenuItem.setText("Volunteer");
        DeleteVolunteerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteVolunteerMenuItemActionPerformed(evt);
            }
        });
        DeleteMenu.add(DeleteVolunteerMenuItem);

        AdministratorMenuBar.add(DeleteMenu);

        SearchMenu.setText("Search");
        SearchMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N

        SearchEmpolyeeMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchEmpolyeeMenuItem.setText("Employee");
        SearchEmpolyeeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmpolyeeMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchEmpolyeeMenuItem);

        SearchGeneralGroupMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchGeneralGroupMenuItem.setText("General Group");
        SearchGeneralGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchGeneralGroupMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchGeneralGroupMenuItem);

        SearchLocationMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchLocationMenuItem.setText("Location");
        SearchLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchLocationMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchLocationMenuItem);

        SearchOfficeMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchOfficeMenuItem.setText("Office");
        SearchOfficeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOfficeMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchOfficeMenuItem);

        SearchRDProjectMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchRDProjectMenuItem.setText("Research and Development Project");
        SearchRDProjectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchRDProjectMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchRDProjectMenuItem);

        SearchSessionMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchSessionMenuItem.setText("Session");
        SearchSessionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSessionMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchSessionMenuItem);

        SearchStudentMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchStudentMenuItem.setText("Student");
        SearchStudentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStudentMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchStudentMenuItem);

        SearchSubGroupMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchSubGroupMenuItem.setText("Sub Group");
        SearchSubGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSubGroupMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchSubGroupMenuItem);

        SearchToolMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchToolMenuItem.setText("Tool");
        SearchToolMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchToolMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchToolMenuItem);

        SearchTrainingMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchTrainingMenuItem.setText("Training");
        SearchTrainingMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTrainingMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchTrainingMenuItem);

        SearchVolunteerMenuItem.setForeground(new java.awt.Color(102, 102, 0));
        SearchVolunteerMenuItem.setText("Volunteer");
        SearchVolunteerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchVolunteerMenuItemActionPerformed(evt);
            }
        });
        SearchMenu.add(SearchVolunteerMenuItem);

        AdministratorMenuBar.add(SearchMenu);

        ReportsMenu.setText("Reports");
        ReportsMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N

        EmployeeInformationMenu.setText("Employees Informations");

        AllEmployeeInformationMenuItem.setText("All");
        AllEmployeeInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllEmployeeInformationMenuItemActionPerformed(evt);
            }
        });
        EmployeeInformationMenu.add(AllEmployeeInformationMenuItem);

        FullTimeEmployeeInformationMenuItem.setText("Full Time");
        FullTimeEmployeeInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullTimeEmployeeInformationMenuItemActionPerformed(evt);
            }
        });
        EmployeeInformationMenu.add(FullTimeEmployeeInformationMenuItem);

        PartTimeEmployeeInformationMenuItem.setText("Part Time");
        PartTimeEmployeeInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartTimeEmployeeInformationMenuItemActionPerformed(evt);
            }
        });
        EmployeeInformationMenu.add(PartTimeEmployeeInformationMenuItem);

        ReportsMenu.add(EmployeeInformationMenu);

        ToolsInformationMenu.setText("Tools Informations");

        AllToolsInformationMenuItem.setText("All");
        AllToolsInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllToolsInformationMenuItemActionPerformed(evt);
            }
        });
        ToolsInformationMenu.add(AllToolsInformationMenuItem);

        ToolsByOfficeInformationMenuItem.setText("By Office");
        ToolsByOfficeInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolsByOfficeInformationMenuItemActionPerformed(evt);
            }
        });
        ToolsInformationMenu.add(ToolsByOfficeInformationMenuItem);

        ToolsByGroupsInformationMenuItem.setText("By Group");
        ToolsByGroupsInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolsByGroupsInformationMenuItemActionPerformed(evt);
            }
        });
        ToolsInformationMenu.add(ToolsByGroupsInformationMenuItem);

        ReportsMenu.add(ToolsInformationMenu);

        jMenu4.setText("Sessions");

        SessionTrainerInformationMenuItem.setText("Trainer Information");
        SessionTrainerInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionTrainerInformationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(SessionTrainerInformationMenuItem);

        SessionsStudentsInformationMenuItem.setText("Students Information");
        SessionsStudentsInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionsStudentsInformationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(SessionsStudentsInformationMenuItem);

        SessionsDurationMenuItem.setText("Duration");
        SessionsDurationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SessionsDurationMenuItemActionPerformed(evt);
            }
        });
        jMenu4.add(SessionsDurationMenuItem);

        ReportsMenu.add(jMenu4);

        StudentsInformationMenuItem.setText("Students Informations");
        StudentsInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsInformationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(StudentsInformationMenuItem);

        LocationsMenuItem.setText("Locations");
        LocationsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationsMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(LocationsMenuItem);

        VolunteerInformationMenuItem.setText("Volunteer Informations");
        VolunteerInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolunteerInformationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(VolunteerInformationMenuItem);

        GroupsLocationMenuItem.setText("Group's Location");
        GroupsLocationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupsLocationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(GroupsLocationMenuItem);

        OfficeManagerInformationMenuItem.setText("Offices Manager Informations");
        OfficeManagerInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeManagerInformationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(OfficeManagerInformationMenuItem);

        ProjectsVolunteerInformationMenuItem.setText("Projects Volunteers Informations");
        ProjectsVolunteerInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectsVolunteerInformationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(ProjectsVolunteerInformationMenuItem);

        YRManagersInformationMenuItem.setText("Young Researcher Manager Informations");
        YRManagersInformationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YRManagersInformationMenuItemActionPerformed(evt);
            }
        });
        ReportsMenu.add(YRManagersInformationMenuItem);

        AdministratorMenuBar.add(ReportsMenu);

        OptionsMenu.setText("Options");
        OptionsMenu.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N

        ChangePasswordMenuItem.setForeground(new java.awt.Color(0, 102, 102));
        ChangePasswordMenuItem.setText("Change User Password");
        ChangePasswordMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordMenuItemActionPerformed(evt);
            }
        });
        OptionsMenu.add(ChangePasswordMenuItem);

        AdministratorMenuBar.add(OptionsMenu);

        setJMenuBar(AdministratorMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSessionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSessionMenuItemActionPerformed
        asef.initialData();
        asef.setVisible(true);
        asef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        asef.setLocationRelativeTo(null);
        asef.setResizable(false);
    }//GEN-LAST:event_AddSessionMenuItemActionPerformed

    private void AddLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLocationMenuItemActionPerformed
        
        alf.setVisible(true);
        alf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        alf.setLocationRelativeTo(null);
        alf.setResizable(false);
    }//GEN-LAST:event_AddLocationMenuItemActionPerformed

    private void AddGeneralGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGeneralGroupMenuItemActionPerformed
        aggf.initialData();
        aggf.setVisible(true);
        aggf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aggf.setLocationRelativeTo(null);
        aggf.setResizable(false);
    }//GEN-LAST:event_AddGeneralGroupMenuItemActionPerformed

    private void AddOfficeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOfficeMenuItemActionPerformed
        aof.initialData();
        aof.setVisible(true);
        aof.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aof.setLocationRelativeTo(null);
        aof.setResizable(false);
    }//GEN-LAST:event_AddOfficeMenuItemActionPerformed

    private void AddEmpolyeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpolyeeMenuItemActionPerformed
        aef.initialData();
        aef.setVisible(true);
        aef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aef.setLocationRelativeTo(null);
        aef.setResizable(false);
    }//GEN-LAST:event_AddEmpolyeeMenuItemActionPerformed

    private void AddPartTimeEHMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPartTimeEHMenuItemActionPerformed
        aptehf.initialData();
        aptehf.setVisible(true);
        aptehf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aptehf.setLocationRelativeTo(null);
        aptehf.setResizable(false); 
    }//GEN-LAST:event_AddPartTimeEHMenuItemActionPerformed

    private void AddRDProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRDProjectMenuItemActionPerformed
        ardpf.initialData();
        ardpf.setVisible(true);
        ardpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ardpf.setLocationRelativeTo(null);
        ardpf.setResizable(false);
    }//GEN-LAST:event_AddRDProjectMenuItemActionPerformed

    private void AddStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentMenuItemActionPerformed
        asf.initialData();
        asf.setVisible(true);
        asf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        asf.setLocationRelativeTo(null);
        asf.setResizable(false);
    }//GEN-LAST:event_AddStudentMenuItemActionPerformed

    private void AddSubGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSubGroupMenuItemActionPerformed
        asgf.initialData();
        asgf.setVisible(true);
        asgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        asgf.setLocationRelativeTo(null);
        asgf.setResizable(false);
    }//GEN-LAST:event_AddSubGroupMenuItemActionPerformed

    private void AddToolByOfficeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToolByOfficeMenuItemActionPerformed
        atbof.initialData();
        atbof.setVisible(true);
        atbof.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atbof.setLocationRelativeTo(null);
        atbof.setResizable(false);
    }//GEN-LAST:event_AddToolByOfficeMenuItemActionPerformed

    private void AddTrainingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainingMenuItemActionPerformed
        atrf.initialData();
        atrf.setVisible(true);
        atrf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atrf.setLocationRelativeTo(null);
        atrf.setResizable(false);
    }//GEN-LAST:event_AddTrainingMenuItemActionPerformed

    private void AddVolunteerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVolunteerMenuItemActionPerformed
        avf.initialData();
        avf.setVisible(true);
        avf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        avf.setLocationRelativeTo(null);
        avf.setResizable(false);
    }//GEN-LAST:event_AddVolunteerMenuItemActionPerformed

    private void EditEmpolyeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpolyeeMenuItemActionPerformed
        
        sef.setVisible(true);
        sef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sef.setLocationRelativeTo(null);
        sef.setResizable(false);
    }//GEN-LAST:event_EditEmpolyeeMenuItemActionPerformed

    private void EditGeneralGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditGeneralGroupMenuItemActionPerformed
        
        sggf.setVisible(true);
        sggf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sggf.setLocationRelativeTo(null);
        sggf.setResizable(false);
    }//GEN-LAST:event_EditGeneralGroupMenuItemActionPerformed

    private void EditLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditLocationMenuItemActionPerformed
        
        slf.setVisible(true);
        slf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        slf.setLocationRelativeTo(null);
        slf.setResizable(false);
    }//GEN-LAST:event_EditLocationMenuItemActionPerformed

    private void EditOfficeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOfficeMenuItemActionPerformed
        
        sof.setVisible(true);
        sof.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sof.setLocationRelativeTo(null);
        sof.setResizable(false);
    }//GEN-LAST:event_EditOfficeMenuItemActionPerformed

    private void EditRDProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRDProjectMenuItemActionPerformed
        
        srdpf.setVisible(true);
        srdpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        srdpf.setLocationRelativeTo(null);
        srdpf.setResizable(false);
    }//GEN-LAST:event_EditRDProjectMenuItemActionPerformed

    private void EditStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentMenuItemActionPerformed
        
        ssf.setVisible(true);
        ssf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ssf.setLocationRelativeTo(null);
        ssf.setResizable(false);
    }//GEN-LAST:event_EditStudentMenuItemActionPerformed

    private void EditSubGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSubGroupMenuItemActionPerformed
        
        ssgf.setVisible(true);
        ssgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ssgf.setLocationRelativeTo(null);
        ssgf.setResizable(false);
    }//GEN-LAST:event_EditSubGroupMenuItemActionPerformed

    private void EditToolMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditToolMenuItemActionPerformed
        
        stf.setVisible(true);
        stf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        stf.setLocationRelativeTo(null);
        stf.setResizable(false);
    }//GEN-LAST:event_EditToolMenuItemActionPerformed

    private void EditTrainingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTrainingMenuItemActionPerformed
        
        strf.setVisible(true);
        strf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        strf.setLocationRelativeTo(null);
        strf.setResizable(false);
    }//GEN-LAST:event_EditTrainingMenuItemActionPerformed

    private void EditVolunteerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditVolunteerMenuItemActionPerformed
        
        svf.setVisible(true);
        svf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        svf.setLocationRelativeTo(null);
        svf.setResizable(false);
    }//GEN-LAST:event_EditVolunteerMenuItemActionPerformed

    private void DeleteEmpolyeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmpolyeeMenuItemActionPerformed
        
        def.setVisible(true);
        def.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        def.setLocationRelativeTo(null);
        def.setResizable(false);
    }//GEN-LAST:event_DeleteEmpolyeeMenuItemActionPerformed

    private void DeleteGeneralGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteGeneralGroupMenuItemActionPerformed
        
        dggf.setVisible(true);
        dggf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dggf.setLocationRelativeTo(null);
        dggf.setResizable(false);
    }//GEN-LAST:event_DeleteGeneralGroupMenuItemActionPerformed

    private void DeleteLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLocationMenuItemActionPerformed
        
        dlf.setVisible(true);
        dlf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dlf.setLocationRelativeTo(null);
        dlf.setResizable(false);
    }//GEN-LAST:event_DeleteLocationMenuItemActionPerformed

    private void DeleteOfficeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOfficeMenuItemActionPerformed
        
        dof.setVisible(true);
        dof.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dof.setLocationRelativeTo(null);
        dof.setResizable(false);
    }//GEN-LAST:event_DeleteOfficeMenuItemActionPerformed

    private void DeleteRDProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRDProjectMenuItemActionPerformed
        
        drdpf.setVisible(true);
        drdpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        drdpf.setLocationRelativeTo(null);
        drdpf.setResizable(false);
    }//GEN-LAST:event_DeleteRDProjectMenuItemActionPerformed

    private void DeleteStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentMenuItemActionPerformed
        
        dsf.setVisible(true);
        dsf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dsf.setLocationRelativeTo(null);
        dsf.setResizable(false);
    }//GEN-LAST:event_DeleteStudentMenuItemActionPerformed

    private void DeleteSubGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSubGroupMenuItemActionPerformed
        
        dsgf.setVisible(true);
        dsgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dsgf.setLocationRelativeTo(null);
        dsgf.setResizable(false);
    }//GEN-LAST:event_DeleteSubGroupMenuItemActionPerformed

    private void DeleteToolMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteToolMenuItemActionPerformed
        
        dtf.setVisible(true);
        dtf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dtf.setLocationRelativeTo(null);
        dtf.setResizable(false);
    }//GEN-LAST:event_DeleteToolMenuItemActionPerformed

    private void DeleteTrainingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTrainingMenuItemActionPerformed
        
        dtrf.setVisible(true);
        dtrf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dtrf.setLocationRelativeTo(null);
        dtrf.setResizable(false);
    }//GEN-LAST:event_DeleteTrainingMenuItemActionPerformed

    private void DeleteVolunteerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteVolunteerMenuItemActionPerformed
        
        dvf.setVisible(true);
        dvf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dvf.setLocationRelativeTo(null);
        dvf.setResizable(false);
    }//GEN-LAST:event_DeleteVolunteerMenuItemActionPerformed

    private void EditDepartmentGeneralManagerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDepartmentGeneralManagerMenuItemActionPerformed
        
        cdgmf.setVisible(true);
        cdgmf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cdgmf.setLocationRelativeTo(null);
        cdgmf.setResizable(false);
    }//GEN-LAST:event_EditDepartmentGeneralManagerMenuItemActionPerformed

    private void ChangePasswordMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordMenuItemActionPerformed
        
        cadpf.setVisible(true);
        cadpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cadpf.setLocationRelativeTo(null);
        cadpf.setResizable(false);
    }//GEN-LAST:event_ChangePasswordMenuItemActionPerformed

    private void AddToolByGroupMenuFameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToolByGroupMenuFameActionPerformed
        
        atbgf.setVisible(true);
        atbgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atbgf.setLocationRelativeTo(null);
        atbgf.setResizable(false);
    }//GEN-LAST:event_AddToolByGroupMenuFameActionPerformed

    private void YoungResearcherManagersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YoungResearcherManagersMenuItemActionPerformed
        cyrmf.setVisible(true);
        cyrmf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cyrmf.setLocationRelativeTo(null);
        cyrmf.setResizable(false);
    }//GEN-LAST:event_YoungResearcherManagersMenuItemActionPerformed

    private void AllEmployeeInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllEmployeeInformationMenuItemActionPerformed
         try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\Employee.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("All Employees Information");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);      
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_AllEmployeeInformationMenuItemActionPerformed

    private void FullTimeEmployeeInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullTimeEmployeeInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\FullTime.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Full Time Employees Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_FullTimeEmployeeInformationMenuItemActionPerformed

    private void PartTimeEmployeeInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartTimeEmployeeInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\PartTime.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Part Time Employees Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);   
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_PartTimeEmployeeInformationMenuItemActionPerformed

    private void AllToolsInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllToolsInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\AllTools.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("All Tools Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_AllToolsInformationMenuItemActionPerformed

    private void ToolsByOfficeInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolsByOfficeInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\ToolsByOffice.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Tools By Offices Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_ToolsByOfficeInformationMenuItemActionPerformed

    private void ToolsByGroupsInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolsByGroupsInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\ToolsByGroups.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Tools By Groups Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_ToolsByGroupsInformationMenuItemActionPerformed

    private void SessionTrainerInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionTrainerInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\SessionsTrainer.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Sessions Trainers Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_SessionTrainerInformationMenuItemActionPerformed

    private void SessionsStudentsInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionsStudentsInformationMenuItemActionPerformed
         try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\SessionStudent.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Sessions Students Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_SessionsStudentsInformationMenuItemActionPerformed

    private void SessionsDurationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SessionsDurationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\SessionsDuration.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Sessions Duration Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_SessionsDurationMenuItemActionPerformed

    private void GroupsLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupsLocationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\Groupslocation.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Group's Locations Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_GroupsLocationMenuItemActionPerformed

    private void ProjectsVolunteerInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectsVolunteerInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\VolunteersAtProjects.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Projects Volunteers Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_ProjectsVolunteerInformationMenuItemActionPerformed

    private void VolunteerInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolunteerInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\Volunteer.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Volunteers Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_VolunteerInformationMenuItemActionPerformed

    private void OfficeManagerInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeManagerInformationMenuItemActionPerformed
         try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\OfficeManager.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Offices Managers Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_OfficeManagerInformationMenuItemActionPerformed

    private void YRManagersInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YRManagersInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\YRManager.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Young Researcher Managers Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_YRManagersInformationMenuItemActionPerformed

    private void StudentsInformationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsInformationMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\Student.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("All Students Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_StudentsInformationMenuItemActionPerformed

    private void SearchEmpolyeeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmpolyeeMenuItemActionPerformed
        Ssef.setVisible(true);
        Ssef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ssef.setLocationRelativeTo(null);
        Ssef.setResizable(false);
    }//GEN-LAST:event_SearchEmpolyeeMenuItemActionPerformed

    private void SearchGeneralGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchGeneralGroupMenuItemActionPerformed
        Ssggf.setVisible(true);
        Ssggf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ssggf.setLocationRelativeTo(null);
        Ssggf.setResizable(false);
    }//GEN-LAST:event_SearchGeneralGroupMenuItemActionPerformed

    private void SearchLocationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchLocationMenuItemActionPerformed
        Sslf.setVisible(true);
        Sslf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sslf.setLocationRelativeTo(null);
        Sslf.setResizable(false);
    }//GEN-LAST:event_SearchLocationMenuItemActionPerformed

    private void SearchOfficeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOfficeMenuItemActionPerformed
        Ssof.setVisible(true);
        Ssof.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ssof.setLocationRelativeTo(null);
        Ssof.setResizable(false);
    }//GEN-LAST:event_SearchOfficeMenuItemActionPerformed

    private void SearchRDProjectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchRDProjectMenuItemActionPerformed
        Ssrdpf.setVisible(true);
        Ssrdpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ssrdpf.setLocationRelativeTo(null);
        Ssrdpf.setResizable(false);
    }//GEN-LAST:event_SearchRDProjectMenuItemActionPerformed

    private void SearchSessionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSessionMenuItemActionPerformed
        Sssef.setVisible(true);
        Sssef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sssef.setLocationRelativeTo(null);
        Sssef.setResizable(false);
    }//GEN-LAST:event_SearchSessionMenuItemActionPerformed

    private void SearchStudentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStudentMenuItemActionPerformed
        Sssf.setVisible(true);
        Sssf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sssf.setLocationRelativeTo(null);
        Sssf.setResizable(false);
    }//GEN-LAST:event_SearchStudentMenuItemActionPerformed

    private void SearchSubGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSubGroupMenuItemActionPerformed
        Sssgf.setVisible(true);
        Sssgf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sssgf.setLocationRelativeTo(null);
        Sssgf.setResizable(false);
    }//GEN-LAST:event_SearchSubGroupMenuItemActionPerformed

    private void SearchToolMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchToolMenuItemActionPerformed
        Sstf.setVisible(true);
        Sstf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sstf.setLocationRelativeTo(null);
        Sstf.setResizable(false);
    }//GEN-LAST:event_SearchToolMenuItemActionPerformed

    private void SearchTrainingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTrainingMenuItemActionPerformed
        Sstrf.setVisible(true);
        Sstrf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Sstrf.setLocationRelativeTo(null);
        Sstrf.setResizable(false);
    }//GEN-LAST:event_SearchTrainingMenuItemActionPerformed

    private void SearchVolunteerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchVolunteerMenuItemActionPerformed
        Ssvf.setVisible(true);
        Ssvf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Ssvf.setLocationRelativeTo(null);
        Ssvf.setResizable(false);
    }//GEN-LAST:event_SearchVolunteerMenuItemActionPerformed

    private void LocationsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationsMenuItemActionPerformed
        try{
          ods=new OracleDataSource();
          ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
          ods.setUser("alnayzak");
          ods.setPassword("123456");
          con=ods.getConnection();
          input=new FileInputStream(new File("C:\\Reports\\Locations.jrxml"));
          jasperDesign=JRXmlLoader.load(input);
          jasperReport=JasperCompileManager.compileReport(jasperDesign);
          jasperPrint=JasperFillManager.fillReport(jasperReport, null, con);
   
          JFrame frame = new JFrame("Locations Informations");
          frame.getContentPane().add(new JRViewer(jasperPrint));
          frame.pack();
          frame.setVisible(true);
          frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
                  
      }
      catch(Exception ex){
          JOptionPane.showMessageDialog(null, ex.toString());
      }
    }//GEN-LAST:event_LocationsMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddEmpolyeeMenuItem;
    private javax.swing.JMenuItem AddGeneralGroupMenuItem;
    private javax.swing.JMenuItem AddLocationMenuItem;
    private javax.swing.JMenuItem AddOfficeMenuItem;
    private javax.swing.JMenuItem AddPartTimeEHMenuItem;
    private javax.swing.JMenuItem AddRDProjectMenuItem;
    private javax.swing.JMenuItem AddSessionMenuItem;
    private javax.swing.JMenuItem AddStudentMenuItem;
    private javax.swing.JMenuItem AddSubGroupMenuItem;
    private javax.swing.JMenuItem AddToolByGroupMenuFame;
    private javax.swing.JMenuItem AddToolByOfficeMenuItem;
    private javax.swing.JMenuItem AddTrainingMenuItem;
    private javax.swing.JMenuItem AddVolunteerMenuItem;
    private javax.swing.JMenuBar AdministratorMenuBar;
    private javax.swing.JMenuItem AllEmployeeInformationMenuItem;
    private javax.swing.JMenuItem AllToolsInformationMenuItem;
    private javax.swing.JMenuItem ChangePasswordMenuItem;
    private javax.swing.JMenuItem DeleteEmpolyeeMenuItem;
    private javax.swing.JMenuItem DeleteGeneralGroupMenuItem;
    private javax.swing.JMenuItem DeleteLocationMenuItem;
    private javax.swing.JMenu DeleteMenu;
    private javax.swing.JMenuItem DeleteOfficeMenuItem;
    private javax.swing.JMenuItem DeleteRDProjectMenuItem;
    private javax.swing.JMenuItem DeleteStudentMenuItem;
    private javax.swing.JMenuItem DeleteSubGroupMenuItem;
    private javax.swing.JMenuItem DeleteToolMenuItem;
    private javax.swing.JMenuItem DeleteTrainingMenuItem;
    private javax.swing.JMenuItem DeleteVolunteerMenuItem;
    private javax.swing.JMenuItem EditDepartmentGeneralManagerMenuItem;
    private javax.swing.JMenuItem EditEmpolyeeMenuItem;
    private javax.swing.JMenuItem EditGeneralGroupMenuItem;
    private javax.swing.JMenuItem EditLocationMenuItem;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem EditOfficeMenuItem;
    private javax.swing.JMenuItem EditRDProjectMenuItem;
    private javax.swing.JMenuItem EditStudentMenuItem;
    private javax.swing.JMenuItem EditSubGroupMenuItem;
    private javax.swing.JMenuItem EditToolMenuItem;
    private javax.swing.JMenuItem EditTrainingMenuItem;
    private javax.swing.JMenuItem EditVolunteerMenuItem;
    private javax.swing.JMenu EmployeeInformationMenu;
    private javax.swing.JMenuItem FullTimeEmployeeInformationMenuItem;
    private javax.swing.JMenuItem GroupsLocationMenuItem;
    private javax.swing.JMenuItem LocationsMenuItem;
    private javax.swing.JMenuItem OfficeManagerInformationMenuItem;
    private javax.swing.JMenu OptionsMenu;
    private javax.swing.JMenuItem PartTimeEmployeeInformationMenuItem;
    private javax.swing.JMenuItem ProjectsVolunteerInformationMenuItem;
    private javax.swing.JMenu ReportsMenu;
    private javax.swing.JMenuItem SearchEmpolyeeMenuItem;
    private javax.swing.JMenuItem SearchGeneralGroupMenuItem;
    private javax.swing.JMenuItem SearchLocationMenuItem;
    private javax.swing.JMenu SearchMenu;
    private javax.swing.JMenuItem SearchOfficeMenuItem;
    private javax.swing.JMenuItem SearchRDProjectMenuItem;
    private javax.swing.JMenuItem SearchSessionMenuItem;
    private javax.swing.JMenuItem SearchStudentMenuItem;
    private javax.swing.JMenuItem SearchSubGroupMenuItem;
    private javax.swing.JMenuItem SearchToolMenuItem;
    private javax.swing.JMenuItem SearchTrainingMenuItem;
    private javax.swing.JMenuItem SearchVolunteerMenuItem;
    private javax.swing.JMenuItem SessionTrainerInformationMenuItem;
    private javax.swing.JMenuItem SessionsDurationMenuItem;
    private javax.swing.JMenuItem SessionsStudentsInformationMenuItem;
    private javax.swing.JMenuItem StudentsInformationMenuItem;
    private javax.swing.JMenu ToolByGroupMenuItem;
    private javax.swing.JMenuItem ToolsByGroupsInformationMenuItem;
    private javax.swing.JMenuItem ToolsByOfficeInformationMenuItem;
    private javax.swing.JMenu ToolsInformationMenu;
    private javax.swing.JMenuItem VolunteerInformationMenuItem;
    private javax.swing.JMenuItem YRManagersInformationMenuItem;
    private javax.swing.JMenuItem YoungResearcherManagersMenuItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
