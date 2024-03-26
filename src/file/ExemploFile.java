package file;

import java.io.File;

import javax.swing.JOptionPane;

public class ExemploFile {
	public static void main(String[] args) {
		String menu = "1-listar\n"
				+"2- apagar \n"
				+"3- sair";
		
		int op =0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			File [] arqs = null;
			if(op==1) {
				String dir  = JOptionPane.showInputDialog("path");
				File directory = new File(dir);
				if( directory.isDirectory()) {
					arqs = directory.listFiles()
;
					for(File f : arqs) {
						System.out.println(f.getName());
					}
				}else {
					System.out.println("caminho invalido");
				}
			}if(op==2) {
				for(File f : arqs) {
					f.delete();
				}
			}
		}while(op!=3);
	}
	

}
