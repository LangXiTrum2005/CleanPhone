package com.inmobi.media;

import A.RunnableC0879a;
import A.RunnableC0887e;
import A.RunnableC0898j0;
import A.RunnableC0905n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.inmobi.media.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3127m6 extends S0 {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f23810N;
    public boolean O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Nd f23811P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Function0 f23812Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3127m6(Context context, Z adPlacement, F0 f0) {
        super(context, adPlacement, f0);
        Intrinsics.f(context, "context");
        Intrinsics.f(adPlacement, "adPlacement");
        this.f23811P = new Nd();
        adPlacement.l();
        a(context, adPlacement, f0);
        c("activity");
    }

    public static final void c(C3127m6 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.a(this$0.r());
    }

    public static final void d(C3127m6 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.b(this$0.r());
    }

    public static final /* synthetic */ String e() {
        return "m6";
    }

    public final boolean D0() {
        if (f0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        F0 f0R = r();
        if (f0R == null) {
            return false;
        }
        byte bQ = Q();
        if (bQ == 1) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("InMobiInterstitial", AbstractC3294we.f24080n + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
        } else if (bQ == 7 || bQ == 6) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("InMobiInterstitial", AbstractC3294we.j + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        } else {
            if (bQ != 2) {
                if (4 == Q()) {
                    if (!W()) {
                        InterfaceC3333z5 interfaceC3333z8 = this.j;
                        if (interfaceC3333z8 != null) {
                            ((A5) interfaceC3333z8).a("m6", "An ad is ready with the ad unit. Signaling ad load success ...");
                        }
                        F0 f0R2 = r();
                        if (f0R2 == null) {
                            InterfaceC3333z5 interfaceC3333z9 = this.j;
                            if (interfaceC3333z9 != null) {
                                ((A5) interfaceC3333z9).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                            }
                        } else {
                            e(f0R2);
                            f(f0R2);
                        }
                        return false;
                    }
                    g();
                }
                e0();
                return true;
            }
            if ("html".equals(E()) || "htmlUrl".equals(E())) {
                InterfaceC3333z5 interfaceC3333z10 = this.j;
                if (interfaceC3333z10 != null) {
                    ((A5) interfaceC3333z10).b("InMobiInterstitial", AbstractC3294we.f24080n + I());
                }
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
            } else {
                e(f0R);
            }
        }
        return false;
    }

    public final boolean E0() {
        InterfaceC3333z5 interfaceC3333z5;
        C3040h c3040hM = m();
        if (c3040hM == null) {
            return false;
        }
        AdConfig adConfigJ = j();
        Intrinsics.c(adConfigJ);
        boolean zA = c3040hM.a(adConfigJ.getCacheConfig(q()).getTimeToLive());
        if (zA && (interfaceC3333z5 = this.j) != null) {
            ((A5) interfaceC3333z5).b("m6", "Top ad has expired, failing show of ad.");
        }
        return !zA;
    }

    @Override // com.inmobi.media.S0
    public Integer F() {
        AdConfig adConfigJ = j();
        if (adConfigJ != null) {
            return Integer.valueOf(adConfigJ.getMinimumRefreshInterval());
        }
        return null;
    }

    public final void F0() {
        InterfaceC3295x interfaceC3295xK = k();
        if (interfaceC3295xK == null) {
            return;
        }
        this.O = true;
        interfaceC3295xK.e();
    }

    public final Nd G0() {
        return this.f23811P;
    }

    public final boolean H0() {
        return Q() == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r1.equals("html") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I0() {
        /*
            r5 = this;
            java.lang.String r0 = "Cannot handle markupType: "
            com.inmobi.media.z5 r1 = r5.j
            java.lang.String r2 = "m6"
            if (r1 == 0) goto Lf
            com.inmobi.media.A5 r1 = (com.inmobi.media.A5) r1
            java.lang.String r3 = "renderAdPostInternetCheck"
            r1.a(r2, r3)
        Lf:
            r5.k0()
            boolean r1 = r5.o0()     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto L1a
            goto Lab
        L1a:
            com.inmobi.media.U0 r1 = r5.s()     // Catch: java.lang.IllegalStateException -> L4b
            r1.getClass()     // Catch: java.lang.IllegalStateException -> L4b
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L4b
            r1.g = r3     // Catch: java.lang.IllegalStateException -> L4b
            r5.d0()     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r1 = r5.E()     // Catch: java.lang.IllegalStateException -> L4b
            int r3 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L4b
            r4 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r3 == r4) goto L65
            r4 = 3213227(0x3107ab, float:4.50269E-39)
            if (r3 == r4) goto L4d
            r4 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r3 == r4) goto L42
            goto L6d
        L42:
            java.lang.String r3 = "htmlUrl"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 != 0) goto L55
            goto L6d
        L4b:
            r0 = move-exception
            goto L93
        L4d:
            java.lang.String r3 = "html"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto L6d
        L55:
            android.os.Handler r0 = r5.D()     // Catch: java.lang.IllegalStateException -> L4b
            if (r0 == 0) goto Lab
            A.j0 r1 = new A.j0     // Catch: java.lang.IllegalStateException -> L4b
            r3 = 0
            r1.<init>(r5, r3)     // Catch: java.lang.IllegalStateException -> L4b
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L4b
            return
        L65:
            java.lang.String r3 = "inmobiJson"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 != 0) goto L87
        L6d:
            com.inmobi.media.z5 r1 = r5.j     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto Lab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L4b
            r3.<init>(r0)     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r0 = r5.E()     // Catch: java.lang.IllegalStateException -> L4b
            r3.append(r0)     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.IllegalStateException -> L4b
            com.inmobi.media.A5 r1 = (com.inmobi.media.A5) r1     // Catch: java.lang.IllegalStateException -> L4b
            r1.a(r2, r0)     // Catch: java.lang.IllegalStateException -> L4b
            return
        L87:
            com.inmobi.media.z5 r0 = r5.j     // Catch: java.lang.IllegalStateException -> L4b
            if (r0 == 0) goto Lab
            java.lang.String r1 = "Waiting for Vast Processing"
            com.inmobi.media.A5 r0 = (com.inmobi.media.A5) r0     // Catch: java.lang.IllegalStateException -> L4b
            r0.a(r2, r1)     // Catch: java.lang.IllegalStateException -> L4b
            return
        L93:
            com.inmobi.media.z5 r1 = r5.j
            if (r1 == 0) goto L9e
            com.inmobi.media.A5 r1 = (com.inmobi.media.A5) r1
            java.lang.String r3 = "Exception while loading ad."
            r1.a(r2, r3, r0)
        L9e:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 1
            r2 = 2134(0x856, float:2.99E-42)
            r5.b(r0, r1, r2)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3127m6.I0():void");
    }

    @Override // com.inmobi.media.S0
    public final byte J() {
        return (byte) 1;
    }

    public boolean J0() {
        return 2 == Q();
    }

    public final void K0() {
        short s;
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "submitAdNotReady " + this);
        }
        Nd nd = this.f23811P;
        U0 u0S = s();
        C3040h c3040hB = this.f23130A ? b(this.x) : m();
        String strP = c3040hB != null ? c3040hB.p() : null;
        C3312y0 c3312y0Y = y();
        Boolean boolO = c3312y0Y != null ? c3312y0Y.o() : null;
        String strE2 = E();
        byte bQ = Q();
        new W(u0S, strP, boolO, strE2, bQ);
        nd.getClass();
        HashMap map = new HashMap();
        long j = u0S.f23243c;
        ScheduledExecutorService scheduledExecutorService = Ie.f22893a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (bQ == 0) {
            s = 2204;
        } else if (bQ == 1) {
            s = 2205;
        } else if (bQ == 2) {
            s = 2206;
        } else if (bQ == 3) {
            s = 2207;
        } else if (bQ == 6) {
            s = 2208;
        } else if (bQ == 7) {
            s = 2209;
        } else {
            s = bQ == 8 ? (short) 2242 : (short) 2210;
        }
        map.put("errorCode", Short.valueOf(s));
        if (strE2 != null) {
            map.put("markupType", strE2);
        }
        if (strP != null) {
            map.put("creativeType", "\"" + strP + AbstractJsonLexerKt.STRING);
        }
        if (boolO != null) {
            map.put("isRewarded", boolO);
        }
        String strA = u0S.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", u0S.f23241a.q());
        map.put("networkType", L3.q());
        map.put("plId", Long.valueOf(u0S.f23241a.I().l()));
        map.put("isAdLoaded", Boolean.valueOf(nd.f23021a));
        String strM = u0S.f23241a.I().m();
        if (strM != null) {
            map.put("plType", strM);
        }
        Pd pd = Pd.f23077a;
        Pd.b("AdNotReady", map, Td.SDK);
    }

    public final void L0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + I());
        }
        i();
        r0();
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
    }

    public final short b(Context context) {
        int i2;
        try {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            InterfaceC3295x interfaceC3295xK = k();
            if (interfaceC3295xK == null) {
                return (short) 2155;
            }
            if ("unknown".equals(interfaceC3295xK.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            int iHashCode = interfaceC3295xK.hashCode();
            InMobiAdActivity.k.put(iHashCode, interfaceC3295xK);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                String string = UUID.randomUUID().toString();
                Intrinsics.e(string, "toString(...)");
                HashMap map = AbstractC3126m5.f23809a;
                String key = string.toString();
                Intrinsics.f(key, "key");
                AbstractC3126m5.f23809a.put(key, new WeakReference(interfaceC3333z6));
                intent.putExtra("loggerCacheKey", string.toString());
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strE = E();
            if (Intrinsics.a(strE, "html")) {
                i2 = 200;
            } else {
                i2 = Intrinsics.a(strE, "htmlUrl") ? 202 : 201;
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", i2);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (b0()) {
                if (C() == -1) {
                    a(System.currentTimeMillis());
                }
                if (z() > 0) {
                    intent.setFlags(603979776);
                }
            }
            Uc.f23270a.a(context, intent);
            return (short) 0;
        } catch (Exception e2) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.S0
    public void c0() {
        if (D0()) {
            super.c0();
        }
    }

    @Override // com.inmobi.media.S0
    public void g() {
        super.g();
        this.f23812Q = null;
    }

    public final void h(F0 f0) {
        short sB = b(t());
        if (f0 == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("InMobiInterstitial", "Listener was garbage collected.Unable to give callback");
                return;
            }
            return;
        }
        if (sB != 0) {
            a(true, sB);
        } else {
            f0.e();
        }
    }

    public final void i(F0 f0) {
        if (f0 == null) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a(true, (short) 2151);
            return;
        }
        Function0 function0 = this.f23812Q;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if (Q() == 8) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).b("m6", "unload has been called on this ad. Dont show. ");
            }
            AbstractC3048h7.a((byte) 2, "m6", "Failed to show Ad as creative has called unload() on the Ad");
            a(true, (short) 2239);
            return;
        }
        if (!H0()) {
            AbstractC3048h7.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).b("m6", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            AbstractC3048h7.a((byte) 1, "m6", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(true, (short) 2152);
            return;
        }
        g(f0);
        d((byte) 6);
        if (!"html".equals(E()) && !"htmlUrl".equals(E())) {
            A aV = v();
            int iHashCode = hashCode();
            C3015f6 c3015f6 = new C3015f6(this, f0);
            aV.getClass();
            A.a(iHashCode, c3015f6);
            return;
        }
        if (!W()) {
            h(f0);
            return;
        }
        b(f0, (short) 2153);
        InterfaceC3295x interfaceC3295xK = k();
        if (interfaceC3295xK != null) {
            interfaceC3295xK.b();
        }
    }

    public final void j(F0 f0) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i(f0);
        } else {
            ((ExecutorC3160o7) AbstractC3332z4.d.getX()).f23866a.post(new RunnableC0905n(21, this, f0));
        }
    }

    @Override // com.inmobi.media.S0
    public void j0() {
        if (p0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", "renderAd without internet check");
            }
            I0();
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("m6", "renderAd");
        }
        a(new C3095k6(this), new C3111l6(this));
    }

    @Override // com.inmobi.media.S0
    public void k0() {
        super.k0();
        this.f23810N = 0;
    }

    @Override // com.inmobi.media.S0
    public void m(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        super.m(gestureDetectorOnGestureListenerC3005ec);
        if (!b0()) {
            if (Q() == 2) {
                b((byte) 1);
                L0();
                return;
            }
            return;
        }
        int iIndexOf = this.g.indexOf(gestureDetectorOnGestureListenerC3005ec);
        if (iIndexOf < A()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                StringBuilder sbU = android.support.v4.media.a.u(iIndexOf, "Ignoring loaded ad with index ", " as current rendering index is ");
                sbU.append(A());
                ((A5) interfaceC3333z5).a("m6", sbU.toString());
                return;
            }
            return;
        }
        B().add(Integer.valueOf(iIndexOf));
        for (int i2 = 0; i2 < iIndexOf; i2++) {
            if (this.g.get(i2) != null) {
                return;
            }
        }
        if (Q() == 2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("m6", X8.a("m6", "TAG", "Providing success based on index ", iIndexOf));
            }
            b((byte) 1);
            i(iIndexOf);
            L0();
        }
    }

    @Override // com.inmobi.media.S0
    public void o(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        if (!b0() || !a(renderView)) {
            C0();
        }
        super.o(renderView);
    }

    @Override // com.inmobi.media.S0
    public String q() {
        return "int";
    }

    @Override // com.inmobi.media.S0
    public void q0() {
        F0 f0R = r();
        if (f0R != null) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", "callback - onFetchSuccess");
            }
            e(f0R);
            return;
        }
        b((short) 2188);
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("m6", "listener is null");
        }
    }

    @Override // com.inmobi.media.S0
    public void r0() {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).d("m6", "AdUnit " + this + " state - READY");
        }
        d((byte) 4);
        U0 u0S = s();
        u0S.getClass();
        u0S.f23246i = SystemClock.elapsedRealtime();
        u0();
        z0();
        this.f23811P.f23021a = true;
        F0 f0R = r();
        if (f0R == null || !f0R.a()) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("m6", "signaling Success");
        }
        f(f0R);
    }

    @Override // com.inmobi.media.S0
    public GestureDetectorOnGestureListenerC3005ec w() {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ecW = super.w();
        if (this.O && gestureDetectorOnGestureListenerC3005ecW != null) {
            gestureDetectorOnGestureListenerC3005ecW.e();
        }
        return gestureDetectorOnGestureListenerC3005ecW;
    }

    public static final void e(C3127m6 this$0) {
        LinkedList<C3040h> linkedListF;
        Intrinsics.f(this$0, "this$0");
        this$0.s0();
        if (this$0.b0()) {
            C3312y0 c3312y0Y = this$0.y();
            int size = (c3312y0Y == null || (linkedListF = c3312y0Y.f()) == null) ? 0 : linkedListF.size();
            for (int i2 = 1; i2 < size; i2++) {
                this$0.h(this$0.z() + 1);
                this$0.s0();
            }
        }
    }

    @Override // com.inmobi.media.S0
    public void c(String monetizationContext) {
        Intrinsics.f(monetizationContext, "monetizationContext");
        super.c("activity");
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public synchronized void d(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        super.d(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new RunnableC0898j0(this, 2));
        }
    }

    public final void a(Nd nd) {
        Intrinsics.f(nd, "<set-?>");
        this.f23811P = nd;
    }

    @Override // com.inmobi.media.S0
    public void a(byte[] bArr) {
        if (D0()) {
            super.a(bArr);
        }
    }

    public static final void a(C3127m6 this$0, F0 f0) {
        Intrinsics.f(this$0, "this$0");
        this$0.i(f0);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public synchronized void e(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        super.e(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new RunnableC0898j0(this, 3));
        }
    }

    public static final void a(C3127m6 this$0, GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        int iIndexOf = this$0.g.indexOf(renderView);
        ArrayList list = this$0.g;
        Intrinsics.f(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = this$0.b(context);
        if (sB != 0) {
            this$0.g(iIndexOf);
        }
        this$0.b(iIndexOf, sB == 0);
        Handler handlerD = this$0.D();
        if (handlerD != null) {
            handlerD.post(new RunnableC0879a(this$0, iIndexOf, 2));
        }
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        Intrinsics.f(renderView, "renderView");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).c(strE, "closeCurrentPodAd " + this);
        }
        if (b0()) {
            Integer numHigher = B().higher(Integer.valueOf(this.g.indexOf(renderView)));
            if (numHigher != null) {
                a(numHigher.intValue(), renderView, context);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.S0
    public void a(F0 f0) {
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("m6", "TAG", "handleAdScreenDismissed ");
            sbA.append((int) Q());
            ((A5) interfaceC3333z5).c("m6", sbA.toString());
        }
        if (Q() == 7) {
            int i2 = this.f23810N - 1;
            this.f23810N = i2;
            if (i2 == 1) {
                d((byte) 6);
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).d("m6", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (Q() == 6 || Q() == 8) {
            this.f23810N--;
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + I());
            }
            if (f0 != null) {
                f0.b();
                return;
            }
            InterfaceC3333z5 interfaceC3333z8 = this.j;
            if (interfaceC3333z8 != null) {
                ((A5) interfaceC3333z8).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.S0
    public void b(F0 f0) {
        if (Q() == 6) {
            int i2 = this.f23810N + 1;
            this.f23810N = i2;
            if (i2 == 1) {
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + I());
                }
                if (f0 != null) {
                    b((byte) 4);
                    d(f0);
                    return;
                }
                return;
            }
            d((byte) 7);
            return;
        }
        if (Q() == 7) {
            this.f23810N++;
        }
    }

    @Override // com.inmobi.media.S0
    public void a(boolean z2, InMobiAdRequestStatus status) {
        String strM;
        Intrinsics.f(status, "status");
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("m6", "onDidParseAfterFetch - parsingResult - " + z2);
        }
        super.a(z2, status);
        if (Q() == 2) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + I());
            }
            if (Intrinsics.a(E(), "inmobiJson") && (strM = I().m()) != null) {
                EnumC2932a7 enumC2932a7 = Cb.f22744a;
                InterfaceC3333z5 interfaceC3333z7 = this.j;
                TelemetryConfig.LoggingConfig loggingConfig = Cb.d.getLoggingConfig();
                if (interfaceC3333z7 != null) {
                    EnumC2932a7 logLevel = Cb.a("intNative", strM, loggingConfig);
                    double dB = Cb.b("intNative", strM, loggingConfig);
                    C3317y5 c3317y5 = new C3317y5(logLevel, dB);
                    Objects.toString(c3317y5);
                    Ab ab = ((A5) interfaceC3333z7).f22682a;
                    if (ab != null) {
                        Objects.toString(c3317y5);
                        Objects.toString(ab.f22699i);
                        if (!ab.f22699i.get()) {
                            C2966c7 c2966c7 = ab.f22697e;
                            c2966c7.getClass();
                            Intrinsics.f(logLevel, "logLevel");
                            c2966c7.f23484a = logLevel;
                            ab.f.f23075a = dB;
                        }
                    }
                }
            }
            q0();
        }
    }

    public final void b(F0 f0, short s) {
        a(true, s);
        d((byte) 0);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void b() {
        if (b0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", "Closing the ad as closeAll is called");
            }
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0898j0(this, 1));
            }
        }
    }

    public static final void b(C3127m6 this$0) {
        Intrinsics.f(this$0, "this$0");
        InterfaceC3333z5 interfaceC3333z5 = this$0.j;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a("S0", "clearAdPods " + this$0);
        }
        if (this$0.f23130A) {
            this$0.h();
            this$0.g.clear();
            this$0.f23146w = 0;
            this$0.x = 0;
            this$0.f23147z.clear();
        }
        InterfaceC3333z5 interfaceC3333z6 = this$0.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this$0.I());
        }
        if (this$0.r() != null) {
            F0 f0R = this$0.r();
            if (f0R != null) {
                f0R.b();
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z7 = this$0.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.Te
    public void a(C3040h ad, boolean z2, short s) {
        Intrinsics.f(ad, "ad");
        if (!z2) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
            return;
        }
        try {
            super.a(ad, z2, s);
        } catch (IllegalStateException e2) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                StringBuilder sbA = H6.a("m6", "TAG", "Exception while onVastProcessCompleted : ");
                sbA.append(e2.getMessage());
                ((A5) interfaceC3333z5).b("m6", sbA.toString());
            }
        }
        C3040h c3040hM = m();
        if (c3040hM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
        } else if (c3040hM.G()) {
            b(true);
            V();
        } else {
            a(c3040hM);
        }
    }

    @Override // com.inmobi.media.S0
    public void a(Z placement, boolean z2) {
        Intrinsics.f(placement, "placement");
        super.a(placement, z2);
        if (!z2) {
            if (Intrinsics.a(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    InterfaceC3333z5 interfaceC3333z5 = this.j;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).d("m6", "AdUnit " + this + " state - CREATED");
                    }
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (short) 0);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.a(I(), placement) && 2 == Q()) {
            InterfaceC3333z5 interfaceC3333z6 = this.j;
            if (interfaceC3333z6 != null) {
                ((A5) interfaceC3333z6).a("m6", "Asset are ready now");
            }
            if (a0()) {
                c(true);
                f();
            } else {
                r0();
            }
        }
    }

    @Override // com.inmobi.media.S0
    public void a(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, short s) {
        super.a(gestureDetectorOnGestureListenerC3005ec, s);
        if (b0()) {
            int iIndexOf = this.g.indexOf(gestureDetectorOnGestureListenerC3005ec);
            boolean z2 = false;
            S0.a(this, iIndexOf, false, 2, null);
            int size = this.g.size();
            boolean z3 = true;
            boolean z4 = true;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = z3;
                    i2 = -1;
                    break;
                }
                if (i2 != iIndexOf && this.g.get(i2) != null) {
                    if (B().contains(Integer.valueOf(i2))) {
                        break;
                    }
                    z3 = false;
                    z4 = false;
                }
                i2++;
            }
            if (i2 != -1) {
                if (z4 && Q() == 2) {
                    b((byte) 1);
                    i(i2);
                    InterfaceC3333z5 interfaceC3333z5 = this.j;
                    if (interfaceC3333z5 != null) {
                        StringBuilder sbA = H6.a("m6", "TAG", "Providing success based on currIndex ");
                        sbA.append(A());
                        sbA.append(" as ");
                        sbA.append(iIndexOf);
                        sbA.append(" failed");
                        ((A5) interfaceC3333z5).a("m6", sbA.toString());
                    }
                    L0();
                    return;
                }
                return;
            }
            if (z2 && Q() == 2) {
                InterfaceC3333z5 interfaceC3333z6 = this.j;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
                return;
            }
            return;
        }
        if (Q() == 2) {
            InterfaceC3333z5 interfaceC3333z7 = this.j;
            if (interfaceC3333z7 != null) {
                ((A5) interfaceC3333z7).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s);
        }
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public void a(int i2, GestureDetectorOnGestureListenerC3005ec renderView, Context context) {
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Intrinsics.f(renderView, "renderView");
        if (!b0()) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).a("m6", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (B().contains(Integer.valueOf(i2)) && i2 > this.g.indexOf(renderView) && i2 < this.g.size() && this.g.get(i2) != null && ((gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) this.g.get(i2)) == null || gestureDetectorOnGestureListenerC3005ec.x0)) {
            if (context == null) {
                context = t();
            }
            super.a(i2, renderView, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new RunnableC0887e(this, renderView, context, 6));
                return;
            }
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).a("m6", "Cannot show an pod ad with invalid index passed");
        }
        b(this.g.indexOf(renderView), false);
    }

    public static final void a(C3127m6 this$0, int i2) {
        Intrinsics.f(this$0, "this$0");
        this$0.a(i2, false);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC2925a0
    public boolean a(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        if (b0()) {
            if (B().higher(Integer.valueOf(this.g.indexOf(renderView))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.InterfaceC3007ee
    public void a(byte b2) {
        if (b2 == 1) {
            if (b0()) {
                if (Q() == 2) {
                    if (B().isEmpty()) {
                        InterfaceC3333z5 interfaceC3333z5 = this.j;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).b("m6", "RenderView time out, none of the ad provided success");
                        }
                        h();
                        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                        return;
                    }
                    b((byte) 1);
                    InterfaceC3333z5 interfaceC3333z6 = this.j;
                    if (interfaceC3333z6 != null) {
                        StringBuilder sbA = H6.a("m6", "TAG", "RenderView time out, providing success based on ");
                        sbA.append(B().first());
                        ((A5) interfaceC3333z6).a("m6", sbA.toString());
                    }
                    Integer numFirst = B().first();
                    Intrinsics.e(numFirst, "first(...)");
                    i(numFirst.intValue());
                    L0();
                    int size = this.g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!B().contains(Integer.valueOf(i2))) {
                            S0.a(this, i2, false, 2, null);
                        }
                    }
                    return;
                }
                h();
                return;
            }
            super.a(b2);
            return;
        }
        super.a(b2);
    }

    @Override // com.inmobi.media.S0, com.inmobi.media.AbstractC3037gc
    public void a(GestureDetectorOnGestureListenerC3005ec renderView, boolean z2) {
        Intrinsics.f(renderView, "renderView");
        super.a(renderView, z2);
        byte bQ = Q();
        if (bQ == 4) {
            this.f23812Q = new C3079j6(this, z2 ? (short) 2220 : (short) 2219);
            return;
        }
        if (bQ != 6) {
            if (bQ == 7) {
                short s = z2 ? (short) 2224 : (short) 2223;
                AbstractC3048h7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                InterfaceC3333z5 interfaceC3333z5 = this.j;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("m6", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z2, s);
                Activity fullScreenActivity = renderView.getFullScreenActivity();
                if (fullScreenActivity != null) {
                    InterfaceC3333z5 interfaceC3333z6 = renderView.f23587i;
                    if (interfaceC3333z6 != null) {
                        String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z6).c(TAG, "fullScreenActivity is not null and finishing");
                    }
                    fullScreenActivity.finish();
                }
                a(r());
                return;
            }
            return;
        }
        short s2 = z2 ? (short) 2222 : (short) 2221;
        AbstractC3048h7.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        InterfaceC3333z5 interfaceC3333z7 = this.j;
        if (interfaceC3333z7 != null) {
            ((A5) interfaceC3333z7).b("m6", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        Activity fullScreenActivity2 = renderView.getFullScreenActivity();
        if (fullScreenActivity2 != null) {
            InterfaceC3333z5 interfaceC3333z8 = renderView.f23587i;
            if (interfaceC3333z8 != null) {
                String TAG2 = GestureDetectorOnGestureListenerC3005ec.a1;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z8).c(TAG2, "fullScreenActivity is not null and finishing");
            }
            fullScreenActivity2.finish();
        }
        if (this.f23810N == 0) {
            a(true, s2);
        } else {
            renderView.a(z2, s2);
            a(r());
        }
    }
}
