package LendingScreen;

import javax.swing.*;
import java.awt.*;

public class LFM extends JFrame{
    public LFM(){
        new LFM("貸出システム");
    }
    public LFM(String title){
        super(title);

        JPanel suf = new JPanel();
        suf.setLayout(null);

//      ラベル欄
        JLabel lan ,lab , lalp ,lapc ,aw , laren , laret;
        lan = new JLabel("氏名");
        lan.setBounds(30, 30, 80, 30);
        suf.add(lan);
        lapc =new JLabel("郵便番号");
        lapc.setBounds(30,75,80,30);
        suf.add(lapc);
        lab = new JLabel("書籍名");
        lab.setBounds(30, 110, 80, 30);
        suf.add(lab);
        laren = new JLabel("貸出日");
        laren.setBounds(122,135,80,30);
        suf.add(laren);
        laret = new JLabel("返却日");
        laret.setBounds(272,135,80,30);
        suf.add(laret);
        aw = new JLabel("〜");
        aw.setBounds(210,150,80,30);
        suf.add(aw);
        lalp = new JLabel("貸出期間");
        lalp.setBounds(30,160,80,30);
        suf.add(lalp);

//      テキストフォーマット
        JTextField tfn , tfLs , tfLe;
        tfn =new JTextField(7);
        tfn.setBounds(90,30,105,30);
        suf.add(tfn);
        tfLs = new JTextField();
        tfLs.setBounds(90,160,105,30);
        suf.add(tfLs);
        tfLe = new JTextField();
        tfLe.setBounds(240,160,105,30);
        suf.add(tfLe);

//      コンボボックス欄
        String[] bl = {"３ステップでしっかり学ぶ PHP入門" , "３ステップでしっかり学ぶ javaScript入門"
        ,"スラスラわかるHTML&CSSのきほん" ,"ぜったいできます！ ワード＆エクセル超入門",  "ビジネス実務法務試験3級"};
        JComboBox<String> cbl = new JComboBox<String>(bl);
        cbl.setBounds(90,110,320,30);
        suf.add(cbl);

//      ボタン欄
        JButton bur , bub;
        bur = new JButton("貸出");
        bur.setBounds(240,320,75,35);
        suf.add(bur);
        bub = new JButton(new BackHomeAction(this));
        bub.setBounds(325,320,75,35);
        suf.add(bub);

        Container ContentPane = getContentPane();
        ContentPane.add(suf);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430 ,400);
        setVisible(true);
    }
}