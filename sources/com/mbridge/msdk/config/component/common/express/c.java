package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("$") && !str.startsWith(X3.j.f27834d)) {
            return str;
        }
        if (!str.startsWith(X3.j.f27834d)) {
            if (str.startsWith("$")) {
                return a(aVar, str);
            }
            return null;
        }
        String strReplaceAll = str.replaceAll("[\\[\\]]", "");
        if (strReplaceAll.split(",").length == 0) {
            return null;
        }
        return a(aVar, strReplaceAll);
    }

    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String... strArr) {
        Object obj;
        Object objA;
        if (strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String[] strArrSplit = str.replace("$", "").split("\\.");
            if (strArrSplit.length != 0) {
                if (aVar.a((Object) strArrSplit[0])) {
                    obj = aVar;
                } else {
                    HashMap map = new HashMap();
                    map.put(strArrSplit[0], aVar);
                    obj = map;
                }
                int length = strArrSplit.length;
                int i10 = 0;
                Object obj2 = obj;
                while (i10 < length) {
                    String str2 = strArrSplit[i10];
                    if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                        objA = a((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2, str2);
                    } else {
                        objA = a(obj2, str2);
                    }
                    i10++;
                    obj2 = objA;
                }
                if (strArr.length == 1) {
                    return obj2;
                }
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        try {
            if (aVar.a((Object) str)) {
                return aVar.b((Object) str);
            }
            return null;
        } catch (Exception e10) {
            q0.b("ExpressionExecutor", e10.getMessage(), e10);
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        try {
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            if (obj == null) {
                return null;
            }
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e10) {
            q0.b("ExpressionExecutor", e10.getMessage(), e10);
            return null;
        }
    }
}
