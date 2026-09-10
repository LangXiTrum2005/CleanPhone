package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class nd extends b3 {
    /* JADX WARN: Illegal instructions before constructor call */
    public nd(wc networkParameters, x xVar, id idVar, y6 y6Var, uf session) {
        Intrinsics.f(networkParameters, "networkParameters");
        Intrinsics.f(session, "session");
        v2.c method = networkParameters.f15471a;
        Intrinsics.e(method, "method");
        String endpoint = networkParameters.f15472b;
        Intrinsics.e(endpoint, "endpoint");
        String path = networkParameters.f15473c;
        Intrinsics.e(path, "path");
        gf gfVar = networkParameters.d;
        ae priority = networkParameters.f15474e;
        Intrinsics.e(priority, "priority");
        b3.a aVar = networkParameters.f;
        Intrinsics.c(y6Var);
        super(method, endpoint, path, gfVar, priority, (String) null, aVar, y6Var, session);
        JSONObject jSONObjectH = new od(networkParameters.d, xVar, idVar).h();
        Intrinsics.e(jSONObjectH, "getJsonRepresentation(...)");
        a(jSONObjectH);
    }

    @Override // com.chartboost.sdk.impl.b3, com.chartboost.sdk.impl.v2
    public x2 a(y2 y2Var) {
        byte[] bArrA;
        try {
            if (y2Var == null || (bArrA = y2Var.a()) == null) {
                bArrA = new byte[0];
            }
            return x2.f15506c.a(new JSONObject(new String(bArrA, Charsets.f44691a)));
        } catch (JSONException e2) {
            za.b("parseServerResponse", e2);
            return x2.f15506c.a(new CBError(CBError.Internal.HTTP_NOT_FOUND, "No Bid"));
        }
    }

    @Override // com.chartboost.sdk.impl.b3
    public void f() {
    }
}
