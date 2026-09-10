package fn;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d implements gn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak.k f41046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final en.a f41048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f41050e;

    public d(ak.k kVar, int i10, en.a aVar) {
        this.f41046a = kVar;
        this.f41047b = i10;
        this.f41048c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // gn.l
    public final e b(ak.k kVar, int i10, en.a aVar) {
        ak.k kVar2 = this.f41046a;
        ak.k kVarPlus = kVar.plus(kVar2);
        en.a aVar2 = en.a.f40122a;
        en.a aVar3 = this.f41048c;
        int i11 = this.f41047b;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (kotlin.jvm.internal.n.a(kVarPlus, kVar2) && i10 == i11 && aVar == aVar3) ? this : f(kVarPlus, i10, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // fn.e
    public Object collect(f fVar, ak.f fVar2) throws Throwable {
        Object objD;
        switch (this.f41049d) {
            case 1:
                int i10 = this.f41047b;
                bk.a aVar = bk.a.f5708a;
                if (i10 == -3) {
                    ak.k context = fVar2.getContext();
                    Boolean bool = Boolean.FALSE;
                    ak.c cVar = new ak.c(2);
                    ak.k kVar = this.f41046a;
                    ak.k kVarPlus = !((Boolean) kVar.fold(bool, cVar)).booleanValue() ? context.plus(kVar) : cn.d0.n(context, kVar, false);
                    if (kotlin.jvm.internal.n.a(kVarPlus, context)) {
                        Object objG = g(fVar, fVar2);
                        if (objG == aVar) {
                            return objG;
                        }
                    } else {
                        ak.g gVar = ak.g.f3619a;
                        if (kotlin.jvm.internal.n.a(kVarPlus.get(gVar), context.get(gVar))) {
                            ak.k context2 = fVar2.getContext();
                            if (!(fVar instanceof gn.r) && !(fVar instanceof gn.n)) {
                                fVar = new u(fVar, context2);
                            }
                            Object objA = gn.b.a(kVarPlus, fVar, hn.b.m(kVarPlus), new b4.c(this, (ak.f) null, 5), fVar2);
                            if (objA == aVar) {
                                return objA;
                            }
                        } else {
                            objD = d(fVar, fVar2);
                            if (objD == aVar) {
                                return objD;
                            }
                        }
                    }
                } else {
                    objD = d(fVar, fVar2);
                    if (objD == aVar) {
                        return objD;
                    }
                }
                return wj.r.f53297a;
            default:
                return d(fVar, fVar2);
        }
    }

    public final Object d(f fVar, ak.f fVar2) {
        Object objK = cn.d0.k(new b4.b(fVar, this, (ak.f) null, 5), fVar2);
        return objK == bk.a.f5708a ? objK : wj.r.f53297a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ck.i, jk.c] */
    public Object e(en.r rVar, ak.f fVar) {
        switch (this.f41049d) {
            case 0:
                Object objInvoke = ((ck.i) this.f41050e).invoke(rVar, fVar);
                return objInvoke == bk.a.f5708a ? objInvoke : wj.r.f53297a;
            default:
                Object objG = g(new gn.r(rVar), fVar);
                return objG == bk.a.f5708a ? objG : wj.r.f53297a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ck.i, jk.c] */
    public d f(ak.k kVar, int i10, en.a aVar) {
        switch (this.f41049d) {
            case 0:
                return new d((jk.c) this.f41050e, kVar, i10, aVar);
            default:
                return new d(i10, kVar, aVar, (e) this.f41050e);
        }
    }

    public Object g(f fVar, ak.f fVar2) {
        Object objCollect = ((e) this.f41050e).collect(fVar, fVar2);
        return objCollect == bk.a.f5708a ? objCollect : wj.r.f53297a;
    }

    public final String h() {
        ArrayList arrayList = new ArrayList(4);
        ak.l lVar = ak.l.f3620a;
        ak.k kVar = this.f41046a;
        if (kVar != lVar) {
            arrayList.add("context=" + kVar);
        }
        int i10 = this.f41047b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        en.a aVar = en.a.f40122a;
        en.a aVar2 = this.f41048c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return wi.d.k(sb2, xj.n.u0(arrayList, ", ", null, null, null, 62), ']');
    }

    public final String toString() {
        switch (this.f41049d) {
            case 0:
                return "block[" + ((ck.i) this.f41050e) + "] -> " + h();
            default:
                return ((e) this.f41050e) + " -> " + h();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, ak.k kVar, en.a aVar, e eVar) {
        this(kVar, i10, aVar);
        this.f41049d = 1;
        this.f41050e = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(jk.c cVar, ak.k kVar, int i10, en.a aVar) {
        this(kVar, i10, aVar);
        this.f41049d = 0;
        this.f41050e = (ck.i) cVar;
    }
}
