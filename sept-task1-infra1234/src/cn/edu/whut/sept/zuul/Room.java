/**
 * ������Ӧ�ó���Ĺ�����.
 * Room�ཫ����ð����Ϸ�����⡰���䡱
 *
 * @author  infra
 * @version 2021.7.1
 */
/**
 * 该类是应用程序的功能类.
 * Room类将创建冒险游戏的虚拟“房间”
 *
 * @author  infra
 * @version 2021.7.1
 */
package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;
    /**
     * 创建房间和hashmap.
     * @param description 是地点的描述，由Game类中的实例决定.
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }
    /**
     * 创建房间的出口
     * @param direction 是出口方位，由Game类的实例决定.
     * @param neighbor 是出口连接的房间名，由Game类的实例决定.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }
    /**
     * @return 返回地点的描述（字符串）
     */
    public String getShortDescription()
    {
        return description;
    }
    /**
     * @return 返回“You are”加上地点的整个描述（字符串）.
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    /**
     * @return 返回房间的出口（字符串）
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    /**
     * @param direction 是用户输入的方位，在Game类实例化.
     * @return 返回房间的出口（字符串）.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


