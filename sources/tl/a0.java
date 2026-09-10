package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum a0 implements zl.o {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51100a;

    a0(int i10) {
        this.f51100a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f51100a;
    }
}
