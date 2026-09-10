package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Notification;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface KB extends IInterface {
    public static final String k1 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
