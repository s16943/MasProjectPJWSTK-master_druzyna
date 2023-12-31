package Frames;

import HelperClasses.HelperMethods;
import Persons.Kontrakt;
import Persons.Pilkarz;
import Persons.Statystyki;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DodajPilkarzaFrame extends javax.swing.JFrame {

    /**
     * Creates new form DodajPilkarzaFrame
     */
    public DodajPilkarzaFrame() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        cb_LepszaNogaAdd.removeAllItems();
        cb_LepszaNogaAdd.setModel(new DefaultComboBoxModel(Pilkarz.Noga.values()));
        cb_Addpozycja.removeAllItems();
        cb_Addpozycja.setModel(new DefaultComboBoxModel(Pilkarz.Pozycja.values()));
    }



    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_addNazwisko = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_addDataUrodzenia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_Addpozycja = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_LepszaNogaAdd = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_addImie = new javax.swing.JTextField();
        txt_addRozegraneMinuty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_addRozegraneMecze = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_addAsysty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_AddSave = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        txt_addGoleStrzelone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_kontraktDataPoczatkowa = new javax.swing.JTextField();
        txt_KontrakZarobki = new javax.swing.JTextField();
        txt_DataKoncowa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Statystyki");

        jLabel2.setText("Imie");

        jLabel3.setText("Nazwisko");

        jLabel4.setText("Data Urodzenia");

        jLabel5.setText("dominujaca noga");

        cb_Addpozycja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_AddpozycjaActionPerformed(evt);
            }
        });

        jLabel6.setText("Pozycja");

        cb_LepszaNogaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_LepszaNogaAddActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dodaj Piłkarza");

        jLabel8.setText("Gole Strzelone");

        jLabel10.setText("Rozegrane mecze");

        jLabel11.setText("Rozegrane minuty");

        jLabel12.setText("Asysty");

        btn_AddSave.setText("Zapisz");
        btn_AddSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddSaveActionPerformed(evt);
            }
        });

        btn_cancel.setText("anuluj");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Kontrakt");

        jLabel13.setText("Data poczatkowa");

        jLabel14.setText("Data koncowa");

        jLabel15.setText("zarobki na miesiac");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_AddSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_kontraktDataPoczatkowa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_KontrakZarobki, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_addRozegraneMecze, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_addGoleStrzelone, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(67, 67, 67))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_addRozegraneMinuty)
                                    .addComponent(txt_addAsysty, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txt_DataKoncowa)))
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_addDataUrodzenia)
                            .addComponent(cb_LepszaNogaAdd, 0, 153, Short.MAX_VALUE)
                            .addComponent(txt_addImie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Addpozycja, 0, 140, Short.MAX_VALUE)
                            .addComponent(txt_addNazwisko))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_addNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_addImie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_addDataUrodzenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb_Addpozycja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_LepszaNogaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addAsysty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8)
                    .addComponent(txt_addGoleStrzelone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addRozegraneMinuty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(txt_addRozegraneMecze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txt_kontraktDataPoczatkowa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DataKoncowa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_KontrakZarobki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddSave)
                    .addComponent(btn_cancel))
                .addGap(18, 18, 18))
        );

        pack();
    }

    private void cb_AddpozycjaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cb_LepszaNogaAddActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
    private void btn_AddSaveActionPerformed(java.awt.event.ActionEvent evt) {
       boolean err = false;
        
        try{
       Date DataUrodzenia = null;
       String name = txt_addImie.getText();
       String nazwisko = txt_addNazwisko.getText();
       if(txt_addDataUrodzenia.getText() != null && txt_addDataUrodzenia.getText() != ""){
       DataUrodzenia = HelperMethods.getDateFromString(txt_addDataUrodzenia.getText());
       }
       Pilkarz.Noga noga = (Pilkarz.Noga) cb_LepszaNogaAdd.getSelectedItem();
       Pilkarz.Pozycja poz = (Pilkarz.Pozycja) cb_Addpozycja.getSelectedItem();
       Integer gol = Integer.valueOf(txt_addGoleStrzelone.getText());
       Integer asys = Integer.valueOf(txt_addAsysty.getText());
       Integer rozmin = Integer.valueOf(txt_addRozegraneMinuty.getText());
       Integer rozmecz = Integer.valueOf(txt_addRozegraneMecze.getText());
       Date dataPoczatkowa = HelperMethods.getDateFromString(txt_kontraktDataPoczatkowa.getText());
       Date datakoncowa  = HelperMethods.getDateFromString(txt_DataKoncowa.getText());
       Double zarobki = Double.valueOf(txt_KontrakZarobki.getText());
       
       Statystyki st = new Statystyki(gol,asys,rozmecz,rozmin);
       Kontrakt kt = new Kontrakt(dataPoczatkowa,datakoncowa,zarobki);
       
        Pilkarz pk = new Pilkarz(name,nazwisko,DataUrodzenia,kt,noga,poz,st);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, 
             "Błąd, wypełnij pola", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
          err = true;
       }
        if(!err){
        JOptionPane.showMessageDialog(this, 
             "Sukces", "Pilkarz został dodany", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        }
    }


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajPilkarzaFrame().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btn_AddSave;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> cb_Addpozycja;
    private javax.swing.JComboBox<String> cb_LepszaNogaAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_DataKoncowa;
    private javax.swing.JTextField txt_KontrakZarobki;
    private javax.swing.JTextField txt_addAsysty;
    private javax.swing.JTextField txt_addDataUrodzenia;
    private javax.swing.JTextField txt_addGoleStrzelone;
    private javax.swing.JTextField txt_addImie;
    private javax.swing.JTextField txt_addNazwisko;
    private javax.swing.JTextField txt_addRozegraneMecze;
    private javax.swing.JTextField txt_addRozegraneMinuty;
    private javax.swing.JTextField txt_kontraktDataPoczatkowa;

}
