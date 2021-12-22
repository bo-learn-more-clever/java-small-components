package com.screen.capture;

/**
 * @author hwb
 * @version 1.0
 * @date 2021/12/22 0022 14:07
 */
public class StartApplication {

    public static void main(String[] args) {
        try {
            Utils.windowScreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
