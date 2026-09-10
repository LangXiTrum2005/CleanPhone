package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.cs;
import com.p004ironsource.mediationsdk.demandOnly.e;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.b0.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public abstract class J0 {
    public static byte[] A00;
    public static String[] A01 = {"3VpIAtFn", "NjWxo0tcAFilzYXB2gd1dub2S4KYfC0G", "7dc9OwNzjfbA4WDbGdH3UDrd", "kTLJpOKA", "odl5U202HvuloegJiYsgd2o0Bsn6ktlS", "Tqd8q9EAW1nxLdrfn3G624yWy86zlBE3", "GM6CYLF4x47fKf9mrP144TBtf3lMkKEe", "FJhXpGWKImafMZTrlZrsHtUKnb1aBvQ9"};
    public static final byte[] A02;

    @MetaExoPlayerCustomization("Needed for oculus customization")
    public static final int[] A03;

    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static ColorInfo A0B(C11074v c11074v) {
        C10382a c10382a = new C10382a();
        C11064u c11064u = new C11064u(c11074v.A0l());
        c11064u.A08(c11074v.A09() * 8);
        c11064u.A0A(1);
        c11064u.A04(3);
        c11064u.A09(6);
        c11064u.A0H();
        c11064u.A0H();
        c11064u.A09(13);
        c11064u.A07();
        int iA04 = c11064u.A04(4);
        String strA0M = A0M(178, 11, 68);
        if (iA04 != 1) {
            AbstractC10924g.A06(strA0M, A0M(593, 22, 87) + iA04);
            return c10382a.A03();
        }
        if (c11064u.A0H()) {
            AbstractC10924g.A06(strA0M, A0M(563, 30, 42));
            return c10382a.A03();
        }
        boolean zA0H = c11064u.A0H();
        c11064u.A07();
        if (zA0H && c11064u.A04(8) > 127) {
            AbstractC10924g.A06(strA0M, A0M(PsExtractor.PRIVATE_STREAM_1, 18, 61));
            return c10382a.A03();
        }
        int iA05 = c11064u.A04(3);
        c11064u.A07();
        if (c11064u.A0H()) {
            AbstractC10924g.A06(strA0M, A0M(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 40, 96));
            return c10382a.A03();
        }
        if (c11064u.A0H()) {
            AbstractC10924g.A06(strA0M, A0M(655, 36, 7));
            return c10382a.A03();
        }
        if (c11064u.A0H()) {
            AbstractC10924g.A06(strA0M, A0M(494, 46, 123));
            return c10382a.A03();
        }
        int iA06 = c11064u.A04(5);
        for (int i2 = 0; i2 <= iA06; i2++) {
            c11064u.A09(12);
            if (c11064u.A04(5) > 7) {
                c11064u.A07();
            }
        }
        int iA07 = c11064u.A04(4);
        int iA08 = c11064u.A04(4);
        c11064u.A09(iA07 + 1);
        c11064u.A09(iA08 + 1);
        if (c11064u.A0H()) {
            c11064u.A09(7);
        }
        c11064u.A09(7);
        boolean zA0H2 = c11064u.A0H();
        if (zA0H2) {
            c11064u.A09(2);
        }
        boolean zA0H3 = c11064u.A0H();
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A01[2] = "spdqEdfVqdQubNKbzHaSCSbA";
        if ((zA0H3 ? 2 : c11064u.A04(1)) > 0) {
            boolean zA0H4 = c11064u.A0H();
            if (A01[5].charAt(23) != 'W') {
                A01[5] = "fpomjt14ZeQUreCUx8H2Qj9W8NeulNVr";
                if (!zA0H4) {
                    c11064u.A09(1);
                }
            } else {
                String[] strArr2 = A01;
                strArr2[7] = "VYuT40g5EEwFWTEBAX27ZdDSMSIcM78J";
                strArr2[4] = "WUQpgtHZDasrpP5hdEQLNs2AngJpMhTI";
                if (!zA0H4) {
                    c11064u.A09(1);
                }
            }
        }
        if (zA0H2) {
            c11064u.A09(3);
        }
        c11064u.A09(3);
        boolean zA0H5 = c11064u.A0H();
        if (iA05 == 2 && zA0H5) {
            c11064u.A07();
        }
        boolean z2 = iA05 != 1 && c11064u.A0H();
        if (c11064u.A0H()) {
            int iA09 = c11064u.A04(8);
            int iA010 = c11064u.A04(8);
            c10382a.A01(ColorInfo.A00(iA09)).A00(((z2 || iA09 != 1 || iA010 != 13 || c11064u.A04(8) != 0) ? c11064u.A04(1) : 1) != 1 ? 2 : 1).A02(ColorInfo.A01(iA010));
        }
        return c10382a.A03();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Metadata A0F(C2623mE c2623mE) {
        C2622mD c2622mDA07 = c2623mE.A07(1751411826);
        C2622mD c2622mDA08 = c2623mE.A07(1801812339);
        C2622mD c2622mDA09 = c2623mE.A07(1768715124);
        if (c2622mDA07 == null || c2622mDA08 == null || c2622mDA09 == null || A03(c2622mDA07.A00) != 1835299937) {
            return null;
        }
        C11074v c11074v = c2622mDA08.A00;
        c11074v.A0f(12);
        int iA0C = c11074v.A0C();
        String[] strArr = new String[iA0C];
        for (int i2 = 0; i2 < iA0C; i2++) {
            int iA0C2 = c11074v.A0C();
            c11074v.A0g(4);
            strArr[i2] = c11074v.A0W(iA0C2 - 8);
        }
        C11074v c11074v2 = c2622mDA09.A00;
        c11074v2.A0f(8);
        ArrayList arrayList = new ArrayList();
        while (c11074v2.A07() > 8) {
            int iA09 = c11074v2.A09();
            int iA0C3 = c11074v2.A0C();
            int iA0C4 = c11074v2.A0C() - 1;
            if (iA0C4 < 0 || iA0C4 >= strArr.length) {
                AbstractC10924g.A07(A0M(178, 11, 68), A0M(359, 41, 107) + iA0C4);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryA09 = JB.A09(c11074v2, iA09 + iA0C3, strArr[iA0C4]);
                if (mdtaMetadataEntryA09 != null) {
                    arrayList.add(mdtaMetadataEntryA09);
                }
            }
            c11074v2.A0f(iA09 + iA0C3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1451Iw A0G(C11074v c11074v, int i2) {
        c11074v.A0f(i2 + 8 + 4);
        c11074v.A0g(1);
        A02(c11074v);
        c11074v.A0g(2);
        int iA0I = c11074v.A0I();
        if ((iA0I & 128) != 0) {
            c11074v.A0g(2);
        }
        if ((iA0I & 64) != 0) {
            c11074v.A0g(c11074v.A0I());
        }
        if ((iA0I & 32) != 0) {
            c11074v.A0g(2);
        }
        c11074v.A0g(1);
        A02(c11074v);
        String strA05 = C3J.A05(c11074v.A0I());
        if (A0M(947, 10, 17).equals(strA05) || A0M(989, 13, 117).equals(strA05) || A0M(1002, 16, 39).equals(strA05)) {
            return new C1451Iw(strA05, null, -1L, -1L);
        }
        c11074v.A0g(4);
        long jA0Q = c11074v.A0Q();
        long jA0Q2 = c11074v.A0Q();
        c11074v.A0g(1);
        int iA02 = A02(c11074v);
        byte[] bArr = new byte[iA02];
        c11074v.A0k(bArr, 0, iA02);
        if (jA0Q2 <= 0) {
            jA0Q2 = -1;
        }
        if (jA0Q <= 0) {
            jA0Q = -1;
        }
        return new C1451Iw(strA05, bArr, jA0Q2, jA0Q);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1454Iz A0I(C11074v c11074v) {
        long jA0Q;
        int i2;
        c11074v.A0f(8);
        int iA01 = AbstractC1449Iu.A01(c11074v.A0C());
        c11074v.A0g(iA01 == 0 ? 8 : 16);
        int iA0C = c11074v.A0C();
        c11074v.A0g(4);
        boolean z2 = true;
        int iA09 = c11074v.A09();
        int i3 = iA01 == 0 ? 4 : 8;
        for (int i4 = 0; i4 < i3; i4++) {
            if (c11074v.A0l()[iA09 + i4] != -1) {
                z2 = false;
                break;
            }
        }
        if (z2) {
            c11074v.A0g(i3);
            jA0Q = -9223372036854775807L;
        } else {
            jA0Q = iA01 == 0 ? c11074v.A0Q() : c11074v.A0R();
            if (jA0Q == 0) {
                jA0Q = -9223372036854775807L;
            }
        }
        c11074v.A0g(16);
        int iA0C2 = c11074v.A0C();
        int iA0C3 = c11074v.A0C();
        c11074v.A0g(4);
        int iA0C4 = c11074v.A0C();
        int iA0C5 = c11074v.A0C();
        if (iA0C2 == 0 && iA0C3 == 65536 && iA0C4 == (-65536) && iA0C5 == 0) {
            i2 = 90;
        } else if (iA0C2 == 0 && iA0C3 == (-65536) && iA0C4 == 65536 && iA0C5 == 0) {
            i2 = 270;
        } else {
            i2 = (iA0C2 == (-65536) && iA0C3 == 0 && iA0C4 == 0 && iA0C5 == (-65536)) ? 180 : 0;
        }
        return new C1454Iz(iA0C, jA0Q, i2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    public static JO A0J(C2623mE c2623mE, C2622mD c2622mD, long j, DrmInitData drmInitData, boolean z2, boolean z3) throws C3K {
        C2623mE c2623mEA06;
        long j2 = j;
        C2623mE c2623mE2 = (C2623mE) AbstractC10843y.A01(c2623mE.A06(1835297121));
        int iA01 = A01(A03(((C2622mD) AbstractC10843y.A01(c2623mE2.A07(1751411826))).A00));
        if (iA01 == -1) {
            return null;
        }
        C1454Iz c1454IzA0I = A0I(((C2622mD) AbstractC10843y.A01(c2623mE.A07(1953196132))).A00);
        if (j2 == -9223372036854775807L) {
            j2 = c1454IzA0I.A02;
        }
        long jA05 = A05(c2622mD.A00);
        long jA0U = j2 == -9223372036854775807L ? -9223372036854775807L : C5C.A0U(j2, 1000000L, jA05);
        C2623mE c2623mE3 = (C2623mE) AbstractC10843y.A01(((C2623mE) AbstractC10843y.A01(c2623mE2.A06(1835626086))).A06(1937007212));
        Pair<Long, String> pairA06 = A06(((C2622mD) AbstractC10843y.A01(c2623mE2.A07(1835296868))).A00);
        C2622mD c2622mDA07 = c2623mE3.A07(1937011556);
        if (c2622mDA07 == null) {
            throw C3K.A01(A0M(a.a1, 63, 20), null);
        }
        C1453Iy c1453IyA0H = A0H(c2622mDA07.A00, c1454IzA0I.A00, c1454IzA0I.A01, (String) pairA06.second, drmInitData, z3);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z2 && (c2623mEA06 = c2623mE.A06(1701082227)) != null) {
            Pair<long[], long[]> pairA09 = A09(c2623mEA06);
            String[] strArr = A01;
            if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "IbqpVMf9BLmnuF5BFBlg7Wi48qFbo4Yh";
            strArr2[4] = "amD11xiy90bj3UvdeHvItss5MLCDKaRi";
            if (pairA09 != null) {
                jArr = (long[]) pairA09.first;
                jArr2 = (long[]) pairA09.second;
            }
        }
        if (c1453IyA0H.A02 == null) {
            return null;
        }
        return new JO(c1454IzA0I.A00, iA01, ((Long) pairA06.first).longValue(), jA05, jA0U, c1453IyA0H.A02, c1453IyA0H.A01, c1453IyA0H.A03, c1453IyA0H.A00, jArr, jArr2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JP A0K(C11074v c11074v, int i2, int i3, String str) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            c11074v.A0f(i4);
            int iA0C = c11074v.A0C();
            if (c11074v.A0C() == 1952804451) {
                int iA01 = AbstractC1449Iu.A01(c11074v.A0C());
                c11074v.A0g(1);
                int i5 = 0;
                int i6 = 0;
                if (iA01 == 0) {
                    c11074v.A0g(1);
                } else {
                    int iA0I = c11074v.A0I();
                    i5 = (iA0I & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                    i6 = iA0I & 15;
                }
                boolean z2 = c11074v.A0I() == 1;
                int iA0I2 = c11074v.A0I();
                byte[] bArr = new byte[16];
                c11074v.A0k(bArr, 0, bArr.length);
                byte[] bArr2 = null;
                if (z2 && iA0I2 == 0) {
                    int iA0I3 = c11074v.A0I();
                    bArr2 = new byte[iA0I3];
                    c11074v.A0k(bArr2, 0, iA0I3);
                }
                return new JP(z2, str, iA0I2, bArr, i5, i6, bArr2);
            }
            i4 += iA0C;
        }
        return null;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
    public static JR A0L(JO jo, C2623mE c2623mE, HK hk) throws C3K {
        InterfaceC1452Ix c2620mB;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        String strA0M;
        long j;
        JO jo2;
        String strA0M2;
        long[] jArr;
        int i2;
        int[] iArr;
        C2622mD c2622mDA07 = c2623mE.A07(1937011578);
        if (c2622mDA07 != null) {
            c2620mB = new C2621mC(c2622mDA07, jo.A07);
        } else {
            C2622mD c2622mDA08 = c2623mE.A07(1937013298);
            if (c2622mDA08 == null) {
                throw C3K.A01(A0M(400, 42, 111), null);
            }
            c2620mB = new C2620mB(c2622mDA08);
        }
        int iA8v = c2620mB.A8v();
        String[] strArr = A01;
        if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
            A01[5] = "VWWx1kGHZbX2q2PAsWKgJgHWMUDi0u3b";
            if (iA8v == 0) {
                return new JR(jo, new long[0], new int[0], 0, new long[0], new int[0], 0L);
            }
            boolean z2 = false;
            C2622mD c2622mDA09 = c2623mE.A07(1937007471);
            if (c2622mDA09 == null) {
                z2 = true;
                c2622mDA09 = (C2622mD) AbstractC10843y.A01(c2623mE.A07(1668232756));
            }
            C11074v c11074v = c2622mDA09.A00;
            C11074v c11074v2 = ((C2622mD) AbstractC10843y.A01(c2623mE.A07(1937011555))).A00;
            C11074v c11074v3 = ((C2622mD) AbstractC10843y.A01(c2623mE.A07(1937011827))).A00;
            C2622mD c2622mDA010 = c2623mE.A07(1937011571);
            C11074v c11074v4 = c2622mDA010 != null ? c2622mDA010.A00 : null;
            C2622mD c2622mDA011 = c2623mE.A07(1668576371);
            C11074v c11074v5 = c2622mDA011 != null ? c2622mDA011.A00 : null;
            C1450Iv c1450Iv = new C1450Iv(c11074v2, c11074v, z2);
            c11074v3.A0f(12);
            int iA0L = c11074v3.A0L() - 1;
            int iA0L2 = c11074v3.A0L();
            int iA0L3 = c11074v3.A0L();
            int iA0L4 = 0;
            int iA0L5 = 0;
            int iA0C = 0;
            if (c11074v5 != null) {
                c11074v5.A0f(12);
                iA0L5 = c11074v5.A0L();
            }
            int iA0L6 = -1;
            int iA0L7 = 0;
            if (c11074v4 != null) {
                c11074v4.A0f(12);
                iA0L7 = c11074v4.A0L();
                if (iA0L7 > 0) {
                    iA0L6 = c11074v4.A0L() - 1;
                } else {
                    c11074v4 = null;
                }
            }
            int iA8A = c2620mB.A8A();
            String str = jo.A07.A0W;
            int i3 = 0;
            long j2 = 0;
            if (iA8A != -1 && (A0M(967, 9, 94).equals(str) || A0M(897, 15, 77).equals(str) || A0M(882, 15, 96).equals(str)) && iA0L == 0 && iA0L5 == 0 && iA0L7 == 0) {
                long[] jArr2 = new long[c1450Iv.A05];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(26) != strArr2[6].charAt(26)) {
                    A01[2] = "it49YraTc1fDpxLwGLRBh0ec";
                    iArr = new int[c1450Iv.A05];
                } else {
                    String[] strArr3 = A01;
                    strArr3[0] = "cQxifTbk";
                    strArr3[3] = "kvbBtLxb";
                    iArr = new int[c1450Iv.A05];
                }
                while (c1450Iv.A02()) {
                    jArr2[c1450Iv.A00] = c1450Iv.A02;
                    iArr[c1450Iv.A00] = c1450Iv.A01;
                }
                J3 j3A00 = J4.A00(iA8A, jArr2, iArr, iA0L3);
                jArrCopyOf = j3A00.A04;
                iArrCopyOf = j3A00.A03;
                i3 = j3A00.A00;
                jArrCopyOf2 = j3A00.A05;
                iArrCopyOf2 = j3A00.A02;
                j = j3A00.A01;
                jo2 = jo;
            } else {
                jArrCopyOf = new long[iA8v];
                iArrCopyOf = new int[iA8v];
                jArrCopyOf2 = new long[iA8v];
                iArrCopyOf2 = new int[iA8v];
                long j3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    strA0M = A0M(178, 11, 68);
                    if (i5 >= iA8v) {
                        i5 = iA8v;
                        break;
                    }
                    boolean zA02 = true;
                    while (i4 == 0) {
                        zA02 = c1450Iv.A02();
                        if (!zA02) {
                            break;
                        }
                        if (A01[5].charAt(23) != 'W') {
                            throw new RuntimeException();
                        }
                        A01[5] = "M5jbBIfsv36G8eW66Ax72viWGVpCEb4z";
                        j3 = c1450Iv.A02;
                        i4 = c1450Iv.A01;
                    }
                    if (!zA02) {
                        AbstractC10924g.A07(strA0M, A0M(442, 28, 94));
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i5);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i5);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i5);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i5);
                        break;
                    }
                    if (c11074v5 != null) {
                        while (iA0L4 == 0 && iA0L5 > 0) {
                            iA0L4 = c11074v5.A0L();
                            iA0C = c11074v5.A0C();
                            iA0L5--;
                        }
                        iA0L4--;
                    }
                    jArrCopyOf[i5] = j3;
                    iArrCopyOf[i5] = c2620mB.AHS();
                    if (iArrCopyOf[i5] > i3) {
                        i3 = iArrCopyOf[i5];
                    }
                    jArrCopyOf2[i5] = j2 + ((long) iA0C);
                    iArrCopyOf2[i5] = c11074v4 == null ? 1 : 0;
                    if (i5 == iA0L6) {
                        iArrCopyOf2[i5] = 1;
                        iA0L7--;
                        if (iA0L7 > 0) {
                            iA0L6 = ((C11074v) AbstractC10843y.A01(c11074v4)).A0L() - 1;
                        }
                    }
                    j2 += (long) iA0L3;
                    iA0L2--;
                    if (iA0L2 == 0 && iA0L > 0) {
                        iA0L2 = c11074v3.A0L();
                        iA0L3 = c11074v3.A0C();
                        iA0L--;
                    }
                    j3 += (long) iArrCopyOf[i5];
                    i4--;
                    i5++;
                }
                j = j2 + ((long) iA0C);
                boolean z3 = true;
                if (c11074v5 != null) {
                    while (iA0L5 > 0) {
                        if (c11074v5.A0L() != 0) {
                            z3 = false;
                            break;
                        }
                        c11074v5.A0C();
                        iA0L5--;
                    }
                }
                if (iA0L7 == 0 && iA0L2 == 0 && i4 == 0 && iA0L == 0 && iA0L4 == 0 && z3) {
                    jo2 = jo;
                } else {
                    jo2 = jo;
                    StringBuilder sbAppend = new StringBuilder().append(A0M(207, 32, 24)).append(jo2.A00).append(A0M(144, 34, 36)).append(iA0L7).append(A0M(14, 35, 65)).append(iA0L2).append(A0M(85, 26, 14)).append(i4).append(A0M(111, 33, 41)).append(iA0L).append(A0M(49, 36, 31)).append(iA0L4);
                    if (!z3) {
                        strA0M2 = A0M(0, 14, 12);
                    } else if (A01[5].charAt(23) != 'W') {
                        strA0M2 = A0M(0, 0, 93);
                    } else {
                        String[] strArr4 = A01;
                        strArr4[7] = "aaylILcGBS6VDtnpev9y5b4BJZBYR2y3";
                        strArr4[4] = "0XgNPN0ZQsO4pNqGOHtpLFxyHM4aJjFv";
                        strA0M2 = A0M(0, 0, 93);
                    }
                    AbstractC10924g.A07(strA0M, sbAppend.append(strA0M2).toString());
                }
                iA8v = i5;
            }
            long j4 = jo2.A06;
            if (A01[2].length() == 24) {
                String[] strArr5 = A01;
                strArr5[7] = "ipyvZTOv07cYtbuH1DKg84aCsuigBUI1";
                strArr5[4] = "ch7TyunNM6oXEfHdpbs8btnx2NdPJSj4";
                long jA0U = C5C.A0U(j, 1000000L, j4);
                if (jo2.A08 == null) {
                    C5C.A13(jArrCopyOf2, 1000000L, jo2.A06);
                    return new JR(jo, jArrCopyOf, iArrCopyOf, i3, jArrCopyOf2, iArrCopyOf2, jA0U);
                }
                if (jo2.A08.length == 1 && jo2.A03 == 1 && jArrCopyOf2.length >= 2) {
                    long j5 = ((long[]) AbstractC10843y.A01(jo2.A09))[0];
                    long jA0U2 = j5 + C5C.A0U(jo2.A08[0], jo2.A06, jo2.A05);
                    if (A0V(jArrCopyOf2, j, j5, jA0U2)) {
                        long jA0U3 = C5C.A0U(j5 - jArrCopyOf2[0], jo2.A07.A0G, jo2.A06);
                        long jA0U4 = C5C.A0U(j - jA0U2, jo2.A07.A0G, jo2.A06);
                        if (jA0U3 != 0 || jA0U4 != 0) {
                            jArrCopyOf2 = jArrCopyOf2;
                            jArrCopyOf2 = jArrCopyOf2;
                            if (jA0U3 <= 2147483647L && jA0U4 <= 2147483647L) {
                                hk.A00 = (int) jA0U3;
                                hk.A01 = (int) jA0U4;
                                C5C.A13(jArrCopyOf2, 1000000L, jo2.A06);
                                return new JR(jo, jArrCopyOf, iArrCopyOf, i3, jArrCopyOf2, iArrCopyOf2, C5C.A0U(jo2.A08[0], 1000000L, jo2.A05));
                            }
                        }
                    }
                }
                jArrCopyOf2 = jArrCopyOf2;
                jArrCopyOf2 = jArrCopyOf2;
                if (jo2.A08.length == 1 && jo2.A08[0] == 0) {
                    long j6 = ((long[]) AbstractC10843y.A01(jo2.A09))[0];
                    for (int i6 = 0; i6 < jArrCopyOf2.length; i6++) {
                        jArrCopyOf2[i6] = C5C.A0U(jArrCopyOf2[i6] - j6, 1000000L, jo2.A06);
                    }
                    return new JR(jo, jArrCopyOf, iArrCopyOf, i3, jArrCopyOf2, iArrCopyOf2, C5C.A0U(j - j6, 1000000L, jo2.A06));
                }
                boolean z4 = jo2.A03 == 1;
                int i7 = 0;
                int i8 = 0;
                boolean z5 = false;
                int[] iArr2 = new int[jo2.A08.length];
                int[] iArr3 = new int[jo2.A08.length];
                long[] jArr3 = jo2.A09;
                if (A01[5].charAt(23) != 'W') {
                    jArr = (long[]) AbstractC10843y.A01(jArr3);
                    i2 = 0;
                } else {
                    String[] strArr6 = A01;
                    strArr6[0] = "YPXXFbwg";
                    strArr6[3] = "nX0rcUWc";
                    jArr = (long[]) AbstractC10843y.A01(jArr3);
                    i2 = 0;
                }
                while (i2 < jo2.A08.length) {
                    long j7 = jArr[i2];
                    if (j7 != -1) {
                        long jA0U5 = C5C.A0U(jo2.A08[i2], jo2.A06, jo2.A05);
                        iArr2[i2] = C5C.A0L(jArrCopyOf2, j7, true, true);
                        iArr3[i2] = C5C.A0K(jArrCopyOf2, j7 + jA0U5, z4, false);
                        while (iArr2[i2] < iArr3[i2] && (iArrCopyOf2[iArr2[i2]] & 1) == 0) {
                            iArr2[i2] = iArr2[i2] + 1;
                        }
                        i7 += iArr3[i2] - iArr2[i2];
                        String[] strArr7 = A01;
                        if (strArr7[1].charAt(26) != strArr7[6].charAt(26)) {
                            String[] strArr8 = A01;
                            strArr8[0] = "N8MUiUXq";
                            strArr8[3] = "O0bSFd8k";
                            z5 |= i8 != iArr2[i2];
                            i8 = iArr3[i2];
                        }
                    }
                    i2++;
                }
                boolean z6 = z5 | (i7 != iA8v);
                long[] jArr4 = z6 ? new long[i7] : jArrCopyOf;
                int[] iArr4 = z6 ? new int[i7] : iArrCopyOf;
                if (z6) {
                    i3 = 0;
                }
                String[] strArr9 = A01;
                if (strArr9[7].charAt(30) != strArr9[4].charAt(30)) {
                    A01[5] = "xPfk6NQdScK777382m5CuwBWtM3rjqH6";
                    int[] iArr5 = z6 ? new int[i7] : iArrCopyOf2;
                    long[] jArr5 = new long[i7];
                    long j8 = 0;
                    int i9 = 0;
                    for (int i10 = 0; i10 < jo2.A08.length; i10++) {
                        long j9 = jo2.A09[i10];
                        int i11 = iArr2[i10];
                        int i12 = iArr3[i10];
                        if (z6) {
                            int i13 = i12 - i11;
                            System.arraycopy(jArrCopyOf, i11, jArr4, i9, i13);
                            System.arraycopy(iArrCopyOf, i11, iArr4, i9, i13);
                            System.arraycopy(iArrCopyOf2, i11, iArr5, i9, i13);
                        } else if (A01[5].charAt(23) != 'W') {
                            A01[2] = "bpFLG5yiCjaNBTatiJL832yJ";
                        } else {
                            String[] strArr10 = A01;
                            strArr10[0] = "uU6cy1oD";
                            strArr10[3] = "C1luViVj";
                        }
                        while (i11 < i12) {
                            jArr5[i9] = C5C.A0U(j8, 1000000L, jo2.A05) + C5C.A0U(Math.max(0L, jArrCopyOf2[i11] - j9), 1000000L, jo2.A06);
                            if (z6 && iArr4[i9] > i3) {
                                i3 = iArrCopyOf[i11];
                            }
                            i9++;
                            i11++;
                        }
                        j8 += jo2.A08[i10];
                    }
                    return new JR(jo, jArr4, iArr4, i3, jArr5, iArr5, C5C.A0U(j8, 1000000L, jo2.A05));
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A0M(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A00 = new byte[]{70, 74, 9, 30, 30, 25, 74, 3, 4, 28, 11, 6, 3, 14, 11, 7, 85, 66, 74, 70, 78, 73, 78, 73, 64, 116, 70, 74, 87, 75, 66, 84, 102, 83, 115, 78, 74, 66, 84, 83, 70, 74, 87, 99, 66, 75, 83, 70, 7, 85, 89, 11, 28, 20, 24, 16, 23, 16, 23, 30, 42, 24, 20, 9, 21, 28, 10, 56, 13, 45, 16, 20, 28, 10, 13, 24, 20, 9, 54, 31, 31, 10, 28, 13, 89, 68, 72, 26, 13, 5, 9, 1, 6, 1, 6, 15, 59, 9, 5, 24, 4, 13, 27, 33, 6, 43, 0, 29, 6, 3, 72, 99, 111, 61, 42, 34, 46, 38, 33, 38, 33, 40, 27, 38, 34, 42, 60, 59, 46, 34, 63, 11, 42, 35, 59, 46, 12, 39, 46, 33, 40, 42, 60, 111, 120, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 17, 59, 44, 33, 42, 48, 45, 44, 43, 56, 35, 54, 43, 45, 44, 17, 35, 47, 50, 46, 39, 49, 98, 99, 86, 77, 79, 114, 67, 80, 81, 71, 80, 81, 30, 35, 56, 62, 40, 40, 50, 45, 62, 123, 52, 57, 46, 4, 40, 50, 33, 62, 55, 16, 29, 17, 16, 13, 23, 13, 10, 27, 16, 10, 94, 13, 10, 28, 18, 94, 28, 17, 6, 94, 24, 17, 12, 94, 10, 12, 31, 29, 21, 94, 8, 47, 55, 32, 45, 40, 37, 97, 50, 32, 44, 49, 45, 36, 97, 51, 32, 53, 36, 97, 39, 46, 51, 97, 5, 46, 45, 35, 56, 97, 21, 51, 52, 36, 9, 5, 97, 12, 13, 17, 97, 50, 53, 51, 36, 32, 44, 123, 97, 63, 19, 30, 20, 29, 0, 31, 23, 22, 82, 1, 19, 31, 2, 30, 23, 82, 6, 19, 16, 30, 23, 82, 90, 1, 6, 16, 30, 91, 82, 31, 27, 1, 1, 27, 28, 21, 82, 1, 19, 31, 2, 30, 23, 82, 22, 23, 1, 17, 0, 27, 2, 6, 27, 29, 28, 82, 90, 1, 6, 1, 22, 91, 33, 30, 27, 29, 38, 11, 15, 10, 94, 102, 100, 125, 125, 104, 105, 45, 96, 104, 121, 108, 105, 108, 121, 108, 45, 122, 100, 121, 101, 45, 120, 99, 102, 99, 98, 122, 99, 45, 102, 104, 116, 45, 100, 99, 105, 104, 117, 55, 45, 93, 123, 104, 106, 98, 41, 97, 104, 122, 41, 103, 102, 41, 122, 104, 100, 121, 101, 108, 41, 125, 104, 107, 101, 108, 41, 122, 96, 115, 108, 41, 96, 103, 111, 102, 123, 100, 104, 125, 96, 102, 103, 109, 86, 93, 64, 72, 93, 91, 76, 93, 92, 24, 93, 86, 92, 24, 87, 94, 24, 91, 80, 77, 86, 83, 24, 92, 89, 76, 89, 90, 97, 124, 122, AbstractJsonLexerKt.TC_INVALID, AbstractJsonLexerKt.TC_INVALID, 96, 125, 123, 106, 107, 47, 108, 96, 99, 96, 125, 47, 123, 118, AbstractJsonLexerKt.TC_INVALID, 106, 53, 47, 72, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 61, 116, 115, 116, 105, 116, 124, 113, 66, 121, 116, 110, 109, 113, 124, 100, 66, 121, 120, 113, 124, 100, 66, 109, 111, 120, 110, 120, 115, 105, 66, 123, 113, 124, 122, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 81, 89, 88, 85, 93, 28, 78, 93, 72, 89, 18, 25, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 108, 35, 46, 57, 19, 41, 52, 56, 41, 34, 63, 37, 35, 34, 19, 42, 32, 45, 43, 100, 95, 66, 68, 65, 65, 94, 67, 69, 84, 85, 17, 94, 83, 68, 110, 69, 72, 65, 84, 11, 17, 83, 104, 117, 115, 118, 118, 105, 116, 114, 99, 98, 38, 116, 99, 98, 115, 101, 99, 98, 89, 117, 114, 111, 106, 106, 89, 118, 111, 101, 114, 115, 116, 99, 89, 110, 99, 103, 98, 99, 116, 52, 15, 18, 20, 17, 17, 14, 19, 21, 4, 5, 65, 21, 8, 12, 8, 15, 6, 62, 8, 15, 7, 14, 62, 17, 19, 4, 18, 4, 15, 21, 62, 7, 13, 0, 6, 96, 113, 113, 109, 104, 98, 96, 117, 104, 110, 111, 46, 117, 117, 108, 109, 42, 121, 108, 109, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 35, 33, 45, 37, 50, 33, 109, 45, 47, 52, 41, 47, 46, 78, 95, 95, 67, 70, 76, 78, 91, 70, 64, 65, 0, 87, 2, 66, 95, 27, 2, 76, 74, 78, 2, 25, 31, 23, 95, 78, 78, 82, 87, 93, 95, 74, 87, 81, 80, 17, 70, 19, 83, 78, 10, 19, 72, 74, 74, 61, 44, 44, 48, 53, 63, 61, 40, 53, 51, 50, 115, 36, 113, 45, 41, 53, 63, 55, 40, 53, 49, 57, 113, 40, 36, 111, 59, 80, 68, 85, 88, 94, 30, 2, 86, 65, 65, 58, 46, 63, 50, 52, 116, 58, 56, 104, 42, 62, 47, 34, 36, 100, 42, 40, AbstractJsonLexerKt.TC_INVALID, 46, 58, 43, 38, 32, 96, 46, 35, 46, 44, 34, 54, 39, 42, 44, 108, 34, 46, 49, 110, 52, 33, 77, 89, 72, 69, 67, 3, 73, 77, 79, 31, 3, 23, 6, 11, 13, 77, 4, 14, 3, 1, 103, 115, 98, 111, 105, 41, 97, 49, 55, 55, 43, 103, 106, 103, 113, 74, 94, 79, 66, 68, 4, 76, 28, 26, 26, 6, 70, 71, 74, 92, 34, 54, 39, 42, 44, 108, 46, 43, 34, 114, 23, 3, 18, 31, 25, 89, 27, 30, 27, 71, 96, 116, 101, 104, 110, 46, 108, 113, 53, 96, 44, 109, 96, 117, 108, 22, 2, 19, 30, 24, 88, 26, 7, 18, 16, 68, 80, 65, 76, 74, 10, 74, 85, 80, 86, 89, 77, 92, 81, 87, 23, 74, 89, 79, 74, 94, 79, 66, 68, 4, 95, 89, 94, 78, 6, 67, 79, 114, 102, 119, 122, 124, 60, 101, 125, 119, 61, 119, 
        103, 96, 32, 52, 37, 40, 46, 110, 55, 47, 37, 111, 37, 53, 50, 111, 41, 37, 68, 80, 65, 76, 74, 10, 83, 75, 65, 11, 65, 81, 86, 11, 77, 65, 30, 85, 87, 74, 67, 76, 73, 64, 24, 73, 71, 87, 88, 76, 93, 80, 86, 22, 79, 87, 93, 23, 93, 77, 74, 23, 76, 81, 93, 2, 73, 75, 86, 95, 80, 85, 92, 4, 73, 11, 54, 55, 54, 100, 87, 86, 87, 71, 79, 73, 66, 79, 50, 52, 63, 34, 74, 65, 64, 69, 77, 104, 93, 70, 68, 122, 64, 83, 76, 9, 68, 92, 90, 93, 9, 75, 76, 9, 89, 70, 90, 64, 93, 64, 95, 76, 49, 37, 58, 54, 119, 54, 35, 56, 58, 119, 62, 36, 119, 58, 54, 57, 51, 54, 35, 56, 37, 46, 59, 43, 32, 33, 104, 41, 60, 39, 37, 104, 33, 59, 104, 37, 41, 38, 44, 41, 60, 39, 58, 49, 15, 30, 21, 24, 91, 26, 15, 20, 22, 91, 18, 8, 91, 22, 26, 21, 31, 26, 15, 20, 9, 2, 5, 26, 23, 22, 28, 92, 64, 20, 3, 3, 67, 92, 81, 80, 90, 26, 84, 67, 5, 4, 35, 60, 49, 48, 58, 122, 52, 35, 54, 72, 87, 90, 91, 81, 17, 90, 81, 82, 92, 71, 19, 72, 87, 77, 87, 81, 80, 68, 91, 86, 87, 93, 29, 90, 87, 68, 81, 26, 5, 8, 9, 3, 67, 1, 28, 9, 11, 95, 64, 77, 76, 70, 6, 81, 4, 95, 71, 77, 7, 70, 71, 27, 7, 95, 89, 17, 3, 28, 17, 16, 26, 90, 13, 88, 3, 27, 17, 91, 26, 27, 71, 91, 3, 5, 76};
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:119:0x036a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x036c  */
    /* JADX WARN: Code duplicated, block: B:122:0x037d  */
    /* JADX WARN: Code duplicated, block: B:123:0x037f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0386  */
    /* JADX WARN: Code duplicated, block: B:129:0x0399  */
    /* JADX WARN: Code duplicated, block: B:130:0x039f  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x03be  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:173:0x046b  */
    /* JADX WARN: Code duplicated, block: B:175:0x047f  */
    /* JADX WARN: Code duplicated, block: B:176:0x048d  */
    /* JADX WARN: Code duplicated, block: B:185:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x0197  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b6 A[PHI: r2
  0x01b6: PHI (r2v12 int) = (r2v11 int), (r2v56 int) binds: [B:58:0x01b3, B:48:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0286  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Colorspace support for AV1")
    public static void A0R(C11074v c11074v, int i2, int i3, int i4, int i5, int i6, DrmInitData drmInitData, C1453Iy c1453Iy, int i7) throws C3K {
        byte[] bArrArray;
        int iA0C;
        H6 h6A00;
        String[] strArr;
        int iA0I;
        String[] strArr2;
        boolean z2;
        byte[] bArr;
        boolean z3;
        boolean z4;
        boolean z5;
        HL hlA00;
        boolean z6;
        C1399Gv c1399GvA00;
        DrmInitData drmInitDataA01 = drmInitData;
        int iIntValue = i2;
        c11074v.A0f(i3 + 8 + 8);
        c11074v.A0g(16);
        int iA0M = c11074v.A0M();
        int iA0M2 = c11074v.A0M();
        boolean z7 = false;
        float fA00 = 1.0f;
        c11074v.A0g(50);
        int iA09 = c11074v.A09();
        if (iIntValue == 1701733238) {
            Pair<Integer, JP> pairA08 = A08(c11074v, i3, i4);
            if (pairA08 != null) {
                iIntValue = ((Integer) pairA08.first).intValue();
                drmInitDataA01 = drmInitDataA01 == null ? null : drmInitDataA01.A01(((JP) pairA08.second).A02);
                c1453Iy.A03[i7] = (JP) pairA08.second;
            }
            c11074v.A0f(iA09);
        }
        String strA0M = null;
        if (iIntValue == 1831958048) {
            strA0M = A0M(1243, 10, 10);
        } else if (iIntValue == 1211250227) {
            strA0M = A0M(1186, 10, 21);
        }
        List<byte[]> listA04 = null;
        String str = null;
        byte[] bArrA0W = null;
        int i8 = -1;
        C1451Iw c1451IwA0G = null;
        int iA00 = -1;
        int i9 = -1;
        int iA01 = -1;
        ByteBuffer byteBufferA0N = null;
        while (true) {
            int i10 = iA09 - i3;
            if (A01[5].charAt(23) == 'W') {
                A01[5] = "UV8763Z4eJ1eqclMrzFGVnLWDHgV5Y7v";
                if (i10 < i4) {
                    c11074v.A0f(iA09);
                    int iA010 = c11074v.A09();
                    int iA0C2 = c11074v.A0C();
                    if (iA0C2 != 0 || c11074v.A09() - i3 != i4) {
                        boolean z8 = iA0C2 > 0;
                        String strA0M2 = A0M(1090, 30, 79);
                        if (A01[5].charAt(23) != 'W') {
                            HB.A01(z8, strA0M2);
                            iA0C = c11074v.A0C();
                            if (iA0C == 1635148611) {
                                if (strA0M == null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                HB.A01(z6, null);
                                strA0M = A0M(cs.a.INSTANCE_VISIBLE, 9, 51);
                                c11074v.A0f(iA010 + 8);
                                c1399GvA00 = C1399Gv.A00(c11074v);
                                listA04 = c1399GvA00.A05;
                                c1453Iy.A00 = c1399GvA00.A02;
                                if (!z7) {
                                    fA00 = c1399GvA00.A00;
                                }
                                str = c1399GvA00.A04;
                            } else if (iA0C == 1752589123) {
                                if (strA0M == null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                HB.A01(z5, null);
                                strA0M = A0M(1233, 10, 84);
                                c11074v.A0f(iA010 + 8);
                                hlA00 = HL.A00(c11074v);
                                listA04 = hlA00.A08;
                                c1453Iy.A00 = hlA00.A05;
                                if (!z7) {
                                    fA00 = hlA00.A00;
                                }
                                str = hlA00.A07;
                                iA00 = hlA00.A02;
                                i9 = hlA00.A01;
                                iA01 = hlA00.A03;
                            } else if (iA0C != 1685480259 || iA0C == 1685485123) {
                                h6A00 = H6.A00(c11074v);
                                if (h6A00 != null) {
                                    str = h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            } else if (iA0C == 1987076931) {
                                HB.A01(strA0M == null, null);
                                strA0M = iIntValue == 1987063864 ? A0M(1253, 19, 79) : A0M(1272, 19, 19);
                                c11074v.A0f(iA010 + 12);
                                c11074v.A0g(2);
                                boolean z9 = (c11074v.A0I() & 1) != 0;
                                int iA0I2 = c11074v.A0I();
                                int iA0I3 = c11074v.A0I();
                                iA00 = ColorInfo.A00(iA0I2);
                                i9 = z9 ? 1 : 2;
                                iA01 = ColorInfo.A01(iA0I3);
                            } else {
                                String[] strArr3 = A01;
                                if (strArr3[7].charAt(30) != strArr3[4].charAt(30)) {
                                    A01[5] = "obOtuNmXmw3Srs7TxB3R2veWOWOW6QJb";
                                    if (iA0C == 1635135811) {
                                        if (strA0M == null) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        HB.A01(z4, null);
                                        strA0M = A0M(1196, 10, 83);
                                        c11074v.A0f(iA010 + 8);
                                        ColorInfo colorInfoA0B = A0B(c11074v);
                                        iA00 = colorInfoA0B.A02;
                                        i9 = colorInfoA0B.A01;
                                        iA01 = colorInfoA0B.A03;
                                    } else if (iA0C == 1668050025) {
                                        if (byteBufferA0N == null) {
                                            byteBufferA0N = A0N();
                                        }
                                        byteBufferA0N.position(21);
                                        byteBufferA0N.putShort(c11074v.A0b());
                                        byteBufferA0N.putShort(c11074v.A0b());
                                        if (A01[5].charAt(23) != 'W') {
                                            String[] strArr4 = A01;
                                            strArr4[7] = "cMBnz4dZXlFeWyM9hfqqzsh9zqwjLPKg";
                                            strArr4[4] = "lv8fWd8FNFrcw1jaRvaQVznvgsfH83Rg";
                                        } else {
                                            String[] strArr5 = A01;
                                            strArr5[0] = "x7EuuBNN";
                                            strArr5[3] = "05WogHTT";
                                        }
                                    } else if (iA0C == 1835295606) {
                                        if (byteBufferA0N == null) {
                                            byteBufferA0N = A0N();
                                        }
                                        short sA0b = c11074v.A0b();
                                        short sA0b2 = c11074v.A0b();
                                        short sA0b3 = c11074v.A0b();
                                        short sA0b4 = c11074v.A0b();
                                        short sA0b5 = c11074v.A0b();
                                        short sA0b6 = c11074v.A0b();
                                        short sA0b7 = c11074v.A0b();
                                        short sA0b8 = c11074v.A0b();
                                        long jA0Q = c11074v.A0Q();
                                        long jA0Q2 = c11074v.A0Q();
                                        byteBufferA0N.position(1);
                                        byteBufferA0N.putShort(sA0b5);
                                        byteBufferA0N.putShort(sA0b6);
                                        byteBufferA0N.putShort(sA0b);
                                        byteBufferA0N.putShort(sA0b2);
                                        byteBufferA0N.putShort(sA0b3);
                                        byteBufferA0N.putShort(sA0b4);
                                        byteBufferA0N.putShort(sA0b7);
                                        byteBufferA0N.putShort(sA0b8);
                                        byteBufferA0N.putShort((short) (jA0Q / 10000));
                                        byteBufferA0N.putShort((short) (jA0Q2 / 10000));
                                    } else if (iA0C == 1681012275) {
                                        if (strA0M == null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        HB.A01(z3, null);
                                        strA0M = A0M(1186, 10, 21);
                                    } else if (iA0C == 1702061171) {
                                        if (strA0M == null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        HB.A01(z2, null);
                                        c1451IwA0G = A0G(c11074v, iA010);
                                        strA0M = c1451IwA0G.A02;
                                        bArr = c1451IwA0G.A03;
                                        if (bArr != null) {
                                            listA04 = BP.A04(bArr);
                                        }
                                    } else if (iA0C == 1885434736) {
                                        fA00 = A00(c11074v, iA010);
                                        z7 = true;
                                    } else if (iA0C == 1937126244) {
                                        bArrA0W = A0W(c11074v, iA010, iA0C2);
                                    } else if (iA0C == 1936995172) {
                                        iA0I = c11074v.A0I();
                                        c11074v.A0g(3);
                                        if (iA0I == 0) {
                                            switch (c11074v.A0I()) {
                                                case 0:
                                                    i8 = 0;
                                                    break;
                                                case 1:
                                                    i8 = 1;
                                                    break;
                                                case 2:
                                                    i8 = 2;
                                                    break;
                                                case 3:
                                                    i8 = 3;
                                                    break;
                                            }
                                        }
                                        strArr2 = A01;
                                        if (strArr2[0].length() != strArr2[3].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr6 = A01;
                                        strArr6[7] = "0aivzU98O0ZXtjwpHxuX2T7FoukhoekU";
                                        strArr6[4] = "nV94P8gaAxhOD3b386SRtcx64PXkWIfI";
                                    } else if (iA0C != 1668246642 && iA00 == -1 && i9 == -1 && iA01 == -1) {
                                        int iA0C3 = c11074v.A0C();
                                        if (iA0C3 == 1852009592 || iA0C3 == 1852009571) {
                                            int iA0M3 = c11074v.A0M();
                                            int iA0M4 = c11074v.A0M();
                                            c11074v.A0g(2);
                                            boolean z10 = iA0C2 == 19 && (c11074v.A0I() & 128) != 0;
                                            iA00 = ColorInfo.A00(iA0M3);
                                            i9 = z10 ? 1 : 2;
                                            iA01 = ColorInfo.A01(iA0M4);
                                        } else {
                                            AbstractC10924g.A07(A0M(178, 11, 68), A0M(470, 24, 105) + AbstractC1449Iu.A02(iA0C3));
                                            strArr = A01;
                                            if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                                String[] strArr7 = A01;
                                                strArr7[0] = "ZXEhGysO";
                                                strArr7[3] = "dMfXFnuv";
                                            } else {
                                                String[] strArr8 = A01;
                                                strArr8[0] = "PjY9iWjn";
                                                strArr8[3] = "RXgmgrZF";
                                            }
                                        }
                                    } else {
                                        strArr = A01;
                                        if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                            String[] strArr9 = A01;
                                            strArr9[0] = "ZXEhGysO";
                                            strArr9[3] = "dMfXFnuv";
                                        } else {
                                            String[] strArr10 = A01;
                                            strArr10[0] = "PjY9iWjn";
                                            strArr10[3] = "RXgmgrZF";
                                        }
                                    }
                                } else if (iA0C == 1635135811) {
                                    if (strA0M == null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    HB.A01(z4, null);
                                    strA0M = A0M(1196, 10, 83);
                                    c11074v.A0f(iA010 + 8);
                                    ColorInfo colorInfoA0B2 = A0B(c11074v);
                                    iA00 = colorInfoA0B2.A02;
                                    i9 = colorInfoA0B2.A01;
                                    iA01 = colorInfoA0B2.A03;
                                } else if (iA0C == 1668050025) {
                                    if (byteBufferA0N == null) {
                                        byteBufferA0N = A0N();
                                    }
                                    byteBufferA0N.position(21);
                                    byteBufferA0N.putShort(c11074v.A0b());
                                    byteBufferA0N.putShort(c11074v.A0b());
                                    if (A01[5].charAt(23) != 'W') {
                                        String[] strArr11 = A01;
                                        strArr11[7] = "cMBnz4dZXlFeWyM9hfqqzsh9zqwjLPKg";
                                        strArr11[4] = "lv8fWd8FNFrcw1jaRvaQVznvgsfH83Rg";
                                    } else {
                                        String[] strArr12 = A01;
                                        strArr12[0] = "x7EuuBNN";
                                        strArr12[3] = "05WogHTT";
                                    }
                                } else if (iA0C == 1835295606) {
                                    if (byteBufferA0N == null) {
                                        byteBufferA0N = A0N();
                                    }
                                    short sA0b9 = c11074v.A0b();
                                    short sA0b10 = c11074v.A0b();
                                    short sA0b11 = c11074v.A0b();
                                    short sA0b12 = c11074v.A0b();
                                    short sA0b13 = c11074v.A0b();
                                    short sA0b14 = c11074v.A0b();
                                    short sA0b15 = c11074v.A0b();
                                    short sA0b16 = c11074v.A0b();
                                    long jA0Q3 = c11074v.A0Q();
                                    long jA0Q4 = c11074v.A0Q();
                                    byteBufferA0N.position(1);
                                    byteBufferA0N.putShort(sA0b13);
                                    byteBufferA0N.putShort(sA0b14);
                                    byteBufferA0N.putShort(sA0b9);
                                    byteBufferA0N.putShort(sA0b10);
                                    byteBufferA0N.putShort(sA0b11);
                                    byteBufferA0N.putShort(sA0b12);
                                    byteBufferA0N.putShort(sA0b15);
                                    byteBufferA0N.putShort(sA0b16);
                                    byteBufferA0N.putShort((short) (jA0Q3 / 10000));
                                    byteBufferA0N.putShort((short) (jA0Q4 / 10000));
                                } else if (iA0C == 1681012275) {
                                    if (strA0M == null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    HB.A01(z3, null);
                                    strA0M = A0M(1186, 10, 21);
                                } else if (iA0C == 1702061171) {
                                    if (strA0M == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    HB.A01(z2, null);
                                    c1451IwA0G = A0G(c11074v, iA010);
                                    strA0M = c1451IwA0G.A02;
                                    bArr = c1451IwA0G.A03;
                                    if (bArr != null) {
                                        listA04 = BP.A04(bArr);
                                    }
                                } else if (iA0C == 1885434736) {
                                    fA00 = A00(c11074v, iA010);
                                    z7 = true;
                                } else if (iA0C == 1937126244) {
                                    bArrA0W = A0W(c11074v, iA010, iA0C2);
                                } else if (iA0C == 1936995172) {
                                    iA0I = c11074v.A0I();
                                    c11074v.A0g(3);
                                    if (iA0I == 0) {
                                        switch (c11074v.A0I()) {
                                            case 0:
                                                i8 = 0;
                                                break;
                                            case 1:
                                                i8 = 1;
                                                break;
                                            case 2:
                                                i8 = 2;
                                                break;
                                            case 3:
                                                i8 = 3;
                                                break;
                                        }
                                    }
                                    strArr2 = A01;
                                    if (strArr2[0].length() != strArr2[3].length()) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr13 = A01;
                                    strArr13[7] = "0aivzU98O0ZXtjwpHxuX2T7FoukhoekU";
                                    strArr13[4] = "nV94P8gaAxhOD3b386SRtcx64PXkWIfI";
                                } else if (iA0C != 1668246642) {
                                    strArr = A01;
                                    if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                        String[] strArr14 = A01;
                                        strArr14[0] = "ZXEhGysO";
                                        strArr14[3] = "dMfXFnuv";
                                    } else {
                                        String[] strArr15 = A01;
                                        strArr15[0] = "PjY9iWjn";
                                        strArr15[3] = "RXgmgrZF";
                                    }
                                } else {
                                    strArr = A01;
                                    if (strArr[7].charAt(30) != strArr[4].charAt(30)) {
                                        String[] strArr16 = A01;
                                        strArr16[0] = "ZXEhGysO";
                                        strArr16[3] = "dMfXFnuv";
                                    } else {
                                        String[] strArr17 = A01;
                                        strArr17[0] = "PjY9iWjn";
                                        strArr17[3] = "RXgmgrZF";
                                    }
                                }
                            }
                        } else {
                            A01[2] = "a7F234D58gsc4SWrdwKeU3Lp";
                            HB.A01(z8, strA0M2);
                            iA0C = c11074v.A0C();
                            if (iA0C == 1635148611) {
                                if (strA0M == null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                HB.A01(z6, null);
                                strA0M = A0M(cs.a.INSTANCE_VISIBLE, 9, 51);
                                c11074v.A0f(iA010 + 8);
                                c1399GvA00 = C1399Gv.A00(c11074v);
                                listA04 = c1399GvA00.A05;
                                c1453Iy.A00 = c1399GvA00.A02;
                                if (!z7) {
                                    fA00 = c1399GvA00.A00;
                                }
                                str = c1399GvA00.A04;
                            } else if (iA0C == 1752589123) {
                                if (strA0M == null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                HB.A01(z5, null);
                                strA0M = A0M(1233, 10, 84);
                                c11074v.A0f(iA010 + 8);
                                hlA00 = HL.A00(c11074v);
                                listA04 = hlA00.A08;
                                c1453Iy.A00 = hlA00.A05;
                                if (!z7) {
                                    fA00 = hlA00.A00;
                                }
                                str = hlA00.A07;
                                iA00 = hlA00.A02;
                                i9 = hlA00.A01;
                                iA01 = hlA00.A03;
                            } else if (iA0C != 1685480259) {
                                h6A00 = H6.A00(c11074v);
                                if (h6A00 != null) {
                                    str = h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            } else {
                                h6A00 = H6.A00(c11074v);
                                if (h6A00 != null) {
                                    str = h6A00.A02;
                                    strA0M = A0M(1215, 18, 88);
                                }
                            }
                        }
                        iA09 += iA0C2;
                    }
                }
            }
            throw new RuntimeException();
        }
        if (strA0M == null) {
            return;
        }
        C10512p c10512pA0u = new C10512p().A0g(i5).A11(strA0M).A0w(str).A0r(iA0M).A0f(iA0M2).A0Y(fA00).A0l(i6).A13(bArrA0W).A0o(i8).A12(listA04).A0u(drmInitDataA01);
        if (iA00 != -1 || i9 != -1 || iA01 != -1 || byteBufferA0N != null) {
            if (byteBufferA0N != null) {
                bArrArray = byteBufferA0N.array();
                String[] strArr18 = A01;
                if (strArr18[7].charAt(30) != strArr18[4].charAt(30)) {
                    String[] strArr19 = A01;
                    strArr19[1] = "iNSGYMD2WjZqNKpCGRiE11Ag0KcZMJ4O";
                    strArr19[6] = "kUdBVFFCHZ7OFsLW60c88KXDOWnZQcPh";
                }
                throw new RuntimeException();
            }
            bArrArray = null;
            c10512pA0u.A0t(new ColorInfo(iA00, i9, iA01, bArrArray));
        }
        if (c1451IwA0G != null) {
            c10512pA0u.A0a(AbstractC1244As.A03(c1451IwA0G.A00)).A0j(AbstractC1244As.A03(c1451IwA0G.A01));
        }
        c1453Iy.A02 = c10512pA0u.A14();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0350  */
    /* JADX WARN: Code duplicated, block: B:119:0x0370  */
    /* JADX WARN: Code duplicated, block: B:121:0x0375  */
    /* JADX WARN: Code duplicated, block: B:122:0x0381  */
    /* JADX WARN: Code duplicated, block: B:124:0x0386  */
    /* JADX WARN: Code duplicated, block: B:125:0x0392  */
    /* JADX WARN: Code duplicated, block: B:127:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:199:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0203  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C11074v c11074v, int i2, int i3, int i4, int i5, String str, boolean z2, DrmInitData drmInitData, C1453Iy c1453Iy, int i6) throws C3K {
        int iA0M;
        int iA0J;
        String[] strArr;
        int iA04;
        byte[] bArr;
        int iIntValue = i2;
        DrmInitData drmInitDataA01 = drmInitData;
        c11074v.A0f(i3 + 8 + 8);
        int iA0M2 = 0;
        if (z2) {
            iA0M2 = c11074v.A0M();
            c11074v.A0g(6);
        } else {
            c11074v.A0g(8);
        }
        int iA0C = 0;
        int i7 = -1;
        String str2 = null;
        C1451Iw c1451IwA0G = null;
        if (A01[2].length() == 24) {
            String[] strArr2 = A01;
            strArr2[0] = "6JAwliLs";
            strArr2[3] = "MHNM5nZH";
            if (iA0M2 == 0 || iA0M2 == 1) {
                iA0M = c11074v.A0M();
                c11074v.A0g(6);
                iA0J = c11074v.A0J();
                c11074v.A0f(c11074v.A09() - 4);
                iA0C = c11074v.A0C();
                if (iA0M2 == 1) {
                    c11074v.A0g(16);
                }
            } else {
                if (iA0M2 != 2) {
                    return;
                }
                c11074v.A0g(16);
                iA0J = (int) Math.round(c11074v.A06());
                iA0M = c11074v.A0L();
                c11074v.A0g(20);
            }
            int iA09 = c11074v.A09();
            if (iIntValue == 1701733217) {
                Pair<Integer, JP> pairA08 = A08(c11074v, i3, i4);
                if (pairA08 != null) {
                    iIntValue = ((Integer) pairA08.first).intValue();
                    if (drmInitDataA01 != null) {
                        drmInitDataA01 = drmInitDataA01.A01(((JP) pairA08.second).A02);
                    } else if (A01[2].length() != 24) {
                        drmInitDataA01 = null;
                    } else {
                        String[] strArr3 = A01;
                        strArr3[0] = "GRTMmxkT";
                        strArr3[3] = "8R10f2wp";
                        drmInitDataA01 = null;
                    }
                    JP[] jpArr = c1453Iy.A03;
                    JP jp = (JP) pairA08.second;
                    String[] strArr4 = A01;
                    if (strArr4[1].charAt(26) != strArr4[6].charAt(26)) {
                        String[] strArr5 = A01;
                        strArr5[7] = "lvh8KGFHktoLjastkJ82cPetj14Rk4EU";
                        strArr5[4] = "lCZg4scnRLhDwR3AaCs1YjGUJehF9RDz";
                        jpArr[i6] = jp;
                    } else {
                        String[] strArr6 = A01;
                        strArr6[0] = "dju2geGd";
                        strArr6[3] = "bzT2ebja";
                        jpArr[i6] = jp;
                    }
                } else {
                    String[] strArr7 = A01;
                    if (strArr7[0].length() != strArr7[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr8 = A01;
                    strArr8[7] = "gPFMLbY3dC1lU3feUmGywMAQlXFn4oyw";
                    strArr8[4] = "p7gqQJ524nkvgJLmUWGAgmNX9hqHunnJ";
                }
                c11074v.A0f(iA09);
            }
            String strA0M = null;
            if (iIntValue == 1633889587) {
                strA0M = A0M(822, 9, 61);
            } else if (iIntValue == 1700998451) {
                strA0M = A0M(862, 10, 74);
            } else if (iIntValue == 1633889588) {
                String[] strArr9 = A01;
                if (strArr9[7].charAt(30) != strArr9[4].charAt(30)) {
                    String[] strArr10 = A01;
                    strArr10[0] = "ajRR6yPd";
                    strArr10[3] = "wapOpR6f";
                    strA0M = A0M(831, 9, 45);
                } else {
                    strA0M = A0M(831, 9, 45);
                }
            } else if (iIntValue == 1685353315) {
                String[] strArr11 = A01;
                if (strArr11[1].charAt(26) != strArr11[6].charAt(26)) {
                    A01[2] = "KJpCB4t3K52AuUO24XLWBqo9";
                    strA0M = A0M(989, 13, 117);
                }
            } else {
                String[] strArr12 = A01;
                if (strArr12[7].charAt(30) != strArr12[4].charAt(30)) {
                    String[] strArr13 = A01;
                    strArr13[1] = "E8vPAuGqR2xNMC3W8Z6piDguEQA0iYD6";
                    strArr13[6] = "JqGyLM9U6ZTAdL5rS6oZcwJBCNvZXK39";
                    if (iIntValue != 1685353320) {
                        if (iIntValue == 1685353324) {
                            if (iIntValue == 1685353317) {
                                strA0M = A0M(1018, 28, 67);
                            } else if (iIntValue == 1685353336) {
                                strA0M = A0M(1046, 28, 95);
                            } else {
                                strArr = A01;
                                if (strArr[0].length() != strArr[3].length()) {
                                    String[] strArr14 = A01;
                                    strArr14[0] = "UBbPjz2J";
                                    strArr14[3] = "vZen3GMl";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813 || iIntValue == 1936684916) {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    } else if (iIntValue == 1953984371) {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 268435456;
                                    } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                                        strA0M = A0M(947, 10, 17);
                                    } else if (iIntValue == 1835557169) {
                                        strA0M = A0M(912, 10, 37);
                                    } else if (iIntValue == 1835560241) {
                                        strA0M = A0M(922, 10, 16);
                                    } else if (iIntValue == 1634492771) {
                                        if (A01[2].length() != 24) {
                                            String[] strArr15 = A01;
                                            strArr15[7] = "Tx0aPYhLQcdbhycZDJ63DJlxAHLYnZiL";
                                            strArr15[4] = "3h5vNAL3r5q44mC2VqL1y1SAaDe1rbn7";
                                            strA0M = A0M(840, 1, 31);
                                        } else {
                                            A01[5] = "qx3Rs2jX7JB6Nuy9TisbRByWp1zn9Qj8";
                                            strA0M = A0M(840, 10, 41);
                                        }
                                    } else if (iIntValue == 1634492791) {
                                        strA0M = A0M(882, 15, 96);
                                    } else if (iIntValue == 1970037111) {
                                        strA0M = A0M(897, 15, 77);
                                    } else if (iIntValue == 1332770163) {
                                        strA0M = A0M(957, 10, 67);
                                    } else if (iIntValue == 1716281667) {
                                        strA0M = A0M(872, 10, 4);
                                    } else if (iIntValue == 1835823201) {
                                        strA0M = A0M(976, 13, 77);
                                    }
                                } else {
                                    A01[2] = "gBDk9Jrqoo24V0L1mHSTaoLt";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String[] strArr16 = A01;
                    strArr16[0] = "jXw0aAnX";
                    strArr16[3] = "tHH1zIUY";
                    if (iIntValue != 1685353320) {
                        if (iIntValue == 1685353324) {
                            if (iIntValue == 1685353317) {
                                strA0M = A0M(1018, 28, 67);
                            } else if (iIntValue == 1685353336) {
                                strA0M = A0M(1046, 28, 95);
                            } else {
                                strArr = A01;
                                if (strArr[0].length() != strArr[3].length()) {
                                    String[] strArr17 = A01;
                                    strArr17[0] = "UBbPjz2J";
                                    strArr17[3] = "vZen3GMl";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    }
                                } else {
                                    A01[2] = "gBDk9Jrqoo24V0L1mHSTaoLt";
                                    if (iIntValue == 1935764850) {
                                        strA0M = A0M(812, 10, 87);
                                    } else if (iIntValue == 1935767394) {
                                        strA0M = A0M(850, 12, 37);
                                    } else if (iIntValue != 1819304813) {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    } else {
                                        strA0M = A0M(967, 9, 94);
                                        i7 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
                strA0M = A0M(1002, 16, 39);
            }
            List<byte[]> listA04 = null;
            while (iA09 - i3 < i4) {
                c11074v.A0f(iA09);
                int iA0C2 = c11074v.A0C();
                boolean z3 = iA0C2 > 0;
                String strA0M2 = A0M(1090, 30, 79);
                String[] strArr18 = A01;
                if (strArr18[7].charAt(30) != strArr18[4].charAt(30)) {
                    A01[2] = "1WqyRoRGMALZfYpxNfh8k5AQ";
                    HB.A01(z3, strA0M2);
                    int iA0C3 = c11074v.A0C();
                    if (iA0C3 == 1835557187) {
                        int i8 = iA0C2 - 13;
                        byte[] bArr2 = new byte[i8];
                        c11074v.A0f(13 + iA09);
                        c11074v.A0k(bArr2, 0, i8);
                        listA04 = BP.A04(bArr2);
                    } else if (iA0C3 == 1702061171) {
                        if (iA0C3 == 1702061171) {
                            iA04 = iA09;
                        } else {
                            iA04 = A04(c11074v, 1702061171, iA09, iA0C2);
                        }
                        if (iA04 != -1) {
                            c1451IwA0G = A0G(c11074v, iA04);
                            strA0M = c1451IwA0G.A02;
                            bArr = c1451IwA0G.A03;
                            if (bArr != null) {
                                if (A0M(932, 15, 103).equals(strA0M)) {
                                    C1390Gm c1390GmA03 = AbstractC1391Gn.A03(bArr);
                                    iA0J = c1390GmA03.A01;
                                    iA0M = c1390GmA03.A00;
                                    str2 = c1390GmA03.A02;
                                }
                                listA04 = BP.A04(bArr);
                            }
                        }
                    } else {
                        if (z2) {
                            if (A01[5].charAt(23) == 'W') {
                                String[] strArr19 = A01;
                                strArr19[0] = "uRIbW45A";
                                strArr19[3] = "EDIb1o31";
                                if (iA0C3 == 2002876005) {
                                    if (iA0C3 == 1702061171) {
                                        iA04 = iA09;
                                    } else {
                                        iA04 = A04(c11074v, 1702061171, iA09, iA0C2);
                                    }
                                    if (iA04 != -1) {
                                        c1451IwA0G = A0G(c11074v, iA04);
                                        strA0M = c1451IwA0G.A02;
                                        bArr = c1451IwA0G.A03;
                                        if (bArr != null) {
                                            if (A0M(932, 15, 103).equals(strA0M)) {
                                                C1390Gm c1390GmA04 = AbstractC1391Gn.A03(bArr);
                                                iA0J = c1390GmA04.A01;
                                                iA0M = c1390GmA04.A00;
                                                str2 = c1390GmA04.A02;
                                            }
                                            listA04 = BP.A04(bArr);
                                        }
                                    }
                                }
                            } else if (iA0C3 == 2002876005) {
                                if (iA0C3 == 1702061171) {
                                    iA04 = iA09;
                                } else {
                                    iA04 = A04(c11074v, 1702061171, iA09, iA0C2);
                                }
                                if (iA04 != -1) {
                                    c1451IwA0G = A0G(c11074v, iA04);
                                    strA0M = c1451IwA0G.A02;
                                    bArr = c1451IwA0G.A03;
                                    if (bArr != null) {
                                        if (A0M(932, 15, 103).equals(strA0M)) {
                                            C1390Gm c1390GmA05 = AbstractC1391Gn.A03(bArr);
                                            iA0J = c1390GmA05.A01;
                                            iA0M = c1390GmA05.A00;
                                            str2 = c1390GmA05.A02;
                                        }
                                        listA04 = BP.A04(bArr);
                                    }
                                }
                            }
                        }
                        if (iA0C3 == 1684103987) {
                            c11074v.A0f(iA09 + 8);
                            c1453Iy.A02 = AbstractC1395Gr.A07(c11074v, Integer.toString(i5), str, drmInitDataA01);
                        } else if (iA0C3 == 1684366131) {
                            c11074v.A0f(iA09 + 8);
                            c1453Iy.A02 = AbstractC1395Gr.A08(c11074v, Integer.toString(i5), str, drmInitDataA01);
                        } else if (iA0C3 == 1684103988) {
                            c11074v.A0f(iA09 + 8);
                            c1453Iy.A02 = AbstractC1398Gu.A03(c11074v, Integer.toString(i5), str, drmInitDataA01);
                        } else {
                            String[] strArr20 = A01;
                            if (strArr20[7].charAt(30) != strArr20[4].charAt(30)) {
                                String[] strArr21 = A01;
                                strArr21[7] = "XWUeG0Lj6KL9JW7Z7jfQ0rtemNqiryGw";
                                strArr21[4] = "DGFAmtAGFYrNnmS6p9Hy3BCjcLzUjlt2";
                                if (iA0C3 == 1684892784) {
                                    if (iA0C > 0) {
                                        throw C3K.A01(A0M(239, 49, 39) + iA0C, null);
                                    }
                                    iA0M = 2;
                                    iA0J = iA0C;
                                } else if (iA0C3 != 1684305011 || iA0C3 == 1969517683) {
                                    c1453Iy.A02 = new C10512p().A0g(i5).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                                } else if (iA0C3 == 1682927731) {
                                    int i9 = iA0C2 - 8;
                                    byte[] bArrCopyOf = Arrays.copyOf(A02, A02.length + i9);
                                    c11074v.A0f(iA09 + 8);
                                    c11074v.A0k(bArrCopyOf, A02.length, i9);
                                    listA04 = HT.A06(bArrCopyOf);
                                } else if (iA0C3 == 1684425825) {
                                    int i10 = iA0C2 - 12;
                                    byte[] bArr3 = new byte[i10 + 4];
                                    bArr3[0] = 102;
                                    bArr3[1] = 76;
                                    bArr3[2] = 97;
                                    bArr3[3] = 67;
                                    c11074v.A0f(iA09 + 12);
                                    c11074v.A0k(bArr3, 4, i10);
                                    listA04 = BP.A04(bArr3);
                                } else if (iA0C3 == 1634492771) {
                                    int i11 = iA0C2 - 12;
                                    byte[] bArr4 = new byte[i11];
                                    c11074v.A0f(iA09 + 12);
                                    c11074v.A0k(bArr4, 0, i11);
                                    Pair<Integer, Integer> pairA00 = AnonymousClass46.A00(bArr4);
                                    iA0J = ((Integer) pairA00.first).intValue();
                                    iA0M = ((Integer) pairA00.second).intValue();
                                    listA04 = BP.A04(bArr4);
                                }
                            } else if (iA0C3 == 1684892784) {
                                if (iA0C > 0) {
                                    throw C3K.A01(A0M(239, 49, 39) + iA0C, null);
                                }
                                iA0M = 2;
                                iA0J = iA0C;
                            } else if (iA0C3 != 1684305011) {
                                c1453Iy.A02 = new C10512p().A0g(i5).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                            } else {
                                c1453Iy.A02 = new C10512p().A0g(i5).A11(strA0M).A0b(iA0M).A0m(iA0J).A0u(drmInitDataA01).A10(str).A14();
                            }
                        }
                    }
                    iA09 += iA0C2;
                }
            }
            if (c1453Iy.A02 != null || strA0M == null) {
                return;
            }
            C10512p c10512pA10 = new C10512p().A0g(i5).A11(strA0M).A0w(str2).A0b(iA0M).A0m(iA0J).A0i(i7).A12(listA04).A0u(drmInitDataA01).A10(str);
            if (c1451IwA0G != null) {
                c10512pA10.A0a(AbstractC1244As.A03(c1451IwA0G.A00)).A0j(AbstractC1244As.A03(c1451IwA0G.A01));
            }
            c1453Iy.A02 = c10512pA10.A14();
            return;
        }
        throw new RuntimeException();
    }

    static {
        A0P();
        A03 = new int[]{-3374493, -128628077, -2011932550, 38936541};
        A02 = C5C.A1G(A0M(351, 8, 8));
    }

    public static float A00(C11074v c11074v, int i2) {
        c11074v.A0f(i2 + 8);
        int vSpacing = c11074v.A0L();
        int hSpacing = c11074v.A0L();
        return vSpacing / hSpacing;
    }

    public static int A01(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "Iy7m3jJh";
        strArr2[3] = "9tkcHcc8";
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        if (i2 == 1835365473) {
            return 5;
        }
        return -1;
    }

    public static int A02(C11074v c11074v) {
        int iA0I = c11074v.A0I();
        int i2 = iA0I & 127;
        while (true) {
            int i3 = iA0I & 128;
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[4];
            int size = str.charAt(30);
            int currentByte = str2.charAt(30);
            if (size == currentByte) {
                throw new RuntimeException();
            }
            A01[5] = "pSNibJ1kKp1RE21akOqiyNuWX3n84SWQ";
            if (i3 == 128) {
                iA0I = c11074v.A0I();
                int i4 = i2 << 7;
                String[] strArr2 = A01;
                String str3 = strArr2[0];
                String str4 = strArr2[3];
                int size2 = str3.length();
                int currentByte2 = str4.length();
                if (size2 != currentByte2) {
                    String[] strArr3 = A01;
                    strArr3[0] = "dUXzi2Ex";
                    strArr3[3] = "FqHw8aws";
                    int currentByte3 = iA0I & 127;
                    i2 = i4 | currentByte3;
                } else {
                    A01[2] = "53iEjHDa99dBpQfClHLnj3Lr";
                    int currentByte4 = iA0I & 127;
                    i2 = i4 | currentByte4;
                }
            } else {
                return i2;
            }
        }
    }

    public static int A03(C11074v c11074v) {
        c11074v.A0f(16);
        return c11074v.A0C();
    }

    public static int A04(C11074v c11074v, int i2, int i3, int i4) throws C3K {
        int childAtomSize = c11074v.A09();
        HB.A01(childAtomSize >= i3, null);
        while (childAtomPosition < i4) {
            c11074v.A0f(childAtomSize);
            int iA0C = c11074v.A0C();
            boolean z2 = iA0C > 0;
            if (A01[5].charAt(23) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "6gtDIh58mAlo0zqgdjwPUqi1ndJRBK82";
            strArr[4] = "DRBAnAjKoyJp6qnYv3HHxzBKoLLYYD5q";
            HB.A01(z2, A0M(1090, 30, 79));
            int childAtomPosition = c11074v.A0C();
            if (childAtomPosition == i2) {
                return childAtomSize;
            }
            childAtomSize += iA0C;
        }
        return -1;
    }

    public static long A05(C11074v c11074v) {
        int fullAtom = 8;
        c11074v.A0f(8);
        if (AbstractC1449Iu.A01(c11074v.A0C()) != 0) {
            fullAtom = 16;
        }
        c11074v.A0g(fullAtom);
        return c11074v.A0Q();
    }

    public static Pair<Long, String> A06(C11074v c11074v) {
        c11074v.A0f(8);
        int fullAtom = AbstractC1449Iu.A01(c11074v.A0C());
        int languageCode = fullAtom == 0 ? 8 : 16;
        c11074v.A0g(languageCode);
        long jA0Q = c11074v.A0Q();
        int version = fullAtom == 0 ? 4 : 8;
        c11074v.A0g(version);
        int iA0M = c11074v.A0M();
        int languageCode2 = iA0M >> 10;
        StringBuilder sbAppend = new StringBuilder().append(A0M(0, 0, 93)).append((char) ((languageCode2 & 31) + 96));
        int languageCode3 = iA0M >> 5;
        StringBuilder sbAppend2 = sbAppend.append((char) ((languageCode3 & 31) + 96));
        int languageCode4 = iA0M & 31;
        return Pair.create(Long.valueOf(jA0Q), sbAppend2.append((char) (languageCode4 + 96)).toString());
    }

    public static Pair<Integer, JP> A07(C11074v c11074v, int i2, int i3) throws C3K {
        int i4 = i2 + 8;
        int childAtomType = -1;
        int childAtomSize = 0;
        String strA0W = null;
        Integer numValueOf = null;
        while (childPosition < i3) {
            c11074v.A0f(i4);
            int iA0C = c11074v.A0C();
            int iA0C2 = c11074v.A0C();
            int schemeInformationBoxPosition = A01[2].length();
            if (schemeInformationBoxPosition != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[0] = "312zVnav";
            strArr[3] = "fwhHyPzp";
            if (iA0C2 == 1718775137) {
                int childPosition = c11074v.A0C();
                numValueOf = Integer.valueOf(childPosition);
            } else if (iA0C2 == 1935894637) {
                c11074v.A0g(4);
                strA0W = c11074v.A0W(4);
            } else if (iA0C2 == 1935894633) {
                childAtomType = i4;
                childAtomSize = iA0C;
            }
            i4 += iA0C;
        }
        int schemeInformationBoxPosition2 = A01[2].length();
        if (schemeInformationBoxPosition2 == 24) {
            A01[5] = "Q2dt9svTwucQVjxlQtJloRQWafbIItZ7";
            if (A0M(1082, 4, 74).equals(strA0W) || A0M(1074, 4, 51).equals(strA0W) || A0M(1086, 4, 55).equals(strA0W) || A0M(1078, 4, 82).equals(strA0W)) {
                boolean z2 = true;
                HB.A01(numValueOf != null, A0M(1120, 22, 49));
                HB.A01(childAtomType != -1, A0M(1142, 22, 46));
                JP jpA0K = A0K(c11074v, childAtomType, childAtomSize, strA0W);
                if (jpA0K == null) {
                    z2 = false;
                }
                HB.A01(z2, A0M(e.a.ERROR_INSTANCE_LOAD_AUCTION_FAILED, 22, 29));
                return Pair.create(numValueOf, (JP) C5C.A0f(jpA0K));
            }
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r0
  0x0050: PHI (r0v16 'childPosition' int) = (r0v13 'childPosition' int), (r0v19 'childPosition' int) binds: [B:20:0x007e, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0081 A[PHI: r0
  0x0081: PHI (r0v14 'childPosition' int) = (r0v13 'childPosition' int), (r0v19 'childPosition' int) binds: [B:20:0x007e, B:12:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    public static Pair<Integer, JP> A08(C11074v c11074v, int i2, int i3) throws C3K {
        int childPosition;
        boolean z2;
        Pair<Integer, JP> pairA07;
        int iA09 = c11074v.A09();
        while (true) {
            int i4 = iA09 - i2;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int childPosition2 = str2.length();
            if (length != childPosition2) {
                throw new RuntimeException();
            }
            A01[2] = "alPn9WvAmZr8sIghV9sZ4SJG";
            if (i4 < i3) {
                c11074v.A0f(iA09);
                String[] strArr2 = A01;
                String str3 = strArr2[1];
                String str4 = strArr2[6];
                int iCharAt = str3.charAt(26);
                int childPosition3 = str4.charAt(26);
                if (iCharAt != childPosition3) {
                    String[] strArr3 = A01;
                    strArr3[0] = "bSC6gQO3";
                    strArr3[3] = "sEisHoVo";
                    childPosition = c11074v.A0C();
                    if (childPosition > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    String[] strArr4 = A01;
                    strArr4[1] = "sCQufaVXehZdAx160HDrkvqq2FYTSg6V";
                    strArr4[6] = "xgFgm7GbjtAXUGsxujgneuzUGgVoDuJS";
                    childPosition = c11074v.A0C();
                    if (childPosition > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                HB.A01(z2, A0M(1090, 30, 79));
                int childAtomType = c11074v.A0C();
                if (childAtomType == 1936289382 && (pairA07 = A07(c11074v, iA09, childPosition)) != null) {
                    return pairA07;
                }
                iA09 += childPosition;
            } else {
                return null;
            }
        }
    }

    public static Pair<long[], long[]> A09(C2623mE c2623mE) {
        long jA0P;
        C2622mD elstAtom = c2623mE.A07(1701606260);
        if (elstAtom == null) {
            return null;
        }
        C11074v c11074v = elstAtom.A00;
        String[] strArr = A01;
        if (strArr[1].charAt(26) == strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "nlx0JEXKjNTNdSyjBy8qhdzuridSUNe7";
        strArr2[4] = "QPF9oPdHODxNb0EXvgymvar5stnTE0Tg";
        c11074v.A0f(8);
        int version = AbstractC1449Iu.A01(c11074v.A0C());
        int fullAtom = c11074v.A0L();
        long[] jArr = new long[fullAtom];
        long[] jArr2 = new long[fullAtom];
        for (int i2 = 0; i2 < fullAtom; i2++) {
            jArr[i2] = version == 1 ? c11074v.A0R() : c11074v.A0Q();
            if (version == 1) {
                jA0P = c11074v.A0P();
            } else {
                int entryCount = c11074v.A0C();
                jA0P = entryCount;
            }
            jArr2[i2] = jA0P;
            int entryCount2 = c11074v.A0b();
            if (entryCount2 == 1) {
                c11074v.A0g(2);
            } else {
                throw new IllegalArgumentException(A0M(540, 23, 90));
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<Metadata, Metadata> A0A(C2622mD c2622mD) {
        C11074v c11074v = c2622mD.A00;
        c11074v.A0f(8);
        Metadata metadataA0E = null;
        Metadata metadataA0D = null;
        while (true) {
            int iA07 = c11074v.A07();
            String[] strArr = A01;
            if (strArr[7].charAt(30) == strArr[4].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "ATF6ss1I";
            strArr2[3] = "jntry4xS";
            if (iA07 >= 8) {
                int iA09 = c11074v.A09();
                int iA0C = c11074v.A0C();
                int iA0C2 = c11074v.A0C();
                if (iA0C2 == 1835365473) {
                    c11074v.A0f(iA09);
                    metadataA0E = A0E(c11074v, iA09 + iA0C);
                } else if (iA0C2 == 1936553057) {
                    c11074v.A0f(iA09);
                    metadataA0D = A0D(c11074v, iA09 + iA0C);
                }
                c11074v.A0f(iA09 + iA0C);
            } else {
                return Pair.create(metadataA0E, metadataA0D);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return new com.facebook.ads.androidx.media3.common.Metadata(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.androidx.media3.common.Metadata A0C(com.facebook.ads.redexgen.core.C11074v r5, int r6) {
        /*
            r0 = 8
            r5.A0g(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        La:
            int r0 = r5.A09()
            if (r0 >= r6) goto L39
            com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame r4 = com.facebook.ads.redexgen.core.JB.A04(r5)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.J0.A01
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 24
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.J0.A01
            java.lang.String r1 = "lHUs7TBcARFSvdLvQvihflkVmEpZ1MYm"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "ww6ZL200nHcHREaExV9g08P8Dpl3Z1fQ"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto La
            r3.add(r4)
            goto La
        L39:
            boolean r4 = r3.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.J0.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.J0.A01
            java.lang.String r1 = "WnDUA4AhIDsAjF22CXXz4OtQUCX0JoWn"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "j7UA12dewj7emLVLNadXlb6UYVuvbHls"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto L64
        L5f:
            r0 = 0
        L60:
            return r0
        L61:
            if (r4 == 0) goto L64
            goto L5f
        L64:
            com.facebook.ads.androidx.media3.common.Metadata r0 = new com.facebook.ads.androidx.media3.common.Metadata
            r0.<init>(r3)
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.J0.A0C(com.facebook.ads.redexgen.X.4v, int):com.facebook.ads.androidx.media3.common.Metadata");
    }

    public static Metadata A0D(C11074v c11074v, int i2) {
        c11074v.A0g(12);
        while (true) {
            int iA09 = c11074v.A09();
            if (A01[5].charAt(23) != 'W') {
                throw new RuntimeException();
            }
            A01[2] = "yKVAIw0tCkGB7M4Cua27Coqh";
            if (iA09 >= i2) {
                return null;
            }
            int atomSize = c11074v.A09();
            int iA0C = c11074v.A0C();
            int atomPosition = c11074v.A0C();
            if (atomPosition == 1935766900) {
                if (iA0C < 14) {
                    return null;
                }
                c11074v.A0g(5);
                int iA0I = c11074v.A0I();
                if (iA0I != 12 && iA0I != 13) {
                    return null;
                }
                float f = iA0I == 12 ? 240.0f : 120.0f;
                c11074v.A0g(1);
                return new Metadata(new SmtaMetadataEntry(f, c11074v.A0I()));
            }
            c11074v.A0f(atomSize + iA0C);
        }
    }

    public static Metadata A0E(C11074v c11074v, int i2) {
        c11074v.A0g(8);
        A0Q(c11074v);
        while (c11074v.A09() < i2) {
            int iA09 = c11074v.A09();
            int atomType = c11074v.A0C();
            int atomSize = c11074v.A0C();
            if (atomSize == 1768715124) {
                c11074v.A0f(iA09);
                return A0C(c11074v, iA09 + atomType);
            }
            c11074v.A0f(iA09 + atomType);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    public static C1453Iy A0H(C11074v c11074v, int i2, int i3, String str, DrmInitData drmInitData, boolean z2) throws C3K {
        c11074v.A0f(12);
        int iA0C = c11074v.A0C();
        C1453Iy c1453Iy = new C1453Iy(iA0C);
        for (int childStartPosition = 0; childStartPosition < iA0C; childStartPosition++) {
            int iA09 = c11074v.A09();
            int iA0C2 = c11074v.A0C();
            HB.A01(iA0C2 > 0, A0M(1090, 30, 79));
            int iA0C3 = c11074v.A0C();
            if (iA0C3 != 1635148593 && iA0C3 != 1635148595 && iA0C3 != 1701733238 && iA0C3 != 1831958048 && iA0C3 != 1836070006 && iA0C3 != 1752589105 && iA0C3 != 1751479857 && iA0C3 != 1932670515 && iA0C3 != 1211250227 && iA0C3 != 1987063864 && iA0C3 != 1987063865 && iA0C3 != 1635135537 && iA0C3 != 1685479798 && iA0C3 != 1685479729 && iA0C3 != 1685481573 && iA0C3 != 1685481521) {
                if (A01[5].charAt(23) == 'W') {
                    String[] strArr = A01;
                    strArr[0] = "Lno9V07i";
                    strArr[3] = "YEniY2O3";
                    if (iA0C3 == 1836069985 || iA0C3 == 1701733217 || iA0C3 == 1633889587 || iA0C3 == 1700998451 || iA0C3 == 1633889588) {
                        A0T(c11074v, iA0C3, iA09, iA0C2, i2, str, z2, drmInitData, c1453Iy, childStartPosition);
                    } else {
                        if (A01[2].length() != 24) {
                            String[] strArr2 = A01;
                            strArr2[1] = "oNdMvJKT47PBcE7ne9hrfWimoE8yMs3Y";
                            strArr2[6] = "E91ArCAwNKvmlCTKVUGyb2erGBttgGv0";
                            if (iA0C3 != 1835823201) {
                                if (iA0C3 == 1685353315 && iA0C3 != 1685353317 && iA0C3 != 1685353320 && iA0C3 != 1685353324 && iA0C3 != 1685353336 && iA0C3 != 1935764850 && iA0C3 != 1935767394 && iA0C3 != 1819304813 && iA0C3 != 1936684916 && iA0C3 != 1953984371 && iA0C3 != 778924082 && iA0C3 != 778924083 && iA0C3 != 1835557169 && iA0C3 != 1835560241 && iA0C3 != 1634492771 && iA0C3 != 1634492791 && iA0C3 != 1970037111 && iA0C3 != 1332770163 && iA0C3 != 1716281667) {
                                    String[] strArr3 = A01;
                                    if (strArr3[0].length() == strArr3[3].length()) {
                                        A01[5] = "mlJGx5h1gegl7007OPiYCkGWkqECmimV";
                                        if (iA0C3 == 1414810956) {
                                            iA09 = iA09;
                                            iA0C2 = iA0C2;
                                            A0S(c11074v, iA0C3, iA09, iA0C2, i2, str, c1453Iy);
                                        } else {
                                            if (A01[5].charAt(23) != 'W') {
                                                throw new RuntimeException();
                                            }
                                            A01[2] = "522w9jUs1Cdec5FzFXJEv7rx";
                                            if (iA0C3 == 1954034535 || iA0C3 == 2004251764 || iA0C3 == 1937010800 || iA0C3 == 1664495672) {
                                                iA09 = iA09;
                                                iA0C2 = iA0C2;
                                                A0S(c11074v, iA0C3, iA09, iA0C2, i2, str, c1453Iy);
                                            } else if (iA0C3 == 1835365492) {
                                                A0U(c11074v, iA0C3, iA09, i2, c1453Iy);
                                            } else if (iA0C3 == 1667329389) {
                                                c1453Iy.A02 = new C10512p().A0g(i2).A11(A0M(IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER, 27, 38)).A14();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A01[2] = "3e9ArAGLRrjfeL1rnoEKSVyw";
                            if (iA0C3 != 1835823201) {
                                if (iA0C3 == 1685353315) {
                                }
                            }
                        }
                        A0T(c11074v, iA0C3, iA09, iA0C2, i2, str, z2, drmInitData, c1453Iy, childStartPosition);
                    }
                }
                throw new RuntimeException();
            }
            A0R(c11074v, iA0C3, iA09, iA0C2, i2, i3, drmInitData, c1453Iy, childStartPosition);
            c11074v.A0f(iA09 + iA0C2);
        }
        return c1453Iy;
    }

    public static ByteBuffer A0N() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.extractor.mp4.Track, com.facebook.ads.androidx.media3.extractor.mp4.Track> */
    public static List<JR> A0O(C2623mE c2623mE, HK hk, long j, DrmInitData drmInitData, boolean z2, boolean z3, InterfaceC2511kO<JO, JO> interfaceC2511kO) throws C3K {
        JO joA4B;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c2623mE.A01.size(); i2++) {
            C2623mE c2623mE2 = c2623mE.A01.get(i2);
            if (((AbstractC1449Iu) c2623mE2).A00 == 1953653099 && (joA4B = interfaceC2511kO.A4B(A0J(c2623mE2, (C2622mD) AbstractC10843y.A01(c2623mE.A07(1836476516)), j, drmInitData, z2, z3))) != null) {
                C2623mE c2623mE3 = (C2623mE) AbstractC10843y.A01(c2623mE2.A06(1835297121));
                if (A01[2].length() != 24) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "jveTcVJC";
                strArr[3] = "kDhQUkZe";
                arrayList.add(A0L(joA4B, (C2623mE) AbstractC10843y.A01(((C2623mE) AbstractC10843y.A01(c2623mE3.A06(1835626086))).A06(1937007212)), hk));
            }
        }
        return arrayList;
    }

    public static void A0Q(C11074v c11074v) {
        int iA09 = c11074v.A09();
        c11074v.A0g(4);
        if (c11074v.A0C() != 1751411826) {
            iA09 += 4;
        }
        c11074v.A0f(iA09);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<byte[]> */
    public static void A0S(C11074v c11074v, int i2, int i3, int i4, int i5, String str, C1453Iy c1453Iy) {
        String strA0M;
        c11074v.A0f(i3 + 8 + 8);
        BP bpA04 = null;
        long j = Long.MAX_VALUE;
        if (i2 == 1414810956) {
            strA0M = A0M(691, 20, 103);
        } else if (i2 == 1954034535) {
            strA0M = A0M(784, 28, 58);
            int sampleDescriptionLength = (i4 - 8) - 8;
            byte[] bArr = new byte[sampleDescriptionLength];
            c11074v.A0k(bArr, 0, sampleDescriptionLength);
            bpA04 = BP.A04(bArr);
        } else if (i2 == 2004251764) {
            strA0M = A0M(763, 21, 88);
        } else if (i2 == 1937010800) {
            strA0M = A0M(691, 20, 103);
            j = 0;
        } else if (i2 == 1664495672) {
            strA0M = A0M(738, 25, 73);
            c1453Iy.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c1453Iy.A02 = new C10512p().A0g(i5).A11(strA0M).A10(str).A0s(j).A12(bpA04).A14();
    }

    public static void A0U(C11074v c11074v, int i2, int i3, int i4, C1453Iy c1453Iy) {
        c11074v.A0f(i3 + 8 + 8);
        if (i2 == 1835365492) {
            c11074v.A0U();
            String strA0U = c11074v.A0U();
            if (strA0U != null) {
                c1453Iy.A02 = new C10512p().A0g(i4).A11(strA0U).A14();
            }
        }
    }

    public static boolean A0V(long[] jArr, long j, long j2, long j3) {
        int latestDelayIndex = jArr.length - 1;
        int iA07 = C5C.A07(4, 0, latestDelayIndex);
        int lastIndex = jArr.length;
        int latestDelayIndex2 = C5C.A07(lastIndex - 4, 0, latestDelayIndex);
        if (jArr[0] <= j2) {
            long j4 = jArr[iA07];
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[3];
            int length = str.length();
            int lastIndex2 = str2.length();
            if (length != lastIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "4d2838LB6zuHL2SDSRFgaAe0bfX5eWcN";
            strArr2[4] = "2DmC9sheXkti4jYQDflGydtNBiOhlXlc";
            if (j2 < j4 && jArr[latestDelayIndex2] < j3 && j3 <= j) {
                return true;
            }
        }
        return false;
    }

    public static byte[] A0W(C11074v c11074v, int i2, int i3) {
        int i4 = i2 + 8;
        while (childPosition < i3) {
            c11074v.A0f(i4);
            int iA0C = c11074v.A0C();
            int iA0C2 = c11074v.A0C();
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[4];
            int childAtomSize = str.charAt(30);
            int childPosition = str2.charAt(30);
            if (childAtomSize == childPosition) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "QfAHDCYR";
            strArr2[3] = "If6V2JqI";
            if (iA0C2 == 1886547818) {
                int childPosition2 = i4 + iA0C;
                return Arrays.copyOfRange(c11074v.A0l(), i4, childPosition2);
            }
            i4 += iA0C;
        }
        return null;
    }
}
