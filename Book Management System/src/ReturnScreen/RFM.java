package ReturnScreen;


import MainScreen.ReturnAction;

import javax.swing.*;
import java.awt.*;

public class RFM extends JFrame{
    public RFM(){
        new RFM("返却システム");
    }
    public RFM(String title){
        super(title);

        JPanel suf = new JPanel();
        suf.setLayout(null);

//      ラベル欄
        JLabel lab ,lan , lalp ,aw , ren , ret;
        lab = new JLabel("書籍名");
        lab.setBounds(30, 30, 80, 30);
        suf.add(lab);
        lan = new JLabel("氏名");
        lan.setBounds(30, 75, 80, 30);
        suf.add(lan);
        ren = new JLabel("貸出日");
        ren.setBounds(122,110,80,30);
        suf.add(ren);
        ret = new JLabel("返却日");
        ret.setBounds(272,110,80,30);
        suf.add(ret);
        aw = new JLabel("〜");
        aw.setBounds(210,135,80,30);
        suf.add(aw);
        lalp = new JLabel("貸出期間");
        lalp.setBounds(30,135,80,30);
        suf.add(lalp);

//      テキストフォーマット
        JTextField tfn , tfLs , tfLe;
        tfn =new JTextField(7);
        tfn.setBounds(90,75,105,30);
        suf.add(tfn);
        tfLs = new JTextField();
        tfLs.setBounds(90,135,105,30);
        suf.add(tfLs);
        tfLe = new JTextField();
        tfLe.setBounds(240,135,105,30);
        suf.add(tfLe);

//      コンボボックス欄
        String[] bl = {"３ステップでしっかり学ぶ PHP入門" , "３ステップでしっかり学ぶ javaScript入門"
        ,"スラスラわかるHTML&CSSのきほん" ,"ぜったいできます！ ワード＆エクセル超入門",  "ビジネス実務法務試験3級"};
        JComboBox<String> cbl = new JComboBox<String>(bl);
        cbl.setBounds(90,30,320,30);
        suf.add(cbl);

//      ボタン欄
        JButton bur , bub;
        bur = new JButton("返却");
        bur.setBounds(240,180,75,35);
        suf.add(bur);
        bub = new JButton(new BackHomeAction(this));
        bub.setBounds(325,180,75,35);
        suf.add(bub);

        Container ContentPane = getContentPane();
        ContentPane.add(suf);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430 ,270);
        setVisible(true);
    }
}



