package com.jiuqi.xuheyao.dna.demo.service.internal;

import com.jiuqi.dna.core.Context;
import com.jiuqi.dna.core.service.Publish;
import com.jiuqi.dna.core.service.Service;
import com.jiuqi.xuheyao.dna.demo.service.task.CreateDeptSimpleTask;

public class DeptManagementService extends Service{

	protected DeptManagementService() {
		super("DeptManagementService");

		System.out.println("DeptManagementService start...");
	}

	//����������
	@Publish
	protected class CreateDeptSimpleTaskHandler extends SimpleTaskMethodHandler<CreateDeptSimpleTask>
	{

		@Override
		protected void handle(Context arg0, CreateDeptSimpleTask simpleTask)
				throws Throwable {
			// TODO ������
			System.out.println(simpleTask.name);
		}
		
	}
}
