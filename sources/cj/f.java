package cj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6445b;

    public f(String str, String str2) {
        this.f6444a = str;
        this.f6445b = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6445b;
    }
}
