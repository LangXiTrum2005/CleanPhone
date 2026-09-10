package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.DrmInitData;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0995Qv implements InterfaceC1086Uo {
    public static byte[] A0Y;
    public static String[] A0Z = {"XzXkmQjlnIcOujio8W8Fy2Ah3M7hqWmA", "BQS8mfv5pZB50fcdlD1Nawg7npG607JE", "Eze6KeWuK9h2sy1NWgA09hMSo2LcYV2l", "sP1XvEFALue5112JxXwRmwtzic2f21I3", "bPz3Z", "d2bMLbuGP8ETgNUkC97KiNU83xhAlixE", "ufTGmh8dkock6vBpxGQL0lA6PNlA30Dq", "h2JN55IYyZiFdSxtszsPk2RvU5Dz"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A08;

    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public Uri A0A;
    public ZM A0B;
    public ZM A0C;
    public ZM A0D;
    public TA A0E;
    public InterfaceC1305bR A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final TJ A0T;
    public final TO A0U;
    public final C1301bN A0V;
    public final C1303bP A0W = new C1303bP();
    public int A01 = 1000;
    public int[] A0P = new int[this.A01];
    public long[] A0Q = new long[this.A01];
    public long[] A0R = new long[this.A01];
    public int[] A0N = new int[this.A01];
    public int[] A0O = new int[this.A01];
    public C1085Um[] A0S = new C1085Um[this.A01];
    public final C1320bg<C1304bQ> A0X = new C1320bg<>(new InterfaceC1528f3() { // from class: com.facebook.ads.redexgen.X.Qw
        @Override // com.facebook.ads.redexgen.core.InterfaceC1528f3
        public final void A2z(Object obj) {
            ((C1304bQ) obj).A01.AGj();
        }
    });
    public long A09 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A0L = true;
    public boolean A0M = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized int A03(P6 p6, C1143Ww c1143Ww, boolean z, boolean z2, C1303bP c1303bP) {
        c1143Ww.A04 = false;
        if (!A0K()) {
            if (!z2 && !this.A0G) {
                if (this.A0D == null || (!z && this.A0D == this.A0B)) {
                    return -3;
                }
                A0H((ZM) AbstractC1517es.A01(this.A0D), p6);
                return -5;
            }
            c1143Ww.A02(4);
            return -4;
        }
        ZM zm = this.A0X.A01(A0O()).A00;
        if (z || zm != this.A0B) {
            A0H(zm, p6);
            return -5;
        }
        int iA00 = A00(this.A03);
        if (!A0L(iA00)) {
            c1143Ww.A04 = true;
            return -3;
        }
        c1143Ww.A02(this.A0N[iA00]);
        c1143Ww.A01 = this.A0R[iA00];
        if (c1143Ww.A01 < this.A09) {
            c1143Ww.A00(Integer.MIN_VALUE);
        }
        c1303bP.A00 = this.A0O[iA00];
        c1303bP.A01 = this.A0Q[iA00];
        c1303bP.A02 = this.A0S[iA00];
        return -4;
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Y, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0Z[2].charAt(31) != 'l') {
                throw new RuntimeException();
            }
            String[] strArr = A0Z;
            strArr[3] = "oIugEPgZKAjQ6nrqUpByKVoPWe4JYPMz";
            strArr[5] = "5cSWN0yPRhnYzoKOFrqoy8W7E0QEO8d9";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 82);
            i4++;
        }
    }

    public static void A0E() {
        A0Y = new byte[]{89, 96, 115, 100, 100, 127, 114, 127, 120, 113, 54, 99, 120, 115, 110, 102, 115, 117, 98, 115, 114, 54, 120, 121, 120, 59, 101, 111, 120, 117, 54, 101, 119, 123, 102, 122, 115, 54, 112, 121, 100, 54, 112, 121, 100, 123, 119, 98, 44, 54, 64, 114, 126, 99, 127, 118, 66, 102, 118, 102, 118};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0G(long j, int i, long j2, int i2, C1085Um c1085Um) {
        if (this.A02 > 0) {
            int iA00 = A00(this.A02 - 1);
            AbstractC1517es.A07(this.A0Q[iA00] + ((long) this.A0O[iA00]) <= j2);
        }
        this.A0G = (536870912 & i) != 0;
        this.A07 = Math.max(this.A07, j);
        int iA01 = A00(this.A02);
        this.A0R[iA01] = j;
        this.A0Q[iA01] = j2;
        this.A0O[iA01] = i2;
        this.A0N[iA01] = i;
        this.A0S[iA01] = c1085Um;
        this.A0P[iA01] = this.A05;
        if (this.A0X.A06() || !this.A0X.A00().A00.equals(this.A0D)) {
            this.A0X.A05(A0P(), new C1304bQ((ZM) AbstractC1517es.A01(this.A0D), this.A0U != null ? this.A0U.AGB(this.A0T, this.A0D) : TN.A00));
        }
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            C1085Um[] c1085UmArr = new C1085Um[i3];
            int i4 = this.A01 - this.A04;
            System.arraycopy(this.A0Q, this.A04, jArr, 0, i4);
            System.arraycopy(this.A0R, this.A04, jArr2, 0, i4);
            System.arraycopy(this.A0N, this.A04, iArr2, 0, i4);
            System.arraycopy(this.A0O, this.A04, iArr3, 0, i4);
            System.arraycopy(this.A0S, this.A04, c1085UmArr, 0, i4);
            System.arraycopy(this.A0P, this.A04, iArr, 0, i4);
            int i5 = this.A04;
            System.arraycopy(this.A0Q, 0, jArr, i4, i5);
            System.arraycopy(this.A0R, 0, jArr2, i4, i5);
            System.arraycopy(this.A0N, 0, iArr2, i4, i5);
            System.arraycopy(this.A0O, 0, iArr3, i4, i5);
            System.arraycopy(this.A0S, 0, c1085UmArr, i4, i5);
            System.arraycopy(this.A0P, 0, iArr, i4, i5);
            this.A0Q = jArr;
            this.A0R = jArr2;
            this.A0N = iArr2;
            this.A0O = iArr3;
            this.A0S = c1085UmArr;
            this.A0P = iArr;
            this.A04 = 0;
            this.A01 = i3;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized long A0S() {
        return this.A02 == 0 ? Long.MIN_VALUE : this.A0R[this.A04];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final /* synthetic */ int AHv(O9 o9, int i, boolean z) {
        return AbstractC1084Ul.A00(this, o9, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final /* synthetic */ void AHx(C1576fq c1576fq, int i) {
        AbstractC1084Ul.A01(this, c1576fq, i);
    }

    static {
        A0E();
    }

    public C0995Qv(InterfaceC1424dM interfaceC1424dM, TO to, TJ tj) {
        this.A0U = to;
        this.A0T = tj;
        this.A0V = new C1301bN(interfaceC1424dM);
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int relativeIndex = this.A01;
        if (i2 < relativeIndex) {
            return i2;
        }
        int i3 = this.A01;
        String[] strArr = A0Z;
        String str = strArr[3];
        String str2 = strArr[5];
        int iCharAt = str.charAt(0);
        int relativeIndex2 = str2.charAt(0);
        if (iCharAt == relativeIndex2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Z;
        strArr2[0] = "V9axmdcYH5ccgyaQwPRN0gbmYNo7J8z2";
        strArr2[6] = "zNKImK54Q6Ec0sLxrSbjAwJyAcsWXC5q";
        return i2 - i3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001f A[EDGE_INSN: B:18:0x001f->B:11:0x001f BREAK  A[LOOP:0: B:3:0x0002->B:15:0x0027], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    private int A01(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.A0R[i] <= j; i4++) {
            if (z) {
                int sampleCountToTarget = this.A0N[i];
                if ((sampleCountToTarget & 1) != 0) {
                    i3 = i4;
                    if (this.A0R[i] == j) {
                        break;
                    }
                }
            } else {
                i3 = i4;
                if (this.A0R[i] == j) {
                    break;
                    break;
                }
            }
            i++;
            int sampleCountToTarget2 = this.A01;
            if (i == sampleCountToTarget2) {
                i = 0;
            }
        }
        return i3;
    }

    private int A02(long j) {
        int i = this.A02;
        int count = this.A02;
        int iA00 = A00(count - 1);
        while (i > count && this.A0R[iA00] >= j) {
            i--;
            iA00--;
            if (iA00 == -1) {
                int count2 = this.A01;
                iA00 = count2 - 1;
            }
        }
        return i;
    }

    private synchronized long A04() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A06(this.A02);
    }

    private final synchronized long A05() {
        return Math.max(this.A06, A08(this.A03));
    }

    private long A06(int i) {
        this.A06 = Math.max(this.A06, A08(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            String[] strArr = A0Z;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[3] = "WVz4D66Tj21a08Qir9ONHYdv5FLzF0KF";
            strArr2[5] = "7hudXfvUAGpuJm6Qmm0rjyWWjHZqHLp7";
            this.A03 = 0;
        }
        this.A0X.A04(this.A00);
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i2 = relativeLastDiscardIndex - 1;
            long j = this.A0Q[i2];
            int relativeLastDiscardIndex2 = this.A0O[i2];
            return j + ((long) relativeLastDiscardIndex2);
        }
        long j2 = this.A0Q[this.A04];
        if (A0Z[2].charAt(31) != 'l') {
            return j2;
        }
        String[] strArr3 = A0Z;
        strArr3[0] = "JdwimemRFAqQR4ZZeKK3yA251rw7nGFc";
        strArr3[6] = "pnJtmtApyfrmXTRdv0WJB6lrdfNTrPJm";
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    private long A07(int i) {
        boolean z;
        int iA0P = A0P() - i;
        boolean z2 = false;
        if (iA0P >= 0) {
            int i2 = this.A02;
            int discardCount = this.A03;
            if (iA0P <= i2 - discardCount) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC1517es.A07(z);
        int i3 = this.A02;
        if (A0Z[2].charAt(31) != 'l') {
            throw new RuntimeException();
        }
        A0Z[1] = "MdlRTntXEyTeJnYTh9zs2vpgsAV6sfZa";
        this.A02 = i3 - iA0P;
        long j = this.A06;
        int discardCount2 = this.A02;
        this.A07 = Math.max(j, A08(discardCount2));
        if (iA0P == 0 && this.A0G) {
            z2 = true;
        }
        this.A0G = z2;
        this.A0X.A03(i);
        int discardCount3 = this.A02;
        if (discardCount3 != 0) {
            int discardCount4 = this.A02;
            int relativeLastWriteIndex = A00(discardCount4 - 1);
            long j2 = this.A0Q[relativeLastWriteIndex];
            int discardCount5 = this.A0O[relativeLastWriteIndex];
            return j2 + ((long) discardCount5);
        }
        return 0L;
    }

    private long A08(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long jMax = Long.MIN_VALUE;
        int iA00 = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            long largestTimestampUs = this.A0R[iA00];
            jMax = Math.max(jMax, largestTimestampUs);
            if ((this.A0N[iA00] & 1) != 0) {
                break;
            }
            iA00--;
            String[] strArr = A0Z;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            A0Z[1] = "tbllSvgJ0rQ0RFVR9sk52v7wS8d6fpNv";
            if (iA00 == -1) {
                iA00 = this.A01 - 1;
            }
        }
        return jMax;
    }

    private synchronized long A09(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0R[this.A04]) {
            int iA01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (iA01 == -1) {
                return -1L;
            }
            return A06(iA01);
        }
        return -1L;
    }

    private final ZM A0A(ZM zm) {
        if (this.A08 != 0 && zm.A0M != Long.MAX_VALUE) {
            return zm.A07().A0s(zm.A0M + this.A08).A14();
        }
        return zm;
    }

    public static C0995Qv A0B(InterfaceC1424dM interfaceC1424dM, TO to, TJ tj) {
        return new C0995Qv(interfaceC1424dM, (TO) AbstractC1517es.A01(to), (TJ) AbstractC1517es.A01(tj));
    }

    private void A0D() {
        if (this.A0E != null) {
            this.A0E.AGk(this.A0T);
            this.A0E = null;
            this.A0B = null;
        }
    }

    private synchronized void A0F() {
        this.A03 = 0;
        this.A0V.A0B();
    }

    private void A0H(ZM zm, P6 p6) {
        ZM zmA08;
        boolean z = this.A0B == null;
        DrmInitData newDrmInitData = z ? null : this.A0B.A0O;
        this.A0B = zm;
        DrmInitData oldDrmInitData = zm.A0O;
        if (this.A0U != null) {
            zmA08 = zm.A08(this.A0U.A7M(zm));
        } else {
            zmA08 = zm;
        }
        p6.A00 = zmA08;
        p6.A01 = this.A0E;
        if (this.A0U == null) {
            return;
        }
        if (!z) {
            boolean isFirstFormat = AbstractC1600gE.A1E(newDrmInitData, oldDrmInitData);
            if (isFirstFormat) {
                return;
            }
        }
        if (Looper.myLooper() == null) {
            return;
        }
        TA previousSession = this.A0E;
        this.A0E = this.A0U.A32(this.A0T, zm);
        p6.A01 = this.A0E;
        if (previousSession != null) {
            TJ tj = this.A0T;
            String[] strArr = A0Z;
            if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
                throw new RuntimeException();
            }
            A0Z[1] = "kVDWtkerIPwbzelCZBhq0qaXj3x6PEQk";
            previousSession.AGk(tj);
        }
    }

    private final void A0J(boolean z) {
        this.A0V.A0A();
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0M = true;
        this.A09 = Long.MIN_VALUE;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A0G = false;
        this.A0X.A02();
        if (z) {
            this.A0C = null;
            this.A0D = null;
            String[] strArr = A0Z;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[7] = "4MRRfSUFF0P8gspUtLKGI7bMK1Ea";
            strArr2[4] = "yMETr";
            this.A0L = true;
        }
    }

    private boolean A0K() {
        return this.A03 != this.A02;
    }

    private boolean A0L(int i) {
        if (this.A0E != null && this.A0E.A90() != 4) {
            if ((this.A0N[i] & 1073741824) == 0) {
                boolean zAG9 = this.A0E.AG9();
                if (A0Z[1].charAt(27) != '6') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Z;
                strArr[0] = "2T4AmmBguKiJYkhIse2z0F537NC4c1Fx";
                strArr[6] = "Z95wmCIcAJt5YZrTrs3JYzy5GQIbO6Lk";
                if (zAG9) {
                }
            }
            return false;
        }
        return true;
    }

    private synchronized boolean A0M(long j) {
        boolean z = true;
        if (this.A02 == 0) {
            if (j <= this.A06) {
                z = false;
            }
            return z;
        }
        if (A05() >= j) {
            return false;
        }
        int iA02 = A02(j);
        int retainCount = this.A00;
        A07(retainCount + iA02);
        return true;
    }

    private synchronized boolean A0N(ZM zm) {
        this.A0L = false;
        if (AbstractC1600gE.A1E(zm, this.A0D)) {
            return false;
        }
        if (!this.A0X.A06() && this.A0X.A00().A00.equals(zm)) {
            this.A0D = this.A0X.A00().A00;
        } else {
            this.A0D = zm;
        }
        this.A0J = Q2.A0G(this.A0D.A0W, this.A0D.A0R);
        this.A0H = false;
        return true;
    }

    public final int A0O() {
        return this.A00 + this.A03;
    }

    public final int A0P() {
        return this.A00 + this.A02;
    }

    public final synchronized int A0Q(long j, boolean z) {
        int iA00 = A00(this.A03);
        if (A0K() && j >= this.A0R[iA00]) {
            if (j > this.A07 && z) {
                int i = this.A02;
                int relativeReadIndex = this.A03;
                return i - relativeReadIndex;
            }
            int i2 = this.A02;
            int relativeReadIndex2 = this.A03;
            int offset = A01(iA00, i2 - relativeReadIndex2, j, true);
            if (offset == -1) {
                return 0;
            }
            return offset;
        }
        return 0;
    }

    public final int A0R(P6 p6, C1143Ww c1143Ww, int i, boolean z) {
        int iA03 = A03(p6, c1143Ww, (i & 2) != 0, z, this.A0W);
        if (iA03 == -4 && !c1143Ww.A05()) {
            int i2 = i & 1;
            if (A0Z[2].charAt(31) != 'l') {
                throw new RuntimeException();
            }
            A0Z[2] = "FwWci1Trh12LEFPya5rTNs6Y30vMmoll";
            boolean z2 = i2 != 0;
            int result = i & 4;
            if (result == 0) {
                if (z2) {
                    this.A0V.A0D(c1143Ww, this.A0W);
                } else {
                    this.A0V.A0E(c1143Ww, this.A0W);
                }
            }
            if (!z2) {
                int result2 = this.A03;
                this.A03 = result2 + 1;
            }
        }
        return iA03;
    }

    public final synchronized long A0T() {
        return this.A07;
    }

    public final synchronized ZM A0U() {
        return this.A0L ? null : this.A0D;
    }

    public final void A0V() {
        this.A0V.A0C(A04());
    }

    public final void A0W() throws IOException {
        if (this.A0E == null || this.A0E.A90() != 1) {
        } else {
            throw ((T8) AbstractC1517es.A01(this.A0E.A7q()));
        }
    }

    public final void A0X() {
        A0V();
        A0D();
    }

    public final void A0Y() {
        A0J(true);
        A0D();
    }

    public final void A0Z() {
        A0J(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final synchronized void A0a(int i) {
        boolean z;
        if (i >= 0) {
            if (this.A03 + i <= this.A02) {
                z = true;
            } else {
                z = false;
            }
            AbstractC1517es.A07(z);
            this.A03 += i;
        } else {
            z = false;
            AbstractC1517es.A07(z);
            this.A03 += i;
        }
        throw th;
    }

    public final void A0b(long j) {
        this.A09 = j;
    }

    public final void A0c(long j, boolean z, boolean z2) {
        this.A0V.A0C(A09(j, z, z2));
    }

    public final void A0d(InterfaceC1305bR interfaceC1305bR) {
        this.A0F = interfaceC1305bR;
    }

    public final synchronized boolean A0e() {
        return this.A0G;
    }

    public final synchronized boolean A0f(long j, boolean z) {
        A0F();
        int iA00 = A00(this.A03);
        if (!A0K() || j < this.A0R[iA00] || (j > this.A07 && !z)) {
            return false;
        }
        int i = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(iA00, i - relativeReadIndex, j, true);
        if (offset == -1) {
            return false;
        }
        this.A09 = j;
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return true;
    }

    public final synchronized boolean A0g(boolean z) {
        boolean z2 = true;
        if (!A0K()) {
            if (!z && !this.A0G && (this.A0D == null || this.A0D == this.A0B)) {
                z2 = false;
            }
            return z2;
        }
        if (this.A0X.A01(A0O()).A00 != this.A0B) {
            return true;
        }
        return A0L(A00(this.A03));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void A6U(ZM zm) {
        ZM zmA0A = A0A(zm);
        this.A0K = false;
        this.A0C = zm;
        boolean upstreamFormatChanged = A0N(zmA0A);
        if (this.A0F != null && upstreamFormatChanged) {
            InterfaceC1305bR interfaceC1305bR = this.A0F;
            String[] strArr = A0Z;
            if (strArr[0].charAt(4) != strArr[6].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Z;
            strArr2[3] = "SR5M8Kc5PR5mPxcb0lhI1b4SX72sywAC";
            strArr2[5] = "Xej6uOEnPXc6rla11Ixsfdcb7q4t17tj";
            interfaceC1305bR.AFT(zmA0A);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final int AHw(O9 o9, int i, boolean z, int i2) throws IOException {
        return this.A0V.A08(o9, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void AHy(C1576fq c1576fq, int i, int i2) {
        this.A0V.A0F(c1576fq, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void AI0(long j, int i, int i2, int flags, C1085Um c1085Um) {
        int i3 = i;
        if (this.A0K) {
            A6U((ZM) AbstractC1517es.A02(this.A0C));
        }
        boolean z = (i3 & 1) != 0;
        if (this.A0M) {
            if (!z) {
                return;
            } else {
                this.A0M = false;
            }
        }
        long j2 = this.A08;
        String[] strArr = A0Z;
        if (strArr[3].charAt(0) == strArr[5].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Z;
        strArr2[7] = "v8m2Y8KdyVxf3fEdqDJtR59XIEPU";
        strArr2[4] = "4tVyo";
        long j3 = j + j2;
        if (this.A0J) {
            if (j3 < this.A09) {
                return;
            }
            if ((i3 & 1) == 0) {
                if (!this.A0H) {
                    AbstractC1561fb.A07(A0C(50, 11, 65), A0C(0, 50, 68) + this.A0D);
                    this.A0H = true;
                }
                i3 |= 1;
            }
        }
        boolean z2 = this.A0I;
        String[] strArr3 = A0Z;
        String str = strArr3[3];
        String str2 = strArr3[5];
        int iCharAt = str.charAt(0);
        int flags2 = str2.charAt(0);
        if (iCharAt == flags2) {
            throw new RuntimeException();
        }
        A0Z[1] = "2fG2NVvnLUuSuv5Jt6swpqwEhJQ6dWw3";
        if (z2) {
            if (!z) {
                return;
            }
            boolean zA0M = A0M(j3);
            String[] strArr4 = A0Z;
            String str3 = strArr4[0];
            String str4 = strArr4[6];
            int iCharAt2 = str3.charAt(4);
            int flags3 = str4.charAt(4);
            if (iCharAt2 != flags3) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0Z;
            strArr5[0] = "dw41mcbYwYaV8pzqWfmlHkqSmQ1KU97q";
            strArr5[6] = "R94UmEwjFkupYUWGOUdfSDQv8LXU36Fz";
            if (!zA0M) {
                return;
            } else {
                this.A0I = false;
            }
        }
        A0G(j3, i3, (this.A0V.A09() - ((long) i2)) - ((long) flags), i2, c1085Um);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    @MetaExoPlayerCustomization("Added in D14652852 for LiveTrace")
    public final void AJk(Uri uri) {
        this.A0A = uri;
    }
}
