package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.k.h;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.m;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f10113a = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile boolean f10114i = false;
    private static volatile ThreadLocal<Boolean> j = new ThreadLocal<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile long f10115l = 10000;
    private static ArrayList<b> m = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f10117c;
    private c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f10118e = 0;
    private volatile int f = 0;
    private ConcurrentHashMap<String, Object> g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f10119h = new ConcurrentHashMap<>();
    private JSONArray k;

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f10116b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static a a() {
        if (f10113a == null) {
            f10113a = new a();
        }
        return f10113a;
    }

    private void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10116b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    private void d() {
        synchronized (this) {
            this.f--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f != 0 && SystemClock.uptimeMillis() - jUptimeMillis < f10115l) {
            SystemClock.sleep(50L);
        }
    }

    private static void e() {
        File fileA = j.a(e.g());
        File fileA2 = j.a();
        if (f.b(fileA) && f.b(fileA2)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h.a() && SystemClock.uptimeMillis() - jUptimeMillis < f10115l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private static int f() {
        int iA = 0;
        for (int i2 = 0; i2 < m.size(); i2++) {
            try {
                try {
                    iA |= m.get(i2).a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return iA;
    }

    private static Throwable g() {
        for (int i2 = 0; i2 < m.size(); i2++) {
            try {
                m.get(i2);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    public final void b(c cVar) {
        this.d = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        do {
            th = a(thread, th);
        } while (th != null);
    }

    private static boolean b(Thread thread, Throwable th) {
        ICrashFilter iCrashFilterB = e.b().b();
        if (iCrashFilterB != null) {
            try {
                if (!iCrashFilterB.onJavaCrashFilter(th, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (aVarA != null) {
                            com.apm.insight.k.d.a().c(aVarA.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        Boolean bool = j.get();
        return bool != null && bool.booleanValue();
    }

    public final void a(c cVar) {
        this.f10117c = cVar;
    }

    public final boolean b(String str) {
        return this.g.containsKey(str);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ac A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #10 {all -> 0x01b0, blocks: (B:103:0x01a6, B:105:0x01ac), top: B:161:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[PHI: r0
  0x0065: PHI (r0v52 boolean) = (r0v9 boolean), (r0v53 boolean), (r0v53 boolean), (r0v53 boolean) binds: [B:24:0x0064, B:20:0x005a, B:142:0x0065, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.apm.insight.g.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v15, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.apm.insight.g.a] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [long] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Throwable a(Thread thread, Throwable th) {
        boolean zC;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r5;
        ?? r1;
        ?? r2;
        ?? r6;
        ?? r3;
        ?? r4;
        ?? r0;
        ?? r7 = this;
        if (r7.f10118e >= 3) {
            return null;
        }
        r7.f10118e++;
        r7.f++;
        if (f10114i) {
            j.set(Boolean.TRUE);
        }
        f10114i = true;
        ?? CurrentTimeMillis = System.currentTimeMillis();
        boolean z5 = (com.apm.insight.runtime.a.b.c() == -1 || CurrentTimeMillis - com.apm.insight.runtime.a.b.c() <= e.i().getLaunchCrashInterval()) && !(e.n() && e.q() == 0);
        try {
            zC = com.apm.insight.l.m.c(th);
            if (zC) {
                try {
                    if (com.apm.insight.l.m.d(th)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } catch (Throwable unused) {
                }
            } else {
                z2 = false;
            }
        } catch (Throwable unused2) {
            zC = false;
        }
        try {
            try {
                String strA = e.a(CurrentTimeMillis, z5 ? CrashType.LAUNCH : CrashType.JAVA, zC, false);
                File file = new File(j.a(e.g()), strA);
                String strA2 = r7.a(new File(file, "logEventStack"), th, thread, z2);
                if ((f() & 1) != 0 || (strA2 != null && e.i().isCrashIgnored(strA2))) {
                    z3 = false;
                    z4 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                try {
                    JSONArray jSONArrayA = com.apm.insight.entity.b.a(th, thread, file);
                    r7.k = jSONArrayA;
                    if (jSONArrayA == null || z4) {
                        strA = e.a(CurrentTimeMillis, z5 != 0 ? CrashType.LAUNCH : CrashType.JAVA, zC, true);
                        File file2 = new File(j.a(e.g()), strA);
                        file.renameTo(file2);
                        new File(file2, "logEventStack");
                    }
                    com.apm.insight.a.d();
                    com.apm.insight.k.b.a().b();
                    if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        try {
                            r7.a(thread, th, z5, CurrentTimeMillis);
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = r7;
                            r5 = CurrentTimeMillis;
                            try {
                                if (!com.apm.insight.l.m.c(th)) {
                                    com.apm.insight.a.a(th);
                                }
                                if (!z4) {
                                    if (z2) {
                                        r1.a(thread, th, z5, r5);
                                    }
                                    e();
                                    r2 = r1;
                                    r2.d();
                                    c(thread, th);
                                    return null;
                                }
                                synchronized (this) {
                                    r1.f--;
                                    r1.f10118e--;
                                    return g();
                                }
                            } catch (Throwable th3) {
                                if (!z4) {
                                    if (z2 && !z3) {
                                        try {
                                            r1.a(thread, th, z5, r5);
                                        } catch (Throwable unused3) {
                                            throw th3;
                                        }
                                    }
                                    e();
                                    r1.d();
                                    c(thread, th);
                                    throw th3;
                                }
                                synchronized (this) {
                                    r1.f--;
                                    r1.f10118e--;
                                    return g();
                                }
                            }
                        }
                    }
                    try {
                        ?? ValueOf = String.valueOf(z5);
                        com.apm.insight.a.a((Object) "[uncaughtException] isLaunchCrash=".concat(ValueOf));
                        com.apm.insight.a.a.a();
                        boolean zB = b(thread, th);
                        try {
                            if (zB) {
                                try {
                                    ?? r8 = r7.f10117c;
                                    if (r8 == 0 || z5 == 0) {
                                        r4 = CurrentTimeMillis;
                                        String str = strA;
                                        if (zB || (r0 = r7.d) == 0) {
                                            r6 = r4;
                                            ValueOf = r4;
                                        } else {
                                            r0.a(r4, thread, th, str, strA2, z4);
                                            r6 = r4;
                                            StringBuilder sb = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                            String string = th.toString();
                                            sb.append(string);
                                            com.apm.insight.a.a((Object) sb.toString());
                                            ValueOf = string;
                                        }
                                    } else {
                                        r8.a(CurrentTimeMillis, thread, th, strA, strA2, z4);
                                        r6 = CurrentTimeMillis;
                                        StringBuilder sb2 = new StringBuilder("[uncaughtException] mLaunchCrashDisposer ");
                                        String string2 = th.toString();
                                        sb2.append(string2);
                                        com.apm.insight.a.a((Object) sb2.toString());
                                        ValueOf = string2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r1 = r7;
                                    z5 = z5;
                                    r5 = CurrentTimeMillis;
                                    if (!com.apm.insight.l.m.c(th)) {
                                        com.apm.insight.a.a(th);
                                    }
                                    if (!z4) {
                                        if (z2 && !z3) {
                                            r1.a(thread, th, z5, r5);
                                        }
                                        e();
                                        r2 = r1;
                                    } else {
                                        synchronized (this) {
                                            r1.f--;
                                            r1.f10118e--;
                                        }
                                        return g();
                                    }
                                }
                            } else {
                                r4 = CurrentTimeMillis;
                                String str2 = strA;
                                if (zB) {
                                    r6 = r4;
                                    ValueOf = r4;
                                } else {
                                    r6 = r4;
                                    ValueOf = r4;
                                }
                            }
                            if (!z4) {
                                if (!z2 || z3) {
                                    r3 = r7;
                                } else {
                                    ?? r9 = r7;
                                    r9.a(thread, th, z5, r6);
                                    r3 = r9;
                                }
                                e();
                                r2 = r3;
                                r2.d();
                                c(thread, th);
                                return null;
                            }
                            synchronized (this) {
                                r7.f--;
                                r7.f10118e--;
                            }
                            return g();
                        } catch (Throwable th5) {
                            th = th5;
                            CurrentTimeMillis = ValueOf;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r1 = r7;
                    r5 = CurrentTimeMillis;
                }
            } catch (Throwable th8) {
                th = th8;
                z3 = false;
                z5 = z5;
                z4 = false;
                r1 = r7;
                r5 = CurrentTimeMillis;
            }
        } catch (Throwable unused4) {
        }
    }

    public static boolean b() {
        return f10114i;
    }

    private String a(File file, Throwable th, Thread thread, boolean z2) {
        String absolutePath = file.getAbsolutePath();
        this.f10119h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String strA = null;
        if (z2) {
            int iH = NativeImpl.h(absolutePath);
            if (iH > 0) {
                try {
                    e.g();
                    NativeImpl.a(iH, com.apm.insight.l.a.b());
                    NativeImpl.a(iH, IOUtils.LINE_SEPARATOR_UNIX);
                    NativeImpl.a(iH, th.getMessage());
                    NativeImpl.a(iH, IOUtils.LINE_SEPARATOR_UNIX);
                    NativeImpl.a(iH, th.getClass().getName());
                    if (th.getMessage() != null) {
                        NativeImpl.a(iH, ": ");
                        NativeImpl.a(iH, th.getMessage());
                    }
                    NativeImpl.a(iH, IOUtils.LINE_SEPARATOR_UNIX);
                    NativeImpl.a(iH, thread.getName());
                    NativeImpl.a(iH, IOUtils.LINE_SEPARATOR_UNIX);
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(iH, "stack:");
                    NativeImpl.a(iH, IOUtils.LINE_SEPARATOR_UNIX);
                } catch (Throwable unused3) {
                }
                com.apm.insight.l.m.a(th, iH);
                NativeImpl.b(iH);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb = new StringBuilder();
                    e.g();
                    sb.append(com.apm.insight.l.a.b());
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    fileOutputStream.write(sb.toString().getBytes());
                    fileOutputStream.write((th.getMessage() + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
                    fileOutputStream.write((th + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
                    fileOutputStream.write((thread.getName() + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    strA = com.apm.insight.l.m.a(th, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new com.apm.insight.l.e.a() { // from class: com.apm.insight.g.a.1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private boolean f10120a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(String str) {
                            if (!this.f10120a && str.contains("android.os.Looper.loop")) {
                                this.f10120a = true;
                            }
                            return !this.f10120a;
                        }
                    } : new com.apm.insight.l.e.a());
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    try {
                        th.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th2 + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
                            fileOutputStream.write((th3 + IOUtils.LINE_SEPARATOR_UNIX).getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return strA;
    }

    public final void a(Thread thread, Throwable th, boolean z2, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> listC;
        CrashType crashType;
        if (z2) {
            listC = l.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            listC = l.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listC) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, com.apm.insight.l.m.a(th), thread, this.k);
                } else {
                    iCrashCallback.onCrash(crashType, com.apm.insight.l.m.a(th), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th2) {
                com.apm.insight.a.b(th2);
                aVar.b("callback_err_".concat(iCrashCallback.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    private void a(Thread thread, Throwable th, boolean z2, long j2) {
        Thread thread2;
        Throwable th2;
        long j3;
        List<IOOMCallback> listA = l.a().a();
        CrashType crashType = z2 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : listA) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    thread2 = thread;
                    th2 = th;
                    j3 = j2;
                    try {
                        ((com.apm.insight.b) iOOMCallback).a(crashType, th2, thread2, j3, this.k);
                    } catch (Throwable th3) {
                        th = th3;
                        com.apm.insight.a.b(th);
                    }
                } else {
                    thread2 = thread;
                    th2 = th;
                    j3 = j2;
                    iOOMCallback.onCrash(crashType, th2, thread2, j3);
                }
            } catch (Throwable th4) {
                th = th4;
                thread2 = thread;
                th2 = th;
                j3 = j2;
            }
            th = th2;
            thread = thread2;
            j2 = j3;
        }
    }

    public final void a(String str) {
        this.g.put(str, new Object());
    }

    public static void a(final Throwable th) {
        if (th == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVarA = com.apm.insight.entity.a.a(System.currentTimeMillis(), e.g(), th);
                        aVarA.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA2 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVarA);
                        if (aVarA2 != null) {
                            com.apm.insight.k.d.a().c(aVarA2.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(long j2) {
        f10115l = j2;
    }
}
