/**
 * 该类是应用程序的功能类.
 * CommandWords类将定义可用的命令，并解析用户输入的字符串.
 *
 * @author  infra
 * @version 2021.7.1
 */
package cn.edu.whut.sept.zuul;

public class CommandWords
{
    private static final String[] validCommands = {
            "go", "quit", "help"
    };
    
    /**
     * 构造函数，无实际功能
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }
    
    /**
     * 检测是否是有效命令
     * @param aString 是输入的命令中的前一部分.
     * @return 如果输入符合可用的命令，则返回true，否则false.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }
    /**
     * 在控制台输出已有的有效命令
     */
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
