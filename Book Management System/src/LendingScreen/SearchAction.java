package LendingScreen;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SearchAction extends AbstractAction{
    private JTextField tfpc , tfad;
    public SearchAction(JTextField tfpc , JTextField tfad){
        this.tfpc = tfpc;
        this.tfad = tfad;
        putValue(Action.NAME,"検索");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(tfpc == null || tfad == null){
            return;
        }
        String pc = tfpc.getText();
        String pcs = pc.replace("-","");
        String ad =  SearchFromCSV(pcs);
        if(ad != null){
            tfad.setText(ad);
        }else {
            tfad.setText("該当なし");
        }
    }

    private String SearchFromCSV(String pcs){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("KEN_ALL.CSV"),"Shift_JIS"))){
            String line;
            while((line = br.readLine()) != null){
                String[] pfm = line.split(",",-1);
                if(pfm.length > 8){
                    String zip = pfm[2].replace("\"","");
                    if(zip.equals(pcs)){
                        String pref = pfm[6].replace("\"","");
                        String city = pfm[7].replace("\"","");
                        String town = pfm[8].replace("\"","");

                        return pref + city + town;
                    }
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
