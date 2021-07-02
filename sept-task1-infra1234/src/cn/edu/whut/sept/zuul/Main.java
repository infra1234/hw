/**
 * 该类是应用程序的主函数类.
 * Main类将创建实例并初始化所有其他类并将用户输入转换成命令后开始运行游戏.
 *
 * @author  infra
 * @version 2021.7.1
 */
package cn.edu.whut.sept.zuul;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        /**
         * 创建Game类的实例并调用play方法开始游戏.
         */
    }
}
