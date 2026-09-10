package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum e1 implements zl.o {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51209a;

    e1(int i10) {
        this.f51209a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f51209a;
    }
}
