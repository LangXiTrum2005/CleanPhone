package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class S3 implements NativeAdScrollViewApi {
    public static byte[] A07;
    public static String[] A08 = {"nVlKDJKKuSIwTlTd16ukFrbX3MHjOHdA", "", "ICm0nIVybe3UlAuBnNKxRWg2mc3pSWnS", "", "SSXPkfr4Ttu5KI5IplEjDPNbu7CwAkh6", "a5Au6kTC9kTmWkoQnewo7jq8", "NRpBzWywFD0YlyTuhproyOYpEldGp2Hb", "m"};
    public final int A00;
    public final NativeAdScrollView.AdViewProvider A01;
    public final NativeAdView.Type A02;
    public final NativeAdViewAttributes A03;
    public final NativeAdsManager A04;
    public final C2327h9 A05;
    public final C2300gi A06;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        byte[] bArr = {60, 4, 2, 5, 81, 1, 3, 30, 7, 24, 21, 20, 81, 16, 81, 63, 16, 5, 24, 7, 20, 48, 21, 39, 24, 20, 6, 95, 37, 8, 1, 20, 93, 81, 48, 21, 39, 24, 20, 6, 33, 3, 30, 7, 24, 21, 20, 3, 81, 30, 3, 81, 16, 81, 31, 16, 5, 24, 7, 20, 48, 21, 39, 24, 20, 6, 57, 20, 24, 22, 25, 5, 53, 1, 52, 27, 14, 19, 12, 31, 59, 30, 9, 55, 27, 20, 27, 29, 31, 8, 90, 20, 21, 14, 90, 22, 21, 27, 30, 31, 30};
        String[] strArr = A08;
        if (strArr[6].charAt(14) != strArr[0].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[2] = "Ml52sYoz4FZavAZNhfJ3fi3jnwDnZY4L";
        strArr2[4] = "tWqTcrLKFqppCUd7uCsjOJfAn0Jrdt0w";
        A07 = bArr;
    }

    static {
        A07();
    }

    public S3(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i2, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        if (nativeAdsManager.isLoaded()) {
            if (type != null || adViewProvider != null || i2 > 0) {
                this.A06 = C1673Rp.A03(context);
                this.A04 = nativeAdsManager;
                this.A03 = nativeAdViewAttributes;
                this.A01 = adViewProvider;
                this.A02 = type;
                this.A00 = i3;
                C2328hA c2328hA = new C2328hA(this);
                this.A05 = new C2327h9(context);
                if (this.A02 == null) {
                    if (i2 > 0) {
                        this.A05.A00(((int) XX.A02) * i2);
                    }
                } else {
                    this.A05.A00((int) (XX.A02 * this.A02.getHeight()));
                }
                this.A05.setAdapter(c2328hA);
                setInset(20);
                c2328hA.A09();
                nativeAdScrollView.addView(this.A05);
                return;
            }
            throw new IllegalArgumentException(A06(0, 74, 3));
        }
        throw new IllegalStateException(A06(74, 27, 8));
    }

    @Override // com.facebook.ads.internal.api.NativeAdScrollViewApi
    public final void setInset(int i2) {
        if (i2 > 0) {
            float f = XX.A02;
            float density = i2;
            int insetDp = Math.round(density * f);
            this.A05.setPadding(insetDp, 0, insetDp, 0);
            float density2 = i2 / 2;
            this.A05.setPageMargin(Math.round(density2 * f));
            this.A05.setClipToPadding(false);
        }
    }
}
