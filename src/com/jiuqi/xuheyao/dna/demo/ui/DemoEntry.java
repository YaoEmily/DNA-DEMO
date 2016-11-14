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
		
		//���������������
		Composite compositeOutermost = new Composite(shell);
		compositeOutermost.setBorder(new CBorder(1,1,1));
		compositeOutermost.setSize(500,300);
		//�������񲼾�
		GridLayout gridLayoutOutermost = new GridLayout();
		gridLayoutOutermost.marginBottom = 8;
		gridLayoutOutermost.marginLeft = 8;
		gridLayoutOutermost.marginRight = 8;
		gridLayoutOutermost.marginTop = 8;
		compositeOutermost.setLayout(gridLayoutOutermost);
		
		
		//�������ڲ��ϲ�����
		Composite compositeInsideUp = new Composite(compositeOutermost);
		compositeInsideUp.setBorder(new CBorder(1,1,1));
		compositeInsideUp.setSize(500, 100);
		//�������
		GridData gridDataInsideUp = new GridData(GridData.FILL_HORIZONTAL);
		compositeInsideUp.setLayoutData(gridDataInsideUp);
		
		//���ֿ�
		Text text = new Text(compositeInsideUp);
		text.setSize(500,75);
		text.setText("0");
		text.setEditable(false);
		GridData gridDataText = new GridData(GridData.FILL_BOTH);
		text.setLayoutData(gridDataText);
		
		
		//�������ڲ��²�����
		Composite compositeInsideDown = new Composite(compositeOutermost);
		compositeInsideDown.setBorder(new CBorder(1,1,1));
		compositeInsideDown.setSize(500, 100);
		//�������
		GridData gridDataInsideDown = new GridData(GridData.FILL_BOTH);
		compositeInsideDown.setLayoutData(gridDataInsideDown);
		//�����ڲ�����
		GridLayout gridLayoutInsideDown = new GridLayout(10);
		gridLayoutInsideDown.makeColumnsEqualWidth = true;
		compositeInsideDown.setLayout(gridLayoutInsideDown);
		
		//�ڲ��²�radio����
		Composite compositeRadio = new Composite(compositeInsideDown);
		compositeRadio.setBorder(new CBorder(1,1,1));
		GridData gridDataRadioCom = new GridData(GridData.FILL_HORIZONTAL);
		gridDataRadioCom.horizontalSpan = 5;
		compositeRadio.setLayoutData(gridDataRadioCom);
		GridLayout gridLayoutRadio = new GridLayout(3);
		gridLayoutRadio.makeColumnsEqualWidth = true;
		compositeRadio.setLayout(gridLayoutRadio);
		
		//radio�����е�����radio
		Button radio;
		for(int i = 0; i < 3; i++)
		{
			radio = new Button(compositeRadio, JWT.RADIO);
			radio.setText("radio");
			radio.setLayoutData(new GridData(GridData.FILL_BOTH));
		}
		
		//55����ť
		Button button;
		GridData gridDataButton = new GridData(GridData.FILL_BOTH);
		for(int i = 0; i < 55; i++)
		{
			button = new Button(compositeInsideDown);
			button.setText("CE");
			button.setLayoutData(gridDataButton);
			
		}
	}

}
