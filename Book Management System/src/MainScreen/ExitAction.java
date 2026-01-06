package MainScreen;

import java.awt.event.*;
import javax.swing.*;

public class ExitAction extends AbstractAction{
    public ExitAction(){
        putValue(Action.NAME,"終了");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        System.exit(1);
    }
}

