package s0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ck.i implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f49868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f49870i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f49871j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49872k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f49873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k5.g f49874n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e0 e0Var, k5.g gVar, ak.f fVar) {
        super(1, fVar);
        this.f49873m = e0Var;
        this.f49874n = gVar;
    }

    @Override // ck.a
    public final ak.f create(ak.f fVar) {
        return new n(this.f49873m, this.f49874n, fVar);
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        return ((n) create((ak.f) obj)).invokeSuspend(wj.r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a3->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        ln.a cVar;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.c0 c0Var;
        kotlin.jvm.internal.c0 c0Var2;
        Iterator it;
        ln.a aVar;
        kotlin.jvm.internal.y yVar2;
        kotlin.jvm.internal.c0 c0Var3;
        m mVar;
        ln.c cVar2;
        kotlin.jvm.internal.c0 c0Var4;
        kotlin.jvm.internal.y yVar3;
        jk.c cVar3;
        ln.a aVar2;
        Object obj2;
        int iHashCode;
        Object objA;
        Object obj3;
        int i10 = this.l;
        k5.g gVar = this.f49874n;
        e0 e0Var = this.f49873m;
        bk.a aVar3 = bk.a.f5708a;
        if (i10 == 0) {
            t9.e.z(obj);
            cVar = new ln.c();
            yVar = new kotlin.jvm.internal.y();
            c0Var = new kotlin.jvm.internal.c0();
            this.f49867f = cVar;
            this.f49868g = yVar;
            this.f49869h = c0Var;
            this.f49870i = c0Var;
            this.l = 1;
            obj = e0.f(e0Var, true, this);
            if (obj != aVar3) {
                c0Var2 = c0Var;
            }
            return aVar3;
        }
        if (i10 == 1) {
            c0Var = (kotlin.jvm.internal.c0) this.f49870i;
            c0Var2 = (kotlin.jvm.internal.c0) this.f49869h;
            yVar = (kotlin.jvm.internal.y) this.f49868g;
            cVar = (ln.a) this.f49867f;
            t9.e.z(obj);
        } else {
            if (i10 == 2) {
                it = this.f49871j;
                mVar = (m) this.f49870i;
                c0Var3 = (kotlin.jvm.internal.c0) this.f49869h;
                yVar2 = (kotlin.jvm.internal.y) this.f49868g;
                aVar = (ln.a) this.f49867f;
                t9.e.z(obj);
                while (it.hasNext()) {
                    cVar3 = (jk.c) it.next();
                    this.f49867f = aVar;
                    this.f49868g = yVar2;
                    this.f49869h = c0Var3;
                    this.f49870i = mVar;
                    this.f49871j = it;
                    this.l = 2;
                    if (cVar3.invoke(mVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                c0Var2 = c0Var3;
                yVar = yVar2;
                cVar = aVar;
                gVar.f44327c = null;
                this.f49867f = yVar;
                this.f49868g = c0Var2;
                this.f49869h = cVar;
                this.f49870i = null;
                this.f49871j = null;
                this.l = 3;
                cVar2 = (ln.c) cVar;
                if (cVar2.e(this) != aVar3) {
                    c0Var4 = c0Var2;
                    yVar3 = yVar;
                    aVar2 = cVar2;
                    yVar3.f44766a = true;
                    ((ln.c) aVar2).g(null);
                    obj2 = c0Var4.f44760a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    p0 p0VarG = e0Var.g();
                    this.f49867f = obj2;
                    this.f49868g = null;
                    this.f49869h = null;
                    this.f49872k = iHashCode;
                    this.l = 4;
                    objA = p0VarG.a(this);
                    if (objA != aVar3) {
                        obj = objA;
                        obj3 = obj2;
                    }
                }
                return aVar3;
            }
            if (i10 == 3) {
                ln.a aVar4 = (ln.a) this.f49869h;
                c0Var4 = (kotlin.jvm.internal.c0) this.f49868g;
                yVar3 = (kotlin.jvm.internal.y) this.f49867f;
                t9.e.z(obj);
                aVar2 = aVar4;
                try {
                    yVar3.f44766a = true;
                    ((ln.c) aVar2).g(null);
                    obj2 = c0Var4.f44760a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    p0 p0VarG2 = e0Var.g();
                    this.f49867f = obj2;
                    this.f49868g = null;
                    this.f49869h = null;
                    this.f49872k = iHashCode;
                    this.l = 4;
                    objA = p0VarG2.a(this);
                    if (objA != aVar3) {
                        obj = objA;
                        obj3 = obj2;
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    ((ln.c) aVar2).g(null);
                    throw th2;
                }
            }
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iHashCode = this.f49872k;
            obj3 = this.f49867f;
            t9.e.z(obj);
        }
        return new d(iHashCode, ((Number) obj).intValue(), obj3);
        c0Var.f44760a = ((d) obj).f49769b;
        m mVar2 = new m(cVar, yVar, c0Var2, e0Var);
        List list = (List) gVar.f44327c;
        if (list != null) {
            it = list.iterator();
            aVar = cVar;
            yVar2 = yVar;
            c0Var3 = c0Var2;
            mVar = mVar2;
            while (it.hasNext()) {
                cVar3 = (jk.c) it.next();
                this.f49867f = aVar;
                this.f49868g = yVar2;
                this.f49869h = c0Var3;
                this.f49870i = mVar;
                this.f49871j = it;
                this.l = 2;
                if (cVar3.invoke(mVar, this) == aVar3) {
                }
            }
            c0Var2 = c0Var3;
            yVar = yVar2;
            cVar = aVar;
            gVar.f44327c = null;
            this.f49867f = yVar;
            this.f49868g = c0Var2;
            this.f49869h = cVar;
            this.f49870i = null;
            this.f49871j = null;
            this.l = 3;
            cVar2 = (ln.c) cVar;
            if (cVar2.e(this) != aVar3) {
                c0Var4 = c0Var2;
                yVar3 = yVar;
                aVar2 = cVar2;
                yVar3.f44766a = true;
                ((ln.c) aVar2).g(null);
                obj2 = c0Var4.f44760a;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                p0 p0VarG3 = e0Var.g();
                this.f49867f = obj2;
                this.f49868g = null;
                this.f49869h = null;
                this.f49872k = iHashCode;
                this.l = 4;
                objA = p0VarG3.a(this);
                if (objA != aVar3) {
                    obj = objA;
                    obj3 = obj2;
                    return new d(iHashCode, ((Number) obj).intValue(), obj3);
                }
            }
        } else {
            gVar.f44327c = null;
            this.f49867f = yVar;
            this.f49868g = c0Var2;
            this.f49869h = cVar;
            this.f49870i = null;
            this.f49871j = null;
            this.l = 3;
            cVar2 = (ln.c) cVar;
            if (cVar2.e(this) != aVar3) {
                c0Var4 = c0Var2;
                yVar3 = yVar;
                aVar2 = cVar2;
                yVar3.f44766a = true;
                ((ln.c) aVar2).g(null);
                obj2 = c0Var4.f44760a;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                p0 p0VarG4 = e0Var.g();
                this.f49867f = obj2;
                this.f49868g = null;
                this.f49869h = null;
                this.f49872k = iHashCode;
                this.l = 4;
                objA = p0VarG4.a(this);
                if (objA != aVar3) {
                    obj = objA;
                    obj3 = obj2;
                    return new d(iHashCode, ((Number) obj).intValue(), obj3);
                }
            }
        }
        return aVar3;
    }
}
