package com.bytedance.adsdk.ri;

import com.ironsource.mediationsdk.metadata.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Number ri(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            String strTrim = ((String) obj).trim();
            if (!strTrim.equalsIgnoreCase(a.g) && !strTrim.equalsIgnoreCase("false")) {
                return strTrim.contains(".") ? Double.valueOf(Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
