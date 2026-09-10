package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2986da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0 f23525a;

    public C2986da(S0 adUnit) {
        Intrinsics.f(adUnit, "adUnit");
        this.f23525a = adUnit;
    }

    public final byte[] a() {
        T tH0 = this.f23525a.h0();
        HashMap mapG = MapsKt.g(new Pair("h-user-agent", Uc.k()));
        HashMap map = tH0.k;
        if (map != null) {
            map.putAll(mapG);
        }
        tH0.f();
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("root", Uc.b(), null);
        RootConfig rootConfig = configA instanceof RootConfig ? (RootConfig) configA : null;
        if (rootConfig != null && rootConfig.getMonetizationDisabled()) {
            throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        }
        if (!tH0.d) {
            throw new K(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), (short) 2141);
        }
        byte[] bytes = tH0.c().getBytes(Charsets.f44691a);
        Intrinsics.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
