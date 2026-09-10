package com.inmobi.media;

import A.RunnableC0914v;
import A.RunnableC0915w;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class M1 extends S0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final String f22963N;
    public final String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f22964P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f22965Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final N1 f22966R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(Context context, Z placement, F0 f0) {
        super(context, placement, f0);
        Intrinsics.f(context, "context");
        Intrinsics.f(placement, "placement");
        this.f22963N = "M1";
        this.O = "InMobi";
        this.f22966R = new N1();
        placement.l();
        a(context, placement, f0);
    }

    public static final void c(M1 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.j;
        if (interfaceC3333z5 != null) {
            String TAG = this$0.f22963N;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "start loading html ad");
        }
        this$0.s0();
    }

    public static final void e(M1 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.Q() != 6) {
                if (this$0.Q() == 7) {
                    this$0.f22965Q++;
                    return;
                }
                return;
            }
            this$0.f22965Q++;
            this$0.d((byte) 7);
            InterfaceC3333z5 interfaceC3333z5 = this$0.j;
            if (interfaceC3333z5 != null) {
                String TAG = this$0.f22963N;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).d(TAG, "AdUnit " + this$0 + " state - ACTIVE");
            }
            InterfaceC3333z5 interfaceC3333z6 = this$0.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c(this$0.O, "Successfully displayed banner ad for placement Id : " + this$0.I());
            }
            F0 f0R = this$0.r();
            if (f0R != null) {
                this$0.d(f0R);
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z7 = this$0.j;
            if (interfaceC3333z7 != null) {
                String str = this$0.f22963N;
                ((A5) interfaceC3333z7).b(str, rf.a(e2, H6.a(str, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    public static final void f(M1 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.Q() == 4) {
                this$0.d((byte) 6);
                InterfaceC3333z5 interfaceC3333z5 = this$0.j;
                if (interfaceC3333z5 != null) {
                    String TAG = this$0.f22963N;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).d(TAG, "AdUnit " + this$0 + " state - RENDERED");
                }
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this$0.j;
            if (interfaceC3333z6 != null) {
                String str = this$0.f22963N;
                ((A5) interfaceC3333z6).b(str, rf.a(e2, H6.a(str, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    public static final void g(M1 this$0) {
        LinkedList<C3040h> linkedListF;
        Intrinsics.f(this$0, "this$0");
        if (this$0.b0()) {
            this$0.a(System.currentTimeMillis());
            C3312y0 c3312y0Y = this$0.y();
            if (c3312y0Y != null && (linkedListF = c3312y0Y.f()) != null) {
                int i2 = 0;
                for (Object obj : linkedListF) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.f0();
                        throw null;
                    }
                    this$0.B().add(Integer.valueOf(i2));
                    i2 = i3;
                }
            }
        }
        this$0.s0();
    }

    public boolean D0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "canProceedToLoad ", this));
        }
        if (f0()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG = this.f22963N;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).b(TAG, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == Q() || 2 == Q()) {
            AbstractC3048h7.a((byte) 1, this.O, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                String TAG2 = this.f22963N;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z7).b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == Q()) {
                a((short) 2008);
            } else {
                a((short) 2011);
            }
            return false;
        }
        if (7 == Q()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                String str2 = this.f22963N;
                StringBuilder sbA = H6.a(str2, "TAG", AbstractC3294we.j);
                sbA.append(I().l());
                ((A5) interfaceC3333z8).b(str2, sbA.toString());
            }
            return false;
        }
        InterfaceC3333z5 interfaceC3333z9 = this.j;
        if (interfaceC3333z9 != null) {
            ((A5) interfaceC3333z9).c(this.O, "Fetching a Banner ad for placement id: " + I());
        }
        e0();
        return true;
    }

    public final boolean E0() {
        return Q() == 7;
    }

    public final void F0() {
        Xe viewableAd;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "onPause ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            InterfaceC3295x interfaceC3295xK = k();
            Context contextT = t();
            if (interfaceC3295xK == null || contextT == null || (viewableAd = interfaceC3295xK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 1);
        }
    }

    public final void G0() {
        Xe viewableAd;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "onResume ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            InterfaceC3295x interfaceC3295xK = k();
            Context contextT = t();
            if (interfaceC3295xK == null || contextT == null || (viewableAd = interfaceC3295xK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 0);
        }
    }

    public final void H0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        if (contextT != null) {
            Uc.a(contextT, this);
        }
    }

    public final void I0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22963N;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (o0()) {
                return;
            }
            U0 u0S = s();
            u0S.getClass();
            u0S.g = SystemClock.elapsedRealtime();
            d0();
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0915w(this, 1));
            }
        } catch (IllegalStateException e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f22963N;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "Exception while loading ad.", e2);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.S0
    public final byte J() {
        return (byte) 0;
    }

    public final void J0() {
        Application application;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        Activity activity = contextT instanceof Activity ? (Activity) contextT : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.S0
    public void c0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "load ", this));
        }
        if (D0()) {
            super.c0();
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public synchronized void d(GestureDetectorOnGestureListenerC3005ec renderView) {
        try {
            Intrinsics.f(renderView, "renderView");
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String str = this.f22963N;
                ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "onAdScreenDismissed ", this));
            }
            super.d(renderView);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0915w(this, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.S0
    public boolean f0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 == null) {
            return false;
        }
        String str = this.f22963N;
        ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "missingPrerequisitesForAd ", this));
        return false;
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.AbstractC3037gc
    public void i(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.i(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new RunnableC0915w(this, 3));
        }
    }

    @Override // com.inmobi.media.S0
    public void j0() {
        if (p0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String TAG = this.f22963N;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "renderAd without internet check");
            }
            I0();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.f22963N;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "renderAd");
        }
        a(new K1(this), new L1(this));
    }

    @Override // com.inmobi.media.S0
    public final void m(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.m(gestureDetectorOnGestureListenerC3005ec);
        if (b0() && this.g.indexOf(gestureDetectorOnGestureListenerC3005ec) > 0 && Q() == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) this.g.get(A());
            if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                gestureDetectorOnGestureListenerC3005ec2.a(true);
                return;
            }
            return;
        }
        if (Q() != 2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String str2 = this.f22963N;
                StringBuilder sbA = H6.a(str2, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ");
                sbA.append((int) Q());
                ((A5) interfaceC3333z6).a(str2, sbA.toString());
                return;
            }
            return;
        }
        b((byte) 1);
        d((byte) 4);
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            String TAG = this.f22963N;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z7).d(TAG, "AdUnit " + this + " state - READY");
        }
        U0 u0S = s();
        u0S.getClass();
        u0S.f23246i = SystemClock.elapsedRealtime();
        u0();
        z0();
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c(this.O, "Successfully loaded Banner ad markup in the WebView for placement id: " + I());
        }
        F0 f0R = r();
        if (f0R != null) {
            f(f0R);
        } else {
            InterfaceC3333z5 interfaceC3333z9 = this.j;
            if (interfaceC3333z9 != null) {
                String TAG2 = this.f22963N;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z9).b(TAG2, "AdUnit listener is null");
            }
        }
        i();
    }

    @Override // com.inmobi.media.S0
    public void o(GestureDetectorOnGestureListenerC3005ec renderView) {
        int iIndexOf;
        Intrinsics.f(renderView, "renderView");
        if (b0() && (iIndexOf = this.g.indexOf(renderView)) > A() && renderView.f23571F != EnumC2991df.VISIBLE) {
            B().remove(Integer.valueOf(iIndexOf));
        } else {
            C0();
            super.o(renderView);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context contextT = t();
        if (Intrinsics.a(contextT, activity)) {
            Intrinsics.d(contextT, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextT).getApplication().unregisterActivityLifecycleCallbacks(this);
            g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityStarted ", this));
        }
        if (Intrinsics.a(t(), activity)) {
            G0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onActivityStopped ", this));
        }
        if (Intrinsics.a(t(), activity)) {
            F0();
        }
    }

    @Override // com.inmobi.media.S0
    public String q() {
        return "banner";
    }

    @Override // com.inmobi.media.S0
    public GestureDetectorOnGestureListenerC3005ec w() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "htmlAdContainer getter ", this));
        }
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecW = super.w();
        if (I().p() && gestureDetectorOnGestureListenerC3005ecW != null) {
            gestureDetectorOnGestureListenerC3005ecW.e();
        }
        return gestureDetectorOnGestureListenerC3005ecW;
    }

    @Override // com.inmobi.media.S0
    public void a(boolean z2, InMobiAdRequestStatus status) {
        F0 f0R;
        Intrinsics.f(status, "status");
        super.a(z2, status);
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c(this.O, "Banner ad fetch successful for placement id: " + I());
        }
        if (Q() != 2 || (f0R = r()) == null) {
            return;
        }
        e(f0R);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "closeAll ", this));
        }
    }

    public static final void d(M1 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.Q() == 7) {
                int i2 = this$0.f22965Q - 1;
                this$0.f22965Q = i2;
                if (i2 == 0) {
                    this$0.d((byte) 6);
                    F0 f0R = this$0.r();
                    if (f0R != null) {
                        f0R.b();
                    }
                }
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z5 = this$0.j;
            if (interfaceC3333z5 != null) {
                String str = this$0.f22963N;
                ((A5) interfaceC3333z5).b(str, rf.a(e2, H6.a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.S0
    public void g() {
        this.f22966R.f22996a = false;
        super.g();
    }

    @Override // com.inmobi.media.S0
    public final HashMap o() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).c(str, J1.a(str, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.f22964P ? "1" : "0");
        map.put("mk-ad-slot", I().a());
        return map;
    }

    public static final void a(M1 this$0, GestureDetectorOnGestureListenerC3005ec renderView, int i2) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        int iIndexOf = this$0.g.indexOf(renderView);
        try {
            F0 f0R = this$0.r();
            InterfaceC3333z5 interfaceC3333z5 = this$0.j;
            if (interfaceC3333z5 != null) {
                String TAG = this$0.f22963N;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "callback onShowNextPodAd");
            }
            if (f0R != null) {
                f0R.a(i2, iIndexOf, renderView);
            }
        } catch (Exception unused) {
            this$0.b(iIndexOf, false);
            this$0.g(iIndexOf);
        }
    }

    public final void e(boolean z2) {
        InterfaceC3333z5 interfaceC3333z5;
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z6).a(str, J1.a(str, "TAG", "load ", this));
        }
        if (z2 && (interfaceC3333z5 = this.j) != null) {
            ((A5) interfaceC3333z5).c(this.O, "Initiating Banner refresh for placement id: " + I());
        }
        this.f22964P = z2;
        c0();
    }

    @Override // com.inmobi.media.S0
    public final void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, short s) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.a(gestureDetectorOnGestureListenerC3005ec, s);
        if (b0()) {
            int iIndexOf = this.g.indexOf(gestureDetectorOnGestureListenerC3005ec);
            S0.a(this, iIndexOf, false, 2, null);
            if (iIndexOf > 0 && Q() == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) this.g.get(A());
                if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                    gestureDetectorOnGestureListenerC3005ec2.a(false);
                }
            }
        }
        if (Q() == 2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).c(this.O, "Failed to load the Banner markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public synchronized void e(GestureDetectorOnGestureListenerC3005ec renderView) {
        try {
            Intrinsics.f(renderView, "renderView");
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String str = this.f22963N;
                ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "onAdScreenDisplayed ", this));
            }
            super.e(renderView);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0915w(this, 4));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(String str) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str2 = this.f22963N;
            ((A5) interfaceC3333z5).c(str2, J1.a(str2, "TAG", "setAdSize ", this));
        }
        Z zI = I();
        Intrinsics.c(str);
        zI.a(str);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str = this.f22963N;
            ((A5) interfaceC3333z5).a(str, J1.a(str, "TAG", "loadPodAd ", this));
        }
        if (B().contains(Integer.valueOf(i2)) && i2 > this.g.indexOf(renderView)) {
            h(i2);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0915w(this, 0));
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String TAG = this.f22963N;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).a(TAG, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.g;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.a(false);
        }
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22963N;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "showPodAdAtIndex " + this + " index - " + i2);
        }
        if (!b0()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.f22963N;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.g;
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = (GestureDetectorOnGestureListenerC3005ec) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                gestureDetectorOnGestureListenerC3005ec2.b(false);
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            String TAG3 = this.f22963N;
            Intrinsics.e(TAG3, "TAG");
            ((A5) interfaceC3333z7).c(TAG3, "isInValidShowPodIndex " + i2 + ' ' + B() + ' ' + this.g.indexOf(renderView) + ' ' + this + ' ');
        }
        if (B().contains(Integer.valueOf(i2)) && i2 > this.g.indexOf(renderView) && this.g.get(i2) != null && ((gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(i2)) == null || gestureDetectorOnGestureListenerC3005ec.x0)) {
            super.a(i2, renderView, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0914v(this, renderView, i2, 0));
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            String TAG4 = this.f22963N;
            Intrinsics.e(TAG4, "TAG");
            ((A5) interfaceC3333z8).b(TAG4, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.g;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = (GestureDetectorOnGestureListenerC3005ec) arrayList2.get(arrayList2.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3005ec3 != null) {
            gestureDetectorOnGestureListenerC3005ec3.b(false);
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(D1 audioStatusInternal) {
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        F0 f0R = r();
        if (f0R != null) {
            f0R.a(audioStatusInternal);
        }
        N1 n1 = this.f22966R;
        n1.getClass();
        if (!n1.f22996a && audioStatusInternal == D1.f22756e) {
            n1.f22996a = true;
            C3269v5 c3269v5 = C3269v5.f24048c;
            c3269v5.f23148a = System.currentTimeMillis();
            c3269v5.f23149b++;
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public void a(boolean z2) {
        C3269v5 c3269v5 = C3269v5.f24048c;
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = C6.f22734b;
        C6 c6A = B6.a(contextD, "banner_audio_pref_file");
        int i2 = c6A.f22735a.getInt("user_mute_count", 0);
        C6.a(c6A, "user_mute_count", z2 ? Math.max(0, i2 - 1) : i2 + 1, false, 4, (Object) null);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.AbstractC3037gc
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, boolean z2) {
        Intrinsics.f(renderView, "renderView");
        super.a(renderView, z2);
        byte bQ = Q();
        short s = 2227;
        if (bQ != 4 && bQ != 6) {
            if (bQ == 7) {
                if (Q() == 7) {
                    s = z2 ? (short) 2224 : (short) 2223;
                }
                renderView.a(z2, s);
                return;
            }
            return;
        }
        byte bQ2 = Q();
        if (bQ2 == 4) {
            s = z2 ? (short) 2220 : (short) 2219;
        } else if (bQ2 == 6) {
            s = z2 ? (short) 2222 : (short) 2221;
        }
        m0();
        renderView.a(z2, s);
    }
}
