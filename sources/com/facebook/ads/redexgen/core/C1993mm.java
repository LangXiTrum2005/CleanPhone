package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1993mm extends AnonymousClass25 {
    public static byte[] A06;
    public static final String A07;
    public C1995mo A00;
    public EnumC0599Aj A01;
    public boolean A02;
    public final C1828k1 A03;
    public final A7 A04;
    public final F1 A05;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1993mm.class.getSimpleName();
    }

    public C1993mm(C1828k1 c1828k1, A7 a7, F1 f1, JL jl, AnonymousClass26 anonymousClass26, EnumC0599Aj enumC0599Aj) {
        super(c1828k1, anonymousClass26, jl);
        this.A04 = a7;
        this.A05 = f1;
        this.A03 = c1828k1;
        this.A01 = enumC0599Aj;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass25
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7E())) {
            this.A03.A0F().A3B();
            AbstractC04153a.A02(this.A00.A05(), AbstractC0630Ce.A00(A04(0, 6, 50)));
            this.A04.AB0(this.A00.A7E(), map);
            if (C05789m.A18(this.A03)) {
                if (this.A01 == EnumC0599Aj.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C0614Bh c0614BhA00 = C0614Bh.A00(this.A03);
                String placementType = this.A00.A7E();
                c0614BhA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC0649Cx.A00(new C1994mn(this));
            }
        }
    }

    public final void A0A(C1995mo c1995mo) {
        this.A00 = c1995mo;
    }
}
