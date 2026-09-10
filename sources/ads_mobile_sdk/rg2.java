package ads_mobile_sdk;

import android.net.Uri;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rg2 {
    public final h1 a;
    public final ur b;
    public final qg2 c;

    public rg2(h1 adConfiguration, ur commonConfiguration, qg2 retryingUrlPinger) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(retryingUrlPinger, "retryingUrlPinger");
        this.a = adConfiguration;
        this.b = commonConfiguration;
        this.c = retryingUrlPinger;
    }

    public static void a(rg2 rg2Var, Uri uri) {
        Boolean bool = Boolean.FALSE;
        rg2Var.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        rg2Var.c.a(uri, rg2Var.a, rg2Var.b, null, bool, null);
    }
}
