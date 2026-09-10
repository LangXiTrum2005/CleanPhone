package monoploid;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: NotificationApiHelperForO.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {
    public static Notification attabal(Context context, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(beachfront.attabal(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    public static boolean saneness(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}
