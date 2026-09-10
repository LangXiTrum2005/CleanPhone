package ea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum v1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39798a;

    v1(String str) {
        this.f39798a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f39798a;
    }
}
