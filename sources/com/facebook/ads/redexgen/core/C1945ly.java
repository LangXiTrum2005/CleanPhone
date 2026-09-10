package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1945ly implements C3G {
    public static byte[] A09;
    public static final String A0A;
    public long A00 = -1;
    public InterstitialAd A01;
    public C2S A02;
    public C0895Mr A03;
    public boolean A04;
    public boolean A05;
    public final C1828k1 A06;
    public final InterstitialAdExtendedListener A07;
    public final C1941lu A08;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-88, -43, -121, -56, -53, -121, -45, -42, -56, -53, -121, -48, -38, -121, -56, -45, -39, -52, -56, -53, -32, -121, -48, -43, -121, -41, -39, -42, -50, -39, -52, -38, -38, -107, -121, -64, -42, -36, -121, -38, -49, -42, -36, -45, -53, -121, -34, -56, -48, -37, -121, -51, -42, -39, -121, -56, -53, -77, -42, -56, -53, -52, -53, -113, -112, -121, -37, -42, -121, -55, -52, -121, -54, -56, -45, -45, -52, -53, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -68, -65, -79, -76, 112, -77, -79, -68, -68, -75, -76, 112, -57, -72, -71, -68, -75, 112, -61, -72, -65, -57, -71, -66, -73, 112, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 126, -33, -18, -25};
    }

    static {
        A0A();
        A0A = C1945ly.class.getSimpleName();
    }

    public C1945ly(C1941lu c1941lu, C3W c3w, String str) {
        this.A08 = c1941lu;
        this.A06 = c1941lu.A05();
        this.A07 = new C1927lg(str, c3w, this);
    }

    public final long A0D() {
        if (this.A03 != null) {
            return this.A03.A0G();
        }
        return -1L;
    }

    public final C1941lu A0E() {
        return this.A08;
    }

    public final C1828k1 A0F() {
        return this.A06;
    }

    public final void A0G(EnumSet<CacheFlag> cacheFlags, String str) {
        String strA02;
        this.A00 = System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            Log.w(A0A, A09(0, 78, 45));
        }
        this.A05 = false;
        if (this.A04 && !C05789m.A0h(this.A06)) {
            this.A06.A08().AAu(A09(130, 3, 68), AbstractC05418a.A0L, new C05428b(A09(78, 52, 22)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0F().A3D(C0646Cu.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A6a(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        if (this.A03 != null) {
            this.A03.A0S(new C1949m3(this));
            this.A03.A0N();
            this.A03.A0K();
            this.A03 = null;
        }
        AnonymousClass37 anonymousClass37 = new AnonymousClass37(this.A08.A0A(), AbstractC0602An.A00(this.A06.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC0599Aj.A08, 1, cacheFlags, this.A08.A06());
        if (C05789m.A2W(this.A06) && (strA02 = C6.A02(this.A06, this.A08.A08())) != null) {
            this.A08.A0I(strA02);
        }
        anonymousClass37.A06(this.A08.A08());
        anonymousClass37.A07(this.A08.A09());
        anonymousClass37.A04(this.A08.A03());
        this.A03 = new C0895Mr(this.A06, anonymousClass37);
        this.A03.A0S(new C1947m0(this));
        this.A03.A0W(str);
    }

    public final boolean A0H() {
        return this.A03 == null || this.A03.A0Z();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0F().A3D(C0646Cu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6a(), adError);
            return false;
        }
        if (this.A03 == null) {
            this.A06.A08().AAu(A09(130, 3, 68), AbstractC05418a.A0S, new C05428b(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0F().A3D(C0646Cu.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6a(), adError);
            return false;
        }
        this.A03.A0M();
        this.A04 = true;
        this.A05 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.C3G
    public final void destroy() {
        if (this.A03 != null) {
            this.A03.A0S(new C1946lz(this));
            this.A03.A0Y(true);
            this.A03.A0K();
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
