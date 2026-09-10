package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7405b;

    private a8() {
    }

    public static a8 a(q8 q8Var, a8 a8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (a8Var == null) {
            try {
                a8Var = new a8();
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastSystemInfo", "Error occurred while initializing", th2);
                }
                lVar.E().a("VastSystemInfo", th2);
                return null;
            }
        }
        if (!StringUtils.isValidString(a8Var.f7404a)) {
            String strD = q8Var.d();
            if (StringUtils.isValidString(strD)) {
                a8Var.f7404a = strD;
            }
        }
        if (!StringUtils.isValidString(a8Var.f7405b)) {
            String str = (String) q8Var.a().get("version");
            if (StringUtils.isValidString(str)) {
                a8Var.f7405b = str;
            }
        }
        return a8Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        String str = this.f7404a;
        if (str == null ? a8Var.f7404a != null : !str.equals(a8Var.f7404a)) {
            return false;
        }
        String str2 = this.f7405b;
        if (str2 != null) {
            return str2.equals(a8Var.f7405b);
        }
        return a8Var.f7405b == null;
    }

    public int hashCode() {
        String str = this.f7404a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7405b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastSystemInfo{name='");
        sb2.append(this.f7404a);
        sb2.append("', version='");
        return defpackage.e.q(this.f7405b, "'}", sb2);
    }

    public static a8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        a8 a8Var = new a8();
        a8Var.f7404a = JsonUtils.getString(jSONObject, "name", null);
        a8Var.f7405b = JsonUtils.getString(jSONObject, "version", null);
        return a8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", this.f7404a);
        JsonUtils.putString(jSONObject, "version", this.f7405b);
        return jSONObject;
    }
}
