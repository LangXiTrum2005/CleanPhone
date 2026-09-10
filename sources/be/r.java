package be;

import com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5668a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5671d;

    public r(d dVar, r rVar, r rVar2, ae.r rVar3) {
        this.f5669b = rVar;
        this.f5670c = rVar2;
        this.f5671d = rVar3;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        switch (this.f5668a) {
            case 0:
                int iH = aVar.H();
                if (iH == 9) {
                    aVar.D();
                    return null;
                }
                Map map = (Map) ((ae.r) this.f5671d).d();
                if (iH == 1) {
                    aVar.d();
                    while (aVar.u()) {
                        aVar.d();
                        Object objB = ((com.google.gson.t) ((r) this.f5669b).f5670c).b(aVar);
                        if (map.put(objB, ((com.google.gson.t) ((r) this.f5670c).f5670c).b(aVar)) != null) {
                            throw new com.google.gson.m("duplicate key: " + objB);
                        }
                        aVar.o();
                    }
                    aVar.o();
                } else {
                    aVar.h();
                    while (aVar.u()) {
                        ea.a0.l.getClass();
                        if (aVar instanceof o) {
                            o oVar = (o) aVar;
                            oVar.Q(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) oVar.U()).next();
                            oVar.W(entry.getValue());
                            oVar.W(new com.google.gson.l((String) entry.getKey()));
                        } else {
                            int iN = aVar.f41869g;
                            if (iN == 0) {
                                iN = aVar.n();
                            }
                            if (iN == 13) {
                                aVar.f41869g = 9;
                            } else if (iN == 12) {
                                aVar.f41869g = 8;
                            } else {
                                if (iN != 14) {
                                    throw aVar.P("a name");
                                }
                                aVar.f41869g = 10;
                            }
                        }
                        Object objB2 = ((com.google.gson.t) ((r) this.f5669b).f5670c).b(aVar);
                        if (map.put(objB2, ((com.google.gson.t) ((r) this.f5670c).f5670c).b(aVar)) != null) {
                            throw new com.google.gson.m("duplicate key: " + objB2);
                        }
                    }
                    aVar.p();
                }
                return map;
            case 1:
                return ((com.google.gson.t) this.f5670c).b(aVar);
            default:
                com.google.gson.g gVarI = ae.i.i(aVar);
                com.google.gson.j jVarH = gVarI.h();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f5671d;
                com.google.gson.g gVar = (com.google.gson.g) jVarH.f24754a.remove(runtimeTypeAdapterFactory.typeFieldName);
                if (gVar == null) {
                    throw new com.google.gson.k("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " because it does not define a field named " + runtimeTypeAdapterFactory.typeFieldName);
                }
                String strM = gVar.m();
                com.google.gson.t tVar = (com.google.gson.t) ((LinkedHashMap) this.f5669b).get(strM);
                if (tVar == null) {
                    throw new com.google.gson.k("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " subtype named " + strM + "; did you forget to register a subtype?");
                }
                try {
                    o oVar2 = new o(o.f5657t);
                    oVar2.f5659p = new Object[32];
                    oVar2.f5660q = 0;
                    oVar2.f5661r = new String[32];
                    oVar2.f5662s = new int[32];
                    oVar2.W(gVarI);
                    return tVar.b(oVar2);
                } catch (IOException e10) {
                    throw new com.google.gson.h(e10);
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        com.google.gson.t tVarD;
        switch (this.f5668a) {
            case 0:
                Map map = (Map) obj;
                r rVar = (r) this.f5670c;
                if (map == null) {
                    bVar.s();
                    return;
                }
                bVar.k();
                for (Map.Entry entry : map.entrySet()) {
                    bVar.q(String.valueOf(entry.getKey()));
                    rVar.c(bVar, entry.getValue());
                }
                bVar.p();
                return;
            case 1:
                com.google.gson.t tVar = (com.google.gson.t) this.f5670c;
                Type type = (Type) this.f5671d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    com.google.gson.t tVarC = ((com.google.gson.d) this.f5669b).c(new fe.a(type2));
                    if (tVarC instanceof x) {
                        com.google.gson.t tVar2 = tVar;
                        while ((tVar2 instanceof c0) && (tVarD = ((c0) tVar2).d()) != tVar2) {
                            tVar2 = tVarD;
                        }
                        if (tVar2 instanceof x) {
                            tVar = tVarC;
                        }
                    } else {
                        tVar = tVarC;
                    }
                }
                tVar.c(bVar, obj);
                return;
            default:
                Class<?> cls = obj.getClass();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f5671d;
                String str = (String) runtimeTypeAdapterFactory.subtypeToLabel.get(cls);
                com.google.gson.t tVar3 = (com.google.gson.t) ((LinkedHashMap) this.f5670c).get(cls);
                if (tVar3 == null) {
                    throw new com.google.gson.k("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                tVar3.getClass();
                try {
                    q qVar = new q();
                    tVar3.c(qVar, obj);
                    ArrayList arrayList = qVar.f5665o;
                    if (!arrayList.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
                    }
                    ae.q qVar2 = qVar.f5667q.h().f24754a;
                    if (qVar2.containsKey(runtimeTypeAdapterFactory.typeFieldName)) {
                        throw new com.google.gson.k("cannot serialize " + cls.getName() + " because it already defines a field named " + runtimeTypeAdapterFactory.typeFieldName);
                    }
                    com.google.gson.j jVar = new com.google.gson.j();
                    String str2 = runtimeTypeAdapterFactory.typeFieldName;
                    com.google.gson.l lVar = new com.google.gson.l(str);
                    ae.q qVar3 = jVar.f24754a;
                    qVar3.put(str2, lVar);
                    Iterator it = ((ae.n) qVar2.entrySet()).iterator();
                    while (((ae.o) it).hasNext()) {
                        ae.p pVarA = ((ae.m) it).a();
                        String str3 = (String) pVarA.getKey();
                        Object obj2 = (com.google.gson.g) pVarA.getValue();
                        if (obj2 == null) {
                            obj2 = com.google.gson.i.f24753a;
                        }
                        qVar3.put(str3, obj2);
                    }
                    i1.f5647z.getClass();
                    m.e(bVar, jVar);
                    return;
                } catch (IOException e10) {
                    throw new com.google.gson.h(e10);
                }
        }
    }

    public r(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f5671d = runtimeTypeAdapterFactory;
        this.f5669b = linkedHashMap;
        this.f5670c = linkedHashMap2;
    }

    public r(com.google.gson.d dVar, com.google.gson.t tVar, Type type) {
        this.f5669b = dVar;
        this.f5670c = tVar;
        this.f5671d = type;
    }
}
