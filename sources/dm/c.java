package dm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38950b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // dm.g
    public final pm.y a(zk.w module) {
        switch (this.f38950b) {
            case 0:
                kotlin.jvm.internal.n.f(module, "module");
                wk.h hVarD = module.d();
                hVarD.getClass();
                return hVarD.s(wk.j.BOOLEAN);
            case 1:
                kotlin.jvm.internal.n.f(module, "module");
                wk.h hVarD2 = module.d();
                hVarD2.getClass();
                return hVarD2.s(wk.j.DOUBLE);
            default:
                kotlin.jvm.internal.n.f(module, "module");
                wk.h hVarD3 = module.d();
                hVarD3.getClass();
                return hVarD3.s(wk.j.FLOAT);
        }
    }

    @Override // dm.g
    public String toString() {
        switch (this.f38950b) {
            case 1:
                return ((Number) this.f38953a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f38953a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d10) {
        super(Double.valueOf(d10));
    }

    public c(float f10) {
        super(Float.valueOf(f10));
    }
}
