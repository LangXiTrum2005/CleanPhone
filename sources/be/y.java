package be;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae.r f5689b;

    public y(ae.r rVar, z zVar) {
        super(zVar);
        this.f5689b = rVar;
    }

    @Override // be.x
    public final Object d() {
        return this.f5689b.d();
    }

    @Override // be.x
    public final void f(Object obj, ge.a aVar, w wVar) throws IllegalAccessException {
        Field field = wVar.f5681b;
        Object objB = wVar.f5685f.b(aVar);
        if (objB == null && wVar.f5686g) {
            return;
        }
        if (wVar.f5687h) {
            throw new com.google.gson.h(defpackage.e.n("Cannot set value of 'static final' ", de.c.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // be.x
    public final Object e(Object obj) {
        return obj;
    }
}
