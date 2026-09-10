package kj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44667b;

    public d(String str, String str2) {
        this.f44666a = str;
        this.f44667b = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f44667b;
    }
}
