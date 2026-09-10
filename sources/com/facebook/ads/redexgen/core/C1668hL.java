package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1668hL implements DS {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final C04946e A00;
    public final C1828k1 A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public C1668hL(C1828k1 c1828k1, C04946e c04946e) {
        this.A01 = c1828k1;
        this.A00 = c04946e;
    }

    private final void A02() {
        AnonymousClass81 anonymousClass81A0G = this.A01.A0G();
        if (anonymousClass81A0G != null) {
            Ad adA6a = anonymousClass81A0G.A6a();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (adA6a != null && anonymousClass81A0G.A6e() != null) {
                anonymousClass81A0G.A6e().onError(adA6a, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AAj(Intent intent, Bundle bundle, C04946e c04946e) {
        ComponentName component = new ComponentName(AbstractC05819p.A04(AbstractC05819p.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String strA00 = A00(26, 13, 4);
        intent2.putExtra(strA00, intent.getStringExtra(strA00));
        String strA01 = A00(0, 26, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        intent2.putExtra(strA01, intent.getIntExtra(strA01, -1));
        try {
            this.A01.A0F().AHJ();
            C0620Bq.A09(c04946e.A05(), intent2);
        } catch (C0618Bo unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AI1(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.A01.A0F().AGw();
        if (i2 != -1) {
            this.A01.A0F().AGv(i2);
            A02();
            return false;
        }
        C04946e c04946e = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        c04946e.A05().finish();
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
    }
}
