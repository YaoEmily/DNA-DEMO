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

	//简单任务处理器
	@Publish
	protected class CreateDeptSimpleTaskHandler extends SimpleTaskMethodHandler<CreateDeptSimpleTask>
	{

		@Override
		protected void handle(Context arg0, CreateDeptSimpleTask simpleTask)
				throws Throwable {
			// TODO 任务处理
			System.out.println(simpleTask.name);
		}
		
	}
}
