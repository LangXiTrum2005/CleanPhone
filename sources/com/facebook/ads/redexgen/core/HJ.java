package com.facebook.ads.redexgen.core;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HJ {
    public static byte[] A0C;
    public static String[] A0D = {"Hy9erbcn1CD2Cs5ZlmG25MdtXf", "HOFQhwFeFgK1hjIc7qCVfLVKe4hb2KPj", "rEWyESjnSr6bXcR3qBgtsTRMI2K9qdSB", "BvL17bJBTlRgAjITBDDuBrnomI", "AZrfJovBkJndynqGcgKN1LZzk8fHrrw4", "fdLmSfOckTno1kV1pYqKvwBW8a156Tx5", "emxoz2tvvjMM3L", "p0b9qfAXEvDLZmNF0KID"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final HI A0A;
    public final Metadata A0B;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{11, 31, 14, 3, 5, 69, 12, 6, 11, 9};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final HJ A0A(List<PictureFrame> list) {
        return new HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(new Metadata(list)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final HJ A0B(List<String> list) {
        return new HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, this.A0A, A02(AbstractC1414Hk.A02(list)));
    }

    static {
        A04();
    }

    public HJ(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, HI hi, Metadata metadata) {
        this.A05 = i2;
        this.A03 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A08 = A01(i6);
        this.A02 = i7;
        this.A00 = i8;
        this.A01 = A00(i8);
        this.A09 = j;
        this.A0A = hi;
        this.A0B = metadata;
    }

    public HJ(byte[] bArr, int i2) {
        C11064u c11064u = new C11064u(bArr);
        c11064u.A08(i2 * 8);
        this.A05 = c11064u.A04(16);
        this.A03 = c11064u.A04(16);
        this.A06 = c11064u.A04(24);
        this.A04 = c11064u.A04(24);
        this.A07 = c11064u.A04(20);
        this.A08 = A01(this.A07);
        this.A02 = c11064u.A04(3) + 1;
        this.A00 = c11064u.A04(5) + 1;
        this.A01 = A00(this.A00);
        this.A09 = c11064u.A05(36);
        this.A0A = null;
        this.A0B = null;
    }

    public static int A00(int i2) {
        switch (i2) {
            case 8:
                if (A0D[6].length() != 28) {
                    String[] strArr = A0D;
                    strArr[5] = "V04NPWFEbILAkvleA9Xxz0FwJQ4eDV3p";
                    strArr[4] = "3QJh7HKROfuZmn4fVSBdYwrM5PNWxwSf";
                    return 1;
                }
                String[] strArr2 = A0D;
                strArr2[3] = "IuGfV3sFLU7aLzdayuZ51nmzsb";
                strArr2[0] = "kvaRWCMq8GtPZOTZqMfFBSkWA2";
                return 1;
            case 12:
                return 2;
            case 16:
                return 4;
            case 20:
                if (A0D[7].length() != 20) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0D;
                strArr3[3] = "GVm7TyTvdgGXuIF1m2KSKJr8Vg";
                strArr3[0] = "pCX2CyoVa54AgSUVxisn2xa5Aw";
                return 5;
            case 24:
                return 6;
            default:
                return -1;
        }
    }

    public static int A01(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private final Metadata A02(Metadata metadata) {
        return this.A0B == null ? metadata : this.A0B.A04(metadata);
    }

    public final long A05() {
        long j;
        if (this.A04 > 0) {
            return ((((long) this.A04) + ((long) this.A06)) / 2) + 1;
        }
        if (this.A05 == this.A03 && this.A05 > 0) {
            j = this.A05;
        } else {
            j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        long j2 = ((long) this.A02) * j;
        long blockSizeSamples = this.A00;
        return ((j2 * blockSizeSamples) / 8) + 64;
    }

    public final long A06() {
        if (this.A09 == 0) {
            return -9223372036854775807L;
        }
        return (this.A09 * 1000000) / ((long) this.A07);
    }

    public final long A07(long j) {
        long sampleNumber = C5C.A0T((((long) this.A07) * j) / 1000000, 0L, this.A09 - 1);
        return sampleNumber;
    }

    public final C2860qI A08(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i2 = this.A04 > 0 ? this.A04 : -1;
        Metadata metadataA02 = A02(metadata);
        C10512p c10512pA0h = new C10512p().A11(A03(0, 10, 87)).A0h(i2);
        int maxInputSize = this.A02;
        C10512p c10512pA0b = c10512pA0h.A0b(maxInputSize);
        int maxInputSize2 = this.A07;
        return c10512pA0b.A0m(maxInputSize2).A12(Collections.singletonList(bArr)).A0v(metadataA02).A14();
    }

    public final HJ A09(HI hi) {
        return new HJ(this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09, hi, this.A0B);
    }
}
