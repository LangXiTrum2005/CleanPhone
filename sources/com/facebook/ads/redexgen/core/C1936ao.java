package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1936ao implements TD {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public C1936ao(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A86() {
        return WI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C1945ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
