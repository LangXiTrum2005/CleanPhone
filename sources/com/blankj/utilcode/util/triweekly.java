package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: NotificationUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class triweekly {

    /* JADX INFO: compiled from: NotificationUtils.java */
    public static class attabal {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f17497saneness = new attabal(adultoid.attabal().getPackageName(), adultoid.attabal().getPackageName(), 3);

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public NotificationChannel f17498attabal;

        public attabal(String str, CharSequence charSequence, int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f17498attabal = monoploid.beachfront.attabal(str, charSequence, i);
            }
        }

        public NotificationChannel saneness() {
            return this.f17498attabal;
        }
    }

    public static Notification attabal(attabal attabalVar, adultoid.saneness<NotificationCompat.impassible> sanenessVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ((NotificationManager) adultoid.attabal().getSystemService("notification")).createNotificationChannel(attabalVar.saneness());
        }
        NotificationCompat.impassible impassibleVar = new NotificationCompat.impassible(adultoid.attabal());
        if (i >= 26) {
            impassibleVar.competently(attabalVar.f17498attabal.getId());
        }
        if (sanenessVar != null) {
            sanenessVar.accept(impassibleVar);
        }
        return impassibleVar.saneness();
    }
}
