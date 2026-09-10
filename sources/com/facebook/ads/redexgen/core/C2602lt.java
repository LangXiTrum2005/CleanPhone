package com.facebook.ads.redexgen.core;

import com.smartdigimkt.q8.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2602lt extends AbstractC1456Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", i.f37957c};
    public int A00;
    public C1411Hh A01;
    public C1413Hj A02;
    public C1457Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1457Jc A02(C11074v c11074v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1414Hk.A06(c11074v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC1414Hk.A04(c11074v);
            return null;
        }
        C1413Hj c1413Hj = this.A02;
        C1411Hh c1411Hh = this.A01;
        byte[] bArr = new byte[c11074v.A0A()];
        System.arraycopy(c11074v.A0l(), 0, bArr, 0, c11074v.A0A());
        C1412Hi[] c1412HiArrA0D = AbstractC1414Hk.A0D(c11074v, c1413Hj.A05);
        return new C1457Jc(c1413Hj, c1411Hh, bArr, c1412HiArrA0D, AbstractC1414Hk.A00(c1412HiArrA0D.length - 1));
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static int A01(byte b2, C1457Jc c1457Jc) {
        if (!c1457Jc.A04[A00(b2, c1457Jc.A00, 1)].A03) {
            int modeNumber = c1457Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1457Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C11074v c11074v, long j) {
        if (c11074v.A08() < c11074v.A0A() + 4) {
            c11074v.A0i(Arrays.copyOf(c11074v.A0l(), c11074v.A0A() + 4));
        } else {
            c11074v.A0e(c11074v.A0A() + 4);
        }
        byte[] bArrA0l = c11074v.A0l();
        bArrA0l[c11074v.A0A() - 4] = (byte) (j & 255);
        bArrA0l[c11074v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        bArrA0l[c11074v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        bArrA0l[c11074v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C11074v c11074v) {
        try {
            return AbstractC1414Hk.A0C(1, c11074v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    public final long A09(C11074v c11074v) {
        int i2 = 0;
        if ((c11074v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b2 = c11074v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b2, (C1457Jc) AbstractC10843y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i2 = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c11074v, i2);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    public final void A0B(boolean z2) {
        super.A0B(z2);
        if (z2) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C11074v c11074v, long j, C1455Ja c1455Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC10843y.A01(c1455Ja.A00);
            return false;
        }
        this.A03 = A02(c11074v);
        if (this.A03 == null) {
            return true;
        }
        C1457Jc c1457Jc = this.A03;
        C1413Hj c1413Hj = c1457Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1413Hj.A09);
        codecInitializationData.add(c1457Jc.A03);
        c1455Ja.A00 = new C10512p().A11(A03(0, 12, 22)).A0a(c1413Hj.A02).A0j(c1413Hj.A00).A0b(c1413Hj.A05).A0m(c1413Hj.A06).A12(codecInitializationData).A0v(AbstractC1414Hk.A02(MetaExoPlayerCustomizedCollections.A02(c1457Jc.A01.A02))).A14();
        return true;
    }
}
