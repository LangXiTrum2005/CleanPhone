package hn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42456a = 0;

    static {
        Object objC;
        Object objC2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objC = ck.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (wj.h.a(objC) != null) {
            objC = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objC2 = t.class.getCanonicalName();
        } catch (Throwable th3) {
            objC2 = t9.e.c(th3);
        }
        if (wj.h.a(objC2) != null) {
            objC2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
