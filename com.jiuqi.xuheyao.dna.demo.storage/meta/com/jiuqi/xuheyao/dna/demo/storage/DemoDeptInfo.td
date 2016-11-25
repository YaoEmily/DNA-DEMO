<?xml version="1.0" encoding="UTF-8"?>
<tabledefine storagename="DemoDeptInfo" ID="EE2A502093FFCD88E4606641F644F818" name-db="DemoDeptInfo" category="" title="部门信息表" author="" description="" packagename="com.jiuqi.xuheyao.dna.demo.storage" name="DemoDeptInfo" isneedrebuild="false">
	<fields>
		<field dbtable="DemoDeptInfo" name="deptName" name-db="deptName" type="nvarchar(20)" primary-key="false" keep-valid="false" author="" title="部门名称" description="" ID="0BF33D04ADB7ADF69FFD1A4F6F1E2234"/>
		<field dbtable="DemoDeptInfo" name="deptDate" name-db="deptDate" type="date" primary-key="false" keep-valid="false" author="" title="创建日期" description="" ID="DA21F8059AF5EDC2ACE6EA6338B0CD83"/>
		<field dbtable="DemoDeptInfo" name="deptPreCID" name-db="deptPreCID" type="guid" primary-key="false" keep-valid="false" author="" title="上级部门" description="" ID="67199BBC17C8105353FDFF74A2CF1A36"/>
		<field dbtable="DemoDeptInfo" name="deptDesc" name-db="deptDesc" type="ntext" primary-key="false" keep-valid="false" author="" title="备注" description="" ID="ABF038D001CA4EBB36047357D916F411"/>
	</fields>
	<indexs/>
	<hierarchies/>
	<dbtables>
		<dbtable author="" name="DemoDeptInfo" name-db="DemoDeptInfo" title="" description=""/>
	</dbtables>
	<relations/>
</tabledefine>
