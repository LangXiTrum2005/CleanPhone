package com.inmobi.media;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.vungle.ads.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public class T7 implements InterfaceC3295x, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f23201A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f23202B;
    public T7 C;
    public boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C2984d8 f23203E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f23204F;
    public Intent G;
    public GestureDetectorOnGestureListenerC3005ec H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3005ec f23205I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public T7 f23206J;
    public byte K;
    public S7 L;
    public final A M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final P7 f23207N;
    public final L7 O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Q7 f23208P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final K7 f23209Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public LinkedHashMap f23210R;
    public final String S;
    public final O7 T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f23211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3177p8 f23212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23213c;
    public final Set d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23214e;
    public final boolean f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2996e3 f23215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S6 f23216i;
    public final InterfaceC3333z5 j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R7 f23217l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashSet f23218n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public We f23219p;
    public D8 q;
    public boolean r;
    public final AdConfig s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23220u;
    public T7 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public P0 f23221w;
    public WeakReference x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public WeakReference f23222z;

    public T7(Context context, byte b2, C3177p8 mNativeDataModel, String impressionId, Set set, AdConfig adConfig, long j, boolean z2, String creativeId, C2996e3 c2996e3, S6 s6, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        Intrinsics.f(mNativeDataModel, "mNativeDataModel");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(adConfig, "adConfig");
        Intrinsics.f(creativeId, "creativeId");
        this.f23211a = b2;
        this.f23212b = mNativeDataModel;
        this.f23213c = impressionId;
        this.d = set;
        this.f23214e = j;
        this.f = z2;
        this.g = creativeId;
        this.f23215h = c2996e3;
        this.f23216i = s6;
        this.j = interfaceC3333z5;
        this.k = LazyKt.b(N7.f23004a);
        this.f23217l = new R7(this);
        this.m = "T7";
        this.f23218n = new HashSet();
        this.o = new ArrayList();
        this.s = adConfig;
        this.v = this;
        this.x = new WeakReference(null);
        this.y = -1;
        this.f23207N = new P7(this);
        this.O = new L7(this);
        this.f23208P = new Q7(this);
        this.f23209Q = new K7(this);
        this.x = new WeakReference(context);
        Uc.a(context, this);
        C3049h8 c3049h8 = mNativeDataModel.f23886e;
        if (c3049h8 != null) {
            c3049h8.y = System.currentTimeMillis();
        }
        this.K = (byte) -1;
        this.M = A.f22668a;
        new Handler(Looper.getMainLooper()).post(new A.G(this, 1));
        this.S = "native";
        this.T = new O7(this);
    }

    public final C2984d8 a(C3177p8 c3177p8, C2984d8 asset) {
        Intrinsics.f(asset, "asset");
        if (c3177p8 == null) {
            return null;
        }
        String str = asset.f23517h;
        if (str.length() == 0) {
            asset.k = (byte) 0;
            return asset;
        }
        String[] strArr = (String[]) new Regex("\\|").f(str, 0).toArray(new String[0]);
        if (strArr.length == 1) {
            asset.k = a(strArr[0]);
            return asset;
        }
        C2984d8 c2984d8M = c3177p8.m(strArr[0]);
        if (c2984d8M == null) {
            return a(c3177p8.g, asset);
        }
        if (c2984d8M.equals(asset)) {
            return null;
        }
        c2984d8M.k = a(strArr[1]);
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String str2 = this.m;
            ((A5) interfaceC3333z5).a(str2, androidx.media3.extractor.text.ttml.a.p(H6.a(str2, "TAG", "Referenced asset ("), c2984d8M.f23514b, ')'));
        }
        return c2984d8M;
    }

    public final C2984d8 b(C3177p8 c3177p8, C2984d8 c2984d8) {
        InterfaceC3333z5 interfaceC3333z5;
        if (c3177p8 == null) {
            return null;
        }
        String str = c2984d8.f23521p;
        String str2 = c2984d8.q;
        C2984d8 c2984d8A = a(c2984d8, c3177p8, str);
        if (c2984d8A == null) {
            c2984d8A = a(c2984d8, c3177p8, str2);
        }
        if (c2984d8A != null && (interfaceC3333z5 = this.j) != null) {
            String str3 = this.m;
            ((A5) interfaceC3333z5).a(str3, androidx.media3.extractor.text.ttml.a.p(H6.a(str3, "TAG", "Referenced asset ("), c2984d8A.f23514b, ')'));
        }
        return c2984d8A;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final boolean c() {
        return this.t;
    }

    public final Context d() {
        Activity activityF = f();
        return activityF != null ? activityF : (Context) this.x.get();
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final void e() {
    }

    public final Activity f() {
        WeakReference weakReference = this.f23222z;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final View g() {
        We we = this.f23219p;
        if (we != null) {
            return we.b();
        }
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final AdConfig getAdConfig() {
        return this.s;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final String getAdType() {
        return this.S;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getCreativeId() {
        return this.g;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final Object getDataModel() {
        return this.f23212b;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public InterfaceC3279w getFullScreenEventsListener() {
        return this.f23207N;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public String getImpressionId() {
        return this.f23213c;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final String getMarkupType() {
        return "inmobiJson";
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final byte getPlacementType() {
        return this.f23211a;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public View getVideoContainerView() {
        return null;
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public Xe getViewableAd() {
        Context contextJ = j();
        if (this.f23219p == null && contextJ != null) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String TAG = this.m;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "fireLoadedAndServedBeacons");
            }
            C3049h8 c3049h8 = this.f23212b.f23886e;
            if (c3049h8 != null) {
                HashMap mapA = a(c3049h8);
                a((byte) 1, mapA);
                a((byte) 2, mapA);
            }
            this.f23219p = new M5(contextJ, this, new C2957bf(this, this.H, this.j), this.j);
            Set<C3199qe> set = this.d;
            if (set != null) {
                for (C3199qe c3199qe : set) {
                    try {
                        if (c3199qe.f23940a == 3) {
                            InterfaceC3333z5 interfaceC3333z6 = this.j;
                            if (interfaceC3333z6 != null) {
                                String TAG2 = this.m;
                                Intrinsics.e(TAG2, "TAG");
                                ((A5) interfaceC3333z6).a(TAG2, "OMID tracker");
                            }
                            Object obj = c3199qe.f23941b.get("omidAdSession");
                            C3035ga c3035ga = obj instanceof C3035ga ? (C3035ga) obj : null;
                            We we = this.f23219p;
                            if (c3035ga == null || we == null) {
                                InterfaceC3333z5 interfaceC3333z7 = this.j;
                                if (interfaceC3333z7 != null) {
                                    String TAG3 = this.m;
                                    Intrinsics.e(TAG3, "TAG");
                                    ((A5) interfaceC3333z7).b(TAG3, "Did not find a OMID ad session; the OMID decorator will not be applied.");
                                }
                            } else {
                                this.f23219p = this.K == 0 ? new C3099ka(this, we, c3035ga, this.j) : new C3115la(this, we, c3035ga, this.j);
                            }
                        }
                    } catch (Exception e2) {
                        InterfaceC3333z5 interfaceC3333z8 = this.j;
                        if (interfaceC3333z8 != null) {
                            String str = this.m;
                            ((A5) interfaceC3333z8).b(str, rf.a(e2, H6.a(str, "TAG", "Exception occurred while creating the Display viewable ad : ")));
                        }
                        S5 s5 = S5.f23167a;
                        S5.d.a(AbstractC3285w5.a(e2, "event"));
                    }
                }
            }
        }
        return this.f23219p;
    }

    public final D8 h() {
        We we = this.f23219p;
        C3304x8 c3304x8C = we != null ? we.c() : null;
        C3304x8 c3304x8 = c3304x8C != null ? c3304x8C : null;
        if (c3304x8 != null) {
            this.q = c3304x8.f24102e;
        }
        return this.q;
    }

    public ef i() {
        return this.T;
    }

    public final Context j() {
        return (1 == this.f23211a || k()) ? f() : (Context) this.x.get();
    }

    public boolean k() {
        return this.f23211a == 0 && f() != null;
    }

    public void l() {
        We we;
        C2943b1 c2943b1;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, com.ironsource.d9.h.t0);
        }
        this.f23220u = true;
        T8 t8A = a(g());
        if (t8A != null) {
            t8A.b();
        }
        D8 d8H = h();
        if (d8H != null && (c2943b1 = d8H.f22772l) != null) {
            c2943b1.a();
        }
        Context contextD = d();
        if (contextD == null || (we = this.f23219p) == null) {
            return;
        }
        we.a(contextD, (byte) 1);
    }

    public final void m() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "reportFirstPageRendered");
        }
        C3049h8 c3049h8B = this.f23212b.b(0);
        if (this.f23218n.contains(0) || c3049h8B == null || this.t) {
            return;
        }
        this.f23218n.add(0);
        c3049h8B.y = System.currentTimeMillis();
        if (!this.r) {
            this.o.add(c3049h8B);
            return;
        }
        HashMap mapA = a(c3049h8B);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.m;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "Page-view impression record request");
        }
        c3049h8B.a("page_view", mapA, (L7) null, this.j);
    }

    public boolean n() {
        return false;
    }

    public final void o() {
        new Handler(Looper.getMainLooper()).post(new A.G(this, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onActivityDestroyed");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a(activity, (byte) 2);
        }
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            c2996e3.b();
        }
        Context context = (Context) this.x.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        We we;
        Intrinsics.f(activity, "activity");
        if (Intrinsics.a(d(), activity)) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String TAG = this.m;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, com.ironsource.d9.h.u0);
            }
            this.f23220u = false;
            T8 t8A = a(g());
            if (t8A != null) {
                t8A.c();
            }
            p();
            Context contextD = d();
            if (contextD == null || (we = this.f23219p) == null) {
                return;
            }
            we.a(contextD, (byte) 0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
        if (Intrinsics.a(d(), activity)) {
            l();
        }
    }

    public final void p() {
        C2943b1 c2943b1;
        D8 d8H = h();
        if (d8H == null || (c2943b1 = d8H.f22772l) == null || c2943b1.f23459c) {
            return;
        }
        c2943b1.f23459c = true;
        c2943b1.a(c2943b1.f23458b);
    }

    public final void q() {
        P0 p0;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "unlockRewards");
        }
        if (n()) {
            this.f23201A = true;
            HashMap map = this.f23212b.f23887h;
            if (map == null || (p0 = this.f23221w) == null) {
                return;
            }
            InterfaceC3333z5 interfaceC3333z6 = p0.f23058a.j;
            if (interfaceC3333z6 != null) {
                String strE = S0.e();
                Intrinsics.e(strE, "<get-TAG>(...)");
                ((A5) interfaceC3333z6).a(strE, "onAdRewardsUnlocked");
            }
            if (p0.f23058a.Z()) {
                return;
            }
            F0 f0 = (F0) p0.f23059b.get();
            if (f0 != null) {
                f0.b(new HashMap(map));
                return;
            }
            InterfaceC3333z5 interfaceC3333z7 = p0.f23058a.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("InMobi", "Listener was garbage collected.Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final void setFullScreenActivityContext(Activity activity) {
        this.f23222z = new WeakReference(activity);
    }

    public static final void d(T7 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f23201A = true;
        this$0.b((C2984d8) null);
    }

    public void c(C2984d8 asset) {
        T8 t8A;
        ValueAnimator valueAnimator;
        Intrinsics.f(asset, "asset");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "triggerAssetAction");
        }
        byte b2 = asset.k;
        if (b2 == 0 || b2 == 5) {
            return;
        }
        if (b2 == 2) {
            this.f23201A = true;
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.H;
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                InterfaceC3333z5 interfaceC3333z6 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                if (interfaceC3333z6 != null) {
                    String TAG2 = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).a(TAG2, "skipToInterActive");
                }
                gestureDetectorOnGestureListenerC3005ec.c("window.imraid.broadcastEvent('skip');");
            }
            T8 t8A2 = a(g());
            if (t8A2 != null) {
                t8A2.b();
            }
            b(asset);
            C2996e3 c2996e3 = this.f23215h;
            if (c2996e3 == null || c2996e3.g.get()) {
                return;
            }
            c2996e3.d.f23686h = 1;
            Intrinsics.c(c2996e3.f23543c);
            return;
        }
        if (b2 == 3) {
            try {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.H;
                if (gestureDetectorOnGestureListenerC3005ec2 != null) {
                    InterfaceC3333z5 interfaceC3333z7 = gestureDetectorOnGestureListenerC3005ec2.f23587i;
                    if (interfaceC3333z7 != null) {
                        String TAG3 = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG3, "TAG");
                        ((A5) interfaceC3333z7).a(TAG3, "replayToInterActive");
                    }
                    gestureDetectorOnGestureListenerC3005ec2.c("window.imraid.broadcastEvent('replay');");
                }
                View viewG = g();
                if (viewG != null) {
                    ViewParent parent = viewG.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(viewG);
                    }
                }
                T7 t7 = this.v;
                T7 t8 = t7 != null ? t7 : null;
                if (t8 != null && (t8A = a(t8.g())) != null && (valueAnimator = t8A.f23230n) != null && valueAnimator.isRunning()) {
                    valueAnimator.setCurrentPlayTime(t8A.f * ((long) 1000));
                    t8A.f23229l = 360 * 1.0f;
                    t8A.invalidate();
                }
                if (!"VIDEO".equals(asset.f23515c)) {
                    InterfaceC3333z5 interfaceC3333z8 = this.j;
                    if (interfaceC3333z8 != null) {
                        String TAG4 = this.m;
                        Intrinsics.e(TAG4, "TAG");
                        ((A5) interfaceC3333z8).b(TAG4, "Action 3 not valid for asset of type: " + asset.f23515c);
                        return;
                    }
                    return;
                }
                if (t7 instanceof C2934a9) {
                    View videoContainerView = ((C2934a9) t7).getVideoContainerView();
                    C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                    if (c3130m9 != null) {
                        C3114l9 videoView = c3130m9.getVideoView();
                        Object tag = videoView.getTag();
                        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
                        if (c2968c9 != null) {
                            if (c2968c9.c()) {
                                videoView.k();
                            } else {
                                videoView.c();
                            }
                        } else if (1 == this.f23211a) {
                            videoView.k();
                        } else {
                            videoView.c();
                        }
                        if (c2968c9 != null) {
                            a(c2968c9);
                        }
                        videoView.start();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z9 = this.j;
                if (interfaceC3333z9 != null) {
                    String str = this.m;
                    ((A5) interfaceC3333z9).b(str, rf.a(e2, H6.a(str, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                }
                AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                return;
            }
        }
        if (b2 == 1) {
            try {
                GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this.H;
                if (gestureDetectorOnGestureListenerC3005ec3 != null) {
                    InterfaceC3333z5 interfaceC3333z10 = gestureDetectorOnGestureListenerC3005ec3.f23587i;
                    if (interfaceC3333z10 != null) {
                        String TAG5 = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG5, "TAG");
                        ((A5) interfaceC3333z10).a(TAG5, "closeToInterActive");
                    }
                    gestureDetectorOnGestureListenerC3005ec3.c("window.imraid.broadcastEvent('close');");
                }
                a();
                return;
            } catch (Exception e3) {
                InterfaceC3333z5 interfaceC3333z11 = this.j;
                if (interfaceC3333z11 != null) {
                    String str2 = this.m;
                    ((A5) interfaceC3333z11).b(str2, rf.a(e3, H6.a(str2, "TAG", "Encountered unexpected error in handling exit action on video: ")));
                }
                AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                S5 s6 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e3, "event"));
                return;
            }
        }
        if (b2 != 4) {
            this.f23201A = true;
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec4 = this.H;
            if (gestureDetectorOnGestureListenerC3005ec4 != null) {
                InterfaceC3333z5 interfaceC3333z12 = gestureDetectorOnGestureListenerC3005ec4.f23587i;
                if (interfaceC3333z12 != null) {
                    String TAG6 = GestureDetectorOnGestureListenerC3005ec.a1;
                    Intrinsics.e(TAG6, "TAG");
                    ((A5) interfaceC3333z12).a(TAG6, "skipToInterActive");
                }
                gestureDetectorOnGestureListenerC3005ec4.c("window.imraid.broadcastEvent('skip');");
            }
            T8 t8A3 = a(g());
            if (t8A3 != null) {
                t8A3.b();
            }
            b(asset);
            return;
        }
        try {
            if (this.f23211a == 0) {
                InterfaceC3333z5 interfaceC3333z13 = this.j;
                if (interfaceC3333z13 != null) {
                    String TAG7 = this.m;
                    Intrinsics.e(TAG7, "TAG");
                    ((A5) interfaceC3333z13).c(TAG7, "launchFullscreen");
                }
                T7 t7C = c(this);
                if (t7C == null) {
                    return;
                }
                P0 p0 = t7C.f23221w;
                if (p0 != null) {
                    p0.e();
                }
                A a2 = this.M;
                int iHashCode = hashCode();
                M7 m7 = new M7(this, t7C);
                a2.getClass();
                A.a(iHashCode, m7);
            }
        } catch (Exception e4) {
            InterfaceC3333z5 interfaceC3333z14 = this.j;
            if (interfaceC3333z14 != null) {
                String str3 = this.m;
                ((A5) interfaceC3333z14).b(str3, rf.a(e4, H6.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action ")));
            }
            AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
            S5 s7 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e4, "event"));
        }
    }

    public void b(View view) {
        P0 p0;
        if (this.r || this.t) {
            return;
        }
        this.r = true;
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            c2996e3.a();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "A viewable impression is reported on ad view.");
        }
        C3049h8 c3049h8 = this.f23212b.f23886e;
        if (c3049h8 != null) {
            c3049h8.a("Impression", a(c3049h8), this.O, this.j);
        }
        m();
        for (C2984d8 c2984d8 : this.o) {
            HashMap mapA = a(c2984d8);
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.m;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "Page-view impression record request");
            }
            c2984d8.a("page_view", mapA, (L7) null, this.j);
        }
        this.o.clear();
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 0);
        }
        T7 t7C = c(this);
        if (t7C == null || (p0 = t7C.f23221w) == null) {
            return;
        }
        p0.f();
    }

    public final void a(Context context) {
        this.x = new WeakReference(context);
        Uc.a(context, this);
    }

    public static final void a(T7 this$0) {
        Intrinsics.f(this$0, "this$0");
        A a2 = this$0.M;
        int iHashCode = this$0.hashCode();
        Q7 q7 = this$0.f23208P;
        a2.getClass();
        A.a(iHashCode, q7);
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public final void a(byte b2, Map map) {
        C3049h8 c3049h8;
        if (this.t || b2 == 0 || b2 == 3) {
            return;
        }
        if (b2 == 1) {
            C3049h8 c3049h9 = this.f23212b.f23886e;
            if (c3049h9 != null) {
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    String TAG = this.m;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "reportAdLoad");
                }
                c3049h9.a("load", (HashMap) map, (L7) null, this.j);
                return;
            }
            return;
        }
        if (b2 != 2 || (c3049h8 = this.f23212b.f23886e) == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.m;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).a(TAG2, "reportAdServed");
        }
        c3049h8.a("client_fill", (HashMap) map, (L7) null, this.j);
    }

    public static final void b(T7 it) {
        Intrinsics.f(it, "$it");
        A a2 = it.M;
        int iHashCode = it.hashCode();
        Q7 q7 = it.f23208P;
        a2.getClass();
        A.a(iHashCode, q7);
    }

    public final void a(View view, C2984d8 asset) {
        String strA;
        P0 p0;
        Intrinsics.f(asset, "asset");
        if (this.t) {
            return;
        }
        m();
        C2984d8 c2984d8B = b(this.f23212b, asset);
        if (c2984d8B != null) {
            HashMap mapA = a(c2984d8B);
            a(c2984d8B, mapA);
            if (!c2984d8B.equals(asset)) {
                a(asset, mapA);
            }
        } else {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String TAG = this.m;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).b(TAG, "Couldn't find an asset reference for this asset click URL");
            }
            a(asset, a(asset));
        }
        T7 t7C = c(this);
        if (t7C == null) {
            return;
        }
        String str = asset.f23521p;
        if (str != null) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(str.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            strA = I7.a(length, 1, str, i2);
        } else {
            strA = null;
        }
        if (B2.a(strA) && (p0 = t7C.f23221w) != null) {
            p0.a();
        }
        C2984d8 c2984d8A = a(this.f23212b, asset);
        if (c2984d8A != null) {
            if (view != null && "VIDEO".equals(c2984d8A.f23515c) && 5 == c2984d8A.k) {
                view.setVisibility(4);
                asset.v = 4;
            }
            c(c2984d8A);
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            String TAG2 = this.m;
            Intrinsics.e(TAG2, "TAG");
            ((A5) interfaceC3333z6).b(TAG2, "Couldn't find an asset reference for this asset action! Ignoring the asset action ...");
        }
    }

    public final void b(C2984d8 c2984d8) {
        Xe viewableAd;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "showEndCard");
        }
        T7 t7 = this.f23206J;
        if (t7 != null && g() != null) {
            try {
                View viewG = g();
                ViewGroup viewGroup = viewG instanceof ViewGroup ? (ViewGroup) viewG : null;
                View viewA = (viewGroup == null || (viewableAd = t7.getViewableAd()) == null) ? null : viewableAd.a(null, viewGroup, false);
                if (viewA != null) {
                    if (viewGroup != null) {
                        viewGroup.addView(viewA);
                    }
                    viewA.setClickable(true);
                    t7.p();
                    if (c2984d8 instanceof C2968c9) {
                        Ve veD = ((C2968c9) c2984d8).d();
                        Le le = veD != null ? ((Ue) veD).j : null;
                        if (le == null) {
                            return;
                        }
                        le.g = true;
                        return;
                    }
                    return;
                }
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    String TAG2 = this.m;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).b(TAG2, "Could not inflate the end card. Closing the ad");
                }
                a();
                return;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    String TAG3 = this.m;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z7).a(TAG3, "Failed to show end card Exception", e2);
                }
                a();
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            String TAG4 = this.m;
            Intrinsics.e(TAG4, "TAG");
            ((A5) interfaceC3333z8).b(TAG4, "End card container is null; end card will not be shown");
        }
        AbstractC3048h7.a((byte) 2, "InMobi", "Failed to show end card");
        a();
    }

    @Override // com.inmobi.media.InterfaceC3295x
    public void b() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "destroyContainer");
        }
        if (this.t) {
            return;
        }
        this.t = true;
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            c2996e3.b();
        }
        this.y = -1;
        T7 t7 = this.C;
        if (t7 != null) {
            t7.a();
        }
        this.f23221w = null;
        D8 d8H = h();
        if (d8H != null) {
            C2943b1 c2943b1 = d8H.f22772l;
            Iterator it = c2943b1.f23458b.iterator();
            while (it.hasNext()) {
                ((C2926a1) it.next()).f23421a.cancel();
            }
            c2943b1.f23458b.clear();
            d8H.f22773n = true;
            d8H.f22771i.clear();
            d8H.f22774p = null;
            L8 l8 = d8H.j;
            if (l8 != null) {
                l8.destroy();
            }
            d8H.j = null;
        }
        this.q = null;
        this.o.clear();
        We we = this.f23219p;
        if (we != null) {
            we.e();
        }
        We we2 = this.f23219p;
        if (we2 != null) {
            we2.a();
        }
        Context context = (Context) this.x.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
        this.x.clear();
        WeakReference weakReference = this.f23222z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H = null;
        T7 t8 = this.f23206J;
        if (t8 != null) {
            t8.b();
        }
        this.f23206J = null;
        A a2 = this.M;
        int iHashCode = hashCode();
        a2.getClass();
        SparseArray sparseArray = A.f22669b;
        sparseArray.remove(iHashCode);
        sparseArray.size();
    }

    public final C2984d8 a(C2984d8 c2984d8, C3177p8 c3177p8, String str) {
        if (AbstractC3330z2.a((Context) this.x.get(), str) || str == null || str.length() == 0) {
            return c2984d8;
        }
        String[] strArr = (String[]) new Regex("\\|").f(str, 0).toArray(new String[0]);
        C2984d8 c2984d8M = c3177p8.m(strArr[0]);
        if (c2984d8M == null) {
            return b(c3177p8.g, c2984d8);
        }
        if (c2984d8M.equals(c2984d8)) {
            return null;
        }
        if (strArr.length <= 2) {
            c2984d8M.f23519l = (byte) 1;
            return c2984d8M;
        }
        c2984d8M.f23519l = AbstractC3129m8.a(strArr[2]);
        return c2984d8M;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0086 A[RETURN] */
    public static byte a(String str) {
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, strP, i2);
        switch (strA.hashCode()) {
            case -934641255:
                if (strA.equals("reload")) {
                    return (byte) 3;
                }
                return (byte) 0;
            case -934524953:
                if (strA.equals("replay")) {
                    return (byte) 3;
                }
                return (byte) 0;
            case 0:
                strA.equals("");
                return (byte) 0;
            case 3127582:
                if (strA.equals("exit")) {
                    return (byte) 1;
                }
                return (byte) 0;
            case 3443508:
                if (strA.equals("play")) {
                    return (byte) 5;
                }
                return (byte) 0;
            case 3532159:
                if (strA.equals("skip")) {
                    return (byte) 2;
                }
                return (byte) 0;
            case 110066619:
                if (strA.equals(Constants.TEMPLATE_TYPE_FULLSCREEN)) {
                    return (byte) 4;
                }
                return (byte) 0;
            default:
                return (byte) 0;
        }
    }

    public final void a(C2984d8 asset, boolean z2) {
        Intrinsics.f(asset, "asset");
        C3177p8 c3177p8 = this.f23212b;
        if (!c3177p8.q || this.t) {
            return;
        }
        C2984d8 c2984d8B = b(c3177p8, asset);
        if (c2984d8B != null) {
            HashMap mapA = a(c2984d8B);
            String str = asset.g;
            Intrinsics.f(str, "<set-?>");
            c2984d8B.g = str;
            String strA = null;
            R6 r6 = ((TelemetryConfig.LandingPageConfig) this.k.getX()).getNativeEnabled() ? new R6(this.f23216i, J6.a(c2984d8B.f23521p), 0, 12) : null;
            J6.a(F6.LPClickStart, r6, (Integer) null, 12);
            if ("VIDEO".equals(c2984d8B.f23515c) || c2984d8B.f) {
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    String TAG = this.m;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).a(TAG, "Asset interaction requested");
                }
                String str2 = c2984d8B.g;
                We we = this.f23219p;
                if (we != null) {
                    we.a((byte) 4);
                }
                if ("NO_ACTION".equals(str2)) {
                    J6.a(F6.LPStartFailed, r6, (Integer) 10, 8);
                    return;
                }
                String str3 = c2984d8B.f23521p;
                if (2 == c2984d8B.f23519l) {
                    Ve veD = ((C2968c9) c2984d8B).d();
                    Le le = veD != null ? ((Ue) veD).j : null;
                    String str4 = le != null ? le.f22958c : null;
                    if (str4 != null) {
                        int length = str4.length() - 1;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 <= length) {
                            boolean z4 = Intrinsics.h(str4.charAt(!z3 ? i2 : length), 32) <= 0;
                            if (z3) {
                                if (!z4) {
                                    break;
                                } else {
                                    length--;
                                }
                            } else if (z4) {
                                i2++;
                            } else {
                                z3 = true;
                            }
                        }
                        strA = I7.a(length, 1, str4, i2);
                    }
                    if (B2.a(strA)) {
                        str3 = str4;
                    }
                }
                if (!AbstractC3330z2.a(d(), str3)) {
                    InterfaceC3333z5 interfaceC3333z6 = this.j;
                    if (interfaceC3333z6 != null) {
                        String TAG2 = this.m;
                        Intrinsics.e(TAG2, "TAG");
                        ((A5) interfaceC3333z6).b(TAG2, "Invalid url:" + str3 + " will use fallback");
                    }
                    str3 = c2984d8B.q;
                    if (!AbstractC3330z2.a(d(), str3)) {
                        InterfaceC3333z5 interfaceC3333z7 = this.j;
                        if (interfaceC3333z7 != null) {
                            String str5 = this.m;
                            ((A5) interfaceC3333z7).b(str5, I6.a(str5, "TAG", "Invalid fallback url:", str3));
                        }
                        J6.a(F6.LPStartFailed, r6, (Integer) 3, 8);
                        return;
                    }
                }
                boolean z5 = T9.f23231a;
                Intrinsics.c(str3);
                String strA2 = T9.a(str3, mapA);
                C2996e3 c2996e3 = this.f23215h;
                if (c2996e3 != null && !c2996e3.g.get()) {
                    c2996e3.d.g = 1;
                    Intrinsics.c(c2996e3.f23543c);
                }
                if (this.D && !z2) {
                    T7 t7C = c(this);
                    if (t7C == null) {
                        return;
                    }
                    P0 p0 = t7C.f23221w;
                    if (p0 != null) {
                        if ("INAPP".equals(str2) && AbstractC3330z2.a(strA2)) {
                            p0.e();
                        } else {
                            p0.g();
                        }
                    }
                    this.f23203E = c2984d8B;
                    this.f23204F = strA2;
                    return;
                }
                a(c2984d8B, str2, strA2, r6);
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            String TAG3 = this.m;
            Intrinsics.e(TAG3, "TAG");
            ((A5) interfaceC3333z8).b(TAG3, "Couldn't find an asset reference for this asset click URL");
        }
    }

    public static T7 c(T7 t7) {
        if (t7 == null) {
            return null;
        }
        if (t7.f() != null || t7.equals(t7.v)) {
            return t7;
        }
        T7 t8 = t7.v;
        return c(t8 != null ? t8 : null);
    }

    public final void a(C2984d8 c2984d8, HashMap map) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "Click impression record requested");
        }
        if (2 == c2984d8.f23519l) {
            C2968c9 c2968c9 = c2984d8 instanceof C2968c9 ? (C2968c9) c2984d8 : null;
            Ve veD = c2968c9 != null ? c2968c9.d() : null;
            Le le = veD != null ? ((Ue) veD).j : null;
            if ((le != null ? le.f22958c : null) != null && c2984d8.f23521p != null) {
                if (le.f.isEmpty()) {
                    return;
                }
                Iterator it = le.a("click").iterator();
                while (it.hasNext()) {
                    C2984d8.a((U8) it.next(), map, (L7) null, this.j);
                }
                return;
            }
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.m;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "reportAdClick");
            }
            c2984d8.a("click", map, (L7) null, this.j);
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            String TAG3 = this.m;
            Intrinsics.e(TAG3, "TAG");
            ((A5) interfaceC3333z7).a(TAG3, "reportAdClick");
        }
        c2984d8.a("click", map, (L7) null, this.j);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:34:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0029 A[SYNTHETIC] */
    public final HashMap a(C2984d8 asset) {
        C3049h8 c3049h8;
        C3049h8 c3049h9;
        Intrinsics.f(asset, "asset");
        HashMap map = new HashMap(4);
        if (this.t) {
            return map;
        }
        if (asset instanceof C3049h8) {
            c3049h9 = (C3049h8) asset;
            if (!"card_scrollable".equalsIgnoreCase(c3049h9.f23514b)) {
                c3049h8 = asset.r;
                c3049h9 = null;
                if (c3049h8 == null) {
                    c3049h8 = null;
                }
                while (c3049h8 != null) {
                    if ("card_scrollable".equalsIgnoreCase(c3049h8.f23514b)) {
                        c3049h9 = c3049h8;
                        break;
                    }
                    c3049h8 = c3049h8.r;
                    if (c3049h8 != null) {
                        c3049h8 = null;
                    }
                }
            }
        } else {
            c3049h8 = asset.r;
            c3049h9 = null;
            if (c3049h8 == null) {
                c3049h8 = null;
            }
            while (c3049h8 != null) {
                if ("card_scrollable".equalsIgnoreCase(c3049h8.f23514b)) {
                    c3049h9 = c3049h8;
                    break;
                }
                c3049h8 = c3049h8.r;
                if (c3049h8 != null) {
                    c3049h8 = null;
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c3049h9 != null) {
            long j = c3049h9.y;
            if (j != 0) {
                jCurrentTimeMillis = j;
            }
        }
        C3049h8 c3049h10 = this.f23212b.f23886e;
        map.put("$LTS", String.valueOf(c3049h10 != null ? c3049h10.y : 0L));
        map.put("$STS", String.valueOf(jCurrentTimeMillis));
        map.put("$TS", String.valueOf(System.currentTimeMillis()));
        Object map2 = this.f23212b.t;
        if (map2 == null) {
            map2 = new HashMap();
        }
        map.putAll(map2);
        return map;
    }

    public static T8 a(View view) {
        View viewFindViewWithTag = view != null ? view.findViewWithTag("timerView") : null;
        if (viewFindViewWithTag instanceof T8) {
            return (T8) viewFindViewWithTag;
        }
        return null;
    }

    public final void a(C2968c9 c2968c9) {
        Ve veD = c2968c9.d();
        Le le = veD != null ? ((Ue) veD).j : null;
        if (le == null || !le.g) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "Invoking close end card trackers.");
        }
        Iterator it = le.a("closeEndCard").iterator();
        while (it.hasNext()) {
            C2984d8.a((U8) it.next(), a((C2984d8) c2968c9), (L7) null, this.j);
        }
        le.g = false;
    }

    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "dismissCurrentViewContainer");
        }
        if (this.t) {
            return;
        }
        try {
            T7 t7C = c(this);
            if (t7C == null) {
                return;
            }
            t7C.q();
            InMobiAdActivity.k.remove(t7C.hashCode());
            if (t7C instanceof C2934a9) {
                View videoContainerView = t7C.getVideoContainerView();
                C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                if (c3130m9 != null) {
                    C3114l9 videoView = c3130m9.getVideoView();
                    Object tag = videoView.getTag();
                    if (tag instanceof C2968c9) {
                        HashMap map = ((C2968c9) tag).t;
                        map.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                        map.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                        C2984d8 c2984d8 = ((C2968c9) tag).f23523w;
                        if (c2984d8 instanceof C2968c9) {
                            ((C2968c9) c2984d8).a((C2968c9) tag);
                        }
                        a((C2968c9) tag);
                    }
                }
            }
            WeakReference weakReference = t7C.f23222z;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f22661e = true;
                ((InMobiAdActivity) activity).finish();
                int i2 = this.y;
                if (i2 != -1) {
                    ((InMobiAdActivity) activity).overridePendingTransition(0, i2);
                }
            }
            T7 t7 = this.v;
            if (t7 == null) {
                t7 = null;
            }
            if (t7 != null) {
                t7.C = null;
                new Handler(Looper.getMainLooper()).post(new A.G(t7, 0));
            }
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String str = this.m;
                ((A5) interfaceC3333z6).b(str, rf.a(e2, H6.a(str, "TAG", "Encountered unexpected error in handling exit action on video: ")));
            }
            AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void a(C2984d8 asset, String interactionMode, String url, R6 r6) {
        P0 p0;
        ?? r5;
        Intrinsics.f(asset, "asset");
        Intrinsics.f(interactionMode, "interactionMode");
        Intrinsics.f(url, "url");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "openUrl");
        }
        boolean zEquals = "EMBEDDED".equals(interactionMode);
        ?? r7 = Unit.f43263a;
        if (zEquals) {
            if (r6 != null) {
                r6.g = "IN_CUSTOM";
            }
            Integer numA = a(url, asset, r6);
            if (numA != null) {
                J6.a(F6.LPBrowserOpenFailed, r6, Integer.valueOf(numA.intValue()), 8);
            } else {
                r5 = 0;
            }
            if (r5 != 0) {
                r5 = r7;
                return;
            } else {
                r5 = r7;
                J6.a(F6.LPStartSuccess, r6, (Integer) null, 12);
                return;
            }
        }
        if ("INAPP".equals(interactionMode)) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.m;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).c(TAG2, "openUrlInCCT");
            }
            Context context = (Context) this.x.get();
            if (context == null) {
                return;
            }
            if (f() == null && (p0 = this.f23221w) != null) {
                p0.e();
            }
            String strA = AbstractC3299x3.a(context);
            try {
                boolean cctEnabled = this.s.getCctEnabled();
                try {
                    if (strA != null && cctEnabled) {
                        new C3091k2(url, null, context, this.f23209Q, this.f23217l, r6, "NATIVE").a();
                        return;
                    }
                    ?? r2 = r7;
                    InterfaceC3333z5 interfaceC3333z7 = this.j;
                    if (interfaceC3333z7 != null) {
                        String TAG3 = this.m;
                        Intrinsics.e(TAG3, "TAG");
                        ((A5) interfaceC3333z7).a(TAG3, "ChromeCustomTab fallback to Embedded");
                    }
                    if (r6 != null) {
                        r6.g = "IN_CUSTOM";
                    }
                    Integer numA2 = a(url, asset, r6);
                    if (numA2 != null) {
                        J6.a(F6.LPBrowserOpenFailed, r6, Integer.valueOf(numA2.intValue()), 8);
                    } else {
                        r2 = 0;
                    }
                    if (r2 == 0) {
                        J6.a(F6.LPStartSuccess, r6, (Integer) null, 12);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    try {
                        AbstractC3330z2.a((Context) r7, url, this.f23217l, "NATIVE");
                        if (r6 != null) {
                            r6.g = "EX_NATIVE";
                        }
                        J6.a(F6.LPStartSuccess, r6, (Integer) null, 12);
                    } catch (Exception e3) {
                        InterfaceC3333z5 interfaceC3333z8 = this.j;
                        if (interfaceC3333z8 != null) {
                            String TAG4 = this.m;
                            Intrinsics.e(TAG4, "TAG");
                            ((A5) interfaceC3333z8).a(TAG4, "Exception occurred while opening External ", e3);
                        }
                        J6.a(F6.LPBrowserOpenFailed, r6, (Integer) 9, 8);
                    }
                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                    if (interfaceC3333z9 != null) {
                        String TAG5 = this.m;
                        Intrinsics.e(TAG5, "TAG");
                        ((A5) interfaceC3333z9).a(TAG5, "Fallback to External while opening cct", exc);
                    }
                }
            } catch (Exception e4) {
                e = e4;
                r7 = context;
            }
        } else {
            String str = asset.q;
            InterfaceC3333z5 interfaceC3333z10 = this.j;
            if (interfaceC3333z10 != null) {
                String TAG6 = this.m;
                Intrinsics.e(TAG6, "TAG");
                ((A5) interfaceC3333z10).c(TAG6, "openUrlUsingExternalBrowser");
            }
            if (this.x.get() == null) {
                return;
            }
            if (r6 != null) {
                r6.g = "EX_NATIVE";
            }
            String strA2 = AbstractC3330z2.a((Context) this.x.get(), this.f23217l, url, str);
            if (strA2 != null) {
                T7 t7C = c(this);
                if (t7C == null) {
                    return;
                }
                P0 p1 = t7C.f23221w;
                if (!this.D && p1 != null) {
                    p1.g();
                }
                if (strA2.equals(str)) {
                    asset.a("TRACKER_EVENT_TYPE_FALLBACK_URL", a(asset), (L7) null, this.j);
                }
                J6.a(F6.LPStartSuccess, r6, (Integer) null, 12);
                return;
            }
            J6.a(F6.LPBrowserOpenFailed, r6, (Integer) 6, 8);
        }
    }

    public final Integer a(String url, C2984d8 asset, R6 r6) {
        Intrinsics.f(url, "url");
        Intrinsics.f(asset, "asset");
        try {
            Context context = (Context) this.x.get();
            if (context == null) {
                return 7;
            }
            if (AbstractC3330z2.a(url)) {
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    String TAG = this.m;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).c(TAG, "openUrlUsingEmbeddedBrowser");
                }
                InMobiAdActivity.f22657l = null;
                S7 s7 = this.L;
                if (s7 == null) {
                    s7 = new S7(this);
                    this.L = s7;
                }
                InMobiAdActivity.m = s7;
                Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
                intent.putExtra("placementId", this.f23214e);
                intent.putExtra("creativeId", getCreativeId());
                intent.putExtra("impressionId", getImpressionId());
                intent.putExtra("allowAutoRedirection", this.f);
                if (r6 != null) {
                    intent.putExtra("lpTelemetryControlInfo", r6);
                }
                if (asset.f23518i) {
                    intent.putExtra("supportLockScreen", true);
                }
                Uc.f23270a.a(context, intent);
                return null;
            }
            return 10;
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.m;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).a(TAG2, "Error while opening Embedded Browser", e2);
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return 9;
        }
    }
}
