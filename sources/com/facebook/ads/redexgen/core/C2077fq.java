package com.facebook.ads.redexgen.core;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2077fq {
    public float A00;
    public EnumC1355Lr A01;
    public Map<String, String> A02;

    public C2077fq(EnumC1355Lr enumC1355Lr) {
        this(enumC1355Lr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public C2077fq(EnumC1355Lr enumC1355Lr, float f) {
        this(enumC1355Lr, f, null);
    }

    public C2077fq(@Nullable EnumC1355Lr enumC1355Lr, float f, Map<String, String> windowParams) {
        this.A01 = enumC1355Lr;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC1355Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC1355Lr.A0I;
    }
}
