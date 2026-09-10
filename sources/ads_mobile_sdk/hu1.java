package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hu1 {
    public final h1 a;
    public final ur b;
    public final js1 c;
    public final au1 d;
    public final jk0 e;

    public hu1(h1 adConfiguration, ur commonConfiguration, js1 networkConnectivityManager, au1 offlineDatabase, jk0 flags) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        Intrinsics.checkNotNullParameter(offlineDatabase, "offlineDatabase");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = adConfiguration;
        this.b = commonConfiguration;
        this.c = networkConnectivityManager;
        this.d = offlineDatabase;
        this.e = flags;
    }
}
