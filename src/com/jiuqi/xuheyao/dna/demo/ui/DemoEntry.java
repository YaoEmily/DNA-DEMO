package com.jiuqi.xuheyao.dna.demo.ui;

import com.jiuqi.dna.ui.common.constants.JWT;
import com.jiuqi.dna.ui.wt.UIEntry;
import com.jiuqi.dna.ui.wt.graphics.CBorder;
import com.jiuqi.dna.ui.wt.layouts.GridData;
import com.jiuqi.dna.ui.wt.layouts.GridLayout;
import com.jiuqi.dna.ui.wt.widgets.Button;
import com.jiuqi.dna.ui.wt.widgets.Composite;
import com.jiuqi.dna.ui.wt.widgets.Shell;
import com.jiuqi.dna.ui.wt.widgets.Text;

public class DemoEntry implements UIEntry{

	@Override
	public void createUI(String[] args, Shell shell) {
		// TODO Auto-generated method stub
		//System.out.println("Hello DNA!");
		
		Composite composite = new Composite(shell);
		composite.setBorder(new CBorder(1,1,1));
		composite.setSize(600, 300);
		//给容器设置边距
		
		//布局是设置在上边容器上的
		//创建网格布局
		GridLayout gridLayout = new GridLayout(4);
		//给容器设置边距
		gridLayout.marginBottom = 8;
		gridLayout.marginLeft = 8;
		gridLayout.marginRight = 8;
		gridLayout.marginTop = 8;
		gridLayout.makeColumnsEqualWidth = true;
		composite.setLayout(gridLayout);
		GridData gridData_txt = new GridData(GridData.FILL_BOTH);
		gridData_txt.horizontalSpan = 4;
		
//		Label label = new Label(shell);
//		label.setText("Hello Label");
//		label.setSize(100, 20);
		
		Text text = new Text(composite);
		text.setLayoutData(gridData_txt);
		
		Button button = new Button(composite);
		button.setText("Hello Button!");
		button.setSize(200,50);
		for(int i = 0; i < 10; i++)
		{
			button = new Button(composite);
			button.setText("Hello Button" + Integer.toString(i) + "!");
		}
		//控件可以改变布局数据来改变自身大小
		button.setText("Hello ButtonAAAAAAAAAAAAA!");
		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		button.setLayoutData(gridData);
		
//		Text text = new Text(shell);
//		text.setSize(400,100);
	}

}
