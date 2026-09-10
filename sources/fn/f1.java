package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f41068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ck.i f41069b;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(r0 r0Var, jk.c cVar) {
        this.f41068a = r0Var;
        this.f41069b = (ck.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [ck.i, jk.c] */
    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) {
        e1 e1Var;
        if (fVar2 instanceof e1) {
            e1Var = (e1) fVar2;
            int i10 = e1Var.f41063h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e1Var.f41063h = i10 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(this, fVar2);
            }
        } else {
            e1Var = new e1(this, fVar2);
        }
        Object obj = e1Var.f41061f;
        int i11 = e1Var.f41063h;
        if (i11 == 0) {
            t9.e.z(obj);
            d1 d1Var = new d1(fVar, this.f41069b);
            e1Var.f41063h = 1;
            Object objCollect = this.f41068a.collect(d1Var, e1Var);
            bk.a aVar = bk.a.f5708a;
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        throw new aa.b((byte) 0, 19);
    }
}
