package com.jiuqi.xuheyao.dna.demo.storage;

import com.jiuqi.dna.core.def.table.TableDeclarator;
import com.jiuqi.dna.core.type.TypeFactory;
import com.jiuqi.dna.core.def.table.TableFieldDefine;
import com.jiuqi.dna.core.def.table.TableFieldDeclare;

public final class TB_DemoDeptInfo extends TableDeclarator {

	public static final String TABLE_NAME ="DemoDeptInfo";

	public final TableFieldDefine f_deptName;
	public final TableFieldDefine f_deptDate;
	public final TableFieldDefine f_deptPreCID;
	public final TableFieldDefine f_deptDesc;

	public static final String FN_deptName ="deptName";
	public static final String FN_deptDate ="deptDate";
	public static final String FN_deptPreCID ="deptPreCID";
	public static final String FN_deptDesc ="deptDesc";

	//���ɵ��øù��췽��.��ǰ��ֻ���ɿ��ʵ����.
	private TB_DemoDeptInfo() {
		super(TABLE_NAME);
		this.table.setTitle("������Ϣ��");
		TableFieldDeclare field;
		this.f_deptName = field = this.table.newField(FN_deptName, TypeFactory.NVARCHAR(20));
		field.setTitle("��������");
		this.f_deptDate = field = this.table.newField(FN_deptDate, TypeFactory.DATE);
		field.setTitle("��������");
		this.f_deptPreCID = field = this.table.newField(FN_deptPreCID, TypeFactory.GUID);
		field.setTitle("�ϼ�����");
		this.f_deptDesc = field = this.table.newField(FN_deptDesc, TypeFactory.NTEXT);
		field.setTitle("��ע");
	}

}
