package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    private static volatile oo m = null;
    private static volatile int mo = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42354n = "t_b";
    private static final String o = "thinkup_platform_check";
    private static final String o0 = "g_m";
    private static final String om = "t_ps";
    private static final String on = "p_g";
    private static final String oo = "t_p";
    private final JSONObject m0 = new JSONObject();

    private oo() {
    }

    public static oo o() {
        if (m == null) {
            synchronized (oo.class) {
                try {
                    if (m == null) {
                        m = new oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void o(JSONArray jSONArray) {
        byte b2;
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    if (mo == -1 || mo != jSONArray.length()) {
                        Thread.currentThread().getName();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                            if (jSONObject != null) {
                                String strOptString = jSONObject.optString("network_name");
                                String strOptString2 = jSONObject.optString("network_class");
                                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                                    try {
                                        try {
                                            Class.forName(strOptString2);
                                            this.m0.put(strOptString, "");
                                        } catch (Throwable unused) {
                                        }
                                    } catch (ClassNotFoundException unused2) {
                                    }
                                    switch (strOptString.hashCode()) {
                                        case 102037:
                                            if (strOptString.equals(o0)) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 110680:
                                            if (strOptString.equals(on)) {
                                                b2 = 3;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 114519:
                                            if (strOptString.equals(f42354n)) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case 3550638:
                                            if (strOptString.equals(om)) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0) {
                                        Class<?> cls = Class.forName(strOptString2);
                                        Method method = cls.getMethod("getVersion", new Class[0]);
                                        method.setAccessible(true);
                                        String str = (String) method.invoke(cls, new Object[0]);
                                        if (!TextUtils.isEmpty(str)) {
                                            this.m0.put(strOptString, str);
                                        }
                                    } else if (b2 == 1) {
                                        Class<?> cls2 = Class.forName(strOptString2);
                                        Method method2 = cls2.getMethod("getAdManager", new Class[0]);
                                        method2.setAccessible(true);
                                        Object objInvoke = method2.invoke(cls2, new Object[0]);
                                        if (objInvoke != null) {
                                            Method method3 = objInvoke.getClass().getMethod("getSDKVersion", new Class[0]);
                                            method3.setAccessible(true);
                                            String str2 = (String) method3.invoke(objInvoke, new Object[0]);
                                            if (!TextUtils.isEmpty(str2)) {
                                                this.m0.put(strOptString, str2);
                                            }
                                        }
                                    } else if (b2 == 2) {
                                        Field field = Class.forName(strOptString2).getField("VERSION_NAME");
                                        field.setAccessible(true);
                                        String str3 = (String) field.get(null);
                                        if (!TextUtils.isEmpty(str3)) {
                                            this.m0.put(strOptString, str3);
                                        }
                                    } else if (b2 == 3) {
                                        Class<?> cls3 = Class.forName(strOptString2);
                                        Method method4 = cls3.getMethod("getSDKVersion", new Class[0]);
                                        method4.setAccessible(true);
                                        String str4 = (String) method4.invoke(cls3, new Object[0]);
                                        if (!TextUtils.isEmpty(str4)) {
                                            this.m0.put(strOptString, str4);
                                        }
                                    }
                                }
                            }
                        }
                        if (this.m0.length() > 0) {
                            Objects.toString(this.m0);
                            com.thinkup.core.common.oo0.oo.m(this.m0.toString(), (String) null);
                            mo = jSONArray.length();
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void o(int i2, Map<String, Object> map) {
        try {
            if (this.m0.length() > 0) {
                Objects.toString(this.m0);
                Iterator<String> itKeys = this.m0.keys();
                JSONObject jSONObject = new JSONObject();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("version", (String) this.m0.get(next));
                    if (next.equals(o0) && (i2 == 46 || i2 == 15)) {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (next.equals(on) && i2 == 92) {
                        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                            jSONObject2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    jSONObject.put(next, jSONObject2);
                }
                jSONObject.toString();
                com.thinkup.core.common.oo0.oo.m(this.m0.toString(), jSONObject.toString());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void o(String str, String str2) throws JSONException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        byte b2;
        try {
            try {
                Class.forName(str2);
                this.m0.put(str, "");
            } catch (ClassNotFoundException unused) {
            }
            switch (str.hashCode()) {
                case 102037:
                    if (!str.equals(o0)) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 110680:
                    if (!str.equals(on)) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case 114519:
                    if (!str.equals(f42354n)) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case 3550638:
                    if (!str.equals(om)) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                Class<?> cls = Class.forName(str2);
                Method method = cls.getMethod("getVersion", new Class[0]);
                method.setAccessible(true);
                String str3 = (String) method.invoke(cls, new Object[0]);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                this.m0.put(str, str3);
                return;
            }
            if (b2 == 1) {
                Class<?> cls2 = Class.forName(str2);
                Method method2 = cls2.getMethod("getAdManager", new Class[0]);
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(cls2, new Object[0]);
                if (objInvoke != null) {
                    Method method3 = objInvoke.getClass().getMethod("getSDKVersion", new Class[0]);
                    method3.setAccessible(true);
                    String str4 = (String) method3.invoke(objInvoke, new Object[0]);
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    this.m0.put(str, str4);
                    return;
                }
                return;
            }
            if (b2 == 2) {
                Field field = Class.forName(str2).getField("VERSION_NAME");
                field.setAccessible(true);
                String str5 = (String) field.get(null);
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                this.m0.put(str, str5);
                return;
            }
            if (b2 != 3) {
                return;
            }
            Class<?> cls3 = Class.forName(str2);
            Method method4 = cls3.getMethod("getSDKVersion", new Class[0]);
            method4.setAccessible(true);
            String str6 = (String) method4.invoke(cls3, new Object[0]);
            if (TextUtils.isEmpty(str6)) {
                return;
            }
            this.m0.put(str, str6);
        } catch (Throwable unused2) {
        }
    }
}
