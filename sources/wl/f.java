package wl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zl.n;
import zl.q;
import zl.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends zl.i implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f53431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f53432d;

    @Override // zl.i
    public final zl.a a() {
        j jVarE = e();
        jVarE.isInitialized();
        return jVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // zl.i
    public final zl.i b(zl.e eVar, zl.g gVar) throws Throwable {
        j jVar = null;
        try {
            try {
                j.f53459h.getClass();
                f(new j(eVar, gVar));
                return this;
            } catch (q e10) {
                j jVar2 = (j) e10.f55076a;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = jVar2;
                    if (jVar != null) {
                        f(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (jVar != null) {
                f(jVar);
            }
            throw th;
        }
    }

    @Override // zl.i
    public final /* bridge */ /* synthetic */ zl.i c(n nVar) {
        f((j) nVar);
        return this;
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f53431c = list;
        fVar.f53432d = list;
        fVar.f(e());
        return fVar;
    }

    public final j e() {
        j jVar = new j(this);
        if ((this.f53430b & 1) == 1) {
            this.f53431c = Collections.unmodifiableList(this.f53431c);
            this.f53430b &= -2;
        }
        jVar.f53461b = this.f53431c;
        if ((this.f53430b & 2) == 2) {
            this.f53432d = Collections.unmodifiableList(this.f53432d);
            this.f53430b &= -3;
        }
        jVar.f53462c = this.f53432d;
        return jVar;
    }

    public final void f(j jVar) {
        if (jVar == j.f53458g) {
            return;
        }
        if (!jVar.f53461b.isEmpty()) {
            if (this.f53431c.isEmpty()) {
                this.f53431c = jVar.f53461b;
                this.f53430b &= -2;
            } else {
                if ((this.f53430b & 1) != 1) {
                    this.f53431c = new ArrayList(this.f53431c);
                    this.f53430b |= 1;
                }
                this.f53431c.addAll(jVar.f53461b);
            }
        }
        if (!jVar.f53462c.isEmpty()) {
            if (this.f53432d.isEmpty()) {
                this.f53432d = jVar.f53462c;
                this.f53430b &= -3;
            } else {
                if ((this.f53430b & 2) != 2) {
                    this.f53432d = new ArrayList(this.f53432d);
                    this.f53430b |= 2;
                }
                this.f53432d.addAll(jVar.f53462c);
            }
        }
        this.f55044a = this.f55044a.h(jVar.f53460a);
    }
}
