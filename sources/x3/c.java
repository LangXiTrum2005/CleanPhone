package x3;

import f.n;
import fn.a1;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.a f53577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f53578b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f53579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f53580d;

    public c(a4.a aVar) {
        this.f53577a = aVar;
        new LinkedHashSet();
        this.f53579c = new LinkedHashSet();
        this.f53580d = new LinkedHashSet();
    }

    public final void a(e eVar) {
        if (this.f53580d.add(eVar)) {
            this.f53578b.a(this, eVar, -1);
        }
    }

    public final void b(j jVar, int i10) {
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "Unsupported priority value: ").toString());
        }
        if (this.f53580d.add(jVar)) {
            this.f53578b.a(this, jVar, i10);
        }
    }

    public final void c(e eVar, b bVar) {
        f fVar = this.f53578b;
        fVar.getClass();
        if (fVar.f53591g != 0) {
            return;
        }
        n nVarC = fVar.c(-1);
        fVar.f53590f = nVarC;
        fVar.f53591g = -1;
        fVar.f53592h = eVar;
        if (bVar != null) {
            if (nVarC != null) {
                nVarC.f40239d.d(new f.a(bVar));
            }
            a1 a1Var = fVar.f53585a;
            h hVar = new h(bVar);
            a1Var.getClass();
            a1Var.e0(null, hVar);
        }
    }
}
