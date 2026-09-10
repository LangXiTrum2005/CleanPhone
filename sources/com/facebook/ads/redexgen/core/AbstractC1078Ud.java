package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.ColorInfo;
import com.umeng.analytics.pro.bc;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1078Ud {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"6rUpOt", "hn9LigjnzaPPiWEO7430KrcMssTSytJd", "a", "vdeA85UYbfwMQioqiV4C8NfSnJKSUYiM", "ostobhiogcGR", "9Jmz0denfaSmqed8IokkJxNqS4ms97nH", "SsxwXCJgMJHLZEEBVBKf1rXJBO0yUwEx", "eRApIXQHySPbq6FfoB9DhvJy33SLpCWm"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1076Ua A06(byte[] bArr, int i, int i2) {
        C1080Uf c1080Uf = new C1080Uf(bArr, i, i2);
        int iA00 = -1;
        int i3 = -1;
        int iA01 = -1;
        c1080Uf.A07(4);
        int iA05 = c1080Uf.A05(3);
        c1080Uf.A06();
        int iA06 = c1080Uf.A05(2);
        boolean zA0A = c1080Uf.A0A();
        int iA07 = c1080Uf.A05(5);
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            if (c1080Uf.A0A()) {
                i4 |= 1 << i5;
            }
        }
        int[] iArr = new int[6];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr[i6] = c1080Uf.A05(8);
        }
        int iA08 = c1080Uf.A05(8);
        int i7 = 0;
        for (int i8 = 0; i8 < iA05; i8++) {
            if (c1080Uf.A0A()) {
                i7 += 89;
            }
            boolean zA0A2 = c1080Uf.A0A();
            String[] strArr = A02;
            if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "FxZY1L4nxQxmVdBMBB4ZwW40UgWOskqq";
            strArr2[5] = "t2fwQ3onBK5otMqRMljaftAIUvHlrALR";
            if (zA0A2) {
                i7 += 8;
            }
        }
        c1080Uf.A07(i7);
        if (iA05 > 0) {
            c1080Uf.A07((8 - iA05) * 2);
        }
        int iA04 = c1080Uf.A04();
        int iA09 = c1080Uf.A04();
        if (iA09 == 3) {
            c1080Uf.A06();
        }
        int iA010 = c1080Uf.A04();
        int iA011 = c1080Uf.A04();
        if (c1080Uf.A0A()) {
            int iA012 = c1080Uf.A04();
            int iA013 = c1080Uf.A04();
            int iA014 = c1080Uf.A04();
            int iA015 = c1080Uf.A04();
            iA010 -= (iA012 + iA013) * ((iA09 == 1 || iA09 == 2) ? 2 : 1);
            iA011 -= (iA014 + iA015) * (iA09 == 1 ? 2 : 1);
        }
        c1080Uf.A04();
        c1080Uf.A04();
        int iA016 = c1080Uf.A04();
        for (int i9 = c1080Uf.A0A() ? 0 : iA05; i9 <= iA05; i9++) {
            c1080Uf.A04();
            c1080Uf.A04();
            c1080Uf.A04();
        }
        c1080Uf.A04();
        c1080Uf.A04();
        c1080Uf.A04();
        c1080Uf.A04();
        c1080Uf.A04();
        c1080Uf.A04();
        if (c1080Uf.A0A() && c1080Uf.A0A()) {
            A0D(c1080Uf);
        }
        c1080Uf.A07(2);
        if (c1080Uf.A0A()) {
            c1080Uf.A07(8);
            c1080Uf.A04();
            if (A02[2].length() != 1) {
                c1080Uf.A04();
                c1080Uf.A06();
            } else {
                A02[3] = "s3zVJ7azKijsZdolinmC4xsG4iAagWnL";
                c1080Uf.A04();
                c1080Uf.A06();
            }
        }
        A0E(c1080Uf);
        if (c1080Uf.A0A()) {
            for (int i10 = 0; i10 < c1080Uf.A04(); i10++) {
                c1080Uf.A07(iA016 + 4 + 1);
            }
        }
        c1080Uf.A07(2);
        float f = 1.0f;
        if (c1080Uf.A0A()) {
            if (c1080Uf.A0A()) {
                int iA017 = c1080Uf.A05(8);
                if (iA017 == 255) {
                    int iA018 = c1080Uf.A05(16);
                    int iA019 = c1080Uf.A05(16);
                    if (iA018 != 0 && iA019 != 0) {
                        f = iA018 / iA019;
                    }
                } else if (iA017 < A04.length) {
                    f = A04[iA017];
                } else {
                    AbstractC1561fb.A07(A0B(0, 11, 76), A0B(11, 35, 43) + iA017);
                }
            }
            boolean zA0A3 = c1080Uf.A0A();
            if (A02[3].charAt(16) != 'i') {
                throw new RuntimeException();
            }
            A02[3] = "rQ69BeSXFAaDiLFXiEixLE46g40nPe5P";
            if (zA0A3) {
                c1080Uf.A06();
            }
            if (c1080Uf.A0A()) {
                c1080Uf.A07(3);
                boolean zA0A4 = c1080Uf.A0A();
                if (c1080Uf.A0A()) {
                    int iA020 = c1080Uf.A05(8);
                    int iA021 = c1080Uf.A05(8);
                    c1080Uf.A07(8);
                    iA00 = ColorInfo.A00(iA020);
                    i3 = zA0A4 ? 1 : 2;
                    iA01 = ColorInfo.A01(iA021);
                }
            }
            if (c1080Uf.A0A()) {
                c1080Uf.A04();
                c1080Uf.A04();
            }
            c1080Uf.A06();
            if (c1080Uf.A0A()) {
                iA011 *= 2;
            }
        }
        return new C1076Ua(iA06, zA0A, iA07, i4, iArr, iA08, iA04, iA010, iA011, f, iA00, i3, iA01);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1077Uc A0A(byte[] bArr, int i, int i2) {
        String[] strArr;
        int i3;
        int i4;
        int i5;
        int iA05;
        int iA06;
        int i6;
        int i7;
        C1080Uf c1080Uf = new C1080Uf(bArr, i, i2);
        int iA07 = c1080Uf.A05(8);
        int iA08 = c1080Uf.A05(8);
        int iA09 = c1080Uf.A05(8);
        int iA04 = c1080Uf.A04();
        int iA010 = 1;
        boolean zA0A = false;
        if (iA07 != 100 && iA07 != 110 && iA07 != 122 && iA07 != 244) {
            if (A02[2].length() == 1) {
                A02[4] = "7h0kpXVdQKzxrf";
                if (iA07 == 44 || iA07 == 83) {
                    iA010 = c1080Uf.A04();
                    if (iA010 == 3) {
                    }
                    c1080Uf.A04();
                    c1080Uf.A04();
                    c1080Uf.A06();
                    if (c1080Uf.A0A()) {
                        if (iA010 != 3) {
                            i3 = 8;
                        } else {
                            i3 = 12;
                        }
                        for (i4 = 0; i4 < i3; i4++) {
                            if (!c1080Uf.A0A()) {
                                if (i4 < 6) {
                                    i5 = 16;
                                } else {
                                    i5 = 64;
                                }
                                A0F(c1080Uf, i5);
                            }
                        }
                    }
                    strArr = A02;
                    if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[1] = "85i7TRsnvSXUqXTucRbFMzqUd630ijnw";
                    strArr2[5] = "zboMVSmnmwP7Plso5VFF9EWkfLGQbi4P";
                } else if (A02[2].length() == 1) {
                    A02[3] = "eA1De31wIXgK7AbOieERjlplaz0Icu16";
                    if (iA07 == 86) {
                        iA010 = c1080Uf.A04();
                        if (iA010 == 3) {
                        }
                        c1080Uf.A04();
                        c1080Uf.A04();
                        c1080Uf.A06();
                        if (c1080Uf.A0A()) {
                            if (iA010 != 3) {
                                i3 = 8;
                            } else {
                                i3 = 12;
                            }
                            while (i4 < i3) {
                                if (!c1080Uf.A0A()) {
                                    if (i4 < 6) {
                                        i5 = 16;
                                    } else {
                                        i5 = 64;
                                    }
                                    A0F(c1080Uf, i5);
                                }
                            }
                        }
                        strArr = A02;
                        if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A02;
                        strArr3[1] = "85i7TRsnvSXUqXTucRbFMzqUd630ijnw";
                        strArr3[5] = "zboMVSmnmwP7Plso5VFF9EWkfLGQbi4P";
                    } else {
                        if (A02[0].length() != 17) {
                            String[] strArr4 = A02;
                            strArr4[7] = "OYLxwLaJmJH8o35H8jx4lyJWsYYUzGA1";
                            strArr4[6] = "pMGirVpteFOMRlnqPfuOX6iVwBj6lXdv";
                            if (iA07 != 118) {
                                if (iA07 == 128) {
                                    if (A02[2].length() != 1) {
                                        throw new RuntimeException();
                                    }
                                    A02[3] = "vo12PQriPoFtiQ1uiLteE19n3l5fWybz";
                                    if (iA07 == 138) {
                                    }
                                }
                            }
                        } else {
                            A02[2] = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
                            if (iA07 != 118) {
                                if (iA07 == 128) {
                                    if (A02[2].length() != 1) {
                                        throw new RuntimeException();
                                    }
                                    A02[3] = "vo12PQriPoFtiQ1uiLteE19n3l5fWybz";
                                    if (iA07 == 138) {
                                    }
                                }
                            }
                        }
                        iA010 = c1080Uf.A04();
                        if (iA010 == 3) {
                        }
                        c1080Uf.A04();
                        c1080Uf.A04();
                        c1080Uf.A06();
                        if (c1080Uf.A0A()) {
                            if (iA010 != 3) {
                                i3 = 8;
                            } else {
                                i3 = 12;
                            }
                            while (i4 < i3) {
                                if (!c1080Uf.A0A()) {
                                    if (i4 < 6) {
                                        i5 = 16;
                                    } else {
                                        i5 = 64;
                                    }
                                    A0F(c1080Uf, i5);
                                }
                            }
                        }
                        strArr = A02;
                        if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A02;
                        strArr5[1] = "85i7TRsnvSXUqXTucRbFMzqUd630ijnw";
                        strArr5[5] = "zboMVSmnmwP7Plso5VFF9EWkfLGQbi4P";
                    }
                }
            }
            throw new RuntimeException();
        }
        iA010 = c1080Uf.A04();
        zA0A = iA010 == 3 ? c1080Uf.A0A() : false;
        c1080Uf.A04();
        c1080Uf.A04();
        c1080Uf.A06();
        if (c1080Uf.A0A()) {
            if (iA010 != 3) {
                i3 = 8;
            } else {
                i3 = 12;
            }
            while (i4 < i3) {
                if (!c1080Uf.A0A()) {
                    if (i4 < 6) {
                        i5 = 16;
                    } else {
                        i5 = 64;
                    }
                    A0F(c1080Uf, i5);
                }
            }
        }
        strArr = A02;
        if (strArr[1].charAt(7) != strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr6 = A02;
        strArr6[1] = "85i7TRsnvSXUqXTucRbFMzqUd630ijnw";
        strArr6[5] = "zboMVSmnmwP7Plso5VFF9EWkfLGQbi4P";
        int iA011 = c1080Uf.A04() + 4;
        int iA012 = c1080Uf.A04();
        int iA013 = 0;
        boolean zA0A2 = false;
        if (iA012 == 0) {
            iA013 = c1080Uf.A04() + 4;
        } else if (iA012 == 1) {
            zA0A2 = c1080Uf.A0A();
            c1080Uf.A03();
            c1080Uf.A03();
            long jA04 = c1080Uf.A04();
            for (int i8 = 0; i8 < jA04; i8++) {
                c1080Uf.A04();
            }
        }
        int iA014 = c1080Uf.A04();
        c1080Uf.A06();
        int iA015 = c1080Uf.A04() + 1;
        int iA016 = c1080Uf.A04() + 1;
        boolean zA0A3 = c1080Uf.A0A();
        int i9 = (2 - (zA0A3 ? 1 : 0)) * iA016;
        if (!zA0A3) {
            c1080Uf.A06();
        }
        c1080Uf.A06();
        int i10 = iA015 * 16;
        int i11 = i9 * 16;
        if (c1080Uf.A0A()) {
            int iA017 = c1080Uf.A04();
            int iA018 = c1080Uf.A04();
            int iA019 = c1080Uf.A04();
            int iA020 = c1080Uf.A04();
            if (iA010 == 0) {
                i6 = 1;
                i7 = 2 - (zA0A3 ? 1 : 0);
            } else {
                i6 = iA010 == 3 ? 1 : 2;
                i7 = (2 - (zA0A3 ? 1 : 0)) * (iA010 == 1 ? 2 : 1);
            }
            i10 -= (iA017 + iA018) * i6;
            i11 -= (iA019 + iA020) * i7;
        }
        float f = 1.0f;
        if (c1080Uf.A0A() && c1080Uf.A0A()) {
            int iA021 = c1080Uf.A05(8);
            String[] strArr7 = A02;
            if (strArr7[7].charAt(16) != strArr7[6].charAt(16)) {
                A02[2] = bc.aK;
                if (iA021 == 255) {
                    iA05 = c1080Uf.A05(16);
                    iA06 = c1080Uf.A05(16);
                    if (iA05 != 0 && iA06 != 0) {
                        f = iA05 / iA06;
                    }
                } else if (iA021 < A04.length) {
                    f = A04[iA021];
                } else {
                    AbstractC1561fb.A07(A0B(0, 11, 76), A0B(11, 35, 43) + iA021);
                }
            } else {
                String[] strArr8 = A02;
                strArr8[1] = "wlvyu1enNSNhk8R2ZBFW2HhmyWtA640K";
                strArr8[5] = "p4h17VpnGX9E12zgPhYxgbtOqAe2MODa";
                if (iA021 == 255) {
                    iA05 = c1080Uf.A05(16);
                    iA06 = c1080Uf.A05(16);
                    if (iA05 != 0) {
                        f = iA05 / iA06;
                    }
                } else if (iA021 < A04.length) {
                    f = A04[iA021];
                } else {
                    AbstractC1561fb.A07(A0B(0, 11, 76), A0B(11, 35, 43) + iA021);
                }
            }
        }
        return new C1077Uc(iA07, iA08, iA09, iA04, iA014, i10, i11, f, zA0A, zA0A3, iA011, iA012, iA013, zA0A2);
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{31, 48, 61, 4, 63, 56, 37, 4, 37, 56, 61, 99, 88, 83, 78, 70, 83, 85, 66, 83, 82, 22, 87, 69, 70, 83, 85, 66, 105, 68, 87, 66, 95, 89, 105, 95, 82, 85, 22, 64, 87, 90, 67, 83, 12, 22, 90, 69, 72, 73, 67, 3, 77, 90, 79, 69, 90, 87, 86, 92, 28, 91, 86, 69, 80};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A0E(C1080Uf c1080Uf) {
        int iA04;
        int iA05;
        int[] iArrCopyOf;
        int iA06 = c1080Uf.A04();
        int i = -1;
        int i2 = -1;
        int[] iArr = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i3 = 0;
        while (i3 < iA06) {
            if (i3 != 0 && c1080Uf.A0A()) {
                int i4 = i + i2;
                int iA07 = (1 - ((c1080Uf.A0A() ? 1 : 0) * 2)) * (c1080Uf.A04() + 1);
                boolean[] zArr = new boolean[i4 + 1];
                for (int i5 = 0; i5 <= i4; i5++) {
                    if (c1080Uf.A0A()) {
                        zArr[i5] = true;
                    } else {
                        zArr[i5] = c1080Uf.A0A();
                    }
                }
                iA04 = 0;
                int[] iArr2 = new int[i4 + 1];
                int[] iArr3 = new int[i4 + 1];
                for (int i6 = i2 - 1; i6 >= 0; i6--) {
                    int i7 = iArrCopyOf2[i6] + iA07;
                    if (i7 < 0 && zArr[i + i6]) {
                        iArr2[iA04] = i7;
                        iA04++;
                    }
                }
                if (iA07 < 0 && zArr[i4]) {
                    iArr2[iA04] = iA07;
                    iA04++;
                }
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = iArr[i8] + iA07;
                    if (i9 < 0 && zArr[i8]) {
                        iArr2[iA04] = i9;
                        iA04++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr2, iA04);
                iA05 = 0;
                for (int i10 = i - 1; i10 >= 0; i10--) {
                    int i11 = iArr[i10] + iA07;
                    if (i11 > 0 && zArr[i10]) {
                        iArr3[iA05] = i11;
                        iA05++;
                    }
                }
                if (iA07 > 0 && zArr[i4]) {
                    iArr3[iA05] = iA07;
                    iA05++;
                }
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = iArrCopyOf2[i12] + iA07;
                    if (i13 > 0 && zArr[i + i12]) {
                        iArr3[iA05] = i13;
                        iA05++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr3, iA05);
            } else {
                iA04 = c1080Uf.A04();
                iA05 = c1080Uf.A04();
                iArrCopyOf = new int[iA04];
                for (int i14 = 0; i14 < iA04; i14++) {
                    iArrCopyOf[i14] = c1080Uf.A04() + 1;
                    c1080Uf.A06();
                }
                iArrCopyOf2 = new int[iA05];
                for (int i15 = 0; i15 < iA05; i15++) {
                    iArrCopyOf2[i15] = c1080Uf.A04() + 1;
                    c1080Uf.A06();
                }
            }
            i = iA04;
            i2 = iA05;
            if (A02[2].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "ypbUm9mCh0Vq0Bu5MwOJXBzki";
            iArr = iArrCopyOf;
            i3++;
        }
    }

    static {
        A0C();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int A02(byte[] bArr, int i) {
        int i2;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i3 = 0;
            while (scratchEscapeCount < i) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i);
                if (scratchEscapeCount < i) {
                    if (A01.length <= i3) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i3] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i3++;
                }
            }
            i2 = i - i3;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i3; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i2 - escapedPosition);
        }
        return i2;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        while (i < i) {
            int i3 = bArr[i];
            if (i3 == 0) {
                int i4 = i + 1;
                if (bArr[i4] == 0) {
                    int i5 = i + 2;
                    if (bArr[i5] == 3) {
                        return i;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    public static int A04(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        int i3 = i2 - i;
        AbstractC1517es.A08(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            A0H(zArr);
            if (A02[4].length() != 9) {
                A02[0] = "wEMBu8rPiBgZz8BQZEbCppvcT171GOvo";
                int length = i - 3;
                return length;
            }
        } else {
            if (i3 > 1 && zArr[1]) {
                int length2 = bArr[i];
                if (length2 == 1) {
                    A0H(zArr);
                    int length3 = i - 2;
                    return length3;
                }
            }
            if (i3 > 2 && zArr[2]) {
                int length4 = bArr[i];
                if (length4 == 0) {
                    int length5 = i + 1;
                    if (bArr[length5] == 1) {
                        A0H(zArr);
                        int length6 = i - 1;
                        return length6;
                    }
                }
            }
            int i4 = i2 - 1;
            int limit = i + 2;
            while (limit < i4) {
                int length7 = bArr[limit];
                if ((length7 & 254) == 0) {
                    int length8 = limit - 2;
                    if (bArr[length8] == 0) {
                        int length9 = limit - 1;
                        if (bArr[length9] == 0) {
                            int length10 = bArr[limit];
                            if (length10 == 1) {
                                A0H(zArr);
                                int length11 = limit - 2;
                                return length11;
                            }
                        }
                    }
                    limit -= 2;
                }
                limit += 3;
            }
            if (i3 > 2) {
                int length12 = i2 - 3;
                if (bArr[length12] == 0) {
                    int length13 = i2 - 2;
                    if (bArr[length13] == 0) {
                        int length14 = i2 - 1;
                        if (bArr[length14] == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else if (i3 == 2) {
                if (zArr[2]) {
                    int length15 = i2 - 2;
                    if (bArr[length15] == 0) {
                        int length16 = i2 - 1;
                        if (bArr[length16] == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else if (zArr[1]) {
                int length17 = i2 - 1;
                if (bArr[length17] == 1) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            zArr[0] = z;
            if (i3 > 1) {
                int length18 = i2 - 2;
                if (bArr[length18] == 0) {
                    int length19 = i2 - 1;
                    if (bArr[length19] == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else if (zArr[2]) {
                int length20 = i2 - 1;
                if (bArr[length20] == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            zArr[1] = z2;
            int length21 = i2 - 1;
            zArr[2] = bArr[length21] == 0;
            if (A02[0].length() != 17) {
                A02[4] = "8cyObcxJHVIGesxXSEYZizpbNjgO";
                return i2;
            }
        }
        throw new RuntimeException();
    }

    public static C1076Ua A05(byte[] bArr, int i, int i2) {
        return A06(bArr, i + 2, i2);
    }

    public static Ub A07(byte[] bArr, int i, int i2) {
        return A08(bArr, i + 1, i2);
    }

    public static Ub A08(byte[] bArr, int i, int i2) {
        C1080Uf data = new C1080Uf(bArr, i, i2);
        int iA04 = data.A04();
        int seqParameterSetId = data.A04();
        data.A06();
        return new Ub(iA04, seqParameterSetId, data.A0A());
    }

    public static C1077Uc A09(byte[] bArr, int i, int i2) {
        return A0A(bArr, i + 1, i2);
    }

    public static void A0D(C1080Uf c1080Uf) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                boolean zA0A = c1080Uf.A0A();
                int i3 = 1;
                String[] strArr = A02;
                String str = strArr[7];
                String str2 = strArr[6];
                int iCharAt = str.charAt(16);
                int sizeId = str2.charAt(16);
                if (iCharAt == sizeId) {
                    throw new RuntimeException();
                }
                A02[2] = bc.aJ;
                if (!zA0A) {
                    c1080Uf.A04();
                } else {
                    int sizeId2 = i << 1;
                    int iMin = Math.min(64, 1 << (sizeId2 + 4));
                    if (i > 1) {
                        c1080Uf.A03();
                    }
                    for (int sizeId3 = 0; sizeId3 < iMin; sizeId3++) {
                        c1080Uf.A03();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void A0F(C1080Uf c1080Uf, int i) {
        int i2 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = c1080Uf.A03();
                lastScale = ((lastScale2 + i2) + 256) % 256;
            }
            if (lastScale != 0) {
                i2 = lastScale;
            }
        }
    }

    public static void A0G(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int value = 0;
        while (length < iPosition) {
            int length = byteBuffer.get(value);
            int offset = length & 255;
            if (i == 3) {
                if (offset == 1) {
                    int length2 = value + 1;
                    int consecutiveZeros = byteBuffer.get(length2) & 31;
                    if (consecutiveZeros == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        int length3 = value - 3;
                        byteBufferDuplicate.position(length3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                }
            } else if (offset == 0) {
                i++;
            }
            if (offset != 0) {
                i = 0;
            }
            value++;
        }
        byteBuffer.clear();
    }

    public static void A0H(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0I(String str, byte b) {
        if (A0B(46, 9, 49).equals(str) && (b & 31) == 6) {
            return true;
        }
        if (A0B(55, 10, 46).equals(str)) {
            int i = b & 126;
            if (A02[2].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "ZlbV1M9c";
            if ((i >> 1) == 39) {
                return true;
            }
        }
        return false;
    }
}
