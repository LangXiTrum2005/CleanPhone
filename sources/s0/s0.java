package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f49901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(w0 w0Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f49900f = i10;
        this.f49901g = w0Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f49900f) {
            case 0:
                return new s0(this.f49901g, fVar, 0);
            default:
                return new s0(this.f49901g, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f49900f) {
            case 0:
                break;
        }
        return ((s0) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f49900f;
        t9.e.z(obj);
        switch (i10) {
            case 0:
                return new Integer(b1.f49758b.nativeGetCounterValue(((b1) this.f49901g.f49942i.getValue()).f49759a));
            default:
                return new Integer(b1.f49758b.nativeIncrementAndGetCounterValue(((b1) this.f49901g.f49942i.getValue()).f49759a));
        }
    }
}
