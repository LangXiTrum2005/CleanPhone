package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.ironsource.C0519pd;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f8309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c4 f8310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8311c;

    public k8(JSONObject jSONObject, MaxAdFormat maxAdFormat, g3 g3Var, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f8310b = new c4(jSONObject2, lVar);
        } else {
            this.f8310b = null;
        }
        this.f8309a = new w2(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, g3Var);
        JSONArray jSONArrayX = defpackage.e.x(C0519pd.f30011c, jSONObject);
        this.f8311c = new ArrayList(jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f8311c.add(new c4(jSONObject3, lVar));
            }
        }
    }

    public c4 a() {
        return this.f8310b;
    }

    public w2 b() {
        return this.f8309a;
    }

    public List c() {
        return this.f8311c;
    }

    public boolean d() {
        return this.f8310b != null;
    }
}
