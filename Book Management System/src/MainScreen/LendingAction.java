package MainScreen;

import LendingScreen.LFM;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class LendingAction extends AbstractAction{
    private BMS mb;
    public LendingAction(BMS mb){
        this.mb = mb;
        putValue(Action.NAME ,"貸出");
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        LFM lm = new LFM();
        Optional.of(lm);
        mb.dispose();
    }
}
