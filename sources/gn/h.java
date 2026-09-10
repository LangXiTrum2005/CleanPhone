package gn;

import cn.a0;
import java.util.concurrent.atomic.AtomicInteger;
import oa.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41994f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f41996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f41997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f41998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f41999k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wi.j jVar, k0 k0Var, String str, int i10, ak.f fVar) {
        super(2, fVar);
        this.f41997i = jVar;
        this.f41998j = k0Var;
        this.f41999k = str;
        this.f41996h = i10;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f41994f) {
            case 0:
                return new h((fn.e[]) this.f41997i, this.f41996h, (AtomicInteger) this.f41998j, (en.e) this.f41999k, fVar);
            default:
                return new h((wi.j) this.f41997i, (k0) this.f41998j, (String) this.f41999k, this.f41996h, fVar);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f41994f) {
            case 0:
                break;
        }
        return ((h) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41994f) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f41998j;
                en.e eVar = (en.e) this.f41999k;
                int i10 = this.f41995g;
                try {
                    if (i10 == 0) {
                        t9.e.z(obj);
                        fn.e[] eVarArr = (fn.e[]) this.f41997i;
                        int i11 = this.f41996h;
                        fn.e eVar2 = eVarArr[i11];
                        g gVar = new g(eVar, i11);
                        this.f41995g = 1;
                        Object objCollect = eVar2.collect(gVar, this);
                        bk.a aVar = bk.a.f5708a;
                        if (objCollect == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        eVar.h(null);
                    }
                    return wj.r.f53297a;
                } catch (Throwable th2) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        eVar.h(null);
                    }
                    throw th2;
                }
            default:
                wi.j jVar = (wi.j) this.f41997i;
                int i12 = this.f41995g;
                try {
                    if (i12 == 0) {
                        t9.e.z(obj);
                        b4.c cVar = new b4.c((k0) this.f41998j, (String) this.f41999k, this.f41996h, (ak.f) null);
                        this.f41995g = 1;
                        obj = android.support.v4.media.session.a.f(cVar, this);
                        bk.a aVar2 = bk.a.f5708a;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                    }
                    jVar.a((byte[]) obj);
                    break;
                } catch (Throwable th3) {
                    jVar.b("NATIVE_ERR", th3.getMessage(), null);
                }
                return wj.r.f53297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fn.e[] eVarArr, int i10, AtomicInteger atomicInteger, en.e eVar, ak.f fVar) {
        super(2, fVar);
        this.f41997i = eVarArr;
        this.f41996h = i10;
        this.f41998j = atomicInteger;
        this.f41999k = eVar;
    }
}
