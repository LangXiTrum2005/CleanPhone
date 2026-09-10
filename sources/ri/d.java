package ri;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import bo.e;
import bo.l;
import com.ironsource.X3;
import d5.u;
import ea.n1;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ne.c f49601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f49602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f49603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterJNI f49604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExecutorService f49605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f49606g;

    public static String c(Context context, String str) {
        if (!str.startsWith("--aot-shared-library-name=")) {
            throw new IllegalArgumentException("AOT shared library name flag was not specified correctly; please use --aot-shared-library-name=<path>.");
        }
        File file = new File(str.substring(26));
        try {
            String canonicalPath = file.getCanonicalPath();
            StringBuilder sbI = u.i(context.getApplicationContext().getFilesDir().getCanonicalPath());
            sbI.append(File.separator);
            boolean zStartsWith = canonicalPath.startsWith(sbI.toString());
            boolean zEndsWith = canonicalPath.endsWith(".so");
            if (zStartsWith && zEndsWith) {
                return "--aot-shared-library-name=".concat(canonicalPath);
            }
            Log.e("FlutterLoader", "External path " + canonicalPath + " rejected; not overriding aot-shared-library-name.");
            return null;
        } catch (IOException unused) {
            Log.e("FlutterLoader", "External path " + file.getPath() + " is not a valid path. Please ensure this shared AOT library exists.");
            return null;
        }
    }

    public final void a(Context context, String[] strArr) {
        if (this.f49600a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f49601b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            uj.a.c("FlutterLoader#ensureInitializationComplete");
            try {
                c cVar = (c) this.f49606g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                arrayList.add("--icu-native-lib-path=" + ((String) this.f49603d.f5780e) + File.separator + "libflutter.so");
                if (strArr != null) {
                    for (String str : strArr) {
                        if (str.startsWith("--aot-shared-library-name=")) {
                            String strC = c(context, str);
                            if (strC != null) {
                                str = strC;
                                arrayList.add(str);
                            } else {
                                Log.w("FlutterLoader", "Skipping unsafe AOT shared library name flag: " + str + ". Please ensure that the library is vetted and placed in your application's internal storage.");
                            }
                        } else {
                            arrayList.add(str);
                        }
                    }
                }
                arrayList.add("--aot-shared-library-name=" + ((String) this.f49603d.f5777b));
                arrayList.add("--aot-shared-library-name=" + ((String) this.f49603d.f5780e) + File.separator + ((String) this.f49603d.f5777b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(cVar.f49599b);
                arrayList.add(sb2.toString());
                Object obj = this.f49603d.f5779d;
                arrayList.add("--domain-network-policy=" + ((String) this.f49603d.f5779d));
                this.f49601b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i10 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i10 == 0) {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    i10 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i10);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        throw new IllegalArgumentException("io.flutter.embedding.android.DisableMergedPlatformUIThread is no longer allowed.");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=" + (bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? com.ironsource.mediationsdk.metadata.a.f29610g : "false"));
                this.f49604e.init(context, (String[]) arrayList.toArray(new String[0]), null, cVar.f49598a, cVar.f49599b, SystemClock.uptimeMillis() - this.f49602c, Build.VERSION.SDK_INT);
                this.f49600a = true;
                Trace.endSection();
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e10);
            throw new RuntimeException(e10);
        }
    }

    public final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f49603d.f5778c);
        return defpackage.e.q(File.separator, str, sb2);
    }

    public final void d(Context context) {
        ne.c cVar = new ne.c(12);
        if (this.f49601b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        uj.a.c("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f49601b = cVar;
            this.f49602c = SystemClock.uptimeMillis();
            this.f49603d = a.a(applicationContext);
            l lVarB = l.b((DisplayManager) applicationContext.getSystemService(X3.i.f27786d), this.f49604e);
            ((FlutterJNI) lVarB.f5819b).setAsyncWaitForVsyncDelegate((io.flutter.view.a) lVarB.f5821d);
            this.f49606g = this.f49605f.submit(new n1(3, this, applicationContext));
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
