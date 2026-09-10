package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3596k5 implements Fb<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Fb
    public com.ironsource.mediationsdk.d.a a(String input) throws JSONException {
        Intrinsics.checkNotNullParameter(input, "input");
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
