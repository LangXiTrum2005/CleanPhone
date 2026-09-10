package com.facebook.ads.redexgen.core;

import android.view.View;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1967mL implements C2B {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C0897Mt A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{90, 93, 91, cw.m, 10, cw.l, cw.k, 10, 32, 3, 12, 12, 7, cw.n, 66, 11, cw.m, 18, cw.n, 7, 17, 17, 11, cw.k, 12, 66, 4, 11, cw.n, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, 63, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C1967mL(C0897Mt c0897Mt, Runnable runnable) {
        this.A00 = c0897Mt;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.C2B
    public final void ACU(InterfaceC2016n9 interfaceC2016n9) {
        this.A00.A02.A0F().A4Q();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.C2B
    public final void ACV(InterfaceC2016n9 interfaceC2016n9, View view) {
        this.A00.A02.A0F().A4P(interfaceC2016n9 == ((AbstractC1964mI) this.A00).A00);
        if (interfaceC2016n9 != ((AbstractC1964mI) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        AnonymousClass23 anonymousClass23 = ((AbstractC1964mI) this.A00).A01;
        C0897Mt c0897Mt = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1964mI) c0897Mt).A01 = interfaceC2016n9;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC2016n9);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(anonymousClass23);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C2B
    public final void ACW(InterfaceC2016n9 interfaceC2016n9) {
        AbstractC0606Au.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0F().A4S();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.C2B
    public final void ADc(InterfaceC2016n9 interfaceC2016n9, C0597Ag c0597Ag) {
        this.A00.A02.A0F().A4R(interfaceC2016n9 == ((AbstractC1964mI) this.A00).A00, c0597Ag.A03().getErrorCode());
        if (interfaceC2016n9 != ((AbstractC1964mI) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC2016n9);
        this.A00.AD4(c0597Ag);
    }
}
