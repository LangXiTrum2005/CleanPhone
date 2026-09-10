package fj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40962a = "firebase_crashlytics";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40963b;

    public e(String str) {
        this.f40963b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f40963b;
    }
}
