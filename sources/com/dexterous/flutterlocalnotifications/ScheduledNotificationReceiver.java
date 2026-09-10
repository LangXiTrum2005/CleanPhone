package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import b0.l0;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class ScheduledNotificationReceiver extends BroadcastReceiver {
    private static final String TAG = "ScheduledNotifReceiver";

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends fe.a<NotificationDetails> {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(FlutterLocalNotificationsPlugin.NOTIFICATION_DETAILS);
        if (!StringUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            NotificationDetails notificationDetails = (NotificationDetails) FlutterLocalNotificationsPlugin.buildGson().b(stringExtra, new a().f40810b);
            FlutterLocalNotificationsPlugin.showNotification(context, notificationDetails);
            FlutterLocalNotificationsPlugin.scheduleNextNotification(context, notificationDetails);
            return;
        }
        int intExtra = intent.getIntExtra("notification_id", 0);
        Notification notification = Build.VERSION.SDK_INT >= 33 ? (Notification) intent.getParcelableExtra("notification", Notification.class) : (Notification) intent.getParcelableExtra("notification");
        if (notification == null) {
            FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
            Log.e(TAG, "Failed to parse a notification from  Intent. ID: " + intExtra);
            return;
        }
        notification.when = System.currentTimeMillis();
        new l0(context).b(null, intExtra, notification);
        if (intent.getBooleanExtra("repeat", false)) {
            return;
        }
        FlutterLocalNotificationsPlugin.removeNotificationFromCache(context, Integer.valueOf(intExtra));
    }
}
