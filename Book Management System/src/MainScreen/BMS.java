package MainScreen;

import javax.swing.*;

public class BMS extends JFrame {
    public static void main(String[] args) {
        new BMS("書籍管理システム");
    }
    public BMS(String title) {
        super(title);
        JPanel pane = (JPanel) getContentPane();

        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton BookLending, BookReturn, StockConfirmation, Exit;
        BookLending = new JButton(new LendingAction(this));
        panel.add(BookLending);
        BookLending.setBounds(205, 25, 200, 50);

        BookReturn = new JButton(new ReturnAction(this));
        panel.add(BookReturn);
        BookReturn.setBounds(205, 110, 200, 50);

        StockConfirmation = new JButton("在庫確認");
        StockConfirmation.setBounds(205, 195, 200, 50);
        panel.add(StockConfirmation);

        Exit = new JButton("終了");
        panel.add(Exit);
        Exit.setBounds(205, 280, 200, 50);
        pane.add(panel);

        //フレームワーク
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(610, 400);
        setVisible(true);
    }
}
