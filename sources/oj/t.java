package oj;

import android.content.Context;
import java.util.Set;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47530f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f47531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f47533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f47534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, z zVar, boolean z10, ak.f fVar) {
        super(2, fVar);
        this.f47533i = str;
        this.f47534j = zVar;
        this.f47531g = z10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f47530f) {
            case 0:
                return new t((String) this.f47533i, (z) this.f47534j, this.f47531g, fVar);
            default:
                return new t((k0) this.f47533i, this.f47531g, this.f47532h, (Set) this.f47534j, fVar);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f47530f) {
            case 0:
                break;
        }
        return ((t) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f47530f) {
            case 0:
                int i10 = this.f47532h;
                if (i10 == 0) {
                    t9.e.z(obj);
                    w0.d dVarD = go.k.d((String) this.f47533i);
                    Context context = ((z) this.f47534j).f47554a;
                    if (context == null) {
                        kotlin.jvm.internal.n.l("context");
                        throw null;
                    }
                    s0.i iVarA = a0.a(context);
                    s sVar = new s(dVarD, this.f47531g, null);
                    this.f47532h = 1;
                    Object objR = j1.f.r(iVarA, sVar, this);
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
            default:
                t9.e.z(obj);
                return ((b6.e) ((k0) this.f47533i).f47269b).b(this.f47531g, this.f47532h, (Set) this.f47534j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k0 k0Var, boolean z10, int i10, Set set, ak.f fVar) {
        super(2, fVar);
        this.f47533i = k0Var;
        this.f47531g = z10;
        this.f47532h = i10;
        this.f47534j = set;
    }
}
