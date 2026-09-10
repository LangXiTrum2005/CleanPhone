package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8246b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8251a;

        a(String str) {
            this.f8251a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8251a;
        }
    }

    public k(String str, com.applovin.impl.sdk.l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8246b = str;
        this.f8245a = lVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f8246b.substring(d().length()), 0), "UTF-8"));
                this.f8245a.Q();
                if (!com.applovin.impl.sdk.p.a()) {
                    return jSONObject;
                }
                this.f8245a.Q().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e10) {
                this.f8245a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8245a.Q().a("AdToken", "Unable to decode token '" + this.f8246b + "' into JSON", e10);
                }
                this.f8245a.E().a("AdToken", "decodeFullAdResponseStr", e10);
                return null;
            }
        } catch (UnsupportedEncodingException e11) {
            this.f8245a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8245a.Q().a("AdToken", defpackage.e.q(this.f8246b, "'", new StringBuilder("Unable to process ad response from token '")), e11);
            }
            this.f8245a.E().a("AdToken", "decodeFullAdResponse", e11);
            return null;
        }
    }

    public String b() {
        return this.f8246b;
    }

    public a c() {
        if (a(z4.f10279x0) != null) {
            return a.REGULAR;
        }
        return a(z4.f10287y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(z4.f10279x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(z4.f10287y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f8246b;
        if (str != null) {
            return str.equals(kVar.f8246b);
        }
        return kVar.f8246b == null;
    }

    public int hashCode() {
        String str = this.f8246b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbK = d5.u.k("AdToken{id=", StringUtils.prefixToIndex(32, this.f8246b), ", type=");
        sbK.append(c());
        sbK.append('}');
        return sbK.toString();
    }

    private String a(z4 z4Var) {
        for (String str : this.f8245a.c(z4Var)) {
            if (this.f8246b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
