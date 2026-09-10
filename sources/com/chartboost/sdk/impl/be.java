package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f13521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8 f13522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe f13523c;
    public final f8 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g8 f13524e;
    public final hg f;
    public final d8 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qf.b f13526i;

    public be(ke keVar, e8 e8Var, pe peVar, f8 f8Var, g8 g8Var, hg hgVar, d8 d8Var, String str) {
        this.f13521a = keVar;
        this.f13522b = e8Var;
        this.f13523c = peVar;
        this.d = f8Var;
        this.f13524e = g8Var;
        this.f = hgVar;
        this.g = d8Var;
        this.f13525h = str;
    }

    public int a() {
        return d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }

    public Integer b() {
        COPPA coppa = (COPPA) a("coppa");
        if (coppa != null) {
            return coppa.getConsent().booleanValue() ? 1 : 0;
        }
        return null;
    }

    public int c() {
        return !d().equals(com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID) ? 1 : 0;
    }

    public String d() {
        DataUseConsent dataUseConsentA = this.f13522b.a("gdpr");
        return dataUseConsentA == null ? com.p004ironsource.x4.DISABLED_AUCTION_FALLBACK_ID : (String) dataUseConsentA.getConsent();
    }

    public JSONObject e() {
        List listF = f();
        f8 f8Var = this.d;
        if (f8Var == null || listF == null) {
            return null;
        }
        return f8Var.a(listF);
    }

    public List f() {
        qf.b bVar;
        g8 g8Var = this.f13524e;
        if (g8Var == null || (bVar = this.f13526i) == null) {
            return null;
        }
        return g8Var.a(bVar);
    }

    public ce g() {
        return new ce(Integer.valueOf(a()), f(), Integer.valueOf(c()), b(), e(), d(), this.f.a(), this.g.b(), this.g.a());
    }

    public DataUseConsent a(String str) {
        e8 e8Var = this.f13522b;
        if (e8Var != null) {
            return e8Var.a(str);
        }
        return null;
    }

    public void a(DataUseConsent dataUseConsent) {
        ke keVar = this.f13521a;
        if (keVar != null) {
            keVar.a(dataUseConsent);
        }
    }

    public void b(String str) {
        pe peVar = this.f13523c;
        if (peVar != null) {
            peVar.a(str);
        }
    }

    public void a(qf.b bVar) {
        this.f13526i = bVar;
    }
}
