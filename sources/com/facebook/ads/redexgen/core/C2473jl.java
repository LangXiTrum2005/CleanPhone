package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2473jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C2475jn A00;
    public EnumC1774Vp A01;
    public boolean A02;
    public final C2300gi A03;
    public final VA A04;
    public final AbstractC1946ay A05;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2473jl.class.getSimpleName();
    }

    public C2473jl(C2300gi c2300gi, VA va, AbstractC1946ay abstractC1946ay, C2245fp c2245fp, N4 n4, EnumC1774Vp enumC1774Vp) {
        super(c2300gi, n4, c2245fp);
        this.A04 = va;
        this.A05 = abstractC1946ay;
        this.A03 = c2300gi;
        this.A01 = enumC1774Vp;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC1584Oa.A02(this.A00.A05(), AbstractC1820Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C1750Up.A1A(this.A03)) {
                if (this.A01 == EnumC1774Vp.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C1796Wl c1796WlA00 = C1796Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                c1796WlA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C2474jm(this));
            }
        }
    }

    public final void A0A(C2475jn c2475jn) {
        this.A00 = c2475jn;
    }
}
