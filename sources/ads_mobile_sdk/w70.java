package ads_mobile_sdk;

import android.view.View;
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
import saneness.ascolichen;
import saneness.carport;
import saneness.coffeecake;
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
public final class w70 implements ascolichen {
    public coffeecake A;
    public coffeecake A0;
    public sg2 B;
    public coffeecake B0;
    public coffeecake C;
    public coffeecake C0;
    public sp1 D;
    public coffeecake D0;
    public rp1 E;
    public coffeecake E0;
    public coffeecake F;
    public coffeecake F0;
    public mq1 G;
    public coffeecake G0;
    public hb0 H;
    public coffeecake H0;
    public kq1 I;
    public coffeecake I0;
    public coffeecake J;
    public coffeecake J0;
    public ny1 K;
    public coffeecake K0;
    public h21 L;
    public coffeecake L0;
    public b43 M;
    public coffeecake M0;
    public coffeecake N;
    public coffeecake N0;
    public coffeecake O;
    public coffeecake O0;
    public c43 P;
    public coffeecake P0;
    public g43 Q;
    public coffeecake Q0;
    public i43 R;
    public coffeecake R0;
    public hb0 S;
    public coffeecake S0;
    public j43 T;
    public coffeecake T0;
    public k43 U;
    public coffeecake U0;
    public l43 V;
    public coffeecake V0;
    public m43 W;
    public coffeecake W0;
    public d43 X;
    public coffeecake X0;
    public e43 Y;
    public coffeecake Y0;
    public f43 Z;
    public coffeecake Z0;
    public final h1 a;
    public n43 a0;
    public coffeecake a1;
    public final i60 b;
    public h43 b0;
    public coffeecake b1;
    public coffeecake c;
    public p33 c0;
    public coffeecake c1;
    public h21 d;
    public iu1 d0;
    public coffeecake d1;
    public h21 e;
    public lq1 e0;
    public coffeecake e1;
    public b80 f;
    public bd1 f0;
    public b80 g;
    public iq1 g0;
    public b80 h;
    public coffeecake h0;
    public coffeecake i;
    public h21 i0;
    public h21 j;
    public coffeecake j0;
    public b80 k;
    public jq1 k0;
    public coffeecake l;
    public b80 l0;
    public h21 m;
    public h21 m0;
    public hb0 n;
    public h21 n0;
    public bh1 o;
    public coffeecake o0;
    public coffeecake p;
    public coffeecake p0;
    public ch1 q;
    public kk1 q0;
    public coffeecake r;
    public coffeecake r0;
    public h21 s;
    public h21 s0;
    public h21 t;
    public coffeecake t0;
    public h21 u;
    public coffeecake u0;
    public h21 v;
    public coffeecake v0;
    public coffeecake w;
    public coffeecake w0;
    public h21 x;
    public coffeecake x0;
    public coffeecake y;
    public bd1 y0;
    public coffeecake z;
    public coffeecake z0;

    public w70(i60 i60Var, formularize formularizeVar, yf2 yf2Var, Integer num, h1 h1Var, ur urVar, jm2 jm2Var, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, a22 a22Var, carport carportVar, hj1 hj1Var, PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, u20 u20Var, JsonObject jsonObject, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar, View view, gq0 gq0Var) {
        this.b = i60Var;
        this.a = h1Var;
        a(h1Var, urVar, xb2Var, j71Var, le2Var, o6Var, jsonObject, gq0Var);
        a(yf2Var, carportVar, hj1Var, u20Var, dernVar);
        g();
        a(formularizeVar, num, jm2Var, a22Var, view);
        a(perAdNativeJavscriptEngineJsContext);
        h();
    }

    @Override // saneness.kaolinize
    public final imperceivable a() {
        return (InternalNativeAd) this.H0.get();
    }

    @Override // saneness.decarock
    public final thingamy d() {
        ImmutableMap.saneness sanenessVarBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(12);
        h1 adConfiguration = this.a;
        vy1 openGmsgHandler = (vy1) this.S.get();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(openGmsgHandler, "openGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/open", new a32(adConfiguration, openGmsgHandler));
        h1 adConfiguration2 = this.a;
        cp clickGmsgHandler = (cp) this.O.get();
        Intrinsics.checkNotNullParameter(adConfiguration2, "adConfiguration");
        Intrinsics.checkNotNullParameter(clickGmsgHandler, "clickGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/click", new a32(adConfiguration2, clickGmsgHandler));
        h1 adConfiguration3 = this.a;
        d30 customClickGmsgHandler = (d30) this.K0.get();
        Intrinsics.checkNotNullParameter(adConfiguration3, "adConfiguration");
        Intrinsics.checkNotNullParameter(customClickGmsgHandler, "customClickGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeAdCustomClick", new a32(adConfiguration3, customClickGmsgHandler));
        h1 adConfiguration4 = this.a;
        mn1 nativeClickRecordedGmsgHandler = (mn1) this.L0.get();
        Intrinsics.checkNotNullParameter(adConfiguration4, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeClickRecordedGmsgHandler, "nativeClickRecordedGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/clickRecorded", new a32(adConfiguration4, nativeClickRecordedGmsgHandler));
        h1 adConfiguration5 = this.a;
        vn1 nativeImpressionEventGmsgHandler = (vn1) this.M0.get();
        Intrinsics.checkNotNullParameter(adConfiguration5, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeImpressionEventGmsgHandler, "nativeImpressionEventGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeImpression", new a32(adConfiguration5, nativeImpressionEventGmsgHandler));
        h1 adConfiguration6 = this.a;
        xn1 nativeImpressionResponseGmsgHandler = (xn1) this.N0.get();
        Intrinsics.checkNotNullParameter(adConfiguration6, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeImpressionResponseGmsgHandler, "nativeImpressionResponseGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/nativeImpressionFlowControl", new a32(adConfiguration6, nativeImpressionResponseGmsgHandler));
        h1 adConfiguration7 = this.a;
        pb1 loadHtmlGmsgHandler = (pb1) this.O0.get();
        Intrinsics.checkNotNullParameter(adConfiguration7, "adConfiguration");
        Intrinsics.checkNotNullParameter(loadHtmlGmsgHandler, "loadHtmlGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/loadHtml", new a32(adConfiguration7, loadHtmlGmsgHandler));
        h1 adConfiguration8 = this.a;
        zn2 showOverlayGmsgHandler = (zn2) this.Q0.get();
        Intrinsics.checkNotNullParameter(adConfiguration8, "adConfiguration");
        Intrinsics.checkNotNullParameter(showOverlayGmsgHandler, "showOverlayGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/showOverlay", new a32(adConfiguration8, showOverlayGmsgHandler));
        h1 adConfiguration9 = this.a;
        ks0 hideOverlayGmsgHandler = (ks0) this.R0.get();
        Intrinsics.checkNotNullParameter(adConfiguration9, "adConfiguration");
        Intrinsics.checkNotNullParameter(hideOverlayGmsgHandler, "hideOverlayGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/hideOverlay", new a32(adConfiguration9, hideOverlayGmsgHandler));
        h1 adConfiguration10 = this.a;
        dc1 logScionEventGmsgHandler = (dc1) this.S0.get();
        Intrinsics.checkNotNullParameter(adConfiguration10, "adConfiguration");
        Intrinsics.checkNotNullParameter(logScionEventGmsgHandler, "logScionEventGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/logScionEvent", new a32(adConfiguration10, logScionEventGmsgHandler));
        h1 adConfiguration11 = this.a;
        vb1 loadNativePolicyValidatorGmsgHandler = (vb1) this.T0.get();
        Intrinsics.checkNotNullParameter(adConfiguration11, "adConfiguration");
        Intrinsics.checkNotNullParameter(loadNativePolicyValidatorGmsgHandler, "loadNativePolicyValidatorGmsgHandler");
        sanenessVarBuilderWithExpectedSize.competently("/loadNativeAdPolicyViolations", new a32(adConfiguration11, loadNativePolicyValidatorGmsgHandler));
        h1 adConfiguration12 = this.a;
        co2 showValidatorOverlayGmsgHandler = (co2) this.U0.get();
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
        return (igo) this.J0.get();
    }

    public final void g() {
        sg2 sg2Var = this.B;
        coffeecake coffeecakeVar = this.w;
        i60 i60Var = this.b;
        ph phVar = new ph(sg2Var, coffeecakeVar, i60Var.e0, i60Var.o0, i60Var.p, i60Var.q);
        Object obj = qd0.c;
        qd0 qd0Var = new qd0(phVar);
        this.N = qd0Var;
        i60 i60Var2 = this.b;
        qd0 qd0Var2 = new qd0(new dp(i60Var2.M, this.n, qd0Var, i60Var2.b4, this.d));
        this.O = qd0Var2;
        this.P = new c43(qd0Var2);
        i60 i60Var3 = this.b;
        this.Q = new g43(i60Var3.R3);
        this.R = new i43(i60Var3.e3);
        hb0 hb0Var = new hb0();
        this.S = hb0Var;
        this.T = new j43(hb0Var);
        this.U = new k43(i60Var3.Z);
        this.V = new l43(i60Var3.Q3);
        this.W = new m43(i60Var3.P3);
        this.X = new d43(i60Var3.O0);
        this.Y = new e43(i60Var3.M0);
        this.Z = new f43();
        this.a0 = new n43(new qd0(new s0(this.J)));
        h21 h21Var = bd1.b;
        sealless seallessVar = new sealless(12);
        seallessVar.attabal("/appEvent", this.M);
        seallessVar.attabal("/click", this.P);
        seallessVar.attabal("/delayPageLoaded", this.Q);
        seallessVar.attabal("/httpTrack", this.R);
        seallessVar.attabal("/open", this.T);
        seallessVar.attabal("/result", this.U);
        seallessVar.attabal("/video", this.V);
        seallessVar.attabal("/videoMeta", this.W);
        seallessVar.attabal("/close", this.X);
        seallessVar.attabal("/customClose", this.Y);
        seallessVar.attabal("/delayPageClosed", this.Z);
        seallessVar.attabal("/backButton", this.a0);
        this.b0 = new h43(new bd1(seallessVar.a));
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(3);
        h43 h43Var = this.b0;
        if (h43Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("GmsgHandlerInstaller", h43Var);
        linkedHashMapAttabal.put("SetFollowUrls", sunlike.f37323attabal);
        linkedHashMapAttabal.put("SetExpanded", dialog.f37125attabal);
        o43 o43Var = new o43(new bd1(linkedHashMapAttabal));
        i60 i60Var4 = this.b;
        h21 h21Var2 = i60Var4.d;
        coffeecake coffeecakeVar2 = i60Var4.v;
        coffeecake coffeecakeVar3 = i60Var4.u;
        coffeecake coffeecakeVar4 = i60Var4.t;
        coffeecake coffeecakeVar5 = i60Var4.p;
        hb0 hb0Var2 = i60Var4.q;
        coffeecake coffeecakeVar6 = i60Var4.x;
        h21 h21Var3 = this.x;
        h21 h21Var4 = this.d;
        coffeecake coffeecakeVar7 = i60Var4.G;
        hb0 hb0Var3 = this.n;
        coffeecake coffeecakeVar8 = this.z;
        coffeecake coffeecakeVar9 = i60Var4.L;
        h21 h21Var5 = this.L;
        coffeecake coffeecakeVar10 = this.i;
        coffeecake coffeecakeVar11 = i60Var4.V;
        coffeecake coffeecakeVar12 = this.J;
        coffeecake coffeecakeVar13 = i60Var4.H;
        this.c0 = new p33(h21Var2, coffeecakeVar2, coffeecakeVar3, coffeecakeVar4, coffeecakeVar5, hb0Var2, coffeecakeVar6, h21Var3, h21Var4, coffeecakeVar7, hb0Var3, coffeecakeVar8, coffeecakeVar9, h21Var5, coffeecakeVar10, coffeecakeVar11, o43Var, coffeecakeVar12, coffeecakeVar13);
        h21 h21Var6 = this.e;
        this.d0 = new iu1(h21Var4, h21Var6, i60Var4.n1, i60Var4.t2, coffeecakeVar5);
        qd0 qd0Var3 = new qd0(new s22(h21Var4, i60Var4.g, h21Var6, coffeecakeVar4, coffeecakeVar13));
        hb0 hb0Var4 = this.S;
        i60 i60Var5 = this.b;
        hb0.a(hb0Var4, new qd0(new wy1(i60Var5.d, i60Var5.p, i60Var5.L, i60Var5.M, this.n, i60Var5.G, this.K, this.c0, this.p, this.N, this.x, i60Var5.F1, i60Var5.b4, this.d, this.y, this.d0, qd0Var3)));
        this.e0 = new lq1(this.S);
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(3);
        mq1 mq1Var = this.G;
        if (mq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/sendMessageToSdk", mq1Var);
        kq1 kq1Var = this.I;
        if (kq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/hideValidatorOverlay", kq1Var);
        lq1 lq1Var = this.e0;
        if (lq1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("/open", lq1Var);
        this.f0 = new bd1(linkedHashMapAttabal2);
    }

    public final void h() {
        yn1 yn1Var = new yn1(this.n, this.B);
        Object obj = qd0.c;
        this.N0 = new qd0(yn1Var);
        this.O0 = new qd0(new qb1(this.j0, this.v));
        i60 i60Var = this.b;
        qd0 qd0Var = new qd0(new tr1(i60Var.d, i60Var.x, this.c, i60Var.s0, this.k, i60Var.g));
        this.P0 = qd0Var;
        this.Q0 = new qd0(new ao2(this.b.u, this.j0, qd0Var));
        this.R0 = new qd0(new ls0(this.b.v, this.j0, this.P0));
        this.S0 = new qd0(new ec1(this.b.n0, this.d));
        i60 i60Var2 = this.b;
        this.T0 = new qd0(new wb1(i60Var2.p, this.j0, this.v, i60Var2.X0, i60Var2.v, this.r));
        this.U0 = new qd0(new do2(this.b.u, this.j0));
        this.V0 = new qd0(new nr1(this.j0, this.t));
        this.W0 = new qd0(new b23(this.P0));
        this.X0 = new qd0(new p53(this.P0));
        this.Y0 = new qd0(new jm1(this.j0));
        this.Z0 = new qd0(new kn1(this.j0));
        b80 b80Var = this.k;
        i60 i60Var3 = this.b;
        this.a1 = new qd0(new j93(b80Var, i60Var3.v, i60Var3.p));
        this.b1 = new qd0(new sa3(this.b.v, this.k));
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(2);
        coffeecake coffeecakeVar = this.a1;
        if (coffeecakeVar == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("WebViewPauseResumeListener", coffeecakeVar);
        coffeecake coffeecakeVar2 = this.b1;
        if (coffeecakeVar2 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        this.c1 = new qd0(new xa3(this.b.v, revoltingly.attabal(linkedHashMapAttabal, "WebViewVisibilityChangedAfmaEventListener", coffeecakeVar2, linkedHashMapAttabal)));
        i60 i60Var4 = this.b;
        this.d1 = new qd0(new qr1(i60Var4.a4, this.k, i60Var4.v));
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(4);
        coffeecake coffeecakeVar3 = this.c1;
        if (coffeecakeVar3 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("WebViewVisibilityChangedEventEmitter", coffeecakeVar3);
        coffeecake coffeecakeVar4 = this.l;
        if (coffeecakeVar4 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("MraidViewabilityEventListener", coffeecakeVar4);
        coffeecake coffeecakeVar5 = this.P0;
        if (coffeecakeVar5 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("NativeVideoViewabilityMonitor", coffeecakeVar5);
        coffeecake coffeecakeVar6 = this.d1;
        if (coffeecakeVar6 == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        qd0 qd0Var2 = new qd0(new ma3(this.b.v, revoltingly.attabal(linkedHashMapAttabal2, "NativeVideoMraidViewabilityEventListener", coffeecakeVar6, linkedHashMapAttabal2)));
        i60 i60Var5 = this.b;
        this.e1 = new qd0(new pa3(i60Var5.v, qd0Var2, i60Var5.y2, this.k, i60Var5.g, i60Var5.p, this.x));
    }

    public final void a(yf2 yf2Var, carport carportVar, hj1 hj1Var, u20 u20Var, com.google.android.libraries.ads.mobile.sdk.nativead.dern dernVar) {
        this.t = h21.a(hj1Var);
        this.u = h21.a(dernVar);
        this.v = h21.a(carportVar);
        pareve pareveVar = punjab.f37269attabal;
        Object obj = qd0.c;
        this.w = new qd0(pareveVar);
        h21 h21VarA = h21.a(yf2Var);
        this.x = h21VarA;
        i60 i60Var = this.b;
        qd0 qd0Var = new qd0(new hk2(i60Var.x, this.d, i60Var.L, i60Var.z, h21VarA, i60Var.p));
        this.y = qd0Var;
        i60 i60Var2 = this.b;
        this.z = new qd0(new ux1(i60Var2.u, i60Var2.t, this.s, this.d, i60Var2.I, this.t, i60Var2.p, qd0Var));
        i60 i60Var3 = this.b;
        this.A = new qd0(new xb0(i60Var3.t, i60Var3.p, this.i, i60Var3.H));
        i60 i60Var4 = this.b;
        this.B = new sg2(this.d, this.e, new tg2(i60Var4.p, i60Var4.t2, i60Var4.g, i60Var4.t, i60Var4.z, i60Var4.B0, i60Var4.r0, i60Var4.H, i60Var4.q));
        qd0 qd0Var2 = new qd0(new am2(this.v));
        this.C = qd0Var2;
        this.D = new sp1(this.d, qd0Var2);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        sp1 sp1Var = this.D;
        if (sp1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal.put("/sendMessageToSdk", sp1Var);
        this.E = new rp1(new bd1(linkedHashMapAttabal));
        LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(1);
        rp1 rp1Var = this.E;
        if (rp1Var == null) {
            throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
        }
        linkedHashMapAttabal2.put("GmsgHandlerInstaller", rp1Var);
        tp1 tp1Var = new tp1(new bd1(linkedHashMapAttabal2));
        i60 i60Var5 = this.b;
        this.F = new qd0(new xp1(i60Var5.H, i60Var5.V, tp1Var));
        h21 h21Var2 = this.d;
        this.G = new mq1(h21Var2, this.C);
        hb0 hb0Var = new hb0();
        this.H = hb0Var;
        this.I = new kq1(h21Var2, hb0Var);
        qd0 qd0Var3 = new qd0(archbishopric.f37059attabal);
        this.J = qd0Var3;
        i60 i60Var6 = this.b;
        this.K = new ny1(i60Var6.d, i60Var6.v, i60Var6.u, i60Var6.t, i60Var6.p, i60Var6.q, i60Var6.x, this.m, this.x, this.d, i60Var6.G, this.n, this.z, i60Var6.L, qd0Var3);
        this.L = h21.a(u20Var);
        this.M = new b43(new qd0(new od(this.n)));
    }

    public final void a(formularize formularizeVar, Integer num, jm2 jm2Var, a22 a22Var, View view) {
        this.g0 = new iq1(this.f0);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        iq1 iq1Var = this.g0;
        if (iq1Var != null) {
            linkedHashMapAttabal.put("GmsgHandlerInstaller", iq1Var);
            nq1 nq1Var = new nq1(new bd1(linkedHashMapAttabal));
            i60 i60Var = this.b;
            dq1 dq1Var = new dq1(i60Var.H, i60Var.V, nq1Var);
            Object obj = qd0.c;
            this.h0 = new qd0(dq1Var);
            h21 h21VarA = h21.a(a22Var);
            this.i0 = h21VarA;
            h21 h21Var2 = this.s;
            i60 i60Var2 = this.b;
            qd0 qd0Var = new qd0(new zi0(h21Var2, i60Var2.v, i60Var2.t, i60Var2.M, this.t, i60Var2.X0, this.u, i60Var2.H, this.i, i60Var2.g, this.v, this.w, this.z, this.A, this.B, this.n, this.F, this.h0, this.x, this.d, i60Var2.g4, i60Var2.p, this.y, i60Var2.q, h21VarA));
            this.j0 = qd0Var;
            hb0.a(this.H, new qd0(new os0(this.b.v, this.r, qd0Var)));
            this.k0 = new jq1(this.H);
            this.l0 = new b80(h21.a(view));
            this.m0 = h21.a(jm2Var);
            this.n0 = h21.a(num);
            this.o0 = new qd0(hoiden.f37167attabal);
            this.p0 = new qd0(new rr(this.x));
            this.q0 = new kk1(new b80(this.u));
            int i = xm2.f3295attabal;
            List listDern = dustman.dern(1);
            List listDern2 = dustman.dern(1);
            coffeecake coffeecakeVar = this.p0;
            boolean z = wm2.c;
            if (!z && coffeecakeVar == null) {
                throw new AssertionError("Codegen error? Null provider");
            }
            listDern.add(coffeecakeVar);
            kk1 kk1Var = this.q0;
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
            this.r0 = new qd0(new n23(i60Var3.H, i60Var3.x3, i60Var3.M, this.B, this.l0, this.m0, this.d, this.i, this.n0, i60Var3.g, this.o0, i60Var3.b4, this.i0, this.n, i60Var3.C2, xm2Var, i60Var3.p));
            h21 h21VarA2 = h21.a(formularizeVar);
            this.s0 = h21VarA2;
            this.t0 = new qd0(new g7(this.b.N2, h21VarA2));
            h21 h21Var3 = this.d;
            i60 i60Var4 = this.b;
            this.u0 = new qd0(new g22(h21Var3, i60Var4.c4, i60Var4.p));
            this.v0 = new qd0(new ho1(this.v));
            this.w0 = new qd0(new zp1(this.F));
            this.x0 = new qd0(new e93(this.j, this.z));
            sealless seallessVar = new sealless(12);
            seallessVar.attabal("MraidAdEventListener", this.q);
            seallessVar.attabal("hideValidatorOverlayGmsgHandlerAsAdEventListener", this.k0);
            seallessVar.attabal("TrackingPingMonitorAsAdEventListener", this.r0);
            seallessVar.attabal("DelegatingAdEventListener", this.A);
            seallessVar.attabal("AdStatsTrackerListener", this.t0);
            seallessVar.attabal("PlayPrewarmListener", this.u0);
            seallessVar.attabal("NativeJavascriptEngineLifeCycleMonitor", this.v0);
            seallessVar.attabal("NativeOnePointFiveOverlayMonitor", this.w0);
            seallessVar.attabal("SafeBrowsingLifecycleMonitor", this.y);
            seallessVar.attabal("OmidMonitorAsAdEventListener", this.z);
            seallessVar.attabal("WebViewLifecycleMonitor", this.x0);
            seallessVar.attabal("SafeBrowsingLifecycleMonitor", this.y);
            this.y0 = new bd1(seallessVar.a);
            return;
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }

    public final void a(PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext) {
        hb0 hb0Var = this.n;
        f2 f2Var = new f2(this.b.t, this.y0, this.d);
        Object obj = qd0.c;
        hb0.a(hb0Var, new qd0(f2Var));
        qd0 qd0Var = new qd0(new g51(this.t));
        this.z0 = qd0Var;
        i60 i60Var = this.b;
        this.A0 = new qd0(new hm1(i60Var.v, i60Var.t, this.t, i60Var.p, qd0Var, i60Var.l1, this.s0, this.s));
        h21 h21Var = this.s0;
        i60 i60Var2 = this.b;
        this.B0 = new qd0(new sg0(h21Var, i60Var2.n0, this.d, i60Var2.t));
        this.C0 = new qd0(new lm1(this.j0));
        h21 h21Var2 = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(2);
        coffeecake coffeecakeVar = this.B0;
        if (coffeecakeVar != null) {
            linkedHashMapAttabal.put("FirebaseAnalyticsAdEventListener", coffeecakeVar);
            coffeecake coffeecakeVar2 = this.C0;
            if (coffeecakeVar2 != null) {
                this.D0 = new qd0(new g8(this.b.v, revoltingly.attabal(linkedHashMapAttabal, "NativeAdViewVisibilityChangedEventListener", coffeecakeVar2, linkedHashMapAttabal)));
                this.E0 = new qd0(new vo1(this.b.p, this.j0));
                LinkedHashMap linkedHashMapAttabal2 = dustman.attabal(1);
                coffeecake coffeecakeVar3 = this.E0;
                if (coffeecakeVar3 != null) {
                    this.F0 = new qd0(new nd1(this.b.v, revoltingly.attabal(linkedHashMapAttabal2, "NativeMediaViewFullyVisibleEventListener", coffeecakeVar3, linkedHashMapAttabal2)));
                    LinkedHashMap linkedHashMapAttabal3 = dustman.attabal(2);
                    coffeecake coffeecakeVar4 = this.D0;
                    if (coffeecakeVar4 != null) {
                        linkedHashMapAttabal3.put("AdVisibilityChangedEventEmitter", coffeecakeVar4);
                        coffeecake coffeecakeVar5 = this.F0;
                        if (coffeecakeVar5 != null) {
                            qd0 qd0Var2 = new qd0(new w7(this.b.v, revoltingly.attabal(linkedHashMapAttabal3, "MediaViewFullyVisibleEventEmitter", coffeecakeVar5, linkedHashMapAttabal3)));
                            i60 i60Var3 = this.b;
                            this.G0 = new qd0(new pm1(new qd0(new nm1(i60Var3.v, qd0Var2, i60Var3.y2, i60Var3.g, i60Var3.p)), this.C0, this.E0));
                            b80 b80Var = new b80(h21.a(perAdNativeJavscriptEngineJsContext));
                            i60 i60Var4 = this.b;
                            this.H0 = new qd0(new n61(i60Var4.v, this.c, this.d, this.e, this.i, this.k, this.n, this.A, this.t, this.j0, this.A0, this.G0, this.z0, b80Var, i60Var4.q1, this.y, i60Var4.q, this.i0));
                            coffeecake coffeecakeVar6 = this.b.t;
                            h21 h21Var3 = bd1.b;
                            this.I0 = new qd0(new rh2(coffeecakeVar6, h21Var3));
                            this.J0 = new qd0(new iy2(this.b.t, this.d, this.n, this.I0, new qd0(new nz2(this.b.t, h21Var3)), eia.f37136attabal));
                            i60 i60Var5 = this.b;
                            new qd0(new yw1(i60Var5.I, this.d, i60Var5.p, i60Var5.u));
                            this.K0 = new qd0(new e30(this.n));
                            this.L0 = new qd0(new nn1(this.n));
                            this.M0 = new qd0(new wn1(this.n));
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

    public final void a(h1 h1Var, ur urVar, xb2 xb2Var, j71 j71Var, le2 le2Var, o6 o6Var, JsonObject jsonObject, gq0 gq0Var) {
        formularism formularismVar = recumbency.f37287attabal;
        Object obj = qd0.c;
        this.c = new qd0(formularismVar);
        this.d = h21.a(h1Var);
        this.e = h21.a(urVar);
        this.f = new b80(h21.a(xb2Var));
        this.g = new b80(h21.a(j71Var));
        this.h = new b80(h21.a(le2Var));
        this.i = new qd0(new sr(this.f, this.g, this.h, new b80(h21.a(o6Var))));
        h21 h21VarA = h21.a(gq0Var);
        this.j = h21VarA;
        b80 b80Var = new b80(h21VarA);
        this.k = b80Var;
        i60 i60Var = this.b;
        this.l = new qd0(new ji1(i60Var.a4, b80Var, i60Var.v));
        this.m = eia.f37136attabal;
        hb0 hb0Var = new hb0();
        this.n = hb0Var;
        this.o = new bh1(hb0Var);
        h21 h21Var = bd1.b;
        LinkedHashMap linkedHashMapAttabal = dustman.attabal(1);
        bh1 bh1Var = this.o;
        if (bh1Var != null) {
            linkedHashMapAttabal.put("AdEventListener", bh1Var);
            qd0 qd0Var = new qd0(new og1(this.b.t, new bd1(linkedHashMapAttabal)));
            i60 i60Var2 = this.b;
            qd0 qd0Var2 = new qd0(new rh1(i60Var2.a4, i60Var2.v, i60Var2.t, this.l, this.m, i60Var2.G, qd0Var));
            this.p = qd0Var2;
            this.q = new ch1(new qd0(new yf1(qd0Var2)));
            this.r = new qd0(tuan.f37347attabal);
            this.s = h21.a(jsonObject);
            return;
        }
        throw new NullPointerException(IronSourceConstants.EVENTS_PROVIDER);
    }
}
