package com.google.android.exoplayer2.scheduler;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel a(int i2) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i2);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest j(Object obj) {
        return (AudioFocusRequest) obj;
    }
}
