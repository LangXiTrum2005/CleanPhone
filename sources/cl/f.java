package cl;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements pm.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nm.s f6497a;

    public f(nm.s sVar) {
        this.f6497a = sVar;
    }

    @Override // pm.n0
    public final wk.h d() {
        return fm.e.e(this.f6497a);
    }

    @Override // pm.n0
    public final zk.g e() {
        return this.f6497a;
    }

    @Override // pm.n0
    public final Collection f() {
        Collection collectionF = this.f6497a.L0().P().f();
        kotlin.jvm.internal.n.e(collectionF, "declarationDescriptor.un…pe.constructor.supertypes");
        return collectionF;
    }

    @Override // pm.n0
    public final boolean g() {
        return true;
    }

    @Override // pm.n0
    public final List getParameters() {
        List list = this.f6497a.f46869q;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.n.l("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f6497a.getName().b() + ']';
    }
}
