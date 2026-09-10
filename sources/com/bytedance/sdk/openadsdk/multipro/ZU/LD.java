package com.bytedance.sdk.openadsdk.multipro.ZU;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.QAg;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class LD {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> Lxb;

    private static void LD(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Lxb;
        if (softReference == null || softReference.get() == null || (map = Lxb.get().get(Lxb(str))) == null) {
            return;
        }
        map.clear();
    }

    @Nullable
    public static SharedPreferences Lxb(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(Lxb(str), 0);
        } catch (Throwable th) {
            sLN.Lxb("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    public static Map<String, ?> lk(Context context, String str) {
        SharedPreferences sharedPreferencesLxb = Lxb(context, str);
        if (sharedPreferencesLxb == null) {
            return null;
        }
        return sharedPreferencesLxb.getAll();
    }

    private static String Lxb(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object LD(Context context, String str, String str2, String str3) {
        String strLxb = Lxb(str);
        if (!Lxb(context, strLxb, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_STRING)) {
            return Lxb.Lxb(context, strLxb, str2, (String) null);
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_BOOLEAN)) {
            return Boolean.valueOf(Lxb.Lxb(context, strLxb, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(Lxb.Lxb(context, strLxb, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(Lxb.Lxb(context, strLxb, str2, 0L));
        }
        if (str3.equalsIgnoreCase(TypedValues.Custom.S_FLOAT)) {
            return Float.valueOf(Lxb.Lxb(context, strLxb, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return Lxb.Lxb(context, strLxb, str2, (String) null);
        }
        return null;
    }

    private static Object Lxb(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Lxb;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(Lxb(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void Lxb(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Lxb;
        if (softReference == null || softReference.get() == null) {
            Lxb = new SoftReference<>(new ConcurrentHashMap());
        }
        String strLxb = Lxb(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = Lxb.get();
        if (concurrentHashMap.get(strLxb) == null) {
            concurrentHashMap.put(strLxb, new HashMap());
        }
        concurrentHashMap.get(strLxb).put(str2, obj);
    }

    public static synchronized <T> void Lxb(Context context, String str, String str2, T t) {
        String strLxb = Lxb.Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            com.bytedance.sdk.component.LD ldLxb = com.bytedance.sdk.component.LD.Lxb(context, strLxb);
            if (t.equals(Lxb(strLxb, str2))) {
                return;
            }
            com.bytedance.sdk.component.LD.lk lkVarLD = ldLxb.LD();
            Lxb(lkVarLD, str2, (Object) t);
            lkVarLD.apply();
            Lxb(strLxb, str2, t);
            return;
        }
        SharedPreferences sharedPreferencesLxb = Lxb(context, strLxb);
        if (sharedPreferencesLxb == null) {
            return;
        }
        if (t.equals(Lxb(strLxb, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLxb.edit();
        Lxb(editorEdit, str2, t);
        editorEdit.apply();
        Lxb(strLxb, str2, t);
    }

    public static void LD(Context context, String str, String str2) {
        try {
            String strLxb = Lxb.Lxb(str, str2);
            if (QAg.ebl(strLxb)) {
                com.bytedance.sdk.component.LD.Lxb(context, strLxb).LD().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesLxb = Lxb(context, strLxb);
            if (sharedPreferencesLxb == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesLxb.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Lxb;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = Lxb.get().get(Lxb(strLxb));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LD(Context context, String str) {
        if (QAg.ebl(str)) {
            com.bytedance.sdk.component.LD.Lxb(context, str).LD().clear().apply();
            LD(str);
            return;
        }
        SharedPreferences sharedPreferencesLxb = Lxb(context, str);
        if (sharedPreferencesLxb == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLxb.edit();
        editorEdit.clear();
        editorEdit.apply();
        LD(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void Lxb(SharedPreferences.Editor editor, String str, T t) {
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
    public static <T> void Lxb(com.bytedance.sdk.component.LD.lk lkVar, String str, T t) {
        if (t instanceof Integer) {
            lkVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            lkVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            lkVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            lkVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            lkVar.putString(str, (String) t);
        }
    }

    public static String Lxb(Context context, String str, String str2, String str3) {
        Object objLxb = Lxb(str, str2);
        if (objLxb != null) {
            return String.valueOf(objLxb);
        }
        Object objLD = LD(context, str, str2, str3);
        Lxb(str, str2, objLD);
        return String.valueOf(objLD);
    }

    public static boolean Lxb(Context context, String str, String str2) {
        String strLxb = Lxb.Lxb(str, str2);
        if (QAg.ebl(strLxb)) {
            return com.bytedance.sdk.component.LD.Lxb(context, strLxb).Lxb(str2);
        }
        SharedPreferences sharedPreferencesLxb = Lxb(context, strLxb);
        return sharedPreferencesLxb != null && sharedPreferencesLxb.contains(str2);
    }
}
