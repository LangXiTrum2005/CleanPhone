package u7;

import cc.a2;
import kotlin.jvm.internal.n;
import ne.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f51909b = new c(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f51910c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f51911a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f51911a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t10, Throwable e10) {
        n.f(t10, "t");
        n.f(e10, "e");
        Throwable th2 = null;
        loop0: for (Throwable cause = e10; cause != null && cause != th2; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            n.e(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                n.e(element, "element");
                if (a2.y(element)) {
                    a.a.n(e10);
                    android.support.v4.media.session.a.b(e10, s7.a.f50198d).b();
                    break loop0;
                }
            }
            th2 = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f51911a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }
}
