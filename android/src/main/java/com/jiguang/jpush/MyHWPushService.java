package com.jiguang.jpush;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

import cn.jpush.android.service.PluginHuaweiPlatformsService;

public class MyHWPushService extends HmsMessageService {

    final PluginHuaweiPlatformsService service = new PluginHuaweiPlatformsService();

    @Override
    public void onNewToken(String s) {
        Log.d("[MyHWPushService]","onNewToken"+s);
        service.onNewToken(s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("[MyHWPushService]","onMessageReceived"+remoteMessage.getData());
        service.onMessageReceived(remoteMessage);
    }

    @Override
    public void onMessageSent(String s) {
        Log.d("[MyHWPushService]","onMessageSent"+s);
        service.onMessageSent(s);
    }

    @Override
    public void onSendError(String s, Exception e) {
        Log.d("[MyHWPushService]","onSendError"+s);
        service.onSendError(s,e);
    }

    @Override
    public void onDeletedMessages() {
        Log.d("[MyHWPushService]","onDeletedMessages");
        service.onDeletedMessages();
    }
}