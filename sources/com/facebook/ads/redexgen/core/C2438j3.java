package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2438j3 implements N9 {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C11747k A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, 14, 83, 89, 91, 92, 92, 32, 3, 12, 12, 7, 16, 66, 11, 15, 18, 16, 7, 17, 17, 11, 13, 12, 66, 4, 11, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, 63, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C2438j3(C11747k c11747k, Runnable runnable) {
        this.A00 = c11747k;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADC(InterfaceC2496k8 interfaceC2496k8) {
        this.A00.A02.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADD(InterfaceC2496k8 interfaceC2496k8, View view) {
        this.A00.A02.A0F().A4Z(interfaceC2496k8 == ((AbstractC2435j0) this.A00).A00);
        if (interfaceC2496k8 != ((AbstractC2435j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        N1 n1 = ((AbstractC2435j0) this.A00).A01;
        C11747k c11747k = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC2435j0) c11747k).A01 = interfaceC2496k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC2496k8);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(n1);
        }
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void ADE(InterfaceC2496k8 interfaceC2496k8) {
        AbstractC1783Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.N9
    public final void AEN(InterfaceC2496k8 interfaceC2496k8, C1772Vm c1772Vm) {
        this.A00.A02.A0F().A4b(interfaceC2496k8 == ((AbstractC2435j0) this.A00).A00, c1772Vm.A03().getErrorCode());
        if (interfaceC2496k8 != ((AbstractC2435j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC2496k8);
        this.A00.ADp(c1772Vm);
    }
}
