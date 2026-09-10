package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C2761a2;
import com.inmobi.media.EnumC2765a6;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2761a2 extends AbstractC3039l1 implements Application.ActivityLifecycleCallbacks {
    public final String F;
    public final String G;
    public boolean H;
    public int I;
    public final C2787b2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2761a2(Context context, C3287v0 placement, Dk dk) {
        super(context, placement, dk);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        String TAG = C2761a2.class.getSimpleName();
        this.F = TAG;
        this.G = "InMobi";
        this.J = new C2787b2();
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        long j = placement.a;
        a(context, placement, dk);
    }

    public static final void a(C2761a2 c2761a2, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, int i) {
        int iIndexOf = c2761a2.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
        try {
            AbstractC2915g1 abstractC2915g1M = c2761a2.m();
            C3097n9 c3097n9 = c2761a2.i;
            if (c3097n9 != null) {
                String TAG = c2761a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.c(TAG, "callback onShowNextPodAd");
            }
            if (abstractC2915g1M != null) {
                abstractC2915g1M.a(i, iIndexOf, gestureDetectorOnGestureListenerC2829ci);
            }
        } catch (Exception unused) {
            c2761a2.b(iIndexOf, false);
            c2761a2.e(iIndexOf);
        }
    }

    public static final void b(C2761a2 c2761a2) {
        try {
            if (c2761a2.b == 7) {
                int i = c2761a2.I - 1;
                c2761a2.I = i;
                if (i == 0) {
                    c2761a2.c((byte) 6);
                    AbstractC2915g1 abstractC2915g1M = c2761a2.m();
                    if (abstractC2915g1M != null) {
                        abstractC2915g1M.a();
                    }
                }
            }
        } catch (Exception e) {
            C3097n9 c3097n9 = c2761a2.i;
            if (c3097n9 != null) {
                String TAG = c2761a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.b(TAG, "BannerAdUnit.onAdScreenDismissed threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final void c(C2761a2 c2761a2) {
        try {
            byte b = c2761a2.b;
            if (b != 6) {
                if (b == 7) {
                    c2761a2.I++;
                    return;
                }
                return;
            }
            c2761a2.I++;
            c2761a2.c((byte) 7);
            C3097n9 c3097n9 = c2761a2.i;
            if (c3097n9 != null) {
                String TAG = c2761a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.d(TAG, "AdUnit " + c2761a2 + " state - ACTIVE");
            }
            C3097n9 c3097n10 = c2761a2.i;
            if (c3097n10 != null) {
                c3097n10.c(c2761a2.G, "Successfully displayed banner ad for placement Id : " + c2761a2.l);
            }
            AbstractC2915g1 abstractC2915g1M = c2761a2.m();
            if (abstractC2915g1M != null) {
                c2761a2.a(abstractC2915g1M);
            }
        } catch (Exception e) {
            C3097n9 c3097n11 = c2761a2.i;
            if (c3097n11 != null) {
                String TAG2 = c2761a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n11.b(TAG2, "BannerAdUnit.onAdScreenDisplayed threw unexpected error: " + e.getMessage());
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void C() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "load " + this);
        }
        if (V()) {
            super.C();
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final boolean E() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 == null) {
            return false;
        }
        String TAG = this.F;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        c3097n9.c(TAG, "missingPrerequisitesForAd " + this);
        return false;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void F() {
        AbstractC2915g1 abstractC2915g1M;
        super.F();
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            c3097n9.c(this.G, "Banner ad fetch successful for placement id: " + this.l);
        }
        if (!Intrinsics.wireman(s(), "html") && !Intrinsics.wireman(s(), "htmlUrl")) {
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 57);
        }
        if (this.b != 2 || (abstractC2915g1M = m()) == null) {
            return;
        }
        c(abstractC2915g1M);
    }

    public boolean V() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "canProceedToLoad " + this);
        }
        E();
        byte b = this.b;
        if (1 == b || 2 == b) {
            Kb.a((byte) 1, this.G, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == this.b) {
                b((short) 2008);
            } else {
                b((short) 2011);
            }
            return false;
        }
        if (7 != b) {
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                c3097n11.c(this.G, "Fetching a Banner ad for placement id: " + this.l);
            }
            D();
            return true;
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3097n12.b(TAG3, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.a);
        }
        return false;
    }

    public final void W() {
        Fn viewableAd;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "onPause " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC2829ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC2829ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 1);
        }
    }

    public final void X() {
        Fn viewableAd;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "onResume " + this);
        }
        byte b = this.b;
        if (b == 4 || b == 6 || b == 7) {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI = i();
            Context contextN = n();
            if (gestureDetectorOnGestureListenerC2829ciI == null || contextN == null || (viewableAd = gestureDetectorOnGestureListenerC2829ciI.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextN, (byte) 0);
        }
    }

    public final void Y() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "registerLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        if (contextN != null) {
            Ji.a(contextN, this);
        }
    }

    public final void Z() {
        AdConfig adConfig;
        if (Intrinsics.wireman(this.l.f, "AB") && (adConfig = this.c) != null && adConfig.getSkipNetCheckHB()) {
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.a(TAG, "renderAd without internet check");
            }
            a0();
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.a(TAG2, "renderAd");
        }
        a(new Function0() { // from class: adsuki.iconoclasm
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2761a2.e(this.f3475kowloon);
            }
        }, new Function1() { // from class: adsuki.premed
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2761a2.a(this.f3607kowloon, (EnumC2765a6) obj);
            }
        });
    }

    public final void a0() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (M()) {
                return;
            }
            C3188r1 c3188r1 = this.z;
            c3188r1.getClass();
            c3188r1.g = SystemClock.elapsedRealtime();
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.montera
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2761a2.f(this.f3545kowloon);
                    }
                });
            }
        } catch (IllegalStateException e) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.a(TAG2, "Exception while loading ad.", e);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void b0() {
        Application application;
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "unregisterLifeCycleCallbacks " + this);
        }
        Context contextN = n();
        Activity activity = contextN instanceof Activity ? (Activity) contextN : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void d() {
        this.J.a = false;
        super.d();
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final synchronized void e(GestureDetectorOnGestureListenerC2829ci renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.a(TAG, "onAdScreenDismissed " + this);
            }
            super.e(renderView);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.goonda
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2761a2.b(this.f3448kowloon);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final synchronized void f(GestureDetectorOnGestureListenerC2829ci renderView) {
        try {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            C3097n9 c3097n9 = this.i;
            if (c3097n9 != null) {
                String TAG = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                c3097n9.a(TAG, "onAdScreenDisplayed " + this);
            }
            super.f(renderView);
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.notornis
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2761a2.c(this.f3560kowloon);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.AbstractC2880ei
    public void j(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onRenderViewVisible " + this);
        }
        super.j(renderView);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.ferrovanadium
                @Override // java.lang.Runnable
                public final void run() {
                    C2761a2.d(this.f3438kowloon);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final HashMap k() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "adSpecificRequestParams getter " + this);
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.H ? "1" : "0");
        map.put("mk-ad-slot", this.l.h);
        return map;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public String l() {
        return "banner";
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void o(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "handleRenderViewSignaledAdReady " + this);
        }
        super.o(gestureDetectorOnGestureListenerC2829ci);
        if (this.s && this.h.indexOf(gestureDetectorOnGestureListenerC2829ci) > 0 && this.b == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.p);
            if (gestureDetectorOnGestureListenerC2829ci2 != null) {
                gestureDetectorOnGestureListenerC2829ci2.a(true);
                return;
            }
            return;
        }
        if (this.b != 2) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.a(TAG2, "AdUnit is not in available state, ignoring the ad ready signal - " + ((int) this.b));
                return;
            }
            return;
        }
        b((byte) 1);
        c((byte) 4);
        C3097n9 c3097n11 = this.i;
        if (c3097n11 != null) {
            String TAG3 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c3097n11.d(TAG3, "AdUnit " + this + " state - READY");
        }
        C3188r1 c3188r1 = this.z;
        c3188r1.getClass();
        c3188r1.i = SystemClock.elapsedRealtime();
        P();
        S();
        C3097n9 c3097n12 = this.i;
        if (c3097n12 != null) {
            c3097n12.c(this.G, "Successfully loaded Banner ad markup in the WebView for placement id: " + this.l);
        }
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            d(abstractC2915g1M);
        } else {
            C3097n9 c3097n13 = this.i;
            if (c3097n13 != null) {
                String TAG4 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                c3097n13.b(TAG4, "AdUnit listener is null");
            }
        }
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityCreated " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityDestroyed " + this);
        }
        Context contextN = n();
        if (Intrinsics.wireman(contextN, activity)) {
            Intrinsics.competently(contextN, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextN).getApplication().unregisterActivityLifecycleCallbacks(this);
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityPaused " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityResumed " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivitySaveInstanceState " + this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityStarted " + this);
        }
        if (Intrinsics.wireman(n(), activity)) {
            X();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "onActivityStopped " + this);
        }
        if (Intrinsics.wireman(n(), activity)) {
            W();
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final GestureDetectorOnGestureListenerC2829ci q() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "htmlAdContainer getter " + this);
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (this.h.size() <= 0 || this.p >= this.h.size()) ? null : (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.p);
        if (this.l.j && gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.k();
        }
        return gestureDetectorOnGestureListenerC2829ci;
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final byte t() {
        return (byte) 0;
    }

    public static final void d(C2761a2 c2761a2) {
        try {
            if (c2761a2.b == 4) {
                c2761a2.c((byte) 6);
                C3097n9 c3097n9 = c2761a2.i;
                if (c3097n9 != null) {
                    String TAG = c2761a2.F;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    c3097n9.d(TAG, "AdUnit " + c2761a2 + " state - RENDERED");
                }
            }
        } catch (Exception e) {
            C3097n9 c3097n10 = c2761a2.i;
            if (c3097n10 != null) {
                String TAG2 = c2761a2.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "BannerAdUnit.onRenderViewVisible threw unexpected error: " + e.getMessage());
            }
        }
    }

    public static final Unit e(C2761a2 c2761a2) {
        C3097n9 c3097n9 = c2761a2.i;
        if (c3097n9 != null) {
            String TAG = c2761a2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "loadWithRetry success");
        }
        c2761a2.a0();
        return Unit.f29295attabal;
    }

    public static final void f(C2761a2 c2761a2) {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        if (c2761a2.s) {
            c2761a2.q = System.currentTimeMillis();
            AdSet adSetR = c2761a2.r();
            if (adSetR != null && (ads = adSetR.getAds()) != null) {
                int i = 0;
                for (Object obj : ads) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    c2761a2.r.add(Integer.valueOf(i));
                    i = i2;
                }
            }
        }
        c2761a2.N();
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void q(GestureDetectorOnGestureListenerC2829ci renderView) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (this.s && (iIndexOf = this.h.indexOf(renderView)) > this.p && renderView.I != Hn.VISIBLE) {
            this.r.remove(Integer.valueOf(iIndexOf));
        } else {
            U();
            super.q(renderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3039l1
    public final void a(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, short s) throws JSONException {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "handleRenderViewSignaledAdFailed " + this);
        }
        super.a(gestureDetectorOnGestureListenerC2829ci, s);
        if (this.s) {
            int iIndexOf = this.h.indexOf(gestureDetectorOnGestureListenerC2829ci);
            a(iIndexOf, true);
            if (iIndexOf > 0 && this.b == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) this.h.get(this.p);
                if (gestureDetectorOnGestureListenerC2829ci2 != null) {
                    gestureDetectorOnGestureListenerC2829ci2.a(false);
                }
            }
        }
        if (this.b == 2) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                c3097n10.c(this.G, "Failed to load the Banner markup in the WebView for placement id: " + this.l);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.InterfaceC3312w0
    public final void b() {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "closeAll " + this);
        }
    }

    public final boolean b(int i, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "isInValidShowPodIndex " + i + " " + this.r + " " + this.h.indexOf(gestureDetectorOnGestureListenerC2829ci) + " " + this + " ");
        }
        if (!this.r.contains(Integer.valueOf(i)) || i <= this.h.indexOf(gestureDetectorOnGestureListenerC2829ci) || this.h.get(i) == null) {
            return true;
        }
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) this.h.get(i);
        return (gestureDetectorOnGestureListenerC2829ci2 == null || gestureDetectorOnGestureListenerC2829ci2.B0) ? false : true;
    }

    public final void c(String str) {
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.c(TAG, "setAdSize " + this);
        }
        C3287v0 c3287v0 = this.l;
        Intrinsics.beachfront(str);
        c3287v0.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        c3287v0.h = str;
    }

    public final void b(boolean z) {
        C3097n9 c3097n9;
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n10.a(TAG, "load " + this);
        }
        if (z && (c3097n9 = this.i) != null) {
            c3097n9.c(this.G, "Initiating Banner refresh for placement id: " + this.l);
        }
        this.H = z;
        C();
    }

    @Override // com.inmobi.media.InterfaceC3312w0
    public final void a(int i, GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "loadPodAd " + this);
        }
        if (this.r.contains(Integer.valueOf(i)) && i > this.h.indexOf(renderView)) {
            this.o = i;
            Handler handler = this.j;
            if (handler != null) {
                handler.post(new Runnable() { // from class: adsuki.earstone
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2761a2.a(this.f3416kowloon);
                    }
                });
                return;
            }
            return;
        }
        C3097n9 c3097n10 = this.i;
        if (c3097n10 != null) {
            String TAG2 = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            c3097n10.a(TAG2, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.h;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC2829ci != null) {
            gestureDetectorOnGestureListenerC2829ci.a(false);
        }
    }

    public static final void a(C2761a2 c2761a2) {
        C3097n9 c3097n9 = c2761a2.i;
        if (c3097n9 != null) {
            String TAG = c2761a2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "start loading html ad");
        }
        c2761a2.N();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    public static final Unit a(C2761a2 c2761a2, EnumC2765a6 errorCode) {
        short s;
        Intrinsics.checkNotNullParameter(errorCode, "it");
        C3097n9 c3097n9 = c2761a2.i;
        if (c3097n9 != null) {
            String TAG = c2761a2.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.b(TAG, "loadWithRetry error - " + errorCode);
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        int iOrdinal = errorCode.ordinal();
        if (iOrdinal == 0) {
            s = 2122;
        } else if (iOrdinal != 21) {
            switch (iOrdinal) {
                case 12:
                    s = 2123;
                    break;
                case 13:
                    s = 2124;
                    break;
                case 14:
                    s = 2125;
                    break;
                case 15:
                    s = 2126;
                    break;
                case 16:
                    s = 2127;
                    break;
                default:
                    s = 2122;
                    break;
            }
        } else {
            s = 2229;
        }
        c2761a2.a(inMobiAdRequestStatus, true, s);
        return Unit.f29295attabal;
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.InterfaceC3312w0
    public final void a(final int i, final GestureDetectorOnGestureListenerC2829ci renderView, Context context) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C3097n9 c3097n9 = this.i;
        if (c3097n9 != null) {
            String TAG = this.F;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c3097n9.a(TAG, "showPodAdAtIndex " + this + " index - " + i);
        }
        if (!this.s) {
            C3097n9 c3097n10 = this.i;
            if (c3097n10 != null) {
                String TAG2 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c3097n10.b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.h;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC2829ci != null) {
                gestureDetectorOnGestureListenerC2829ci.b(false);
                return;
            }
            return;
        }
        if (b(i, renderView)) {
            C3097n9 c3097n11 = this.i;
            if (c3097n11 != null) {
                String TAG3 = this.F;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c3097n11.b(TAG3, "Cannot show an pod ad with invalid index passed");
            }
            ArrayList arrayList2 = this.h;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) arrayList2.get(arrayList2.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC2829ci2 != null) {
                gestureDetectorOnGestureListenerC2829ci2.b(false);
                return;
            }
            return;
        }
        super.a(i, renderView, context);
        Handler handler = this.j;
        if (handler != null) {
            handler.post(new Runnable() { // from class: adsuki.weimar
                @Override // java.lang.Runnable
                public final void run() {
                    C2761a2.a(this.f3740kowloon, renderView, i);
                }
            });
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public void a(V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC2915g1 abstractC2915g1M = m();
        if (abstractC2915g1M != null) {
            abstractC2915g1M.a(audioStatusInternal);
        }
        C2787b2 c2787b2 = this.J;
        c2787b2.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!c2787b2.a && audioStatusInternal == V1.e) {
            c2787b2.a = true;
            W8 w8 = W8.c;
            w8.a = System.currentTimeMillis();
            w8.b++;
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public void a(boolean z) {
        W8 w8 = W8.c;
        Context context = Ji.a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.b;
        Ea eaA = Da.a(context, "banner_audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
        int i = eaA.a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }

    @Override // com.inmobi.media.AbstractC3039l1, com.inmobi.media.AbstractC2880ei
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        super.a(renderView, z);
        byte b = this.b;
        short s = 2227;
        if (b != 4 && b != 6) {
            if (b == 7) {
                if (b == 7) {
                    s = z ? (short) 2224 : (short) 2223;
                }
                renderView.a(z, s);
                return;
            }
            return;
        }
        if (b == 4) {
            s = z ? (short) 2220 : (short) 2219;
        } else if (b == 6) {
            s = z ? (short) 2222 : (short) 2221;
        }
        J();
        renderView.a(z, s);
    }
}
