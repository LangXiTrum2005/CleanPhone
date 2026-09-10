package be;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f5656a = new m();

    private m() {
    }

    public static com.google.gson.g d(ge.a aVar, int i10) {
        int iC = v0.i.c(i10);
        if (iC == 5) {
            return new com.google.gson.l(aVar.F());
        }
        if (iC == 6) {
            return new com.google.gson.l(new ae.k(aVar.F()));
        }
        if (iC == 7) {
            return new com.google.gson.l(Boolean.valueOf(aVar.x()));
        }
        if (iC != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(d5.u.z(i10)));
        }
        aVar.D();
        return com.google.gson.i.f24753a;
    }

    public static void e(ge.b bVar, com.google.gson.g gVar) throws IOException {
        if (gVar == null || (gVar instanceof com.google.gson.i)) {
            bVar.s();
            return;
        }
        boolean z10 = gVar instanceof com.google.gson.l;
        if (z10) {
            if (!z10) {
                throw new IllegalStateException("Not a JSON Primitive: " + gVar);
            }
            com.google.gson.l lVar = (com.google.gson.l) gVar;
            Serializable serializable = lVar.f24755a;
            if (serializable instanceof Number) {
                bVar.A(lVar.q());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.C(lVar.b());
                return;
            } else {
                bVar.B(lVar.m());
                return;
            }
        }
        boolean z11 = gVar instanceof com.google.gson.e;
        if (z11) {
            bVar.h();
            if (!z11) {
                throw new IllegalStateException("Not a JSON Array: " + gVar);
            }
            Iterator it = ((com.google.gson.e) gVar).f24752a.iterator();
            while (it.hasNext()) {
                e(bVar, (com.google.gson.g) it.next());
            }
            bVar.o();
            return;
        }
        if (!(gVar instanceof com.google.gson.j)) {
            throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
        }
        bVar.k();
        Iterator it2 = ((ae.n) gVar.h().f24754a.entrySet()).iterator();
        while (((ae.o) it2).hasNext()) {
            ae.p pVarA = ((ae.m) it2).a();
            bVar.q((String) pVarA.getKey());
            e(bVar, (com.google.gson.g) pVarA.getValue());
        }
        bVar.p();
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        com.google.gson.g eVar;
        com.google.gson.g eVar2;
        if (aVar instanceof o) {
            o oVar = (o) aVar;
            int iH = oVar.H();
            if (iH != 5 && iH != 2 && iH != 4 && iH != 10) {
                com.google.gson.g gVar = (com.google.gson.g) oVar.U();
                oVar.N();
                return gVar;
            }
            throw new IllegalStateException("Unexpected " + d5.u.z(iH) + " when reading a JsonElement.");
        }
        int iH2 = aVar.H();
        int iC = v0.i.c(iH2);
        if (iC == 0) {
            aVar.d();
            eVar = new com.google.gson.e();
        } else if (iC != 2) {
            eVar = null;
        } else {
            aVar.h();
            eVar = new com.google.gson.j();
        }
        if (eVar == null) {
            return d(aVar, iH2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.u()) {
                String strB = eVar instanceof com.google.gson.j ? aVar.B() : null;
                int iH3 = aVar.H();
                int iC2 = v0.i.c(iH3);
                if (iC2 == 0) {
                    aVar.d();
                    eVar2 = new com.google.gson.e();
                } else if (iC2 != 2) {
                    eVar2 = null;
                } else {
                    aVar.h();
                    eVar2 = new com.google.gson.j();
                }
                boolean z10 = eVar2 != null;
                if (eVar2 == null) {
                    eVar2 = d(aVar, iH3);
                }
                if (eVar instanceof com.google.gson.e) {
                    ((com.google.gson.e) eVar).f24752a.add(eVar2);
                } else {
                    ((com.google.gson.j) eVar).f24754a.put(strB, eVar2);
                }
                if (z10) {
                    arrayDeque.addLast(eVar);
                    eVar = eVar2;
                }
            } else {
                if (eVar instanceof com.google.gson.e) {
                    aVar.o();
                } else {
                    aVar.p();
                }
                if (arrayDeque.isEmpty()) {
                    return eVar;
                }
                eVar = (com.google.gson.g) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.t
    public final /* bridge */ /* synthetic */ void c(ge.b bVar, Object obj) throws IOException {
        e(bVar, (com.google.gson.g) obj);
    }
}
