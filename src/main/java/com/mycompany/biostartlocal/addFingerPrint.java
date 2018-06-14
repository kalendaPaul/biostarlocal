/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biostartlocal;

import com.mycompany.biostartlocal.common.Base64Decoder;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author gk
 */
public class addFingerPrint extends javax.swing.JFrame {

    public String Resulsts = null;
    public String Resulsts2 = null;
    public String timage1 = null;
    public String timage2 = null;
    public String rtimage1 = null;
    public String rtimage2 = null;
    public String template0 = null;
    public String template1 = null;
    public String message= null;
    public String user_id=null;
    public static int count = 0;
    public addFingerPrint() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deviceid = new javax.swing.JTextField();
        quality = new javax.swing.JLabel();
        qualityvalue = new javax.swing.JTextField();
        scan1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        finger1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        temp1 = new javax.swing.JLabel();
        temp0 = new javax.swing.JLabel();
        enroll = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernationalID = new javax.swing.JTextField();
        finger2 = new javax.swing.JLabel();
        finger3 = new javax.swing.JLabel();
        finger4 = new javax.swing.JLabel();
        finger5 = new javax.swing.JLabel();
        finger6 = new javax.swing.JLabel();
        finger7 = new javax.swing.JLabel();
        finger8 = new javax.swing.JLabel();
        finger9 = new javax.swing.JLabel();
        finger10 = new javax.swing.JLabel();
        quality1 = new javax.swing.JLabel();
        fingersNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Device ID :");

        deviceid.setEditable(false);
        deviceid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deviceid.setText("539571364");
        deviceid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceidActionPerformed(evt);
            }
        });

        quality.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        quality.setText("Quality :");

        qualityvalue.setEditable(false);
        qualityvalue.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        qualityvalue.setText("80");
        qualityvalue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualityvalueActionPerformed(evt);
            }
        });

        scan1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        scan1.setText("Scan");
        scan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scan1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        finger1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        temp1.setBackground(new java.awt.Color(204, 204, 204));

        temp0.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(temp1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(temp0, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temp0, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(temp1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );

        enroll.setBackground(new java.awt.Color(0, 51, 255));
        enroll.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        enroll.setText("ENROLL");
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(204, 204, 204));
        close.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        close.setText("CANCEL");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("User National ID :");

        usernationalID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usernationalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernationalIDActionPerformed(evt);
            }
        });

        finger2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        finger10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        quality1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        quality1.setText("Fingers To Enroll:");

        fingersNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fingersNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingersNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(enroll)
                        .addGap(26, 26, 26)
                        .addComponent(close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scan1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deviceid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(quality)
                                        .addGap(18, 18, 18)
                                        .addComponent(qualityvalue)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quality1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fingersNo)
                                    .addComponent(usernationalID, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(finger2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(finger1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(finger7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(finger10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(finger6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(deviceid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(usernationalID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quality1)
                        .addComponent(fingersNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quality)
                        .addComponent(qualityvalue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scan1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finger1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finger4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finger6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finger9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(finger10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scan1ActionPerformed
        
        if(!"1st".equals(finger1.getText())) 
        {
            JOptionPane.showMessageDialog(null,"click ADD button first");
        } else
        {
        final int NUM_FIELDS =3;
        int numCorrectFields =0;
        String errorMessage ="";
        String device = null;
        int fingers = 0;
        
        if (deviceid.getText().isEmpty()){
           errorMessage = errorMessage.concat("Device ID is missing.\n");
           deviceid.setText("");
           deviceid.setBorder(new LineBorder(Color.red));
        }else{
        numCorrectFields++;
        device = deviceid.getText();
        
        }
        if (usernationalID.getText().isEmpty()){
           errorMessage = errorMessage.concat("User National ID is missing.\n");
           usernationalID.setText("");
           usernationalID.setBorder(new LineBorder(Color.red));
        }else{
        numCorrectFields++;
        user_id = usernationalID.getText();
        
        }
        if (fingersNo.getText().isEmpty()){
           errorMessage = errorMessage.concat("number of fingers is missing.\n");
           fingersNo.setText("");
           fingersNo.setBorder(new LineBorder(Color.red));
        }else{
        numCorrectFields++;
        fingers = Integer.parseInt(fingersNo.getText());
        
        }
        if (numCorrectFields < NUM_FIELDS){
           JOptionPane.showMessageDialog(null,errorMessage,"Incoplete/Invalid Data Entered!",
                   JOptionPane.ERROR_MESSAGE );
        }else
        {
            ScanFingerPrint scan = new ScanFingerPrint();
        try {
            
            
           
//            HashMap<String, Object> dictionary = new HashMap<>();
            JSONObject json = new JSONObject();
//            jsonObject.put("fingerprint_template_list", array);
            JSONArray array = new JSONArray();
            JSONObject item = new JSONObject();
            int a=1;
            JOptionPane.showMessageDialog(null,"Click Ok to scan the "+a+" finger.");
            for(int idx =0; idx < fingers; idx++)
        {
//            Resulsts = scan.scan(device);
              
            temp1.setIcon(null);
            temp0.setIcon(null);
            Resulsts = scan.scan(device);
                while("Scan quality is low.".equals(Resulsts))
                {
                    JOptionPane pane = new JOptionPane("Scan your fingerprint again",JOptionPane.INFORMATION_MESSAGE);
                    pane.setVisible(true);
                    JDialog dialog = pane.createDialog(null, "Scan Finger Again");
                    dialog.setModal(false);
                    dialog.setVisible(true);
                    try
                       {
                        Thread.sleep(1000);   
                       }catch(InterruptedException e)
                       {}
                    dialog.setVisible(false);
                    pane.setVisible(false);
                    Resulsts = scan.scan(device);
                    
                }
                if(!"Scan quality is low.".equals(Resulsts))
                    {
                         try
                           {
                             Thread.sleep(1500);   
                               }catch(InterruptedException e)
                           {}
                            Resulsts2 = scan.scan(device);
                            while("Scan quality is low.".equals(Resulsts2))
                                {
                                    JOptionPane pane = new JOptionPane("Scan your fingerprint again",JOptionPane.INFORMATION_MESSAGE);
                                    pane.setVisible(true);
                                    JDialog dialog = pane.createDialog(null, "Scan Finger Again");
                                    dialog.setModal(false);
                                    dialog.setVisible(true);
                                try
                                   {
                                        Thread.sleep(1000);   
                                        }catch(InterruptedException e)
                                    {}
                                    dialog.setVisible(false);
                                    pane.setVisible(false);
                                    Resulsts2 = scan.scan(device);
                    
                                 }
                    }
                
                if(Resulsts2!=null && Resulsts!=null)
                {
                   
                    JSONObject jObject = new JSONObject(Resulsts);
                    template0 = (String) jObject.get("template0");
                    JSONObject jObj = new JSONObject(Resulsts2);
                    template1 = (String) jObj.get("template0");
                    Base64Decoder myimage = new Base64Decoder();
                    myimage.decode((String) jObject.get("template_image0"));
                    myimage.decode2((String) jObj.get("template_image0"));
                    
                    ImageIcon imageT1 = new ImageIcon("C:/Users/gk/Documents/NetBeansProjects/biostartLocal/images/sample1.PNG");
                    ImageIcon imageT2 = new ImageIcon("C:/Users/gk/Documents/NetBeansProjects/biostartLocal/images/sample2.PNG");
                    Image image1 = imageT1.getImage();
                    Image image2 = imageT2.getImage();
                    Image newimg1 = image1.getScaledInstance(144, 160,  Image.SCALE_SMOOTH);
                    Image newimg2 = image2.getScaledInstance(144, 160,  Image.SCALE_SMOOTH);
                    imageT1 = new ImageIcon(newimg1);
                    imageT2 = new ImageIcon(newimg2);
//                    File imageFileData1 = new File("C:/Users/gk/Documents/NetBeansProjects/biostartLocal/images/sample1.PNG");
//                    File imageFileData2 = new File("C:/Users/gk/Documents/NetBeansProjects/biostartLocal/images/sample1.PNG");
//                    FileInputStream imageFile1 = new FileInputStream(imageFileData1);
//                    FileInputStream imageFile2 = new FileInputStream(imageFileData2);
//                    byte imageData1[] = new byte[(int) imageFileData1.length()];
//                    byte imageData2[] = new byte[(int) imageFileData2.length()];
//                    imageFile1.read(imageData1);
//                    imageFile2.read(imageData2);

                    temp1.setIcon(imageT1);
                    temp0.setIcon(imageT2);
                }
                
               
               item.put("is_prepare_for_duress", false);
               item.put("template0", template0);
               item.put("template1", template1);
               array.put(item);
               
               json.put("fingerprint_template_list",array);
            message = json.toString();
            if(idx<fingers)
            {
                JOptionPane.showMessageDialog(null,"Click Ok to scan the "+a+" finger.");
                a++;
            }
            System.out.println("message : " + message);
        }   
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(addFingerPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
//        if(Resulsts!=null&&Resulsts2!=null)
//        {
//            
//        }
        }
    }//GEN-LAST:event_scan1ActionPerformed

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollActionPerformed
  
         if(Resulsts2!=null && Resulsts!=null)
        {
            EnrollFingerPrint addtemp = new EnrollFingerPrint();
            try {
                addtemp.enrollfingerprint(user_id, message);
            } catch (IOException | URISyntaxException ex) {
                Logger.getLogger(addFingerPrint.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            
    }//GEN-LAST:event_enrollActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
     
    }//GEN-LAST:event_closeActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int DISPOSE_ON_CLOSE1 = addFingerPrint.DISPOSE_ON_CLOSE;
    }//GEN-LAST:event_closeMouseClicked

    private void qualityvalueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualityvalueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualityvalueActionPerformed

    private void deviceidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceidActionPerformed

    private void usernationalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernationalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernationalIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        finger1.setText("1st");
    }//GEN-LAST:event_jButton2MouseClicked

    private void fingersNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingersNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fingersNoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addFingerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addFingerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addFingerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addFingerPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addFingerPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextField deviceid;
    private javax.swing.JButton enroll;
    private javax.swing.JLabel finger1;
    private javax.swing.JLabel finger10;
    private javax.swing.JLabel finger2;
    private javax.swing.JLabel finger3;
    private javax.swing.JLabel finger4;
    private javax.swing.JLabel finger5;
    private javax.swing.JLabel finger6;
    private javax.swing.JLabel finger7;
    private javax.swing.JLabel finger8;
    private javax.swing.JLabel finger9;
    private javax.swing.JTextField fingersNo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel quality;
    private javax.swing.JLabel quality1;
    private javax.swing.JTextField qualityvalue;
    private javax.swing.JButton scan1;
    private javax.swing.JLabel temp0;
    private javax.swing.JLabel temp1;
    private javax.swing.JTextField usernationalID;
    // End of variables declaration//GEN-END:variables
}
