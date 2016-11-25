package com.jiuqi.xuheyao.dna.demo.ui;

import com.jiuqi.dna.bap.common.constants.BapImages;
import com.jiuqi.dna.core.situation.MessageListener;
import com.jiuqi.dna.core.situation.MessageTransmitter;
import com.jiuqi.dna.core.situation.Situation;
import com.jiuqi.dna.ui.common.constants.JWT;
import com.jiuqi.dna.ui.components.SearchBar;
import com.jiuqi.dna.ui.custom.pageBar.Pager;
import com.jiuqi.dna.ui.custom.pageBar.Pager.PagerType;
import com.jiuqi.dna.ui.template.launch.TemplateLauncher;
import com.jiuqi.dna.ui.template.launch.TemplateWindow;
import com.jiuqi.dna.ui.wt.events.ActionEvent;
import com.jiuqi.dna.ui.wt.events.ActionListener;
import com.jiuqi.dna.ui.wt.graphics.ImageDescriptor;
import com.jiuqi.dna.ui.wt.grid2.Grid2;
import com.jiuqi.dna.ui.wt.grid2.GridCell;
import com.jiuqi.dna.ui.wt.grid2.GridModel;
import com.jiuqi.dna.ui.wt.layouts.FillLayout;
import com.jiuqi.dna.ui.wt.layouts.GridData;
import com.jiuqi.dna.ui.wt.layouts.GridLayout;
import com.jiuqi.dna.ui.wt.widgets.Composite;
import com.jiuqi.dna.ui.wt.widgets.Label;
import com.jiuqi.dna.ui.wt.widgets.Menu;
import com.jiuqi.dna.ui.wt.widgets.MenuItem;
import com.jiuqi.dna.ui.wt.widgets.Page;
import com.jiuqi.dna.ui.wt.widgets.SashForm;
import com.jiuqi.dna.ui.wt.widgets.ScrolledPanel;
import com.jiuqi.dna.ui.wt.widgets.ToolBar;
import com.jiuqi.dna.ui.wt.widgets.ToolItem;
import com.jiuqi.dna.ui.wt.widgets.Tree;
import com.jiuqi.dna.ui.wt.widgets.TreeItem;
import com.jiuqi.xuheyao.dna.demo.ui.template.PersonInfoEditMsg;
import com.jiuqi.xuheyao.dna.demo.ui.template.PersonInfoFinishMsg;

public class MainPage extends Page {

	private Tree tree;
	private ImageDescriptor createImage;
	private Grid2 grid2;
	private GridModel gridModel;
	
	public MainPage(Composite parent) {
		super(parent);
		initListener();
		this.setLayout(new GridLayout());
		
		//��ҳ���У�����������
		ToolBar toolBar = new ToolBar(this,JWT.RIGHT);
		toolBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		ToolItem createItem = new ToolItem(toolBar,JWT.DROP_DOWN);
		createItem.setText("����");
		createImage = getContext().find(ImageDescriptor.class, BapImages.ico_create);
		createItem.setImage(createImage);
		
		Menu menu = new Menu(toolBar);
		MenuItem editDept = new MenuItem(menu);
		editDept.setText("��������");
		MenuItem editPerson = new MenuItem(menu);
		editPerson.setText("������Ա");
		createItem.setMenu(menu);
		
		//���ӵ���¼�
		editDept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				DeptInfoEdit deptInfoEdit = new DeptInfoEdit();
				deptInfoEdit.mainPage = MainPage.this;
				deptInfoEdit.name = "��������";
				TemplateWindow tw = TemplateLauncher.openTemplateWindow(MainPage.this, "editDeptPage", JWT.CLOSE|JWT.MODAL|JWT.CANCEL, JWT.CANCEL|JWT.OK, deptInfoEdit);
				tw.setTitle("����������Ϣ");
				tw.setSize(400, 300);
				tw.setIcon(createImage);
			}
		});
		
		editPerson.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				TemplateWindow tw = TemplateLauncher.openTemplateWindow(MainPage.this, "editPersonPage", JWT.CLOSE|JWT.MODAL|JWT.CANCEL|JWT.MAXIMUM, JWT.NONE);
				tw.setTitle("������Ա��Ϣ");
				tw.setSize(500, 300);
				tw.setIcon(createImage);
				
				//��ҳ�淢��һ����Ϣ
				PersonInfoEditMsg msg = new PersonInfoEditMsg();
				msg.name = "С��";
				msg.age = 18;
				//�㲥����ð��
				getContext().broadcastMessage(msg, 1);
			}
			
		});
		
		ToolItem updateItem = new ToolItem(toolBar);
		updateItem.setText("�޸�");
		ImageDescriptor updateImage = getContext().find(ImageDescriptor.class, BapImages.ico_modify_img);
		updateItem.setImage(updateImage);
		
		ToolItem deleteItem = new ToolItem(toolBar);
		deleteItem.setText("ɾ��");
		ImageDescriptor deleteImage = getContext().find(ImageDescriptor.class, BapImages.ico_delete);
		deleteItem.setImage(deleteImage);
		
		ToolItem upItem = new ToolItem(toolBar);
		upItem.setText("����");
		ImageDescriptor upImage = getContext().find(ImageDescriptor.class, BapImages.ico_moveup);
		upItem.setImage(upImage);
		
		ToolItem downItem = new ToolItem(toolBar);
		downItem.setText("����");
		ImageDescriptor downImage = getContext().find(ImageDescriptor.class, BapImages.ico_movedown);
		downItem.setImage(downImage);
		
		ToolItem closeItem = new ToolItem(toolBar);
		closeItem.setText("�ر�");
		ImageDescriptor closeImage = getContext().find(ImageDescriptor.class, BapImages.ico_close_window);
		closeItem.setImage(closeImage);
		
		SashForm sashForm = new SashForm(this);
		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
		sashForm.setWeights("1:3");
		
		//��sashform��������з������οؼ�
		Composite firstComposite = sashForm.getFirstComposite();
		//ȫ����ģʽ
		firstComposite.setLayout(new FillLayout());
		
		tree = new Tree(firstComposite);
		TreeItem itemRoot = new TreeItem(tree);
		itemRoot.setText("��������");
		
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
		//Composite comSearch = new Composite(secondComposite);
		ScrolledPanel scrolledPanel = new ScrolledPanel(secondComposite);
		Composite comSearch = scrolledPanel.getComposite();
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
		grid2 = new Grid2(comGrid);
		gridModel = grid2.getModel();
		gridModel.setColumnCount(8);
		gridModel.setRowCount(11);
		GridCell gridCell00 = gridModel.getGridCell(0, 0);
		gridCell00.setShowText("���");
		GridCell gridCell10 = gridModel.getGridCell(1, 0);
		gridCell10.setShowText("��ѡ");
		GridCell gridCell20 = gridModel.getGridCell(2, 0);
		gridCell20.setShowText("����");
		GridCell gridCell30 = gridModel.getGridCell(3, 0);
		gridCell30.setShowText("�Ա�");
		GridCell gridCell40 = gridModel.getGridCell(4, 0);
		gridCell40.setShowText("��������");
		GridCell gridCell50 = gridModel.getGridCell(5, 0);
		gridCell50.setShowText("����");
		GridCell gridCell60 = gridModel.getGridCell(6, 0);
		gridCell60.setShowText("��������");
		GridCell gridCell70 = gridModel.getGridCell(7, 0);
		gridCell70.setShowText("��ע");
		
		//��ҳ�ؼ�����
		Composite comPage = new Composite(secondComposite);
		comPage.setLayout(new FillLayout());
		new Pager(comPage, PagerType.DEFAULT);
		
	}
	
	//��ʼ��������
	private void initListener() {
		getContext().regMessageListener(PersonInfoFinishMsg.class, new MessageListener<PersonInfoFinishMsg>() {

			@Override
			public void onMessage(Situation context,
					PersonInfoFinishMsg message,
					MessageTransmitter<PersonInfoFinishMsg> transmitter) {
				
				gridModel.getGridCell(2, 1).setShowText(message.name);
			}
		});
	}

	public void AddTreeItem(DeptInfo deptInfo)
	{
		TreeItem item = new TreeItem(tree);
		item.setText(deptInfo.getDeptName());
	}
}