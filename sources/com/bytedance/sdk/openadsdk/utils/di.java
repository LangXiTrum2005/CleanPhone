package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    public static String ri(String str) {
        if (!com.bytedance.sdk.component.utils.vr.ik() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.qt qtVar = new com.bytedance.sdk.openadsdk.core.model.qt(com.bytedance.sdk.openadsdk.core.qt.lr().co());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = qtVar.lr().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(X3.j.c);
                    sb.append(qtVar.ri());
                } else {
                    sb.append("?");
                    sb.append(qtVar.ri());
                }
            }
        }
        return sb.toString();
    }
}
