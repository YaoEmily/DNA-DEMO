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

	//不可调用该构造方法.当前类只能由框架实例化.
	private TB_DemoDeptInfo() {
		super(TABLE_NAME);
		this.table.setTitle("部门信息表");
		TableFieldDeclare field;
		this.f_deptName = field = this.table.newField(FN_deptName, TypeFactory.NVARCHAR(20));
		field.setTitle("部门名称");
		this.f_deptDate = field = this.table.newField(FN_deptDate, TypeFactory.DATE);
		field.setTitle("创建日期");
		this.f_deptPreCID = field = this.table.newField(FN_deptPreCID, TypeFactory.GUID);
		field.setTitle("上级部门");
		this.f_deptDesc = field = this.table.newField(FN_deptDesc, TypeFactory.NTEXT);
		field.setTitle("备注");
	}

}
