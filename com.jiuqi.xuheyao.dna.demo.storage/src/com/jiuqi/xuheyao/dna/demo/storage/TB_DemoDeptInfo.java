package com.jiuqi.xuheyao.dna.demo.storage;

import com.jiuqi.dna.core.def.table.TableDeclarator;
import com.jiuqi.dna.core.type.TypeFactory;
import com.jiuqi.dna.core.def.table.TableFieldDefine;
import com.jiuqi.dna.core.def.table.TableFieldDeclare;

public final class TB_DemoDeptInfo extends TableDeclarator {

	public static final String TABLE_NAME ="DemoDeptInfo";

	public final TableFieldDefine f_DEPTNAME;
	public final TableFieldDefine f_CREATEDATE;
	public final TableFieldDefine f_PRECID;
	public final TableFieldDefine f_DESC;

	public static final String FN_DEPTNAME ="DEPTNAME";
	public static final String FN_CREATEDATE ="CREATEDATE";
	public static final String FN_PRECID ="PRECID";
	public static final String FN_DESC ="DESC";

	//不可调用该构造方法.当前类只能由框架实例化.
	private TB_DemoDeptInfo() {
		super(TABLE_NAME);
		this.table.setTitle("部门信息表");
		TableFieldDeclare field;
		this.f_DEPTNAME = field = this.table.newField(FN_DEPTNAME, TypeFactory.NVARCHAR(20));
		field.setTitle("部门名称");
		this.f_CREATEDATE = field = this.table.newField(FN_CREATEDATE, TypeFactory.DATE);
		field.setTitle("创建日期");
		this.f_PRECID = field = this.table.newField(FN_PRECID, TypeFactory.GUID);
		field.setTitle("上级部门");
		this.f_DESC = field = this.table.newField(FN_DESC, TypeFactory.NTEXT);
		field.setTitle("备注");
	}

}
