package com.google.android.exoplayer2.extractor.mp4;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.graphics.GL20;
import com.facebook.ads.redexgen.core.AbstractC1078Ud;
import com.facebook.ads.redexgen.core.AbstractC1517es;
import com.facebook.ads.redexgen.core.AbstractC1561fb;
import com.facebook.ads.redexgen.core.AbstractC1600gE;
import com.facebook.ads.redexgen.core.C1056Te;
import com.facebook.ads.redexgen.core.C1062Tl;
import com.facebook.ads.redexgen.core.C1063Tm;
import com.facebook.ads.redexgen.core.C1081Ug;
import com.facebook.ads.redexgen.core.C1085Um;
import com.facebook.ads.redexgen.core.C1122Wa;
import com.facebook.ads.redexgen.core.C1123Wb;
import com.facebook.ads.redexgen.core.C1124Wc;
import com.facebook.ads.redexgen.core.C1576fq;
import com.facebook.ads.redexgen.core.C1590g4;
import com.facebook.ads.redexgen.core.EnumC0893Mn;
import com.facebook.ads.redexgen.core.InterfaceC1086Uo;
import com.facebook.ads.redexgen.core.InterfaceC1699hs;
import com.facebook.ads.redexgen.core.MetaExoPlayerUpgradeConfig;
import com.facebook.ads.redexgen.core.P5;
import com.facebook.ads.redexgen.core.Q6;
import com.facebook.ads.redexgen.core.U5;
import com.facebook.ads.redexgen.core.UE;
import com.facebook.ads.redexgen.core.UK;
import com.facebook.ads.redexgen.core.UL;
import com.facebook.ads.redexgen.core.UO;
import com.facebook.ads.redexgen.core.UV;
import com.facebook.ads.redexgen.core.Uj;
import com.facebook.ads.redexgen.core.VB;
import com.facebook.ads.redexgen.core.W5;
import com.facebook.ads.redexgen.core.WB;
import com.facebook.ads.redexgen.core.WC;
import com.facebook.ads.redexgen.core.WJ;
import com.facebook.ads.redexgen.core.WK;
import com.facebook.ads.redexgen.core.WL;
import com.facebook.ads.redexgen.core.WS;
import com.facebook.ads.redexgen.core.WX;
import com.facebook.ads.redexgen.core.WY;
import com.facebook.ads.redexgen.core.WZ;
import com.facebook.ads.redexgen.core.ZM;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.DrmInitData;
import com.google.android.exoplayer2.extractor.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Rename the class for A/B Testing")
public final class FragmentedMp4Extractor2 implements UK {
    public static byte[] A0Z;
    public static String[] A0a = {"UhkiW08sdOa6MLqzIxYa4l6K9Go8a5nF", "0UFlLg2A4E4sCS9MRLaMIQbXScdTT2aj", "iyvk7MPRNYXsGx2HwftmeYTgR4EbhnjX", "wJRD974Ex9w1JOFbbQk9dJPapCoIWG3I", "TAvpDkSr8CiZNLyjRIryejX1W3gbvalg", "E7R6UmYIGyDjj1Lsm6lfBdw0aO8xTv0G", "aqeXoqbVEtO0YmQrU7KD8QPSJI0EqN0Q", "C5jyPerRkNgqLB67qnSND9Qg4ogDmW"};
    public static final UO A0b;
    public static final ZM A0c;
    public static final byte[] A0d;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public UL A0D;
    public WL A0E;
    public C1576fq A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC1086Uo[] A0I;
    public InterfaceC1086Uo[] A0J;
    public final int A0K;
    public final SparseArray<WL> A0L;
    public final InterfaceC1086Uo A0M;
    public final VB A0N;
    public final WZ A0O;
    public final C1576fq A0P;
    public final C1576fq A0Q;
    public final C1576fq A0R;
    public final C1576fq A0S;
    public final C1576fq A0T;
    public final C1590g4 A0U;
    public final ArrayDeque<C1063Tm> A0V;
    public final ArrayDeque<WK> A0W;
    public final List<ZM> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(WL wl, int i, int i2, C1576fq c1576fq, int i3) throws Q6 {
        boolean z;
        int i4;
        long j;
        long j2;
        int iA0C;
        int iA0C2;
        int iA0C3;
        boolean z2;
        String[] strArr;
        int i5 = i3;
        c1576fq.A0f(8);
        int iA02 = W5.A02(c1576fq.A0C());
        WZ wz = wl.A05.A03;
        C1123Wb c1123Wb = wl.A08;
        WC wc = (WC) AbstractC1600gE.A0f(c1123Wb.A06);
        c1123Wb.A0C[i] = c1576fq.A0L();
        c1123Wb.A0E[i] = c1123Wb.A04;
        if ((iA02 & 1) != 0) {
            long[] jArr = c1123Wb.A0E;
            jArr[i] = jArr[i] + ((long) c1576fq.A0C());
        }
        boolean z3 = (iA02 & 4) != 0;
        int iA0C4 = wc.A01;
        if (z3) {
            iA0C4 = c1576fq.A0C();
        }
        boolean z4 = (iA02 & 256) != 0;
        boolean z5 = (iA02 & 512) != 0;
        boolean z6 = (iA02 & 1024) != 0;
        boolean z7 = (iA02 & 2048) != 0;
        long j3 = 0;
        if (A0a(wz)) {
            Object objA0f = AbstractC1600gE.A0f(wz.A09);
            if (A0a[5].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0a;
            strArr2[2] = "WsvNK9QlkEd1tgLt2pRd9oBzJYHZlJu8";
            strArr2[4] = "FgvdpTvnwwDWv8tGOkNT3BJRUYjsD2YL";
            j3 = ((long[]) objA0f)[0];
        }
        int[] iArr = c1123Wb.A0B;
        long[] jArr2 = c1123Wb.A0D;
        boolean[] zArr = c1123Wb.A0G;
        String[] strArr3 = A0a;
        if (strArr3[3].charAt(22) == strArr3[6].charAt(22)) {
            A0a[7] = "QPwtP4ZoDF77usO4BoGzkXQHpiiZx";
            if (wz.A03 == 2) {
                if ((i2 & 1) != 0) {
                }
            }
            i4 = i5 + c1123Wb.A0C[i];
            j = wz.A06;
            j2 = c1123Wb.A05;
            while (i5 < i4) {
                if (z4) {
                    iA0C = c1576fq.A0C();
                } else {
                    iA0C = wc.A00;
                }
                int iA00 = A00(iA0C);
                if (z5) {
                    iA0C2 = c1576fq.A0C();
                    strArr = A0a;
                    if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                        throw new RuntimeException();
                    }
                    A0a[7] = "rur";
                } else {
                    iA0C2 = wc.A03;
                }
                int iA01 = A00(iA0C2);
                if (z6) {
                    iA0C3 = c1576fq.A0C();
                } else if (i5 == 0) {
                    iA0C3 = wc.A01;
                } else {
                    iA0C3 = wc.A01;
                }
                jArr2[i5] = AbstractC1600gE.A0U((((long) (z7 ? c1576fq.A0C() : 0)) + j2) - j3, 1000000L, j);
                if (!c1123Wb.A09) {
                    jArr2[i5] = jArr2[i5] + wl.A05.A02;
                }
                iArr[i5] = iA01;
                if (((iA0C3 >> 16) & 1) == 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                zArr[i5] = z2;
                j2 += (long) iA00;
                i5++;
            }
            c1123Wb.A05 = j2;
            return i4;
        }
        A0a[7] = "SLrYK4z6iXCHMMkJO";
        if (wz.A03 == 0) {
            z = (i2 & 1) != 0;
        }
        i4 = i5 + c1123Wb.A0C[i];
        j = wz.A06;
        j2 = c1123Wb.A05;
        while (i5 < i4) {
            if (z4) {
                iA0C = c1576fq.A0C();
            } else {
                iA0C = wc.A00;
            }
            int iA03 = A00(iA0C);
            if (z5) {
                iA0C2 = c1576fq.A0C();
                strArr = A0a;
                if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                    throw new RuntimeException();
                }
                A0a[7] = "rur";
            } else {
                iA0C2 = wc.A03;
            }
            int iA04 = A00(iA0C2);
            if (z6) {
                iA0C3 = c1576fq.A0C();
            } else if (i5 == 0 || !z3) {
                iA0C3 = wc.A01;
            } else {
                iA0C3 = iA0C4;
            }
            jArr2[i5] = AbstractC1600gE.A0U((((long) (z7 ? c1576fq.A0C() : 0)) + j2) - j3, 1000000L, j);
            if (!c1123Wb.A09) {
                jArr2[i5] = jArr2[i5] + wl.A05.A02;
            }
            iArr[i5] = iA04;
            if (((iA0C3 >> 16) & 1) == 0 || (z && i5 != 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            zArr[i5] = z2;
            j2 += (long) iA03;
            i5++;
        }
        c1123Wb.A05 = j2;
        return i4;
        i4 = i5 + c1123Wb.A0C[i];
        j = wz.A06;
        j2 = c1123Wb.A05;
        while (i5 < i4) {
            if (z4) {
                iA0C = c1576fq.A0C();
            } else {
                iA0C = wc.A00;
            }
            int iA05 = A00(iA0C);
            if (z5) {
                iA0C2 = c1576fq.A0C();
                strArr = A0a;
                if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                    throw new RuntimeException();
                }
                A0a[7] = "rur";
            } else {
                iA0C2 = wc.A03;
            }
            int iA06 = A00(iA0C2);
            if (z6) {
                iA0C3 = c1576fq.A0C();
            } else if (i5 == 0) {
                iA0C3 = wc.A01;
            } else {
                iA0C3 = wc.A01;
            }
            jArr2[i5] = AbstractC1600gE.A0U((((long) (z7 ? c1576fq.A0C() : 0)) + j2) - j3, 1000000L, j);
            if (!c1123Wb.A09) {
                jArr2[i5] = jArr2[i5] + wl.A05.A02;
            }
            iArr[i5] = iA06;
            if (((iA0C3 >> 16) & 1) == 0) {
                z2 = false;
            } else {
                z2 = false;
            }
            zArr[i5] = z2;
            j2 += (long) iA05;
            i5++;
        }
        c1123Wb.A05 = j2;
        return i4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, WY> A05(C1576fq c1576fq, long j) throws Q6 {
        long jA0R;
        long jA0R2;
        c1576fq.A0f(8);
        int iA03 = W5.A03(c1576fq.A0C());
        c1576fq.A0g(4);
        long jA0Q = c1576fq.A0Q();
        if (iA03 == 0) {
            jA0R = c1576fq.A0Q();
            jA0R2 = j + c1576fq.A0Q();
        } else {
            jA0R = c1576fq.A0R();
            jA0R2 = j + c1576fq.A0R();
        }
        long jA0U = AbstractC1600gE.A0U(jA0R, 1000000L, jA0Q);
        c1576fq.A0g(2);
        int iA0M = c1576fq.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i = 0; i < iA0M; i++) {
            int iA0C = c1576fq.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw Q6.A01(A0A(756, 28, 2), null);
            }
            long jA0Q2 = c1576fq.A0Q();
            iArr[i] = Integer.MAX_VALUE & iA0C;
            jArr[i] = jA0R2;
            jArr3[i] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC1600gE.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i] = jA0U2 - jArr3[i];
            c1576fq.A0g(4);
            jA0R2 += (long) iArr[i];
        }
        return Pair.create(Long.valueOf(jA0U), new WY(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static WL A09(C1576fq c1576fq, SparseArray<WL> sparseArray, boolean z) {
        WL wlValueAt;
        int iA0C;
        c1576fq.A0f(8);
        int iA02 = W5.A02(c1576fq.A0C());
        int iA0C2 = c1576fq.A0C();
        if (z) {
            String[] strArr = A0a;
            if (strArr[3].charAt(22) == strArr[6].charAt(22)) {
                A0a[7] = "TB8CV96Y75L8HKRMSXRARjNyJ9Kf";
                wlValueAt = sparseArray.valueAt(0);
            }
            throw new RuntimeException();
        }
        wlValueAt = sparseArray.get(iA0C2);
        WL wl = wlValueAt;
        if (wl == null) {
            return null;
        }
        if ((iA02 & 1) != 0) {
            long jA0R = c1576fq.A0R();
            wl.A08.A04 = jA0R;
            wl.A08.A03 = jA0R;
        }
        WC wc = wl.A04;
        int i = iA02 & 2;
        String[] strArr2 = A0a;
        if (strArr2[2].charAt(2) == strArr2[4].charAt(2)) {
            A0a[0] = "i06Ep7msBcrdOAQcyRUYXyS0dMgPPiSZ";
            int iA0C3 = i != 0 ? c1576fq.A0C() - 1 : wc.A02;
            int iA0C4 = (iA02 & 8) != 0 ? c1576fq.A0C() : wc.A00;
            int iA0C5 = (iA02 & 16) != 0 ? c1576fq.A0C() : wc.A03;
            int i2 = iA02 & 32;
            if (A0a[7].length() != 10) {
                String[] strArr3 = A0a;
                strArr3[3] = "mfhAdoOCuv0v6oZh0xDFuVPV5WqC5n6R";
                strArr3[6] = "Xw0mRh5ORXPmCNDuyQQrR2PKVQnsi2GN";
                if (i2 != 0) {
                    iA0C = c1576fq.A0C();
                } else {
                    iA0C = wc.A01;
                }
            } else if (i2 != 0) {
                iA0C = c1576fq.A0C();
            } else {
                iA0C = wc.A01;
            }
            wl.A08.A06 = new WC(iA0C3, iA0C4, iA0C5, iA0C);
            return wl;
        }
        throw new RuntimeException();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0Z = new byte[]{-105, -32, -22, -105, -37, -32, -35, -35, -36, -23, -36, -27, -21, -105, -35, -23, -26, -28, -105, -35, -23, -40, -34, -28, -36, -27, -21, -105, -22, -40, -28, -25, -29, -36, -105, -38, -26, -20, -27, -21, 123, -60, -50, 123, -62, -51, -64, -68, -49, -64, -51, 123, -49, -61, -68, -55, 123, -63, -51, -68, -62, -56, -64, -55, -49, 123, -50, -68, -56, -53, -57, -64, 123, -66, -54, -48, -55, -49, -100, -49, -54, -56, 123, -50, -60, -43, -64, 123, -57, -64, -50, -50, 123, -49, -61, -68, -55, 123, -61, -64, -68, -65, -64, -51, 123, -57, -64, -55, -62, -49, -61, 123, -125, -48, -55, -50, -48, -53, -53, -54, -51, -49, -64, -65, -124, -119, -101, -60, -54, -56, -49, 118, -71, -59, -53, -60, -54, 118, -65, -60, 118, -55, -72, -67, -58, 118, 119, -109, 118, -121, 118, 126, -53, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, 127, -124, -71, -30, -24, -26, -19, -108, -41, -29, -23, -30, -24, -108, -35, -30, -108, -25, -37, -28, -40, -108, -107, -79, -108, -91, -108, -100, -23, -30, -25, -23, -28, -28, -29, -26, -24, -39, -40, -99, -94, -106, -62, -79, -73, -67, -75, -66, -60, -75, -76, -99, -64, -124, -107, -56, -60, -62, -79, -77, -60, -65, -62, -71, -41, -34, -33, -30, -39, -34, -41, -112, -34, -43, -41, -47, -28, -39, -26, -43, -112, -33, -42, -42, -29, -43, -28, -112, -28, -33, -112, -29, -47, -35, -32, -36, -43, -112, -44, -47, -28, -47, -98, -82, -45, -37, -58, -47, -50, -55, -123, -77, -90, -79, -123, -47, -54, -45, -52, -39, -51, -83, -58, -62, -57, -127, -62, -43, -48, -50, -127, -59, -58, -57, -54, -49, -58, -44, -127, -58, -39, -43, -58, -49, -59, -58, -59, -127, -62, -43, -48, -50, -127, -44, -54, -37, -58, -127, -119, -42, -49, -44, -42, -47, -47, -48, -45, -43, -58, -59, -118, -113, -104, -79, -83, -78, 108, -83, -64, -69, -71, 108, -61, -75, -64, -76, 108, -72, -79, -70, -77, -64, -76, 108, -118, 108, 126, 125, -128, -125, -128, -124, 127, -126, -128, -125, 108, 116, -63, -70, -65, -63, -68, -68, -69, -66, -64, -79, -80, 117, 122, 107, -126, -126, -113, -127, -112, 60, -112, -117, 60, -127, -118, 127, -114, -107, -116, -112, -123, -117, -118, 60, -128, 125, -112, 125, 60, -109, 125, -113, 60, -118, -127, -125, 125, -112, -123, -110, -127, 74, -84, -61, -61, -48, -62, -47, 125, -47, -52, 125, -62, -53, -63, 125, -52, -61, 125, -54, -63, -66, -47, 125, -44, -66, -48, 125, -53, -62, -60, -66, -47, -58, -45, -62, -117, -119, -80, -97, -84, -84, -93, -98, -93, -88, -95, 90, -114, -84, -101, -99, -91, 127, -88, -99, -84, -77, -86, -82, -93, -87, -88, 124, -87, -78, 90, -86, -101, -84, -101, -89, -97, -82, -97, -84, -83, 90, -93, -83, 90, -81, -88, -83, -81, -86, -86, -87, -84, -82, -97, -98, 104, -108, -94, -86, -69, 97, -76, -94, -82, -79, -83, -90, 97, -92, -80, -74, -81, -75, 97, 125, -113, -104, -115, 74, -99, -117, -105, -102, -106, -113, 74, -115, -103, -97, -104, -98, 74, 114, -118, -120, -113, -113, -124, -125, 63, -113, -110, -110, -121, 63, -128, -109, -114, -116, 63, 71, -123, -128, -120, -117, -124, -125, 63, -109, -114, 63, -124, -105, -109, -111, -128, -126, -109, 63, -108, -108, -120, -125, 72, -118, -94, -96, -89, -89, -96, -91, -98, 87, -104, -85, -90, -92, 87, -82, -96, -85, -97, 87, -93, -100, -91, -98, -85, -97, 87, 117, 87, 105, 104, 107, 110, 107, 111, 106, 109, 107, 110, 87, 95, -84, -91, -86, -84, -89, -89, -90, -87, -85, -100, -101, 96, 101, -56, -32, -34, -27, -27, -34, -29, -36, -107, -22, -29, -24, -22, -27, -27, -28, -25, -23, -38, -39, -107, -38, -30, -24, -36, -107, -21, -38, -25, -24, -34, -28, -29, -81, -107, 113, -118, -127, -108, -116, -127, 127, -112, -127, -128, 60, -119, -117, -117, -110, 60, 126, -117, -108, 74, 120, -111, -120, -101, -109, -120, -122, -105, -120, -121, 67, -111, -120, -118, -124, -105, -116, -103, -120, 67, -103, -124, -113, -104, -120, 93, 67, -103, -78, -87, -68, -76, -87, -89, -72, -87, -88, 100, -73, -91, -83, -77, 100, -87, -78, -72, -74, -67, 100, -89, -77, -71, -78, -72, 126, 100, 105, -126, 124, 117, -126, 120, -128, 121, 120, 52, 125, -126, 120, 125, -122, 121, 119, -120, 52, -122, 121, 122, 121, -122, 121, -126, 119, 121, -95, -84, -67, -76, -84, -83, -73, -80, 107, -73, -80, -71, -78, -65, -77, 107, -81, -80, -66, -82, -67, -76, -69, -65, -76, -70, -71, 107, -76, -71, 107, -66, -78, -69, -81, 107, -79, -70, -64, -71, -81, 107, 115, -64, -71, -66, -64, -69, -69, -70, -67, -65, -80, -81, 116, -22, -7, -7, -11, -14, -20, -22, -3, -14, -8, -9, -72, 1, -74, -18, -10, -4, -16, 117, -124, -124, -128, 125, 119, 117, -120, 125, -125, -126, 67, -116, 65, -127, -124, 72, 65, -118, -120, -120, -119, -99, -116, -111, -105, 87, -119, -117, 92, -31, -44, -49, -48, -38, -102, -45, -48, -31, -50, 3, -10, -15, -14, -4, -68, -6, -3, -63};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(C1063Tm c1063Tm, SparseArray<WL> sparseArray, boolean z, int i, byte[] bArr) throws Q6 {
        WL wlA09 = A09(((C1062Tl) AbstractC1517es.A01(c1063Tm.A03(1952868452))).A00, sparseArray, z);
        if (wlA09 == null) {
            return;
        }
        C1123Wb c1123Wb = wlA09.A08;
        long j = c1123Wb.A05;
        boolean z2 = c1123Wb.A09;
        wlA09.A08();
        wlA09.A06 = true;
        C1062Tl c1062TlA03 = c1063Tm.A03(1952867444);
        if (c1062TlA03 == null || (i & 2) != 0) {
            c1123Wb.A05 = j;
            c1123Wb.A09 = z2;
        } else {
            c1123Wb.A05 = A03(c1062TlA03.A00);
            c1123Wb.A09 = true;
        }
        A0N(c1063Tm, wlA09, i);
        C1122Wa c1122WaA00 = wlA09.A05.A03.A00(((WC) AbstractC1517es.A01(c1123Wb.A06)).A02);
        C1062Tl c1062TlA04 = c1063Tm.A03(1935763834);
        if (c1062TlA04 != null) {
            A0Q((C1122Wa) AbstractC1517es.A01(c1122WaA00), c1062TlA04.A00, c1123Wb);
        }
        C1062Tl c1062TlA05 = c1063Tm.A03(1935763823);
        if (c1062TlA05 != null) {
            A0T(c1062TlA05.A00, c1123Wb);
        }
        C1062Tl c1062TlA06 = c1063Tm.A03(1936027235);
        if (c1062TlA06 != null) {
            A0U(c1062TlA06.A00, c1123Wb);
        }
        A0O(c1063Tm, c1122WaA00 != null ? c1122WaA00.A02 : null, c1123Wb);
        int size = c1063Tm.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<C1062Tl> list = c1063Tm.A02;
            if (A0a[0].charAt(8) == 'l') {
                throw new RuntimeException();
            }
            A0a[5] = "SbyztV3Exh6Wzn6h1MaI5w2UtlpY3BjV";
            C1062Tl c1062Tl = list.get(i2);
            if (((W5) c1062Tl).A00 == 1970628964) {
                A0V(c1062Tl.A00, c1123Wb, bArr);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r7 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        r4.A0g(1);
        r1 = r4.A0I();
        r9 = (r1 & com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4;
        r10 = r1 & 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (r4.A0I() != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        if (r5 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        if (r7 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        r7 = r4.A0I();
        r8 = new byte[16];
        r4.A0k(r8, 0, r8.length);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
    
        if (r7 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r1 = r4.A0I();
        r0 = new byte[r1];
        r4.A0k(r0, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
    
        r13.A08 = true;
        r13.A07 = new com.facebook.ads.redexgen.core.C1122Wa(r5, r12, r7, r8, r9, r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
    
        throw com.facebook.ads.redexgen.core.Q6.A00(A0A(165, 39, 98));
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0O(com.facebook.ads.redexgen.core.C1063Tm r11, java.lang.String r12, com.facebook.ads.redexgen.core.C1123Wb r13) throws com.facebook.ads.redexgen.core.Q6 {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0O(com.facebook.ads.redexgen.X.Tm, java.lang.String, com.facebook.ads.redexgen.X.Wb):void");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0177  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0S(C1576fq c1576fq, Uri uri) {
        String str;
        String str2;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c1576fq.A0f(8);
        int iA03 = W5.A03(c1576fq.A0C());
        long jA0U2 = C.TIME_UNSET;
        long jA05 = C.TIME_UNSET;
        switch (iA03) {
            case 0:
                Object objA01 = AbstractC1517es.A01(c1576fq.A0U());
                if (A0a[5].charAt(15) == 'w') {
                    throw new RuntimeException();
                }
                A0a[5] = "T4CyDSiAelISTpKlRCPlZXc99R7byyPW";
                str = (String) objA01;
                str2 = (String) AbstractC1517es.A01(c1576fq.A0U());
                long jA0Q2 = c1576fq.A0Q();
                jA0U2 = AbstractC1600gE.A0U(c1576fq.A0Q(), 1000000L, jA0Q2);
                if (this.A0C != C.TIME_UNSET) {
                    jA05 = this.A0C + jA0U2;
                }
                jA0U = AbstractC1600gE.A0U(c1576fq.A0Q(), 1000L, jA0Q2);
                jA0Q = c1576fq.A0Q();
                break;
                break;
            case 1:
                long jA0Q3 = c1576fq.A0Q();
                jA05 = AbstractC1600gE.A0U(c1576fq.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC1600gE.A0U(c1576fq.A0Q(), 1000L, jA0Q3);
                jA0Q = c1576fq.A0Q();
                String strA0U = c1576fq.A0U();
                if (A0a[0].charAt(8) == 'l') {
                    throw new RuntimeException();
                }
                A0a[7] = "wKjXbYWQ35Y";
                str = (String) AbstractC1517es.A01(strA0U);
                str2 = (String) AbstractC1517es.A01(c1576fq.A0U());
                break;
                break;
            default:
                AbstractC1561fb.A07(A0A(204, 22, 62), A0A(645, 35, 99) + iA03);
                return;
        }
        byte[] bArr = new byte[c1576fq.A07()];
        c1576fq.A0k(bArr, 0, c1576fq.A07());
        int i = 0;
        C1576fq c1576fq2 = new C1576fq(this.A0N.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c1576fq2.A07();
        InterfaceC1086Uo[] interfaceC1086UoArr = this.A0J;
        int length = interfaceC1086UoArr.length;
        int i2 = 0;
        while (i2 < length) {
            InterfaceC1086Uo interfaceC1086Uo = interfaceC1086UoArr[i2];
            c1576fq2.A0f(i);
            interfaceC1086Uo.AJk(uri);
            interfaceC1086Uo.AHx(c1576fq2, iA07);
            i2++;
            i = 0;
        }
        if (jA05 == C.TIME_UNSET) {
            this.A0W.addLast(new WK(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new WK(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        C1590g4 c1590g4 = this.A0U;
        String[] strArr = A0a;
        if (strArr[3].charAt(22) == strArr[6].charAt(22)) {
            A0a[5] = "urUkD7hlDKlWXf90UGOU0jjBYS9cImXi";
            if (c1590g4 != null) {
                jA05 = this.A0U.A05(jA05);
            }
        } else if (c1590g4 != null) {
            jA05 = this.A0U.A05(jA05);
        }
        if (this.A0A != C.TIME_UNSET && !MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A0y)) {
            jA05 = this.A0A;
        }
        for (InterfaceC1086Uo interfaceC1086Uo2 : this.A0J) {
            interfaceC1086Uo2.AI0(jA05, 1, iA07, 0, null);
        }
    }

    static {
        A0D();
        A0b = new UO() { // from class: com.facebook.ads.redexgen.X.Th
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return FragmentedMp4Extractor2.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new P5().A11(A0A(839, 18, EnumC4719u30.JSON_ENCODE_ERROR_VALUE)).A14();
    }

    public FragmentedMp4Extractor2() {
        this(0);
    }

    public FragmentedMp4Extractor2(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor2(int i, C1590g4 c1590g4) {
        this(i, c1590g4, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor2(int i, C1590g4 c1590g4, WZ wz, List<ZM> list) {
        this(i, c1590g4, wz, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public FragmentedMp4Extractor2(int i, C1590g4 c1590g4, WZ wz, List<ZM> list, InterfaceC1086Uo interfaceC1086Uo) {
        this.A0A = C.TIME_UNSET;
        this.A0K = i;
        this.A0U = c1590g4;
        this.A0O = wz;
        this.A0X = Collections.unmodifiableList(list);
        this.A0M = interfaceC1086Uo;
        this.A0N = new VB();
        this.A0P = new C1576fq(16);
        this.A0S = new C1576fq(AbstractC1078Ud.A03);
        this.A0R = new C1576fq(5);
        this.A0Q = new C1576fq();
        this.A0Y = new byte[16];
        this.A0T = new C1576fq(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A0C = C.TIME_UNSET;
        this.A0D = UL.A00;
        this.A0J = new InterfaceC1086Uo[0];
        this.A0I = new InterfaceC1086Uo[0];
    }

    public static int A00(int i) throws Q6 {
        if (i >= 0) {
            return i;
        }
        throw Q6.A01(A0A(TypedValues.TransitionType.TYPE_DURATION, 27, 17) + i, null);
    }

    public static long A02(C1576fq c1576fq) {
        c1576fq.A0f(8);
        int fullAtom = c1576fq.A0C();
        return W5.A03(fullAtom) == 0 ? c1576fq.A0Q() : c1576fq.A0R();
    }

    public static long A03(C1576fq c1576fq) {
        c1576fq.A0f(8);
        int fullAtom = c1576fq.A0C();
        int version = W5.A03(fullAtom);
        return version == 1 ? c1576fq.A0R() : c1576fq.A0Q();
    }

    public static Pair<Integer, WC> A04(C1576fq c1576fq) {
        c1576fq.A0f(12);
        int defaultSampleDescriptionIndex = c1576fq.A0C();
        int trackId = c1576fq.A0C();
        int defaultSampleFlags = c1576fq.A0C();
        int defaultSampleSize = c1576fq.A0C();
        int defaultSampleDuration = c1576fq.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new WC(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C1062Tl> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1062Tl c1062Tl = list.get(i);
            int leafChildrenSize = ((W5) c1062Tl).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c1062Tl.A00.A0l();
                UUID uuidA02 = WS.A02(bArrA0l);
                String[] strArr = A0a;
                String str = strArr[3];
                String str2 = strArr[6];
                int leafChildrenSize2 = str.charAt(22);
                if (leafChildrenSize2 != str2.charAt(22)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[2] = "qEvmW863TYpssOpdeQ1hxwRF5zEzT8xC";
                strArr2[4] = "NTvUlAqmjBOZf1DxBtaDThvIYTD7GZ2U";
                if (uuidA02 == null) {
                    AbstractC1561fb.A07(A0A(204, 22, 62), A0A(550, 42, 13));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 123), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private WC A07(SparseArray<WC> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            WC wcValueAt = sparseArray.valueAt(0);
            String[] strArr = A0a;
            if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0a;
            strArr2[3] = "rqQHM6H1nSOokoudFwB3RuPZ1ngN52G4";
            strArr2[6] = "kku7Gywm5eC4QL4LYZ2gmRPNr3XPud5Y";
            return wcValueAt;
        }
        return (WC) AbstractC1517es.A01(sparseArray.get(i));
    }

    public static WL A08(SparseArray<WL> sparseArray) {
        WL wl = null;
        long sampleOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            WL wlValueAt = sparseArray.valueAt(i);
            if ((wlValueAt.A06 || wlValueAt.A01 != wlValueAt.A05.A01) && (!wlValueAt.A06 || wlValueAt.A02 != wlValueAt.A08.A01)) {
                long nextSampleOffset = wlValueAt.A05();
                if (nextSampleOffset < sampleOffset) {
                    wl = wlValueAt;
                    sampleOffset = nextSampleOffset;
                }
            }
        }
        return wl;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new InterfaceC1086Uo[2];
        int i = 0;
        if (this.A0M != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0M;
            i = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i + 1;
            this.A0J[i] = this.A0D.AJX(100, 5);
            i = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (InterfaceC1086Uo[]) AbstractC1600gE.A1I(this.A0J, i);
        for (InterfaceC1086Uo interfaceC1086Uo : this.A0J) {
            interfaceC1086Uo.A6U(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new InterfaceC1086Uo[nextExtraTrackId3];
        int i2 = 0;
        while (i2 < nextExtraTrackId) {
            int i3 = nextExtraTrackId + 1;
            InterfaceC1086Uo interfaceC1086UoAJX = this.A0D.AJX(nextExtraTrackId, 3);
            interfaceC1086UoAJX.A6U(this.A0X.get(i2));
            this.A0I[i2] = interfaceC1086UoAJX;
            i2++;
            nextExtraTrackId = i3;
        }
    }

    private void A0E(long j) {
        while (!this.A0W.isEmpty()) {
            ArrayDeque<WK> arrayDeque = this.A0W;
            String[] strArr = A0a;
            if (strArr[2].charAt(2) != strArr[4].charAt(2)) {
                throw new RuntimeException();
            }
            A0a[1] = "v7UJ00ZUODvl1z5erlvjIWXW9XCC2BVp";
            WK wkRemoveFirst = arrayDeque.removeFirst();
            this.A03 -= wkRemoveFirst.A00;
            long jA05 = wkRemoveFirst.A01;
            if (wkRemoveFirst.A02) {
                jA05 += j;
            }
            if (this.A0U != null) {
                jA05 = this.A0U.A05(jA05);
            }
            for (InterfaceC1086Uo interfaceC1086Uo : this.A0J) {
                interfaceC1086Uo.AI0(jA05, 1, wkRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws Q6 {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j) {
            A0I(this.A0V.pop());
        }
        A0B();
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0G(WJ wj) throws IOException {
        int i = ((int) this.A07) - this.A00;
        C1576fq c1576fq = this.A0F;
        if (c1576fq != null) {
            wj.readFully(c1576fq.A0l(), 8, i);
            A0P(new C1062Tl(this.A01, c1576fq), wj.A8d(), wj.A9F());
        } else {
            wj.AJ9(i);
        }
        A0F(wj.A8d());
    }

    private void A0H(WJ wj) throws IOException {
        WL wlValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            WL nextTrackBundle = this.A0L.valueAt(i);
            C1123Wb c1123Wb = nextTrackBundle.A08;
            if (c1123Wb.A0A) {
                long j2 = c1123Wb.A03;
                String[] strArr = A0a;
                if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                    throw new RuntimeException();
                }
                A0a[7] = "sSeCeOMztPCHTRyGw6YoolpgXWm1";
                if (j2 < j) {
                    j = c1123Wb.A03;
                    wlValueAt = this.A0L.valueAt(i);
                }
            }
        }
        if (wlValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8d = (int) (j - wj.A8d());
        if (iA8d >= 0) {
            wj.AJ9(iA8d);
            wlValueAt.A08.A04(wj);
            return;
        }
        throw Q6.A01(A0A(384, 39, 10), null);
    }

    private void A0I(C1063Tm c1063Tm) throws Q6 {
        if (((W5) c1063Tm).A00 == 1836019574) {
            A0K(c1063Tm);
        } else if (((W5) c1063Tm).A00 == 1836019558) {
            A0J(c1063Tm);
        } else {
            if (this.A0V.isEmpty()) {
                return;
            }
            this.A0V.peek().A04(c1063Tm);
        }
    }

    private void A0J(C1063Tm c1063Tm) throws Q6 {
        A0L(c1063Tm, this.A0L, this.A0O != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c1063Tm.A02);
        if (drmInitDataA06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        if (this.A0B != C.TIME_UNSET) {
            int size = this.A0L.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0L.valueAt(i2).A0A(this.A0B);
            }
            this.A0B = C.TIME_UNSET;
        }
    }

    private void A0K(C1063Tm c1063Tm) throws Q6 {
        AbstractC1517es.A0A(this.A0O == null, A0A(680, 20, 10));
        DrmInitData drmInitDataA06 = A06(c1063Tm.A02);
        C1063Tm c1063Tm2 = (C1063Tm) AbstractC1517es.A01(c1063Tm.A02(1836475768));
        SparseArray<WC> sparseArray = new SparseArray<>();
        long jA02 = C.TIME_UNSET;
        int size = c1063Tm2.A02.size();
        for (int i = 0; i < size; i++) {
            C1062Tl c1062Tl = c1063Tm2.A02.get(i);
            if (((W5) c1062Tl).A00 == 1953654136) {
                Pair<Integer, WC> pairA04 = A04(c1062Tl.A00);
                sparseArray.put(((Integer) pairA04.first).intValue(), (WC) pairA04.second);
            } else if (((W5) c1062Tl).A00 == 1835362404) {
                jA02 = A02(c1062Tl.A00);
            }
        }
        List<C1124Wc> listA0O = WB.A0O(c1063Tm, new UV(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC1699hs() { // from class: com.facebook.ads.redexgen.X.Tg
            @Override // com.facebook.ads.redexgen.core.InterfaceC1699hs
            public final Object A41(Object obj) {
                return this.A00.A0c((WZ) obj);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                C1124Wc c1124Wc = listA0O.get(i2);
                WZ wz = c1124Wc.A03;
                this.A0L.put(wz.A00, new WL(this.A0D.AJX(i2, wz.A03), c1124Wc, A07(sparseArray, wz.A00)));
                this.A08 = Math.max(this.A08, wz.A04);
            }
            this.A0D.A6E();
            return;
        }
        AbstractC1517es.A08(this.A0L.size() == size2);
        for (int i3 = 0; i3 < size2; i3++) {
            C1124Wc c1124Wc2 = listA0O.get(i3);
            WZ wz2 = c1124Wc2.A03;
            this.A0L.get(wz2.A00).A0C(c1124Wc2, A07(sparseArray, wz2.A00));
        }
    }

    public static void A0L(C1063Tm c1063Tm, SparseArray<WL> sparseArray, boolean z, int i, byte[] bArr) throws Q6 {
        int size = c1063Tm.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            List<C1063Tm> list = c1063Tm.A01;
            int i3 = A0a[0].charAt(8);
            if (i3 == 108) {
                throw new RuntimeException();
            }
            A0a[1] = "SCrtLO5kQchETV6HN8r6qzYC2Kf61uip";
            C1063Tm child = list.get(i2);
            int i4 = ((W5) child).A00;
            if (i4 == 1953653094) {
                A0M(child, sparseArray, z, i, bArr);
            }
        }
    }

    public static void A0N(C1063Tm c1063Tm, WL wl, int i) throws Q6 {
        int trunSampleCount = 0;
        int i2 = 0;
        List<C1062Tl> list = c1063Tm.A02;
        int leafChildrenSize = list.size();
        int i3 = 0;
        while (true) {
            String[] strArr = A0a;
            String str = strArr[3];
            String str2 = strArr[6];
            int totalSampleCount = str.charAt(22);
            int trunCount = str2.charAt(22);
            if (totalSampleCount != trunCount) {
                break;
            }
            A0a[7] = "x4LcLHSu306Omyjc";
            if (i3 < leafChildrenSize) {
                C1062Tl c1062Tl = list.get(i3);
                int trunCount2 = ((W5) c1062Tl).A00;
                if (trunCount2 == 1953658222) {
                    C1576fq c1576fq = c1062Tl.A00;
                    c1576fq.A0f(12);
                    int trunCount3 = c1576fq.A0L();
                    if (trunCount3 > 0) {
                        i2 += trunCount3;
                        int totalSampleCount2 = A0a[1].charAt(6);
                        if (totalSampleCount2 == 106) {
                            break;
                        }
                        String[] strArr2 = A0a;
                        strArr2[2] = "ttv73UHw6JjUd5ghqFAuq52OOmAilHlj";
                        strArr2[4] = "UgvGKV2ts7dQ8WVJJRfD2DexW0iVww2u";
                        trunSampleCount++;
                    } else {
                        continue;
                    }
                }
                i3++;
            } else {
                wl.A02 = 0;
                wl.A00 = 0;
                wl.A01 = 0;
                wl.A08.A03(trunSampleCount, i2);
                int i4 = 0;
                int iA01 = 0;
                for (int i5 = 0; i5 < leafChildrenSize; i5++) {
                    C1062Tl c1062Tl2 = list.get(i5);
                    String[] strArr3 = A0a;
                    String str3 = strArr3[3];
                    String str4 = strArr3[6];
                    int totalSampleCount3 = str3.charAt(22);
                    int trunCount4 = str4.charAt(22);
                    if (totalSampleCount3 != trunCount4) {
                        break;
                    }
                    A0a[7] = "LketcJIvu95PfMTlJaWYyFW3xnxb";
                    C1062Tl c1062Tl3 = c1062Tl2;
                    int trunCount5 = ((W5) c1062Tl3).A00;
                    if (trunCount5 == 1953658222) {
                        int totalSampleCount4 = i4 + 1;
                        iA01 = A01(wl, i4, i, c1062Tl3.A00, iA01);
                        i4 = totalSampleCount4;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0P(C1062Tl c1062Tl, long j, Uri uri) throws Q6 {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A05(c1062Tl);
            return;
        }
        if (((W5) c1062Tl).A00 == 1936286840) {
            Pair<Long, WY> pairA05 = A05(c1062Tl.A00, j);
            long jLongValue = ((Long) pairA05.first).longValue();
            String[] strArr = A0a;
            if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            A0a[5] = "kPgFMScEwFvlSPQ83kJP4U1MrtzNnJpH";
            this.A0C = jLongValue;
            this.A0D.AID((Uj) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((W5) c1062Tl).A00 != 1701671783 || uri == null) {
            return;
        }
        A0S(c1062Tl.A00, uri);
    }

    public static void A0Q(C1122Wa c1122Wa, C1576fq c1576fq, C1123Wb c1123Wb) throws Q6 {
        int i = c1122Wa.A00;
        c1576fq.A0f(8);
        int vectorSize = c1576fq.A0C();
        if ((W5.A02(vectorSize) & 1) == 1) {
            c1576fq.A0g(8);
        }
        int defaultSampleInfoSize = c1576fq.A0I();
        int sampleCount = c1576fq.A0L();
        int vectorSize2 = c1123Wb.A00;
        if (sampleCount <= vectorSize2) {
            int i2 = 0;
            if (defaultSampleInfoSize != 0) {
                i2 = 0 + (defaultSampleInfoSize * sampleCount);
                Arrays.fill(c1123Wb.A0F, 0, sampleCount, defaultSampleInfoSize > i);
            } else {
                boolean[] zArr = c1123Wb.A0F;
                for (int totalSize = 0; totalSize < sampleCount; totalSize++) {
                    int vectorSize3 = c1576fq.A0I();
                    i2 += vectorSize3;
                    zArr[totalSize] = vectorSize3 > i;
                    if (A0a[7].length() == 10) {
                        throw new RuntimeException();
                    }
                    A0a[0] = "DVf2WE8rBkeTLiD3n7oPfeL6uKvADzGi";
                }
            }
            boolean[] zArr2 = c1123Wb.A0F;
            int vectorSize4 = c1123Wb.A00;
            Arrays.fill(zArr2, sampleCount, vectorSize4, false);
            if (i2 > 0) {
                c1123Wb.A02(i2);
                return;
            }
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A0A(GL20.GL_EQUAL, 18, 47)).append(sampleCount).append(A0A(40, 38, 73));
        int vectorSize5 = c1123Wb.A00;
        throw Q6.A01(sbAppend.append(vectorSize5).toString(), null);
    }

    public static void A0R(C1576fq c1576fq, int i, C1123Wb c1123Wb) throws Q6 {
        c1576fq.A0f(i + 8);
        int fullAtom = c1576fq.A0C();
        int flags = W5.A02(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c1576fq.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c1123Wb.A0F;
                int fullAtom4 = c1123Wb.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c1123Wb.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c1123Wb.A0F, 0, sampleCount, z);
                int fullAtom6 = c1576fq.A07();
                c1123Wb.A02(fullAtom6);
                c1123Wb.A05(c1576fq);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 24)).append(sampleCount).append(A0A(0, 40, 101));
            int fullAtom7 = c1123Wb.A00;
            throw Q6.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw Q6.A00(A0A(458, 56, 40));
    }

    public static void A0T(C1576fq c1576fq, C1123Wb c1123Wb) throws Q6 {
        c1576fq.A0f(8);
        int flags = c1576fq.A0C();
        int fullAtom = W5.A02(flags) & 1;
        if (fullAtom == 1) {
            c1576fq.A0g(8);
        }
        int iA0L = c1576fq.A0L();
        if (iA0L == 1) {
            int entryCount = W5.A03(flags);
            c1123Wb.A03 += entryCount == 0 ? c1576fq.A0Q() : c1576fq.A0R();
            String[] strArr = A0a;
            String str = strArr[3];
            String str2 = strArr[6];
            int fullAtom2 = str.charAt(22);
            int entryCount2 = str2.charAt(22);
            if (fullAtom2 != entryCount2) {
                throw new RuntimeException();
            }
            A0a[5] = "SWXRgqOgtWRkLw968YOAVCsfjXOIcM9q";
            return;
        }
        throw Q6.A01(A0A(727, 29, 50) + iA0L, null);
    }

    public static void A0U(C1576fq c1576fq, C1123Wb c1123Wb) throws Q6 {
        A0R(c1576fq, 0, c1123Wb);
    }

    public static void A0V(C1576fq c1576fq, C1123Wb c1123Wb, byte[] bArr) throws Q6 {
        c1576fq.A0f(8);
        c1576fq.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0R(c1576fq, 16, c1123Wb);
    }

    public static boolean A0W(int i) {
        if (i != 1836019574 && i != 1953653099 && i != 1835297121 && i != 1835626086 && i != 1937007212) {
            if (A0a[5].charAt(15) == 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[3] = "WPWfN65Zr81WP9ZqInKRP2PneU53sRQs";
            strArr[6] = "80NnBKXbkB9K88FgTUxXqfPgNIzOOBfB";
            if (i != 1836019558) {
                if (A0a[0].charAt(8) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0a;
                strArr2[2] = "0OvuBctf6r2iGfxjF23VmN7lXK4IfrRA";
                strArr2[4] = "A3v6tdRPZnkPb8cKozl1fcCJk7KVsS8O";
                if (i != 1953653094 && i != 1836475768 && i != 1701082227) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    public static boolean A0X(int i) {
        String[] strArr;
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556) {
            if (A0a[1].charAt(6) != 'j') {
                String[] strArr2 = A0a;
                strArr2[2] = "fhvnQ7Jsc6D1IkwkSvPHEzaaftHnARB6";
                strArr2[4] = "a2v9KhUZ4x1xl2yhu50yaNhgfs0lfQLH";
                if (i != 1937011827 && i != 1668576371) {
                    if (A0a[5].charAt(15) != 'w') {
                        A0a[1] = "LVFLQA6dqQM5btlOb9TBiOOw2w62DYBo";
                        if (i != 1937011555 && i != 1937011578 && i != 1937013298 && i != 1937007471 && i != 1668232756 && i != 1937011571 && i != 1952867444 && i != 1952868452 && i != 1953196132 && i != 1953654136 && i != 1953658222) {
                            if (A0a[5].charAt(15) != 'w') {
                                A0a[5] = "CL1TjjabDR0632GXQOXS4AunHblpfTus";
                                if (i != 1886614376) {
                                    if (i != 1935763834 && i != 1935763823 && i != 1936027235 && i != 1970628964 && i != 1935828848) {
                                        strArr = A0a;
                                        if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                                            A0a[5] = "cDfr4RaEYNbI8okuEudkE4O8yawNg2Rg";
                                            if (i != 1936158820) {
                                                if (i == 1701606260 && i != 1835362404 && i != 1701671783) {
                                                    return false;
                                                }
                                            }
                                        } else {
                                            String[] strArr3 = A0a;
                                            strArr3[2] = "VSvrp5bUKlHJG5h7Y4pJ0ieIRtzAwYlK";
                                            strArr3[4] = "x3vrfs2amKE9vjuS4yL6sNfyNgyn6rqN";
                                            if (i != 1936158820) {
                                                if (i == 1701606260) {
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i != 1886614376) {
                                if (i != 1935763834) {
                                    strArr = A0a;
                                    if (strArr[3].charAt(22) != strArr[6].charAt(22)) {
                                        A0a[5] = "cDfr4RaEYNbI8okuEudkE4O8yawNg2Rg";
                                        if (i != 1936158820) {
                                            if (i == 1701606260) {
                                            }
                                        }
                                    } else {
                                        String[] strArr4 = A0a;
                                        strArr4[2] = "VSvrp5bUKlHJG5h7Y4pJ0ieIRtzAwYlK";
                                        strArr4[4] = "x3vrfs2amKE9vjuS4yL6sNfyNgyn6rqN";
                                        if (i != 1936158820) {
                                            if (i == 1701606260) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a1, code lost:
    
        if (r0 <= 2147483647L) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a3, code lost:
    
        r2 = new com.facebook.ads.redexgen.core.C1576fq((int) r11.A07);
        r0 = r11.A0P;
        java.lang.System.arraycopy(r0.A0l(), 0, r2.A0l(), 0, 8);
        r11.A0F = r2;
        r11.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c9, code lost:
    
        if (r0 <= 2147483647L) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e5, code lost:
    
        throw com.facebook.ads.redexgen.core.Q6.A00(A0A(335, 49, 58));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y(com.facebook.ads.redexgen.core.WJ r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.A0Y(com.facebook.ads.redexgen.X.WJ):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0248  */
    /* JADX WARN: Code duplicated, block: B:83:0x0283  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @MetaExoPlayerCustomization("Mark text samples as sync frames")
    private boolean A0Z(WJ wj) throws IOException {
        int iA0C;
        boolean z;
        int iAHv;
        WL wlA08 = this.A0E;
        Throwable th = null;
        if (wlA08 == null) {
            wlA08 = A08(this.A0L);
            if (wlA08 == null) {
                int iA8d = (int) (this.A09 - wj.A8d());
                if (iA8d < 0) {
                    throw Q6.A01(A0A(423, 35, 75), null);
                }
                wj.AJ9(iA8d);
                A0B();
                return false;
            }
            int iA05 = (int) (wlA08.A05() - wj.A8d());
            if (iA05 < 0) {
                AbstractC1561fb.A07(A0A(204, 22, 62), A0A(226, 40, 94));
                iA05 = 0;
            }
            wj.AJ9(iA05);
            this.A0E = wlA08;
        }
        int i = 4;
        int i2 = 1;
        if (this.A02 == 3) {
            this.A06 = wlA08.A03();
            if (wlA08.A01 < wlA08.A03) {
                wj.AJ9(this.A06);
                if (A0a[0].charAt(8) == 'l') {
                    throw new RuntimeException();
                }
                A0a[5] = "7aJNTPpIyzCULT8qpzWtwzfgrqIENu9r";
                wlA08.A09();
                if (!wlA08.A0D()) {
                    this.A0E = null;
                }
                this.A02 = 3;
                return true;
            }
            if (wlA08.A05.A03.A02 == 1) {
                this.A06 -= 8;
                wj.AJ9(8);
            }
            if (A0A(878, 9, 22).equals(wlA08.A05.A03.A07.A0W)) {
                this.A04 = wlA08.A04(this.A06, 7);
                U5.A07(this.A06, this.A0T);
                wlA08.A07.AHx(this.A0T, 7);
                this.A04 += 7;
            } else {
                this.A04 = wlA08.A04(this.A06, 0);
            }
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        WZ wz = wlA08.A05.A03;
        InterfaceC1086Uo interfaceC1086Uo = wlA08.A07;
        long jA06 = wlA08.A06();
        if (this.A0U != null) {
            jA06 = this.A0U.A05(jA06);
        }
        if (wz.A01 == 0) {
            while (this.A04 < this.A06) {
                this.A04 += interfaceC1086Uo.AHv(wj, this.A06 - this.A04, false);
            }
        } else {
            byte[] bArrA0l = this.A0R.A0l();
            bArrA0l[0] = 0;
            bArrA0l[1] = 0;
            bArrA0l[2] = 0;
            int i3 = wz.A01 + 1;
            int i4 = 4 - wz.A01;
            while (this.A04 < this.A06) {
                if (this.A05 == 0) {
                    wj.readFully(bArrA0l, i4, i3);
                    this.A0R.A0f(0);
                    C1576fq c1576fq = this.A0R;
                    if (A0a[5].charAt(15) != 'w') {
                        String[] strArr = A0a;
                        strArr[3] = "aagYC5PZT6Kz7xmIdLmtyyPE1AYRLQ8X";
                        strArr[6] = "BH5bw7bvngyp4R56FiilRWP5haNeCheM";
                        iA0C = c1576fq.A0C();
                        if (iA0C < i2) {
                            throw Q6.A01(A0A(266, 18, 83), th);
                        }
                        this.A05 = iA0C - 1;
                        this.A0S.A0f(0);
                        interfaceC1086Uo.AHx(this.A0S, i);
                        interfaceC1086Uo.AHx(this.A0R, i2);
                        if (this.A0I.length > 0 || !AbstractC1078Ud.A0I(wz.A07.A0W, bArrA0l[i])) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.A0H = z;
                        this.A04 += 5;
                        this.A06 += i4;
                        i2 = 1;
                    } else {
                        iA0C = c1576fq.A0C();
                        if (iA0C < i2) {
                            throw Q6.A01(A0A(266, 18, 83), th);
                        }
                        this.A05 = iA0C - 1;
                        this.A0S.A0f(0);
                        interfaceC1086Uo.AHx(this.A0S, i);
                        interfaceC1086Uo.AHx(this.A0R, i2);
                        if (this.A0I.length > 0) {
                            z = false;
                        } else {
                            z = false;
                        }
                        this.A0H = z;
                        this.A04 += 5;
                        this.A06 += i4;
                        i2 = 1;
                    }
                } else {
                    if (this.A0H) {
                        this.A0Q.A0d(this.A05);
                        wj.readFully(this.A0Q.A0l(), 0, this.A05);
                        interfaceC1086Uo.AHx(this.A0Q, this.A05);
                        iAHv = this.A05;
                        int iA02 = AbstractC1078Ud.A02(this.A0Q.A0l(), this.A0Q.A0A());
                        this.A0Q.A0f(A0A(887, 10, 89).equals(wz.A07.A0W) ? 1 : 0);
                        this.A0Q.A0e(iA02);
                        UE.A03(jA06, this.A0Q, this.A0I);
                    } else {
                        iAHv = interfaceC1086Uo.AHv(wj, this.A05, false);
                    }
                    this.A04 += iAHv;
                    this.A05 -= iAHv;
                    th = null;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iA03 = wlA08.A02();
        C1085Um c1085Um = null;
        C1122Wa c1122WaA07 = wlA08.A07();
        String[] strArr2 = A0a;
        if (strArr2[2].charAt(2) != strArr2[4].charAt(2)) {
            if (c1122WaA07 != null) {
                c1085Um = c1122WaA07.A01;
            }
        } else {
            String[] strArr3 = A0a;
            strArr3[3] = "7Al4LkfUNyJ2hMMiD1PTNXPsKO9k84Rw";
            strArr3[6] = "B68dHIYsXjiFeP72M4L9AdPRRaJZcVr7";
            if (c1122WaA07 != null) {
                c1085Um = c1122WaA07.A01;
            }
        }
        if (!MetaExoPlayerUpgradeConfig.A03(EnumC0893Mn.A1E) && this.A0E != null) {
            ZM zm = this.A0E.A05.A03.A07;
            String[] strArr4 = A0a;
            if (strArr4[3].charAt(22) != strArr4[6].charAt(22)) {
                if (A0A(857, 21, 2).equals(zm.A0W)) {
                    iA03 |= 1;
                }
            } else {
                A0a[1] = "r9sW4LmjAZQ5quXSvtPI02WdCCCr3uIr";
                if (A0A(857, 21, 2).equals(zm.A0W)) {
                    iA03 |= 1;
                }
            }
        }
        long j = jA06;
        interfaceC1086Uo.AI0(jA06, iA03, this.A06, 0, c1085Um);
        this.A0A = j;
        A0E(j);
        if (!wlA08.A0D()) {
            this.A0E = null;
        }
        this.A02 = 3;
        return true;
    }

    public static boolean A0a(WZ wz) {
        if (wz.A08 == null || wz.A08.length != 1 || wz.A09 == null) {
            return false;
        }
        if (wz.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC1600gE.A0U(wz.A08[0] + wz.A09[0], 1000000L, wz.A05);
        return editListEndMediaTimeUs >= wz.A04;
    }

    public static /* synthetic */ UK[] A0b() {
        return new UK[]{new C1056Te()};
    }

    public final WZ A0c(WZ wz) {
        return wz;
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A0D = ul;
        A0B();
        A0C();
        if (this.A0O != null) {
            this.A0L.put(0, new WL(ul.AJX(0, this.A0O.A03), new C1124Wc(this.A0O, new long[0], new int[0], 0, new long[0], new int[0], 0L), new WC(0, 0, 0, 0)));
            this.A0D.A6E();
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(wj)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    A0G(wj);
                    break;
                case 2:
                    A0H(wj);
                    break;
                default:
                    if (A0Z(wj)) {
                        if (A0a[7].length() != 10) {
                            String[] strArr = A0a;
                            strArr[3] = "dFm9hkZXFotyWCB4D0UT2sPnBD7xdKq6";
                            strArr[6] = "3q6oN7s18Q2TDIHhSEZOjjPTNBIO0D18";
                            return 0;
                        }
                        throw new RuntimeException();
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            SparseArray<WL> sparseArray = this.A0L;
            int i2 = A0a[0].charAt(8);
            if (i2 == 108) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[2] = "jqv3jOUumqRgYYZiBGeDaSxGuLBnNUBj";
            strArr[4] = "ggvuVsNu7gZuN1Cql3DxBigPSwziOkYN";
            sparseArray.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return WX.A01(wj);
    }
}
