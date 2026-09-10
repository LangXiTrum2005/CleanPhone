package tl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum i implements zl.o {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51288a;

    i(int i10) {
        this.f51288a = i10;
    }

    @Override // zl.o
    public final int getNumber() {
        return this.f51288a;
    }
}
