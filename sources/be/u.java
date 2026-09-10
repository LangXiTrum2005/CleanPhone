package be;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends com.google.gson.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f5676c = new s(com.google.gson.r.f24756a, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.r f5678b;

    public u(com.google.gson.d dVar, com.google.gson.r rVar) {
        this.f5677a = dVar;
        this.f5678b = rVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iH = aVar.H();
        int iC = v0.i.c(iH);
        if (iC == 0) {
            aVar.d();
            arrayList = new ArrayList();
        } else if (iC != 2) {
            arrayList = null;
        } else {
            aVar.h();
            arrayList = new ae.q(true);
        }
        if (arrayList == null) {
            return d(aVar, iH);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.u()) {
                String strB = arrayList instanceof Map ? aVar.B() : null;
                int iH2 = aVar.H();
                int iC2 = v0.i.c(iH2);
                if (iC2 == 0) {
                    aVar.d();
                    arrayList2 = new ArrayList();
                } else if (iC2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.h();
                    arrayList2 = new ae.q(true);
                }
                boolean z10 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iH2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strB, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.o();
                } else {
                    aVar.p();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.s();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.d dVar = this.f5677a;
        dVar.getClass();
        com.google.gson.t tVarC = dVar.c(new fe.a(cls));
        if (!(tVarC instanceof u)) {
            tVarC.c(bVar, obj);
        } else {
            bVar.k();
            bVar.p();
        }
    }

    public final Serializable d(ge.a aVar, int i10) {
        int iC = v0.i.c(i10);
        if (iC == 5) {
            return aVar.F();
        }
        if (iC == 6) {
            return this.f5678b.a(aVar);
        }
        if (iC == 7) {
            return Boolean.valueOf(aVar.x());
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(d5.u.z(i10)));
        }
        aVar.D();
        return null;
    }
}
