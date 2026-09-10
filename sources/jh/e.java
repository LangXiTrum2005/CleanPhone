package jh;

import java.io.IOException;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends ck.i implements jk.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ fn.f f43873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Throwable f43874h;

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e(3, (ak.f) obj3);
        eVar.f43873g = (fn.f) obj;
        eVar.f43874h = (Throwable) obj2;
        return eVar.invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        fn.f fVar = this.f43873g;
        Throwable th2 = this.f43874h;
        int i10 = this.f43872f;
        if (i10 == 0) {
            t9.e.z(obj);
            if (!(th2 instanceof IOException)) {
                throw th2;
            }
            w0.b bVar = new w0.b(true);
            this.f43873g = null;
            this.f43874h = null;
            this.f43872f = 1;
            Object objEmit = fVar.emit(bVar, this);
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
        return r.f53297a;
    }
}
