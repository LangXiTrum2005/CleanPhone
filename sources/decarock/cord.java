package decarock;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: NotificationUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class cord {
    public static void attabal(Context context, String str, int i, int i2, int i3) {
        if (grimness.f25080attabal >= 26) {
            NotificationManager notificationManager = (NotificationManager) attabal.marial((NotificationManager) context.getSystemService("notification"));
            preprohormone.attabal();
            NotificationChannel notificationChannelAttabal = monoploid.beachfront.attabal(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannelAttabal.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannelAttabal);
        }
    }
}
