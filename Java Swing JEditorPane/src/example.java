import java.io.IOException;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class example extends JFrame{
	private static final long serialVersionUID = 1L;
	private JEditorPane pane;
	
	public example(){
		pane = new JEditorPane();
		pane.setContentType("text/html");
		try {
			pane.setPage(new URL("http://www.java.com"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(pane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new example();
            }
        }); // Erzeugt einen neuen Thread, der eine Instanz von JFrame erzeugt
	}
}
