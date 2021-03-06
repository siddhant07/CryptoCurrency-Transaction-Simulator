/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Management.ManagementManager;

import Business.Enterprise.Enterprise;
import Business.Enterprise.ExchangeEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Exchange.ExchangeManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.Util.Request.RequestStatus;
import static Business.Util.Request.RequestStatus.pickupRequestStatusList;
import Business.WorkQueue.CollectionWorkRequest;
import Business.WorkQueue.PaymentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indap.n
 */
public class ManagementManagerGenerateInvoicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManagerGenerateInvoices
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;

    public ManagementManagerGenerateInvoicesJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.account = account;
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        cmbNGO = new javax.swing.JComboBox();
        btnGenerateAll = new javax.swing.JButton();
        btnGenerateInovice = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Completion Date", "Request Status", "Cost", "Invoice Generated", "Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
            tblDetails.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setText("Exchange Name:");

        cmbNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNGOActionPerformed(evt);
            }
        });

        btnGenerateAll.setText("Generate All Invoices");
        btnGenerateAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateAllActionPerformed(evt);
            }
        });

        btnGenerateInovice.setText("Generate Invoice");
        btnGenerateInovice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInoviceActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(32, 47, 90));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Management Manager Work Area - Generate Invoices");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(21, 21, 21)
                        .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(203, 203, 203)
                        .addComponent(btnGenerateAll)
                        .addGap(28, 28, 28)
                        .addComponent(btnGenerateInovice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnGenerateInovice)
                    .addComponent(btnGenerateAll))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateComboBox() {
        cmbNGO.removeAllItems();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Exchange)) {
                cmbNGO.addItem(e);
            }
        }
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNGOActionPerformed
        // TODO add your handling code here:
        ExchangeEnterprise ngo = (ExchangeEnterprise) cmbNGO.getSelectedItem();
        if (ngo != null) {
            populateTable(ngo);
        }
    }//GEN-LAST:event_cmbNGOActionPerformed

    private void btnGenerateInoviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInoviceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request to generate invoice for",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest cwr = (CollectionWorkRequest) tblDetails.getValueAt(selectedRow, 1);
            String status = cwr.getStatus();
            if (status.equals(pickupRequestStatusList.get(5)) || status.equals(pickupRequestStatusList.get(6))) {
                if (cwr.getPaid()) {
                    JOptionPane.showMessageDialog(null,
                            "Selected Invoice has already been paid for",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (cwr.getInvoiceGenerated()) {
                    JOptionPane.showMessageDialog(null,
                            "Selected Invoice has already been generated",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                ExchangeEnterprise ngo = (ExchangeEnterprise) cmbNGO.getSelectedItem();

                PaymentWorkRequest pwr = new PaymentWorkRequest();
                cwr.setInvoiceGenerated(true);
                pwr.setCollectionWorkRequest(cwr);
                pwr.setStatus(RequestStatus.getInvoiceStatusMessage(1));
                pwr.setSender(account);

                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equals(ngo.getName())) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            if (o instanceof ExchangeManagerOrganization) {
                                o.getWorkQueue().getWorkRequestList().add(pwr);
                                break;
                            }
                        }
                    }
                }

                // Add to own work queue
                account.getWorkQueue().getWorkRequestList().add(pwr);
                JOptionPane.showMessageDialog(null, "Invoice request raised with NGO for further processing", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateTable(ngo);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not delivered yet to generate an Invoice for",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerateInoviceActionPerformed

    private void btnGenerateAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateAllActionPerformed

        ExchangeEnterprise ngo = (ExchangeEnterprise) cmbNGO.getSelectedItem();
        boolean generated = false;

        for (int i = 0; i < tblDetails.getRowCount(); i++) {
            WorkRequest wr = (WorkRequest) tblDetails.getValueAt(i, 1);
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                if (!cwr.getPaid() && !cwr.getInvoiceGenerated()) {
                    generated = true;

                    PaymentWorkRequest pwr = new PaymentWorkRequest();
                    cwr.setInvoiceGenerated(true);
                    pwr.setCollectionWorkRequest(cwr);
                    pwr.setStatus(RequestStatus.getInvoiceStatusMessage(1));
                    pwr.setSender(account);

                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equals(ngo.getName())) {
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof ExchangeManagerOrganization) {
                                    o.getWorkQueue().getWorkRequestList().add(pwr);
                                    break;
                                }
                            }
                        }
                    }

                    // Add to own work queue
                    account.getWorkQueue().getWorkRequestList().add(pwr);

                }
            }
        }
        if (!generated) {
            JOptionPane.showMessageDialog(null, "All invoices already generated", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "All ungenerated invoices are now generated", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable(ngo);
    }//GEN-LAST:event_btnGenerateAllActionPerformed

    public void populateTable(ExchangeEnterprise ngo) {

        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                if ((cwr.getStatus().equals(pickupRequestStatusList.get(5))) || (cwr.getStatus().equals(pickupRequestStatusList.get(6)))) {
                    if (cwr.getDeliverToExchange() != null) {
                        if (cwr.getDeliverToExchange().equals(ngo.getName())) {
                            Object row[] = new Object[5];
                            row[0] = cwr.getResolveDate();
                            row[1] = cwr;
                            row[2] = "$" + cwr.getDeliveryCost();
                            row[3] = cwr.getInvoiceGenerated() ? "Yes" : "No";
                            row[4] = cwr.getPaid() ? "Yes" : "No";

                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateAll;
    private javax.swing.JButton btnGenerateInovice;
    private javax.swing.JComboBox cmbNGO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
