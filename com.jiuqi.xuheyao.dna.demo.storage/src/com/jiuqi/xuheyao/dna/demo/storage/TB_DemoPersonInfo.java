package com.jiuqi.xuheyao.dna.demo.storage;

import com.jiuqi.dna.core.def.table.TableDeclarator;
import com.jiuqi.dna.core.type.TypeFactory;
import com.jiuqi.dna.core.def.table.TableFieldDefine;

public final class TB_DemoPersonInfo extends TableDeclarator {

	public static final String TABLE_NAME ="DemoPersonInfo";

	public final TableFieldDefine f_personName;
	public final TableFieldDefine f_personAge;
	public final TableFieldDefine f_personSex;
	public final TableFieldDefine f_personDate;
	public final TableFieldDefine f_personDept;
	public final TableFieldDefine f_personDesc;

	public static final String FN_personName ="personName";
	public static final String FN_personAge ="personAge";
	public static final String FN_personSex ="personSex";
	public static final String FN_personDate ="personDate";
	public static final String FN_personDept ="personDept";
	public static final String FN_personDesc ="personDesc";

	//不可调用该构造方法.当前类只能由框架实例化.
	private TB_DemoPersonInfo() {
		super(TABLE_NAME);
		this.f_personName = this.table.newField(FN_personName, TypeFactory.NVARCHAR(20));
		this.f_personAge = this.table.newField(FN_personAge, TypeFactory.INT);
		this.f_personSex = this.table.newField(FN_personSex, TypeFactory.VARCHAR(4));
		this.f_personDate = this.table.newField(FN_personDate, TypeFactory.DATE);
		this.f_personDept = this.table.newField(FN_personDept, TypeFactory.GUID);
		this.f_personDesc = this.table.newField(FN_personDesc, TypeFactory.TEXT);
	}

}
