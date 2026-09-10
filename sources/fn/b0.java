package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f41035b;

    public /* synthetic */ b0(kotlin.jvm.internal.c0 c0Var, int i10) {
        this.f41034a = i10;
        this.f41035b = c0Var;
    }

    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        switch (this.f41034a) {
            case 0:
                this.f41035b.f44760a = obj;
                throw new gn.a(this);
            case 1:
                this.f41035b.f44760a = obj;
                throw new gn.a(this);
            default:
                kotlin.jvm.internal.c0 c0Var = this.f41035b;
                if (c0Var.f44760a != gn.b.f41982b) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                c0Var.f44760a = obj;
                return wj.r.f53297a;
        }
    }
}
