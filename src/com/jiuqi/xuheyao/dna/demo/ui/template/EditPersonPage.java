package com.jiuqi.xuheyao.dna.demo.ui.template;

import com.jiuqi.dna.ui.wt.widgets.Form;
import com.jiuqi.dna.ui.wt.widgets.Composite;
import com.jiuqi.dna.ui.wt.widgets.MessageDialog;
import com.jiuqi.dna.ui.wt.events.ActionEvent;
import com.jiuqi.dna.ui.template.launch.TemplateWindow.CloseMessage;

public class EditPersonPage<TControls extends EditPersonPageControls> extends Form<EditPersonPageControls> {

	public EditPersonPage(Composite parent) {
		super(parent);
	}

	protected void on_btn_cancel_Action(ActionEvent actionEvent) {
		// �رմ��ڣ�������Ϣ
		getContext().bubbleMessage(new CloseMessage());
	}

	protected void on_btn_save_Action(ActionEvent actionEvent) {
		// ��ȡҳ���е���Ϣ
		String name = controls.txt_name.getText();
		if(name.length()>10)
		{
			MessageDialog.alert("�������������Ȳ��������10");
		}
	}

}