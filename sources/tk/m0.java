package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51020e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f51021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f51022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, q0 q0Var) {
        super(0);
        this.f51021f = o0Var;
        this.f51022g = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // jk.a
    public final Object invoke() {
        String str;
        switch (this.f51020e) {
            case 0:
                o1 o1Var = this.f51021f.f51032d;
                qk.w wVar = o0.f51030g[1];
                Object objInvoke = o1Var.invoke();
                kotlin.jvm.internal.n.e(objInvoke, "<get-scope>(...)");
                return this.f51022g.j((im.n) objInvoke, 1);
            default:
                o1 o1Var2 = this.f51021f.f51031c;
                qk.w wVar2 = o0.f51030g[0];
                el.b bVar = (el.b) o1Var2.invoke();
                if (bVar != null) {
                    eo.g gVar = bVar.f40113b;
                    str = (String) gVar.f40202h;
                    if (((sl.a) gVar.f40197c) != sl.a.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.f51022g.f51044b.getClassLoader().loadClass(an.p.m0(str, '/', '.'));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, o0 o0Var) {
        super(0);
        this.f51022g = q0Var;
        this.f51021f = o0Var;
    }
}
