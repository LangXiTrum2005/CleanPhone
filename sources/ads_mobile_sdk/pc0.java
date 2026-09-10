package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class pc0 extends Lambda implements Function0 {
    public final /* synthetic */ qc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(qc0 qc0Var) {
        super(0);
        this.a = qc0Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        try {
            Context applicationContext = this.a.c.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = this.a.c;
            }
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo("com.android.vending", 128);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionCode + "." + packageInfo.packageName;
        } catch (Exception unused) {
            return null;
        }
    }
}
