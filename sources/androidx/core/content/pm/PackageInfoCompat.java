package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfoCompat {

    public static class Api28Impl {
        public static Signature[] a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        public static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        public static Signature[] c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        public static boolean d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        public static boolean e(PackageManager packageManager, String str, byte[] bArr, int i2) {
            return packageManager.hasSigningCertificate(str, bArr, i2);
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.b(packageInfo) : packageInfo.versionCode;
    }
}
