package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ks1 extends ox0 {
    public final js1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(js1 networkConnectivityManager) {
        super(no0.CUI_NAME_NETWORK_CONNECTIVITY_MANAGER_STATE, 2);
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        this.c = networkConnectivityManager;
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return this.c.b(dernVar);
    }
}
