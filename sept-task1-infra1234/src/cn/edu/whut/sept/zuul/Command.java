/**
 * 该类是应用程序的功能类.
 * Command类的实例将已拆分的可用指令分部分输出.
 *
 * @author  infra
 * @version 2021.7.1
 */
package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;
    
    /**
     * 初始化字符串类型
     * @param firstWord 是由CommandWords类的实例返回的命令前一部分.
     * @param secondWord 是由CommandWords类的实例返回的命令后一部分.
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }
    /**
     * @return 返回命令的前一部分
     */
    public String getCommandWord()
    {
        return commandWord;
    }
    /**
     * @return 返回命令的后一部分
     */
    public String getSecondWord()
    {
        return secondWord;
    }
    /**
     * @return 当命令前一部分为null（由CommandWords类决定）时返回投入true，否则返回false.
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }
    /**
     * @return 当命令有后一部分时返回true，否则返回false.
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
