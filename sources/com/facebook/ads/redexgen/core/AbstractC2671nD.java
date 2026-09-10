package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2671nD extends AbstractC1349Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C1341Eo A00;

    public abstract Pair<C11827s[], InterfaceC2672nE[]> A0d(C1341Eo c1341Eo, int[][][] iArr, int[] iArr2, C2708no c2708no, Timeline timeline) throws AD;

    public static int A0Y(InterfaceC11797p[] interfaceC11797pArr, C2823pg c2823pg, int[] iArr, boolean z2) throws AD {
        int length = interfaceC11797pArr.length;
        int formatSupportLevel = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < bestRendererIndex; i3++) {
            InterfaceC11797p interfaceC11797p = interfaceC11797pArr[i3];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC11797p.AKM(c2823pg.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC11727i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i3];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z2 && i2 == 0 && bestRendererIndex3 != 0)) {
                length = i3;
                formatSupportLevel = iMax;
                i2 = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC11797p interfaceC11797p, C2823pg c2823pg) throws AD {
        int[] iArr = new int[c2823pg.A01];
        for (int i2 = 0; i2 < c2823pg.A01; i2++) {
            iArr[i2] = interfaceC11797p.AKM(c2823pg.A08(i2));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC11797p[] interfaceC11797pArr) throws AD {
        int[] iArr = new int[interfaceC11797pArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iAKO = interfaceC11797pArr[i2].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i3 = str.charAt(23);
            if (i3 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i2] = iAKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349Ew
    public final C1350Ex A0b(InterfaceC11797p[] interfaceC11797pArr, C2690nW c2690nW, C2708no c2708no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC11797pArr.length + 1];
        C2823pg[][] c2823pgArr = new C2823pg[interfaceC11797pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC11797pArr.length + 1][][];
        for (int i2 = 0; i2 < c2823pgArr.length; i2++) {
            c2823pgArr[i2] = new C2823pg[c2690nW.A01];
            iArr2[i2] = new int[c2690nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC11797pArr);
        for (int i3 = 0; i3 < c2690nW.A01; i3++) {
            C2823pg c2823pgA05 = c2690nW.A05(i3);
            int groupIndex = A0Y(interfaceC11797pArr, c2823pgA05, iArr, c2823pgA05.A02 == 5);
            if (groupIndex == interfaceC11797pArr.length) {
                rendererTrackGroupCounts = new int[c2823pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC11797pArr[groupIndex], c2823pgA05);
            }
            int i4 = iArr[groupIndex];
            c2823pgArr[groupIndex][i4] = c2823pgA05;
            iArr2[groupIndex][i4] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2690nW[] c2690nWArr = new C2690nW[interfaceC11797pArr.length];
        String[] strArr = new String[interfaceC11797pArr.length];
        int[] iArr3 = new int[interfaceC11797pArr.length];
        int i5 = 0;
        while (true) {
            int length = interfaceC11797pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i5 < length) {
                int i6 = iArr[i5];
                c2690nWArr[i5] = new C2690nW((C2823pg[]) C5C.A1I(c2823pgArr[i5], i6));
                iArr2[i5] = (int[][]) C5C.A1I(iArr2[i5], i6);
                strArr[i5] = interfaceC11797pArr[i5].getName();
                iArr3[i5] = interfaceC11797pArr[i5].A9N();
                i5++;
            } else {
                C1341Eo c1341Eo = new C1341Eo(strArr, iArr3, c2690nWArr, iArrA0a, iArr2, new C2690nW((C2823pg[]) C5C.A1I(c2823pgArr[interfaceC11797pArr.length], iArr[interfaceC11797pArr.length])));
                Pair<C11827s[], InterfaceC2672nE[]> pairA0d = A0d(c1341Eo, iArr2, iArrA0a, c2708no, timeline);
                return new C1350Ex((C11827s[]) pairA0d.first, (InterfaceC2672nE[]) pairA0d.second, AbstractC1346Et.A00(c1341Eo, (InterfaceC1343Eq[]) pairA0d.second), c1341Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349Ew
    public final void A0c(Object obj) {
        this.A00 = (C1341Eo) obj;
    }
}
