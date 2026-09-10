package ga;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.d;
import i9.e;
import i9.f;
import i9.g;
import i9.h;
import java.lang.reflect.Method;
import k9.c0;
import v6.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f41774a = e.f42929b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f41775b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f41776c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f41777d = false;

    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x0017, B:7:0x001e, B:14:0x0041, B:15:0x0046, B:12:0x002d, B:17:0x0048, B:19:0x004d, B:25:0x0059, B:27:0x005d, B:30:0x0097, B:33:0x00a7, B:34:0x00ac, B:36:0x00ae, B:37:0x00ba), top: B:42:0x0017, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x0017, B:7:0x001e, B:14:0x0041, B:15:0x0046, B:12:0x002d, B:17:0x0048, B:19:0x004d, B:25:0x0059, B:27:0x005d, B:30:0x0097, B:33:0x00a7, B:34:0x00ac, B:36:0x00ae, B:37:0x00ba), top: B:42:0x0017, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(Context context) throws f, g {
        boolean z10;
        Context contextCreatePackageContext;
        Context context2;
        c0.i(context, "Context must not be null");
        f41774a.getClass();
        h.a(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f41775b) {
            Context context3 = null;
            if (f41777d) {
                z10 = f41777d;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    f41777d = true;
                    if (!z10) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        c cVar = new c(Context.class, context);
                        Class cls = Long.TYPE;
                        d.P(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", cVar, new z9.h(cls, Long.valueOf(jUptimeMillis)), new z9.h(cls, Long.valueOf(jUptimeMillis2)));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new f();
                }
            }
            try {
                context2 = t9.d.c(context, t9.d.f50566e, "com.google.android.gms.providerinstaller.dynamite").f50576a;
            } catch (t9.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z10 = f41777d;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                f41777d = true;
                if (!z10) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        c cVar2 = new c(Context.class, context);
                        Class cls2 = Long.TYPE;
                        d.P(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", cVar2, new z9.h(cls2, Long.valueOf(jUptimeMillis)), new z9.h(cls2, Long.valueOf(jUptimeMillis3)));
                    } catch (Exception e11) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e11.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new f();
            }
            throw th;
        }
    }

    public static void b(Context context, String str) throws f {
        try {
            if (f41776c == null) {
                f41776c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f41776c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new f();
        }
    }
}
