package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.b.d;
import com.apm.insight.b.f;
import com.apm.insight.e;
import com.apm.insight.l.j;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class NativeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f10249a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f10250b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10251c = true;

    public static boolean a() {
        if (f10250b) {
            return f10249a;
        }
        f10250b = true;
        if (!f10249a) {
            f10249a = com.apm.insight.a.b("apminsighta");
        }
        return f10249a;
    }

    public static int b() {
        if (f10249a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static void c() {
    }

    public static void d() {
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i2);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i2, int i3, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i2);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i2);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i2);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i2, String str, String str2, String str3, int i3);

    private static native void doStartAnrMonitor(int i2);

    private static native void doWriteFile(int i2, String str, int i3);

    public static boolean e() {
        if (!f10249a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f() {
        if (!f10249a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void g() {
        new Thread(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    NativeImpl.l();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.c.a(th, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    public static int h(String str) {
        if (!f10249a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    public static void i(String str) {
        if (f10249a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    public static void j() {
        if (f10249a) {
            doSetUploadEnd();
        }
    }

    public static void k() {
        if (f10249a) {
            doInitThreadDump();
        }
    }

    public static /* synthetic */ void l() {
        if (f10249a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            e.j();
            d.c();
            f.a(e.g()).a().e();
        } catch (Throwable unused) {
        }
    }

    public static int c(String str) {
        if (f10249a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void d(String str) {
        if (f10249a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j) {
        if (f10249a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str) {
        if (f10249a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void f(String str) {
        if (f10249a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean h() {
        return f10251c;
    }

    public static void i() {
        if (f10249a) {
            doSignalMainThread();
        }
    }

    public static void g(String str) {
        if (f10249a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(String str) {
        if (f10249a) {
            doDumpHprof(str);
        }
    }

    public static boolean a(Context context) {
        String strA;
        boolean zA = a();
        if (zA) {
            String str = j.j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                strA = context.getApplicationInfo().nativeLibraryDir;
            } else {
                strA = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, strA, str, e.f(), e.m());
        }
        return zA;
    }

    public static void b(int i2) {
        if (f10249a) {
            try {
                doCloseFile(i2);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(long j) {
        if (f10249a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(String str) {
        if (f10249a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void a(File file) {
        if (f10249a) {
            doRebuildTombstone(j.c(file).getAbsolutePath(), j.b(file).getAbsolutePath(), j.d(file).getAbsolutePath());
        }
    }

    public static int a(int i2) {
        if (f10249a && i2 >= 0) {
            try {
                return doLock("", i2);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void a(String str, String str2, String str3) {
        if (f10249a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(int i2, String str) {
        if (!f10249a || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            doWriteFile(i2, str, str.length());
        } catch (Throwable unused) {
        }
    }

    public static void a(boolean z2) {
        f10251c = z2;
        if (f10249a) {
            doSetResendSigQuit(z2 ? 1 : 0);
        }
    }
}
