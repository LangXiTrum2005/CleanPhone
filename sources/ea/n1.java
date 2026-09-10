package ea;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39623c;

    public /* synthetic */ n1(int i10, Object obj, Object obj2) {
        this.f39621a = i10;
        this.f39623c = obj2;
        this.f39622b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f39621a) {
            case 0:
                s1 s1Var = (s1) this.f39622b;
                s1Var.f39761a.V();
                m mVar = s1Var.f39761a.f39373c;
                e4.T(mVar);
                return mVar.D1((String) this.f39623c);
            case 1:
                s1 s1Var2 = (s1) this.f39622b;
                s1Var2.f39761a.V();
                return new i(s1Var2.f39761a.q0(((n4) this.f39623c).f39628a));
            case 2:
                n4 n4Var = (n4) this.f39623c;
                String str = n4Var.f39628a;
                k9.c0.h(str);
                e4 e4Var = (e4) this.f39622b;
                y1 y1VarA = e4Var.a(str);
                x1 x1Var = x1.ANALYTICS_STORAGE;
                if (y1VarA.i(x1Var) && y1.c(100, n4Var.f39645s).i(x1Var)) {
                    return e4Var.c0(n4Var).F();
                }
                e4Var.t().f39760n.b("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                ri.d dVar = (ri.d) this.f39622b;
                Context context = (Context) this.f39623c;
                uj.a.c("FlutterLoader initTask");
                int i10 = 0;
                try {
                    try {
                        FlutterJNI flutterJNI = dVar.f49604e;
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        dVar.f49605f.execute(new q1.c(this, 6));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(context.getDataDir().getPath(), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(context.getDataDir().getPath(), "app_flutter");
                        }
                        dir.getPath();
                        ri.c cVar = new ri.c(path, path2);
                        Trace.endSection();
                        return cVar;
                    } catch (UnsatisfiedLinkError e10) {
                        if (!e10.toString().contains("couldn't find \"libflutter.so\"") && !e10.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e10;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) dVar.f49603d.f5780e);
                        String[] list = file.list();
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = Build.SUPPORTED_ABIS;
                        int length = strArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            String str2 = strArr[i11];
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("!");
                            String str3 = File.separator;
                            sb2.append(str3);
                            sb2.append("lib");
                            sb2.append(str3);
                            sb2.append(str2);
                            String string = sb2.toString();
                            String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                            ArrayList arrayList2 = new ArrayList();
                            if (strArr2 != null) {
                                int length2 = strArr2.length;
                                for (int i12 = i10; i12 < length2; i12++) {
                                    arrayList2.add(strArr2[i12] + string);
                                }
                                arrayList.addAll(arrayList2);
                            }
                            String str4 = context.getApplicationInfo().sourceDir;
                            if (str4 != null && !str4.isEmpty()) {
                                arrayList.add(str4 + string);
                            }
                            i11++;
                            i10 = 0;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb3.append(property);
                        sb3.append(", and the native libraries directory (with path ");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(") ");
                        sb3.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                        sb3.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                        sb3.append(".");
                        throw new UnsupportedOperationException(sb3.toString(), e10);
                    }
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
        }
    }

    public n1(e4 e4Var, n4 n4Var) {
        this.f39621a = 2;
        this.f39623c = n4Var;
        Objects.requireNonNull(e4Var);
        this.f39622b = e4Var;
    }
}
