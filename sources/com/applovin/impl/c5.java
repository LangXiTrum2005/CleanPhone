package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.applovin.impl.sdk.l f7653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f7654c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f7655a;

    public c5(com.applovin.impl.sdk.l lVar) {
        this.f7655a = com.applovin.impl.sdk.l.p().getSharedPreferences("com.applovin.sdk.preferences." + lVar.k0(), 0);
        f7653b = lVar;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void b(b5 b5Var, Object obj) {
        b(b5Var, obj, this.f7655a);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public void b(b5 b5Var, Object obj, SharedPreferences sharedPreferences) {
        a(b5Var.a(), obj, sharedPreferences);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = editor != null;
        if (!z10) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                com.applovin.impl.sdk.p.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z10) {
            return;
        }
        a(editor);
    }

    public static void b(b5 b5Var, Object obj, Context context) {
        a(b5Var.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public void b(b5 b5Var) {
        a(this.f7655a.edit().remove(b5Var.a()));
    }

    public Object a(b5 b5Var, Object obj) {
        return a(b5Var, obj, this.f7655a);
    }

    public Object a(b5 b5Var, Object obj, SharedPreferences sharedPreferences) {
        return a(b5Var.a(), obj, b5Var.b(), sharedPreferences);
    }

    public static Object a(b5 b5Var, Object obj, Context context) {
        return a(b5Var.a(), obj, b5Var.b(), a(context));
    }

    public static Object a(b5 b5Var, Object obj, SharedPreferences sharedPreferences, boolean z10) {
        return a(b5Var.a(), obj, b5Var.b(), sharedPreferences, z10);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object stringSet;
        long jLongValue;
        int iIntValue;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        iIntValue = ((Long) obj).intValue();
                    } else {
                        iIntValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, iIntValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        jLongValue = ((Integer) obj).longValue();
                    } else {
                        jLongValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, jLongValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            if (stringSet == null) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return obj;
            }
            Object objCast = cls.cast(stringSet);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return objCast;
        } catch (Throwable th2) {
            if (z10) {
                try {
                    com.applovin.impl.sdk.p.c("SharedPreferencesManager", "Error getting value for key: " + str, th2);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(b5 b5Var) {
        Object objA = a(b5Var, null);
        b(b5Var);
        return objA;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public static void a(SharedPreferences.Editor editor) {
        try {
            if (q7.i()) {
                com.applovin.impl.sdk.l lVar = f7653b;
                if (lVar != null && lVar.s0() != null) {
                    f6 f6VarS0 = f7653b.s0();
                    com.applovin.impl.sdk.l lVar2 = f7653b;
                    Objects.requireNonNull(editor);
                    f6VarS0.a((k5) new u6(lVar2, true, "commitSharedPreferencesChanges", new u9(editor, 5)), f6.b.OTHER);
                    return;
                }
                editor.apply();
                return;
            }
            editor.commit();
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("SharedPreferencesManager", "Unable to apply changes", th2);
            try {
                f7653b.E().a("SharedPreferencesManager", "persistChanges", th2);
            } catch (Throwable unused) {
            }
        }
    }

    private static SharedPreferences a(Context context) {
        if (f7654c == null) {
            f7654c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f7654c;
    }
}
