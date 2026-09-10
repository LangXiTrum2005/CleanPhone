package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0969w0 extends C0967v0 {
    public C0969w0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        super(jSONObject, kVar);
    }

    public List f() {
        x0 x0VarA;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f11959b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject != null && (x0VarA = x0.a(jSONObject, this.f11958a)) != null) {
                arrayList.add(x0VarA);
            }
        }
        return arrayList;
    }

    public String g() {
        return b(PglCryptUtils.KEY_MESSAGE);
    }

    public String h() {
        return b("title");
    }

    @Override // com.applovin.impl.C0967v0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", title=" + h() + ", message=" + g() + ", actions=" + f() + "}";
    }
}
