package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f6722a;

    public j0(Throwable th2, w wVar, ak.k kVar) {
        super("Coroutine dispatcher " + wVar + " threw an exception, context = " + kVar, th2);
        this.f6722a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6722a;
    }
}
