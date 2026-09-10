package com.bytedance.sdk.openadsdk.core.aw;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    private final String ik;
    private final String ka;
    private final URL lr;
    private final String ri;

    private qt(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.ri = str2;
        this.lr = new URL(str);
        this.ik = str3;
        this.ka = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        if (ri(this.ri, qtVar.ri) && ri(this.lr, qtVar.lr) && ri(this.ik, qtVar.ik)) {
            return ri(this.ka, qtVar.ka);
        }
        return false;
    }

    public int hashCode() {
        String str = this.ri;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.lr.hashCode()) * 31;
        String str2 = this.ik;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ka;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL ik() {
        return this.lr;
    }

    public String lr() {
        return this.ik;
    }

    public String ri() {
        return this.ri;
    }

    private boolean ri(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static qt ri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new qt(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static qt ri(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new qt(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<qt> ri(JSONArray jSONArray) {
        HashSet<qt> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    hashSet.add(ri(jSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
