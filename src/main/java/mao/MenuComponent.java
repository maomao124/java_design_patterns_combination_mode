package mao;

/**
 * Project name(项目名称)：java设计模式_组合模式
 * Package(包名): mao
 * Class(类名): MenuComponent
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 20:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public abstract class MenuComponent
{
    //菜单或者菜单项的名字
    protected String name;
    //菜单级别
    protected int level;

    /**
     * 添加菜单，子类可以重写方法
     *
     * @param menuComponent MenuComponent对象，传入的是子实现类，菜单或者菜单项
     */
    public void add(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单
     *
     * @param menuComponent MenuComponent对象
     */
    public void remove(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     *
     * @param i 子菜单的索引
     * @return MenuComponent对象
     */
    public MenuComponent getChild(int i)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取菜单的名称
     *
     * @return 菜单的名称
     */
    public String getName()
    {
        return name;
    }

    /**
     * 打印菜单
     */
    public void print()
    {
        throw new UnsupportedOperationException();
    }

}

