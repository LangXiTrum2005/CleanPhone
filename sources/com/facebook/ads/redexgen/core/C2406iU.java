package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2406iU implements OQ {
    public static byte[] A05;
    public static String[] A06 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public boolean A00;
    public final OE A01;
    public final C2410iY A02;
    public final OL A03;
    public final C2300gi A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{110, 75, 15, 64, 77, 69, 74, 76, 91, 15, 70, 92, 15, 65, 90, 67, 67, 9, 30, 5, 15, 7, 14, 20, 14, 19, 31, 25, 10, 24, 20, 0, 14, 18, 47, 43, 40, 28, 13, 0, 12, 7, 10, 12, 39, 12, 29, 30, 6, 27, 2, 87, 80, 74, 65, 91, 76, 76, 81, 76, 65, 93, 81, 90, 91, 65, 85, 91, 71, 14, 13, 12, 5, 29, 11, 12, 20, 3, 14, 11, 6, 3, 22, 11, 13, 12, 29, 22, 11, 15, 7, 29, 9, 7, 27, 39, 15, 25, 25, 11, 13, 15, 80, 74, 118, 82, 72, 72, 82, 85, 92, 27, 89, 78, 85, 95, 87, 94, 27, 93, 84, 73, 27, 86, 94, 72, 72, 90, 92, 94, 21, 35, 36, 34, 47, 53, 34, 34, 63, 34, 47, 61, 53, 35, 35, 49, 55, 53, 47, 59, 53, 41, 72, 89, 64};
    }

    static {
        A01();
    }

    public C2406iU(C2300gi c2300gi, C2410iY c2410iY, OE oe, OL ol) {
        this.A04 = c2300gi;
        this.A02 = c2410iY;
        this.A01 = oe;
        this.A03 = ol;
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final Bundle A5R(String str) {
        return OX.A02(str, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void A5v() {
        this.A03.A0F(TTAdConstant.IMAGE_MODE_1012, null);
        this.A03.A0C();
        this.A02.A0D(null);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final int A8P() {
        return 1010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:35:0x0128 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    /* JADX WARN: Code duplicated, block: B:39:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x0143  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.OQ
    public final void A9j(Message message) {
        int i2;
        String[] strArr;
        InterstitialAd interstitialAdA6k = this.A02.A6k();
        String strA00 = A00(152, 3, 89);
        if (interstitialAdA6k == null) {
            this.A04.A08().ABC(strA00, AbstractC1712Td.A0K, new C1713Te(A00(0, 17, 95)));
            return;
        }
        int i3 = message.what;
        String strA01 = A00(95, 9, 26);
        String strA02 = A00(104, 27, 75);
        String strA03 = A00(17, 17, 59);
        switch (i3) {
            case 10:
            case IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE /* 1023 */:
                Bundle bundle = message.getData().getBundle(strA03);
                if (bundle != null) {
                    int i4 = bundle.getInt(A00(51, 18, 110));
                    String string = bundle.getString(A00(131, 21, 0));
                    AdError adError = new AdError(i4, string);
                    this.A01.AJR(adError);
                    if (this.A02.A6o() != null) {
                        InterstitialAdListener interstitialAdListenerA6o = this.A02.A6o();
                        String[] strArr2 = A06;
                        String str = strArr2[1];
                        String str2 = strArr2[0];
                        int errorCode = str.charAt(1);
                        if (errorCode != str2.charAt(1)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A06;
                        strArr3[2] = "mejJWXlfs8BbYc";
                        strArr3[6] = "mZxW76dM1wQ3lj";
                        interstitialAdListenerA6o.onError(interstitialAdA6k, adError);
                    } else {
                        Log.e(A00(34, 17, 25), string);
                    }
                } else {
                    this.A01.AJM(OD.A04);
                    this.A04.A08().ABC(strA00, AbstractC1712Td.A0V, new C1713Te(strA02, strA01 + message));
                }
                this.A02.A0D(null);
                return;
            case 1020:
                this.A01.AJW();
                Bundle bundle2 = message.getData().getBundle(strA03);
                if (bundle2 != null) {
                    this.A02.A0C(bundle2.getLong(A00(69, 26, 50)));
                } else {
                    this.A04.A08().ABC(strA00, AbstractC1712Td.A0V, new C1713Te(strA02, strA01 + message));
                }
                this.A02.A0D(null);
                break;
            case IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW /* 1022 */:
                this.A01.AJm();
                break;
        }
        if (this.A02.A6o() == null) {
            return;
        }
        int i5 = message.what;
        String[] strArr4 = A06;
        if (strArr4[4].charAt(13) == strArr4[7].charAt(13)) {
            String[] strArr5 = A06;
            strArr5[1] = "311XYum1gU07qORRQ11S6l3eVKorNtDz";
            strArr5[0] = "91xN7y0ETPjwD6LsGrgnzhnoOTtOTKl3";
            switch (i5) {
                case 1020:
                    if (!this.A00) {
                        this.A02.A6o().onAdLoaded(interstitialAdA6k);
                        return;
                    } else {
                        this.A00 = false;
                        return;
                    }
                case IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT /* 1021 */:
                    this.A02.A6o().onInterstitialDisplayed(interstitialAdA6k);
                    return;
                case IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW /* 1022 */:
                    this.A02.A6o().onInterstitialDismissed(interstitialAdA6k);
                    return;
                case IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE /* 1023 */:
                default:
                    if (this.A02.A04() == null) {
                        return;
                    }
                    i2 = message.what;
                    strArr = A06;
                    if (strArr[5].length() != strArr[3].length()) {
                        switch (i2) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                return;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    String[] strArr6 = A06;
                    strArr6[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                    strArr6[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                    switch (i2) {
                        case 3000:
                            this.A02.A04().onRewardedAdCompleted();
                            return;
                        case 3001:
                            this.A02.A04().onRewardedAdServerSucceeded();
                            return;
                        case 3002:
                            this.A02.A04().onRewardedAdServerFailed();
                            return;
                        default:
                            return;
                    }
                case 1024:
                    this.A02.A6o().onAdClicked(interstitialAdA6k);
                    return;
                case IronSourceError.ERROR_LOAD_FAILED_TIMEOUT /* 1025 */:
                    this.A02.A6o().onLoggingImpression(interstitialAdA6k);
                    return;
                case IronSourceError.ERROR_RV_LOAD_DURING_LOAD /* 1026 */:
                    boolean z2 = this.A02.A6o() instanceof InterstitialAdExtendedListener;
                    String[] strArr7 = A06;
                    if (strArr7[2].length() == strArr7[6].length()) {
                        String[] strArr8 = A06;
                        strArr8[2] = "qw7ApZ7ipfHbwj";
                        strArr8[6] = "LJsV5SavG50yIX";
                        if (z2) {
                            ((InterstitialAdExtendedListener) this.A02.A6o()).onInterstitialActivityDestroyed();
                        }
                        if (this.A02.A04() == null) {
                            return;
                        }
                        i2 = message.what;
                        strArr = A06;
                        if (strArr[5].length() != strArr[3].length()) {
                            switch (i2) {
                                case 3000:
                                    this.A02.A04().onRewardedAdCompleted();
                                    return;
                                case 3001:
                                    this.A02.A04().onRewardedAdServerSucceeded();
                                    return;
                                case 3002:
                                    this.A02.A04().onRewardedAdServerFailed();
                                    return;
                                default:
                                    return;
                            }
                        }
                        String[] strArr9 = A06;
                        strArr9[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                        strArr9[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                        switch (i2) {
                            case 3000:
                                this.A02.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A02.A04().onRewardedAdServerSucceeded();
                                return;
                            case 3002:
                                this.A02.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    break;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void AJn(boolean z2) {
        this.A00 = z2;
    }
}
