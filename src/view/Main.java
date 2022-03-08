package view;

import controller.KillController;

public class Main {

	public static void main(String[] args) {
		
		KillController kc = new KillController();
		kc.listaProcessos();

		int PId = 2068;
		kc.mataPid(PId);
		
		String ProcessName = "EXCEL.EXE";
		kc.mataNome(ProcessName);
		
	}

}
