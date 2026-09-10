package umbriferous;

import android.content.Context;

/* JADX INFO: compiled from: InstallerPackageNameProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class restrictive {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f39191attabal;

    public static String saneness(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String attabal(Context context) {
        try {
            if (this.f39191attabal == null) {
                this.f39191attabal = saneness(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(this.f39191attabal) ? null : this.f39191attabal;
    }
}
