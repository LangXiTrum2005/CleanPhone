package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1961mF implements C2E {
    public static byte[] A02;
    public final /* synthetic */ C0895Mr A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{68, 79, 70, 17, 69, 22, 17, 71, 77, 104, 109, 124, 120, 105, 126, 44, 101, 127, 44, 98, 121, 96, 96, 44, 99, 98, 44, 96, 99, 109, 104, 69, 98, 120, 105, 126, 127, 120, 101, 120, 101, 109, 96, 77, 104, 59, 28, 6, 23, 0, 1, 6, 27, 6, 27, 19, 30, 82, 27, 31, 2, 0, 23, 1, 1, 27, 29, 28, 82, 20, 27, 0, 23, 22, 63, 48, 1, 63, 61, 42, 55, 40, 55, 42, 39, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1961mF(C0895Mr c0895Mr, Runnable runnable) {
        this.A00 = c0895Mr;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADR(C2010n3 c2010n3, String str, boolean z) {
        this.A00.A07.A0C();
        boolean z2 = !TextUtils.isEmpty(str);
        if (z && z2) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(C5.A00(str));
                C0620Bq.A0D(this.A00.A0B, intent);
            } catch (C0618Bo e) {
                Throwable cause = e.getCause();
                C0618Bo cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                this.A00.A0B.A08().AAu(A00(74, 11, 100), AbstractC05418a.A04, new C05428b(cause2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADS(C2010n3 c2010n3) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADT(C2010n3 c2010n3) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADU(C2010n3 c2010n3) {
        if (c2010n3 != this.A00.A00) {
            return;
        }
        if (c2010n3 == null) {
            this.A00.A0B.A08().AAu(A00(111, 3, 121), AbstractC05418a.A0X, new C05428b(A00(8, 37, 54)));
            ADV(c2010n3, AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c2010n3;
        this.A00.A0L();
        this.A00.A07.A0F(c2010n3);
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADV(C2010n3 c2010n3, AdError adError) {
        if (c2010n3 != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c2010n3);
        this.A00.A0B.A0F().A5W(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C0597Ag(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADW(C2010n3 c2010n3) {
        AbstractC0606Au.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADX() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADY() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void ADZ() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.C2E
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
