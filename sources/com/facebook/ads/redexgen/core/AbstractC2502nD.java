package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2502nD extends AbstractC1180Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C1172Eo A00;

    public abstract Pair<C10137s[], InterfaceC2503nE[]> A0d(C1172Eo c1172Eo, int[][][] iArr, int[] iArr2, C2539no c2539no, Timeline timeline) throws AD;

    public static int A0Y(InterfaceC10107p[] interfaceC10107pArr, C2654pg c2654pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC10107pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC10107p interfaceC10107p = interfaceC10107pArr[i2];
            int iMax = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC10107p.AKM(c2654pg.A08(bestFormatSupportLevel));
                iMax = Math.max(iMax, AbstractC10037i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (iMax > formatSupportLevel || (iMax == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = iMax;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC10107p interfaceC10107p, C2654pg c2654pg) throws AD {
        int[] iArr = new int[c2654pg.A01];
        for (int i = 0; i < c2654pg.A01; i++) {
            iArr[i] = interfaceC10107p.AKM(c2654pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC10107p[] interfaceC10107pArr) throws AD {
        int[] iArr = new int[interfaceC10107pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int iAKO = interfaceC10107pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = iAKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1180Ew
    public final C1181Ex A0b(InterfaceC10107p[] interfaceC10107pArr, C2521nW c2521nW, C2539no c2539no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC10107pArr.length + 1];
        C2654pg[][] c2654pgArr = new C2654pg[interfaceC10107pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC10107pArr.length + 1][][];
        for (int i = 0; i < c2654pgArr.length; i++) {
            c2654pgArr[i] = new C2654pg[c2521nW.A01];
            iArr2[i] = new int[c2521nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC10107pArr);
        for (int i2 = 0; i2 < c2521nW.A01; i2++) {
            C2654pg c2654pgA05 = c2521nW.A05(i2);
            int groupIndex = A0Y(interfaceC10107pArr, c2654pgA05, iArr, c2654pgA05.A02 == 5);
            if (groupIndex == interfaceC10107pArr.length) {
                rendererTrackGroupCounts = new int[c2654pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC10107pArr[groupIndex], c2654pgA05);
            }
            int i3 = iArr[groupIndex];
            c2654pgArr[groupIndex][i3] = c2654pgA05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2521nW[] c2521nWArr = new C2521nW[interfaceC10107pArr.length];
        String[] strArr = new String[interfaceC10107pArr.length];
        int[] iArr3 = new int[interfaceC10107pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC10107pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c2521nWArr[i4] = new C2521nW((C2654pg[]) C5C.A1I(c2654pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC10107pArr[i4].getName();
                iArr3[i4] = interfaceC10107pArr[i4].A9N();
                i4++;
            } else {
                C1172Eo c1172Eo = new C1172Eo(strArr, iArr3, c2521nWArr, iArrA0a, iArr2, new C2521nW((C2654pg[]) C5C.A1I(c2654pgArr[interfaceC10107pArr.length], iArr[interfaceC10107pArr.length])));
                Pair<C10137s[], InterfaceC2503nE[]> pairA0d = A0d(c1172Eo, iArr2, iArrA0a, c2539no, timeline);
                return new C1181Ex((C10137s[]) pairA0d.first, (InterfaceC2503nE[]) pairA0d.second, AbstractC1177Et.A00(c1172Eo, (InterfaceC1174Eq[]) pairA0d.second), c1172Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1180Ew
    public final void A0c(Object obj) {
        this.A00 = (C1172Eo) obj;
    }
}
