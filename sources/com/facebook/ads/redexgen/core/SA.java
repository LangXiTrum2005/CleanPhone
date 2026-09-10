package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SA implements NativeBannerAdApi {
    public static byte[] A01;
    public static String[] A02 = {"068yMtBHtCdtzUYBTQD9IwnMWW1doBJF", "2l8Hok5ewW", "SqMVYGMc7AyphtDxx4DkXGESiOtqp3Wk", "n7xht10RjuH04nLwyOxbbpbZUJ6bFNP5", "hemUdCIRyaFDmP64bLQtQG29khNbMpFH", "0krrnlsRXu", "j9YMm5Kfv7iMZif7VGfsQGY8YQ9Z0I42", "SiUubuHC3Y"};
    public final UK A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = bArrCopyOfRange[i5];
            if (A02[0].charAt(2) != '8') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "SDJ7CqIuYGJEmotuvG7btG7Q2tCK4c6p";
            strArr[6] = "3TZdd6KNeaSFSkmrHNZK7GULPPfkGOEa";
            bArrCopyOfRange[i5] = (byte) ((b2 - i4) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13};
    }

    static {
        A01();
    }

    public SA(NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = UK.A0L(nativeAdBaseApi);
        this.A00.A1i(EnumC1775Vq.A05);
    }

    private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi) {
        UK ukA0L = UK.A0L(nativeAdBaseApi);
        C2322h4 c2322h4 = new C2322h4(this, imageView, ukA0L);
        C1762Vb c1762VbA19 = ukA0L.getAdIcon();
        if (c1762VbA19 != null) {
            Bitmap bitmapA0N = ukA0L.A14().A0N(c1762VbA19.getUrl());
            Context context = imageView.getContext();
            String[] strArr = A02;
            if (strArr[2].charAt(21) == strArr[6].charAt(21)) {
                A02[4] = "oesEo3u5gOmbsNZfXjsimFyw8pPXYbZZ";
                C2300gi c2300giA03 = C1673Rp.A03(context);
                if (bitmapA0N != null) {
                    Drawable drawableA05 = UK.A05(c2300giA03, bitmapA0N, ukA0L.A1t(), ukA0L.A1I());
                    UK.A0f(drawableA05, imageView);
                    imageView.post(new C2321h3(this, ukA0L, drawableA05));
                    return;
                } else {
                    C2322h4 c2322h5 = null;
                    S7 loadImageTask = new S7(c2300giA03, c2322h4, ukA0L.A1t(), c2322h5);
                    loadImageTask.execute(new S9(c1762VbA19.getUrl(), ukA0L.A1I(), c2322h5));
                    return;
                }
            }
        } else {
            InterfaceC1730Tv interfaceC1730TvA1A = ukA0L.A1A();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            if (A02[4].charAt(17) != 't') {
                A02[4] = "aFZFEDb6phUkMJAuumeHd9ws0nVx9tBY";
                ukA0L.A16().A0F().A3N(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (interfaceC1730TvA1A != null) {
                    interfaceC1730TvA1A.ADp(C1772Vm.A00(adErrorType));
                }
                Log.e(A00(0, 17, 86), adErrorType.getDefaultErrorMessage());
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, ImageView imageView) {
        registerViewForInteraction(view, imageView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, ImageView imageView, List<View> list) {
        if (imageView != null) {
            A02(imageView, this.A00);
        }
        if (list != null) {
            UK uk = this.A00;
            if (A02[1].length() != 10) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "ll9cTRtW3a";
            strArr[7] = "WGLVGgKdvO";
            uk.A1T(view, imageView, list);
            return;
        }
        this.A00.A1S(view, imageView);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (List<View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(View view, MediaView mediaView, List<View> clickableViews) {
        if (mediaView != null) {
            ((C2330hC) mediaView.getMediaViewApi()).A0X(this.A00, true);
        }
        if (clickableViews != null) {
            this.A00.A1W(view, mediaView, clickableViews, true);
        } else {
            this.A00.A1X(view, mediaView, true);
        }
    }
}
