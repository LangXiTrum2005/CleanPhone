package yk;

import cl.f0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import xj.x;
import zk.b0;
import zk.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om.l f54489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f54490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lm.i f54491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.j f54492d;

    public m(om.l lVar, el.c cVar, f0 f0Var) {
        this.f54489a = lVar;
        this.f54490b = f0Var;
        this.f54492d = lVar.c(new al.f(this, 14));
    }

    @Override // zk.d0
    public final void a(yl.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        ym.l.a(arrayList, this.f54492d.invoke(fqName));
    }

    @Override // zk.d0
    public final boolean b(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        om.j jVar = this.f54492d;
        Object obj = jVar.f47575b.get(fqName);
        return ((obj == null || obj == om.k.f47578b) ? c(fqName) : (b0) jVar.invoke(fqName)) == null;
    }

    public final mm.c c(yl.c fqName) {
        InputStream inputStreamA;
        kotlin.jvm.internal.n.f(fqName, "fqName");
        if (fqName.h(wk.m.f53372j)) {
            mm.a.f46254m.getClass();
            inputStreamA = mm.d.a(mm.a.a(fqName));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return android.support.v4.media.session.a.m(fqName, this.f54489a, this.f54490b, inputStreamA);
        }
        return null;
    }

    @Override // zk.d0
    public final Collection h(yl.c fqName, jk.b bVar) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return x.f53868a;
    }
}
