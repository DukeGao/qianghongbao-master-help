package com.codeboy.qianghongbao;

import android.app.Notification;


public interface IStatusBarNotification {

    String getPackageName();

    Notification getNotification();
}
