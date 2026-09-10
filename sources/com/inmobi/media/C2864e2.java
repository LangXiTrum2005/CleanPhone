package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C2864e2;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2864e2 extends Dk {
    public final String h = "InMobi";
    public final String i = C2864e2.class.getSimpleName();
    public C2761a2 j;
    public C2761a2 k;
    public C2761a2 l;
    public C2761a2 m;

    public final boolean a(long j) {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "checkForRefreshRate " + this);
        }
        C2761a2 c2761a2 = this.m;
        if (c2761a2 == null) {
            return false;
        }
        AdConfig adConfig = c2761a2.c;
        Intrinsics.beachfront(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.b(TAG2, "Early refresh request");
        }
        b(this.m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        C2761a2 c2761a3 = this.m;
        Kb.a((byte) 1, TAG3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2761a3 != null ? c2761a3.l : null) + ")");
        C3097n9 c3097n11 = this.f;
        if (c3097n11 != null) {
            String TAG4 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            C2761a2 c2761a4 = this.m;
            c3097n11.b(TAG4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c2761a4 != null ? c2761a4.l : null) + ")");
        }
        return false;
    }

    public final void b(InMobiBanner inMobiBanner) {
        C3287v0 c3287v0;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "displayInternal " + this);
        }
        C2761a2 c2761a2 = this.l;
        if (c2761a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = c2761a2.i();
        if (gestureDetectorOnGestureListenerC2829ciI == null) {
            gestureDetectorOnGestureListenerC2829ciI = null;
        }
        if (gestureDetectorOnGestureListenerC2829ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC2829ciI.getViewableAd();
        C2761a2 c2761a3 = this.l;
        if (c2761a3 != null && (c3287v0 = c2761a3.l) != null && c3287v0.j) {
            gestureDetectorOnGestureListenerC2829ciI.k();
        }
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC2829ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void c(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.a = (byte) 0;
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.a(TAG2, "Ad load successful, providing callback");
        }
        this.d.post(new Runnable() { // from class: adsuki.tractor
            @Override // java.lang.Runnable
            public final void run() {
                C2864e2.b(this.f3711kowloon, info);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3039l1 f() {
        return q() ? this.l : this.m;
    }

    public final void h() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C2761a2 c2761a2;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "canScheduleRefresh " + this);
        }
        C2761a2 c2761a3 = this.m;
        if (c2761a3 == null) {
            return false;
        }
        byte b = c2761a3.b;
        if (b != 4 && b != 1 && b != 2 && ((c2761a2 = this.l) == null || c2761a2.b != 7)) {
            return true;
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.a(TAG2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "clear " + this);
        }
        t();
        C2761a2 c2761a2 = this.j;
        if (c2761a2 != null) {
            c2761a2.d();
        }
        this.j = null;
        C2761a2 c2761a3 = this.k;
        if (c2761a3 != null) {
            c2761a3.d();
        }
        this.k = null;
        this.f = null;
        this.l = null;
        this.m = null;
        this.b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "defaultRefreshInterval " + this);
        }
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F == null || (adConfig = abstractC3039l1F.c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.wireman(this.l, this.j);
        String TAG2 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Intrinsics.wireman(this.m, this.j);
        String TAG3 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        Intrinsics.wireman(this.l, this.k);
        String TAG4 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Intrinsics.wireman(this.m, this.k);
        String TAG5 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
        Objects.toString(this.j);
        String TAG6 = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        Objects.toString(this.k);
        C2761a2 c2761a2 = this.l;
        return c2761a2 != null && c2761a2.b == 7;
    }

    public final void m() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "pause " + this);
        }
        C2761a2 c2761a2 = this.l;
        if (c2761a2 != null) {
            c2761a2.W();
        }
    }

    public final void n() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        C2761a2 c2761a2 = this.j;
        if (c2761a2 != null) {
            c2761a2.Y();
        }
        C2761a2 c2761a3 = this.k;
        if (c2761a3 != null) {
            c2761a3.Y();
        }
    }

    public final void o() {
        C2761a2 c2761a2;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "render " + this);
        }
        C2761a2 c2761a3 = this.m;
        if (c2761a3 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.h, String.valueOf(c2761a3.l.a))) {
            PublisherCallbacks publisherCallbacks = this.c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2761a2 = this.m) != null) {
                c2761a2.d((byte) 1);
            }
            this.a = (byte) 8;
            c2761a3.Z();
        }
    }

    public final void p() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "resume " + this);
        }
        C2761a2 c2761a2 = this.l;
        if (c2761a2 != null) {
            c2761a2.X();
        }
    }

    public final boolean q() {
        C2761a2 c2761a2 = this.l;
        Byte bValueOf = c2761a2 != null ? Byte.valueOf(c2761a2.b) : null;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "submitAdShowFail " + this);
        }
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F != null) {
            abstractC3039l1F.d((short) 2239);
        }
    }

    public final void s() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "swapAdUnits " + this);
        }
        C2761a2 c2761a2 = this.l;
        if (c2761a2 == null) {
            this.l = this.j;
            this.m = this.k;
        } else if (Intrinsics.wireman(c2761a2, this.j)) {
            this.l = this.k;
            this.m = this.j;
        } else if (Intrinsics.wireman(c2761a2, this.k)) {
            this.l = this.j;
            this.m = this.k;
        }
    }

    public final void t() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        C2761a2 c2761a2 = this.j;
        if (c2761a2 != null) {
            c2761a2.b0();
        }
        C2761a2 c2761a3 = this.k;
        if (c2761a3 != null) {
            c2761a3.b0();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onAdFetchSuccess " + this);
        }
        this.e = info;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C2761a2 c2761a2 = this.m;
        if ((c2761a2 != null ? c2761a2.b(0) : null) == null) {
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3039l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C3097n9 c3097n11 = this.f;
        if (c3097n11 != null) {
            String TAG3 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3097n11.a(TAG3, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: adsuki.slumberous
            @Override // java.lang.Runnable
            public final void run() {
                C2864e2.a(this.f3670kowloon, info);
            }
        });
    }

    public final void a(InMobiBanner banner) {
        C3287v0 c3287v0;
        Intrinsics.checkNotNullParameter(banner, "banner");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "displayAd " + this);
        }
        C2761a2 c2761a2 = this.l;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = c2761a2 != null ? c2761a2.i() : null;
        if (gestureDetectorOnGestureListenerC2829ciI == null) {
            gestureDetectorOnGestureListenerC2829ciI = null;
        }
        if (gestureDetectorOnGestureListenerC2829ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC2829ciI.getViewableAd();
        C2761a2 c2761a3 = this.l;
        if (c2761a3 != null && (c3287v0 = c2761a3.l) != null && c3287v0.j) {
            gestureDetectorOnGestureListenerC2829ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC2829ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        C2761a2 c2761a4 = this.m;
        if (c2761a4 != null) {
            c2761a4.W();
        }
        C2761a2 c2761a5 = this.l;
        if (c2761a5 != null && c2761a5.b == 8) {
            View view = new View(banner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(-16777216);
            if (viewGroup == null) {
                banner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            banner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        C2761a2 c2761a6 = this.m;
        if (c2761a6 != null) {
            c2761a6.d();
        }
    }

    public static final void b(C2864e2 c2864e2, AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = c2864e2.f;
        if (c3097n9 != null) {
            String TAG = c2864e2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c2864e2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c2864e2.b((short) 2184);
        }
    }

    public final void b(short s) {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "submitAdLoadFailed " + this);
        }
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F != null) {
            abstractC3039l1F.c(s);
        }
    }

    public final int a(int i, int i2) {
        AdConfig adConfig;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "getRefreshInterval " + this);
        }
        C2761a2 c2761a2 = this.m;
        if (c2761a2 == null || (adConfig = c2761a2.c) == null) {
            return i2;
        }
        return i < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i;
    }

    public final void a(PublisherCallbacks callbacks, String adSize, boolean z) {
        C2761a2 c2761a2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "load 1 " + this);
        }
        if (Intrinsics.wireman(this.b, Boolean.FALSE)) {
            b(this.m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C2761a2 c2761a3 = this.m;
            if (c2761a3 != null) {
                c2761a3.b((short) 2006);
            }
            Kb.a((byte) 1, this.h, "Cannot call load() API after calling load(byte[])");
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.b = Boolean.TRUE;
        if (this.c == null) {
            this.c = callbacks;
        }
        C2761a2 c2761a4 = this.m;
        if (c2761a4 == null || !a(this.h, String.valueOf(c2761a4.l), callbacks) || (c2761a2 = this.m) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c2761a2.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                String TAG3 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c3097n11.d(TAG3, "AdManager state - LOADING");
            }
            this.a = (byte) 1;
            this.e = null;
            C2761a2 c2761a5 = this.m;
            Intrinsics.beachfront(c2761a5);
            c2761a5.c(adSize);
            C2761a2 c2761a6 = this.m;
            Intrinsics.beachfront(c2761a6);
            c2761a6.b(z);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(byte[] bArr, PublisherCallbacks callbacks) {
        C2761a2 c2761a2;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "load 2 " + this);
        }
        if (Intrinsics.wireman(this.b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                String TAG2 = this.i;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        this.c = callbacks;
        if (this.m != null) {
            C2761a2 c2761a3 = this.l;
            if ((c2761a3 == null || !c2761a3.B()) && (c2761a2 = this.m) != null && c2761a2.d((byte) 1)) {
                C3097n9 c3097n11 = this.f;
                if (c3097n11 != null) {
                    String TAG3 = this.i;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    c3097n11.a(TAG3, "timer started - load banner");
                }
                C2761a2 c2761a4 = this.m;
                if (c2761a4 != null) {
                    c2761a4.D();
                }
                C2761a2 c2761a5 = this.m;
                if (c2761a5 != null) {
                    c2761a5.a(bArr);
                }
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void a() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onAdDismissed " + this);
        }
        this.a = (byte) 0;
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.d(TAG2, "AdManager state - CREATED");
        }
        super.a();
    }

    public static final void a(C2864e2 c2864e2, AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = c2864e2.f;
        if (c3097n9 != null) {
            String TAG = c2864e2.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c2864e2.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3097n9 c3097n10 = c2864e2.f;
        if (c3097n10 != null) {
            String TAG2 = c2864e2.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(int i, final int i2, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        ViewParent parent;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            String TAG = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onShowNextPodAd " + this);
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            String TAG2 = this.i;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.a(TAG2, "on Show next pod ad index: " + i);
        }
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            try {
                parent = gestureDetectorOnGestureListenerC2829ci.getParent();
            } catch (Exception unused) {
                C2761a2 c2761a2 = this.l;
                if (c2761a2 != null) {
                    c2761a2.e(i2);
                }
                C2761a2 c2761a3 = this.l;
                if (c2761a3 != null) {
                    c2761a3.b(i2, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C2761a2 c2761a4 = this.l;
            if (c2761a4 != null) {
                c2761a4.b(i2, true);
            }
            b(inMobiBanner);
            this.d.post(new Runnable() { // from class: adsuki.nictation
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C2864e2.a(this.f3556kowloon, i2);
                }
            });
            return;
        }
        C2761a2 c2761a5 = this.l;
        if (c2761a5 != null) {
            c2761a5.e(i2);
        }
        C2761a2 c2761a6 = this.l;
        if (c2761a6 != null) {
            c2761a6.b(i2, false);
        }
    }

    public final void a(Context context, Jg pubSettings, String adSize) {
        String m10Context;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter("banner", "logType");
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Intrinsics.checkNotNullParameter("banner", "mAdType");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            m10Context = "activity";
        } else {
            m10Context = "others";
        }
        Intrinsics.checkNotNullParameter(m10Context, "m10Context");
        long j = pubSettings.a;
        String str3 = pubSettings.b;
        Map map = pubSettings.c;
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        boolean z = pubSettings.d;
        String str4 = pubSettings.g;
        String str5 = pubSettings.e;
        if (j != Long.MIN_VALUE) {
            if (map == null || (str = (String) map.get("tp")) == null) {
                str = "";
            }
            C3287v0 c3287v0 = new C3287v0(j, str, "banner", str4);
            c3287v0.d = str3;
            c3287v0.c = map;
            Intrinsics.checkNotNullParameter(adSize, "<set-?>");
            c3287v0.h = adSize;
            Intrinsics.checkNotNullParameter(m10Context, "<set-?>");
            c3287v0.i = m10Context;
            c3287v0.g = string;
            c3287v0.j = z;
            c3287v0.k = str5;
            String str6 = pubSettings.g;
            if (str6 != null) {
                C3097n9 c3097n9 = this.f;
                if (c3097n9 != null) {
                    c3097n9.a();
                }
                this.f = Jh.a("banner", str6);
            }
            C2761a2 c2761a2 = this.j;
            if (c2761a2 != null && this.k != null) {
                c2761a2.a(context, c3287v0, this);
                C2761a2 c2761a3 = this.k;
                if (c2761a3 != null) {
                    c2761a3.a(context, c3287v0, this);
                }
            } else {
                this.j = new C2761a2(context, c3287v0, this);
                C2761a2 c2761a4 = new C2761a2(context, c3287v0, this);
                this.k = c2761a4;
                this.m = this.j;
                this.l = c2761a4;
            }
            C3097n9 logger = this.f;
            if (logger != null) {
                C2761a2 c2761a5 = this.j;
                if (c2761a5 != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c2761a5.i = logger;
                    C2785b0 c2785b0 = c2761a5.u;
                    c2785b0.getClass();
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c2785b0.f = logger;
                }
                C2761a2 c2761a6 = this.k;
                if (c2761a6 != null) {
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c2761a6.i = logger;
                    C2785b0 c2785b1 = c2761a6.u;
                    c2785b1.getClass();
                    Intrinsics.checkNotNullParameter(logger, "logger");
                    c2785b1.f = logger;
                }
                C3097n9 c3097n10 = this.f;
                if (c3097n10 != null) {
                    String str7 = this.i;
                    str2 = "TAG";
                    Intrinsics.checkNotNullExpressionValue(str7, str2);
                    c3097n10.a(str7, "adding mBannerAdUnit1 to reference tracker");
                } else {
                    str2 = "TAG";
                }
                Ab ab = Jh.a;
                C2761a2 c2761a7 = this.j;
                Intrinsics.beachfront(c2761a7);
                Jh.a(c2761a7, this.f);
                C3097n9 c3097n11 = this.f;
                if (c3097n11 != null) {
                    String str8 = this.i;
                    Intrinsics.checkNotNullExpressionValue(str8, str2);
                    c3097n11.a(str8, "adding mBannerAdUnit2 to reference tracker");
                }
                C2761a2 c2761a8 = this.k;
                Intrinsics.beachfront(c2761a8);
                Jh.a(c2761a8, this.f);
            }
            WatermarkData watermarkData = this.g;
            if (watermarkData != null) {
                C2761a2 c2761a9 = this.j;
                if (c2761a9 != null) {
                    Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c2761a9.A = watermarkData;
                    GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ = c2761a9.q();
                    if (gestureDetectorOnGestureListenerC2829ciQ != null) {
                        gestureDetectorOnGestureListenerC2829ciQ.setWatermark(watermarkData);
                    }
                }
                C2761a2 c2761a10 = this.k;
                if (c2761a10 != null) {
                    Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                    c2761a10.A = watermarkData;
                    GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ2 = c2761a10.q();
                    if (gestureDetectorOnGestureListenerC2829ciQ2 != null) {
                        gestureDetectorOnGestureListenerC2829ciQ2.setWatermark(watermarkData);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(C2864e2 c2864e2, int i) throws JSONException {
        C2761a2 c2761a2 = c2864e2.l;
        if (c2761a2 != null) {
            c2761a2.a(i, false);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2761a2 c2761a2 = this.j;
        if (c2761a2 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2761a2.A = watermarkData;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ = c2761a2.q();
            if (gestureDetectorOnGestureListenerC2829ciQ != null) {
                gestureDetectorOnGestureListenerC2829ciQ.setWatermark(watermarkData);
            }
        }
        C2761a2 c2761a3 = this.k;
        if (c2761a3 != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2761a3.A = watermarkData;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ2 = c2761a3.q();
            if (gestureDetectorOnGestureListenerC2829ciQ2 != null) {
                gestureDetectorOnGestureListenerC2829ciQ2.setWatermark(watermarkData);
            }
        }
    }
}
