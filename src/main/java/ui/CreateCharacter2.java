/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.Charac;
import javax.swing.JOptionPane;

/**
 *
 * @author sinsentido
 */
public class CreateCharacter2 extends javax.swing.JDialog {
    private MainScreen mainScreen;
    private Charac charac2;

    /**
     * Creates new form CreateCharacter2
     */
    public CreateCharacter2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mainScreen = (MainScreen)parent;
    }
    
    private Charac getDataPart2(){
        charac2.setStrength((byte)strengthPoints.getValue());
        charac2.setDexterity((byte)dexterityPoints.getValue());
        charac2.setStamina((byte)staminaPoints.getValue());
        charac2.setCharisma((byte)charismaPoints.getValue());
        charac2.setManipulation((byte)manipulationPoints.getValue());
        charac2.setAppearence((byte)appearencePoints.getValue());
        charac2.setPerception((byte)perceptionPoints.getValue());
        charac2.setIntelligence((byte)intelligencePoints.getValue());
        charac2.setWits((byte)witsPoints.getValue());
        
        return charac2;
    }
    
    public void getData1(Charac charac1){
        charac2 = charac1;
    }
    
    private boolean arePointsWellAsigned(){
        
        if(physicalPoints.getItemAt(physicalPoints.getSelectedIndex()).equals(socialPoints.getItemAt(socialPoints.getSelectedIndex()))
                ||physicalPoints.getItemAt(physicalPoints.getSelectedIndex()).equals(mentalPoints.getItemAt(mentalPoints.getSelectedIndex()))
                ||socialPoints.getItemAt(socialPoints.getSelectedIndex()).equals(mentalPoints.getItemAt(mentalPoints.getSelectedIndex()))){
        return false;
        }
        return true;
    }
    
    private boolean arePhysicalPointsWell(){
        byte totalPoints = Byte.parseByte(physicalPoints.getItemAt(physicalPoints.getSelectedIndex()));
        byte strength = (Byte)strengthPoints.getValue();
        byte dexterity = (Byte)dexterityPoints.getValue();
        byte stamina = (Byte)staminaPoints.getValue();
        
        if(strength + dexterity + stamina != totalPoints){
            return false;
        }        
        return true;
    }
    
    private boolean areSocialPointsWell(){
        byte totalPoints = Byte.parseByte(socialPoints.getItemAt(socialPoints.getSelectedIndex()));
        byte charisma = (Byte)charismaPoints.getValue();
        byte manipulation = (Byte)manipulationPoints.getValue();
        byte appearence = (Byte)appearencePoints.getValue();
        
        if(charisma + manipulation + appearence != totalPoints){
            return false;
        }  
        
        return true;
    }
    
    private boolean areMentalPointsWell(){
        byte totalPoints = Byte.parseByte(mentalPoints.getItemAt(mentalPoints.getSelectedIndex()));
        byte perception = (Byte)perceptionPoints.getValue();
        byte intelligence = (Byte)intelligencePoints.getValue();
        byte wits = (Byte)witsPoints.getValue();
        
        if(perception + intelligence + wits != totalPoints){
            return false;
        }  
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitleAddCharacter2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        physicalPoints = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        strengthPoints = new javax.swing.JSpinner();
        dexterityPoints = new javax.swing.JSpinner();
        staminaPoints = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        socialPoints = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        charismaPoints = new javax.swing.JSpinner();
        manipulationPoints = new javax.swing.JSpinner();
        appearencePoints = new javax.swing.JSpinner();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mentalPoints = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        perceptionPoints = new javax.swing.JSpinner();
        intelligencePoints = new javax.swing.JSpinner();
        witsPoints = new javax.swing.JSpinner();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitleAddCharacter2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitleAddCharacter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAddCharacter2.setText("Create character step 2/3");

        jPanel2.setLayout(new java.awt.GridLayout(1, 3));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Physical");

        physicalPoints.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "7" }));

        jLabel4.setText("Strength");

        jLabel5.setText("Dexterity");

        jLabel6.setText("Stamina");

        strengthPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        dexterityPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        staminaPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strengthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dexterityPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staminaPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(physicalPoints, 0, 46, Short.MAX_VALUE)))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(physicalPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(strengthPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dexterityPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(staminaPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Social");

        socialPoints.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "7" }));
        socialPoints.setSelectedIndex(1);
        socialPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialPointsActionPerformed(evt);
            }
        });

        jLabel7.setText("Charisma");

        jLabel8.setText("Manipulation");

        jLabel9.setText("Appearence");

        charismaPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        manipulationPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        appearencePoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charismaPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manipulationPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appearencePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socialPoints, 0, 52, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socialPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(charismaPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(manipulationPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(appearencePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mental");

        mentalPoints.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "5", "7" }));
        mentalPoints.setSelectedIndex(2);

        jLabel10.setText("Perception");

        jLabel11.setText("Intelligence");

        jLabel12.setText("Wits");

        perceptionPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        intelligencePoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        witsPoints.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)0), Byte.valueOf((byte)0), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perceptionPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intelligencePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(witsPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mentalPoints, 0, 52, Short.MAX_VALUE)
                .addGap(109, 109, 109))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentalPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(perceptionPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(intelligencePoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(witsPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleAddCharacter2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitleAddCharacter2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void socialPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socialPointsActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        CreateCharacter3 createCharacter3 = new CreateCharacter3(mainScreen, true);
        
        if(!arePointsWellAsigned()){
            JOptionPane.showMessageDialog(this, "The total points in the attributes sections must be different.", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if(!arePhysicalPointsWell()){
            JOptionPane.showMessageDialog(this, "Physical attributes points doesn't match with the total physical points", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else if(!areSocialPointsWell()){
            JOptionPane.showMessageDialog(this, "Social attributes points doesn't match with the total social points", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
        else if(!areMentalPointsWell()){
            JOptionPane.showMessageDialog(this, "Mental attributes points doesn't match with the total mental points", 
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            createCharacter3.getData2(getDataPart2());
            createCharacter3.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner appearencePoints;
    private javax.swing.JButton btnNext;
    private javax.swing.JSpinner charismaPoints;
    private javax.swing.JSpinner dexterityPoints;
    private javax.swing.JSpinner intelligencePoints;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblTitleAddCharacter2;
    private javax.swing.JSpinner manipulationPoints;
    private javax.swing.JComboBox<String> mentalPoints;
    private javax.swing.JSpinner perceptionPoints;
    private javax.swing.JComboBox<String> physicalPoints;
    private javax.swing.JComboBox<String> socialPoints;
    private javax.swing.JSpinner staminaPoints;
    private javax.swing.JSpinner strengthPoints;
    private javax.swing.JSpinner witsPoints;
    // End of variables declaration//GEN-END:variables
}
