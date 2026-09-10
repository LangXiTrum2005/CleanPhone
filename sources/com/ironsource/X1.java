package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface X1 {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements X1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27621a;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.X1
        public com.ironsource.mediationsdk.demandOnly.p a(String instanceId) {
            kotlin.jvm.internal.n.f(instanceId, "instanceId");
            JSONObject jSONObject = this.f27621a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new com.ironsource.mediationsdk.demandOnly.p.a(strOptString) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(JSONObject jSONObject) {
            this.f27621a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i10, kotlin.jvm.internal.g gVar) {
            this((i10 & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    com.ironsource.mediationsdk.demandOnly.p a(String str);
}
