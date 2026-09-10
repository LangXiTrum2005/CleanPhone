package be;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.google.gson.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5598c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f5600b;

    public b(com.google.gson.d dVar, com.google.gson.t tVar, Class cls) {
        this.f5600b = new r(dVar, tVar, cls);
        this.f5599a = cls;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.u()) {
            arrayList.add(((com.google.gson.t) this.f5600b.f5670c).b(aVar));
        }
        aVar.o();
        int size = arrayList.size();
        Class cls = this.f5599a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.s();
            return;
        }
        bVar.h();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f5600b.c(bVar, Array.get(obj, i10));
        }
        bVar.o();
    }
}
