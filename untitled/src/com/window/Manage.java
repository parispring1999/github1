package com.window;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.Vector;

public class Manage extends JFrame {

    final int WIDTH=800;
    final int HEIGHT=550;
    JMenuBar menubar;
    JMenu menu,menu1;
    JMenuItem item,item1;
    JPanel jpanel_1,jpanel_2;
    JLabel name,number;
    JTextField nametext,numbertext;
    JButton add,del;
    Object columns[]={"姓名","学号"};
    JTable tableL;
    JScrollPane jscrollpane;
    static Vector rwo;
    static DefaultTableModel model;
    static TableColumnModel columnModel;

    public Manage(){
        init();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
    void init(){
        //窗口布局大小位置
        this.setLayout(null);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        this.setBounds(x,y,WIDTH,HEIGHT);
        //菜单栏
        menubar=new JMenuBar();
        menu=new JMenu("管理");
        menu1=new JMenu("账号");
        item=new JMenuItem("更改账号信息");
        item1=new JMenuItem("注销");
        //基本信息处理
        jpanel_1=new javax.swing.JPanel();
        jpanel_1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpanel_1.setBorder(BorderFactory.createTitledBorder("基本信息处理"));
        jpanel_1.setBounds(50,30,WIDTH-100,110);
        //按钮
        name=new JLabel("姓名");
        nametext=new JTextField(25);
        number=new JLabel("学号");
        numbertext=new JTextField(25);
        add=new JButton("增加数据");
        del=new JButton("删除数据");
        //表格
        jpanel_2=new javax.swing.JPanel();
        jpanel_2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jpanel_2.setBounds(50,160,WIDTH-100,300);
        jpanel_2.setBorder(BorderFactory.createTitledBorder("学生信息显示"));
        table();
        //添加
        menu.add(item);
        menu1.add(item1);
        menubar.add(menu);
        menubar.add(menu1);
        jpanel_1.add(name);
        jpanel_1.add(nametext);
        jpanel_1.add(number);
        jpanel_1.add(numbertext);
        jpanel_1.add(add);
        jpanel_1.add(del);
        jpanel_2.add(jscrollpane);
        this.add(jpanel_2);
        this.add(jpanel_1);
        this.add(menubar);
        this.setJMenuBar(menubar);
    }
    void table(){
        tableL=getTable();
        jscrollpane=new JScrollPane(tableL);
        jscrollpane.setPreferredSize(new Dimension(WIDTH-190,250));
        tableL.setPreferredSize(new Dimension(WIDTH-190,1000));
        jscrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }
    JTable getTable() {
        if (tableL == null) {
            tableL = new JTable();
            int[] columnWidth = {150, 150};
            model = new DefaultTableModel() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            model.setColumnIdentifiers(columns);
            tableL.setModel(model);
            columnModel=tableL.getColumnModel();
            tableL.getTableHeader().setReorderingAllowed(false);
            tableL.getTableHeader().setResizingAllowed(false);
            int count = columnModel.getColumnCount();
            for (int i = 0; i < count; i++) {
                javax.swing.table.TableColumn column = columnModel.getColumn(i);
                column.setPreferredWidth(columnWidth[i]);
            }
            rwo = new Vector(6);
        }
        return tableL;
    }
}
