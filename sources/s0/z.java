package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f49956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f49958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f49959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f49960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f49961k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, int i10, ak.f fVar, int i11) {
        super(2, fVar);
        this.f49956f = i11;
        this.f49959i = e0Var;
        this.f49960j = i10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f49956f) {
            case 0:
                z zVar = new z(this.f49959i, this.f49960j, fVar, 0);
                zVar.f49958h = ((Boolean) obj).booleanValue();
                return zVar;
            default:
                z zVar2 = new z(this.f49959i, this.f49960j, fVar, 1);
                zVar2.f49958h = ((Boolean) obj).booleanValue();
                return zVar2;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f49956f;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ak.f fVar = (ak.f) obj2;
        switch (i10) {
            case 0:
                break;
        }
        return ((z) create(bool, fVar)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Throwable th2;
        f1 y0Var;
        boolean z10;
        ?? r0;
        ?? r2;
        boolean z11;
        int iIntValue2;
        Object obj2;
        int iHashCode;
        switch (this.f49956f) {
            case 0:
                boolean z12 = this.f49957g;
                e0 e0Var = this.f49959i;
                bk.a aVar = bk.a.f5708a;
                try {
                    if (z12 == 0) {
                        t9.e.z(obj);
                        boolean z13 = this.f49958h;
                        this.f49958h = z13;
                        this.f49957g = 1;
                        obj = e0.f(e0Var, z13, this);
                        z12 = z13;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (z12 != 1) {
                            if (z12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z14 = this.f49958h;
                            th2 = (Throwable) this.f49961k;
                            t9.e.z(obj);
                            r2 = z14;
                            iIntValue = ((Number) obj).intValue();
                            r0 = r2;
                            y0Var = new y0(th2, iIntValue);
                            z10 = r0;
                            return new wj.f(y0Var, Boolean.valueOf(z10));
                        }
                        boolean z15 = this.f49958h;
                        t9.e.z(obj);
                        z12 = z15;
                    }
                    y0Var = (f1) obj;
                    z10 = z12;
                    break;
                } catch (Throwable th3) {
                    if (z12 != 0) {
                        p0 p0VarG = e0Var.g();
                        this.f49961k = th3;
                        this.f49958h = z12;
                        this.f49957g = 2;
                        Object objA = p0VarG.a(this);
                        if (objA == aVar) {
                            return aVar;
                        }
                        obj = objA;
                        th2 = th3;
                        r2 = z12;
                    } else {
                        iIntValue = this.f49960j;
                        th2 = th3;
                        r0 = z12;
                    }
                    y0Var = new y0(th2, iIntValue);
                    z10 = r0;
                    return new wj.f(y0Var, Boolean.valueOf(z10));
                }
                return new wj.f(y0Var, Boolean.valueOf(z10));
            default:
                int i10 = this.f49957g;
                e0 e0Var2 = this.f49959i;
                Object dVar = bk.a.f5708a;
                if (i10 == 0) {
                    t9.e.z(obj);
                    z11 = this.f49958h;
                    this.f49958h = z11;
                    this.f49957g = 1;
                    obj = e0Var2.i(this);
                    if (obj != dVar) {
                    }
                    return dVar;
                }
                if (i10 == 1) {
                    z11 = this.f49958h;
                    t9.e.z(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f49961k;
                    t9.e.z(obj);
                }
                iIntValue2 = ((Number) obj).intValue();
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                dVar = new d(iHashCode, iIntValue2, obj2);
                return dVar;
                if (z11) {
                    p0 p0VarG2 = e0Var2.g();
                    this.f49961k = obj;
                    this.f49957g = 2;
                    Object objA2 = p0VarG2.a(this);
                    if (objA2 != dVar) {
                        Object obj3 = obj;
                        obj = objA2;
                        obj2 = obj3;
                        iIntValue2 = ((Number) obj).intValue();
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        dVar = new d(iHashCode, iIntValue2, obj2);
                    }
                } else {
                    Object obj4 = obj;
                    iIntValue2 = this.f49960j;
                    obj2 = obj4;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    dVar = new d(iHashCode, iIntValue2, obj2);
                }
                return dVar;
        }
    }
}
