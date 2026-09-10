package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0645we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ve f30963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fd f30964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Jd f30965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O3 f30966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N5 f30967e;

    public C0645we(Ve fullResponse) {
        kotlin.jvm.internal.n.f(fullResponse, "fullResponse");
        this.f30963a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.j().optJSONObject(C0663xe.f31073a);
        this.f30964b = new Fd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.j().optJSONObject(C0663xe.f31074b);
        this.f30965c = new Jd(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.f30966d = new O3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.j().optJSONObject(C0663xe.f31076d);
        this.f30967e = new N5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    public final O3 a() {
        return this.f30966d;
    }

    public final N5 b() {
        return this.f30967e;
    }

    public final Ve c() {
        return this.f30963a;
    }

    public final Fd d() {
        return this.f30964b;
    }

    public final Jd e() {
        return this.f30965c;
    }
}
