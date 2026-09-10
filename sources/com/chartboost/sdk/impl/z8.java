package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class z8 implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f15705a;

    public z8(p2 identity) {
        Intrinsics.f(identity, "identity");
        this.f15705a = identity;
    }

    @Override // com.chartboost.sdk.impl.tg
    public JSONObject a() throws JSONException {
        y8 y8VarH = this.f15705a.h();
        JSONObject jSONObject = new JSONObject();
        String strD = y8VarH.d();
        if (strD != null) {
            jSONObject.put("appSetId", strD);
        }
        String strD2 = y8VarH.d();
        if (strD2 != null) {
            jSONObject.put("app_set_id", strD2);
        }
        Integer numE = y8VarH.e();
        if (numE != null) {
            jSONObject.put("appSetIdScope", numE.intValue());
        }
        Integer numE2 = y8VarH.e();
        if (numE2 != null) {
            jSONObject.put("app_set_id_scope", numE2.intValue());
        }
        String strA = y8VarH.a();
        if (strA != null) {
            jSONObject.put("ifa", strA);
        }
        String strC = y8VarH.c();
        if (strC != null) {
            jSONObject.put("instance_id", strC);
        }
        return jSONObject;
    }
}
