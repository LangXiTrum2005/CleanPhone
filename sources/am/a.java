package am;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3691b;

    /* synthetic */ a(int i10) {
        this((i10 & 1) == 0, false);
    }

    a(boolean z10, boolean z11) {
        this.f3690a = z10;
        this.f3691b = z11;
    }
}
