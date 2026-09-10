package fa;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i9.e;
import i9.f;
import i9.g;
import i9.h;
import java.lang.reflect.Method;
import k9.c0;
import org.chromium.net.ApiVersion;
import t9.d;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f40714a = e.f42929b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40715b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f40716c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f40717d = "0";

    public static Task a(Context context) {
        d dVar;
        c0.i(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (f40715b) {
            dVar = f40716c;
        }
        if (dVar != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new i0(21, context, taskCompletionSource)).start();
        return taskCompletionSource.getTask();
    }

    public static void b(Context context) {
        d dVar;
        Object obj = f40715b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dVar = f40716c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dVar != null) {
            return;
        }
        c0.i(context, "Context must not be null");
        ClassLoader classLoader = a.class.getClassLoader();
        c0.h(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            e eVar = f40714a;
            eVar.getClass();
            h.a(context, 11925000);
            try {
                d dVarC = d.c(context, d.f50563b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> clsLoadClass = dVarC.f50576a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                        Log.e("a", "ImplVersion class is missing from Cronet module.");
                        throw new f();
                    }
                    Method method = clsLoadClass.getMethod("getApiLevel", null);
                    Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    c0.h(num);
                    int iIntValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    c0.h(str);
                    f40717d = str;
                    if (apiLevel <= iIntValue) {
                        f40716c = dVarC;
                        return;
                    }
                    Intent intentB = eVar.b(context, 2, "cr");
                    if (intentB == null) {
                        Log.e("a", "Unable to fetch error resolution intent");
                        throw new f();
                    }
                    String str2 = f40717d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb2.append("Google Play Services update is required. The API Level of the client is ");
                    sb2.append(apiLevel);
                    sb2.append(". The API Level of the implementation is ");
                    sb2.append(iIntValue);
                    sb2.append(". The Cronet implementation version is ");
                    sb2.append(str2);
                    throw new g(2, intentB, sb2.toString());
                } catch (Exception e10) {
                    Log.e("a", "Unable to read Cronet version from the Cronet module ", e10);
                    throw ((f) new f().initCause(e10));
                }
            } catch (t9.a e11) {
                Log.e("a", "Unable to load Cronet module", e11);
                throw ((f) new f().initCause(e11));
            }
        } catch (ClassNotFoundException e12) {
            Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
            throw ((f) new f().initCause(e12));
        }
    }
}
