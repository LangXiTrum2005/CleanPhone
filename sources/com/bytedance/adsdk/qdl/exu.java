package com.bytedance.adsdk.qdl;

import com.p004ironsource.mediationsdk.metadata.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class exu implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Number qdl(JSONObject jSONObject, Object[] objArr) {
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
                return strTrim.contains(com.thinkup.core.common.n.mo.ono) ? Double.valueOf(Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
