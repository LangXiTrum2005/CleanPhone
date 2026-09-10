package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1048Sw implements Y7 {
    public static byte[] A06;
    public static String[] A07 = {"in4sXJhlGobuFdjY0QRO8DRxFSX4UzFj", "kKmapTRMiWxVb5OYWR2BnMQXysM3TtHT", "4OhnUYbAqAvDq0qXKSeHgf6qCHGf", "5nrq0rkB35odpXo60pAgwwiZNfvhkgFn", "A0wM4HXFPQzXq5huwwinIghlC1p9AzQO", "JI1YPzku", "KbPcBHa9ubdp5JSgYLr1LSdltsZPvo5b", "Ak9vzkpjISqOmIoLdrnrrsTWwG9a"};
    public int A00;
    public int A01;
    public long A02 = C.TIME_UNSET;
    public boolean A03;
    public final List<YO> A04;
    public final InterfaceC1086Uo[] A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{109, 124, 124, 96, 101, 111, 109, 120, 101, 99, 98, 35, 104, 122, 110, 127, 121, 110, 127};
    }

    static {
        A01();
    }

    public C1048Sw(List<YO> list) {
        this.A04 = list;
        this.A05 = new InterfaceC1086Uo[list.size()];
    }

    private boolean A02(C1576fq c1576fq, int i) {
        if (c1576fq.A07() == 0) {
            return false;
        }
        int iA0I = c1576fq.A0I();
        String[] strArr = A07;
        if (strArr[6].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        A07[5] = "5eCkBQiP";
        if (iA0I != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c1576fq, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c1576fq, 0)) {
                return;
            }
            int iA09 = c1576fq.A09();
            int iA07 = c1576fq.A07();
            for (InterfaceC1086Uo interfaceC1086Uo : this.A05) {
                c1576fq.A0f(iA09);
                String[] strArr = A07;
                String str = strArr[6];
                String str2 = strArr[1];
                int iCharAt = str.charAt(25);
                int dataPosition = str2.charAt(25);
                if (iCharAt != dataPosition) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[6] = "OQZAa7aqqiADcVGaZRRB4nmdqsApKfmg";
                strArr2[1] = "EHEq6drNwOxHXaKJ8wx087n95sBJtbzI";
                interfaceC1086Uo.AHx(c1576fq, iA07);
            }
            int dataPosition2 = this.A01;
            this.A01 = dataPosition2 + iA07;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        for (int i = 0; i < i; i++) {
            YO yo = this.A04.get(i);
            ys.A05();
            InterfaceC1086Uo interfaceC1086UoAJX = ul.AJX(ys.A03(), 3);
            interfaceC1086UoAJX.A6U(new P5().A0y(ys.A04()).A11(A00(0, 19, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)).A12(Collections.singletonList(yo.A02)).A10(yo.A01).A14());
            this.A05[i] = interfaceC1086UoAJX;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
        if (this.A03) {
            if (this.A02 != C.TIME_UNSET) {
                for (InterfaceC1086Uo interfaceC1086Uo : this.A05) {
                    interfaceC1086Uo.AI0(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j != C.TIME_UNSET) {
            this.A02 = j;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        this.A03 = false;
        this.A02 = C.TIME_UNSET;
    }
}
