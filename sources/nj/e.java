package nj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46777c;

    public e(String str, String str2, String str3) {
        this.f46775a = str;
        this.f46776b = str2;
        this.f46777c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f46776b;
    }
}
