package com.example.luoheng.demo;

import android.os.Process;

public class Utils {

    public static String printPTID() {
        return "pid " + Process.myPid() + ", tid " + Process.myTid() + ",uid " + Process.myUid() +
                ",thread Id " + Thread.currentThread().getId();
    }
}
