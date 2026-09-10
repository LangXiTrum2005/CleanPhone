package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to {
    private final String lnr;
    private final String mml;
    private final String qdl;
    private final URL ud;

    private to(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.qdl = str2;
        this.ud = new URL(str);
        this.lnr = str3;
        this.mml = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        if (qdl(this.qdl, toVar.qdl) && qdl(this.ud, toVar.ud) && qdl(this.lnr, toVar.lnr)) {
            return qdl(this.mml, toVar.mml);
        }
        return false;
    }

    public int hashCode() {
        String str = this.qdl;
        int iHashCode = (this.ud.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.lnr;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mml;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL lnr() {
        return this.ud;
    }

    public JSONObject mml() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.ud.toString());
            if (!TextUtils.isEmpty(this.qdl)) {
                jSONObject.put("vendorKey", this.qdl);
            }
            if (!TextUtils.isEmpty(this.lnr)) {
                jSONObject.put("verificationParameters", this.lnr);
            }
            if (!TextUtils.isEmpty(this.mml)) {
                jSONObject.put("verificationNotExecuted", this.mml);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.lnr;
    }

    private boolean qdl(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static to qdl(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new to(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static to qdl(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new to(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<to> qdl(JSONArray jSONArray) {
        HashSet<to> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    hashSet.add(qdl(jSONArray.getJSONObject(i2)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
