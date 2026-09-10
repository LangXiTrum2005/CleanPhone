package com.facebook.ads.redexgen.core;

import android.util.Base64;
import com.google.android.exoplayer2.Metadata;
import com.google.android.exoplayer2.extractor.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.extractor.metadata.vorbis.VorbisComment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1093Uv {
    public static byte[] A00;
    public static String[] A01 = {"K3Hvcn0QQZPqeTXlDvWNe1WQnNJGU4eO", "CrxDDnVP6T8axTGQ3xBb8C6obcEa6z", "luczMKT4QPUJt9pPpwptiBTuc1nxPY", "dc5VY6vrXlBjohbU4WOLC507PCDplm", "vLl1dRUqOhYJTcch0Lu8hqOpyXWph2Y2", "dBvQ4rm21Gvm3xo3tJ8ZErGDau928biw", "4K6zukpQLRs6ycFwEsql16shLElNJvVX", "tmniLU8yRwHHqnX2vfI0lIFQNHGyvqAK"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1092Uu A06(C1576fq c1576fq) throws Q6 {
        A0C(1, c1576fq, false);
        int iA0F = c1576fq.A0F();
        int iA0I = c1576fq.A0I();
        int iA0F2 = c1576fq.A0F();
        int iA0E = c1576fq.A0E();
        if (iA0E <= 0) {
            iA0E = -1;
        }
        int iA0E2 = c1576fq.A0E();
        if (iA0E2 <= 0) {
            iA0E2 = -1;
        }
        int iA0E3 = c1576fq.A0E();
        if (iA0E3 <= 0) {
            iA0E3 = -1;
        }
        int iA0I2 = c1576fq.A0I();
        return new C1092Uu(iA0F, iA0I, iA0F2, iA0E, iA0E2, iA0E3, (int) Math.pow(2.0d, iA0I2 & 15), (int) Math.pow(2.0d, (iA0I2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (c1576fq.A0I() & 1) > 0, Arrays.copyOf(c1576fq.A0l(), c1576fq.A0A()));
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{10, 115, 84, 92, 89, 80, 81, 21, 65, 90, 21, 69, 84, 71, 70, 80, 21, 99, 90, 71, 87, 92, 70, 21, 86, 90, 88, 88, 80, 91, 65, cw.m, 21, 115, 84, 92, 89, 80, 81, 21, 65, 90, 21, 69, 84, 71, 70, 80, 21, 67, 90, 71, 87, 92, 70, 21, 69, 92, 86, 65, 64, 71, 80, 20, 28, cw.k, 24, 29, 24, cw.k, 24, 6, 27, 21, 22, 26, 18, 6, 9, cw.n, 26, cw.k, 12, 11, 28, 121, 64, 93, 77, 70, 92, 122, 91, 70, 67, 38, 59, 51, 38, 32, 55, 38, 39, 99, 32, 43, 34, 49, 34, 32, 55, 38, 49, 48, 99, 100, 53, 44, 49, 33, 42, 48, 100, 57, 36, 44, 57, 63, 40, 57, 56, 124, 63, 51, 56, 57, 124, 62, 51, 51, 55, 124, 40, 51, 124, 47, 40, 61, 46, 40, 124, 43, 53, 40, 52, 124, 7, 108, 36, 105, 106, 112, 124, 108, 36, 104, 111, 112, 124, 108, 36, 104, 110, 1, 124, 61, 40, 124, 123, 102, 110, 123, 125, 106, 123, 122, 62, 118, 123, 127, 122, 123, 108, 62, 106, 103, 110, 123, 62, 40, 34, 33, 33, 60, 110, 58, 55, 62, 43, 110, 41, 60, 43, 47, 58, 43, 60, 110, 58, 38, 47, 32, 110, 127, 110, 32, 33, 58, 110, 42, 43, 45, 33, 42, 47, 44, 34, 43, 116, 110, cw.l, 26, 9, 5, 1, 6, cw.m, 72, 10, 1, 28, 72, 9, cw.l, 28, cw.k, 26, 72, 5, 7, 12, cw.k, 27, 72, 6, 7, 28, 72, 27, cw.k, 28, 72, 9, 27, 72, cw.k, cw.n, 24, cw.k, 11, 28, cw.k, 12, 81, 69, 86, 90, 94, 89, 80, 23, 85, 94, 67, 23, 82, 79, 71, 82, 84, 67, 82, 83, 23, 67, 88, 23, 85, 82, 23, 68, 82, 67, 110, 109, 109, 105, 119, 114, 34, 118, 123, 114, 103, 34, 101, 112, 103, 99, 118, 103, 112, 34, 118, 106, 99, 108, 34, 48, 34, 108, 109, 118, 34, 102, 103, 97, 109, 102, 99, 96, 110, 103, 56, 34, 103, 107, 122, 122, 99, 100, 109, 42, 126, 115, 122, 111, 42, 101, 126, 98, 111, 120, 42, 126, 98, 107, 100, 42, 58, 42, 100, 101, 126, 42, 121, 127, 122, 122, 101, 120, 126, 111, 110, 48, 42, 31, 3, cw.l, 12, 10, 7, 0, 3, 11, 10, 29, 79, 0, 9, 79, 27, 6, 2, 10, 79, 11, 0, 2, cw.l, 6, 1, 79, 27, 29, cw.l, 1, 28, 9, 0, 29, 2, 28, 79, 1, 0, 27, 79, 21, 10, 29, 0, 10, 11, 79, 0, 26, 27, 86, 65, 87, 77, 64, 81, 65, 112, 93, 84, 65, 4, 67, 86, 65, 69, 80, 65, 86, 4, 80, 76, 69, 74, 4, 22, 4, 77, 87, 4, 74, 75, 80, 4, 64, 65, 71, 75, 64, 69, 70, 72, 65, 89, 66, cw.k, 95, 72, 94, 72, 95, 91, 72, 73, cw.k, 79, 68, 89, 94, cw.k, 64, 88, 94, 89, cw.k, 79, 72, cw.k, 87, 72, 95, 66, cw.k, 76, 75, 89, 72, 95, cw.k, 64, 76, 93, 93, 68, 67, 74, cw.k, 78, 66, 88, 93, 65, 68, 67, 74, cw.k, 94, 89, 72, 93, 94, 95, 68, 68, 11, 88, 67, 68, 89, 95, 11, 67, 78, 74, 79, 78, 89, 17, 11};
    }

    static {
        A08();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    public static Metadata A02(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrA1P = AbstractC1600gE.A1P(str, A07(0, 1, 2));
            int length = strArrA1P.length;
            String strA07 = A07(85, 10, 26);
            if (length != 2) {
                AbstractC1561fb.A07(strA07, A07(1, 32, 0) + str);
            } else if (strArrA1P[0].equals(A07(63, 22, 108))) {
                try {
                    arrayList.add(PictureFrame.A00(new C1576fq(Base64.decode(strArrA1P[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC1561fb.A0A(strA07, A07(33, 30, 0), e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrA1P[0], strArrA1P[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    public static C1089Ur A03(C1088Uq c1088Uq) throws Q6 {
        int lookupType;
        long jA01;
        if (c1088Uq.A02(24) == 5653314) {
            int iA02 = c1088Uq.A02(16);
            int iA03 = c1088Uq.A02(24);
            long[] jArr = new long[iA03];
            boolean zA04 = c1088Uq.A04();
            if (!zA04) {
                boolean isSparse = c1088Uq.A04();
                String[] strArr = A01;
                String str = strArr[7];
                String str2 = strArr[0];
                int dimensions = str.charAt(23);
                int entries = str2.charAt(23);
                if (dimensions == entries) {
                    A01[4] = "J9prgbVNYTmaCJfhLPzFHsGLtJtZbmI1";
                    for (int length = 0; length < entries; length++) {
                        if (isSparse) {
                            if (c1088Uq.A04()) {
                                int entries2 = c1088Uq.A02(5);
                                jArr[length] = entries2 + 1;
                            } else {
                                jArr[length] = 0;
                            }
                        } else {
                            int entries3 = c1088Uq.A02(5);
                            jArr[length] = entries3 + 1;
                        }
                    }
                    lookupType = c1088Uq.A02(4);
                    if (lookupType <= 2) {
                        if (lookupType != 1 || lookupType == 2) {
                            c1088Uq.A03(32);
                            c1088Uq.A03(32);
                            int iA04 = c1088Uq.A02(4) + 1;
                            c1088Uq.A03(1);
                            if (lookupType == 1) {
                                if (iA02 != 0) {
                                    jA01 = A01(iA03, iA02);
                                } else {
                                    jA01 = 0;
                                }
                            } else {
                                jA01 = ((long) iA03) * ((long) iA02);
                            }
                            int entries4 = (int) (((long) iA04) * jA01);
                            c1088Uq.A03(entries4);
                        }
                        return new C1089Ur(iA02, iA03, jArr, lookupType, zA04);
                    }
                    throw Q6.A01(A07(313, 42, 55) + lookupType, null);
                }
                throw new RuntimeException();
            }
            int iA05 = c1088Uq.A02(5);
            String[] strArr2 = A01;
            String str3 = strArr2[5];
            String str4 = strArr2[6];
            int dimensions2 = str3.charAt(27);
            int entries5 = str4.charAt(27);
            if (dimensions2 != entries5) {
                String[] strArr3 = A01;
                strArr3[5] = "8okhX7wb8GD9IBCce3eW05oA4TvmRIhe";
                strArr3[6] = "Lzl8QrqFZCAsn0oAP06zpr2HKkkFlykw";
                int i = iA05 + 1;
                int length2 = 0;
                while (length2 < entries) {
                    int entries6 = iA03 - length2;
                    int num = c1088Uq.A02(A00(entries6));
                    for (int i2 = 0; i2 < num; i2++) {
                        int entries7 = jArr.length;
                        if (length2 >= entries7) {
                            break;
                        }
                        jArr[length2] = i;
                        length2++;
                    }
                    i++;
                }
                lookupType = c1088Uq.A02(4);
                if (lookupType <= 2) {
                    if (lookupType != 1) {
                        c1088Uq.A03(32);
                        c1088Uq.A03(32);
                        int iA06 = c1088Uq.A02(4) + 1;
                        c1088Uq.A03(1);
                        if (lookupType == 1) {
                            if (iA02 != 0) {
                                jA01 = A01(iA03, iA02);
                            } else {
                                jA01 = 0;
                            }
                        } else {
                            jA01 = ((long) iA03) * ((long) iA02);
                        }
                        int entries8 = (int) (((long) iA06) * jA01);
                        c1088Uq.A03(entries8);
                    } else {
                        c1088Uq.A03(32);
                        c1088Uq.A03(32);
                        int iA07 = c1088Uq.A02(4) + 1;
                        c1088Uq.A03(1);
                        if (lookupType == 1) {
                            if (iA02 != 0) {
                                jA01 = A01(iA03, iA02);
                            } else {
                                jA01 = 0;
                            }
                        } else {
                            jA01 = ((long) iA03) * ((long) iA02);
                        }
                        int entries9 = (int) (((long) iA07) * jA01);
                        c1088Uq.A03(entries9);
                    }
                    return new C1089Ur(iA02, iA03, jArr, lookupType, zA04);
                }
                throw Q6.A01(A07(313, 42, 55) + lookupType, null);
            }
            throw new RuntimeException();
        }
        throw Q6.A01(A07(123, 55, 105) + c1088Uq.A01(), null);
    }

    public static C1090Us A04(C1576fq c1576fq) throws Q6 {
        return A05(c1576fq, true, true);
    }

    public static C1090Us A05(C1576fq c1576fq, boolean z, boolean z2) throws Q6 {
        if (z) {
            A0C(3, c1576fq, false);
        }
        int length = (int) c1576fq.A0O();
        String strA0W = c1576fq.A0W(length);
        int length2 = strA0W.length();
        int i = 7 + 4 + length2;
        long jA0O = c1576fq.A0O();
        int length3 = (int) jA0O;
        String[] comments = new String[length3];
        int i2 = i + 4;
        int i3 = 0;
        while (commentListLen < jA0O) {
            long commentListLen = c1576fq.A0O();
            int length4 = (int) commentListLen;
            comments[i3] = c1576fq.A0W(length4);
            int length5 = comments[i3].length();
            i2 = i2 + 4 + length5;
            i3++;
        }
        if (z2) {
            int length6 = c1576fq.A0I();
            if ((length6 & 1) == 0) {
                String vendor = A07(283, 30, 2);
                throw Q6.A01(vendor, null);
            }
        }
        return new C1090Us(strA0W, comments, i2 + 1);
    }

    public static void A09(int i, C1088Uq c1088Uq) throws Q6 {
        int iA02;
        int iA03 = c1088Uq.A02(6) + 1;
        for (int i2 = 0; i2 < iA03; i2++) {
            int iA04 = c1088Uq.A02(16);
            if (iA04 != 0) {
                AbstractC1561fb.A05(A07(85, 10, 26), A07(355, 41, 63) + iA04);
            } else {
                if (c1088Uq.A04()) {
                    iA02 = c1088Uq.A02(4) + 1;
                } else {
                    iA02 = 1;
                }
                if (c1088Uq.A04()) {
                    int j = c1088Uq.A02(8) + 1;
                    for (int i3 = 0; i3 < j; i3++) {
                        int mappingsCount = i - 1;
                        c1088Uq.A03(A00(mappingsCount));
                        int mappingsCount2 = i - 1;
                        c1088Uq.A03(A00(mappingsCount2));
                    }
                }
                int mappingsCount3 = c1088Uq.A02(2);
                if (mappingsCount3 == 0) {
                    if (iA02 > 1) {
                        for (int mappingsCount4 = 0; mappingsCount4 < i; mappingsCount4++) {
                            c1088Uq.A03(4);
                        }
                    }
                    for (int mappingsCount5 = 0; mappingsCount5 < iA02; mappingsCount5++) {
                        c1088Uq.A03(8);
                        c1088Uq.A03(8);
                        c1088Uq.A03(8);
                    }
                } else {
                    throw Q6.A01(A07(491, 58, 24), null);
                }
            }
        }
    }

    public static void A0A(C1088Uq c1088Uq) throws Q6 {
        int iA02 = c1088Uq.A02(6) + 1;
        for (int floorNumberOfBooks = 0; floorNumberOfBooks < iA02; floorNumberOfBooks++) {
            int iA03 = c1088Uq.A02(16);
            switch (iA03) {
                case 0:
                    c1088Uq.A03(8);
                    c1088Uq.A03(16);
                    c1088Uq.A03(16);
                    c1088Uq.A03(6);
                    c1088Uq.A03(8);
                    int floorCount = c1088Uq.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i = 0; i < floorCount2; i++) {
                        c1088Uq.A03(8);
                    }
                    break;
                case 1:
                    int count = c1088Uq.A02(5);
                    int j = -1;
                    int floorCount3 = A01[4].charAt(15);
                    if (floorCount3 == 104) {
                        String[] strArr = A01;
                        strArr[7] = "APngblGrETjX7Rlp4aNVR8VQbBdiHdvI";
                        strArr[0] = "CjhLYKx32jgQnRJ0j2aEX8hQ0Odkx9P4";
                        int[] iArr = new int[count];
                        for (int i2 = 0; i2 < count; i2++) {
                            int floorCount4 = c1088Uq.A02(4);
                            iArr[i2] = floorCount4;
                            int floorCount5 = iArr[i2];
                            if (floorCount5 > j) {
                                j = iArr[i2];
                            }
                        }
                        int[] iArr2 = new int[j + 1];
                        for (int i3 = 0; i3 < iArr2.length; i3++) {
                            iArr2[i3] = c1088Uq.A02(3) + 1;
                            int iA04 = c1088Uq.A02(2);
                            if (iA04 > 0) {
                                c1088Uq.A03(8);
                            }
                            for (int floorCount6 = 0; floorCount6 < (1 << iA04); floorCount6++) {
                                c1088Uq.A03(8);
                            }
                        }
                        c1088Uq.A03(2);
                        int j2 = c1088Uq.A02(4);
                        int i4 = 0;
                        int maximumClass = 0;
                        for (int i5 = 0; i5 < count; i5++) {
                            int idx = iArr[i5];
                            String[] strArr2 = A01;
                            String str = strArr2[7];
                            String str2 = strArr2[0];
                            int floorCount7 = str.charAt(23);
                            if (floorCount7 == str2.charAt(23)) {
                                A01[4] = "0XYpGybw1VOGnmkhxfDizr1jAAtJPNAx";
                                i4 += iArr2[idx];
                                while (maximumClass < i4) {
                                    c1088Uq.A03(j2);
                                    maximumClass++;
                                }
                            }
                        }
                        break;
                    }
                    throw new RuntimeException();
                default:
                    throw Q6.A01(A07(199, 41, 123) + iA03, null);
            }
        }
    }

    public static void A0B(C1088Uq c1088Uq) throws Q6 {
        int iA02 = c1088Uq.A02(6) + 1;
        for (int i = 0; i < iA02; i++) {
            int residueCount = c1088Uq.A02(16);
            if (residueCount <= 2) {
                c1088Uq.A03(24);
                c1088Uq.A03(24);
                c1088Uq.A03(24);
                int iA03 = c1088Uq.A02(6) + 1;
                c1088Uq.A03(8);
                int[] iArr = new int[iA03];
                for (int i2 = 0; i2 < iA03; i2++) {
                    int iA04 = 0;
                    int residueCount2 = c1088Uq.A02(3);
                    if (c1088Uq.A04()) {
                        iA04 = c1088Uq.A02(5);
                    }
                    iArr[i2] = (iA04 * 8) + residueCount2;
                }
                for (int i3 = 0; i3 < iA03; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int residueCount3 = iArr[i3];
                        if ((residueCount3 & (1 << i4)) != 0) {
                            c1088Uq.A03(8);
                        }
                    }
                }
            } else {
                throw Q6.A01(A07(448, 43, 17), null);
            }
        }
    }

    public static boolean A0C(int i, C1576fq c1576fq, boolean z) throws Q6 {
        if (c1576fq.A07() < 7) {
            if (z) {
                return false;
            }
            throw Q6.A01(A07(549, 18, 30) + c1576fq.A07(), null);
        }
        if (c1576fq.A0I() != i) {
            if (z) {
                return false;
            }
            throw Q6.A01(A07(178, 21, 43) + Integer.toHexString(i), null);
        }
        if (c1576fq.A0I() != 118 || c1576fq.A0I() != 111 || c1576fq.A0I() != 114 || c1576fq.A0I() != 98 || c1576fq.A0I() != 105 || c1576fq.A0I() != 115) {
            if (z) {
                return false;
            }
            throw Q6.A01(A07(95, 28, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE), null);
        }
        return true;
    }

    public static C1091Ut[] A0D(C1088Uq c1088Uq) {
        int iA02 = c1088Uq.A02(6) + 1;
        C1091Ut[] c1091UtArr = new C1091Ut[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = c1088Uq.A04();
            int iA03 = c1088Uq.A02(16);
            int i = c1088Uq.A02(16);
            c1091UtArr[windowType] = new C1091Ut(zA04, iA03, i, c1088Uq.A02(8));
        }
        return c1091UtArr;
    }

    public static C1091Ut[] A0E(C1576fq c1576fq, int i) throws Q6 {
        A0C(5, c1576fq, false);
        int iA0I = c1576fq.A0I() + 1;
        C1088Uq c1088Uq = new C1088Uq(c1576fq.A0l());
        int numberOfBooks = c1576fq.A09();
        c1088Uq.A03(numberOfBooks * 8);
        for (int i2 = 0; i2 < iA0I; i2++) {
            A03(c1088Uq);
            String[] strArr = A01;
            String str = strArr[5];
            String str2 = strArr[6];
            int iCharAt = str.charAt(27);
            int numberOfBooks2 = str2.charAt(27);
            if (iCharAt == numberOfBooks2) {
                throw new RuntimeException();
            }
            A01[3] = "74cTHtRYpeQKzhZv6wn9jFrgtrQ2qO";
        }
        int numberOfBooks3 = c1088Uq.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i3 = 0; i3 < timeCount; i3++) {
            int numberOfBooks4 = c1088Uq.A02(16);
            if (numberOfBooks4 != 0) {
                throw Q6.A01(A07(396, 52, 90), null);
            }
        }
        A0A(c1088Uq);
        String[] strArr2 = A01;
        String str3 = strArr2[1];
        String str4 = strArr2[2];
        int length = str3.length();
        int numberOfBooks5 = str4.length();
        if (length != numberOfBooks5) {
            throw new RuntimeException();
        }
        A01[3] = "e0G1wddwIFNckCOWajmZBKihiSzbHl";
        A0B(c1088Uq);
        A09(i, c1088Uq);
        C1091Ut[] c1091UtArrA0D = A0D(c1088Uq);
        if (c1088Uq.A04()) {
            return c1091UtArrA0D;
        }
        throw Q6.A01(A07(PsExtractor.VIDEO_STREAM_MASK, 43, 93), null);
    }
}
