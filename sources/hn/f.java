package hn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ak.k f42426a;

    public f(ak.k kVar) {
        this.f42426a = kVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f42426a);
    }
}
