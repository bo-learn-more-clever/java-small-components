package com.screen.capture;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author hwb
 * @version 1.0
 * @date 2021/12/22 0022 14:07
 */
public class Utils {

    public static void windowScreen() throws Exception {
        // 声明窗体
        JFrame jf = new JFrame("监控窗体");
        // 显示
        jf.setVisible(true);
        // 设置宽高
        jf.setSize(966, 1000);
        // 获取toolkit
        Toolkit tk = Toolkit.getDefaultToolkit();
        // 根据tk获取截取
        Dimension screenSize = tk.getScreenSize();
        // 获取jl对象，并加入到窗体中;第一次屏幕的截取与捕捉
        JLabel jl = new JLabel();
        jf.add(jl);
        // 声明robot
        Robot robot = new Robot();
        // 循环捕捉屏幕
        while (true) {
            Rectangle rectangle = new Rectangle(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
            BufferedImage bf = robot.createScreenCapture(rectangle);
            jl.setIcon(new ImageIcon(bf));

        }

    }
}
