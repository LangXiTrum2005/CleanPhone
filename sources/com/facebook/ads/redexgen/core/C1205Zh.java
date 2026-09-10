package com.facebook.ads.redexgen.core;

import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1205Zh implements PC {
    public static byte[] A0B;
    public static String[] A0C = {"jdifV9NSKFgBfA6xcTjJSx5M3mBsLS", "7Bo6McMdkVA9mEt", "7M2kCs67bICZmC1", "qEXS6zSKBwG", "g7ygpaxuI", "CO", "a4Ab6jnOeckgnUlTzJxrHjzr1qc1VJkR", "QIAJLi3L177ELmNvbWpUTg2BA3j6dB9W"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final Q5 A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0C;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "j5ANPDpq4yvrn6dumAYzk3L0Hj2UFh8o";
            strArr2[6] = "myAPgYEonp6qT7f5Rpmd70fXQeyiyhdZ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 35);
            i4++;
        }
    }

    public static void A03() {
        A0B = new byte[]{-94, -27, -29, -16, -16, -15, -10, -94, -28, -25, -94, -18, -25, -11, -11, -94, -10, -22, -29, -16, -94, -85, -69, -36, -35, -40, -20, -29, -21, -61, -26, -40, -37, -70, -26, -27, -21, -23, -26, -29, -29, -16, 1, -10, -12, 3, -81, -15, 4, -11, -11, -12, 1, -81, 2, -8, 9, -12, -81, 1, -12, -16, -14, -9, -12, -13, -81, 6, -8, 3, -9, -81, -5, -12, 2, 2, -81, 3, -9, -16, -3, -81, -60, -65, -65, -4, 2, -81, -2, -11, -81, -15, 4, -11, -11, -12, 1, -12, -13, -81, -4, -12, -13, -8, -16, -81, -13, -16, 3, -16, -67, -77, -78, -76, -68, -109, -58, -73, -73, -74, -61, -107, -58, -61, -78, -59, -70, -64, -65, -98, -60, -98, -79, -94, -94, -95, -82, -126, -85, -82, -116, -88, -99, -75, -98, -99, -97, -89, 125, -94, -80, -95, -82, -114, -95, -98, -79, -94, -94, -95, -82, -119, -81, -80, -61, -76, -76, -77, -64, -108, -67, -64, -98, -70, -81, -57, -80, -81, -79, -71, -101, -63, -33, -45, -22, -76, -25, -40, -40, -41, -28, -65, -27, -107, -111, -106, 106, -99, -114, -114, -115, -102, 117, -101};
    }

    static {
        A03();
    }

    public C1205Zh() {
        this(new Q5(true, 65536), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2500, 5000, -1, false, 0, false);
    }

    public C1205Zh(Q5 q5, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        int i7;
        String strA02 = A02(Input.Keys.NUMPAD_RIGHT_PAREN, 19, 43);
        String strA03 = A02(21, 1, 88);
        A04(i3, 0, strA02, strA03);
        String strA04 = A02(131, 32, 25);
        A04(i4, 0, strA04, strA03);
        String strA05 = A02(Input.Keys.F23, 11, 5);
        A04(i, i3, strA05, strA02);
        A04(i, i4, strA05, strA04);
        A04(i2, i, A02(182, 11, 79), strA05);
        A04(i6, 0, A02(111, 20, 46), strA03);
        this.A08 = q5;
        this.A07 = AbstractC1600gE.A0O(i);
        this.A06 = AbstractC1600gE.A0O(i2);
        this.A05 = AbstractC1600gE.A0O(i3);
        this.A04 = AbstractC1600gE.A0O(i4);
        this.A02 = i5;
        if (this.A02 != -1) {
            i7 = this.A02;
        } else {
            i7 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.A00 = i7;
        this.A09 = z;
        this.A03 = AbstractC1600gE.A0O(i6);
        this.A0A = z2;
    }

    public static int A00(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC1188Yq[] interfaceC1188YqArr, QD[] qdArr) {
        int iA00 = 0;
        for (int i = 0; i < targetBufferSize; i++) {
            if (qdArr[i] != null) {
                int targetBufferSize = interfaceC1188YqArr[i].A9D();
                iA00 += A00(targetBufferSize);
            }
        }
        int targetBufferSize2 = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iA00);
        return targetBufferSize2;
    }

    public static void A04(int i, int i2, String str, String str2) {
        AbstractC1517es.A09(i >= i2, str + A02(0, 21, 95) + str2);
    }

    private void A05(boolean z) {
        int i;
        if (this.A02 == -1) {
            i = C.DEFAULT_VIDEO_BUFFER_SIZE;
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            this.A08.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final Q5 A6l() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final long A6q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void AEm() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void AFF() {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void AFN(InterfaceC1188Yq[] interfaceC1188YqArr, C0992Qs c0992Qs, QD[] qdArr) {
        int iA01;
        if (this.A02 == -1) {
            iA01 = A01(interfaceC1188YqArr, qdArr);
        } else {
            iA01 = this.A02;
        }
        this.A00 = iA01;
        this.A08.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final boolean AHt() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final boolean AJ1(long j, long j2, float f, boolean z) {
        boolean z2 = true;
        boolean z3 = this.A08.A00() >= this.A00;
        long jMin = this.A07;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC1600gE.A0Q(jMin, f), this.A06);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.A09 && z3) {
                z2 = false;
            }
            this.A01 = z2;
            if (!this.A01 && j2 < 500000) {
                AbstractC1561fb.A07(A02(22, 18, 84), A02(40, 71, 108));
            }
        } else if (j2 >= this.A06 || z3) {
            this.A01 = false;
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final boolean AJ4(long j, float f, boolean z, boolean z2, long j2) {
        long jA0R = AbstractC1600gE.A0R(j, f);
        long jMin = z ? this.A04 : this.A05;
        if (j2 != C.TIME_UNSET) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jA0R >= jMin || (!this.A09 && this.A08.A00() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.PC
    public final void onPrepared() {
        A05(false);
    }
}
