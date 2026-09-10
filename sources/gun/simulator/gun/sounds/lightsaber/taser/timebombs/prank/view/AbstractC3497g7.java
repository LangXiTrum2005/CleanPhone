package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3497g7 {
    public static /* synthetic */ NotificationChannel i(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest q(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillId r(Object obj) {
        return (AutofillId) obj;
    }
}
