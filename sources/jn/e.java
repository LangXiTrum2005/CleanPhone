package jn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f44019c;

    static {
        int i10 = k.f44027c;
        int i11 = k.f44028d;
        long j10 = k.f44029e;
        String str = k.f44025a;
        e eVar = new e();
        eVar.f44021b = new c(i10, i11, str, j10);
        f44019c = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // cn.w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
