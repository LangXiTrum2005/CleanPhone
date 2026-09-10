package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1694Sl implements InterfaceC2252fw {
    public static byte[] A03;
    public static String[] A04 = {"vUQacvUb1jgaOB1nXCILUaEr4ItZ5QEs", "N", "ozPzI", "iemFS7qx3ItQSdDQeBrvuJ9y9CMkfIqY", "EwROMxnfRd6F7268i4EpvPtVg3hQf", "a", "qVu8", "3RxrE6NsEsLt8TXu"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{85, 81, 3, 85, 87, 7, 80, 3, 60, 111, 51, 63, 51, 63, 107, 60, 44, 53, 41, 40, 35, 30, 5, 3, 22, 18, 15, 9, 8, 92, 70, 78, 120, 111, 107, 120, 111, 61, 120, 111, 111, 114, 111, 61, 114, 126, 126, 104, 111, 111, 120, 121, 124, 74, 93, 89, 74, 93, 15, 93, 74, 95, 67, 70, 74, 75, 15, 92, 90, 76, 76, 74, 92, 92, 73, 90, 67, 67, 86, 63, 62, 19, 63, 61, 32, 60, 53, 36, 53, 16, 17, 58, 13, 13, 16, 13};
    }

    static {
        A01();
    }

    public C1694Sl(WD wd, WA wa, long j) {
        this.A02 = wd;
        this.A01 = wa;
        this.A00 = j;
    }

    private final void A02(C2264g8 c2264g8) {
        W9.A06(this.A01);
        try {
            InterfaceC2250fu response = c2264g8.A00();
            if (response != null) {
                String strA73 = response.A73();
                WG serverResponse = this.A02.A06.A07(this.A02.A05, strA73, this.A00);
                if (serverResponse.A01() == WF.A03) {
                    R4 r4 = (R4) serverResponse;
                    String strA04 = r4.A04();
                    AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(r4.A03(), AdErrorType.ERROR_MESSAGE);
                    if (strA04 != null) {
                        strA73 = strA04;
                    }
                    this.A02.A05.A0F().A3W(Y1.A01(this.A02.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA73, adErrorTypeAdErrorTypeFromCode.isPublicError());
                    this.A02.A0E(C1772Vm.A01(adErrorTypeAdErrorTypeFromCode, strA73));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c2264g8.getMessage();
            InterfaceC1526Lt interfaceC1526LtA0F = this.A02.A05.A0F();
            long jA01 = Y1.A01(this.A02.A01);
            int errorCode = adErrorType.getErrorCode();
            boolean zIsPublicError = adErrorType.isPublicError();
            if (A04[2].length() == 29) {
                throw new RuntimeException();
            }
            A04[4] = "NZ18w";
            interfaceC1526LtA0F.A3W(jA01, errorCode, message, zIsPublicError);
            this.A02.A0E(C1772Vm.A01(adErrorType, message));
        } catch (JSONException e2) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage = c2264g8.getMessage();
            this.A02.A05.A0F().A3W(Y1.A01(this.A02.A01), adErrorType2.getErrorCode(), A00(16, 15, 30) + e2.getMessage(), adErrorType2.isPublicError());
            this.A02.A0E(C1772Vm.A01(adErrorType2, errorMessage));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2252fw
    public final void ADR(InterfaceC2250fu interfaceC2250fu) {
        AbstractC1783Vy.A05(A00(79, 10, 40), A00(52, 27, 87), A00(8, 8, 114));
        if (interfaceC2250fu != null) {
            String strA73 = interfaceC2250fu.A73();
            int iA02 = C1750Up.A02(this.A02.A05);
            String[] strArr = A04;
            String str = strArr[5];
            String response = strArr[1];
            if (str.length() != response.length()) {
                throw new RuntimeException();
            }
            A04[2] = "kblvpkFa8oUK1ItVGqcsW93nH";
            if (iA02 > 0) {
                C1796Wl.A00(this.A02.A05).A0C(strA73);
            }
            W9.A06(this.A01);
            this.A02.A0O(strA73, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2252fw
    public final void ADq(Exception exc) {
        AbstractC1783Vy.A05(A00(89, 7, 7), A00(31, 21, 101), A00(0, 8, 30));
        if (C2264g8.class.equals(exc.getClass())) {
            A02((C2264g8) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        this.A02.A05.A0F().A3W(Y1.A01(this.A02.A01), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0E(C1772Vm.A01(adErrorType, errorMessage));
    }
}
