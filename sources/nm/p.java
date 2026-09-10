package nm;

import cc.a2;
import cl.h0;
import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tl.c0;
import tl.d1;
import tl.w0;
import xj.x;
import zk.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f46855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yl.c f46857i;

    public p(b0 b0Var, c0 proto, vl.f nameResolver, vl.a metadataVersion, rl.f fVar, lm.i components, String debugName, jk.a aVar) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.n.f(components, "components");
        kotlin.jvm.internal.n.f(debugName, "debugName");
        w0 w0Var = proto.f51148g;
        kotlin.jvm.internal.n.e(w0Var, "proto.typeTable");
        l3.i iVar = new l3.i(w0Var);
        vl.g gVar = vl.g.f52655b;
        d1 d1Var = proto.f51149h;
        kotlin.jvm.internal.n.e(d1Var, "proto.versionRequirementTable");
        com.google.android.gms.internal.consent_sdk.d dVarA = components.a(b0Var, nameResolver, iVar, q1.h(d1Var), metadataVersion, fVar);
        List list = proto.f51145d;
        kotlin.jvm.internal.n.e(list, "proto.functionList");
        List list2 = proto.f51146e;
        kotlin.jvm.internal.n.e(list2, "proto.propertyList");
        List list3 = proto.f51147f;
        kotlin.jvm.internal.n.e(list3, "proto.typeAliasList");
        super(dVarA, list, list2, list3, aVar);
        this.f46855g = b0Var;
        this.f46856h = debugName;
        this.f46857i = ((h0) b0Var).f6518e;
    }

    @Override // nm.o, im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        a2.H(((lm.i) this.f46851b.f22981a).f45545i, location, this.f46855g, name);
        return super.c(name, location);
    }

    @Override // im.o, im.p
    public final Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        Collection collectionI = i(kindFilter, bVar);
        Iterable iterable = ((lm.i) this.f46851b.f22981a).f45547k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xj.t.a0(((bl.c) it.next()).a(this.f46857i), arrayList);
        }
        return xj.n.B0(arrayList, collectionI);
    }

    @Override // nm.o
    public final yl.b l(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return new yl.b(this.f46857i, name);
    }

    @Override // nm.o
    public final Set n() {
        return x.f53868a;
    }

    @Override // nm.o
    public final Set o() {
        return x.f53868a;
    }

    @Override // nm.o
    public final Set p() {
        return x.f53868a;
    }

    @Override // nm.o
    public final boolean q(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable iterable = ((lm.i) this.f46851b.f22981a).f45547k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((bl.c) it.next()).c(this.f46857i, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f46856h;
    }

    @Override // nm.o
    public final void h(ArrayList arrayList, jk.b bVar) {
    }
}
