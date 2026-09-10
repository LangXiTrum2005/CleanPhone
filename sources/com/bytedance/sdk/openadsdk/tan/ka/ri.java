package com.bytedance.sdk.openadsdk.tan.ka;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.lr;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.qt;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> lr;
    public static HashSet<String> ri = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.tan.ka.ri.1
        {
            add("app_id");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static void ik(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = lr;
        if (softReference == null || softReference.get() == null || (map = lr.get().get(lr(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String lr(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static String ri(Context context, String str, String str2) {
        if (ri.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (ihz.ri(context)) {
            return str;
        }
        return str + "_" + ihz.ik(context);
    }

    public static String lr(String str, String str2, String str3) {
        return ri() ? str3 : ri(nr.ri(), lr(str), str2, str3);
    }

    private static void lr(Context context, String str, String str2) {
        try {
            String strRi = ri(context, str, str2);
            if (qt.xha(strRi)) {
                lr.ri(context, strRi).lr().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesRi = ri(context, strRi);
            if (sharedPreferencesRi == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesRi.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = lr;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = lr.get().get(lr(strRi));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean ri() {
        return nr.ri() == null;
    }

    public static void ri(String str, String str2, Boolean bool) {
        if (ri()) {
            return;
        }
        ri(lr(str), str2, bool);
    }

    public static void ri(String str, String str2, Long l) {
        if (ri()) {
            return;
        }
        ri(lr(str), str2, l);
    }

    public static void ri(String str, String str2, String str3) {
        if (ri()) {
            return;
        }
        ri(lr(str), str2, str3);
    }

    public static void ri(String str, String str2, Integer num) {
        if (ri()) {
            return;
        }
        ri(lr(str), str2, num);
    }

    public static int ri(String str, String str2, int i) {
        return ri() ? i : ri(nr.ri(), lr(str), str2, i);
    }

    private static int ri(Context context, String str, String str2, int i) {
        String strRi = ri(context, str, str2);
        if (qt.xha(strRi)) {
            return lr.ri(context, strRi).ri(str2, i);
        }
        SharedPreferences sharedPreferencesRi = ri(context, strRi);
        return sharedPreferencesRi == null ? i : sharedPreferencesRi.getInt(str2, i);
    }

    private static void lr(Context context, String str) {
        String strRi = ri(nr.ri(), str, "");
        if (qt.xha(strRi)) {
            lr.ri(context, strRi).lr().clear().apply();
            ik(strRi);
            return;
        }
        SharedPreferences sharedPreferencesRi = ri(context, strRi);
        if (sharedPreferencesRi == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesRi.edit();
        editorEdit.clear();
        editorEdit.apply();
        ik(strRi);
    }

    public static boolean ri(String str, String str2, boolean z) {
        return ri() ? z : ri(nr.ri(), lr(str), str2, z);
    }

    private static boolean ri(Context context, String str, String str2, boolean z) {
        String strRi = ri(context, str, str2);
        if (qt.xha(strRi)) {
            return lr.ri(context, strRi).ri(str2, z);
        }
        SharedPreferences sharedPreferencesRi = ri(context, strRi);
        return sharedPreferencesRi == null ? z : sharedPreferencesRi.getBoolean(str2, z);
    }

    private static Object lr(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = lr;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(lr(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public static long ri(String str, String str2, long j) {
        return ri() ? j : ri(nr.ri(), lr(str), str2, j);
    }

    private static void lr(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = lr;
        if (softReference == null || softReference.get() == null) {
            lr = new SoftReference<>(new ConcurrentHashMap());
        }
        String strLr = lr(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = lr.get();
        if (concurrentHashMap.get(strLr) == null) {
            concurrentHashMap.put(strLr, new HashMap());
        }
        concurrentHashMap.get(strLr).put(str2, obj);
    }

    private static long ri(Context context, String str, String str2, long j) {
        String strRi = ri(context, str, str2);
        if (qt.xha(strRi)) {
            return lr.ri(context, strRi).ri(str2, j);
        }
        SharedPreferences sharedPreferencesRi = ri(context, strRi);
        return sharedPreferencesRi == null ? j : sharedPreferencesRi.getLong(str2, j);
    }

    private static String ri(Context context, String str, String str2, String str3) {
        String strRi = ri(context, str, str2);
        if (qt.xha(strRi)) {
            return lr.ri(context, strRi).ri(str2, str3);
        }
        SharedPreferences sharedPreferencesRi = ri(context, strRi);
        return sharedPreferencesRi == null ? str3 : sharedPreferencesRi.getString(str2, str3);
    }

    public static void ri(String str, String str2) {
        if (ri()) {
            return;
        }
        try {
            lr(nr.ri(), lr(str), str2);
        } catch (Throwable unused) {
        }
    }

    public static void ri(String str) {
        if (ri()) {
            return;
        }
        try {
            lr(nr.ri(), lr(str));
        } catch (Throwable unused) {
        }
    }

    private static <T> void ri(String str, String str2, T t) {
        String strRi = ri(nr.ri(), str, str2);
        if (qt.xha(strRi)) {
            if (t.equals(lr(strRi, str2))) {
                return;
            }
            lr.ik ikVarLr = lr.ri(nr.ri(), lr(strRi)).lr();
            ri(ikVarLr, str2, (Object) t);
            ikVarLr.apply();
            lr(strRi, str2, t);
            return;
        }
        SharedPreferences sharedPreferencesRi = ri(nr.ri(), lr(strRi));
        if (sharedPreferencesRi == null || t.equals(lr(strRi, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesRi.edit();
        ri(editorEdit, str2, t);
        editorEdit.apply();
        lr(strRi, str2, t);
    }

    public static SharedPreferences ri(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(lr(str), 0);
        } catch (Throwable th) {
            ac.ik("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void ri(lr.ik ikVar, String str, T t) {
        if (t instanceof Integer) {
            ikVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            ikVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            ikVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            ikVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            ikVar.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void ri(SharedPreferences.Editor editor, String str, T t) {
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
}
