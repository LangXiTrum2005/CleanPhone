package com.charging.screenshow.battery.animations.themes.notify;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.R;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.utils.ActUtils;
import com.charging.screenshow.battery.animations.themes.utils.ext.AppExt;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p006i.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/notify/FeatureNotifySender;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeatureNotifySender {
    public static void a(MyApp myApp) {
        RemoteViews remoteViews;
        Notification notificationA;
        Intent intentA = ActUtils.a(myApp, MainAct.class);
        intentA.putExtra("key_from", "from_notify");
        ArrayList arrayList = NotificationContentUtil.f13298a;
        Random random = new Random();
        String[][] strArr = NotificationContentUtil.f13299b;
        String[] strArr2 = strArr[random.nextInt(strArr.length)];
        String title = strArr2[0];
        String desc = strArr2[1];
        ArrayList arrayList2 = NotificationContentUtil.f13298a;
        int iIntValue = ((Number) arrayList2.get(new Random().nextInt(arrayList2.size()))).intValue();
        Intrinsics.f(title, "title");
        Intrinsics.f(desc, "desc");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            remoteViews = new RemoteViews(AppExt.a().getPackageName(), R.layout.item_notify_small);
            remoteViews.setTextViewText(R.id.tv_notify_title, title);
            remoteViews.setTextViewText(R.id.tv_notify_desc, desc);
            remoteViews.setImageViewResource(R.id.iv_icon, iIntValue);
        } else {
            remoteViews = new RemoteViews(AppExt.a().getPackageName(), R.layout.item_notify_small);
            remoteViews.setTextViewText(R.id.tv_notify_title, title);
            remoteViews.setTextViewText(R.id.tv_notify_desc, desc);
            remoteViews.setImageViewResource(R.id.iv_icon, iIntValue);
        }
        RemoteViews remoteViews2 = new RemoteViews(AppExt.a().getPackageName(), R.layout.item_notify_big);
        remoteViews2.setTextViewText(R.id.tv_notify_title, title);
        remoteViews2.setTextViewText(R.id.tv_notify_desc, desc);
        remoteViews2.setImageViewResource(R.id.iv_icon, iIntValue);
        PendingIntent activity = PendingIntent.getActivity(myApp, (int) System.currentTimeMillis(), intentA, i2 >= 31 ? 67108864 : 134217728);
        Intrinsics.c(activity);
        ArrayList arrayList3 = NotificationConstant.f13297b;
        int iIntValue2 = ((Number) arrayList3.get(new Random().nextInt(arrayList3.size()))).intValue();
        if (i2 >= 26) {
            a.x();
            NotificationChannel notificationChannelC = a.c(AppExt.a().getPackageName());
            notificationChannelC.setLockscreenVisibility(1);
            notificationChannelC.setGroup("id_notify_alarm");
            Object systemService = AppExt.a().getSystemService("notification");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannelC);
            Notification.Builder builderB = a.b(AppExt.a());
            builderB.setCustomContentView(remoteViews);
            builderB.setCustomBigContentView(remoteViews2);
            notificationA = builderB.setContentTitle(title).setLargeIcon((Bitmap) null).setChannelId("channel_notification_function").setContentIntent(activity).setAutoCancel(true).setContentText(desc).setSmallIcon(R.drawable.ic_notify_trans).build();
        } else {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(AppExt.a(), "channel_notification_function");
            Notification notification = builder.f4215u;
            notification.contentView = remoteViews;
            builder.q = remoteViews2;
            builder.g = activity;
            notification.when = System.currentTimeMillis();
            builder.f4209e = NotificationCompat.Builder.b(title);
            builder.f = NotificationCompat.Builder.b(desc);
            builder.f4211i = 2;
            builder.c(16);
            builder.f4210h = null;
            notification.icon = R.drawable.ic_notify_trans;
            notificationA = builder.a();
        }
        notificationA.flags = 16;
        notificationA.priority = 2;
        Object systemService2 = AppExt.a().getSystemService("notification");
        Intrinsics.d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService2).notify(iIntValue2, notificationA);
    }
}
