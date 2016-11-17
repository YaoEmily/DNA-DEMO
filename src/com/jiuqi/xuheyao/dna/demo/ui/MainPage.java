package com.jiuqi.xuheyao.dna.demo.ui;

import com.jiuqi.dna.bap.common.constants.BapImages;
import com.jiuqi.dna.ui.components.SearchBar;
import com.jiuqi.dna.ui.custom.pageBar.Pager;
import com.jiuqi.dna.ui.custom.pageBar.Pager.PagerType;
import com.jiuqi.dna.ui.wt.graphics.ImageDescriptor;
import com.jiuqi.dna.ui.wt.grid2.Grid2;
import com.jiuqi.dna.ui.wt.layouts.FillLayout;
import com.jiuqi.dna.ui.wt.layouts.GridData;
import com.jiuqi.dna.ui.wt.layouts.GridLayout;
import com.jiuqi.dna.ui.wt.widgets.Composite;
import com.jiuqi.dna.ui.wt.widgets.Label;
import com.jiuqi.dna.ui.wt.widgets.Page;
import com.jiuqi.dna.ui.wt.widgets.SashForm;
import com.jiuqi.dna.ui.wt.widgets.ToolBar;
import com.jiuqi.dna.ui.wt.widgets.ToolItem;
import com.jiuqi.dna.ui.wt.widgets.Tree;
import com.jiuqi.dna.ui.wt.widgets.TreeItem;

public class MainPage extends Page {

	public MainPage(Composite parent) {
		super(parent);
		this.setLayout(new GridLayout());
		
		//��ҳ���У�����������
		ToolBar toolBar = new ToolBar(this);
		toolBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		ToolItem addItem = new ToolItem(toolBar);
		addItem.setText("����");
		ImageDescriptor createImage = getContext().find(ImageDescriptor.class, BapImages.ico_create);
		addItem.setImage(createImage);
		
		ToolItem updateItem = new ToolItem(toolBar);
		updateItem.setText("�޸�");
		ToolItem deleteItem = new ToolItem(toolBar);
		deleteItem.setText("ɾ��");
		ToolItem upItem = new ToolItem(toolBar);
		upItem.setText("����");
		ToolItem downItem = new ToolItem(toolBar);
		downItem.setText("����");
		ToolItem closeItem = new ToolItem(toolBar);
		closeItem.setText("�ر�");
		
		SashForm sashForm = new SashForm(this);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		sashForm.setWeights("1:3");
		
		//��sashform��������з������οؼ�
		Composite firstComposite = sashForm.getFirstComposite();
		//ȫ����ģʽ
		firstComposite.setLayout(new FillLayout());
		
		Tree tree = new Tree(firstComposite);
		TreeItem itemRoot = new TreeItem(tree);
		itemRoot.setText("�������");
		
		TreeItem itemBeijing = new TreeItem(itemRoot);
		itemBeijing.setText("��������");
		TreeItem itemShanghai = new TreeItem(itemRoot);
		itemShanghai.setText("�Ϻ�����");
		TreeItem itemGuangzhou = new TreeItem(itemRoot);
		itemGuangzhou.setText("���ݾ���");
		TreeItem itemHefei = new TreeItem(itemRoot);
		itemHefei.setText("�Ϸʾ���");
		TreeItem itemZhengzhou = new TreeItem(itemRoot);
		itemZhengzhou.setText("֣�ݾ���");
		TreeItem itemShijiazhuang = new TreeItem(itemRoot);
		itemShijiazhuang.setText("ʯ��ׯ����");
		TreeItem itemShenyang = new TreeItem(itemRoot);
		itemShenyang.setText("��������");
		TreeItem itemNingxia = new TreeItem(itemRoot);
		itemNingxia.setText("���ľ���");
		
		Composite secondComposite = sashForm.getSecondComposite();
		secondComposite.setLayout(new GridLayout());
		//��ѯ�ؼ�����
		Composite comSearch = new Composite(secondComposite);
		comSearch.setLayout(new GridLayout(2));
		new Label(comSearch).setText("Ա������");
		new SearchBar(comSearch, "������ؼ���"){

			@Override
			protected void searchTextChanged(String arg0) {
				// TODO searchbar�Ĵ����߼�
				
			}
			
		};
		
		//����ؼ�����
		Composite comGrid = new Composite(secondComposite);
		comGrid.setLayoutData(new GridData(GridData.FILL_BOTH));
		comGrid.setLayout(new FillLayout());
		Grid2 grid2 = new Grid2(comGrid);
		
		//��ҳ�ؼ�����
		Composite comPage = new Composite(secondComposite);
		comPage.setLayout(new FillLayout());
		new Pager(comPage, PagerType.DEFAULT);
		
	}
}
