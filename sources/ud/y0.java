package ud;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c1 f52189h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(c1 c1Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f52187f = i10;
        this.f52189h = c1Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f52187f) {
            case 0:
                return new y0(this.f52189h, fVar, 0);
            default:
                return new y0(this.f52189h, fVar, 1);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f52187f) {
            case 0:
                break;
        }
        return ((y0) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f52187f) {
            case 0:
                int i10 = this.f52188g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    c1 c1Var = this.f52189h;
                    fn.k kVar = new fn.k(c1Var.f52041e.getData(), new x0(c1Var, null), 2);
                    s0.v vVar = new s0.v(c1Var, 1);
                    this.f52188g = 1;
                    Object objCollect = kVar.collect(vVar, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
            default:
                int i11 = this.f52188g;
                ak.f fVar = null;
                c1 c1Var2 = this.f52189h;
                try {
                    if (i11 == 0) {
                        t9.e.z(obj);
                        s0.i iVar = c1Var2.f52041e;
                        a1 a1Var = new a1(c1Var2, fVar, 0);
                        this.f52188g = 1;
                        Object objA = iVar.a(a1Var, this);
                        bk.a aVar2 = bk.a.f5708a;
                        if (objA == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                    }
                    break;
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    i0 i0Var = c1Var2.f52044h;
                    if (i0Var == null) {
                        kotlin.jvm.internal.n.l("localSessionData");
                        throw null;
                    }
                    c1Var2.f52044h = i0.a(i0Var, null, c1Var2.f52040d.a(), null, 5);
                }
                return wj.r.f53297a;
        }
    }
}
