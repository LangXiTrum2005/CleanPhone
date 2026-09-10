package ad;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum c implements pc.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3474a;

    c(int i10) {
        this.f3474a = i10;
    }

    @Override // pc.c
    public final int getNumber() {
        return this.f3474a;
    }
}
