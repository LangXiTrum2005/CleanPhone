package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MT implements InterfaceC1842Yi {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final C1662Re A00;
    public final C2300gi A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public MT(C2300gi c2300gi, C1662Re c1662Re) {
        this.A01 = c2300gi;
        this.A00 = c1662Re;
    }

    private final void A02() {
        T5 t5A0G = this.A01.A0G();
        if (t5A0G != null) {
            Ad adA6k = t5A0G.A6k();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (adA6k != null && t5A0G.A6o() != null) {
                t5A0G.A6o().onError(adA6k, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AAu(Intent intent, Bundle bundle, C1662Re c1662Re) {
        ComponentName component = new ComponentName(AbstractC1753Us.A05(AbstractC1753Us.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String strA00 = A00(26, 13, 4);
        intent2.putExtra(strA00, intent.getStringExtra(strA00));
        String strA01 = A00(0, 26, 126);
        intent2.putExtra(strA01, intent.getIntExtra(strA01, -1));
        try {
            this.A01.A0F().AID();
            C1804Wu.A09(c1662Re.A05(), intent2);
        } catch (C1802Ws unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        this.A01.A0F().AHp();
        if (i3 != -1) {
            this.A01.A0F().AHo(i3);
            A02();
            return false;
        }
        C1662Re c1662Re = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        c1662Re.A05().finish();
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
    }
}
