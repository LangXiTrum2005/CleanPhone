package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln.a f49858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f49859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f49860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f49861d;

    public m(ln.a aVar, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.c0 c0Var, e0 e0Var) {
        this.f49858a = aVar;
        this.f49859b = yVar;
        this.f49860c = c0Var;
        this.f49861d = e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:35:0x00ac, B:37:0x00b4), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(h hVar, ck.c cVar) throws Throwable {
        l lVar;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.c0 c0Var;
        e0 e0Var;
        ln.c cVar2;
        ln.a aVar;
        jk.c cVar3;
        ln.a aVar2;
        ln.a aVar3;
        kotlin.jvm.internal.c0 c0Var2;
        Object obj;
        ln.a aVar4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f49851m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f49851m = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj2 = lVar.f49850k;
        int i11 = lVar.f49851m;
        bk.a aVar5 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj2);
                lVar.f49845f = hVar;
                ln.a aVar6 = this.f49858a;
                lVar.f49846g = aVar6;
                yVar = this.f49859b;
                lVar.f49847h = yVar;
                c0Var = this.f49860c;
                lVar.f49848i = c0Var;
                e0Var = this.f49861d;
                lVar.f49849j = e0Var;
                lVar.f49851m = 1;
                cVar2 = (ln.c) aVar6;
                if (cVar2.e(lVar) != aVar5) {
                }
                cVar3 = hVar;
                aVar = cVar2;
                return aVar5;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = lVar.f49847h;
                    c0Var2 = (kotlin.jvm.internal.c0) lVar.f49846g;
                    aVar2 = (ln.a) lVar.f49845f;
                    try {
                        t9.e.z(obj2);
                        aVar4 = aVar2;
                        c0Var2.f44760a = obj;
                        aVar2 = aVar4;
                        Object obj3 = c0Var2.f44760a;
                        ((ln.c) aVar2).g(null);
                        return obj3;
                    } catch (Throwable th2) {
                        th = th2;
                        ((ln.c) aVar2).g(null);
                        throw th;
                    }
                }
                e0Var = (e0) lVar.f49847h;
                c0Var2 = (kotlin.jvm.internal.c0) lVar.f49846g;
                aVar3 = (ln.a) lVar.f49845f;
                try {
                    t9.e.z(obj2);
                    aVar3 = aVar3;
                    if (!kotlin.jvm.internal.n.a(obj2, c0Var2.f44760a)) {
                        lVar.f49845f = aVar3;
                        lVar.f49846g = c0Var2;
                        lVar.f49847h = obj2;
                        lVar.f49851m = 3;
                        if (e0Var.j(obj2, false, lVar) != aVar5) {
                            obj = obj2;
                            aVar4 = aVar3;
                            c0Var2.f44760a = obj;
                            aVar2 = aVar4;
                        }
                        cVar3 = hVar;
                        aVar = cVar2;
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    Object obj4 = c0Var2.f44760a;
                    ((ln.c) aVar2).g(null);
                    return obj4;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar3;
                    ((ln.c) aVar2).g(null);
                    throw th;
                }
            }
            e0Var = lVar.f49849j;
            kotlin.jvm.internal.c0 c0Var3 = lVar.f49848i;
            yVar = (kotlin.jvm.internal.y) lVar.f49847h;
            ln.a aVar7 = (ln.a) lVar.f49846g;
            jk.c cVar4 = (jk.c) lVar.f49845f;
            t9.e.z(obj2);
            c0Var = c0Var3;
            cVar3 = cVar4;
            aVar = aVar7;
            cVar3 = hVar;
            aVar = cVar2;
            if (yVar.f44766a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = c0Var.f44760a;
            lVar.f49845f = aVar;
            lVar.f49846g = c0Var;
            lVar.f49847h = e0Var;
            lVar.f49848i = null;
            lVar.f49849j = null;
            lVar.f49851m = 2;
            Object objInvoke = cVar3.invoke(obj5, lVar);
            if (objInvoke != aVar5) {
                aVar3 = aVar;
                obj2 = objInvoke;
                c0Var2 = c0Var;
                if (!kotlin.jvm.internal.n.a(obj2, c0Var2.f44760a)) {
                    lVar.f49845f = aVar3;
                    lVar.f49846g = c0Var2;
                    lVar.f49847h = obj2;
                    lVar.f49851m = 3;
                    if (e0Var.j(obj2, false, lVar) != aVar5) {
                        obj = obj2;
                        aVar4 = aVar3;
                        c0Var2.f44760a = obj;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = c0Var2.f44760a;
                ((ln.c) aVar2).g(null);
                return obj6;
            }
            cVar3 = hVar;
            aVar = cVar2;
            return aVar5;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            ((ln.c) aVar2).g(null);
            throw th;
        }
    }
}
