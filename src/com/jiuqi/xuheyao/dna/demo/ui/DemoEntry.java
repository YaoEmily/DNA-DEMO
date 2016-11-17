package com.jiuqi.xuheyao.dna.demo.ui;

import com.jiuqi.dna.ui.wt.UIEntry;
import com.jiuqi.dna.ui.wt.widgets.Shell;

public class DemoEntry implements UIEntry{

	@Override
	public void createUI(String[] args, Shell shell) {
		shell.showPage("main");
		
	}

}
