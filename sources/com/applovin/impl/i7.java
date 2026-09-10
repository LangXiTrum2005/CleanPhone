package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8163c;

    public i7(com.applovin.impl.sdk.l lVar) {
        this.f8161a = lVar;
        b5 b5Var = b5.I;
        this.f8162b = ((Boolean) lVar.a(b5Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.l.p()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || lVar.B().T();
        lVar.c(b5Var);
    }

    private void e() {
        com.applovin.impl.sdk.k kVarU = this.f8161a.u();
        if (this.f8162b) {
            kVarU.b(this.f8163c);
        } else {
            kVarU.a(this.f8163c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f8163c;
    }

    public boolean c() {
        return this.f8162b;
    }

    public boolean d() {
        List list = this.f8163c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f8163c == null) {
            return;
        }
        if (list == null || !list.equals(this.f8163c)) {
            this.f8163c = list;
            e();
        }
    }

    public void a() {
        this.f8161a.b(b5.I, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f8162b) {
            return;
        }
        JSONArray jSONArrayX = defpackage.e.x("test_mode_idfas", jSONObject);
        com.applovin.impl.sdk.m mVarB = this.f8161a.B();
        boolean zT = mVarB.T();
        String strA = mVarB.f().a();
        com.applovin.impl.sdk.m.b bVarH = mVarB.H();
        this.f8162b = zT || JsonUtils.containsCaseInsensitiveString(strA, jSONArrayX) || JsonUtils.containsCaseInsensitiveString(bVarH != null ? bVarH.f9540a : null, jSONArrayX);
    }
}
