/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.ProjectController;
import javax.swing.JOptionPane;
import model.Project;

/**
 *
 * @author Daniel
 */
public class ProjectDialogScreen extends javax.swing.JDialog {

    //Variável global (objeto)
    ProjectController controller;
    
    
    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new ProjectController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelProject = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));

        jLabelToolBarTitle.setBackground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitle.setText("Projeto");

        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelProject.setBackground(new java.awt.Color(255, 255, 255));

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Nome");

        jTextFieldName.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescription.setText("Descrição");

        jTextAreaDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelProjectLayout = new javax.swing.GroupLayout(jPanelProject);
        jPanelProject.setLayout(jPanelProjectLayout);
        jPanelProjectLayout.setHorizontalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProjectLayout.setVerticalGroup(
            jPanelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked
        try{
            //Criando o objeto e salvando as informações dos campos no objeto
            Project project = new Project();
            project.setName(jTextFieldName.getText());
            project.setDescription(jTextAreaDescription.getText());

            //Salvando no banco de dados
            controller.save(project);

            //Confirmação do salvamento
            JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        };
        
        //Fechando a janela
        this.dispose();
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialogScreen dialog = new ProjectDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelProject;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
