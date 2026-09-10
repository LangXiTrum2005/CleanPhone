package oj;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f47488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f47489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z zVar, List list, ak.f fVar, int i10) {
        super(2, fVar);
        this.f47486f = i10;
        this.f47488h = zVar;
        this.f47489i = list;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f47486f) {
            case 0:
                return new h(this.f47488h, this.f47489i, fVar, 0);
            case 1:
                return new h(this.f47488h, this.f47489i, fVar, 1);
            default:
                return new h(this.f47488h, this.f47489i, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f47486f) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((h) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f47486f) {
            case 0:
                int i10 = this.f47487g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                Context context = this.f47488h.f47554a;
                ak.f fVar = null;
                if (context == null) {
                    kotlin.jvm.internal.n.l("context");
                    throw null;
                }
                s0.i iVarA = a0.a(context);
                androidx.lifecycle.p pVar = new androidx.lifecycle.p(this.f47489i, fVar, 10);
                this.f47487g = 1;
                Object objR = j1.f.r(iVarA, pVar, this);
                bk.a aVar = bk.a.f5708a;
                return objR == aVar ? aVar : objR;
            case 1:
                int i11 = this.f47487g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                this.f47487g = 1;
                Object objE = z.e(this.f47488h, this.f47489i, this);
                bk.a aVar2 = bk.a.f5708a;
                return objE == aVar2 ? aVar2 : objE;
            default:
                int i12 = this.f47487g;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return obj;
                }
                t9.e.z(obj);
                this.f47487g = 1;
                Object objE2 = z.e(this.f47488h, this.f47489i, this);
                bk.a aVar3 = bk.a.f5708a;
                return objE2 == aVar3 ? aVar3 : objE2;
        }
    }
}
