import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

// ��ư�� �������� ��������� �� â�� ������ Ŭ����
class newGameRules extends JFrame {
	public static void main(String[] args) {
		
	}
	newGameRules() {
		//JFrame ruleframe = new JFrame("���� ���");
		//ruleframe.setLocation(400, 100);//â ��ġ
		//ruleframe.setPreferredSize(new Dimension(1000,600));
		// ����, ���⼭ setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�
        // �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������
        setTitle("���ӹ��");
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(480,640);
		
		
        JPanel panel= new JPanel(); setContentPane(panel);
        
        ImageIcon ruleIcon = new ImageIcon("src/images/���Ӽ���ũ��.png");
		ImageIcon sruleIcon = new ImageIcon(ruleIcon.getImage().getScaledInstance(1500, 810, Image.SCALE_DEFAULT));
        JLabel ruleLabel = new JLabel(sruleIcon);
        
        panel.add(ruleLabel);
        
        setSize(1500, 850);
        setResizable(false);
        setVisible(true);
    }
}