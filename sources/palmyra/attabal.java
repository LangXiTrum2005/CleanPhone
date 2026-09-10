package palmyra;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: compiled from: PackageInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: palmyra.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PackageInfoCompat.java */
    public static class C0765attabal {
        public static long attabal(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long attabal(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0765attabal.attabal(packageInfo) : packageInfo.versionCode;
    }
}
