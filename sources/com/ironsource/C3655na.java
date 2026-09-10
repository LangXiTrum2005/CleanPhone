package com.ironsource;

import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3655na implements Ge<JSONObject> {
    private final Ge<String> a;

    public C3655na(Ge<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.a = serverResponse;
    }

    @Override // com.ironsource.Ge
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.a.a());
    }
}
