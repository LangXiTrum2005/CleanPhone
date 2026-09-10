package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    public static String qdl(String str) {
        if (!com.bytedance.sdk.component.utils.bjy.mml() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.to toVar = new com.bytedance.sdk.openadsdk.core.model.to(com.bytedance.sdk.openadsdk.core.tvp.ud().exu());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = toVar.ud().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(d9.i.f24749c);
                    sb.append(toVar.qdl());
                } else {
                    sb.append("?");
                    sb.append(toVar.qdl());
                }
            }
        }
        return sb.toString();
    }
}
