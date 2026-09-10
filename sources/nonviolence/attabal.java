package nonviolence;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnonviolence/attabal;", "", "<init>", "()V", "", "callback", "saneness", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "attabal", "()Landroid/content/pm/PackageInfo;", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f33954attabal = new attabal();

    public static /* synthetic */ String dern(String str, int i, Object obj) throws PackageManager.NameNotFoundException {
        if ((i & 1) != 0) {
            str = null;
        }
        return saneness(str);
    }

    public static final String saneness(String callback) throws Exception {
        try {
            String str = f33954attabal.attabal().packageName;
            Intrinsics.beachfront(str);
            return str;
        } catch (Exception e) {
            if (callback != null) {
                return callback;
            }
            throw e;
        }
    }

    public final PackageInfo attabal() throws PackageManager.NameNotFoundException {
        PackageManager packageManager = kinshasa.attabal.attabal().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        String packageName = kinshasa.attabal.attabal().getPackageName();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
            Intrinsics.beachfront(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
        Intrinsics.beachfront(packageInfo2);
        return packageInfo2;
    }
}
