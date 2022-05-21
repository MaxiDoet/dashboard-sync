package com.maxidoe.dashboard_sync;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationService extends NotificationListenerService {
    @Override
    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        if (sbn.getNotification() != null) {
            Notification notification = sbn.getNotification();
            String text = sbn.getPackageName() + " " + notification.tickerText;

            Log.d(this.getClass().getSimpleName(), "onNotificationPosted: " + text);
        }
    }
}
