package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class wv implements coi {
    public final coffeecake a;

    public wv(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // saneness.adultoid
    public final Object get() {
        PackageInfo packageInfo;
        Context context = (Context) this.a.get();
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        return Integer.valueOf((packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 128)) == null) ? 0 : packageInfo.versionCode);
    }
}
