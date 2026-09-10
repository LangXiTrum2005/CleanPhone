package igbo;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: PendingIntentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class adultoid {
    public static int attabal(boolean z, int i) {
        int i2;
        if (!z) {
            i2 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = 33554432;
        }
        return i2 | i;
    }

    public static PendingIntent saneness(Context context, int i, Intent intent, int i2, boolean z) {
        return PendingIntent.getActivity(context, i, intent, attabal(z, i2));
    }
}
