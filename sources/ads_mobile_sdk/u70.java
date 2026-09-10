package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import complexometry.formularize;
import java.util.LinkedHashMap;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.archbishopric;
import saneness.carport;
import saneness.coffeecake;
import saneness.decarock;
import saneness.dialog;
import saneness.dustman;
import saneness.eia;
import saneness.formularism;
import saneness.hoiden;
import saneness.igo;
import saneness.imperceivable;
import saneness.pareve;
import saneness.punjab;
import saneness.recumbency;
import saneness.revoltingly;
import saneness.sealless;
import saneness.sunlike;
import saneness.thingamy;
import saneness.tuan;

/* JADX INFO: loaded from: classes.dex */
public final class u70 implements decarock {
    public sg2 A;
    public coffeecake A0;
    public coffeecake B;
    public coffeecake B0;
    public sp1 C;
    public coffeecake C0;
    public rp1 D;
    public coffeecake D0;
    public coffeecake E;
    public coffeecake E0;
    public mq1 F;
    public coffeecake F0;
    public hb0 G;
    public coffeecake G0;
    public kq1 H;
    public coffeecake H0;
    public coffeecake I;
    public coffeecake I0;
    public ny1 J;
    public coffeecake J0;
    public h21 K;
    public coffeecake K0;
    public b43 L;
    public coffeecake L0;
    public coffeecake M;
    public coffeecake M0;
    public coffeecake N;
    public coffeecake N0;
    public c43 O;
    public coffeecake O0;
    public g43 P;
    public coffeecake P0;
    public i43 Q;
    public coffeecake Q0;
    public hb0 R;
    public j43 S;
    public k43 T;
    public l43 U;
    public m43 V;
    public d43 W;
    public e43 X;
    public f43 Y;
    public n43 Z;
    public final h1 a;
    public h43 a0;
    public final i60 b;
    public p33 b0;
    public coffeecake c;
    public iu1 c0;
    public h21 d;
    public lq1 d0;
    public h21 e;
    public iq1 e0;
    public b80 f;
    public coffeecake f0;
    public b80 g;
    public h21 g0;
    public b80 h;
    public coffeecake h0;
    public coffeecake i;
    public jq1 i0;
    public h21 j;
    public h21 j0;
    public coffeecake k;
    public h21 k0;
    public h21 l;
    public h21 l0;
    public hb0 m;
    public coffeecake m0;
    public bh1 n;
    public coffeecake n0;
    public coffeecake o;
    public kk1 o0;
    public ch1 p;
    public coffeecake p0;
    public coffeecake q;
    public h21 q0;
    public h21 r;
    public coffeecake r0;
    public h21 s;
    public coffeecake s0;
    public h21 t;
    public coffeecake t0;
    public h21 u;
    public coffeecake u0;
    public coffeecake v;
    public coffeecake v0;
    public h21 w;
    public coffeecake w0;
    public coffeecake x;
    public coffeecake x0;
    public coffeecake y;
    public coffeecake y0;
    public coffeecake z;
    public coffeecake z0;

    public u70(i60 i60Var, formularize formularizeVar, yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var, carport carportVar, hj1 hj1Var, PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, u20 u20Var, JsonObject jsonObject, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
        this.b = i60Var;
        this.a = h1Var;
        a(h1Var, urVar, xb2Var, j71Var, le2Var, o6Var, hj1Var, jsonObject);
        a(yf2Var, carportVar, u20Var, dernVar);
        g();
        a(formularizeVar, num, jm2Var, a22Var);
        a(perAdNativeJavscriptEngineJsContext);
        h();
    }

    @Override // saneness.kaolinize
    public final imperceivable a() {
        return (InternalNativeAd) this.D0.get();
    }

    @Override // saneness.decarock
    public final thingamy d() {
        ImmutableMap.saneness sanenessVarBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        h1 adConfiguration = this.a;
        vy1 openGmsgHandler = (vy1) this.R.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(openGmsgHandler, "openGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/open", new a32(adConfiguration, openGmsgHandler));
        h1 adConfiguration2 = this.a;
        cp clickGmsgHandler = (cp) this.N.get();
        Intrinsics.checkNotNullParameter(adConfiguration2, "adConfiguration");
        Intrinsics.checkNotNullParameter(clickGmsgHandler, "clickGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/click", new a32(adConfiguration2, clickGmsgHandler));
        h1 adConfiguration3 = this.a;
        d30 customClickGmsgHandler = (d30) this.G0.get();
        Intrinsics.checkNotNullParameter(adConfiguration3, "adConfiguration");
        Intrinsics.checkNotNullParameter(customClickGmsgHandler, "customClickGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeAdCustomClick", new a32(adConfiguration3, customClickGmsgHandler));
        h1 adConfiguration4 = this.a;
        mn1 nativeClickRecordedGmsgHandler = (mn1) this.H0.get();
        Intrinsics.checkNotNullParameter(adConfiguration4, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeClickRecordedGmsgHandler, "nativeClickRecordedGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/clickRecorded", new a32(adConfiguration4, nativeClickRecordedGmsgHandler));
        h1 adConfiguration5 = this.a;
        vn1 nativeImpressionEventGmsgHandler = (vn1) this.I0.get();
        Intrinsics.checkNotNullParameter(adConfiguration5, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeImpressionEventGmsgHandler, "nativeImpressionEventGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeImpression", new a32(adConfiguration5, nativeImpressionEventGmsgHandler));
        h1 adConfiguration6 = this.a;
        xn1 nativeImpressionResponseGmsgHandler = (xn1) this.J0.get();
        Intrinsics.checkNotNullParameter(adConfiguration6, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeImpressionResponseGmsgHandler, "nativeImpressionResponseGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeImpressionFlowControl", new a32(adConfiguration6, nativeImpressionResponseGmsgHandler));
        h1 adConfiguration7 = this.a;
        pb1 loadHtmlGmsgHandler = (pb1) this.K0.get();
        Intrinsics.checkNotNullParameter(adConfiguration7, "adConfiguration");
        Intrinsics.checkNotNullParameter(loadHtmlGmsgHandler, "loadHtmlGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/loadHtml", new a32(adConfiguration7, loadHtmlGmsgHandler));
        h1 adConfiguration8 = this.a;
        zn2 showOverlayGmsgHandler = (zn2) this.M0.get();
        Intrinsics.checkNotNullParameter(adConfiguration8, "adConfiguration");
        Intrinsics.checkNotNullParameter(showOverlayGmsgHandler, "showOverlayGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/showOverlay", new a32(adConfiguration8, showOverlayGmsgHandler));
        h1 adConfiguration9 = this.a;
        ks0 hideOverlayGmsgHandler = (ks0) this.N0.get();
        Intrinsics.checkNotNullParameter(adConfiguration9, "adConfiguration");
        Intrinsics.checkNotNullParameter(hideOverlayGmsgHandler, "hideOverlayGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/hideOverlay", new a32(adConfiguration9, hideOverlayGmsgHandler));
        h1 adConfiguration10 = this.a;
        dc1 logScionEventGmsgHandler = (dc1) this.O0.get();
        Intrinsics.checkNotNullParameter(adConfiguration10, "adConfiguration");
        Intrinsics.checkNotNullParameter(logScionEventGmsgHandler, "logScionEventGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/logScionEvent", new a32(adConfiguration10, logScionEventGmsgHandler));
        h1 adConfiguration11 = this.a;
        vb1 loadNativePolicyValidatorGmsgHandler = (vb1) this.P0.get();
        Intrinsics.checkNotNullParameter(adConfiguration11, "adConfiguration");
        Intrinsics.checkNotNullParameter(loadNativePolicyValidatorGmsgHandler, "loadNativePolicyValidatorGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/loadNativeAdPolicyViolations", new a32(adConfiguration11, loadNativePolicyValidatorGmsgHandler));
        h1 adConfiguration12 = this.a;
        co2 showValidatorOverlayGmsgHandler = (co2) this.Q0.get();
        Intrinsics.checkNotNullParameter(adConfiguration12, "adConfiguration");
        Intrinsics.checkNotNullParameter(showValidatorOverlayGmsgHandler, "showValidatorOverlayGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/showValidatorOverlay", new a32(adConfiguration12, showValidatorOverlayGmsgHandler));
        ImmutableMap gmsgHandlers = sanenessVarBuilderWithExpectedSize.attabal();
        Intrinsics.checkNotNullParameter(gmsgHandlers, "gmsgHandlers");
        ImmutableMap modifiers = ImmutableMap.of("GmsgHandlerInstaller", new z22(gmsgHandlers));
        Intrinsics.checkNotNullParameter(modifiers, "modifiers");
        return new thingamy(modifiers);
    }

    @Override // saneness.kaolinize
    public final igo f() {
        return (igo) this.F0.get();
    }

    public final void g() {
        i60 i60Var = this.b;
        dp dpVar = new dp(i60Var.M, this.m, this.M, i60Var.b4, this.d);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(dpVar);
        this.N = qd0Var;
        this.O = new c43(qd0Var);
        i60 i60Var2 = this.b;
        this.P = new g43(i60Var2.R3);
        this.Q = new i43(i60Var2.e3);
        hb0 hb0Var = new hb0();
        this.R = hb0Var;
        this.S = new j43(hb0Var);
        this.T = new k43(i60Var2.Z);
        this.U = new l43(i60Var2.Q3);
        this.V = new m43(i60Var2.P3);
        this.W = new d43(i60Var2.O0);
        this.X = new e43(i60Var2.M0);
        this.Y = new f43();
        this.Z = new n43(new qd0(new s0(this.I)));
        h21 h21Var = bd1.b;
        sealless seallessVar = new sealless(12);
        seallessVar.attabal("/appEvent", this.L);
        seallessVar.attabal("/click", this.O);
        seallessVar.attabal("/delayPageLoaded", this.P);
        seallessVar.attabal("/httpTrack", this.Q);
        seallessVar.attabal("/open", this.S);
        seallessVar.attabal("/result", this.T);
        seallessVar.attabal("/video", this.U);
        seallessVar.attabal("/videoMeta", this.V);
        seallessVar.attabal("/close", this.W);
        seallessVar.attabal("/customClose", this.X);
        seallessVar.attabal("/delayPageClosed", this.Y);
        seallessVar.attabal("/backButton", this.Z);
        this.a0 = new h43(new bd1(seallessVar.a));
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(3);
        h43 h43Var = this.a0;
        if (h43Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("GmsgHandlerInstaller", h43Var);
        linkedHashMapAttabal.put("SetFollowUrls", sunlike.f37323attabal);
        linkedHashMapAttabal.put("SetExpanded", dialog.f37125attabal);
        o43 o43Var = new o43(new bd1(linkedHashMapAttabal));
        i60 i60Var3 = this.b;
        h21 h21Var2 = i60Var3.d;
        coffeecake coffeecakeVar = i60Var3.v;
        coffeecake coffeecakeVar2 = i60Var3.u;
        coffeecake coffeecakeVar3 = i60Var3.t;
        coffeecake coffeecakeVar4 = i60Var3.p;
        hb0 hb0Var2 = i60Var3.q;
        coffeecake coffeecakeVar5 = i60Var3.x;
        h21 h21Var3 = this.w;
        h21 h21Var4 = this.d;
        coffeecake coffeecakeVar6 = i60Var3.G;
        hb0 hb0Var3 = this.m;
        coffeecake coffeecakeVar7 = this.y;
        coffeecake coffeecakeVar8 = i60Var3.L;
        h21 h21Var5 = this.K;
        coffeecake coffeecakeVar9 = this.i;
        coffeecake coffeecakeVar10 = i60Var3.V;
        coffeecake coffeecakeVar11 = this.I;
        coffeecake coffeecakeVar12 = i60Var3.H;
        this.b0 = new p33(h21Var2, coffeecakeVar, coffeecakeVar2, coffeecakeVar3, coffeecakeVar4, hb0Var2, coffeecakeVar5, h21Var3, h21Var4, coffeecakeVar6, hb0Var3, coffeecakeVar7, coffeecakeVar8, h21Var5, coffeecakeVar9, coffeecakeVar10, o43Var, coffeecakeVar11, coffeecakeVar12);
        h21 h21Var6 = this.e;
        this.c0 = new iu1(h21Var4, h21Var6, i60Var3.n1, i60Var3.t2, coffeecakeVar4);
        qd0 qd0Var2 = new qd0(new s22(h21Var4, i60Var3.g, h21Var6, coffeecakeVar3, coffeecakeVar12));
        hb0 hb0Var4 = this.R;
        i60 i60Var4 = this.b;
        hb0.a(hb0Var4, new qd0(new wy1(i60Var4.d, i60Var4.p, i60Var4.L, i60Var4.M, this.m, i60Var4.G, this.J, this.b0, this.o, this.M, this.w, i60Var4.F1, i60Var4.b4, this.d, this.x, this.c0, qd0Var2)));
        this.d0 = new lq1(this.R);
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(3);
        mq1 mq1Var = this.F;
        if (mq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/sendMessageToSdk", mq1Var);
        kq1 kq1Var = this.H;
        if (kq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/hideValidatorOverlay", kq1Var);
        lq1 lq1Var = this.d0;
        if (lq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/open", lq1Var);
        this.e0 = new iq1(new bd1(linkedHashMapAttabal2));
    }

    public final void h() {
        ao2 ao2Var = new ao2(this.b.u, this.h0, this.L0);
        Object obj = qd0.c;
        this.M0 = new qd0(ao2Var);
        this.N0 = new qd0(new ls0(this.b.v, this.h0, this.L0));
        this.O0 = new qd0(new ec1(this.b.n0, this.d));
        i60 i60Var = this.b;
        this.P0 = new qd0(new wb1(i60Var.p, this.h0, this.u, i60Var.X0, i60Var.v, this.q));
        this.Q0 = new qd0(new do2(this.b.u, this.h0));
    }

    public final void a(yf2 yf2Var, carport carportVar, u20 u20Var, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
        this.t = h21.a(dernVar);
        this.u = h21.a(carportVar);
        pareve pareveVar = punjab.f37269attabal;
        Object obj = qd0.c;
        this.v = new qd0(pareveVar);
        h21 h21VarA = h21.a(yf2Var);
        this.w = h21VarA;
        i60 i60Var = this.b;
        qd0 qd0Var = new qd0(new hk2(i60Var.x, this.d, i60Var.L, i60Var.z, h21VarA, i60Var.p));
        this.x = qd0Var;
        i60 i60Var2 = this.b;
        this.y = new qd0(new ux1(i60Var2.u, i60Var2.t, this.r, this.d, i60Var2.I, this.s, i60Var2.p, qd0Var));
        i60 i60Var3 = this.b;
        this.z = new qd0(new xb0(i60Var3.t, i60Var3.p, this.i, i60Var3.H));
        i60 i60Var4 = this.b;
        this.A = new sg2(this.d, this.e, new tg2(i60Var4.p, i60Var4.t2, i60Var4.g, i60Var4.t, i60Var4.z, i60Var4.B0, i60Var4.r0, i60Var4.H, i60Var4.q));
        qd0 qd0Var2 = new qd0(new am2(this.u));
        this.B = qd0Var2;
        this.C = new sp1(this.d, qd0Var2);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        sp1 sp1Var = this.C;
        if (sp1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("/sendMessageToSdk", sp1Var);
        this.D = new rp1(new bd1(linkedHashMapAttabal));
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(1);
        rp1 rp1Var = this.D;
        if (rp1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("GmsgHandlerInstaller", rp1Var);
        tp1 tp1Var = new tp1(new bd1(linkedHashMapAttabal2));
        i60 i60Var5 = this.b;
        this.E = new qd0(new xp1(i60Var5.H, i60Var5.V, tp1Var));
        h21 h21Var2 = this.d;
        this.F = new mq1(h21Var2, this.B);
        hb0 hb0Var = new hb0();
        this.G = hb0Var;
        this.H = new kq1(h21Var2, hb0Var);
        qd0 qd0Var3 = new qd0(archbishopric.f37059attabal);
        this.I = qd0Var3;
        i60 i60Var6 = this.b;
        this.J = new ny1(i60Var6.d, i60Var6.v, i60Var6.u, i60Var6.t, i60Var6.p, i60Var6.q, i60Var6.x, this.l, this.w, this.d, i60Var6.G, this.m, this.y, i60Var6.L, qd0Var3);
        this.K = h21.a(u20Var);
        this.L = new b43(new qd0(new od(this.m)));
        sg2 sg2Var = this.A;
        coffeecake coffeecakeVar = this.v;
        i60 i60Var7 = this.b;
        this.M = new qd0(new ph(sg2Var, coffeecakeVar, i60Var7.e0, i60Var7.o0, i60Var7.p, i60Var7.q));
    }

    public final void a(formularize formularizeVar, Integer num, jm2 jm2Var, a22 a22Var) {
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        iq1 iq1Var = this.e0;
        if (iq1Var != null) {
            linkedHashMapAttabal.put("GmsgHandlerInstaller", iq1Var);
            nq1 nq1Var = new nq1(new bd1(linkedHashMapAttabal));
            i60 i60Var = this.b;
            dq1 dq1Var = new dq1(i60Var.H, i60Var.V, nq1Var);
            Object obj = qd0.c;
            this.f0 = new qd0(dq1Var);
            h21 h21VarA = h21.a(a22Var);
            this.g0 = h21VarA;
            h21 h21Var2 = this.r;
            i60 i60Var2 = this.b;
            qd0 qd0Var = new qd0(new zi0(h21Var2, i60Var2.v, i60Var2.t, i60Var2.M, this.s, i60Var2.X0, this.t, i60Var2.H, this.i, i60Var2.g, this.u, this.v, this.y, this.z, this.A, this.m, this.E, this.f0, this.w, this.d, i60Var2.g4, i60Var2.p, this.x, i60Var2.q, h21VarA));
            this.h0 = qd0Var;
            hb0.a(this.G, new qd0(new os0(this.b.v, this.q, qd0Var)));
            this.i0 = new jq1(this.G);
            this.j0 = eia.f37136attabal;
            this.k0 = h21.a(jm2Var);
            this.l0 = h21.a(num);
            this.m0 = new qd0(hoiden.f37167attabal);
            this.n0 = new qd0(new rr(this.w));
            this.o0 = new kk1(new b80(this.t));
            int i = xm2.f3295attabal;
            List listDern = dustman.dern(1);
            List listDern2 = dustman.dern(1);
            coffeecake coffeecakeVar = this.n0;
            boolean z = wm2.c;
            if (!z && coffeecakeVar == null) {
                throw new AssertionError("Codegen error? Null provider");
            }
            listDern.add(coffeecakeVar);
            kk1 kk1Var = this.o0;
            if (!z && kk1Var == null) {
                throw new AssertionError("Codegen error? Null provider");
            }
            listDern2.add(kk1Var);
            if (!z && dustman.saneness(listDern)) {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            }
            if (!z && dustman.saneness(listDern2)) {
                throw new AssertionError("Codegen error?  Duplicates in the provider list");
            }
            xm2 xm2Var = new xm2(listDern, listDern2);
            i60 i60Var3 = this.b;
            this.p0 = new qd0(new n23(i60Var3.H, i60Var3.x3, i60Var3.M, this.A, this.j0, this.k0, this.d, this.i, this.l0, i60Var3.g, this.m0, i60Var3.b4, this.g0, this.m, i60Var3.C2, xm2Var, i60Var3.p));
            h21 h21VarA2 = h21.a(formularizeVar);
            this.q0 = h21VarA2;
            this.r0 = new qd0(new g7(this.b.N2, h21VarA2));
            h21 h21Var3 = this.d;
            i60 i60Var4 = this.b;
            this.s0 = new qd0(new g22(h21Var3, i60Var4.c4, i60Var4.p));
            this.t0 = new qd0(new ho1(this.u));
            this.u0 = new qd0(new zp1(this.E));
            sealless seallessVar = new sealless(10);
            seallessVar.attabal("MraidAdEventListener", this.p);
            seallessVar.attabal("hideValidatorOverlayGmsgHandlerAsAdEventListener", this.i0);
            seallessVar.attabal("TrackingPingMonitorAsAdEventListener", this.p0);
            seallessVar.attabal("DelegatingAdEventListener", this.z);
            seallessVar.attabal("AdStatsTrackerListener", this.r0);
            seallessVar.attabal("PlayPrewarmListener", this.s0);
            seallessVar.attabal("NativeJavascriptEngineLifeCycleMonitor", this.t0);
            seallessVar.attabal("NativeOnePointFiveOverlayMonitor", this.u0);
            seallessVar.attabal("SafeBrowsingLifecycleMonitor", this.x);
            seallessVar.attabal("OmidMonitorAsAdEventListener", this.y);
            hb0.a(this.m, new qd0(new f2(this.b.t, new bd1(seallessVar.a), this.d)));
            qd0 qd0Var2 = new qd0(new g51(this.s));
            this.v0 = qd0Var2;
            i60 i60Var5 = this.b;
            this.w0 = new qd0(new hm1(i60Var5.v, i60Var5.t, this.s, i60Var5.p, qd0Var2, i60Var5.l1, this.q0, this.r));
            return;
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }

    public final void a(PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext) {
        h21 h21Var = this.q0;
        i60 i60Var = this.b;
        sg0 sg0Var = new sg0(h21Var, i60Var.n0, this.d, i60Var.t);
        Object obj = qd0.c;
        this.x0 = new qd0(sg0Var);
        this.y0 = new qd0(new lm1(this.h0));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(2);
        coffeecake coffeecakeVar = this.x0;
        if (coffeecakeVar != null) {
            linkedHashMapAttabal.put("FirebaseAnalyticsAdEventListener", coffeecakeVar);
            coffeecake coffeecakeVar2 = this.y0;
            if (coffeecakeVar2 != null) {
                this.z0 = new qd0(new g8(this.b.v, revoltingly.attabal(linkedHashMapAttabal, "NativeAdViewVisibilityChangedEventListener", coffeecakeVar2, linkedHashMapAttabal)));
                this.A0 = new qd0(new vo1(this.b.p, this.h0));
                LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(1);
                coffeecake coffeecakeVar3 = this.A0;
                if (coffeecakeVar3 != null) {
                    this.B0 = new qd0(new nd1(this.b.v, revoltingly.attabal(linkedHashMapAttabal2, "NativeMediaViewFullyVisibleEventListener", coffeecakeVar3, linkedHashMapAttabal2)));
                    LinkedHashMap linkedHashMapAttabal3 = dustman.attabal(2);
                    coffeecake coffeecakeVar4 = this.z0;
                    if (coffeecakeVar4 != null) {
                        linkedHashMapAttabal3.put("AdVisibilityChangedEventEmitter", coffeecakeVar4);
                        coffeecake coffeecakeVar5 = this.B0;
                        if (coffeecakeVar5 != null) {
                            qd0 qd0Var = new qd0(new w7(this.b.v, revoltingly.attabal(linkedHashMapAttabal3, "MediaViewFullyVisibleEventEmitter", coffeecakeVar5, linkedHashMapAttabal3)));
                            i60 i60Var2 = this.b;
                            this.C0 = new qd0(new pm1(new qd0(new nm1(i60Var2.v, qd0Var, i60Var2.y2, i60Var2.g, i60Var2.p)), this.y0, this.A0));
                            b80 b80Var = new b80(h21.a(perAdNativeJavscriptEngineJsContext));
                            i60 i60Var3 = this.b;
                            this.D0 = new qd0(new n61(i60Var3.v, this.c, this.d, this.e, this.i, this.j, this.m, this.z, this.s, this.h0, this.w0, this.C0, this.v0, b80Var, i60Var3.q1, this.x, i60Var3.q, this.g0));
                            coffeecake coffeecakeVar6 = this.b.t;
                            h21 h21Var3 = bd1.b;
                            this.E0 = new qd0(new rh2(coffeecakeVar6, h21Var3));
                            this.F0 = new qd0(new iy2(this.b.t, this.d, this.m, this.E0, new qd0(new nz2(this.b.t, h21Var3)), eia.f37136attabal));
                            i60 i60Var4 = this.b;
                            new qd0(new yw1(i60Var4.I, this.d, i60Var4.p, i60Var4.u));
                            this.G0 = new qd0(new e30(this.m));
                            this.H0 = new qd0(new nn1(this.m));
                            this.I0 = new qd0(new wn1(this.m));
                            this.J0 = new qd0(new yn1(this.m, this.A));
                            this.K0 = new qd0(new qb1(this.h0, this.u));
                            i60 i60Var5 = this.b;
                            this.L0 = new qd0(new tr1(i60Var5.d, i60Var5.x, this.c, i60Var5.s0, this.j, i60Var5.g));
                            return;
                        }
                        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                    }
                    throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
                }
                throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
            }
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }

    public final void a(h1 h1Var, ur urVar, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, hj1 hj1Var, JsonObject jsonObject) {
        formularism formularismVar = recumbency.f37287attabal;
        Object obj = qd0.c;
        this.c = new qd0(formularismVar);
        this.d = h21.a(h1Var);
        this.e = h21.a(urVar);
        this.f = new b80(h21.a(xb2Var));
        this.g = new b80(h21.a(j71Var));
        this.h = new b80(h21.a(le2Var));
        this.i = new qd0(new sr(this.f, this.g, this.h, new b80(h21.a(o6Var))));
        h21 h21Var = eia.f37136attabal;
        this.j = h21Var;
        i60 i60Var = this.b;
        this.k = new qd0(new ji1(i60Var.a4, h21Var, i60Var.v));
        this.l = h21Var;
        hb0 hb0Var = new hb0();
        this.m = hb0Var;
        this.n = new bh1(hb0Var);
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        bh1 bh1Var = this.n;
        if (bh1Var != null) {
            linkedHashMapAttabal.put("AdEventListener", bh1Var);
            qd0 qd0Var = new qd0(new og1(this.b.t, new bd1(linkedHashMapAttabal)));
            i60 i60Var2 = this.b;
            qd0 qd0Var2 = new qd0(new rh1(i60Var2.a4, i60Var2.v, i60Var2.t, this.k, this.l, i60Var2.G, qd0Var));
            this.o = qd0Var2;
            this.p = new ch1(new qd0(new yf1(qd0Var2)));
            this.q = new qd0(tuan.f37347attabal);
            this.r = h21.a(jsonObject);
            this.s = h21.a(hj1Var);
            return;
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }
}
