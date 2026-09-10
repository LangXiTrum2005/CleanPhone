package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static String Lxb(String str) {
        if (!com.bytedance.sdk.component.utils.sLN.ZU() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ebl eblVar = new com.bytedance.sdk.openadsdk.core.model.ebl(com.bytedance.sdk.openadsdk.core.QAg.LD().NXR());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = eblVar.LD().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(eblVar.Lxb());
                } else {
                    sb.append("?");
                    sb.append(eblVar.Lxb());
                }
            }
        }
        return sb.toString();
    }
}
