package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r6 extends t6 {
    public r6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    private JSONObject a(q4 q4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", q4Var.b());
        Map mapA = q4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    public abstract void b(JSONObject jSONObject);

    @Override // com.applovin.impl.t6
    public int g() {
        return ((Integer) this.f8297a.a(z4.f10174j1)).intValue();
    }

    public abstract q4 h();

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        q4 q4VarH = h();
        if (q4VarH == null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Reporting pending reward: " + q4VarH + "...");
        }
        a(a(q4VarH), new a());
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements r0.e {
        public a() {
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            r6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r6.this.a(i10);
        }
    }
}
