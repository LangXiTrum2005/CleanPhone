package u8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum c implements pc.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51926a;

    c(int i10) {
        this.f51926a = i10;
    }

    @Override // pc.c
    public final int getNumber() {
        return this.f51926a;
    }
}
