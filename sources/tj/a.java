package tj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f50795c;

    public a(String str, String str2, String str3) {
        this.f50793a = str;
        this.f50794b = str2;
        this.f50795c = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f50794b;
    }
}
