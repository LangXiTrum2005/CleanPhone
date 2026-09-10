package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class VZ implements InterfaceC1698Sp {
    public static byte[] A03;
    public static String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ C2482ju A00;
    public final /* synthetic */ UK A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, 63, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, 63, 55, 4};
    }

    static {
        A01();
    }

    public VZ(UK uk, C2482ju c2482ju, boolean z2) {
        this.A01 = uk;
        this.A00 = c2482ju;
        this.A02 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADL() {
        if (this.A01.A0e != null) {
            this.A01.A0e.A0J();
            this.A01.A0e = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String strA00 = A00(0, 27, 111);
        this.A01.A0g.A0F().A3N(Y1.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0I != null) {
            this.A01.A0I.ADp(C1772Vm.A01(adErrorType, strA00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1698Sp
    public final void ADT() {
        this.A01.A0e = this.A00;
        if (this.A02 && this.A01.A0B != null) {
            this.A01.A0B.A0L();
        }
        if (this.A01.A0I != null) {
            if (this.A01.A0G.equals(VW.A04) && !this.A01.A0r()) {
                this.A01.A0I.AEq();
            }
            if (this.A02) {
                UK uk = this.A01;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    if (C1750Up.A1s(uk.A0g) && this.A01.A13() != null && this.A01.A13().A1g()) {
                        this.A01.A0P = AbstractC2085dD.A01(this.A01.A0g, this.A01.A13(), 4, new C1776Vr(this));
                        return;
                    } else {
                        UK uk2 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            uk2.A0I.ACq();
                            return;
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
    }
}
