package cl;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6473b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f6472a = i10;
        this.f6473b = obj;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f6472a) {
            case 0:
                b bVar = (b) this.f6473b;
                ((qm.f) obj).getClass();
                return (pm.c0) bVar.f6477b.f6485b.invoke();
            case 1:
                cn.l lVar = (cn.l) this.f6473b;
                wj.r rVar = wj.r.f53297a;
                lVar.resumeWith(rVar);
                return rVar;
            case 2:
                fh.z.f40951b.remove((String) this.f6473b);
                return wj.r.f53297a;
            case 3:
                zk.c cVar = (zk.c) obj;
                if (cVar == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((jl.a) this.f6473b).f43961b.b(cVar);
                return wj.r.f53297a;
            case 4:
                Future future = (Future) this.f6473b;
                if (!future.isCancelled()) {
                    future.cancel(true);
                }
                return wj.r.f53297a;
            default:
                yl.f fVar = (yl.f) obj;
                f0 f0VarK = ((wk.h) this.f6473b).k();
                yl.c cVar2 = wk.m.f53373k;
                im.j jVar = ((b0) f0VarK.F(cVar2)).f6483g;
                if (jVar == null) {
                    wk.h.a(11);
                    throw null;
                }
                zk.g gVarC = jVar.c(fVar, hl.b.f42405a);
                if (gVarC == null) {
                    throw new AssertionError("Built-in class " + cVar2.c(fVar) + " is not found");
                }
                if (gVarC instanceof zk.e) {
                    return (zk.e) gVarC;
                }
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + gVarC);
        }
    }
}
