package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d3 extends j3 {
    public d3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var, jSONObject, jSONObject2, null, lVar);
    }

    public boolean A0() {
        return a("proe", (Boolean) this.f8395a.a(t3.f9769f8)).booleanValue();
    }

    @Override // com.applovin.impl.a3
    public a3 a(com.applovin.impl.mediation.h hVar) {
        return new d3(this, hVar);
    }

    public long u0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f8395a.a(t3.D7)).longValue());
    }

    public long v0() {
        return q7.e(a("bg_color", (String) null));
    }

    public int w0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long x0() {
        return a("viewability_imp_delay_ms", ((Long) this.f8395a.a(z4.f10239r1)).longValue());
    }

    public int y0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean z0() {
        return u0() >= 0;
    }

    private d3(d3 d3Var, com.applovin.impl.mediation.h hVar) {
        super(d3Var.Q(), d3Var.a(), d3Var.g(), hVar, d3Var.f8395a);
    }
}
