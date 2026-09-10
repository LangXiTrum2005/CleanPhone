package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2572lP implements LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C2860qI> A01;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C2860qI> A03(LD ld) {
        String strA02;
        int i2;
        if (A05(32)) {
            return this.A01;
        }
        C11074v c11074v = new C11074v(ld.A03);
        List<C2860qI> arrayList = this.A01;
        while (c11074v.A07() > 0) {
            int iA0I = c11074v.A0I();
            int iA09 = c11074v.A09() + c11074v.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c11074v.A0I() & 31;
                for (int i3 = 0; i3 < iA0I2; i3++) {
                    String strA0W = c11074v.A0W(3);
                    int iA0I3 = c11074v.A0I();
                    boolean z2 = (iA0I3 & 128) != 0;
                    if (z2) {
                        strA02 = A02(19, 19, 47);
                        i2 = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i2 = 1;
                    }
                    byte bA0I = (byte) c11074v.A0I();
                    c11074v.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z2) {
                        boolean z3 = (bA0I & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = AnonymousClass46.A04(z3);
                    }
                    arrayList.add(new C10512p().A11(strA02).A10(strA0W).A0Z(i2).A12(listA04).A14());
                }
            }
            c11074v.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, 12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 33, 25, 15, -39, 15, 33, 13, -39, 12, 20, 31, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C2572lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C2572lP(int i2) {
        this(i2, MetaExoPlayerCustomizedCollections.A03(new C2860qI[0]));
    }

    public C2572lP(int i2, List<C2860qI> list) {
        this.A00 = i2;
        this.A01 = list;
    }

    private L9 A00(LD ld) {
        return new L9(A03(ld));
    }

    private LJ A01(LD ld) {
        return new LJ(A03(ld));
    }

    private boolean A05(int i2) {
        return (this.A00 & i2) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.LE
    public final SparseArray<LH> A5Q() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.LE
    public final LH A5V(int i2, LD ld) {
        switch (i2) {
            case 2:
            case 128:
                return new C2561lE(new C2569lM(A01(ld)));
            case 3:
            case 4:
                return new C2561lE(new C2563lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C2561lE(new C2573lQ(false, ld.A01));
            case 16:
                return new C2561lE(new C2568lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C2561lE(new C2564lH(ld.A01));
            case 21:
                return new C2561lE(new C2565lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C2561lE(new C2567lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new C2561lE(new C2566lJ(A00(ld)));
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new C2561lE(new C2570lN(ld.A02));
            case 129:
            case 135:
                return new C2561lE(new C2579lW(ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C2556l9(new C2562lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C2561lE(new C2576lT(ld.A01));
            case 257:
                return new C2556l9(new C2562lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C2561lE(new C2571lO(ld.A01));
    }
}
