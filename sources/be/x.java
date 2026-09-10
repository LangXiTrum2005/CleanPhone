package be;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f5688a;

    public x(z zVar) {
        this.f5688a = zVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        Object objD = d();
        Map map = this.f5688a.f5694a;
        try {
            aVar.h();
            while (aVar.u()) {
                w wVar = (w) map.get(aVar.B());
                if (wVar == null) {
                    aVar.N();
                } else {
                    f(objD, aVar, wVar);
                }
            }
            aVar.p();
            return e(objD);
        } catch (IllegalAccessException e10) {
            com.bumptech.glide.c cVar = de.c.f38839a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalStateException e11) {
            throw new com.google.gson.m(e11);
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.s();
            return;
        }
        bVar.k();
        try {
            Iterator it = this.f5688a.f5695b.iterator();
            while (it.hasNext()) {
                ((w) it.next()).a(bVar, obj);
            }
            bVar.p();
        } catch (IllegalAccessException e10) {
            com.bumptech.glide.c cVar = de.c.f38839a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, ge.a aVar, w wVar);
}
