package oj;

import android.content.Context;
import fn.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.c0 f47500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f47502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f47503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f47504k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, z zVar, kotlin.jvm.internal.c0 c0Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f47499f = i10;
        this.f47502i = str;
        this.f47503j = zVar;
        this.f47504k = c0Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f47499f) {
            case 0:
                return new l(this.f47502i, this.f47503j, this.f47504k, fVar, 0);
            case 1:
                return new l(this.f47502i, this.f47503j, this.f47504k, fVar, 1);
            case 2:
                return new l(this.f47502i, this.f47503j, this.f47504k, fVar, 2);
            default:
                return new l(this.f47502i, this.f47503j, this.f47504k, fVar, 3);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f47499f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((l) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        kotlin.jvm.internal.c0 c0Var2;
        kotlin.jvm.internal.c0 c0Var3;
        kotlin.jvm.internal.c0 c0Var4;
        switch (this.f47499f) {
            case 0:
                int i10 = this.f47501h;
                if (i10 == 0) {
                    t9.e.z(obj);
                    w0.d dVarD = go.k.d(this.f47502i);
                    Context context = this.f47503j.f47554a;
                    if (context == null) {
                        kotlin.jvm.internal.n.l("context");
                        throw null;
                    }
                    k kVar = new k(a0.a(context).getData(), dVarD, 0);
                    kotlin.jvm.internal.c0 c0Var5 = this.f47504k;
                    this.f47500g = c0Var5;
                    this.f47501h = 1;
                    Object objM = fn.g.m(kVar, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objM == aVar) {
                        return aVar;
                    }
                    obj = objM;
                    c0Var = c0Var5;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = this.f47500g;
                    t9.e.z(obj);
                }
                c0Var.f44760a = obj;
                return wj.r.f53297a;
            case 1:
                int i11 = this.f47501h;
                if (i11 == 0) {
                    t9.e.z(obj);
                    w0.d dVarX = go.k.X(this.f47502i);
                    z zVar = this.f47503j;
                    Context context2 = zVar.f47554a;
                    if (context2 == null) {
                        kotlin.jvm.internal.n.l("context");
                        throw null;
                    }
                    k0 k0Var = new k0(a0.a(context2).getData(), dVarX, zVar);
                    kotlin.jvm.internal.c0 c0Var6 = this.f47504k;
                    this.f47500g = c0Var6;
                    this.f47501h = 1;
                    Object objM2 = fn.g.m(k0Var, this);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objM2 == aVar2) {
                        return aVar2;
                    }
                    obj = objM2;
                    c0Var2 = c0Var6;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var2 = this.f47500g;
                    t9.e.z(obj);
                }
                c0Var2.f44760a = obj;
                return wj.r.f53297a;
            case 2:
                int i12 = this.f47501h;
                if (i12 == 0) {
                    t9.e.z(obj);
                    w0.d dVarQ = go.k.Q(this.f47502i);
                    Context context3 = this.f47503j.f47554a;
                    if (context3 == null) {
                        kotlin.jvm.internal.n.l("context");
                        throw null;
                    }
                    k kVar2 = new k(a0.a(context3).getData(), dVarQ, 1);
                    kotlin.jvm.internal.c0 c0Var7 = this.f47504k;
                    this.f47500g = c0Var7;
                    this.f47501h = 1;
                    Object objM3 = fn.g.m(kVar2, this);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objM3 == aVar3) {
                        return aVar3;
                    }
                    obj = objM3;
                    c0Var3 = c0Var7;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var3 = this.f47500g;
                    t9.e.z(obj);
                }
                c0Var3.f44760a = obj;
                return wj.r.f53297a;
            default:
                int i13 = this.f47501h;
                if (i13 == 0) {
                    t9.e.z(obj);
                    w0.d dVarX2 = go.k.X(this.f47502i);
                    Context context4 = this.f47503j.f47554a;
                    if (context4 == null) {
                        kotlin.jvm.internal.n.l("context");
                        throw null;
                    }
                    k kVar3 = new k(a0.a(context4).getData(), dVarX2, 2);
                    kotlin.jvm.internal.c0 c0Var8 = this.f47504k;
                    this.f47500g = c0Var8;
                    this.f47501h = 1;
                    Object objM4 = fn.g.m(kVar3, this);
                    bk.a aVar4 = bk.a.f5708a;
                    if (objM4 == aVar4) {
                        return aVar4;
                    }
                    obj = objM4;
                    c0Var4 = c0Var8;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var4 = this.f47500g;
                    t9.e.z(obj);
                }
                c0Var4.f44760a = obj;
                return wj.r.f53297a;
        }
    }
}
