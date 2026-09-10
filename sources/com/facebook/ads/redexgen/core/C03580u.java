package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03580u extends AbstractC04895z {
    public static byte[] A0H;
    public static String[] A0I = {"NvI8w9M6tlyvGt07ROp5gcDFRuKjs8sbr", "o6o1GZjn6w5iD3TuD7IypBj6qZhE8LE6", "03eW3cAl0TOGEZ", "1BnEJcPqgm2BbABF4O4jACcV83pPEeQV", "FKmOFb8XU4uKcVg885KEf0akfF0rU573", "m3moL65Zf5ywac", "r8huNeiZhEpXsxRNP4WAvwel03jPBrv7", "gLbeJV9t5Lmu237q9Xp5Qy3JaC8KcwEH"};
    public AnonymousClass64 A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final OI<C1390co> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final InterfaceC1430dS A0F;
    public final InterfaceC1524ez A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C03580u(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C1175Yc c1175Yc, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i, InterfaceC1430dS interfaceC1430dS, int i2, long j, long j2, long j3, int i3, int i4, float f, float f2, long j4, List<C1390co> list, InterfaceC1524ez interfaceC1524ez) {
        super(c1175Yc, iArr, i);
        if (j3 < j) {
            AbstractC1561fb.A07(A03(0, 22, 97), A03(22, 90, 73));
            j3 = j;
        }
        this.A0F = interfaceC1430dS;
        this.A0D = i2;
        this.A08 = j * 1000;
        this.A0E = j2 * 1000;
        this.A09 = 1000 * j3;
        this.A07 = i3;
        this.A06 = i4;
        this.A0C = f;
        this.A05 = f2;
        this.A0B = OI.A05(list);
        this.A0A = j4;
        this.A0G = interfaceC1524ez;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = C.TIME_UNSET;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{94, 123, 126, 111, 107, 118, 105, 122, 75, 109, 126, 124, 116, 76, 122, 115, 122, 124, 107, 118, 112, 113, 118, 83, 93, 66, 68, 67, 94, 89, 80, 23, 90, 94, 89, 115, 66, 69, 86, 67, 94, 88, 89, 99, 88, 101, 82, 67, 86, 94, 89, 118, 81, 67, 82, 69, 115, 94, 68, 84, 86, 69, 83, 122, 68, 23, 67, 88, 23, 85, 82, 23, 86, 67, 23, 91, 82, 86, 68, 67, 23, 90, 94, 89, 115, 66, 69, 86, 67, 94, 88, 89, 113, 88, 69, 102, 66, 86, 91, 94, 67, 78, 126, 89, 84, 69, 82, 86, 68, 82, 122, 68};
    }

    static {
        A04();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<java.lang.Integer> */
    public static OI<OI<C1390co>> A00(C1407d5[] c1407d5Arr) {
        long[] jArr;
        long j;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c1407d5Arr.length; i++) {
            if (c1407d5Arr[i] != null && c1407d5Arr[i].A02.length > 1) {
                C4T c4tA01 = OI.A01();
                c4tA01.A04(new C1390co(0L, 0L));
                arrayList.add(c4tA01);
            } else {
                String[] strArr = A0I;
                String str = strArr[4];
                String str2 = strArr[0];
                int i2 = str.length();
                if (i2 == str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[7] = "ce42VH0D8duoKJMddClaxByqTxvbVMOK";
                strArr2[1] = "EmPBnHrg2FlY645Urm6fq7duDUgXBlfe";
                arrayList.add(null);
            }
        }
        long[][] jArrA06 = A06(c1407d5Arr);
        int[] iArr = new int[jArrA06.length];
        long[] currentTrackBitrates = new long[jArrA06.length];
        int i3 = 0;
        while (true) {
            int length = jArrA06.length;
            if (A0I[6].charAt(9) != 'E') {
                if (i3 >= length) {
                    break;
                }
                jArr = jArrA06[i3];
                if (A0I[3].charAt(29) != 'e') {
                    String[] strArr3 = A0I;
                    strArr3[4] = "dxIzmLQZMjjXwM2bZBotSdUY0wSomTch";
                    strArr3[0] = "idrUnVxC6hvmNXQaeWEEUz8mi3W9LtxzX";
                    if (jArr.length == 0) {
                        j = 0;
                    } else {
                        j = jArrA06[i3][0];
                    }
                } else if (jArr.length == 0) {
                    j = 0;
                } else {
                    j = jArrA06[i3][0];
                }
                currentTrackBitrates[i3] = j;
                i3++;
            } else {
                String[] strArr4 = A0I;
                strArr4[4] = "Con0koSd2t3FiezJJzYIFQHn9IS5jbcS";
                strArr4[0] = "jv5bDTpFEwpoINleL8TfOpNYA2eTmhkko";
                if (i3 >= length) {
                    break;
                }
                jArr = jArrA06[i3];
                if (A0I[3].charAt(29) != 'e') {
                    String[] strArr5 = A0I;
                    strArr5[4] = "dxIzmLQZMjjXwM2bZBotSdUY0wSomTch";
                    strArr5[0] = "idrUnVxC6hvmNXQaeWEEUz8mi3W9LtxzX";
                    if (jArr.length == 0) {
                        j = 0;
                    } else {
                        j = jArrA06[i3][0];
                    }
                } else if (jArr.length == 0) {
                    j = 0;
                } else {
                    j = jArrA06[i3][0];
                }
                currentTrackBitrates[i3] = j;
                i3++;
            }
        }
        A05(arrayList, currentTrackBitrates);
        OI<Integer> oiA02 = A02(jArrA06);
        for (int i4 = 0; i4 < oiA02.size(); i4++) {
            int iIntValue = oiA02.get(i4).intValue();
            int i5 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i5;
            currentTrackBitrates[iIntValue] = jArrA06[iIntValue][i5];
            A05(arrayList, currentTrackBitrates);
        }
        for (int i6 = 0; i6 < c1407d5Arr.length; i6++) {
            if (arrayList.get(i6) != null) {
                currentTrackBitrates[i6] = currentTrackBitrates[i6] * 2;
            }
        }
        A05(arrayList, currentTrackBitrates);
        C4T c4tA02 = OI.A01();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C4T c4t = (C4T) arrayList.get(i7);
            c4tA02.A04(c4t == null ? OI.A03() : c4t.A05());
        }
        return c4tA02.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nH != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static OI<Integer> A02(long[][] jArr) {
        InterfaceC2024nH interfaceC2024nHA00 = AbstractC2026nJ.A02().A03().A00();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                double[] logBitrates = new double[jArr[i].length];
                int i2 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i2 >= jArr[i].length) {
                        break;
                    }
                    if (jArr[i][i2] != -1) {
                        dLog = Math.log(jArr[i][i2]);
                    }
                    logBitrates[i2] = dLog;
                    i2++;
                }
                double d = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i3 = 0;
                for (int i4 = 1; i3 < logBitrates.length - i4; i4 = 1) {
                    interfaceC2024nHA00.AGM(Double.valueOf(d == 0.0d ? 1.0d : (((logBitrates[i3] + logBitrates[i3 + 1]) * 0.5d) - logBitrates[0]) / d), Integer.valueOf(i));
                    i3++;
                }
            }
        }
        Collection collectionValues = interfaceC2024nHA00.values();
        if (A0I[6].charAt(9) != 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[7] = "fccdpFL18VU70aMgRkcSNTW0PyqGAz3V";
        strArr[1] = "acyPQfwETLj0MHixODwctPUCudb6Lo1G";
        return OI.A05(collectionValues);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4T != com.google.common.collect.ImmutableList$Builder<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C4T<C1390co>> list, long[] jArr) {
        long j = 0;
        for (long totalBitrate : jArr) {
            j += totalBitrate;
        }
        int i = 0;
        while (true) {
            int size = list.size();
            String[] strArr = A0I;
            if (strArr[7].charAt(10) == strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A0I[3] = "bQnYpudw8mff8zjN61SfJHhNQb2nbe8x";
            if (i < size) {
                C4T<C1390co> c4t = list.get(i);
                if (c4t != null) {
                    c4t.A04(new C1390co(j, jArr[i]));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[PHI: r9
  0x0071: PHI (r9v2 long[]) = (r9v0 long[]), (r9v3 long[]) binds: [B:24:0x0095, B:20:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    public static long[][] A06(C1407d5[] c1407d5Arr) {
        long j;
        long[] jArr;
        long[][] jArr2 = new long[c1407d5Arr.length][];
        for (int i = 0; i < c1407d5Arr.length; i++) {
            C1407d5 c1407d5 = c1407d5Arr[i];
            int i2 = A0I[3].charAt(29);
            if (i2 == 101) {
                String[] strArr = A0I;
                strArr[4] = "aSvaoGQLGgOa9buJlpv9o2k7cZpDmtG8";
                strArr[0] = "t9s5xDQEFZXiIwVGN4zCrxq7Hjw4B6GmB";
                if (c1407d5 == null) {
                    int i3 = A0I[6].charAt(9);
                    if (i3 == 69) {
                        String[] strArr2 = A0I;
                        strArr2[7] = "5RSJOnMVbtsbO4kxzXJNTV8CxqlDEspb";
                        strArr2[1] = "LGic1BtlSbbsvncSfV1yEytiCGz3Td7Q";
                        jArr2[i] = new long[0];
                    }
                } else {
                    jArr2[i] = new long[c1407d5.A02.length];
                    for (int i4 = 0; i4 < c1407d5.A02.length; i4++) {
                        C1175Yc c1175Yc = c1407d5.A01;
                        String[] strArr3 = A0I;
                        String str = strArr3[2];
                        String str2 = strArr3[5];
                        int i5 = str.length();
                        if (i5 != str2.length()) {
                            j = c1175Yc.A08(c1407d5.A02[i4]).A05;
                            jArr = jArr2[i];
                            if (j == -1) {
                                j = 0;
                            }
                        } else {
                            String[] strArr4 = A0I;
                            strArr4[2] = "XRfby8rpBMRzlH";
                            strArr4[5] = "c4CCeZBcxZ1Xb3";
                            j = c1175Yc.A08(c1407d5.A02[i4]).A05;
                            jArr = jArr2[i];
                            if (j == -1) {
                                j = 0;
                            }
                        }
                        jArr[i4] = j;
                    }
                    Arrays.sort(jArr2[i]);
                }
            }
            throw new RuntimeException();
        }
        return jArr2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04895z, com.facebook.ads.redexgen.core.QD
    public final void A5n() {
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04895z, com.facebook.ads.redexgen.core.QD
    public final void A6A() {
        this.A04 = C.TIME_UNSET;
        this.A00 = null;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final int A8t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04895z, com.facebook.ads.redexgen.core.QD
    public final void AEW(float f) {
        this.A01 = f;
    }
}
