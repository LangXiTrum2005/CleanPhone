package com.bytedance.sdk.openadsdk.jbs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.xd;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ka extends ri {
    public static ik ri;

    public static String ri(com.bytedance.sdk.component.xha.lr.ik ikVar, String str) {
        ik ikVarRi;
        Map map;
        if (!xd.ik() || (ikVarRi = lr.ri("net")) == null || (map = (Map) ikVarRi.ri(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                ikVar.lr(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
