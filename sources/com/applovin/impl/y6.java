package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y6 extends t6 {
    public y6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private q4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(defpackage.e.x("results", jSONObject), 0, new JSONObject());
        s0.c(jSONObject2, this.f8297a);
        s0.b(jSONObject, this.f8297a);
        s0.a(jSONObject, this.f8297a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return q4.a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        q4 q4VarB = b(jSONObject);
        a(q4VarB);
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Pending reward handled: " + q4VarB);
        }
    }

    public abstract void a(q4 q4Var);

    @Override // com.applovin.impl.t6
    public int g() {
        return ((Integer) this.f8297a.a(z4.f10165i1)).intValue();
    }

    public abstract boolean h();

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements r0.e {
        public a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.f8299c.b(y6Var.f8298b, "Reward validation succeeded with code " + i10 + " but task was cancelled already");
                }
                com.applovin.impl.sdk.p pVar2 = y6.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var2 = y6.this;
                    y6Var2.f8299c.b(y6Var2.f8298b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar3 = y6.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var3 = y6.this;
                y6Var3.f8299c.a(y6Var3.f8298b, "Reward validation succeeded with code " + i10 + " and response: " + jSONObject);
            }
            y6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (y6.this.h()) {
                com.applovin.impl.sdk.p pVar = y6.this.f8299c;
                if (com.applovin.impl.sdk.p.a()) {
                    y6 y6Var = y6.this;
                    y6Var.f8299c.b(y6Var.f8298b, "Reward validation failed with error code " + i10 + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.p pVar2 = y6.this.f8299c;
            if (com.applovin.impl.sdk.p.a()) {
                y6 y6Var2 = y6.this;
                y6Var2.f8299c.b(y6Var2.f8298b, "Reward validation failed with code " + i10 + " and error: " + str2);
            }
            y6.this.a(i10);
        }
    }
}
