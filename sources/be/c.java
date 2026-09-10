package be;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5605a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5607c;

    public c(r rVar, ae.r rVar2) {
        this.f5606b = rVar;
        this.f5607c = rVar2;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        switch (this.f5605a) {
            case 0:
                if (aVar.H() == 9) {
                    aVar.D();
                    return null;
                }
                Collection collection = (Collection) ((ae.r) this.f5607c).d();
                aVar.d();
                while (aVar.u()) {
                    collection.add(((com.google.gson.t) ((r) this.f5606b).f5670c).b(aVar));
                }
                aVar.o();
                return collection;
            default:
                Class cls = (Class) this.f5606b;
                Object objB = ((y0) this.f5607c).f5692c.b(aVar);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new com.google.gson.m("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.t());
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        switch (this.f5605a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.h();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((r) this.f5606b).c(bVar, it.next());
                    }
                    bVar.o();
                } else {
                    bVar.s();
                }
                break;
            default:
                ((y0) this.f5607c).f5692c.c(bVar, obj);
                break;
        }
    }

    public c(y0 y0Var, Class cls) {
        this.f5607c = y0Var;
        this.f5606b = cls;
    }
}
