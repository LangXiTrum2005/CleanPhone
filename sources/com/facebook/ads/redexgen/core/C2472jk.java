package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2472jk extends N3 {
    public static byte[] A02;

    @Nullable
    public final C2470ji A00;
    public final VA A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C2472jk(C2300gi c2300gi, N4 n4, C2245fp c2245fp, VA va, C2470ji c2470ji) {
        super(c2300gi, n4, c2245fp);
        this.A01 = va;
        this.A00 = c2470ji;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A02.A0F().A3L();
            AbstractC1584Oa.A02(this.A00.A0a(), AbstractC1820Xm.A00(A01(0, 6, 62)));
            this.A01.ABJ(this.A00.A7O(), map);
            if (C1750Up.A1A(this.A02)) {
                String string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C1796Wl c1796WlA00 = C1796Wl.A00(this.A02);
                String placementType = this.A00.A7O();
                c1796WlA00.A0E(string, placementType);
            }
        }
    }
}
