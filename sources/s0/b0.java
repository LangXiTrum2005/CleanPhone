package s0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ck.i implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49752f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f49754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f49755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f49756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Serializable f49757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlin.jvm.internal.c0 c0Var, e0 e0Var, kotlin.jvm.internal.a0 a0Var, ak.f fVar) {
        super(1, fVar);
        this.f49756j = c0Var;
        this.f49754h = e0Var;
        this.f49757k = a0Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ck.i, jk.c] */
    @Override // ck.a
    public final ak.f create(ak.f fVar) {
        switch (this.f49752f) {
            case 0:
                return new b0((kotlin.jvm.internal.c0) this.f49756j, this.f49754h, (kotlin.jvm.internal.a0) this.f49757k, fVar);
            default:
                return new b0(this.f49754h, (ak.k) this.f49756j, (jk.c) this.f49757k, fVar);
        }
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        ak.f fVar = (ak.f) obj;
        switch (this.f49752f) {
            case 0:
                break;
        }
        return ((b0) create(fVar)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ck.i, jk.c] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlin.jvm.internal.c0 c0Var;
        kotlin.jvm.internal.a0 a0Var;
        d dVar;
        Object obj2;
        int iHashCode;
        switch (this.f49752f) {
            case 0:
                kotlin.jvm.internal.a0 a0Var2 = (kotlin.jvm.internal.a0) this.f49757k;
                kotlin.jvm.internal.c0 c0Var2 = (kotlin.jvm.internal.c0) this.f49756j;
                int i10 = this.f49753g;
                e0 e0Var = this.f49754h;
                bk.a aVar = bk.a.f5708a;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c0Var = (kotlin.jvm.internal.c0) ((Serializable) this.f49755i);
                            t9.e.z(obj);
                        } else {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a0Var2 = (kotlin.jvm.internal.a0) ((Serializable) this.f49755i);
                                t9.e.z(obj);
                                a0Var2.f44754a = ((Number) obj).intValue();
                                return wj.r.f53297a;
                            }
                            a0Var = (kotlin.jvm.internal.a0) ((Serializable) this.f49755i);
                            t9.e.z(obj);
                        }
                        a0Var.f44754a = ((Number) obj).intValue();
                        return wj.r.f53297a;
                    }
                    t9.e.z(obj);
                    this.f49755i = c0Var2;
                    this.f49753g = 1;
                    obj = e0Var.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0Var = c0Var2;
                    c0Var.f44760a = obj;
                    p0 p0VarG = e0Var.g();
                    this.f49755i = a0Var2;
                    this.f49753g = 2;
                    obj = p0VarG.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    a0Var = a0Var2;
                    a0Var.f44754a = ((Number) obj).intValue();
                    return wj.r.f53297a;
                } catch (b unused) {
                    Object obj3 = c0Var2.f44760a;
                    this.f49755i = a0Var2;
                    this.f49753g = 3;
                    obj = e0Var.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                int i11 = this.f49753g;
                e0 e0Var2 = this.f49754h;
                bk.a aVar2 = bk.a.f5708a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        t9.e.z(obj);
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f49755i;
                            t9.e.z(obj);
                            return obj4;
                        }
                        dVar = (d) this.f49755i;
                        t9.e.z(obj);
                    }
                    obj2 = dVar.f49769b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == dVar.f49770c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!kotlin.jvm.internal.n.a(dVar.f49769b, obj)) {
                        this.f49755i = obj;
                        this.f49753g = 3;
                        if (e0Var2.j(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                t9.e.z(obj);
                this.f49753g = 1;
                obj = e0.f(e0Var2, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                dVar = (d) obj;
                ak.k kVar = (ak.k) this.f49756j;
                b4.c cVar = new b4.c((jk.c) this.f49757k, dVar, (ak.f) null);
                this.f49755i = dVar;
                this.f49753g = 2;
                obj = cn.d0.J(kVar, cVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = dVar.f49769b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == dVar.f49770c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!kotlin.jvm.internal.n.a(dVar.f49769b, obj)) {
                    this.f49755i = obj;
                    this.f49753g = 3;
                    if (e0Var2.j(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(e0 e0Var, ak.k kVar, jk.c cVar, ak.f fVar) {
        super(1, fVar);
        this.f49754h = e0Var;
        this.f49756j = kVar;
        this.f49757k = (ck.i) cVar;
    }
}
