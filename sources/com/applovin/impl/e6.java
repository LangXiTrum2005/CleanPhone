package com.applovin.impl;

import android.app.Activity;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.O6;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7798g;

    public e6(com.applovin.impl.sdk.l lVar) {
        super("TaskInitializeSdk", lVar, true);
        this.f7798g = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, r2 r2Var, Exception exc) {
        if (exc != null) {
            this.f7798g.E().a("license_validation", exc);
        }
        this.f7798g.s0().a(new v6(this.f7798g, r2Var, exc));
    }

    private void g() {
        String str;
        String str2;
        boolean zC = this.f7798g.q0().c();
        Map mapP = this.f7798g.B().p();
        Map mapM = this.f7798g.B().M();
        String strA = zC ? this.f7798g.B().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        x2 x2Var = new x2();
        x2Var.a().a("=====AppLovin SDK=====");
        x2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f7798g.a(z4.R3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f7798g.g0().c());
        x2Var.a("===Device Info===").a("OS", q7.d()).a(IronSourceConstants.TYPE_GAID, strA).a("App Set ID", str).a("Model", mapP.get(O6.B)).a("Locale", mapP.get("locale")).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        x2Var.a("===App Info===").a("Application ID", mapM.get("package_name")).a("Target SDK", mapM.get("target_sdk"));
        x2Var.a("===SDK Settings===").a("SDK Key", this.f7798g.k0()).a("Mediation Provider", this.f7798g.X()).a("TG", p7.a(this.f7798g)).a("MD", this.f7798g.a(z4.f10251t)).a("Test Mode On", Boolean.valueOf(this.f7798g.u0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        x2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(q0.a(a()));
        x2Var.a("===MAX Terms and Privcay Policy Flow===");
        v0 v0VarY = this.f7798g.y();
        boolean zJ = v0VarY.j();
        x2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f7798g.w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = v0VarY.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str3 = "Other";
            if (consentFlowUserGeography == consentFlowUserGeography2) {
                str2 = "GDPR";
            } else {
                str2 = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown";
            }
            x2Var.a("Consent Flow Geography", str2);
            if (q7.c(this.f7798g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str3 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str3 = "None";
                }
                x2Var.a("Debug User Geography", str3);
            }
        }
        x2Var.a("Privacy Policy URI", v0VarY.f()).a("Terms of Service URI", v0VarY.h());
        x2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f7798g.t0().i());
        x2Var.a();
        com.applovin.impl.sdk.p.g("AppLovinSdk", x2Var.toString());
    }

    private void h() {
        Long l = (Long) this.f7798g.a(z4.f10286y);
        if (l.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) c5.a(b5.f7551i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
        Boolean bool2 = (Boolean) this.f7798g.a(z4.f10294z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f7798g.P().a(l.longValue()).a(this.f7798g.s0().a("lv_task"), new t8(this, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01dc A[PHI: r5 r8 r9
  0x01dc: PHI (r5v3 java.lang.StringBuilder) = (r5v2 java.lang.StringBuilder), (r5v5 java.lang.StringBuilder) binds: [B:45:0x01da, B:32:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r8v18 com.applovin.impl.sdk.p) = (r8v14 com.applovin.impl.sdk.p), (r8v66 com.applovin.impl.sdk.p) binds: [B:45:0x01da, B:32:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x01dc: PHI (r9v9 java.lang.String) = (r9v8 java.lang.String), (r9v18 java.lang.String) binds: [B:45:0x01da, B:32:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.p pVar;
        String str;
        StringBuilder sbI;
        String str2 = X3.i.f27815t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f7798g.I().b(a());
            this.f7798g.I().e(a());
            this.f7798g.s0().a((k5) new l5(this.f7798g), f6.b.OTHER);
            this.f7798g.B().c0();
            this.f7798g.n0().c();
            this.f7798g.z().l();
            if (q7.c(this.f7798g)) {
                this.f7798g.a();
            }
            this.f7798g.Z0();
            g();
            f();
            this.f7798g.a(true);
            h();
            this.f7798g.h0().b();
            this.f7798g.l().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f7798g.a(z4.G2)).booleanValue()) {
                this.f7798g.Z().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f7798g.G().maybeTrackAppOpenEvent();
            this.f7798g.A().a();
            if (((Boolean) this.f7798g.a(z4.T2)).booleanValue()) {
                this.f7798g.z0().b();
            }
            if (((Boolean) this.f7798g.a(z4.f10107b1)).booleanValue()) {
                this.f7798g.i().b();
            } else {
                this.f7798g.i().g();
            }
            if (this.f7798g.W().g() || (((Boolean) this.f7798g.a(t3.f9794z7)).booleanValue() && q7.c(this.f7798g) && this.f7798g.I0())) {
                this.f7798g.W().e();
            }
            this.f7798g.g0().i();
            if (com.applovin.impl.sdk.p.a()) {
                pVar = this.f8299c;
                str = this.f8298b;
                sbI = d5.u.i("AppLovin SDK ");
                sbI.append(AppLovinSdk.VERSION);
                sbI.append(" initialization ");
                if (this.f7798g.D0()) {
                    str2 = "succeeded";
                }
                sbI.append(str2);
                sbI.append(" in ");
                sbI.append(System.currentTimeMillis() - jCurrentTimeMillis);
                defpackage.e.C(sbI, "ms", pVar, str);
            }
        } catch (Throwable th2) {
            try {
                com.applovin.impl.sdk.p.c("AppLovinSdk", "Failed to initialize SDK!", th2);
                this.f7798g.a(false);
                a(th2);
                if (((Boolean) this.f7798g.a(z4.f10163i)).booleanValue()) {
                    this.f7798g.h0().a();
                }
                if (((Boolean) this.f7798g.a(z4.f10156h)).booleanValue()) {
                    this.f7798g.V0();
                }
                this.f7798g.g0().i();
                if (!com.applovin.impl.sdk.p.a()) {
                    return;
                }
                pVar = this.f8299c;
                str = this.f8298b;
                sbI = d5.u.i("AppLovin SDK ");
                sbI.append(AppLovinSdk.VERSION);
                sbI.append(" initialization ");
                if (this.f7798g.D0()) {
                    str2 = "succeeded";
                }
            } catch (Throwable th3) {
                this.f7798g.g0().i();
                if (com.applovin.impl.sdk.p.a()) {
                    com.applovin.impl.sdk.p pVar2 = this.f8299c;
                    String str3 = this.f8298b;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    if (this.f7798g.D0()) {
                        str2 = "succeeded";
                    }
                    sb2.append(str2);
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    defpackage.e.C(sb2, "ms", pVar2, str3);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7798g.U().a(this.f7798g.e().b());
    }

    private void f() {
        if (this.f7798g.U().c()) {
            return;
        }
        Activity activityW0 = this.f7798g.w0();
        if (activityW0 != null) {
            this.f7798g.U().a(activityW0);
            return;
        }
        this.f7798g.E().a(f2.L0, this.f8298b + ":maybeInitializeAdapters()");
        this.f7798g.s0().a(new u6(this.f7798g, true, "initializeAdapters", new u9(this, 7)), f6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }
}
