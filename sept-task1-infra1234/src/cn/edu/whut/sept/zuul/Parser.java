/**
 * This class is part of the "World of Zuul" application.
 * 
 * Parser类读取用户的输入并将其作为该文字游戏内的行动。
 * 从终端读取一行输入，并分解为2个单词作为执行指令。
 * Parser类有一些预设指令，如果用户发出的指令是系统未知的，那么它不会被执行。
 * @author ???
 * @version 2021.7.1
 */
package cn.edu.whut.sept.zuul;

import java.util.Scanner;


public class Parser
{
    private CommandWords commands;  // holds all valid command words
    private Scanner reader;         // source of command input

    /**
     * 构造函数创建指令类和输入流.
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * 将输入的一行字符串拆解为2个单词并识别.
     * @return 格式正确则返回2个单词组成的command，错误则将command首参数设为null
     */
    public Command getCommand()
    {
        String inputLine;   // will hold the full input line
        String word1 = null;
        String word2 = null;

        System.out.print("> ");     // print prompt

        inputLine = reader.nextLine();

        // Find up to two words on the line.
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();      // get first word
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();      // get second word
                // note: we just ignore the rest of the input line.
            }
        }

        // Now check whether this word is known. If so, create a command
        // with it. If not, create a "null" command (for unknown command).
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
     * 在控制台输出可用的指令.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}

