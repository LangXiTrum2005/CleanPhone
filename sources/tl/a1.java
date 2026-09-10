package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum a1 implements zl.o {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51105a;

    a1(int i10) {
        this.f51105a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f51105a;
    }
}
