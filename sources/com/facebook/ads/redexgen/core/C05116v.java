package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05116v implements MediaViewVideoRendererApi {
    public static byte[] A0G;
    public static String[] A0H = {"4Iqv8cTE9pbJV", "CYHnjvYzZ1Zp8VPlfffkEyqwlctrpQBL", "X8G7CA2UCcBTYjTzfkqICRpH9C9x48uG", "IuynGJFHahmt0", "YKtJTe5IUh", "gPGIa6LKGgSGxdMiTt4aCF2OLs57juUg", "T83", "DMaEshMk8cfihQw150z6d7U8VPkriS4i"};
    public static final String A0I;
    public MediaViewVideoRenderer A00;
    public VideoAutoplayBehavior A01;
    public C1828k1 A03;
    public AR A04;
    public C0874Lp A05;
    public boolean A06;
    public boolean A07;
    public NativeAd A08;
    public final AbstractC1333bt A0D = new ME(this);
    public final AbstractC1335bv A0C = new MD(this);
    public final AbstractC1337bx A0B = new MC(this);
    public final AbstractC1330bq A0E = new MB(this);
    public final AbstractC1343c3 A09 = new MA(this);
    public final AbstractC1324bk A0F = new M9(this);
    public final AbstractC1341c1 A0A = new M8(this);
    public C05026m A02 = new C05026m();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{31, 56, 32, 55, 58, 63, 50, 118, 0, 63, 51, 33, 118, 53, 57, 56, 37, 34, 36, 35, 53, 34, 57, 36, 118, 38, 55, 36, 55, 59, 37, 118, 34, 47, 38, 51, 120, 126, 72, 72, 70, 68, 67, 74, cw.k, 64, 88, 94, 89, cw.k, 79, 72, cw.k, 93, 95, 72, 78, 72, 73, 72, 73, cw.k, 79, 84, cw.k, 76, cw.k, 78, 76, 65, 65, cw.k, 89, 66, cw.k, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 1, cw.k, 76, 67, 73, cw.k, 75, 66, 65, 65, 66, 90, 72, 73, cw.k, 79, 84, cw.k, 76, cw.k, 78, 76, 65, 65, cw.k, 89, 66, cw.k, 73, 68, 94, 72, 67, 74, 76, 74, 72, 126, 72, 72, 70, 3, 38, 43, 49, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 98, 33, 35, 46, 46, 39, 38, 98, 53, 43, 54, 42, 45, 55, 54, 98, 39, 44, 37, 35, 37, 39, 17, 39, 39, 41, 108, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 41, 106, 104, 101, 101, 108, 109, 41, 126, 96, 125, 97, 102, 124, 125, 41, 109, 96, 122, 108, 103, 110, 104, 110, 108, 90, 108, 108, 98, 39};
    }

    static {
        A02();
        A0I = MediaViewVideoRenderer.class.getSimpleName();
    }

    public final void A03() {
        this.A00.pause(false);
        this.A05.setClientToken(null);
        this.A05.setVideoMPD(null);
        this.A05.setVideoURI((Uri) null);
        this.A05.setVideoCTA(null);
        this.A05.setNativeAd(null);
        this.A01 = VideoAutoplayBehavior.DEFAULT;
        if (this.A08 != null) {
            C1744ie.A0L(this.A08.getInternalNativeAd()).A1f(false, false);
        }
        this.A08 = null;
        if (this.A04 != null) {
            AR ar = this.A04;
            if (A0H[6].length() != 3) {
                throw new RuntimeException();
            }
            A0H[6] = "qaG";
            ar.AJd();
        }
    }

    public final void A04(NativeAd nativeAd) {
        this.A08 = nativeAd;
        C1828k1 c1828k1A12 = ((C1744ie) nativeAd.getInternalNativeAd()).A12();
        C1828k1 adObjectContext = this.A03;
        adObjectContext.A0L(c1828k1A12);
        C05146y c05146y = (C05146y) nativeAd.getNativeAdApi();
        this.A05.setClientToken(C1744ie.A0L(nativeAd.getInternalNativeAd()).A1C());
        this.A05.setVideoMPD(c05146y.A01());
        this.A05.setVideoURI(c05146y.A02());
        C2002mv c2002mvA0z = C1744ie.A0L(nativeAd.getInternalNativeAd()).A0z();
        if (c2002mvA0z != null) {
            this.A05.setVideoProgressReportIntervalMs(c2002mvA0z.A0B());
        }
        this.A05.setVideoCTA(nativeAd.getAdCallToAction());
        this.A05.setNativeAd(nativeAd);
        this.A01 = c05146y.getVideoAutoplayBehavior();
        if (this.A04 != null) {
            this.A04.AIf(nativeAd);
        }
    }

    public final void A05(A7 a7) {
        this.A05.setAdEventManager(a7);
    }

    public final void A06(AR ar) {
        this.A04 = ar;
    }

    public final void A07(InterfaceC0657Df interfaceC0657Df) {
        this.A05.setListener(interfaceC0657Df);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void destroy() {
        this.A05.A0Y();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void disengageSeek(VideoStartReason videoStartReason) {
        if (!this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                String str = A0I;
                String strA01 = A01(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 40, 65);
                if (A0H[6].length() != 3) {
                    throw new RuntimeException();
                }
                String[] strArr = A0H;
                strArr[0] = "GDpgiWeynUT3r";
                strArr[4] = "Fcrjr5dO1W";
                Log.w(str, strA01);
                return;
            }
            return;
        }
        this.A06 = false;
        if (this.A07) {
            this.A05.A0g(AbstractC0651Cz.A00(videoStartReason), 3);
        }
        this.A00.onSeekDisengaged();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void engageSeek() {
        if (this.A06) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.w(A0I, A01(167, 40, 10));
            }
        } else {
            this.A06 = true;
            this.A07 = JI.A0A.equals(this.A05.getState());
            this.A05.A0k(false, 1);
            this.A00.onSeekEngaged();
        }
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getCurrentTimeMs() {
        return this.A05.getCurrentPositionInMillis();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final int getDuration() {
        return this.A05.getDuration();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final View getVideoView() {
        return this.A05.getVideoView();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final float getVolume() {
        return this.A05.getVolume();
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer) {
        C1828k1 c1828k1A03;
        this.A00 = mediaViewVideoRenderer;
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1828k1) {
            c1828k1A03 = (C1828k1) context;
        } else {
            c1828k1A03 = C05056p.A03(context);
        }
        this.A03 = c1828k1A03;
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                this.A05 = new C0874Lp(c1828k1A03);
                break;
            case 1:
                this.A05 = new C0874Lp(c1828k1A03, adViewConstructorParams.getAttributeSet());
                break;
            case 2:
                this.A05 = new C0874Lp(c1828k1A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr());
                break;
            case 3:
                this.A05 = new C0874Lp(c1828k1A03, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleRes());
                break;
            default:
                throw new IllegalArgumentException(A01(0, 37, 85));
        }
        this.A05.setEnableBackgroundVideo(mediaViewVideoRenderer.shouldAllowBackgroundPlayback());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.A05.setLayoutParams(layoutParams);
        this.A02.addView(this.A05, -1, layoutParams);
        CU.A04(this.A05, CU.A0B);
        this.A05.getEventBus().A03(this.A0D, this.A0C, this.A0B, this.A0E, this.A09, this.A0F, this.A0A);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void pause(boolean z) {
        this.A05.A0k(z, 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void play(VideoStartReason videoStartReason) {
        this.A05.A0g(AbstractC0651Cz.A00(videoStartReason), 2);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void seekTo(int i) {
        if (!this.A06) {
            boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0H[1] = "0wh1LQIbECU2tB2xLmMlqLa216eizCy3";
            if (zIsDebugBuild) {
                Log.w(A0I, A01(37, 90, 46));
                return;
            }
            return;
        }
        this.A05.A0c(i);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final void setVolume(float f) {
        this.A05.setVolume(f);
    }

    @Override // com.facebook.ads.internal.api.MediaViewVideoRendererApi
    public final boolean shouldAutoplay() {
        if (this.A05 == null || this.A05.getState() == JI.A06) {
            return false;
        }
        return this.A01 == VideoAutoplayBehavior.ON || this.A01 == VideoAutoplayBehavior.DEFAULT;
    }
}
