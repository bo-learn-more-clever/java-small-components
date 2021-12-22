package com.automatic.screen.control;

/**
 * @author hwb
 * @version 1.0
 * @date 2021/12/22 0022 14:13
 */
public class StartApplication {

    public static void main(String[] args) {
        try {
            Utils.browse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
