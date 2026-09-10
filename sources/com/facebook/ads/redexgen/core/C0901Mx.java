package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0901Mx extends AbstractC1984md {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{63, 60, 51, 51, 56, 47};
    }

    public C0901Mx(List<C2T> list) {
        super(list);
    }

    public static C0901Mx A02(JSONObject jSONObject, C1828k1 c1828k1) {
        C0901Mx c0901Mx = new C0901Mx(AbstractC1984md.A08(jSONObject, c1828k1, new C1983mc()));
        c0901Mx.A1k(jSONObject);
        c0901Mx.A10(A03(0, 6, 6));
        return c0901Mx;
    }

    @Override // com.facebook.ads.redexgen.core.C2S
    public final int A0X() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.C2S
    public final int A0Y() {
        return 0;
    }
}
