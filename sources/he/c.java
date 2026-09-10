package he;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f42337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f42338b;

    static {
        f42337a = System.getProperty("surefire.test.class.path") != null;
        f42338b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
