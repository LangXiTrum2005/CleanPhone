package f4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import ea.b0;
import java.io.File;
import java.io.IOException;
import z.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f40649a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40650b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static b0 f40651c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static b0 b() {
        b0 b0Var = new b0(14);
        f40651c = b0Var;
        f40649a.i(b0Var);
        return f40651c;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0047 A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004d A[Catch: all -> 0x0013, TryCatch #2 {, blocks: (B:9:0x000d, B:11:0x0011, B:16:0x001a, B:22:0x002f, B:33:0x0041, B:35:0x0047, B:36:0x004a, B:38:0x004d, B:44:0x0070, B:50:0x0093, B:51:0x0097, B:53:0x00a8, B:61:0x00b6, B:63:0x00bc, B:78:0x00d8, B:81:0x00de, B:84:0x00e5, B:86:0x00ee, B:89:0x00f7, B:90:0x00fa, B:88:0x00f4, B:55:0x00ad, B:56:0x00b0, B:92:0x00fc, B:93:0x00ff, B:31:0x003f, B:30:0x003c), top: B:102:0x000d, inners: #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void c(Context context, boolean z10) {
        int i10;
        boolean z11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        g gVarA;
        g gVar;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f40651c == null) {
            synchronized (f40650b) {
                if (z10) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    if (Build.VERSION.SDK_INT == 30) {
                        b();
                        return;
                    }
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        gVarA = g.a(file3);
                    } else {
                        gVarA = null;
                    }
                    if (gVarA == null) {
                        if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                    } else if (!z11) {
                        i10 = 327680;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                    if (z10) {
                        i10 = 2;
                    }
                    if (gVarA != null) {
                        i10 = 3;
                    }
                    gVar = new g(1, i10, jA, length);
                    if (gVarA != null) {
                        gVar.b(file3);
                    } else {
                        gVar.b(file3);
                    }
                    b();
                    return;
                }
                if (f40651c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                        if (Build.VERSION.SDK_INT == 30) {
                            b();
                            return;
                        }
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length3 = file.length();
                        if (file.exists() || length3 <= 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists() || length <= 0) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        try {
                            long jA2 = a(context);
                            file3 = new File(context.getFilesDir(), "profileInstalled");
                            if (file3.exists()) {
                                try {
                                    gVarA = g.a(file3);
                                } catch (IOException unused) {
                                    b();
                                    return;
                                }
                            } else {
                                gVarA = null;
                            }
                            if (gVarA == null && gVarA.f40647c == jA2 && (i11 = gVarA.f40646b) != 2) {
                                i10 = i11;
                            } else if (!z11) {
                                i10 = 327680;
                            } else if (z12) {
                                i10 = 1;
                            } else if (z13) {
                                i10 = 2;
                            }
                            if (z10 && z13 && i10 != 1) {
                                i10 = 2;
                            }
                            if (gVarA != null && gVarA.f40646b == 2 && i10 == 1 && length3 < gVarA.f40648d) {
                                i10 = 3;
                            }
                            gVar = new g(1, i10, jA2, length);
                            if (gVarA != null || !gVarA.equals(gVar)) {
                                try {
                                    gVar.b(file3);
                                } catch (IOException unused2) {
                                }
                            }
                            b();
                            return;
                        } catch (PackageManager.NameNotFoundException unused3) {
                            b();
                            return;
                        }
                    } catch (Throwable th2) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th2;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (IOException unused4) {
                    z11 = false;
                }
                throw th;
            }
        }
    }
}
