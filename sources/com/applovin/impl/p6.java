package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class p6 extends r6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f8978g;

    public p6(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        super("TaskReportAppLovinReward", lVar);
        this.f8978g = bVar;
    }

    @Override // com.applovin.impl.t6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f8978g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f8978g.P());
        String clCode = this.f8978g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.r6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Reported reward successfully for ad: " + this.f8978g);
        }
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.r6
    public q4 h() {
        return this.f8978g.i();
    }

    @Override // com.applovin.impl.r6
    public void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "No reward result was found for ad: " + this.f8978g);
        }
    }

    @Override // com.applovin.impl.t6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Failed to report reward for ad: " + this.f8978g + " - error code: " + i10);
        }
        this.f8297a.g().a(f2.I, this.f8978g, CollectionUtils.map("code", String.valueOf(i10)));
    }
}
