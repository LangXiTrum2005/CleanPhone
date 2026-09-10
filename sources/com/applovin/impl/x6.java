package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x6 extends y6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e3 f9999g;

    public x6(e3 e3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateMaxReward", lVar);
        this.f9999g = e3Var;
    }

    @Override // com.applovin.impl.t6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f9999g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f9999g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f9999g.e());
        JsonUtils.putString(jSONObject, "ad_format", this.f9999g.getFormat().getLabel());
        String strV0 = this.f9999g.v0();
        if (!StringUtils.isValidString(strV0)) {
            strV0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", strV0);
        String strC = this.f9999g.C();
        if (!StringUtils.isValidString(strC)) {
            strC = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", strC);
    }

    @Override // com.applovin.impl.t6
    public String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.y6
    public boolean h() {
        return this.f9999g.A0();
    }

    @Override // com.applovin.impl.y6
    public void a(q4 q4Var) {
        this.f9999g.a(q4Var);
    }

    @Override // com.applovin.impl.t6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.f9999g.a(q4.a(str));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
        mapHashMap.put("code", String.valueOf(i10));
        this.f8297a.R().a(f2.f7886w0, this.f9999g, mapHashMap);
    }
}
