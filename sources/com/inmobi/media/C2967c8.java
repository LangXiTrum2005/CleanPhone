package com.inmobi.media;

import A.RunnableC0905n;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2967c8 extends S0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f23485Q = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public WeakReference f23486N;
    public boolean O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f23487P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2967c8(Context context, Z placement, V8 v8) {
        super(context, placement, v8);
        Intrinsics.f(context, "context");
        Intrinsics.f(placement, "placement");
        placement.l();
        a(context, placement, v8);
    }

    public final void D0() {
        try {
            super.g();
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("c8", rf.a(e2, H6.a("c8", "TAG", "SDK encountered unexpected error in destroying native ad unit; ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void E0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("c8", "renderAdPostInternetCheck");
        }
        k0();
        try {
            if (o0()) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("c8", "render ad is blocked");
                    return;
                }
                return;
            }
            U0 u0S = s();
            u0S.getClass();
            u0S.g = SystemClock.elapsedRealtime();
            d0();
        } catch (IllegalStateException e2) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("c8", "Exception while loading ad.", e2);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.S0
    public final byte J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public final void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public final void b() {
    }

    @Override // com.inmobi.media.S0
    public final void c0() {
        if (Z()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("c8", "Ad unit is already destroyed! Returning ...");
                return;
            }
            return;
        }
        F0 f0R = r();
        if (f0()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("c8", "Some of the dependency libraries for InMobiNative not found");
            }
            if (f0R != null) {
                f0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return;
            }
            return;
        }
        if (1 == Q() || 2 == Q()) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("c8", "An ad load is already in progress");
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z8 = this.j;
        if (interfaceC3333z8 != null) {
            StringBuilder sbA = H6.a("c8", "TAG", "Fetching a Native ad for placement id: ");
            sbA.append(I());
            ((A5) interfaceC3333z8).a("c8", sbA.toString());
        }
        if (4 == Q()) {
            if (!W()) {
                InterfaceC3333z5 interfaceC3333z9 = this.j;
                if (interfaceC3333z9 != null) {
                    ((A5) interfaceC3333z9).a("c8", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                if (f0R != null) {
                    Context contextT = t();
                    InterfaceC3333z5 interfaceC3333z10 = this.j;
                    if (interfaceC3333z10 != null) {
                        ((A5) interfaceC3333z10).c("c8", "setContainerContext");
                    }
                    InterfaceC3295x interfaceC3295xK = k();
                    if (interfaceC3295xK instanceof T7) {
                        ((T7) interfaceC3295xK).a(contextT);
                    }
                    InterfaceC3333z5 interfaceC3333z11 = this.j;
                    if (interfaceC3333z11 != null) {
                        ((A5) interfaceC3333z11).a("c8", "callback - onFetchSuccess");
                    }
                    InterfaceC3333z5 interfaceC3333z12 = this.j;
                    if (interfaceC3333z12 != null) {
                        ((A5) interfaceC3333z12).a("c8", "callback - onLoadSuccess");
                    }
                    e(f0R);
                    f(f0R);
                    return;
                }
                return;
            }
            InterfaceC3333z5 interfaceC3333z13 = this.j;
            if (interfaceC3333z13 != null) {
                ((A5) interfaceC3333z13).b("c8", "ad is expired - destroy");
            }
            D0();
        }
        e0();
        super.c0();
    }

    @Override // com.inmobi.media.S0
    public final void j0() {
        if (p0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("c8", "renderAd without internet check");
            }
            E0();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("c8", "renderAd");
        }
        a(new C2933a8(this), new C2950b8(this));
    }

    @Override // com.inmobi.media.S0
    public final HashMap o() {
        HashMap map = new HashMap();
        map.put("a-parentViewWidth", String.valueOf(U3.d().f23292a));
        map.put("a-productVersion", "NS-1.0.0-20160411");
        map.put("trackerType", "url_ping");
        return map;
    }

    @Override // com.inmobi.media.S0
    public final String q() {
        return "native";
    }

    @Override // com.inmobi.media.S0
    public final void r0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "signalSuccess");
        }
        A aV = v();
        int iHashCode = hashCode();
        E8 e8 = new E8(this);
        aV.getClass();
        A.a(iHashCode, e8);
    }

    @Override // com.inmobi.media.S0
    public final void a(Context context) {
        Intrinsics.f(context, "context");
        super.a(context);
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "setContainerContext");
        }
        InterfaceC3295x interfaceC3295xK = k();
        if (interfaceC3295xK instanceof T7) {
            ((T7) interfaceC3295xK).a(context);
        }
    }

    @Override // com.inmobi.media.S0
    public final void b(F0 f0) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "handleAdScreenDisplayed");
        }
        if (Q() == 4) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).d("c8", "AdUnit " + this + " state change - RENDERED");
            }
            d((byte) 6);
        } else if (Q() == 6) {
            this.f23487P++;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("InMobi", "Successfully displayed fullscreen for placement id: " + I());
        }
        if (this.f23487P == 0) {
            if (f0 != null) {
                InterfaceC3333z5 interfaceC3333z8 = this.j;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).a("c8", "callback - onAdDisplayed");
                }
                d(f0);
                return;
            }
            InterfaceC3333z5 interfaceC3333z9 = this.j;
            if (interfaceC3333z9 != null) {
                ((A5) interfaceC3333z9).b("c8", "listener is null. cannot give AdDisplayed callback");
            }
        }
    }

    public final View a(View view, ViewGroup parent, int i2) {
        View view2;
        Intrinsics.f(parent, "parent");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "getAdView");
        }
        View viewA = null;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!G4.f22837a.a()) {
                D0();
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("c8", "dropping because of GDPR");
                    return null;
                }
            } else {
                if (W()) {
                    InterfaceC3333z5 interfaceC3333z7 = this.j;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).a("c8", "Ad has expired.");
                    }
                    D0();
                    return null;
                }
                if (Q() != 4 && Q() != 6) {
                    InterfaceC3333z5 interfaceC3333z8 = this.j;
                    if (interfaceC3333z8 != null) {
                        ((A5) interfaceC3333z8).b("c8", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                    }
                    AbstractC3048h7.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).b("c8", "Ad Load is not complete");
                    }
                    WeakReference weakReference = this.f23486N;
                    if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
                        View view3 = new View(Uc.d());
                        view3.setLayoutParams(view2.getLayoutParams());
                        return view3;
                    }
                } else {
                    T7 t7G = G();
                    if (t7G != null) {
                        boolean z2 = this.O;
                        InterfaceC3333z5 interfaceC3333z10 = t7G.j;
                        if (interfaceC3333z10 != null) {
                            String TAG = t7G.m;
                            Intrinsics.e(TAG, "TAG");
                            ((A5) interfaceC3333z10).c(TAG, "showOnLockScreen - " + z2);
                        }
                        t7G.D = z2;
                        t7G.f23202B = i2;
                        Xe viewableAd = t7G.getViewableAd();
                        viewA = viewableAd != null ? viewableAd.a(view, parent, true) : null;
                        this.f23486N = new WeakReference(viewA);
                        Handler handlerD = D();
                        if (handlerD != null) {
                            handlerD.post(new RunnableC0905n(16, this, viewableAd));
                        }
                    }
                }
            }
            return viewA;
        }
        InterfaceC3333z5 interfaceC3333z11 = this.j;
        if (interfaceC3333z11 != null) {
            ((A5) interfaceC3333z11).b("c8", "getPrimaryView called on background thread");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (short) 2150);
        return null;
    }

    public static final void a(C2967c8 this$0, Xe xe) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("c8", "start tracking for impression");
        }
        if (xe != null) {
            xe.a((Map) null);
        }
    }

    @Override // com.inmobi.media.S0
    public final void a(C3312y0 adSet) {
        Intrinsics.f(adSet, "adSet");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "handleAdFetchSuccessful");
        }
        if (Q() == 1) {
            e(adSet);
        }
        if (!"html".equals(E()) && !"htmlUrl".equals(E()) && !"unknown".equals(E())) {
            super.a(adSet);
            return;
        }
        a(I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 57);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("c8", "invalid markup. fetch failed");
        }
    }

    @Override // com.inmobi.media.S0
    public final void a(F0 f0) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "handleAdScreenDismissed");
        }
        if (Q() == 6) {
            int i2 = this.f23487P;
            if (i2 > 0) {
                this.f23487P = i2 - 1;
            } else {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).d("c8", "AdUnit " + this + " state - READY");
                }
                d((byte) 4);
            }
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).a("InMobi", "Successfully dismissed fullscreen for placement id: " + I());
        }
        if (this.f23487P == 0 && Q() == 4) {
            if (f0 != null) {
                InterfaceC3333z5 interfaceC3333z8 = this.j;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).a("c8", "callback - onAdDismissed");
                }
                f0.b();
            } else {
                InterfaceC3333z5 interfaceC3333z9 = this.j;
                if (interfaceC3333z9 != null) {
                    ((A5) interfaceC3333z9).b("c8", "Listener was garbage collected. Unable to give callback");
                }
            }
            InterfaceC3333z5 interfaceC3333z10 = this.j;
            if (interfaceC3333z10 != null) {
                ((A5) interfaceC3333z10).a();
            }
        }
    }

    @Override // com.inmobi.media.S0
    public final void a(Z placement, boolean z2) {
        Intrinsics.f(placement, "placement");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "handleAssetAvailabilityChanged");
        }
        super.a(placement, z2);
        if (!z2) {
            if (Intrinsics.a(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    InterfaceC3333z5 interfaceC3333z6 = this.j;
                    if (interfaceC3333z6 != null) {
                        ((A5) interfaceC3333z6).d("c8", "AdUnit " + this + " state - CREATED");
                    }
                    F0 f0R = r();
                    if (f0R != null) {
                        f0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.a(I(), placement) || 2 != Q() || r() == null || t() == null) {
            return;
        }
        if (a0()) {
            c(true);
            f();
        } else {
            r0();
        }
    }

    @Override // com.inmobi.media.S0
    public final void a(boolean z2, InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "onDidParseAfterFetch");
        }
        super.a(z2, status);
        if (Q() == 2) {
            F0 f0R = r();
            if (f0R != null) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("c8", "callback - onFetchSuccess");
                }
                e(f0R);
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b("c8", "invalid state - ignore parse callback");
        }
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.Te
    public final void a(C3040h ad, boolean z2, short s) {
        Intrinsics.f(ad, "ad");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("c8", "onVastProcessCompleted");
        }
        try {
            if (!z2) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).b("c8", X8.a("c8", "TAG", "VAST processing failed - ", s));
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
                return;
            }
            try {
                super.a(ad, z2, s);
            } catch (IllegalStateException e2) {
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).b("c8", "Exception while onVastProcessCompleted : " + e2.getMessage());
                }
            }
            C3040h c3040hM = m();
            if (c3040hM == null) {
                InterfaceC3333z5 interfaceC3333z8 = this.j;
                if (interfaceC3333z8 != null) {
                    ((A5) interfaceC3333z8).b("c8", "current ad is null. failing");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
                return;
            }
            if (T() == 0) {
                if (!c3040hM.G()) {
                    InterfaceC3333z5 interfaceC3333z9 = this.j;
                    if (interfaceC3333z9 != null) {
                        ((A5) interfaceC3333z9).c("c8", "start OMID session for HTML ad");
                    }
                    a(true, (GestureDetectorOnGestureListenerC3005ec) null);
                }
            } else {
                InterfaceC3333z5 interfaceC3333z10 = this.j;
                if (interfaceC3333z10 != null) {
                    ((A5) interfaceC3333z10).c("c8", "start OMID session for current AD");
                }
                a(c3040hM);
            }
            if (c3040hM.G()) {
                b(true);
                InterfaceC3333z5 interfaceC3333z11 = this.j;
                if (interfaceC3333z11 != null) {
                    ((A5) interfaceC3333z11).c("c8", "handleInterActive");
                }
                V();
            }
        } catch (Exception e3) {
            InterfaceC3333z5 interfaceC3333z12 = this.j;
            if (interfaceC3333z12 != null) {
                ((A5) interfaceC3333z12).a("c8", "Exception while loading ad.", e3);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 13);
        }
    }
}
