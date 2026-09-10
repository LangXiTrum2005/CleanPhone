package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f10314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f10315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10316c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private z7() {
    }

    public static z7 a(q8 q8Var, z7 z7Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (z7Var == null) {
            try {
                z7Var = new z7();
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastNonVideoResource", "Error occurred while initializing", th2);
                }
                lVar.E().a("VastNonVideoResource", th2);
                return null;
            }
        }
        if (z7Var.f10315b == null && !StringUtils.isValidString(z7Var.f10316c)) {
            String strA = a(q8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                z7Var.f10315b = Uri.parse(strA);
                z7Var.f10314a = a.STATIC;
                return z7Var;
            }
            String strA2 = a(q8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                z7Var.f10314a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    z7Var.f10315b = Uri.parse(strA2);
                    return z7Var;
                }
                z7Var.f10316c = strA2;
                return z7Var;
            }
            String strA3 = a(q8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                z7Var.f10314a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    z7Var.f10315b = Uri.parse(strA3);
                    return z7Var;
                }
                z7Var.f10316c = strA3;
            }
        }
        return z7Var;
    }

    public String b() {
        return this.f10316c;
    }

    public Uri c() {
        return this.f10315b;
    }

    public a d() {
        return this.f10314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (this.f10314a != z7Var.f10314a) {
            return false;
        }
        Uri uri = this.f10315b;
        if (uri == null ? z7Var.f10315b != null : !uri.equals(z7Var.f10315b)) {
            return false;
        }
        String str = this.f10316c;
        if (str != null) {
            return str.equals(z7Var.f10316c);
        }
        return z7Var.f10316c == null;
    }

    public int hashCode() {
        a aVar = this.f10314a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f10315b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f10316c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastNonVideoResource{type=");
        sb2.append(this.f10314a);
        sb2.append(", resourceUri=");
        sb2.append(this.f10315b);
        sb2.append(", resourceContents='");
        return defpackage.e.q(this.f10316c, "'}", sb2);
    }

    private static String a(q8 q8Var, String str) {
        q8 q8VarC = q8Var.c(str);
        if (q8VarC != null) {
            return q8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f10315b = uri;
    }

    public void a(String str) {
        this.f10316c = str;
    }

    public static z7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        z7 z7Var = new z7();
        z7Var.f10314a = aVarValueOf;
        z7Var.f10315b = uri;
        z7Var.f10316c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return z7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f10314a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f10315b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f10316c);
        return jSONObject;
    }
}
