package com.apm.insight.l;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.p004ironsource.ne;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f10213a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f10214b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f10215c = null;
    private static Field d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10216e = false;

    private static long a(int i2) {
        if (i2 < 0) {
            return 0L;
        }
        return ((long) i2) << 10;
    }

    public static boolean b(Context context) {
        String strB = b();
        if (strB != null && strB.contains(":")) {
            return false;
        }
        if (strB == null || !strB.equals(context.getPackageName())) {
            return strB != null && strB.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    private static String c() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String d() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i2 = bufferedReader.read();
                    if (i2 <= 0) {
                        String string = sb.toString();
                        com.apm.insight.a.a((Closeable) bufferedReader);
                        return string;
                    }
                    sb.append((char) i2);
                }
            } catch (Throwable unused) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static boolean a() {
        return com.apm.insight.runtime.a.b.d().f();
    }

    public static ActivityManager.ProcessErrorStateInfo a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null) {
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == iMyPid && processErrorStateInfo.condition == 2) {
                    return processErrorStateInfo;
                }
            }
        }
        return null;
    }

    public static String c(Context context) {
        Class<?> clsE = e(context);
        if (f10215c == null && clsE != null) {
            try {
                f10215c = clsE.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f10215c;
        if (field != null) {
            try {
                return String.valueOf(field.get(null));
            } catch (Throwable unused2) {
                return "";
            }
        }
        return "";
    }

    public static String b() {
        if (!TextUtils.isEmpty(f10213a)) {
            return f10213a;
        }
        String strC = c();
        f10213a = strC;
        if (!TextUtils.isEmpty(strC)) {
            return f10213a;
        }
        String strD = d();
        f10213a = strD;
        if (!TextUtils.isEmpty(strD)) {
            return f10213a;
        }
        String strE = e();
        f10213a = strE;
        if (strE == null) {
            f10213a = "";
        }
        return f10213a;
    }

    public static int d(Context context) {
        Class<?> clsE = e(context);
        if (d == null && clsE != null) {
            try {
                d = clsE.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    public static void a(String str) {
        f10213a = str;
    }

    private static Class<?> e(Context context) {
        if (f10214b == null && !f10216e) {
            try {
                f10214b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f10216e = true;
        }
        return f10214b;
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
            jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
            jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
            jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
            jSONObject2.put("nativePss", a(memoryInfo.nativePss));
            jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
            jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
            jSONObject2.put("otherPss", a(memoryInfo.otherPss));
            jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put("totalPrivateClean", c.a(memoryInfo));
            jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
            jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
            jSONObject2.put("totalSharedClean", c.b(memoryInfo));
            jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
            jSONObject2.put("totalSwappablePss", a(c.c(memoryInfo)));
            jSONObject.put("memory_info", jSONObject2);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                JSONObject jSONObject3 = new JSONObject();
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo2);
                jSONObject3.put(ne.f26280w, memoryInfo2.availMem);
                jSONObject3.put("lowMemory", memoryInfo2.lowMemory);
                jSONObject3.put("threshold", memoryInfo2.threshold);
                jSONObject3.put("totalMem", i.a(memoryInfo2));
                jSONObject.put("sys_memory_info", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            com.apm.insight.entity.a.a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
            jSONObject4.put("native_heap_size", Debug.getNativeHeapSize());
            jSONObject4.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
            jSONObject4.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            jSONObject4.put("max_memory", jMaxMemory);
            jSONObject4.put("free_memory", jFreeMemory);
            jSONObject4.put("total_memory", j);
            com.apm.insight.entity.a.a(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j - jFreeMemory)) > ((float) jMaxMemory) * 0.95f));
            if (activityManager != null) {
                jSONObject4.put("memory_class", activityManager.getMemoryClass());
                jSONObject4.put("large_memory_class", activityManager.getLargeMemoryClass());
            }
            jSONObject.put("app_memory_info", jSONObject4);
        } catch (Throwable unused2) {
        }
    }
}
