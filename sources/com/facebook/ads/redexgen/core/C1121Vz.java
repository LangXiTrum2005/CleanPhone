package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.net.HttpStatus;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.ColorInfo;
import com.google.android.exoplayer2.DrmInitData;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1121Vz {
    public static byte[] A0p;
    public static String[] A0q = {"hyMb8khkD4okPvXGY98HPtppNwE6qnHy", "y0mouUNQb6BrWBXjLWPNISU1IwOvfME", "R", "K4xGiTODJfKhl0wPh19B8Nh8mpCZB7Zd", "epTyke6vhYl5adONInYVeliElHWpYeZl", "TH6HYp1q7KqmiNZ4Ui6Kn7yKTHciOr1p", "rIJbIujcpL2k8hhuYRqSFkNqzLdvdT0Q", "3E9"};
    public int A0I;
    public int A0N;
    public int A0Q;
    public int A0R;
    public int A0V;
    public DrmInitData A0Z;
    public C1085Um A0a;
    public InterfaceC1086Uo A0b;
    public C1087Up A0c;
    public String A0d;
    public String A0e;
    public boolean A0g;
    public boolean A0i;
    public byte[] A0j;
    public byte[] A0k;
    public byte[] A0m;
    public int A0n;
    public int A0W = -1;
    public int A0M = -1;
    public int A0L = -1;
    public int A0J = -1;
    public int A0K = 0;
    public int A0S = -1;
    public float A0A = 0.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public byte[] A0l = null;
    public int A0U = -1;
    public boolean A0h = false;
    public int A0G = -1;
    public int A0H = -1;
    public int A0F = -1;
    public int A0O = 1000;
    public int A0P = 200;
    public float A06 = -1.0f;
    public float A07 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A0B = -1.0f;
    public float A0C = -1.0f;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public int A0E = 1;
    public int A0D = -1;
    public int A0T = 8000;
    public long A0X = 0;
    public long A0Y = 0;
    public boolean A0f = true;
    public String A0o = A03(1067, 3, 18);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A02(C1576fq c1576fq) throws Q6 {
        try {
            c1576fq.A0g(16);
            long jA0O = c1576fq.A0O();
            if (jA0O == 1482049860) {
                return new Pair<>(A03(1117, 10, 2), null);
            }
            if (jA0O == 859189832) {
                return new Pair<>(A03(1088, 10, 38), null);
            }
            if (jA0O != 826496599) {
                AbstractC1561fb.A07(A03(312, 17, 108), A03(492, 51, 99));
                return new Pair<>(A03(1189, 15, 98), null);
            }
            byte[] bArrA0l = c1576fq.A0l();
            for (int iA09 = c1576fq.A09() + 20; iA09 < bArrA0l.length - 4; iA09++) {
                if (bArrA0l[iA09] == 0 && bArrA0l[iA09 + 1] == 0 && bArrA0l[iA09 + 2] == 1) {
                    byte b = bArrA0l[iA09 + 3];
                    String[] strArr = A0q;
                    if (strArr[0].charAt(3) != strArr[6].charAt(3)) {
                        throw new RuntimeException();
                    }
                    A0q[1] = "BQNn96Cmh2K79BOBr0ras0YVnEUxiZF";
                    if (b == 15) {
                        return new Pair<>(A03(1179, 10, 56), Collections.singletonList(Arrays.copyOfRange(bArrA0l, iA09, bArrA0l.length)));
                    }
                }
            }
            throw Q6.A01(A03(267, 45, 1), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw Q6.A01(A03(166, 33, 104), null);
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0p = new byte[]{19, 5, 56, 74, 89, 89, 78, 83, 76, 5, 82, 78, 82, 74, 57, 94, 85, 74, 5, 89, 84, 5, 54, 84, 54, 54, 56, -60, -30, -60, -58, -74, -62, -32, -59, -43, -44, -17, cw.k, -14, 2, 1, -35, -13, 6, -2, 0, -13, 1, 1, -44, -14, -41, -25, -26, -62, -33, -30, -26, -26, -33, -40, -26, -26, -42, -12, -38, -42, -40, -56, -21, 9, -16, -10, -21, -19, 44, 74, 56, 59, 48, 50, 26, 55, 29, -31, -1, -19, -16, -27, -25, -49, -20, -45, 35, 65, 47, 53, 17, 35, 37, 47, 55, 85, 69, 70, 75, 73, 45, 75, 60, 47, 57, 27, 50, 56, 59, 45, 64, 27, 53, 49, 49, 49, -20, 10, -5, -18, -8, -38, -12, -7, -1, -38, -19, -12, -14, -16, cw.l, -1, -14, -4, -34, -8, -3, 3, -34, -5, -8, 3, -46, -16, -27, -29, -26, -42, -39, -43, 1, 31, 22, cw.m, 18, 2, 9, 19, 42, 87, 87, 84, 87, 5, 85, 70, 87, 88, 78, 83, 76, 5, 43, 84, 90, 87, 40, 40, 5, 85, 87, 78, 91, 70, 89, 74, 5, 73, 70, 89, 70, -58, -13, -13, -16, -13, -95, -15, -30, -13, -12, -22, -17, -24, -95, -50, -44, -80, -62, -60, -50, -95, -28, -16, -27, -26, -28, -95, -15, -13, -22, -9, -30, -11, -26, -21, 24, 24, 21, 24, -58, 22, 7, 24, 25, cw.m, 20, cw.k, -58, 28, 21, 24, 8, cw.m, 25, -58, 9, 21, 10, 11, 9, -58, 22, 24, cw.m, 28, 7, 26, 11, -60, -33, -25, -22, -29, -30, -98, -14, -19, -98, -28, -25, -20, -30, -98, -60, -19, -13, -16, -63, -63, -98, -44, -63, -81, -98, -25, -20, -25, -14, -25, -33, -22, -25, -8, -33, -14, -25, -19, -20, -98, -30, -33, -14, -33, 54, 74, 93, 91, 88, 92, 84, 74, 46, 97, 93, 91, 74, 76, 93, 88, 91, 70, 98, 108, 108, 98, 103, 96, 25, 60, 104, 93, 94, 92, 73, 107, 98, 111, 90, 109, 94, 25, 95, 104, 107, 25, 92, 104, 93, 94, 92, 25, 42, 75, 74, 9, 44, 31, 41, -4, 41, 47, 11, 29, 31, 41, -4, 69, 79, -4, 81, 74, 79, 81, 76, 76, 75, 78, 80, 65, 64, 10, -4, 47, 65, 80, 80, 69, 74, 67, -4, 73, 69, 73, 65, 48, 85, 76, 65, -4, 80, 75, -4, 11, 23, -4, cw.l, -6, 11, cw.k, -6, cw.k, 25, 2, -2, 7, cw.n, -23, 10, 1, cw.k, 79, 91, 80, 65, 84, 80, 43, 61, 79, 79, 19, 31, 20, 5, 24, 20, -17, 21, 20, 6, -8, -5, 7, -4, -19, 0, -4, -41, -1, -19, -22, -2, -4, -4, 76, 88, 79, 72, 59, 76, 78, 59, -24, 1, -8, 11, 3, -8, -10, 7, -8, -9, -77, -32, -36, -32, -40, -77, 7, 12, 3, -8, -63, 53, 78, 75, 78, 79, 87, 78, 0, 38, 79, 85, 82, 35, 35, cw.l, 0, 51, 69, 84, 84, 73, 78, 71, 0, 77, 73, 77, 69, 52, 89, 80, 69, 0, 84, 79, 0, 86, 73, 68, 69, 79, cw.m, 88, cw.k, 85, 78, 75, 78, 79, 87, 78, 26, 51, 55, 42, 40, 52, 44, 51, 46, 63, 42, 41, -27, 40, 52, 41, 42, 40, -27, 46, 41, 42, 51, 57, 46, 43, 46, 42, 55, -13, 64, 89, 94, 96, 91, 91, 90, 93, 95, 80, 79, 11, 59, 46, 56, 11, 77, 84, 95, 11, 79, 80, 91, 95, 83, 37, 11, -3, 22, 27, 29, 24, 24, 23, 26, 28, cw.k, 12, -56, 10, 17, cw.m, -56, cw.k, 22, 12, 17, 9, 22, -56, -8, -21, -11, -56, 10, 17, 28, -56, 12, cw.k, 24, 28, cw.n, -30, -56, 0, 25, 30, 32, 27, 27, 26, 29, 31, cw.n, cw.m, -53, 17, 23, 26, 12, 31, 20, 25, 18, -53, 27, 26, 20, 25, 31, -53, -5, -18, -8, -53, cw.k, 20, 31, -53, cw.m, cw.n, 27, 31, 19, -27, -53, -33, -8, -3, -1, -6, -6, -7, -4, -2, -17, -18, -86, -10, -13, -2, -2, -10, -17, -86, -17, -8, -18, -13, -21, -8, -86, -38, -51, -41, -86, -20, -13, -2, -86, -18, -17, -6, -2, -14, -60, -86, 17, 26, -4, 17, -20, 23, 32, cw.l, 17, 6, 8, -13, 69, 78, 60, 63, 52, 54, 35, 30, 56, 66, 62, 30, 48, 63, 1, 10, -8, -5, -16, -14, -33, -38, -12, -2, -6, -38, -20, -2, -5, 44, 53, 35, 38, 27, 29, 10, 5, 31, 41, 37, 5, 23, 44, 25, 12, 21, 3, 6, -5, -3, -22, -27, -1, 9, 5, -27, 9, 6, -12, -3, -21, -18, -29, -27, -26, -51, -25, -15, -19, -51, -26, -29, -12, -31, -29, -20, -38, -32, -68, -29, -45, -28, -68, -45, -36, -30, -33, -48, -48, -11, -2, -13, -25, -28, -18, -15, -32, 28, 37, 28, 22, -2, -37, -28, -37, -43, -66, -17, -2, -2, -6, -9, -15, -17, 2, -9, -3, -4, -67, -14, 4, -16, 1, 3, -16, 1, 55, 70, 70, 66, 63, 57, 55, 74, 63, 69, 68, 5, 70, 61, 73, 21, 36, 36, 32, 29, 23, 21, 40, 29, 35, 34, -29, 42, 35, 22, 39, 41, 22, 81, 96, 96, 92, 89, 83, 81, 100, 89, 95, 94, 31, 104, 29, 99, 101, 82, 98, 89, 96, 17, 37, 20, 25, 31, -33, 17, 19, -29, 53, 73, 56, 61, 67, 3, 57, 53, 55, 7, 88, 108, 91, 96, 102, 38, 93, 99, 88, 90, -20, 0, -17, -12, -6, -70, -8, -5, -65, -20, -72, -9, -20, -1, -8, 36, 56, 39, 44, 50, -14, 48, 51, 40, 42, 18, 38, 21, 26, 32, -32, 30, 33, 22, 24, -34, -3, -29, 79, 99, 82, 87, 93, 29, 93, 94, 99, 97, -17, 3, -14, -9, -3, -67, 0, -17, 5, 90, 110, 
        93, 98, 104, 40, 109, 107, 110, 94, 38, 97, 93, 19, 39, 22, 27, 33, -31, 40, 32, 22, -32, 22, 38, 37, -16, 4, -13, -8, -2, -66, 5, -3, -13, -67, -13, 3, 2, -67, -9, -13, -15, 5, -12, -7, -1, -65, 6, -1, 2, -14, -7, 3, -32, -12, -29, -24, -18, -82, -9, -84, -12, -19, -22, -19, -18, -10, -19, -12, -3, -10, 105, 90, 109, 105, 36, 107, 105, 105, 94, 79, 98, 94, 25, 98, 23, 93, 93, 75, 25, 12, 7, 8, 18, -46, -42, 10, 19, 19, 38, 25, 20, 21, 31, -33, 17, 38, -32, -31, 72, 59, 54, 55, 65, 1, 51, 72, 53, -11, -24, -29, -28, -18, -82, -29, -24, -11, -9, 97, 84, 79, 80, 90, 26, 79, 90, 87, 77, 100, 24, 97, 84, 94, 84, 90, 89, -5, -18, -23, -22, -12, -76, -19, -22, -5, -24, 94, 81, 76, 77, 87, 23, 85, 88, 28, 94, 21, 77, 91, 30, 17, 12, cw.k, 23, -41, 21, 24, cw.k, cw.m, -38, 43, 30, 25, 26, 36, -28, 44, 43, 24, -26, 85, 72, 67, 68, 78, cw.l, 87, 12, 84, 77, 74, 77, 78, 86, 77, cw.l, 1, -4, -3, 7, -57, cw.n, -59, cw.l, 6, -4, -58, 7, 6, -54, -58, cw.l, 8, -48, 39, 26, 21, 22, 32, -32, 41, -34, 39, 31, 21, -33, 32, 31, -29, -33, 39, 33, -22};
    }

    static {
        A07();
    }

    public static List<byte[]> A05(byte[] bArr) throws Q6 {
        String strA03 = A03(233, 34, 41);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while ((bArr[vorbisInfoLength] & 255) == 255) {
                    i += 255;
                    vorbisInfoLength++;
                }
                int i2 = vorbisInfoLength + 1;
                int i3 = i + (bArr[vorbisInfoLength] & 255);
                int offset = 0;
                while ((bArr[i2] & 255) == 255) {
                    offset += 255;
                    i2++;
                }
                int vorbisInfoLength2 = i2 + 1;
                int offset2 = offset + (bArr[i2] & 255);
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i3);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i3;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + offset2;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw Q6.A01(strA03, null);
                    }
                    throw Q6.A01(strA03, null);
                }
                throw Q6.A01(strA03, null);
            }
            throw Q6.A01(strA03, null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw Q6.A01(strA03, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull({"output"})
    public void A06() {
        AbstractC1517es.A01(this.A0b);
    }

    public static boolean A0A(C1576fq c1576fq) throws Q6 {
        try {
            int iA0G = c1576fq.A0G();
            if (iA0G == 1) {
                return true;
            }
            if (iA0G != 65534) {
                return false;
            }
            c1576fq.A0f(24);
            return c1576fq.A0P() == MatroskaExtractor.A0x.getMostSignificantBits() && c1576fq.A0P() == MatroskaExtractor.A0x.getLeastSignificantBits();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw Q6.A01(A03(199, 34, 4), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MetaExoPlayerCustomization("Removed opus check as it breaks some 360 files")
    public boolean A0B(boolean z) {
        return this.A0N > 0;
    }

    private byte[] A0C() {
        if (this.A06 == -1.0f || this.A07 == -1.0f) {
            return null;
        }
        float f = this.A04;
        String[] strArr = A0q;
        if (strArr[3].charAt(14) == strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[3] = "6iccFSfv6qiHsz8TTGA7iWtRDAH5by2Y";
        strArr2[5] = "u48Apyxxg5Gb9zJDRMegqwfH4VxbyybM";
        if (f == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A0B == -1.0f) {
            return null;
        }
        float f2 = this.A0C;
        String[] strArr3 = A0q;
        if (strArr3[0].charAt(3) != strArr3[6].charAt(3)) {
            String[] strArr4 = A0q;
            strArr4[0] = "bmLbZk0oFBSaIvlFq3CFVBAm1Mk0qhA8";
            strArr4[6] = "C2KbOstFrHeXOWjuTesyzI8vBGc9JLcQ";
            if (f2 == -1.0f) {
                return null;
            }
        } else {
            A0q[2] = bc.aL;
            if (f2 == -1.0f) {
                return null;
            }
        }
        if (this.A00 == -1.0f || this.A01 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A0B * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A0C * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0O);
        hdrStaticInfo.putShort((short) this.A0P);
        return bArr;
    }

    @EnsuresNonNull({"codecPrivate"})
    private byte[] A0D(String str) throws Q6 {
        if (this.A0j != null) {
            return this.A0j;
        }
        throw Q6.A01(A03(329, 31, 124) + str, null);
    }

    @RequiresNonNull({"output"})
    public final void A0E() {
        if (this.A0c != null) {
            this.A0c.A05(this.A0b, this.A0a);
        }
    }

    public final void A0F() {
        if (this.A0c != null) {
            this.A0c.A02();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x032f  */
    /* JADX WARN: Code duplicated, block: B:124:0x034e  */
    /* JADX WARN: Code duplicated, block: B:125:0x035a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0371  */
    /* JADX WARN: Code duplicated, block: B:129:0x0377  */
    /* JADX WARN: Code duplicated, block: B:130:0x038e  */
    /* JADX WARN: Code duplicated, block: B:131:0x039a  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e1 A[PHI: r4
  0x03e1: PHI (r4v77 java.lang.String) = (r4v74 java.lang.String), (r4v78 java.lang.String) binds: [B:139:0x03f8, B:136:0x03df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:141:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:142:0x042f  */
    /* JADX WARN: Code duplicated, block: B:144:0x043f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0442  */
    /* JADX WARN: Code duplicated, block: B:147:0x0448  */
    /* JADX WARN: Code duplicated, block: B:148:0x044c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0480  */
    /* JADX WARN: Code duplicated, block: B:151:0x0492  */
    /* JADX WARN: Code duplicated, block: B:152:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:154:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x051d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0546  */
    /* JADX WARN: Code duplicated, block: B:159:0x055c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0568  */
    /* JADX WARN: Code duplicated, block: B:161:0x0574  */
    /* JADX WARN: Code duplicated, block: B:162:0x0587  */
    /* JADX WARN: Code duplicated, block: B:163:0x0593  */
    /* JADX WARN: Code duplicated, block: B:164:0x059f  */
    /* JADX WARN: Code duplicated, block: B:165:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:166:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:167:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x062d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0645  */
    /* JADX WARN: Code duplicated, block: B:170:0x0651  */
    /* JADX WARN: Code duplicated, block: B:171:0x066a  */
    /* JADX WARN: Code duplicated, block: B:172:0x068c  */
    /* JADX WARN: Code duplicated, block: B:173:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:175:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:176:0x06be  */
    /* JADX WARN: Code duplicated, block: B:177:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x06db  */
    /* JADX WARN: Code duplicated, block: B:180:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:183:0x0706  */
    /* JADX WARN: Code duplicated, block: B:185:0x070f  */
    /* JADX WARN: Code duplicated, block: B:187:0x071c  */
    /* JADX WARN: Code duplicated, block: B:192:0x073c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0750  */
    /* JADX WARN: Code duplicated, block: B:200:0x079b  */
    /* JADX WARN: Code duplicated, block: B:202:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:206:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:213:0x07be  */
    /* JADX WARN: Code duplicated, block: B:218:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:221:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:226:0x0808  */
    /* JADX WARN: Code duplicated, block: B:232:0x0821  */
    /* JADX WARN: Code duplicated, block: B:234:0x0847  */
    /* JADX WARN: Code duplicated, block: B:236:0x0851  */
    /* JADX WARN: Code duplicated, block: B:237:0x0854  */
    /* JADX WARN: Code duplicated, block: B:239:0x085e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0868  */
    /* JADX WARN: Code duplicated, block: B:245:0x0878  */
    /* JADX WARN: Code duplicated, block: B:246:0x087c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0880  */
    /* JADX WARN: Code duplicated, block: B:249:0x0890  */
    /* JADX WARN: Code duplicated, block: B:260:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:261:0x08e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:4:0x001b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    /* JADX WARN: Code duplicated, block: B:80:0x0217  */
    @EnsuresNonNull({"this.output"})
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    @RequiresNonNull({"codecId"})
    public final void A0G(UL ul, int i) throws Q6 {
        byte b;
        String strA03;
        String strA04;
        String strA05;
        byte[] bArr;
        String[] strArr;
        P5 p5;
        int i2;
        float f;
        ColorInfo colorInfo;
        int iIntValue;
        int i3;
        int i4;
        UH uhA00;
        int i5 = -1;
        int iA03 = -1;
        List<byte[]> listSingletonList = null;
        String str = null;
        String str2 = this.A0d;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals(A03(733, 14, 114))) {
                    b = 6;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A00 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A00.A05;
                        this.A0Q = u6A00.A02;
                        str = u6A00.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA00 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA00.A08;
                        this.A0Q = uwA00.A05;
                        str = uwA00.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA02 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA02.first;
                        listSingletonList = (List) pairA02.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA03 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA03.A01;
                        this.A0E = c1073TxA03.A00;
                        str = c1073TxA03.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr2 = A0q;
                            strArr2[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr2[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr2 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr2, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr2);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i6 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else if (Q2.A0F(strA05)) {
                    i2 = 2;
                    if (this.A0K == 0) {
                        if (this.A0L == -1) {
                            i3 = this.A0W;
                        } else {
                            i3 = this.A0L;
                        }
                        this.A0L = i3;
                        if (this.A0J == -1) {
                            i4 = this.A0M;
                        } else {
                            i4 = this.A0J;
                        }
                        this.A0J = i4;
                    }
                    f = -1.0f;
                    if (this.A0L != -1 && this.A0J != -1) {
                        f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                    }
                    colorInfo = null;
                    if (this.A0h) {
                        colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                    }
                    iIntValue = -1;
                    if (this.A0e != null && MatroskaExtractor.A0w.containsKey(this.A0e)) {
                        iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                    }
                    if (this.A0S == 0 && Float.compare(this.A0A, 0.0f) == 0 && Float.compare(this.A08, 0.0f) == 0) {
                        if (Float.compare(this.A09, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.A08, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.A08, -180.0f) != 0 || Float.compare(this.A08, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.A08, -90.0f) == 0) {
                            iIntValue = 270;
                        }
                    }
                    p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                } else if (!A03(892, 20, 115).equals(strA05) || A03(1078, 10, 109).equals(strA05) || A03(1070, 8, 120).equals(strA05) || A03(874, 18, 55).equals(strA05) || A03(859, 15, 89).equals(strA05) || A03(840, 19, 17).equals(strA05)) {
                    i2 = 3;
                } else {
                    throw Q6.A01(A03(471, 21, 22), null);
                }
                if (this.A0e != null && !MatroskaExtractor.A0w.containsKey(this.A0e)) {
                    p5.A0z(this.A0e);
                }
                ZM zmA14 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i6).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA14);
                return;
            case -2095575984:
                if (str2.equals(A03(777, 14, 57))) {
                    b = 4;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A01 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A01.A05;
                        this.A0Q = u6A01.A02;
                        str = u6A01.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA01 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA01.A08;
                        this.A0Q = uwA01.A05;
                        str = uwA01.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA03 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA03.first;
                        listSingletonList = (List) pairA03.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA04 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA04.A01;
                        this.A0E = c1073TxA04.A00;
                        str = c1073TxA04.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr3 = A0q;
                            strArr3[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr3[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr3 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr3, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr3);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i7 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA15 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i7).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA15);
                return;
            case -1985379776:
                if (str2.equals(A03(94, 8, 101))) {
                    b = 23;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A02 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A02.A05;
                        this.A0Q = u6A02.A02;
                        str = u6A02.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA02 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA02.A08;
                        this.A0Q = uwA02.A05;
                        str = uwA02.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA04 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA04.first;
                        listSingletonList = (List) pairA04.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA05 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA05.A01;
                        this.A0E = c1073TxA05.A00;
                        str = c1073TxA05.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr4 = A0q;
                            strArr4[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr4[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr4 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr4, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr4);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i8 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA16 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i8).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA16);
                return;
            case -1784763192:
                if (str2.equals(A03(Input.Keys.NUMPAD_6, 8, 20))) {
                    b = 18;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A03 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A03.A05;
                        this.A0Q = u6A03.A02;
                        str = u6A03.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA03 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA03.A08;
                        this.A0Q = uwA03.A05;
                        str = uwA03.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA05 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA05.first;
                        listSingletonList = (List) pairA05.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA06 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA06.A01;
                        this.A0E = c1073TxA06.A00;
                        str = c1073TxA06.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr5 = A0q;
                            strArr5[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr5[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr5 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr5, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr5);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i9 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA17 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i9).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA17);
                return;
            case -1730367663:
                if (str2.equals(A03(Input.Keys.NUMPAD_DOT, 8, 67))) {
                    b = 11;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A04 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A04.A05;
                        this.A0Q = u6A04.A02;
                        str = u6A04.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA04 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA04.A08;
                        this.A0Q = uwA04.A05;
                        str = uwA04.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA06 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA06.first;
                        listSingletonList = (List) pairA06.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA07 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA07.A01;
                        this.A0E = c1073TxA07.A00;
                        str = c1073TxA07.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr6 = A0q;
                            strArr6[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr6[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr6, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr6);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i10 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA18 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i10).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA18);
                return;
            case -1482641358:
                if (str2.equals(A03(76, 9, 110))) {
                    b = cw.l;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A05 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A05.A05;
                        this.A0Q = u6A05.A02;
                        str = u6A05.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA05 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA05.A08;
                        this.A0Q = uwA05.A05;
                        str = uwA05.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA07 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA07.first;
                        listSingletonList = (List) pairA07.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA08 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA08.A01;
                        this.A0E = c1073TxA08.A00;
                        str = c1073TxA08.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr7 = A0q;
                            strArr7[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr7[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr7 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr7, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr7);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i11 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA19 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i11).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA19);
                return;
            case -1482641357:
                if (str2.equals(A03(85, 9, 35))) {
                    b = cw.m;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A06 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A06.A05;
                        this.A0Q = u6A06.A02;
                        str = u6A06.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA06 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA06.A08;
                        this.A0Q = uwA06.A05;
                        str = uwA06.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA08 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA08.first;
                        listSingletonList = (List) pairA08.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA09 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA09.A01;
                        this.A0E = c1073TxA09.A00;
                        str = c1073TxA09.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr8 = A0q;
                            strArr8[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr8[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr8 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr8, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr8);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i12 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA110 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i12).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA110);
                return;
            case -1373388978:
                if (str2.equals(A03(807, 15, 16))) {
                    b = 9;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A07 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A07.A05;
                        this.A0Q = u6A07.A02;
                        str = u6A07.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA07 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA07.A08;
                        this.A0Q = uwA07.A05;
                        str = uwA07.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA09 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA09.first;
                        listSingletonList = (List) pairA09.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA010 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA010.A01;
                        this.A0E = c1073TxA010.A00;
                        str = c1073TxA010.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr9 = A0q;
                            strArr9[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr9[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr9 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr9, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr9);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i13 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA111 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i13).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA111);
                return;
            case -933872740:
                if (str2.equals(A03(411, 8, 59))) {
                    b = 32;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A08 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A08.A05;
                        this.A0Q = u6A08.A02;
                        str = u6A08.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA08 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA08.A08;
                        this.A0Q = uwA08.A05;
                        str = uwA08.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA010 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA010.first;
                        listSingletonList = (List) pairA010.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA011 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA011.A01;
                        this.A0E = c1073TxA011.A00;
                        str = c1073TxA011.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr10 = A0q;
                            strArr10[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr10[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr10 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr10, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr10);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i14 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA112 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i14).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA112);
                return;
            case -538363189:
                if (str2.equals(A03(747, 15, 46))) {
                    b = 5;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A09 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A09.A05;
                        this.A0Q = u6A09.A02;
                        str = u6A09.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA09 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA09.A08;
                        this.A0Q = uwA09.A05;
                        str = uwA09.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA011 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA011.first;
                        listSingletonList = (List) pairA011.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA012 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA012.A01;
                        this.A0E = c1073TxA012.A00;
                        str = c1073TxA012.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr11 = A0q;
                            strArr11[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr11[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr11 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr11, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr11);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i15 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA113 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i15).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA113);
                return;
            case -538363109:
                if (str2.equals(A03(762, 15, 89))) {
                    b = 7;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A010 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A010.A05;
                        this.A0Q = u6A010.A02;
                        str = u6A010.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA010 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA010.A08;
                        this.A0Q = uwA010.A05;
                        str = uwA010.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA012 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA012.first;
                        listSingletonList = (List) pairA012.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA013 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA013.A01;
                        this.A0E = c1073TxA013.A00;
                        str = c1073TxA013.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr12 = A0q;
                            strArr12[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr12[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr12 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr12, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr12);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i16 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA114 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i16).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA114);
                return;
            case -425012669:
                if (str2.equals(A03(463, 8, 124))) {
                    b = 30;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A011 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A011.A05;
                        this.A0Q = u6A011.A02;
                        str = u6A011.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA011 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA011.A08;
                        this.A0Q = uwA011.A05;
                        str = uwA011.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA013 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA013.first;
                        listSingletonList = (List) pairA013.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA014 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA014.A01;
                        this.A0E = c1073TxA014.A00;
                        str = c1073TxA014.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr13 = A0q;
                            strArr13[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr13[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr13 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr13, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr13);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i17 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA115 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i17).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA115);
                return;
            case -356037306:
                if (str2.equals(A03(50, 14, 22))) {
                    b = 21;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A012 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A012.A05;
                        this.A0Q = u6A012.A02;
                        str = u6A012.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA012 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA012.A08;
                        this.A0Q = uwA012.A05;
                        str = uwA012.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA014 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA014.first;
                        listSingletonList = (List) pairA014.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA015 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA015.A01;
                        this.A0E = c1073TxA015.A00;
                        str = c1073TxA015.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr14 = A0q;
                            strArr14[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr14[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr14 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr14, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr14);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i18 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA116 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i18).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA116);
                return;
            case 62923557:
                String[] strArr15 = A0q;
                if (strArr15[0].charAt(3) == strArr15[6].charAt(3)) {
                    A0q[4] = "M2Am21ZTamfWNwW6LNPPe2RpucmumPRs";
                    if (str2.equals(A03(22, 5, 120))) {
                        b = cw.k;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals(A03(22, 5, 120))) {
                    b = cw.k;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A013 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A013.A05;
                        this.A0Q = u6A013.A02;
                        str = u6A013.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA013 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA013.A08;
                        this.A0Q = uwA013.A05;
                        str = uwA013.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA015 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA015.first;
                        listSingletonList = (List) pairA015.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA016 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA016.A01;
                        this.A0E = c1073TxA016.A00;
                        str = c1073TxA016.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr16 = A0q;
                            strArr16[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr16[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr15 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr15, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr15);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i19 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA117 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i19).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA117);
                return;
            case 62923603:
                if (str2.equals(A03(27, 5, 6))) {
                    b = cw.n;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A014 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A014.A05;
                        this.A0Q = u6A014.A02;
                        str = u6A014.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA014 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA014.A08;
                        this.A0Q = uwA014.A05;
                        str = uwA014.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA016 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA016.first;
                        listSingletonList = (List) pairA016.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA017 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA017.A01;
                        this.A0E = c1073TxA017.A00;
                        str = c1073TxA017.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr17 = A0q;
                            strArr17[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr17[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr16 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr16, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr16);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i110 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA118 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i110).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA118);
                return;
            case 62927045:
                if (str2.equals(A03(32, 5, 4))) {
                    b = 19;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A015 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A015.A05;
                        this.A0Q = u6A015.A02;
                        str = u6A015.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA015 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA015.A08;
                        this.A0Q = uwA015.A05;
                        str = uwA015.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA017 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA017.first;
                        listSingletonList = (List) pairA017.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA018 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA018.A01;
                        this.A0E = c1073TxA018.A00;
                        str = c1073TxA018.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr18 = A0q;
                            strArr18[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr18[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr17 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr17, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr17);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i111 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA119 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i111).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA119);
                return;
            case 82318131:
                if (str2.equals(A03(721, 5, 62))) {
                    b = 2;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A016 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A016.A05;
                        this.A0Q = u6A016.A02;
                        str = u6A016.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA016 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA016.A08;
                        this.A0Q = uwA016.A05;
                        str = uwA016.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA018 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA018.first;
                        listSingletonList = (List) pairA018.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA019 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA019.A01;
                        this.A0E = c1073TxA019.A00;
                        str = c1073TxA019.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr19 = A0q;
                            strArr19[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr19[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr18 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr18, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr18);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i112 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1110 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i112).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1110);
                return;
            case 82338133:
                if (str2.equals(A03(830, 5, 73))) {
                    b = 0;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A017 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A017.A05;
                        this.A0Q = u6A017.A02;
                        str = u6A017.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA017 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA017.A08;
                        this.A0Q = uwA017.A05;
                        str = uwA017.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA019 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA019.first;
                        listSingletonList = (List) pairA019.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0110 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0110.A01;
                        this.A0E = c1073TxA0110.A00;
                        str = c1073TxA0110.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr110 = A0q;
                            strArr110[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr110[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr19 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr19, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr19);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i113 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1111 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i113).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1111);
                return;
            case 82338134:
                if (str2.equals(A03(835, 5, 8))) {
                    b = 1;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A018 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A018.A05;
                        this.A0Q = u6A018.A02;
                        str = u6A018.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA018 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA018.A08;
                        this.A0Q = uwA018.A05;
                        str = uwA018.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0110 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0110.first;
                        listSingletonList = (List) pairA0110.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0111 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0111.A01;
                        this.A0E = c1073TxA0111.A00;
                        str = c1073TxA0111.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr111 = A0q;
                            strArr111[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr111[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr110 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr110, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr110);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i114 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1112 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i114).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1112);
                return;
            case 99146302:
                if (str2.equals(A03(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 10, 61))) {
                    b = 31;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A019 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A019.A05;
                        this.A0Q = u6A019.A02;
                        str = u6A019.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA019 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA019.A08;
                        this.A0Q = uwA019.A05;
                        str = uwA019.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0111 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0111.first;
                        listSingletonList = (List) pairA0111.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0112 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0112.A01;
                        this.A0E = c1073TxA0112.A00;
                        str = c1073TxA0112.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr112 = A0q;
                            strArr112[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr112[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr111 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr111, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr111);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i115 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1113 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i115).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1113);
                return;
            case 444813526:
                boolean zEquals = str2.equals(A03(822, 8, 34));
                if (A0q[7].length() == 3) {
                    A0q[7] = "NUn";
                    if (zEquals) {
                        b = 10;
                    } else {
                        b = -1;
                    }
                } else if (zEquals) {
                    b = 10;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0110 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0110.A05;
                        this.A0Q = u6A0110.A02;
                        str = u6A0110.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0110 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0110.A08;
                        this.A0Q = uwA0110.A05;
                        str = uwA0110.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0112 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0112.first;
                        listSingletonList = (List) pairA0112.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0113 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0113.A01;
                        this.A0E = c1073TxA0113.A00;
                        str = c1073TxA0113.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr113 = A0q;
                            strArr113[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr113[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr112 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr112, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr112);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i116 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1114 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i116).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1114);
                return;
            case 542569478:
                if (str2.equals(A03(37, 13, 49))) {
                    b = 20;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0111 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0111.A05;
                        this.A0Q = u6A0111.A02;
                        str = u6A0111.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0111 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0111.A08;
                        this.A0Q = uwA0111.A05;
                        str = uwA0111.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0113 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0113.first;
                        listSingletonList = (List) pairA0113.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0114 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0114.A01;
                        this.A0E = c1073TxA0114.A00;
                        str = c1073TxA0114.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr114 = A0q;
                            strArr114[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr114[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr113 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr113, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr113);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i117 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1115 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i117).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1115);
                return;
            case 635596514:
                String[] strArr20 = A0q;
                if (strArr20[3].charAt(14) != strArr20[5].charAt(14)) {
                    A0q[4] = "viO2ziJrhpsLJXIg1U95cvXMyjnEoLX2";
                    if (str2.equals(A03(108, 16, 111))) {
                        b = 26;
                    } else {
                        b = -1;
                    }
                    strA03 = A03(0, 22, 104);
                    strA04 = A03(312, 17, 108);
                    switch (b) {
                        case 0:
                            strA05 = A03(1204, 19, 27);
                            break;
                        case 1:
                            strA05 = A03(1223, 19, 52);
                            break;
                        case 2:
                            strA05 = A03(1098, 10, 51);
                            break;
                        case 3:
                            strA05 = A03(1168, 11, 43);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            strA05 = A03(1155, 13, 107);
                            if (this.A0j == null) {
                                listSingletonList = Collections.singletonList(this.A0j);
                            } else {
                                listSingletonList = null;
                            }
                            break;
                        case 7:
                            strA05 = A03(1108, 9, 85);
                            U6 u6A0112 = U6.A00(new C1576fq(A0D(this.A0d)));
                            listSingletonList = u6A0112.A05;
                            this.A0Q = u6A0112.A02;
                            str = u6A0112.A04;
                            break;
                        case 8:
                            strA05 = A03(1145, 10, 8);
                            UW uwA0112 = UW.A00(new C1576fq(A0D(this.A0d)));
                            listSingletonList = uwA0112.A08;
                            this.A0Q = uwA0112.A05;
                            str = uwA0112.A07;
                            break;
                        case 9:
                            Pair<String, List<byte[]>> pairA0114 = A02(new C1576fq(A0D(this.A0d)));
                            strA05 = (String) pairA0114.first;
                            listSingletonList = (List) pairA0114.second;
                            break;
                        case 10:
                            strA05 = A03(1189, 15, 98);
                            break;
                        case 11:
                            strA05 = A03(1040, 12, 19);
                            i5 = 8192;
                            listSingletonList = A05(A0D(this.A0d));
                            break;
                        case 12:
                            strA05 = A03(979, 10, 113);
                            i5 = 5760;
                            listSingletonList = new ArrayList<>(3);
                            listSingletonList.add(A0D(this.A0d));
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                            break;
                        case 13:
                            strA05 = A03(941, 15, 14);
                            listSingletonList = Collections.singletonList(A0D(this.A0d));
                            C1073Tx c1073TxA0115 = AbstractC1074Ty.A03(this.A0j);
                            this.A0T = c1073TxA0115.A01;
                            this.A0E = c1073TxA0115.A00;
                            str = c1073TxA0115.A02;
                            break;
                        case 14:
                            strA05 = A03(966, 13, 52);
                            i5 = 4096;
                            break;
                        case 15:
                            strA05 = A03(956, 10, 70);
                            i5 = 4096;
                            break;
                        case 16:
                            strA05 = A03(912, 9, 51);
                            break;
                        case 17:
                            strA05 = A03(921, 10, 87);
                            break;
                        case 18:
                            strA05 = A03(998, 13, 124);
                            this.A0c = new C1087Up();
                            break;
                        case 19:
                        case 20:
                            strA05 = A03(1011, 13, 53);
                            break;
                        case 21:
                            strA05 = A03(1024, 16, 18);
                            break;
                        case 22:
                            strA05 = A03(931, 10, 122);
                            listSingletonList = Collections.singletonList(A0D(this.A0d));
                            break;
                        case 23:
                            strA05 = A03(989, 9, 17);
                            if (A0A(new C1576fq(A0D(this.A0d)))) {
                                iA03 = AbstractC1600gE.A03(this.A0D);
                                if (iA03 == 0) {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                                }
                            } else {
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                            }
                            break;
                        case 24:
                            strA05 = A03(989, 9, 17);
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                            }
                            break;
                        case 25:
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 8) {
                                iA03 = 3;
                            } else if (this.A0D == 16) {
                                iA03 = 268435456;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                            }
                            break;
                        case 26:
                            if (A0q[1].length() != 31) {
                                strA05 = A03(989, 9, 17);
                                if (this.A0D == 32) {
                                    iA03 = 4;
                                } else {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                                }
                            } else {
                                String[] strArr115 = A0q;
                                strArr115[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                                strArr115[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                                strA05 = A03(989, 9, 17);
                                if (this.A0D == 32) {
                                    iA03 = 4;
                                } else {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                                }
                            }
                            break;
                        case 27:
                            strA05 = A03(892, 20, 115);
                            break;
                        case 28:
                            strA05 = A03(1078, 10, 109);
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                            break;
                        case 29:
                            strA05 = A03(1070, 8, 120);
                            break;
                        case 30:
                            strA05 = A03(874, 18, 55);
                            if (A0q[1].length() != 31) {
                                throw new RuntimeException();
                            }
                            A0q[2] = "9";
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                            break;
                        case 31:
                            strA05 = A03(859, 15, 89);
                            break;
                        case 32:
                            strA05 = A03(840, 19, 17);
                            byte[] bArr114 = new byte[4];
                            System.arraycopy(A0D(this.A0d), 0, bArr114, 0, 4);
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr114);
                            break;
                        default:
                            throw Q6.A01(A03(543, 30, 72), null);
                    }
                    bArr = this.A0k;
                    strArr = A0q;
                    if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                        A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                        if (bArr != null) {
                            uhA00 = UH.A00(new C1576fq(this.A0k));
                            if (uhA00 != null) {
                                str = uhA00.A02;
                                strA05 = A03(1127, 18, 110);
                            }
                        }
                    } else if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                    int i118 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    p5 = new P5();
                    if (Q2.A0C(strA05)) {
                        i2 = 1;
                        p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                    } else {
                        if (Q2.A0F(strA05)) {
                            i2 = 2;
                            if (this.A0K == 0) {
                                if (this.A0L == -1) {
                                    i3 = this.A0W;
                                } else {
                                    i3 = this.A0L;
                                }
                                this.A0L = i3;
                                if (this.A0J == -1) {
                                    i4 = this.A0M;
                                } else {
                                    i4 = this.A0J;
                                }
                                this.A0J = i4;
                            }
                            f = -1.0f;
                            if (this.A0L != -1) {
                                f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                            }
                            colorInfo = null;
                            if (this.A0h) {
                                colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                            }
                            iIntValue = -1;
                            if (this.A0e != null) {
                                iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                            }
                            if (this.A0S == 0) {
                                if (Float.compare(this.A09, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.A08, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.A08, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                        } else {
                            if (!A03(892, 20, 115).equals(strA05)) {
                            }
                            i2 = 3;
                        }
                        break;
                    }
                    if (this.A0e != null) {
                        p5.A0z(this.A0e);
                    }
                    ZM zmA1116 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i118).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                    this.A0b = ul.AJX(this.A0R, i2);
                    this.A0b.A6U(zmA1116);
                    return;
                }
                throw new RuntimeException();
            case 725948237:
                if (str2.equals(A03(124, 13, 46))) {
                    b = 25;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0113 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0113.A05;
                        this.A0Q = u6A0113.A02;
                        str = u6A0113.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0113 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0113.A08;
                        this.A0Q = uwA0113.A05;
                        str = uwA0113.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0115 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0115.first;
                        listSingletonList = (List) pairA0115.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0116 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0116.A01;
                        this.A0E = c1073TxA0116.A00;
                        str = c1073TxA0116.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr116 = A0q;
                            strArr116[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr116[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr115 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr115, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr115);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i119 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1117 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i119).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1117);
                return;
            case 725957860:
                if (str2.equals(A03(137, 13, 50))) {
                    b = 24;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0114 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0114.A05;
                        this.A0Q = u6A0114.A02;
                        str = u6A0114.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0114 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0114.A08;
                        this.A0Q = uwA0114.A05;
                        str = uwA0114.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0116 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0116.first;
                        listSingletonList = (List) pairA0116.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0117 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0117.A01;
                        this.A0E = c1073TxA0117.A00;
                        str = c1073TxA0117.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr117 = A0q;
                            strArr117[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr117[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr116 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr116, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr116);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1110 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1118 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1110).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1118);
                return;
            case 738597099:
                if (str2.equals(A03(429, 10, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE))) {
                    b = 28;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0115 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0115.A05;
                        this.A0Q = u6A0115.A02;
                        str = u6A0115.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0115 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0115.A08;
                        this.A0Q = uwA0115.A05;
                        str = uwA0115.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0117 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0117.first;
                        listSingletonList = (List) pairA0117.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0118 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0118.A01;
                        this.A0E = c1073TxA0118.A00;
                        str = c1073TxA0118.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr118 = A0q;
                            strArr118[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr118[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr117 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr117, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr117);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1111 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA1119 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1111).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA1119);
                return;
            case 855502857:
                if (str2.equals(A03(791, 16, 33))) {
                    b = 8;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0116 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0116.A05;
                        this.A0Q = u6A0116.A02;
                        str = u6A0116.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0116 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0116.A08;
                        this.A0Q = uwA0116.A05;
                        str = uwA0116.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0118 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0118.first;
                        listSingletonList = (List) pairA0118.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA0119 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA0119.A01;
                        this.A0E = c1073TxA0119.A00;
                        str = c1073TxA0119.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr119 = A0q;
                            strArr119[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr119[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr118 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr118, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr118);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1112 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11110 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1112).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11110);
                return;
            case 1045209816:
                if (str2.equals(A03(450, 13, 43))) {
                    b = 29;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0117 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0117.A05;
                        this.A0Q = u6A0117.A02;
                        str = u6A0117.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0117 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0117.A08;
                        this.A0Q = uwA0117.A05;
                        str = uwA0117.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA0119 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA0119.first;
                        listSingletonList = (List) pairA0119.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01110 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01110.A01;
                        this.A0E = c1073TxA01110.A00;
                        str = c1073TxA01110.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1110 = A0q;
                            strArr1110[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1110[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr119 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr119, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr119);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1113 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11111 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1113).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11111);
                return;
            case 1422270023:
                if (str2.equals(A03(439, 11, 67))) {
                    b = 27;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0118 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0118.A05;
                        this.A0Q = u6A0118.A02;
                        str = u6A0118.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0118 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0118.A08;
                        this.A0Q = uwA0118.A05;
                        str = uwA0118.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA01110 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA01110.first;
                        listSingletonList = (List) pairA01110.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01111 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01111.A01;
                        this.A0E = c1073TxA01111.A00;
                        str = c1073TxA01111.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1111 = A0q;
                            strArr1111[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1111[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr1110 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr1110, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1110);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1114 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11112 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1114).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11112);
                return;
            case 1809237540:
                if (str2.equals(A03(726, 7, 68))) {
                    b = 3;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A0119 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A0119.A05;
                        this.A0Q = u6A0119.A02;
                        str = u6A0119.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA0119 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA0119.A08;
                        this.A0Q = uwA0119.A05;
                        str = uwA0119.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA01111 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA01111.first;
                        listSingletonList = (List) pairA01111.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01112 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01112.A01;
                        this.A0E = c1073TxA01112.A00;
                        str = c1073TxA01112.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1112 = A0q;
                            strArr1112[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1112[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr1111 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr1111, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1111);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1115 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11113 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1115).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11113);
                return;
            case 1950749482:
                if (str2.equals(A03(64, 6, 24))) {
                    b = 17;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A01110 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A01110.A05;
                        this.A0Q = u6A01110.A02;
                        str = u6A01110.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA01110 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA01110.A08;
                        this.A0Q = uwA01110.A05;
                        str = uwA01110.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA01112 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA01112.first;
                        listSingletonList = (List) pairA01112.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01113 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01113.A01;
                        this.A0E = c1073TxA01113.A00;
                        str = c1073TxA01113.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1113 = A0q;
                            strArr1113[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1113[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr1112 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr1112, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1112);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1116 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11114 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1116).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11114);
                return;
            case 1950789798:
                if (str2.equals(A03(70, 6, 45))) {
                    b = 22;
                } else {
                    b = -1;
                }
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A01111 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A01111.A05;
                        this.A0Q = u6A01111.A02;
                        str = u6A01111.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA01111 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA01111.A08;
                        this.A0Q = uwA01111.A05;
                        str = uwA01111.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA01113 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA01113.first;
                        listSingletonList = (List) pairA01113.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01114 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01114.A01;
                        this.A0E = c1073TxA01114.A00;
                        str = c1073TxA01114.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1114 = A0q;
                            strArr1114[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1114[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr1113 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr1113, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1113);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1117 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11115 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1117).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11115);
                return;
            case 1951062397:
                if (A0q[1].length() == 31) {
                    A0q[2] = "I";
                    if (str2.equals(A03(102, 6, 121))) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    strA03 = A03(0, 22, 104);
                    strA04 = A03(312, 17, 108);
                    switch (b) {
                        case 0:
                            strA05 = A03(1204, 19, 27);
                            break;
                        case 1:
                            strA05 = A03(1223, 19, 52);
                            break;
                        case 2:
                            strA05 = A03(1098, 10, 51);
                            break;
                        case 3:
                            strA05 = A03(1168, 11, 43);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            strA05 = A03(1155, 13, 107);
                            if (this.A0j == null) {
                                listSingletonList = Collections.singletonList(this.A0j);
                            } else {
                                listSingletonList = null;
                            }
                            break;
                        case 7:
                            strA05 = A03(1108, 9, 85);
                            U6 u6A01112 = U6.A00(new C1576fq(A0D(this.A0d)));
                            listSingletonList = u6A01112.A05;
                            this.A0Q = u6A01112.A02;
                            str = u6A01112.A04;
                            break;
                        case 8:
                            strA05 = A03(1145, 10, 8);
                            UW uwA01112 = UW.A00(new C1576fq(A0D(this.A0d)));
                            listSingletonList = uwA01112.A08;
                            this.A0Q = uwA01112.A05;
                            str = uwA01112.A07;
                            break;
                        case 9:
                            Pair<String, List<byte[]>> pairA01114 = A02(new C1576fq(A0D(this.A0d)));
                            strA05 = (String) pairA01114.first;
                            listSingletonList = (List) pairA01114.second;
                            break;
                        case 10:
                            strA05 = A03(1189, 15, 98);
                            break;
                        case 11:
                            strA05 = A03(1040, 12, 19);
                            i5 = 8192;
                            listSingletonList = A05(A0D(this.A0d));
                            break;
                        case 12:
                            strA05 = A03(979, 10, 113);
                            i5 = 5760;
                            listSingletonList = new ArrayList<>(3);
                            listSingletonList.add(A0D(this.A0d));
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                            listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                            break;
                        case 13:
                            strA05 = A03(941, 15, 14);
                            listSingletonList = Collections.singletonList(A0D(this.A0d));
                            C1073Tx c1073TxA01115 = AbstractC1074Ty.A03(this.A0j);
                            this.A0T = c1073TxA01115.A01;
                            this.A0E = c1073TxA01115.A00;
                            str = c1073TxA01115.A02;
                            break;
                        case 14:
                            strA05 = A03(966, 13, 52);
                            i5 = 4096;
                            break;
                        case 15:
                            strA05 = A03(956, 10, 70);
                            i5 = 4096;
                            break;
                        case 16:
                            strA05 = A03(912, 9, 51);
                            break;
                        case 17:
                            strA05 = A03(921, 10, 87);
                            break;
                        case 18:
                            strA05 = A03(998, 13, 124);
                            this.A0c = new C1087Up();
                            break;
                        case 19:
                        case 20:
                            strA05 = A03(1011, 13, 53);
                            break;
                        case 21:
                            strA05 = A03(1024, 16, 18);
                            break;
                        case 22:
                            strA05 = A03(931, 10, 122);
                            listSingletonList = Collections.singletonList(A0D(this.A0d));
                            break;
                        case 23:
                            strA05 = A03(989, 9, 17);
                            if (A0A(new C1576fq(A0D(this.A0d)))) {
                                iA03 = AbstractC1600gE.A03(this.A0D);
                                if (iA03 == 0) {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                                }
                            } else {
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                            }
                            break;
                        case 24:
                            strA05 = A03(989, 9, 17);
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                            }
                            break;
                        case 25:
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 8) {
                                iA03 = 3;
                            } else if (this.A0D == 16) {
                                iA03 = 268435456;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                            }
                            break;
                        case 26:
                            if (A0q[1].length() != 31) {
                                strA05 = A03(989, 9, 17);
                                if (this.A0D == 32) {
                                    iA03 = 4;
                                } else {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                                }
                            } else {
                                String[] strArr1115 = A0q;
                                strArr1115[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                                strArr1115[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                                strA05 = A03(989, 9, 17);
                                if (this.A0D == 32) {
                                    iA03 = 4;
                                } else {
                                    iA03 = -1;
                                    strA05 = A03(1052, 15, 2);
                                    AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                                }
                            }
                            break;
                        case 27:
                            strA05 = A03(892, 20, 115);
                            break;
                        case 28:
                            strA05 = A03(1078, 10, 109);
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                            break;
                        case 29:
                            strA05 = A03(1070, 8, 120);
                            break;
                        case 30:
                            strA05 = A03(874, 18, 55);
                            if (A0q[1].length() != 31) {
                                throw new RuntimeException();
                            }
                            A0q[2] = "9";
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                            break;
                        case 31:
                            strA05 = A03(859, 15, 89);
                            break;
                        case 32:
                            strA05 = A03(840, 19, 17);
                            byte[] bArr1114 = new byte[4];
                            System.arraycopy(A0D(this.A0d), 0, bArr1114, 0, 4);
                            listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1114);
                            break;
                        default:
                            throw Q6.A01(A03(543, 30, 72), null);
                    }
                    bArr = this.A0k;
                    strArr = A0q;
                    if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                        A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                        if (bArr != null) {
                            uhA00 = UH.A00(new C1576fq(this.A0k));
                            if (uhA00 != null) {
                                str = uhA00.A02;
                                strA05 = A03(1127, 18, 110);
                            }
                        }
                    } else if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                    int i1118 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    p5 = new P5();
                    if (Q2.A0C(strA05)) {
                        i2 = 1;
                        p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                    } else {
                        if (Q2.A0F(strA05)) {
                            i2 = 2;
                            if (this.A0K == 0) {
                                if (this.A0L == -1) {
                                    i3 = this.A0W;
                                } else {
                                    i3 = this.A0L;
                                }
                                this.A0L = i3;
                                if (this.A0J == -1) {
                                    i4 = this.A0M;
                                } else {
                                    i4 = this.A0J;
                                }
                                this.A0J = i4;
                            }
                            f = -1.0f;
                            if (this.A0L != -1) {
                                f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                            }
                            colorInfo = null;
                            if (this.A0h) {
                                colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                            }
                            iIntValue = -1;
                            if (this.A0e != null) {
                                iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                            }
                            if (this.A0S == 0) {
                                if (Float.compare(this.A09, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.A08, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.A08, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                        } else {
                            if (!A03(892, 20, 115).equals(strA05)) {
                            }
                            i2 = 3;
                        }
                        break;
                    }
                    if (this.A0e != null) {
                        p5.A0z(this.A0e);
                    }
                    ZM zmA11116 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1118).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                    this.A0b = ul.AJX(this.A0R, i2);
                    this.A0b.A6U(zmA11116);
                    return;
                }
                throw new RuntimeException();
            default:
                b = -1;
                strA03 = A03(0, 22, 104);
                strA04 = A03(312, 17, 108);
                switch (b) {
                    case 0:
                        strA05 = A03(1204, 19, 27);
                        break;
                    case 1:
                        strA05 = A03(1223, 19, 52);
                        break;
                    case 2:
                        strA05 = A03(1098, 10, 51);
                        break;
                    case 3:
                        strA05 = A03(1168, 11, 43);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        strA05 = A03(1155, 13, 107);
                        if (this.A0j == null) {
                            listSingletonList = Collections.singletonList(this.A0j);
                        } else {
                            listSingletonList = null;
                        }
                        break;
                    case 7:
                        strA05 = A03(1108, 9, 85);
                        U6 u6A01113 = U6.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = u6A01113.A05;
                        this.A0Q = u6A01113.A02;
                        str = u6A01113.A04;
                        break;
                    case 8:
                        strA05 = A03(1145, 10, 8);
                        UW uwA01113 = UW.A00(new C1576fq(A0D(this.A0d)));
                        listSingletonList = uwA01113.A08;
                        this.A0Q = uwA01113.A05;
                        str = uwA01113.A07;
                        break;
                    case 9:
                        Pair<String, List<byte[]>> pairA01115 = A02(new C1576fq(A0D(this.A0d)));
                        strA05 = (String) pairA01115.first;
                        listSingletonList = (List) pairA01115.second;
                        break;
                    case 10:
                        strA05 = A03(1189, 15, 98);
                        break;
                    case 11:
                        strA05 = A03(1040, 12, 19);
                        i5 = 8192;
                        listSingletonList = A05(A0D(this.A0d));
                        break;
                    case 12:
                        strA05 = A03(979, 10, 113);
                        i5 = 5760;
                        listSingletonList = new ArrayList<>(3);
                        listSingletonList.add(A0D(this.A0d));
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                        listSingletonList.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                        break;
                    case 13:
                        strA05 = A03(941, 15, 14);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        C1073Tx c1073TxA01116 = AbstractC1074Ty.A03(this.A0j);
                        this.A0T = c1073TxA01116.A01;
                        this.A0E = c1073TxA01116.A00;
                        str = c1073TxA01116.A02;
                        break;
                    case 14:
                        strA05 = A03(966, 13, 52);
                        i5 = 4096;
                        break;
                    case 15:
                        strA05 = A03(956, 10, 70);
                        i5 = 4096;
                        break;
                    case 16:
                        strA05 = A03(912, 9, 51);
                        break;
                    case 17:
                        strA05 = A03(921, 10, 87);
                        break;
                    case 18:
                        strA05 = A03(998, 13, 124);
                        this.A0c = new C1087Up();
                        break;
                    case 19:
                    case 20:
                        strA05 = A03(1011, 13, 53);
                        break;
                    case 21:
                        strA05 = A03(1024, 16, 18);
                        break;
                    case 22:
                        strA05 = A03(931, 10, 122);
                        listSingletonList = Collections.singletonList(A0D(this.A0d));
                        break;
                    case 23:
                        strA05 = A03(989, 9, 17);
                        if (A0A(new C1576fq(A0D(this.A0d)))) {
                            iA03 = AbstractC1600gE.A03(this.A0D);
                            if (iA03 == 0) {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(573, 27, 110) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(360, 51, 95) + strA05);
                        }
                        break;
                    case 24:
                        strA05 = A03(989, 9, 17);
                        iA03 = AbstractC1600gE.A03(this.A0D);
                        if (iA03 == 0) {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(680, 41, 13) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 25:
                        strA05 = A03(989, 9, 17);
                        if (this.A0D == 8) {
                            iA03 = 3;
                        } else if (this.A0D == 16) {
                            iA03 = 268435456;
                        } else {
                            iA03 = -1;
                            strA05 = A03(1052, 15, 2);
                            AbstractC1561fb.A07(strA04, A03(600, 38, 43) + this.A0D + strA03 + strA05);
                        }
                        break;
                    case 26:
                        if (A0q[1].length() != 31) {
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        } else {
                            String[] strArr1116 = A0q;
                            strArr1116[0] = "VzsbR3n24aVmPGQgSMzmyIJOjHYpH2dt";
                            strArr1116[6] = "eC9bCyKLKjWlhEpA5kc8XX8mvQr2dxcv";
                            strA05 = A03(989, 9, 17);
                            if (this.A0D == 32) {
                                iA03 = 4;
                            } else {
                                iA03 = -1;
                                strA05 = A03(1052, 15, 2);
                                AbstractC1561fb.A07(strA04, A03(638, 42, 46) + this.A0D + strA03 + strA05);
                            }
                        }
                        break;
                    case 27:
                        strA05 = A03(892, 20, 115);
                        break;
                    case 28:
                        strA05 = A03(1078, 10, 109);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(MatroskaExtractor.A0y, A0D(this.A0d));
                        break;
                    case 29:
                        strA05 = A03(1070, 8, 120);
                        break;
                    case 30:
                        strA05 = A03(874, 18, 55);
                        if (A0q[1].length() != 31) {
                            throw new RuntimeException();
                        }
                        A0q[2] = "9";
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(A0D(this.A0d));
                        break;
                    case 31:
                        strA05 = A03(859, 15, 89);
                        break;
                    case 32:
                        strA05 = A03(840, 19, 17);
                        byte[] bArr1115 = new byte[4];
                        System.arraycopy(A0D(this.A0d), 0, bArr1115, 0, 4);
                        listSingletonList = MetaExoPlayerCustomizedCollections.A03(bArr1115);
                        break;
                    default:
                        throw Q6.A01(A03(543, 30, 72), null);
                }
                bArr = this.A0k;
                strArr = A0q;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    A0q[4] = "43BGWEbl11IX5LqYqvM9aHs09hlxmseW";
                    if (bArr != null) {
                        uhA00 = UH.A00(new C1576fq(this.A0k));
                        if (uhA00 != null) {
                            str = uhA00.A02;
                            strA05 = A03(1127, 18, 110);
                        }
                    }
                } else if (bArr != null) {
                    uhA00 = UH.A00(new C1576fq(this.A0k));
                    if (uhA00 != null) {
                        str = uhA00.A02;
                        strA05 = A03(1127, 18, 110);
                    }
                }
                int i1119 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                p5 = new P5();
                if (Q2.A0C(strA05)) {
                    i2 = 1;
                    p5.A0b(this.A0E).A0m(this.A0T).A0i(iA03);
                } else {
                    if (Q2.A0F(strA05)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            if (this.A0J == -1) {
                                i4 = this.A0M;
                            } else {
                                i4 = this.A0J;
                            }
                            this.A0J = i4;
                        }
                        f = -1.0f;
                        if (this.A0L != -1) {
                            f = (this.A0M * this.A0L) / (this.A0W * this.A0J);
                        }
                        colorInfo = null;
                        if (this.A0h) {
                            colorInfo = new ColorInfo(this.A0G, this.A0F, this.A0H, A0C());
                        }
                        iIntValue = -1;
                        if (this.A0e != null) {
                            iIntValue = ((Integer) MatroskaExtractor.A0w.get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.A08, -180.0f) != 0) {
                                iIntValue = 180;
                            } else {
                                iIntValue = 180;
                            }
                        }
                        p5.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(iIntValue).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 115).equals(strA05)) {
                        }
                        i2 = 3;
                    }
                    break;
                }
                if (this.A0e != null) {
                    p5.A0z(this.A0e);
                }
                ZM zmA11117 = p5.A0g(i).A11(strA05).A0h(i5).A10(this.A0o).A0n(i1119).A12(listSingletonList).A0w(str).A0u(this.A0Z).A14();
                this.A0b = ul.AJX(this.A0R, i2);
                this.A0b.A6U(zmA11117);
                return;
        }
    }
}
