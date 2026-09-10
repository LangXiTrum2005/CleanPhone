package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        ActivityInfo activityInfo;
        Context applicationContext = this.a.c.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = this.a.c;
        }
        qc0 qc0Var = this.a;
        PackageManager packageManager = qc0Var.c.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        ResolveInfo resolveInfoA = qc0.a(qc0Var, packageManager);
        if (resolveInfoA == null || (activityInfo = resolveInfoA.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode + "." + activityInfo.packageName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
