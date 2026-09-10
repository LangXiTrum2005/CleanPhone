package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0534qa implements Te<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Te<String> f30116a;

    public C0534qa(Te<String> serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        this.f30116a = serverResponse;
    }

    @Override // com.ironsource.Te
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f30116a.a());
    }
}
