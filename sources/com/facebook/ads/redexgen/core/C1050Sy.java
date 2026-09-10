package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1050Sy implements YQ {
    public static byte[] A02;
    public static String[] A03 = {"Lj4gzg03gSASgBOShz1Dc2teR2QzxoDz", "lNMp9Ll7IH0A6UIQ00LiYQlXyx", "zJlRbHqmjFAN0AXrtmPyudqKltBxvxLd", "8Uxs8Vyb8zEOA3b6SzieAq2Yt0YzCRzC", "yE2i2W7Nn3AH4nLocODfhKffgOss6qwA", "R6NQaICtPKEyciL4Nk3y9YULQFwVIf4Z", "qQnIpbnCZo9CNb7F6nWSARAgBLnssXXF", "iGvV0i7PxL9M8NBKd88FkQPDBt"};
    public final int A00;
    public final List<ZM> A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<ZM> A03(YP yp) {
        String strA02;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C1576fq c1576fq = new C1576fq(yp.A03);
        List<ZM> arrayList = this.A01;
        while (c1576fq.A07() > 0) {
            int iA0I = c1576fq.A0I();
            int iA09 = c1576fq.A09() + c1576fq.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c1576fq.A0I() & 31;
                for (int i2 = 0; i2 < iA0I2; i2++) {
                    String strA0W = c1576fq.A0W(3);
                    int iA0I3 = c1576fq.A0I();
                    boolean z = (iA0I3 & 128) != 0;
                    if (z) {
                        strA02 = A02(19, 19, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
                        i = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 34);
                        i = 1;
                    }
                    int iA0I4 = c1576fq.A0I();
                    if (A03[5].charAt(3) != 'Q') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[0] = "7FyVeYA9WrZzHuuwioA3vWBoL8B8RyOM";
                    strArr[6] = "TQkUUF63gNXax52QVNqDenapGylQDbx3";
                    byte b = (byte) iA0I4;
                    c1576fq.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z) {
                        listA04 = AbstractC1525f0.A04((b & 64) != 0);
                    }
                    arrayList.add(new P5().A11(strA02).A10(strA0W).A0Z(i).A12(listA04).A14());
                }
            }
            c1576fq.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 43, 45, 41, 101, 126, 120, 112, 126, 111, 111, 115, 118, 124, 126, 107, 118, 112, 113, 48, 124, 122, 126, 50, 40, 47, 39, 68, 85, 85, 73, 76, 70, 68, 81, 76, 74, 75, 10, 83, 75, 65, 11, 65, 83, 71, 11, 68, 76, 81, 38, 55, 55, 43, 46, 36, 38, 51, 46, 40, 41, 104, 63, 106, 52, 36, 51, 34, 116, 114};
    }

    static {
        A04();
    }

    public C1050Sy() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C1050Sy(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new ZM[0]));
    }

    public C1050Sy(int i, List<ZM> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private YL A00(YP yp) {
        return new YL(A03(yp));
    }

    private YV A01(YP yp) {
        return new YV(A03(yp));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.YQ
    public final SparseArray<YT> A5G() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.YQ
    public final YT A5L(int i, YP yp) {
        switch (i) {
            case 2:
            case 128:
                return new C1028Sc(new C1047Sv(A01(yp)));
            case 3:
            case 4:
                return new C1028Sc(new C1033Sh(yp.A01));
            case 15:
                boolean zA05 = A05(2);
                if (A03[5].charAt(3) != 'Q') {
                    throw new RuntimeException();
                }
                A03[5] = "OJDQ74LnXL8aZxJvrpziuHGD5Nuoyi98";
                if (zA05) {
                    return null;
                }
                return new C1028Sc(new C1051Sz(false, yp.A01));
            case 16:
                return new C1028Sc(new C1046Su(A01(yp)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C1028Sc(new C1039Sn(yp.A01));
            case 21:
                return new C1028Sc(new C1043Sr());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C1028Sc(new C1045St(A00(yp), A05(1), A05(8)));
            case 36:
                return new C1028Sc(new C1044Ss(A00(yp)));
            case 89:
                return new C1028Sc(new C1048Sw(yp.A02));
            case 129:
            case 135:
                return new C1028Sc(new T5(yp.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new SU(new C1030Se(A02(61, 20, 45)));
            case 138:
                break;
            case 172:
                return new C1028Sc(new T2(yp.A01));
            case 257:
                return new SU(new C1030Se(A02(38, 23, 79)));
            default:
                return null;
        }
        return new C1028Sc(new C1049Sx(yp.A01));
    }
}
