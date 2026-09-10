package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f41126a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                if (vi.a(th) != null) {
                    if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th.getMessage())) {
                        try {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f41126a;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    }
                    g9.a(th, h9.g);
                    th.printStackTrace();
                }
                try {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f41126a;
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th);
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        } catch (Throwable unused) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f41126a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
        }
    }
}
