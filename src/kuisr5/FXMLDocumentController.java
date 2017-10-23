/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisr5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import com.jfoenix.controls.JFXTextField;
/**
 *
 * @author RAFLI NUR FAUZI P
 */
public class FXMLDocumentController implements Initializable {
     @FXML
    private RadioButton cb1;

    @FXML
    private RadioButton cb2;

    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField berat;

    @FXML
    private TextArea ideal;

    @FXML
    private Button proses;

    @FXML
    private Button reset;

    @FXML
    private TextArea hasil;

    @FXML
    private TextArea saran;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
      @FXML
    void proses(ActionEvent event) {
       String Nama = nama.getText();
       int Tinggi = Integer.parseInt(tinggi.getText());
       int Berat =  Integer.parseInt(berat.getText());
       int Ideal = 0 ;
       
       String srn="";
       String status="";
       
       if(cb1.isSelected()){
           Ideal = Tinggi - 105;
    }
    else if(cb2.isSelected()){
           Ideal = Tinggi - 110;
    }
      if (Berat > Ideal){
        status = "Overweight";
    }
      else if (Berat == Ideal){
          status ="Ideal";
      }
      else if (Berat < Ideal){
          status ="UnderWeight";
      }
       if (Berat < Ideal){
          srn ="Berolahraga dengan teratur dan makan-makanan yang sehat"; 
      }
       else if (Berat == Ideal){
          srn ="Anda sudah Ideal";
      }
       else if (Berat > Ideal){
          srn ="makan-makanan yang berkarbohidrat dan meminum susu";
      }
       hasil.setText("nama   "+Nama+", Anda   "+status);
       saran.setText(srn);
       ideal.setText(""+Ideal);
    }

    @FXML
    void reset(ActionEvent event) {
        cb1.setSelected(false);
        cb2.setSelected(false);
        nama.setText("");
        tinggi.setText("");
        berat.setText("");
        ideal.setText("");
        hasil.setText("");
    }

}
