package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class L5 extends Xe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2940af f22945e;
    public final S4 f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L5(GestureDetectorOnGestureListenerC3005ec container, C2940af mViewableAd, S4 htmlAdTracker, InterfaceC3333z5 interfaceC3333z5) {
        super(container);
        Intrinsics.f(container, "container");
        Intrinsics.f(mViewableAd, "mViewableAd");
        Intrinsics.f(htmlAdTracker, "htmlAdTracker");
        this.f22945e = mViewableAd;
        this.f = htmlAdTracker;
        this.g = interfaceC3333z5;
        this.f22946h = "L5";
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
    }

    @Override // com.inmobi.media.Xe
    public final View b() {
        return this.f22945e.b();
    }

    @Override // com.inmobi.media.Xe
    public final C3304x8 c() {
        return this.f22945e.f23352b;
    }

    @Override // com.inmobi.media.Xe
    public final View d() {
        return this.f22945e.d();
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22946h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "stopTrackingForImpression");
        }
        View viewB = this.f22945e.b();
        if (viewB != null) {
            this.f.a(viewB);
            this.f22945e.getClass();
        }
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Intrinsics.f(parent, "parent");
        View viewB = this.f22945e.b();
        if (viewB != null) {
            this.f.a(viewB);
            this.f.b(viewB);
        }
        C2940af c2940af = this.f22945e;
        c2940af.getClass();
        return c2940af.d();
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f22946h;
            StringBuilder sbA = H6.a(str, "TAG", "startTrackingForImpression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendly views");
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        View viewB = this.f22945e.b();
        if (viewB != null) {
            InterfaceC3333z5 interfaceC3333z6 = this.g;
            if (interfaceC3333z6 != null) {
                String TAG = this.f22946h;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).a(TAG, "start tracking");
            }
            AdConfig.ViewabilityConfig viewabilityConfig = this.d.getViewability();
            InterfaceC3295x interfaceC3295x = this.f23351a;
            Intrinsics.d(interfaceC3295x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x;
            gestureDetectorOnGestureListenerC3005ec.setFriendlyViews(map);
            S4 s4 = this.f;
            s4.getClass();
            Intrinsics.f(viewabilityConfig, "viewabilityConfig");
            InterfaceC3333z5 interfaceC3333z7 = s4.f;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (s4.f23161a == 0) {
                InterfaceC3333z5 interfaceC3333z8 = s4.f;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (!Intrinsics.a(s4.f23162b, "video") && !Intrinsics.a(s4.f23162b, "audio")) {
                byte b2 = s4.f23161a;
                C3030g5 c3030g5 = s4.g;
                if (c3030g5 == null) {
                    InterfaceC3333z5 interfaceC3333z9 = s4.f;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).c("HtmlAdTracker", android.support.v4.media.a.h(b2, "creating Visibility Tracker for "));
                    }
                    X4 x4 = new X4(viewabilityConfig, b2, s4.f);
                    InterfaceC3333z5 interfaceC3333z10 = s4.f;
                    if (interfaceC3333z10 != null) {
                        ((A5) interfaceC3333z10).c("HtmlAdTracker", android.support.v4.media.a.h(b2, "creating Impression Tracker for "));
                    }
                    C3030g5 c3030g6 = new C3030g5(viewabilityConfig, x4, s4.j);
                    s4.g = c3030g6;
                    c3030g5 = c3030g6;
                }
                InterfaceC3333z5 interfaceC3333z11 = s4.f;
                if (interfaceC3333z11 != null) {
                    ((A5) interfaceC3333z11).c("HtmlAdTracker", "impression tracker add view");
                }
                c3030g5.a(viewB, viewB, s4.d, s4.f23163c);
            } else {
                InterfaceC3333z5 interfaceC3333z12 = s4.f;
                if (interfaceC3333z12 != null) {
                    ((A5) interfaceC3333z12).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            }
            this.f.a(viewB, viewB, gestureDetectorOnGestureListenerC3005ec.getVISIBILITY_CHANGE_LISTENER(), viewabilityConfig, false);
            this.f22945e.getClass();
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
        if (childView instanceof C3117lc) {
            InterfaceC3333z5 interfaceC3333z5 = this.g;
            if (interfaceC3333z5 != null) {
                String TAG = this.f22946h;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).a(TAG, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.g;
        if (interfaceC3333z6 != null) {
            String str = this.f22946h;
            StringBuilder sbA = H6.a(str, "TAG", "Adding friendly view: ");
            sbA.append(childView.getClass().getSimpleName());
            sbA.append(" with obstruction code: ");
            sbA.append(obstructionCode);
            ((A5) interfaceC3333z6).a(str, sbA.toString());
        }
        this.f22945e.a(childView, obstructionCode);
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
        if (childView instanceof C3117lc) {
            return;
        }
        this.f22945e.a(childView);
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        C2940af c2940af;
        Intrinsics.f(context, "context");
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String str = this.f22946h;
            ((A5) interfaceC3333z5).a(str, X8.a(str, "TAG", "onActivityStateChanged - state - ", b2));
        }
        try {
            try {
                if (b2 == 0) {
                    S4 s4 = this.f;
                    InterfaceC3333z5 interfaceC3333z6 = s4.f;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).c("HtmlAdTracker", "onActivityStarted");
                    }
                    C3030g5 c3030g5 = s4.g;
                    if (c3030g5 != null) {
                        Intrinsics.e(c3030g5.d, "TAG");
                        for (Map.Entry entry : c3030g5.f23625a.entrySet()) {
                            View view = (View) entry.getKey();
                            C2998e5 c2998e5 = (C2998e5) entry.getValue();
                            c3030g5.f23627c.a(view, c2998e5.f23546a, c2998e5.f23547b);
                        }
                        if (!c3030g5.f23628e.hasMessages(0)) {
                            c3030g5.f23628e.postDelayed(c3030g5.f, c3030g5.g);
                        }
                        c3030g5.f23627c.f();
                    }
                    X4 x4 = s4.f23165h;
                    if (x4 != null) {
                        x4.f();
                    }
                } else if (b2 == 1) {
                    S4 s5 = this.f;
                    InterfaceC3333z5 interfaceC3333z7 = s5.f;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).c("HtmlAdTracker", "onActivityStopped");
                    }
                    C3030g5 c3030g6 = s5.g;
                    if (c3030g6 != null) {
                        Intrinsics.e(c3030g6.d, "TAG");
                        c3030g6.f23627c.a();
                        c3030g6.f23628e.removeCallbacksAndMessages(null);
                        c3030g6.f23626b.clear();
                    }
                    X4 x5 = s5.f23165h;
                    if (x5 != null) {
                        x5.e();
                    }
                } else if (b2 == 2) {
                    S4 s6 = this.f;
                    InterfaceC3333z5 interfaceC3333z8 = s6.f;
                    if (interfaceC3333z8 != null) {
                        ((A5) interfaceC3333z8).c("HtmlAdTracker", "onActivityDestroyed");
                    }
                    C3030g5 c3030g7 = s6.g;
                    if (c3030g7 != null) {
                        c3030g7.f23625a.clear();
                        c3030g7.f23626b.clear();
                        c3030g7.f23627c.a();
                        c3030g7.f23628e.removeMessages(0);
                        c3030g7.f23627c.b();
                    }
                    s6.g = null;
                    X4 x6 = s6.f23165h;
                    if (x6 != null) {
                        x6.b();
                    }
                    s6.f23165h = null;
                } else {
                    Intrinsics.e(this.f22946h, "TAG");
                }
                c2940af = this.f22945e;
            } catch (Exception e2) {
                InterfaceC3333z5 interfaceC3333z9 = this.g;
                if (interfaceC3333z9 != null) {
                    String TAG = this.f22946h;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z9).b(TAG, "Exception in onActivityStateChanged with message : " + e2.getMessage());
                }
                S5 s7 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
                c2940af = this.f22945e;
            }
            c2940af.getClass();
        } catch (Throwable th) {
            this.f22945e.getClass();
            throw th;
        }
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            String TAG = this.f22946h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).a(TAG, "destroy");
        }
        View viewB = this.f22945e.b();
        if (viewB != null) {
            this.f.a(viewB);
            this.f.b(viewB);
        }
        super.a();
        this.f22945e.a();
    }
}
