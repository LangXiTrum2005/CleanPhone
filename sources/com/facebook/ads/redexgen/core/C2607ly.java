package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2607ly extends AbstractC1456Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public HJ A00;
    public C2608lz A01;

    private int A00(C11074v c11074v) {
        int i2 = (c11074v.A0l()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i2 == 6 || i2 == 7) {
            c11074v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int iCharAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (iCharAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c11074v.A0S();
        }
        int result = HF.A00(c11074v, i2);
        c11074v.A0f(0);
        return result;
    }

    public static boolean A01(C11074v c11074v) {
        return c11074v.A07() >= 5 && c11074v.A0I() == 127 && c11074v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    public final long A09(C11074v c11074v) {
        if (!A02(c11074v.A0l())) {
            return -1L;
        }
        return A00(c11074v);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    public final void A0B(boolean z2) {
        super.A0B(z2);
        if (z2) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1456Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C11074v c11074v, long j, C1455Ja c1455Ja) {
        byte[] bArrA0l = c11074v.A0l();
        HJ hj = this.A00;
        if (hj == null) {
            HJ hj2 = new HJ(bArrA0l, 17);
            this.A00 = hj2;
            c1455Ja.A00 = hj2.A08(Arrays.copyOfRange(bArrA0l, 9, c11074v.A0A()), null);
            return true;
        }
        if ((bArrA0l[0] & AbstractJsonLexerKt.TC_INVALID) == 3) {
            HI hiA03 = HH.A03(c11074v);
            HJ streamMetadata = hj.A09(hiA03);
            this.A00 = streamMetadata;
            this.A01 = new C2608lz(streamMetadata, hiA03);
            return true;
        }
        if (!A02(bArrA0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j);
            c1455Ja.A01 = this.A01;
        }
        C2860qI c2860qI = c1455Ja.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        AbstractC10843y.A01(c2860qI);
        return false;
    }
}
