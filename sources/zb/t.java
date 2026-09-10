package zb;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh.e f54758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f54759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f54760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb.a f54761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f54762e = new AtomicBoolean(false);

    public t(xh.e eVar, com.google.android.gms.internal.consent_sdk.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, wb.a aVar) {
        this.f54758a = eVar;
        this.f54759b = dVar;
        this.f54760c = uncaughtExceptionHandler;
        this.f54761d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f54761d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f54760c;
        AtomicBoolean atomicBoolean = this.f54762e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    xh.e eVar = this.f54758a;
                    ((l) eVar.f53807a).i(this.f54759b, thread, th2, false);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e10) {
                wb.c cVar = wb.c.f53149a;
                if (cVar.a(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar.b("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    cVar.b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th3) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
