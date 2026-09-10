package com.smartdigimkt.p4;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f37609a = -1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37610b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37611c = 1;
    public static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37612e = 3;
    public static final int f = 4;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private q() {
    }

    public static void a(Context context, String str, int i2, int i3) {
        if (f0.f37540a >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            p006i.a.x();
            notificationManager.createNotificationChannel(com.google.common.io.a.b(i3, str, context.getString(i2)));
        }
    }

    public static void a(Context context, int i2, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i2, notification);
        } else {
            notificationManager.cancel(i2);
        }
    }
}
