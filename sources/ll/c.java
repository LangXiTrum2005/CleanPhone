package ll;

import al.f;
import al.j;
import an.r;
import com.google.android.gms.internal.auth.o;
import com.google.android.gms.internal.measurement.nf;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import om.l;
import xj.k;
import zm.i;
import zm.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf f45510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl.b f45511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.j f45513d;

    public c(nf c4, pl.b annotationOwner, boolean z10) {
        n.f(c4, "c");
        n.f(annotationOwner, "annotationOwner");
        this.f45510a = c4;
        this.f45511b = annotationOwner;
        this.f45512c = z10;
        this.f45513d = ((l) ((a) c4.f23782b).f45485a).c(new f(this, 12));
    }

    @Override // al.j
    public final boolean c(yl.c cVar) {
        return o.r(this, cVar);
    }

    @Override // al.j
    public final al.c d(yl.c fqName) {
        al.c cVar;
        n.f(fqName, "fqName");
        pl.b bVar = this.f45511b;
        fl.d dVarA = bVar.a(fqName);
        if (dVarA != null && (cVar = (al.c) this.f45513d.invoke(dVarA)) != null) {
            return cVar;
        }
        yl.f fVar = jl.c.f43969a;
        return jl.c.a(fqName, bVar, this.f45510a);
    }

    @Override // al.j
    public final boolean isEmpty() {
        return this.f45511b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        pl.b bVar = this.f45511b;
        s sVarU = zm.l.U(xj.n.g0(bVar.getAnnotations()), this.f45513d);
        yl.f fVar = jl.c.f43969a;
        return new zm.e(new zm.f(zm.l.Q(k.b0(new i[]{sVarU, new r(jl.c.a(wk.l.f53349m, bVar, this.f45510a), 6)})), false, new zm.n(2)));
    }
}
