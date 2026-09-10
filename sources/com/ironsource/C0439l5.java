package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0439l5 implements Jb<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Jb
    public com.ironsource.mediationsdk.d.a a(String input) throws JSONException {
        kotlin.jvm.internal.n.f(input, "input");
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        kotlin.jvm.internal.n.e(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
