import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame
{
    public FortuneTellerFrame()
    {
       JPanel mainPnl, titlePnl, displaynl, cmdPnl;
       JLabel titleLbl;
       ImageIcon icon;
       JScrollPane scroller;
       JTextArea fortuneTxt;
       JButton quitBtn, fortuneBtn;

        setTitle("Fortune Teller");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
