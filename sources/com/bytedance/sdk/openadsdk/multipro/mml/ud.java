package com.bytedance.sdk.openadsdk.multipro.mml;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.smartdigimkt.v0.k;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
class ud {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> qdl;

    public static Map<String, ?> lnr(Context context, String str) {
        SharedPreferences sharedPreferencesQdl = qdl(context, str);
        if (sharedPreferencesQdl == null) {
            return null;
        }
        return sharedPreferencesQdl.getAll();
    }

    public static SharedPreferences qdl(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(qdl(str), 0);
        } catch (Throwable th) {
            aaj.lnr("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static void ud(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || softReference.get() == null || (map = qdl.get().get(qdl(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String qdl(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object qdl(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(qdl(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object ud(Context context, String str, String str2, String str3) {
        String strQdl = qdl(str);
        if (!qdl(context, strQdl, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(k.f38992h)) {
            return qdl.qdl(context, strQdl, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(qdl.qdl(context, strQdl, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(qdl.qdl(context, strQdl, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(qdl.qdl(context, strQdl, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(qdl.qdl(context, strQdl, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return qdl.qdl(context, strQdl, str2, (String) null);
        }
        return null;
    }

    private static void qdl(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
        if (softReference == null || softReference.get() == null) {
            qdl = new SoftReference<>(new ConcurrentHashMap());
        }
        String strQdl = qdl(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = qdl.get();
        if (concurrentHashMap.get(strQdl) == null) {
            concurrentHashMap.put(strQdl, new HashMap());
        }
        concurrentHashMap.get(strQdl).put(str2, obj);
    }

    public static synchronized <T> void qdl(Context context, String str, String str2, T t) {
        String strQdl = qdl.qdl(str, str2);
        if (tvp.wd(strQdl)) {
            com.bytedance.sdk.component.qdl qdlVarQdl = com.bytedance.sdk.component.qdl.qdl(context, strQdl);
            if (t.equals(qdl(strQdl, str2))) {
                return;
            }
            com.bytedance.sdk.component.qdl.lnr lnrVarUd = qdlVarQdl.ud();
            qdl(lnrVarUd, str2, (Object) t);
            lnrVarUd.apply();
            qdl(strQdl, str2, t);
            return;
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
        if (sharedPreferencesQdl == null) {
            return;
        }
        if (t.equals(qdl(strQdl, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
        qdl(editorEdit, str2, t);
        editorEdit.apply();
        qdl(strQdl, str2, t);
    }

    public static void ud(Context context, String str, String str2) {
        try {
            String strQdl = qdl.qdl(str, str2);
            if (tvp.wd(strQdl)) {
                com.bytedance.sdk.component.qdl.qdl(context, strQdl).ud().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
            if (sharedPreferencesQdl == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = qdl;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = qdl.get().get(qdl(strQdl));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ud(Context context, String str) {
        if (tvp.wd(str)) {
            com.bytedance.sdk.component.qdl.qdl(context, str).ud().clear().apply();
            ud(str);
            return;
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, str);
        if (sharedPreferencesQdl == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesQdl.edit();
        editorEdit.clear();
        editorEdit.apply();
        ud(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void qdl(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void qdl(com.bytedance.sdk.component.qdl.lnr lnrVar, String str, T t) {
        if (t instanceof Integer) {
            lnrVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            lnrVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            lnrVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            lnrVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            lnrVar.putString(str, (String) t);
        }
    }

    public static String qdl(Context context, String str, String str2, String str3) {
        Object objQdl = qdl(str, str2);
        if (objQdl != null) {
            return String.valueOf(objQdl);
        }
        Object objUd = ud(context, str, str2, str3);
        qdl(str, str2, objUd);
        return String.valueOf(objUd);
    }

    public static boolean qdl(Context context, String str, String str2) {
        String strQdl = qdl.qdl(str, str2);
        if (tvp.wd(strQdl)) {
            return com.bytedance.sdk.component.qdl.qdl(context, strQdl).qdl(str2);
        }
        SharedPreferences sharedPreferencesQdl = qdl(context, strQdl);
        return sharedPreferencesQdl != null && sharedPreferencesQdl.contains(str2);
    }
}
