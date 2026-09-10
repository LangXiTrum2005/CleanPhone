package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class TR {
    public static /* bridge */ /* synthetic */ NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel b(String str, CharSequence charSequence) {
        return new NotificationChannel(str, charSequence, 3);
    }

    public static /* synthetic */ NotificationChannel c(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2, int i) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup e(Object obj) {
        return (NotificationChannelGroup) obj;
    }
}
