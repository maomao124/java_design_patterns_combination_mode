package mao;

/**
 * Project name(项目名称)：java设计模式_组合模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 20:41
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        MenuComponent menuComponent = new Menu("系统管理", 1);
        MenuComponent menuComponent1 = new Menu("菜单管理", 2);
        MenuComponent menuComponent2 = new Menu("权限设置", 2);
        MenuComponent menuComponent3 = new Menu("角色管理", 2);

        menuComponent.add(menuComponent1);
        menuComponent.add(menuComponent2);
        menuComponent.add(menuComponent3);

        MenuComponent menuComponent4 = new MenuItem("页面访问", 3);
        MenuComponent menuComponent5 = new MenuItem("展开菜单", 3);
        MenuComponent menuComponent6 = new MenuItem("编辑菜单", 3);
        MenuComponent menuComponent7 = new MenuItem("删除菜单", 3);
        MenuComponent menuComponent8 = new MenuItem("新增菜单", 3);

        menuComponent1.add(menuComponent4);
        menuComponent1.add(menuComponent5);
        menuComponent1.add(menuComponent6);
        menuComponent1.add(menuComponent7);
        menuComponent1.add(menuComponent8);

        MenuComponent menuComponent9 = new MenuItem("权限设置", 3);
        MenuComponent menuComponent10 = new MenuItem("新增菜单", 3);

        menuComponent2.add(menuComponent9);
        menuComponent2.add(menuComponent10);

        MenuComponent menuComponent11 = new MenuItem("页面访问", 3);
        MenuComponent menuComponent12 = new MenuItem("新增角色", 3);
        MenuComponent menuComponent13 = new MenuItem("修改角色", 3);

        menuComponent3.add(menuComponent11);
        menuComponent3.add(menuComponent12);
        menuComponent3.add(menuComponent13);




    }
}
