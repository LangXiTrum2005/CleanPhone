package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3587je {
    private final Ie a;
    private final C3744sd b;
    private final C3812wd c;
    private final O3 d;
    private final K5 e;

    public C3587je(Ie fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.j().optJSONObject(C3605ke.a);
        this.b = new C3744sd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.j().optJSONObject(C3605ke.b);
        this.c = new C3812wd(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.d = new O3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.j().optJSONObject(C3605ke.d);
        this.e = new K5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    public final O3 a() {
        return this.d;
    }

    public final K5 b() {
        return this.e;
    }

    public final Ie c() {
        return this.a;
    }

    public final C3744sd d() {
        return this.b;
    }

    public final C3812wd e() {
        return this.c;
    }
}
