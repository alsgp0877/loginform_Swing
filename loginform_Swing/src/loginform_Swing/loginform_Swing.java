package loginform_Swing;
import javax.swing.JOptionPane;

public class loginform_Swing {
	 public static void main(String[] args) { 
		 String id = JOptionPane.showInputDialog("사용자 아이디를 입력해주세요");
		 String password="";
		 
			 if(id.equals("a")) {
				 for(int i=0;i<5;i++) {
					 password=JOptionPane.showInputDialog("사용자 비밀번호를 입력해주세요");
					 	if(password.equals("1111")) {
					 		JOptionPane.showMessageDialog(null, "환영합니다!","Message",JOptionPane.OK_OPTION);
					 		break;
					 	}else {
					 		 JOptionPane.showMessageDialog(null, "인증에 실패하였습니다.","Message",JOptionPane.ERROR_MESSAGE);
					 		 continue;
					 	}//end password
				 	}//end password for
			 }else {
				 if(id==null || id.equals("") || !id.equals("a")){//사용자가 id 값을 안넣거나,취소하거나,잘못입력했을경우
					 JOptionPane.showMessageDialog(null, "취소되었습니다","Message",JOptionPane.ERROR_MESSAGE);
				 } 
			 }//end admin 
	 }//end main

}//end class