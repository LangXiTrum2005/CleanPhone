package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q7 {
    public final String a() {
        String OMID_LIB_VERSION = Gc.f26169f;
        kotlin.jvm.internal.n.e(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    public final String b() {
        return Gc.f26168e;
    }

    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        kotlin.jvm.internal.n.e(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
