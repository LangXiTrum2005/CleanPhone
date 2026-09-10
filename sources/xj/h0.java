package xj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends ck.h implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f53850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f53851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f53854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f53855k;
    public final /* synthetic */ Iterator l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Iterator it, ak.f fVar) {
        super(2, fVar);
        this.l = it;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        h0 h0Var = new h0(this.l, fVar);
        h0Var.f53855k = obj;
        return h0Var;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((zm.k) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        ArrayList arrayList;
        Iterator it;
        int i12;
        int i13;
        int i14;
        f0 f0Var;
        Object[] array;
        zm.k kVar = (zm.k) this.f53855k;
        int i15 = this.f53854j;
        boolean z10 = true;
        bk.a aVar = bk.a.f5708a;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        i13 = this.f53853i;
                        int i16 = this.f53852h;
                        Iterator it2 = this.f53851g;
                        f0 f0Var2 = (f0) this.f53850f;
                        t9.e.z(obj);
                        f0Var2.h();
                        while (true) {
                            int i17 = f0Var2.f53847b;
                            Object[] objArr = f0Var2.f53846a;
                            if (!it2.hasNext()) {
                                i14 = i16;
                                f0Var = f0Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z11 = z10;
                            if (f0Var2.size() == i17) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            objArr[(f0Var2.size() + f0Var2.f53848c) % i17] = next;
                            f0Var2.f53849d = f0Var2.size() + 1;
                            if (f0Var2.size() == i17) {
                                if (f0Var2.size() >= 400) {
                                    ArrayList arrayList2 = new ArrayList(f0Var2);
                                    this.f53855k = kVar;
                                    this.f53850f = f0Var2;
                                    this.f53851g = it2;
                                    this.f53852h = i16;
                                    this.f53853i = i13;
                                    this.f53854j = 3;
                                    kVar.a(arrayList2, this);
                                    return aVar;
                                }
                                int i18 = i17 + (i17 >> 1) + 1;
                                if (i18 > 400) {
                                    i18 = 400;
                                }
                                if (f0Var2.f53848c == 0) {
                                    array = Arrays.copyOf(objArr, i18);
                                    kotlin.jvm.internal.n.e(array, "copyOf(...)");
                                } else {
                                    array = f0Var2.toArray(new Object[i18]);
                                }
                                f0Var2 = new f0(f0Var2.size(), array);
                            }
                            z10 = z11;
                        }
                    } else if (i15 == 4) {
                        i13 = this.f53853i;
                        i14 = this.f53852h;
                        f0Var = (f0) this.f53850f;
                        t9.e.z(obj);
                        f0Var.h();
                    } else {
                        if (i15 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    if (f0Var.size() > 400) {
                        ArrayList arrayList3 = new ArrayList(f0Var);
                        this.f53855k = kVar;
                        this.f53850f = f0Var;
                        this.f53851g = null;
                        this.f53852h = i14;
                        this.f53853i = i13;
                        this.f53854j = 4;
                        kVar.a(arrayList3, this);
                        return aVar;
                    }
                    if (!f0Var.isEmpty()) {
                        this.f53855k = null;
                        this.f53850f = null;
                        this.f53851g = null;
                        this.f53852h = i14;
                        this.f53853i = i13;
                        this.f53854j = 5;
                        kVar.a(f0Var, this);
                        return aVar;
                    }
                }
                t9.e.z(obj);
            } else {
                i10 = this.f53853i;
                int i19 = this.f53852h;
                Iterator it3 = this.f53851g;
                t9.e.z(obj);
                arrayList = new ArrayList(400);
                it = it3;
                i12 = i19;
                i11 = i10;
            }
            return wj.r.f53297a;
        }
        t9.e.z(obj);
        i10 = 0;
        i11 = 0;
        arrayList = new ArrayList(400);
        it = this.l;
        i12 = 400;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 400) {
                    this.f53855k = kVar;
                    this.f53850f = arrayList;
                    this.f53851g = it;
                    this.f53852h = i12;
                    this.f53853i = i11;
                    this.f53854j = 1;
                    kVar.a(arrayList, this);
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f53855k = null;
            this.f53850f = null;
            this.f53851g = null;
            this.f53852h = i12;
            this.f53853i = i11;
            this.f53854j = 2;
            kVar.a(arrayList, this);
            return aVar;
        }
        return wj.r.f53297a;
    }
}
