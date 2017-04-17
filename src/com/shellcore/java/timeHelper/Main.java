package com.shellcore.java.timeHelper;

import com.shellcore.java.timeHelper.utils.TimeHelper;

/**
 * Created by Cesar. 17/04/2017.
 */
public class Main {

    public static void main(String[] args) {
        TimeHelper th = new TimeHelper(3700);
        System.out.println(th.inMinutes());
        System.out.println(th.inHours());
        System.out.println(th.toString());

        TimeHelper th2 = new TimeHelper(7320);
        System.out.println(th2.inMinutes());
        System.out.println(th2.inHours());
        System.out.println(th2.toString());
    }
}
