package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1803jc implements C8A {
    public static byte[] A01;
    public final AnonymousClass85 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, cw.m, 29, 26, 20, cw.m};
    }

    public C1803jc(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A6z() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A7w() {
        return BE.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A7x() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A8L() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A8S() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final AnonymousClass89 A8n() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C1804jd(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A9G() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A9I() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final String A9J() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.C8A
    public final boolean AAD() {
        return BuildConfigApi.isDebug();
    }
}
