package com.p004ironsource;

import com.p004ironsource.sdk.IronSourceNetwork;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ironsource/yo;", "Lcom/ironsource/xo;", "Lcom/ironsource/zj;", d9.h.p0, "Lcom/ironsource/zo;", "loadParams", "", "a", "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yo implements xo {
    @Override // com.p004ironsource.xo
    public String a() {
        String version = IronSourceNetwork.getVersion();
        Intrinsics.e(version, "getVersion()");
        return version;
    }

    @Override // com.p004ironsource.xo
    public void a(zj adInstance, zo loadParams) throws Exception {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(loadParams, "loadParams");
        IronSourceNetwork.loadAd(adInstance, loadParams.a());
    }
}
