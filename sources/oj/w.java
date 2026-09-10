package oj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f47544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f47545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f47546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, z zVar, double d10, ak.f fVar) {
        super(2, fVar);
        this.f47544g = str;
        this.f47545h = zVar;
        this.f47546i = d10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        return new w(this.f47544g, this.f47545h, this.f47546i, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f47543f;
        if (i10 == 0) {
            t9.e.z(obj);
            w0.d dVar = new w0.d(this.f47544g);
            Context context = this.f47545h.f47554a;
            if (context == null) {
                kotlin.jvm.internal.n.l("context");
                throw null;
            }
            s0.i iVarA = a0.a(context);
            v vVar = new v(dVar, this.f47546i, null);
            this.f47543f = 1;
            Object objR = j1.f.r(iVarA, vVar, this);
            bk.a aVar = bk.a.f5708a;
            if (objR == aVar) {
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
