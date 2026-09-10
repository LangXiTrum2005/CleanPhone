package com.bytedance.sdk.component.adexpress.dynamic.lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.ka.xha;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static int ri(xha xhaVar) {
        if (xhaVar == null) {
            return 0;
        }
        String strIg = xhaVar.ig();
        String strAy = xhaVar.ay();
        if (TextUtils.isEmpty(strAy) || TextUtils.isEmpty(strIg) || !strAy.equals("creative")) {
            return 0;
        }
        if (strIg.equals("shake")) {
            return 2;
        }
        if (strIg.equals("twist")) {
            return 3;
        }
        return strIg.equals("slide") ? 1 : 0;
    }
}
