package wk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum p {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(yl.b.e("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(yl.b.e("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(yl.b.e("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(yl.b.e("kotlin/ULong", false));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.b f53386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.f f53387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl.b f53388c;

    p(yl.b bVar) {
        this.f53386a = bVar;
        yl.f fVarI = bVar.i();
        kotlin.jvm.internal.n.e(fVarI, "classId.shortClassName");
        this.f53387b = fVarI;
        this.f53388c = new yl.b(bVar.g(), yl.f.e(fVarI.b() + "Array"));
    }
}
