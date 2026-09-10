package com.bytedance.sdk.openadsdk.core.sLN;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    private final URL LD;
    private final String Lxb;
    private final String ZU;
    private final String lk;

    private nBu(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.Lxb = str2;
        this.LD = new URL(str);
        this.lk = str3;
        this.ZU = str4;
    }

    public String LD() {
        return this.lk;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public JSONObject ZU() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.LD.toString());
            if (!TextUtils.isEmpty(this.Lxb)) {
                jSONObject.put("vendorKey", this.Lxb);
            }
            if (!TextUtils.isEmpty(this.lk)) {
                jSONObject.put("verificationParameters", this.lk);
            }
            if (!TextUtils.isEmpty(this.ZU)) {
                jSONObject.put("verificationNotExecuted", this.ZU);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nBu)) {
            return false;
        }
        nBu nbu = (nBu) obj;
        if (Lxb(this.Lxb, nbu.Lxb) && Lxb(this.LD, nbu.LD) && Lxb(this.lk, nbu.lk)) {
            return Lxb(this.ZU, nbu.ZU);
        }
        return false;
    }

    public int hashCode() {
        String str = this.Lxb;
        int iHashCode = (this.LD.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.lk;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ZU;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL lk() {
        return this.LD;
    }

    private boolean Lxb(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static nBu Lxb(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new nBu(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static nBu Lxb(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new nBu(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<nBu> Lxb(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                hashSet.add(Lxb(jSONArray.getJSONObject(i)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}
