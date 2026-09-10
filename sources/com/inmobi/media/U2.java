package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.p004ironsource.ko;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class U2 extends N9 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f23250A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f23251B;
    public final boolean C;
    public final Map y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f23252z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(Map requestedConfigMap, C3262ue uidMap, String url, int i2, int i3, boolean z2, String accountId, boolean z3) {
        super(ko.f25535b, (requestedConfigMap.get("root") != null || StringsKt.a0(url).toString().length() == 0) ? RootConfig.DEFAULT_FALLBACK_URL : url, uidMap, z2, (InterfaceC3333z5) null, com.smartdigimkt.o0.b.f37293e, 64);
        Intrinsics.f(requestedConfigMap, "requestedConfigMap");
        Intrinsics.f(uidMap, "uidMap");
        Intrinsics.f(url, "url");
        Intrinsics.f(accountId, "accountId");
        this.y = requestedConfigMap;
        this.f23252z = i2;
        this.f23250A = i3;
        this.f23251B = accountId;
        this.C = z3;
    }

    @Override // com.inmobi.media.N9
    public final void f() {
        String string;
        this.f23014u = false;
        super.f();
        HashMap map = this.k;
        if (map != null) {
            Q2 q2 = new Q2();
            try {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry entry : this.y.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.p004ironsource.dc.q, entry.getKey());
                    jSONObject.put("t", q2.a((String) entry.getKey(), ((Config) entry.getValue()).getAccountId$media_release()));
                    jSONArray.put(jSONObject);
                }
                string = jSONArray.toString();
                Intrinsics.e(string, "toString(...)");
            } catch (JSONException unused) {
                string = "";
            }
        }
        HashMap map2 = this.k;
        if (map2 != null) {
        }
        if (this.C) {
            this.f23010i.put("rip", com.p004ironsource.mediationsdk.metadata.a.g);
        }
    }
}
