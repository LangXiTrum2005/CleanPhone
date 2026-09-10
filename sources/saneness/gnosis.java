package saneness;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class gnosis {
    public static boolean attabal() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
