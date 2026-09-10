package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0944k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10998b;

    /* JADX INFO: renamed from: com.applovin.impl.k$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11002a;

        a(String str) {
            this.f11002a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f11002a;
        }
    }

    public C0944k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10998b = str;
        this.f10997a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f10998b.substring(d().length()), 0), "UTF-8"));
                this.f10997a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f10997a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e2) {
                this.f10997a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f10997a.O().a("AdToken", "Unable to decode token '" + this.f10998b + "' into JSON", e2);
                }
                this.f10997a.D().a("AdToken", "decodeFullAdResponseStr", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            this.f10997a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f10997a.O().a("AdToken", android.support.v4.media.a.r(new StringBuilder("Unable to process ad response from token '"), this.f10998b, "'"), e3);
            }
            this.f10997a.D().a("AdToken", "decodeFullAdResponse", e3);
            return null;
        }
    }

    public String b() {
        return this.f10998b;
    }

    public a c() {
        if (a(x4.x0) != null) {
            return a.REGULAR;
        }
        return a(x4.y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(x4.x0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(x4.y0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0944k)) {
            return false;
        }
        String str = this.f10998b;
        String str2 = ((C0944k) obj).f10998b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public int hashCode() {
        String str = this.f10998b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbY = android.support.v4.media.a.y("AdToken{id=", StringUtils.prefixToIndex(32, this.f10998b), ", type=");
        sbY.append(c());
        sbY.append(AbstractJsonLexerKt.END_OBJ);
        return sbY.toString();
    }

    private String a(x4 x4Var) {
        for (String str : this.f10997a.c(x4Var)) {
            if (this.f10998b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
