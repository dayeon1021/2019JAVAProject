import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class titleScreen {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(400, 100);//â ��ġ
		frame.setPreferredSize(new Dimension(1200,800)); //�ַ� �̰� ���
			
		BoxLayout titlebox=new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS);
		frame.setLayout(titlebox);
		ImageIcon logo = new ImageIcon("src/images/�ΰ�.PNG");
		JLabel logoimage=new JLabel(logo);
		JButton bt1=new JButton("���� ����");
		bt1.setFont(new Font("��������", Font.BOLD , 30));
		JButton bt2=new JButton("���ӹ��");
		bt2.setFont(new Font("��������", Font.BOLD, 30));
		JButton quitButton=new JButton("��������");
		quitButton.setFont(new Font("��������", Font.BOLD, 30));
		JButton bt4=new JButton("������ �Ұ�");
		bt4.setFont(new Font("��������", Font.BOLD, 30));
		//panel.setHorizontalAlignment(JLabel.CENTER);	//��� ����

	
		//ActionListener (������ �Ұ�)
		JPanel MainContainer = new JPanel();
       // setContentPane(MainContainer);        
		bt4.addActionListener(new ActionListener() {
            // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
            @Override
            public void actionPerformed(ActionEvent e) {
            	new newWindow(); // Ŭ���� newWindow�� ���� ������
            }
            
        });
        
        MainContainer.add(bt4);



		//ActionListener (���� ����)
		ActionListener listener3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}					
		};
		quitButton.addActionListener(listener3);
	
		
		frame.add(logoimage);
		frame.add(bt1);
		frame.add(bt2);
		frame.add(quitButton);
		frame.add(bt4);
		
		frame.pack(); //���δ�
		frame.setVisible(true); //�������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close�ϴ� ���� ����

	}
}
class newWindow extends JFrame {
    // ��ư�� �������� ��������� �� â�� ������ Ŭ����
    newWindow() {
		JFrame dframe = new JFrame("������ �Ұ�");
		dframe.setLocation(400, 100);//â ��ġ
		dframe.setPreferredSize(new Dimension(1200,800)); //�ַ� �̰� ���
        // ����, ���⼭ setDefaultCloseOperation() ���Ǹ� ���� ���ƾ� �Ѵ�
        // �����ϰ� �Ǹ� �� â�� ������ ��� â�� ���α׷��� ���ÿ� ������
        
        JPanel NewWindowContainer = new JPanel();
        setContentPane(NewWindowContainer);
        
        JLabel NewLabel = new JLabel("�� â�� ���µ� ����!");
        
        
        
        NewWindowContainer.add(NewLabel);
        
        setSize(300,100);
        setResizable(false);
        setVisible(true);
    }
}