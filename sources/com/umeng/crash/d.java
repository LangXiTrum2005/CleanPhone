package com.umeng.crash;

import android.os.Process;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class d implements Thread.UncaughtExceptionHandler {
    private static final d c = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f.b f2717a;
    Thread.UncaughtExceptionHandler b;

    private d() {
    }

    public static d a() {
        return c;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        UCrash.a().c("UCrash.Java", "uncaughtException time: " + new Date());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            f.b bVar = this.f2717a;
            if (bVar == null) {
                UCrash.a().d("UCrash.Java", "config null.");
            } else {
                f.a aVar = bVar.f2719a;
                if (aVar == null) {
                    UCrash.a().d("UCrash.Java", "callback null.");
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    BufferedOutputStream bufferedOutputStream = null;
                    try {
                        i iVarA = i.a();
                        if (iVarA.b && iVarA.f2721a.l) {
                            try {
                                UCrashJNI.onJavaCrashed();
                            } catch (Throwable th2) {
                                UCrash.a().a("UCrash.Native", "notifyJavaCrashed failed", th2);
                            }
                        }
                        c cVarA = c.a();
                        String strA = k.a(jCurrentTimeMillis, "_java.log");
                        File file = new File(cVarA.c, strA);
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, false));
                        try {
                            k.a(bufferedOutputStream2, m.a(UCrashCallback.TYPE_JAVA, jCurrentTimeMillis, strA));
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.i());
                            String str = cVarA.f;
                            StringWriter stringWriter = new StringWriter();
                            th.printStackTrace(new PrintWriter(stringWriter));
                            String str2 = String.format(Locale.US, "Process Name: '%s'\nThread Name: '%s'\nBack traces starts.\n%sBack traces ends.\n", str, thread.getName(), stringWriter);
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, str2);
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.f());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.h());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.e());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.g());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.a(this.f2717a.e));
                            if (this.f2717a.e) {
                                k.a(bufferedOutputStream2, m.b(thread.getName()));
                            }
                            if (this.f2717a.f) {
                                k.a((OutputStream) bufferedOutputStream2);
                                k.a(bufferedOutputStream2, m.c());
                            }
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.j());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.k());
                            k.a((OutputStream) bufferedOutputStream2);
                            k.a(bufferedOutputStream2, m.m());
                            if (this.f2717a.d) {
                                k.a((OutputStream) bufferedOutputStream2);
                                k.a(bufferedOutputStream2, m.b());
                            }
                            aVar.a(UCrashCallback.TYPE_JAVA, bufferedOutputStream2);
                            bufferedOutputStream2.flush();
                            aVar.a(UCrashCallback.TYPE_JAVA, file.getPath());
                            k.a((Closeable) bufferedOutputStream2);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = bufferedOutputStream2;
                            try {
                                UCrash.a().a("UCrash.Java", "java crash failed", th);
                                k.a((Closeable) bufferedOutputStream);
                            } catch (Throwable th4) {
                                k.a((Closeable) bufferedOutputStream);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        } catch (Throwable th6) {
            UCrash.a().a("UCrash.Java", "handleException failed", th6);
        }
        f.b bVar2 = this.f2717a;
        if (bVar2 == null || !bVar2.c) {
            e.a().b();
            Process.killProcess(Process.myPid());
            System.exit(10);
        } else {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
