package com.automatic.screen.control;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.URI;

/**
 * @author hwb
 * @version 1.0
 * @date 2021/12/22 0022 14:13
 */
public class Utils {

    public static void browse() throws Exception {
        // 允许java启动windows应用
        Desktop desktop = Desktop.getDesktop();
        // 打开默认设置的浏览器
        desktop.browse(new URI("https://www.baidu.com/"));
        // 实例化Robot,并等待五秒
        Robot robot = new Robot();
        robot.delay(5000);
        // 输入java
        robot.keyPress(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_A);
        // 等待三秒
        robot.delay(3000);
        // 回车敲击和释放
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
