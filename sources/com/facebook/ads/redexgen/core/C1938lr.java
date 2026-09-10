package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.badlogic.gdx.Input;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1938lr implements C3Q {
    public static byte[] A06;
    public static String[] A07 = {"41kFMkgYcMqjBdEAHWyZzQ9Q1YQDMkZo", "a1qrqbdzoLKte5dp2TdqsHV2Btmo8HIO", "VlRnhGghZyM7Xz", "WVmrs7jRPAo6ieNv", "abQhu9SgesOIRxLkCU6L7yAdrfeNFYXV", "iVqBhi5IkesALAcr", "e6wMTa30i0R6i9", "GTVyj1NjpD4uWxM1mBTnBnh1LH0X6W6g"};
    public boolean A00;
    public final AbstractC1951m5 A01;
    public final C3E A02;
    public final C1941lu A03;
    public final C3L A04;
    public final C1828k1 A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{110, 75, cw.m, 64, 77, 69, 74, 76, 91, cw.m, 70, 92, cw.m, 65, 90, 67, 67, 9, 30, 5, cw.m, 7, cw.l, 20, cw.l, 19, 31, 25, 10, 24, 20, 0, cw.l, 18, 47, 43, 40, 28, cw.k, 0, 12, 7, 10, 12, 39, 12, 29, 30, 6, 27, 2, 87, 80, 74, 65, 91, 76, 76, 81, 76, 65, 93, 81, 90, 91, 65, 85, 91, 71, cw.l, cw.k, 12, 5, 29, 11, 12, 20, 3, cw.l, 11, 6, 3, 22, 11, cw.k, 12, 29, 22, 11, cw.m, 7, 29, 9, 7, 27, 39, cw.m, 25, 25, 11, cw.k, cw.m, 80, 74, 118, 82, 72, 72, 82, 85, 92, 27, 89, 78, 85, 95, 87, 94, 27, 93, 84, 73, 27, 86, 94, 72, 72, 90, 92, 94, 21, 35, 36, 34, 47, 53, 34, 34, 63, 34, 47, 61, 53, 35, 35, 49, 55, 53, 47, 59, 53, 41, 72, 89, 64};
    }

    static {
        A01();
    }

    public C1938lr(C1828k1 c1828k1, C1941lu c1941lu, C3E c3e, AbstractC1951m5 abstractC1951m5, C3L c3l) {
        this.A05 = c1828k1;
        this.A03 = c1941lu;
        this.A02 = c3e;
        this.A01 = abstractC1951m5;
        this.A04 = c3l;
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final Bundle A5H(String str) {
        return C3X.A02(str, this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final void A5l() {
        this.A04.A0F(1012, null);
        this.A04.A0C();
        this.A03.A0D(null);
    }

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final int A8F() {
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
    @Override // com.facebook.ads.redexgen.core.C3Q
    public final void A9Z(Message message) {
        int i;
        String[] strArr;
        InterstitialAd interstitialAdA6a = this.A03.A6a();
        String strA00 = A00(Input.Keys.NUMPAD_8, 3, 89);
        if (interstitialAdA6a == null) {
            this.A05.A08().AAu(strA00, AbstractC05418a.A0K, new C05428b(A00(0, 17, 95)));
            return;
        }
        int i2 = message.what;
        String strA01 = A00(95, 9, 26);
        String strA02 = A00(104, 27, 75);
        String strA03 = A00(17, 17, 59);
        switch (i2) {
            case 10:
            case 1023:
                Bundle bundle = message.getData().getBundle(strA03);
                if (bundle != null) {
                    int i3 = bundle.getInt(A00(51, 18, 110));
                    String string = bundle.getString(A00(131, 21, 0));
                    AdError adError = new AdError(i3, string);
                    this.A02.AIX(adError);
                    if (this.A03.A6e() != null) {
                        InterstitialAdListener interstitialAdListenerA6e = this.A03.A6e();
                        String[] strArr2 = A07;
                        String str = strArr2[1];
                        String str2 = strArr2[0];
                        int errorCode = str.charAt(1);
                        if (errorCode != str2.charAt(1)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A07;
                        strArr3[2] = "mejJWXlfs8BbYc";
                        strArr3[6] = "mZxW76dM1wQ3lj";
                        interstitialAdListenerA6e.onError(interstitialAdA6a, adError);
                    } else {
                        Log.e(A00(34, 17, 25), string);
                    }
                } else {
                    this.A02.AIS(C3D.A04);
                    this.A05.A08().AAu(strA00, AbstractC05418a.A0V, new C05428b(strA02, strA01 + message));
                }
                this.A03.A0D(null);
                return;
            case PointerIconCompat.TYPE_GRAB /* 1020 */:
                this.A02.AIc();
                Bundle bundle2 = message.getData().getBundle(strA03);
                if (bundle2 != null) {
                    this.A03.A0C(bundle2.getLong(A00(69, 26, 50)));
                } else {
                    this.A05.A08().AAu(strA00, AbstractC05418a.A0V, new C05428b(strA02, strA01 + message));
                }
                this.A03.A0D(null);
                break;
            case 1022:
                this.A02.AIs();
                break;
        }
        if (this.A03.A6e() == null) {
            return;
        }
        int i4 = message.what;
        String[] strArr4 = A07;
        if (strArr4[4].charAt(13) == strArr4[7].charAt(13)) {
            String[] strArr5 = A07;
            strArr5[1] = "311XYum1gU07qORRQ11S6l3eVKorNtDz";
            strArr5[0] = "91xN7y0ETPjwD6LsGrgnzhnoOTtOTKl3";
            switch (i4) {
                case PointerIconCompat.TYPE_GRAB /* 1020 */:
                    if (!this.A00) {
                        this.A03.A6e().onAdLoaded(interstitialAdA6a);
                        return;
                    } else {
                        this.A00 = false;
                        return;
                    }
                case PointerIconCompat.TYPE_GRABBING /* 1021 */:
                    this.A03.A6e().onInterstitialDisplayed(interstitialAdA6a);
                    return;
                case 1022:
                    this.A03.A6e().onInterstitialDismissed(interstitialAdA6a);
                    return;
                case 1023:
                default:
                    if (this.A03.A04() == null) {
                        return;
                    }
                    i = message.what;
                    strArr = A07;
                    if (strArr[5].length() != strArr[3].length()) {
                        switch (i) {
                            case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                                this.A03.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A03.A04().onRewardedAdServerSucceeded();
                                return;
                            case BANNER_AUTO_REDIRECT_VALUE:
                                this.A03.A04().onRewardedAdServerFailed();
                                return;
                            default:
                                return;
                        }
                    }
                    String[] strArr6 = A07;
                    strArr6[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                    strArr6[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                    switch (i) {
                        case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                            this.A03.A04().onRewardedAdCompleted();
                            return;
                        case 3001:
                            this.A03.A04().onRewardedAdServerSucceeded();
                            return;
                        case BANNER_AUTO_REDIRECT_VALUE:
                            this.A03.A04().onRewardedAdServerFailed();
                            return;
                        default:
                            return;
                    }
                case 1024:
                    this.A03.A6e().onAdClicked(interstitialAdA6a);
                    return;
                case 1025:
                    this.A03.A6e().onLoggingImpression(interstitialAdA6a);
                    return;
                case 1026:
                    boolean z = this.A03.A6e() instanceof InterstitialAdExtendedListener;
                    String[] strArr7 = A07;
                    if (strArr7[2].length() == strArr7[6].length()) {
                        String[] strArr8 = A07;
                        strArr8[2] = "qw7ApZ7ipfHbwj";
                        strArr8[6] = "LJsV5SavG50yIX";
                        if (z) {
                            ((InterstitialAdExtendedListener) this.A03.A6e()).onInterstitialActivityDestroyed();
                        }
                        if (this.A03.A04() == null) {
                            return;
                        }
                        i = message.what;
                        strArr = A07;
                        if (strArr[5].length() != strArr[3].length()) {
                            switch (i) {
                                case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                                    this.A03.A04().onRewardedAdCompleted();
                                    return;
                                case 3001:
                                    this.A03.A04().onRewardedAdServerSucceeded();
                                    return;
                                case BANNER_AUTO_REDIRECT_VALUE:
                                    this.A03.A04().onRewardedAdServerFailed();
                                    return;
                                default:
                                    return;
                            }
                        }
                        String[] strArr9 = A07;
                        strArr9[4] = "s5jamizIFVbotxZqKkKlcngcWbLxgQvF";
                        strArr9[7] = "aiBjTIjz8RGRWx4VpHoYFj9LDTOMQV9R";
                        switch (i) {
                            case PathInterpolatorCompat.MAX_NUM_POINTS /* 3000 */:
                                this.A03.A04().onRewardedAdCompleted();
                                return;
                            case 3001:
                                this.A03.A04().onRewardedAdServerSucceeded();
                                return;
                            case BANNER_AUTO_REDIRECT_VALUE:
                                this.A03.A04().onRewardedAdServerFailed();
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

    @Override // com.facebook.ads.redexgen.core.C3Q
    public final void AIt(boolean z) {
        this.A00 = z;
    }
}
