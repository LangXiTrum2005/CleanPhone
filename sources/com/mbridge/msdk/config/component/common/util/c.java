package com.mbridge.msdk.config.component.common.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static boolean a(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 307 || i10 == 308;
    }

    public static Map<String, Object> b(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                linkedHashMap.put(entry.getKey(), b((Map<String, Object>) entry.getValue()));
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                    if (obj instanceof Map) {
                        arrayList.add(b((Map<String, Object>) obj));
                    }
                    linkedHashMap.put(entry.getKey(), arrayList);
                }
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static String a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        String str2 = "{" + key + "}";
                        if (str.contains(str2)) {
                            str = str.replace(str2, value);
                        } else {
                            continue;
                        }
                    }
                }
                return str;
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("Macro replacement error: "), "ComponentUtil");
            }
        }
        return str;
    }

    public static String c(String str) {
        Object objB;
        if (com.mbridge.msdk.config.manager.a.c().b() != null && com.mbridge.msdk.config.manager.a.c().b().b((Object) "cml") != null && (objB = com.mbridge.msdk.config.manager.a.c().b().b((Object) "cml")) != null && (objB instanceof Map)) {
            String str2 = (String) ((Map) objB).get(str);
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                return str2;
            }
        }
        return str;
    }

    public static List<View> a(ViewGroup viewGroup, String str) {
        ArrayList arrayList = new ArrayList();
        if (viewGroup == null) {
            return arrayList;
        }
        a(viewGroup, arrayList, str);
        return arrayList;
    }

    public static Map<String, Object> b(String str) {
        Map<String, Object> mapD;
        Map<String, Object> mapA;
        try {
            com.mbridge.msdk.config.component.database.a aVarA = com.mbridge.msdk.config.component.database.a.a();
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                mapD = aVarA.d("SELECT * FROM settingDB WHERE appId = '" + str + "'");
            } else {
                mapD = aVarA.d("SELECT * FROM settingDB WHERE type = 1 ORDER BY timestamp DESC LIMIT 1");
            }
            e eVar = new e();
            if (mapD == null || mapD.isEmpty()) {
                return null;
            }
            Object obj = mapD.get(c("data"));
            if (!(obj instanceof List)) {
                return null;
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                return null;
            }
            Object obj2 = list.get(0);
            if (!(obj2 instanceof Map)) {
                return null;
            }
            String strValueOf = String.valueOf(((Map) obj2).get("jsonString"));
            if (TextUtils.isEmpty(strValueOf) || (mapA = eVar.a(strValueOf)) == null || mapA.isEmpty()) {
                return null;
            }
            return mapA;
        } catch (Throwable th2) {
            q0.b("ComponentUtil", th2.getMessage(), th2);
            return null;
        }
    }

    private static void a(ViewGroup viewGroup, List<View> list, String str) {
        if (viewGroup == null) {
            return;
        }
        boolean z10 = false;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (str.equals(childAt.getTag())) {
                z10 = true;
            } else {
                if (z10 && childAt.getVisibility() == 0) {
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, list, str);
                }
            }
        }
    }

    public static int a(Context context) {
        View viewFindViewById;
        View decorView;
        WindowInsets rootWindowInsets;
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                q0.a("ComponentUtil", "通过资源ID获取状态栏高度: " + dimensionPixelSize + "px");
                return dimensionPixelSize;
            }
        } catch (Exception e10) {
            q0.a("ComponentUtil", "通过资源ID获取状态栏高度失败: " + e10.getMessage());
        }
        try {
            if ((context instanceof Activity) && (decorView = ((Activity) context).getWindow().getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                int systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
                q0.a("ComponentUtil", "通过WindowInsets获取状态栏高度: " + systemWindowInsetTop + "px");
                return systemWindowInsetTop;
            }
        } catch (Exception e11) {
            q0.a("ComponentUtil", "通过WindowInsets获取状态栏高度失败: " + e11.getMessage());
        }
        try {
            if ((context instanceof Activity) && (viewFindViewById = ((Activity) context).findViewById(R.id.content)) != null) {
                int[] iArr = new int[2];
                viewFindViewById.getLocationInWindow(iArr);
                int i10 = iArr[1];
                q0.a("ComponentUtil", "通过content view获取状态栏高度: " + i10 + "px");
                return i10;
            }
        } catch (Exception e12) {
            q0.a("ComponentUtil", "通过content view获取状态栏高度失败: " + e12.getMessage());
        }
        int i11 = (int) (context.getResources().getDisplayMetrics().density * 24.0f);
        q0.d("ComponentUtil", "所有方法都失败，使用默认状态栏高度: " + i11 + "px");
        return i11;
    }

    public static void b(String str, String str2) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.facebook.appevents.c(str2, str, 1));
    }

    public static void a(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null) {
            return;
        }
        try {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (map.containsKey(key)) {
                    Object obj = map.get(key);
                    if ((obj instanceof Map) && (value instanceof Map)) {
                        a((Map<String, Object>) obj, (Map<String, Object>) value);
                    } else {
                        map.put(key, value);
                    }
                } else {
                    map.put(key, value);
                }
            }
        } catch (Throwable th2) {
            q0.b("ComponentUtil", th2.getMessage(), th2);
        }
    }

    public static Map<String, Object> a(Map<String, Object> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.mbridge.msdk.config.component.common.express.d dVar = new com.mbridge.msdk.config.component.common.express.d();
        if (map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getKey().equals(c("13"))) {
                        if (entry.getValue() instanceof Map) {
                            linkedHashMap.put(entry.getKey(), b((Map<String, Object>) entry.getValue()));
                        } else {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof String) {
                        linkedHashMap.put(entry.getKey(), dVar.a((String) entry.getValue(), aVar));
                    } else if (entry.getValue() instanceof Map) {
                        linkedHashMap.put(entry.getKey(), a((Map<String, Object>) entry.getValue(), aVar));
                    } else if (entry.getValue() instanceof List) {
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof String) {
                                arrayList.add(dVar.a((String) obj, aVar));
                            }
                            if (obj instanceof Map) {
                                arrayList.add(a((Map<String, Object>) obj, aVar));
                            }
                            linkedHashMap.put(entry.getKey(), arrayList);
                        }
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                q0.b("ComponentUtil", th2.getMessage(), th2);
            }
        }
        return linkedHashMap;
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    map2.put(entry.getKey(), a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) entry.getValue()).b()));
                } else if (entry.getValue() instanceof Map) {
                    map2.put(entry.getKey(), a((Map<String, Object>) entry.getValue()));
                } else {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            return map2;
        } catch (Throwable th2) {
            q0.b("ComponentUtil", th2.getMessage(), th2);
            return map2;
        }
    }

    public static String a() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th2) {
            q0.a("ComponentUtil", th2.getMessage(), th2);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static com.mbridge.msdk.config.dynamic.binddata.wrapper.a a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        for (int i10 = 0; i10 < strArrSplit.length - 1; i10++) {
            if (!aVar.a((Object) strArrSplit[i10])) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar2.b(aVar.c());
                aVar.a(strArrSplit[i10], aVar2);
            }
            Object objB = aVar.b((Object) strArrSplit[i10]);
            if (objB instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar.b((Object) strArrSplit[i10]);
            }
            if (objB instanceof Map) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar3 = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                aVar3.a((Map<? extends String, ?>) objB);
                aVar.a(strArrSplit[i10], aVar3);
                aVar = aVar3;
            }
        }
        return aVar;
    }

    public static String a(String str) {
        try {
            com.mbridge.msdk.config.component.database.a aVarA = com.mbridge.msdk.config.component.database.a.a();
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
                Map<String, Object> mapD = aVarA.d("SELECT * FROM settingDB WHERE appId = '" + str + "'");
                if (mapD != null && !mapD.isEmpty()) {
                    Object obj = mapD.get(c("data"));
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (!list.isEmpty()) {
                            Object obj2 = list.get(0);
                            if (obj2 instanceof Map) {
                                String strValueOf = String.valueOf(((Map) obj2).get("jsonString"));
                                if (!TextUtils.isEmpty(strValueOf)) {
                                    return strValueOf;
                                }
                            }
                        }
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable th2) {
            q0.b("ComponentUtil", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d("SELECT * FROM settingDB WHERE appID = '" + str2 + "' AND type = 1");
            String strReplaceAll = str.replaceAll("'", "''");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (mapD != null && !mapD.isEmpty()) {
                Object obj = mapD.get("data");
                if ((obj instanceof List) && ((List) obj).size() > 0) {
                    com.mbridge.msdk.config.component.database.a.a().c("UPDATE settingDB SET appID ='" + str2 + "', unitID = '',  type = 1, timestamp = " + jCurrentTimeMillis + " , jsonString = '" + strReplaceAll + "' WHERE appID = '" + str2 + "'");
                    return;
                }
            }
            com.mbridge.msdk.config.component.database.a.a().c("INSERT INTO settingDB (appID, unitID, type, timestamp, jsonString) VALUES ('" + str2 + "','',1," + jCurrentTimeMillis + ",'" + strReplaceAll + "')");
        } catch (Throwable th2) {
            q0.b("ComponentUtil", "update component appSetting error: " + th2.getMessage(), th2);
        }
    }

    public static int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equalsIgnoreCase("null")) {
                return -1;
            }
            try {
                return Integer.parseInt(strValueOf);
            } catch (Throwable th2) {
                q0.b("ComponentUtil", th2.getMessage());
                return -1;
            }
        } catch (Throwable th3) {
            q0.b("ComponentUtil", th3.getMessage());
            return -1;
        }
    }
}
