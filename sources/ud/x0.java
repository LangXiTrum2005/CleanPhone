package ud;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends ck.i implements jk.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ fn.f f52183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Throwable f52184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c1 f52185i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(c1 c1Var, ak.f fVar) {
        super(3, fVar);
        this.f52185i = c1Var;
    }

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x0 x0Var = new x0(this.f52185i, (ak.f) obj3);
        x0Var.f52183g = (fn.f) obj;
        x0Var.f52184h = (Throwable) obj2;
        return x0Var.invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f52182f;
        if (i10 == 0) {
            t9.e.z(obj);
            fn.f fVar = this.f52183g;
            Throwable th2 = this.f52184h;
            m0 m0VarA = this.f52185i.f52038b.a(null);
            i0 i0Var = new i0(m0VarA, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + m0VarA.f52123a);
            this.f52183g = null;
            this.f52182f = 1;
            Object objEmit = fVar.emit(i0Var, this);
            bk.a aVar = bk.a.f5708a;
            if (objEmit == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
        }
        return wj.r.f53297a;
    }
}
