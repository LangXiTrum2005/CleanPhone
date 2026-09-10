package ad;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public enum b implements pc.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3471a;

    b(int i10) {
        this.f3471a = i10;
    }

    @Override // pc.c
    public final int getNumber() {
        return this.f3471a;
    }
}
