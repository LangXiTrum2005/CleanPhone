package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m11 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w11 f17211h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m11(w11 w11Var, ak.f fVar, int i10) {
        super(2, fVar);
        this.f17209f = i10;
        this.f17211h = w11Var;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f17209f) {
            case 0:
                return new m11(this.f17211h, fVar, 0);
            case 1:
                return new m11(this.f17211h, fVar, 1);
            case 2:
                return new m11(this.f17211h, fVar, 2);
            case 3:
                return new m11(this.f17211h, fVar, 3);
            case 4:
                return new m11(this.f17211h, fVar, 4);
            default:
                return new m11(this.f17211h, fVar, 5);
        }
    }

    @Override // jk.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f17209f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((m11) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17209f) {
            case 0:
                int i10 = this.f17210g;
                t9.e.z(obj);
                if (i10 == 0) {
                    this.f17210g = 1;
                    Object objF = w11.f(this.f17211h, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objF == aVar) {
                        return aVar;
                    }
                }
                return wj.r.f53297a;
            case 1:
                int i11 = this.f17210g;
                t9.e.z(obj);
                if (i11 == 0) {
                    this.f17210g = 1;
                    Object objJ = w11.j(this.f17211h, this);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                }
                return wj.r.f53297a;
            case 2:
                int i12 = this.f17210g;
                t9.e.z(obj);
                if (i12 == 0) {
                    this.f17210g = 1;
                    Object objH = w11.h(this.f17211h, this);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objH == aVar3) {
                        return aVar3;
                    }
                }
                return wj.r.f53297a;
            case 3:
                int i13 = this.f17210g;
                t9.e.z(obj);
                if (i13 == 0) {
                    this.f17210g = 1;
                    Object objD = w11.d(this.f17211h, this);
                    bk.a aVar4 = bk.a.f5708a;
                    if (objD == aVar4) {
                        return aVar4;
                    }
                }
                return wj.r.f53297a;
            case 4:
                int i14 = this.f17210g;
                t9.e.z(obj);
                if (i14 == 0) {
                    this.f17210g = 1;
                    Object objI = w11.i(this.f17211h, this);
                    bk.a aVar5 = bk.a.f5708a;
                    if (objI == aVar5) {
                        return aVar5;
                    }
                }
                return wj.r.f53297a;
            default:
                int i15 = this.f17210g;
                t9.e.z(obj);
                if (i15 == 0) {
                    this.f17210g = 1;
                    Object objG = w11.g(this.f17211h, this);
                    bk.a aVar6 = bk.a.f5708a;
                    if (objG == aVar6) {
                        return aVar6;
                    }
                }
                return wj.r.f53297a;
        }
    }
}
