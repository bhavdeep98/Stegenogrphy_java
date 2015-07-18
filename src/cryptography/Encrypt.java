package cryptography;
import java.awt.image.BufferedImage;
public class Encrypt extends javax.swing.JFrame {
    static BufferedImage BI=null;
    public Encrypt() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDec = new javax.swing.JPanel();
        lblEnc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHid = new javax.swing.JTextArea();
        btnShow = new javax.swing.JButton();
        btnDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDec.setBackground(new java.awt.Color(204, 204, 204));

        lblEnc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblEnc.setText("Encrypt");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Enter Path");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Enter Text");

        txtHid.setColumns(20);
        txtHid.setRows(5);
        jScrollPane1.setViewportView(txtHid);

        btnShow.setBackground(new java.awt.Color(153, 153, 153));
        btnShow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShow.setText("Show Image");
        btnShow.setDoubleBuffered(true);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnDec.setBackground(new java.awt.Color(153, 153, 153));
        btnDec.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDec.setText("Encrypt");
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDecLayout = new javax.swing.GroupLayout(pnlDec);
        pnlDec.setLayout(pnlDecLayout);
        pnlDecLayout.setHorizontalGroup(
            pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDecLayout.createSequentialGroup()
                .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDecLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblEnc))
                    .addGroup(pnlDecLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDecLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShow))
                            .addGroup(pnlDecLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDecLayout.setVerticalGroup(
            pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDecLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow))
                .addGap(18, 18, 18)
                .addGroup(pnlDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDec)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
       ImageUtilities.ImShow(txtPath.getText(),"Show Image");
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        String imgPath=txtPath.getText();
        String hidtxt=txtHid.getText();
        if(imgPath!=null && hidtxt!=null){
            BufferedImage BI;
            BI = ImageUtilities.ImRead(imgPath,hidtxt);
        }
    
         byte bytes[]=hidtxt.getBytes();
         int TotalChars=bytes.length;
         int width=BI.getWidth();
         int height=BI.getHeight();
         
         int ind=0;
         
         for(int w=0; w<width; w+=5)
         {
         for(int h=0; h<height; h+=5)
         {
              if(ind<TotalChars)
              {           
                  System.out.println("Encrypt "+bytes[ind]);
                  ImageUtilities.setRed(BI, w, h,bytes[ind]);
                  ind++;
              }              
          
         }
         
      }
             
              ImageUtilities.setBlue(BI, width-1, height-1,TotalChars);
          
                   ImageUtilities.imWrite(BI);
    }//GEN-LAST:event_btnDecActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Encrypt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnc;
    private javax.swing.JPanel pnlDec;
    private javax.swing.JTextArea txtHid;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
