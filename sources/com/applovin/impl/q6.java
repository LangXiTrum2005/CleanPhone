package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q6 extends r6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e3 f9098g;

    public q6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskReportMaxReward", lVar);
        this.f9098g = e3Var;
    }

    @Override // com.applovin.impl.t6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9098g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9098g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9098g.e());
        String strV0 = this.f9098g.v0();
        if (!StringUtils.isValidString(strV0)) {
            strV0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strV0);
        String strC = this.f9098g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.r6
    public void b(JSONObject jSONObject) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Reported reward successfully for mediated ad: " + this.f9098g);
        }
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.r6
    public q4 h() {
        return this.f9098g.r0();
    }

    @Override // com.applovin.impl.r6
    public void i() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "No reward result was found for mediated ad: " + this.f9098g);
        }
    }

    @Override // com.applovin.impl.t6
    public void a(int i10) {
        super.a(i10);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Failed to report reward for mediated ad: " + this.f9098g + " - error code: " + i10);
        }
        this.f8297a.R().a(f2.f7884v0, this.f9098g, CollectionUtils.map("code", String.valueOf(i10)));
    }
}
