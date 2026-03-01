package ReturnScreen;


import ReturnScreen.BackHomeAction;
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
        JLabel lan ,lab , lalp ,lapc ,laad ,aw , laren , laret;
        lan = new JLabel("氏名");
        lan.setBounds(30,75,80,30);
        suf.add(lan);
        lapc =new JLabel("郵便番号");
        lapc.setBounds(30,120,80,30);
        suf.add(lapc);
        laad = new JLabel("住所");
        laad.setBounds(30, 165, 80, 30);
        suf.add(laad);
        lab = new JLabel("書籍名");
        lab.setBounds(30, 30, 80, 30);
        suf.add(lab);
        laren = new JLabel("貸出日");
        laren.setBounds(122,195,80,30);
        suf.add(laren);
        laret = new JLabel("返却日");
        laret.setBounds(272,195,80,30);
        suf.add(laret);
        aw = new JLabel("〜");
        aw.setBounds(210,195,80,30);
        suf.add(aw);
        lalp = new JLabel("貸出期間");
        lalp.setBounds(30,220,80,30);
        suf.add(lalp);

//      テキストフォーマット
        JTextField tfn , tfpc ,tfad , tfLs , tfLe;
        tfn =new JTextField(7);
        tfn.setBounds(90,75, 105,30);
        suf.add(tfn);
        tfpc = new JTextField(8);
        tfpc.setBounds(90,120, 80,30);
        suf.add(tfpc);
        tfad = new JTextField();
        tfad.setBounds(90,165,320,30);
        suf.add(tfad);
        tfLs = new JTextField();
        tfLs.setBounds(90,220,105,30);
        suf.add(tfLs);
        tfLe = new JTextField();
        tfLe.setBounds(240,220,105,30);
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
        bur.setBounds(240,265,75,35);
        suf.add(bur);
        bub = new JButton(new BackHomeAction(this));
        bub.setBounds(325,265,75,35);
        suf.add(bub);

        Container ContentPane = getContentPane();
        ContentPane.add(suf);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,250,430,350);
        setVisible(true);
    }
}



