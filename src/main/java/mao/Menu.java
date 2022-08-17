package mao;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_组合模式
 * Package(包名): mao
 * Class(类名): Menu
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 20:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Menu extends MenuComponent
{
    private List<MenuComponent> menuComponentList;

    public Menu(String name, int level)
    {
        this.level = level;
        this.name = name;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent menuComponent)
    {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent)
    {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i)
    {
        return menuComponentList.get(i);
    }

    @Override
    public void print()
    {
        for (int i = 1; i < this.level; i++)
        {
            System.out.print("--");
        }
        System.out.println(this.name);
        for (MenuComponent menuComponent : menuComponentList)
        {
            menuComponent.print();
        }
    }
}
