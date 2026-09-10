package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum z implements zl.o {
    /* JADX INFO: Fake field, exist only in values array */
    DECLARATION(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAKE_OVERRIDE(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELEGATION(2),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHESIZED(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51580a;

    z(int i10) {
        this.f51580a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f51580a;
    }
}
