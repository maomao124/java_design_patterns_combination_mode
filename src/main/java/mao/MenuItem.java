package mao;

/**
 * Project name(项目名称)：java设计模式_组合模式
 * Package(包名): mao
 * Class(类名): MenuItem
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/17
 * Time(创建时间)： 20:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MenuItem extends MenuComponent
{
    public MenuItem(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print()
    {
        for (int i = 1; i < this.level; i++)
        {
            System.out.print("--");
        }
        System.out.println(this.name);
    }
}
