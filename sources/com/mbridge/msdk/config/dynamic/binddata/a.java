package com.mbridge.msdk.config.dynamic.binddata;

import android.text.TextUtils;
import android.view.View;
import com.ironsource.X3;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void a(String str, View view, String str2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null) {
            return;
        }
        b(str, view, str2, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(String str, View view, String str2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            HashMap map = new HashMap();
            map.put("parentLayoutFilePath", str2);
            d dVar = new d();
            for (String str3 : strArrSplit) {
                String[] strArrSplit2 = str3.split(X3.j.f27830b);
                if (strArrSplit2.length == 2) {
                    String str4 = strArrSplit2[1];
                    a(str4, "", view, aVar);
                    map.put(strArrSplit2[0], dVar.a(str4, aVar));
                }
            }
            map.put("globalModel", aVar);
            if (view instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
                ((com.mbridge.msdk.config.dynamic.baseview.inter.a) view).setXmlData(map);
            }
        } catch (Exception e10) {
            q0.b("ComponentBindData", e10.getMessage(), e10);
        }
    }

    public static void a(String str, String str2, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null || !str.startsWith("$")) {
            return;
        }
        try {
            String strReplace = str.replace("$", "");
            com.mbridge.msdk.config.dynamic.binddata.wrapper.d dVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.d(str, str2, view, 0);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = c.a(aVar, strReplace);
            if (aVarA != null) {
                aVarA.b(strReplace, dVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentBindData", e10.getMessage(), e10);
        }
    }
}
