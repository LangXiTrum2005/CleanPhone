package ml;

import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import pm.j0;
import pm.n0;
import pm.r0;
import pm.w0;
import tl.q0;
import zk.k0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends pm.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f46189c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f46190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.c f46191e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(j jVar) {
        this.f46191e = jVar;
        nf nfVar = jVar.f46195j;
        super(((ll.a) nfVar.f23782b).f45485a);
        om.o oVar = ((ll.a) nfVar.f23782b).f45485a;
        g gVar = new g(jVar, 0);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46190d = new om.i(lVar, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x030e  */
    /* JADX WARN: Code duplicated, block: B:124:0x031c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0325  */
    /* JADX WARN: Code duplicated, block: B:128:0x032a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0343  */
    /* JADX WARN: Code duplicated, block: B:138:0x0355  */
    /* JADX WARN: Code duplicated, block: B:141:0x0362  */
    /* JADX WARN: Code duplicated, block: B:144:0x037b A[LOOP:5: B:142:0x0375->B:144:0x037b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x039b  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:170:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x018c  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x018c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection] */
    @Override // pm.h
    public final Collection b() {
        ?? arrayList;
        String str;
        yl.c cVar;
        yl.c cVar2;
        ArrayList arrayList2;
        pm.c0 c0VarQ;
        int i10;
        zk.e eVar;
        pm.y yVarI;
        List listC;
        ArrayList arrayList3;
        pm.y yVar;
        pm.y yVarA;
        n0 n0VarP;
        n0 n0VarP2;
        int i11 = this.f46189c;
        cl.c cVar3 = this.f46191e;
        switch (i11) {
            case 0:
                j jVar = (j) cVar3;
                nf nfVar = jVar.f46195j;
                Class cls = jVar.f46193h.f41001a;
                boolean zA = kotlin.jvm.internal.n.a(cls, Object.class);
                xj.v vVar = xj.v.f53866a;
                if (zA) {
                    arrayList = vVar;
                } else {
                    h2.d dVar = new h2.d(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    dVar.f(genericSuperclass != null ? genericSuperclass : Object.class);
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    kotlin.jvm.internal.n.e(genericInterfaces, "klass.genericInterfaces");
                    dVar.h(genericInterfaces);
                    ArrayList arrayList4 = dVar.f42079a;
                    List listQ = xj.o.Q(arrayList4.toArray(new Type[arrayList4.size()]));
                    arrayList = new ArrayList(xj.p.W(listQ, 10));
                    Iterator it = listQ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new fl.p((Type) it.next()));
                    }
                }
                ArrayList arrayList5 = new ArrayList(arrayList.size());
                ArrayList<pl.d> arrayList6 = new ArrayList(0);
                ll.c cVar4 = jVar.f46205u;
                yl.c PURELY_IMPLEMENTS_ANNOTATION = il.y.f43132n;
                kotlin.jvm.internal.n.e(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
                al.c cVarD = cVar4.d(PURELY_IMPLEMENTS_ANNOTATION);
                int i12 = 1;
                if (cVarD != null) {
                    Object objG0 = xj.n.G0(cVarD.d().values());
                    dm.w wVar = objG0 instanceof dm.w ? (dm.w) objG0 : null;
                    if (wVar != null && (str = (String) wVar.f38953a) != null) {
                        int i13 = 0;
                        int i14 = 1;
                        while (true) {
                            if (i13 < str.length()) {
                                char cCharAt = str.charAt(i13);
                                int iC = v0.i.c(i14);
                                if (iC != 0) {
                                    if (iC != 1) {
                                        if (iC != 2) {
                                            continue;
                                        } else if (!Character.isJavaIdentifierStart(cCharAt)) {
                                            i14 = 2;
                                        }
                                    } else if (cCharAt == '.') {
                                        i14 = 3;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i13++;
                                } else if (!Character.isJavaIdentifierStart(cCharAt)) {
                                    i14 = 2;
                                    i13++;
                                }
                            } else {
                                cVar = i14 != 3 ? new yl.c(str) : null;
                            }
                        }
                    }
                }
                if (cVar == null || cVar.d() || !cVar.h(wk.m.f53372j)) {
                    cVar = null;
                }
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = il.k.f43089a;
                    cVar2 = (yl.c) il.k.f43090b.get(fm.e.g(jVar));
                    if (cVar2 == null) {
                        c0VarQ = null;
                    }
                    for (fl.p pVar : arrayList) {
                        pm.y yVarL = ((v9.e) nfVar.f23786f).L(pVar, android.support.v4.media.session.a.I(i12, false, null, 7));
                        ql.c cVar5 = ((ll.a) nfVar.f23782b).f45501r;
                        cVar5.getClass();
                        int i15 = i12;
                        yVar = yVarL;
                        yVarA = cVar5.a(new hx0(null, false, nfVar, il.a.TYPE_USE, true), yVar, vVar, null, false);
                        if (yVarA != null) {
                            yVar = yVarA;
                        }
                        if (yVar.P().e() instanceof zk.z) {
                            arrayList6.add(pVar);
                        }
                        n0VarP = yVar.P();
                        if (c0VarQ != null) {
                            n0VarP2 = c0VarQ.P();
                        } else {
                            n0VarP2 = null;
                        }
                        if (!kotlin.jvm.internal.n.a(n0VarP, n0VarP2) && !wk.h.x(yVar)) {
                            arrayList5.add(yVar);
                        }
                        i12 = i15;
                    }
                    i10 = i12;
                    eVar = jVar.f46194i;
                    if (eVar != null) {
                        yVarI = new w0(r9.b.e(eVar, jVar)).i(i10, eVar.g());
                    } else {
                        yVarI = null;
                    }
                    ym.l.a(arrayList5, yVarI);
                    ym.l.a(arrayList5, c0VarQ);
                    if (!arrayList6.isEmpty()) {
                        lm.k kVar = ((ll.a) nfVar.f23782b).f45490f;
                        arrayList3 = new ArrayList(xj.p.W(arrayList6, 10));
                        for (pl.d dVar2 : arrayList6) {
                            kotlin.jvm.internal.n.d(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList3.add(((fl.p) dVar2).f41003a.toString());
                        }
                        kVar.a(jVar, arrayList3);
                    }
                    if (arrayList5.isEmpty()) {
                        listC = j1.f.C(((ll.a) nfVar.f23782b).f45498o.d().e());
                    } else {
                        listC = xj.n.N0(arrayList5);
                    }
                    return listC;
                }
                cVar2 = cVar;
                zk.w wVar2 = ((ll.a) nfVar.f23782b).f45498o;
                int i16 = fm.e.f41020a;
                kotlin.jvm.internal.n.f(wVar2, "<this>");
                cVar2.d();
                im.j jVar2 = ((cl.b0) wVar2.F(cVar2.e())).f6483g;
                yl.f fVarF = cVar2.f();
                kotlin.jvm.internal.n.e(fVarF, "topLevelClassFqName.shortName()");
                zk.g gVarC = jVar2.c(fVarF, hl.b.f42412h);
                zk.e eVar2 = gVarC instanceof zk.e ? (zk.e) gVarC : null;
                if (eVar2 == null) {
                    c0VarQ = null;
                } else {
                    int size = eVar2.n().getParameters().size();
                    List parameters = jVar.f46200p.getParameters();
                    kotlin.jvm.internal.n.e(parameters, "getTypeConstructor().parameters");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        List list = parameters;
                        arrayList2 = new ArrayList(xj.p.W(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new r0(1, ((m0) it2.next()).g()));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        r0 r0Var = new r0(1, ((m0) xj.n.F0(parameters)).g());
                        pk.c cVar6 = new pk.c(1, size, 1);
                        ArrayList arrayList7 = new ArrayList(xj.p.W(cVar6, 10));
                        pk.b it3 = cVar6.iterator();
                        while (it3.f48398c) {
                            it3.nextInt();
                            arrayList7.add(r0Var);
                        }
                        arrayList2 = arrayList7;
                    } else {
                        c0VarQ = null;
                    }
                    j0.f48443b.getClass();
                    c0VarQ = pm.f.q(j0.f48444c, eVar2, arrayList2);
                }
                while (r4.hasNext()) {
                    pm.y yVarL2 = ((v9.e) nfVar.f23786f).L(pVar, android.support.v4.media.session.a.I(i12, false, null, 7));
                    ql.c cVar7 = ((ll.a) nfVar.f23782b).f45501r;
                    cVar7.getClass();
                    int i17 = i12;
                    yVar = yVarL2;
                    yVarA = cVar7.a(new hx0(null, false, nfVar, il.a.TYPE_USE, true), yVar, vVar, null, false);
                    if (yVarA != null) {
                        yVar = yVarA;
                    }
                    if (yVar.P().e() instanceof zk.z) {
                        arrayList6.add(pVar);
                    }
                    n0VarP = yVar.P();
                    if (c0VarQ != null) {
                        n0VarP2 = c0VarQ.P();
                    } else {
                        n0VarP2 = null;
                    }
                    if (!kotlin.jvm.internal.n.a(n0VarP, n0VarP2)) {
                        arrayList5.add(yVar);
                    }
                    i12 = i17;
                }
                i10 = i12;
                eVar = jVar.f46194i;
                if (eVar != null) {
                    yVarI = new w0(r9.b.e(eVar, jVar)).i(i10, eVar.g());
                } else {
                    yVarI = null;
                }
                ym.l.a(arrayList5, yVarI);
                ym.l.a(arrayList5, c0VarQ);
                if (!arrayList6.isEmpty()) {
                    lm.k kVar2 = ((ll.a) nfVar.f23782b).f45490f;
                    arrayList3 = new ArrayList(xj.p.W(arrayList6, 10));
                    while (r3.hasNext()) {
                        kotlin.jvm.internal.n.d(dVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList3.add(((fl.p) dVar2).f41003a.toString());
                    }
                    kVar2.a(jVar, arrayList3);
                }
                if (arrayList5.isEmpty()) {
                    listC = xj.n.N0(arrayList5);
                } else {
                    listC = j1.f.C(((ll.a) nfVar.f23782b).f45498o.d().e());
                }
                return listC;
            default:
                nm.h hVar = (nm.h) cVar3;
                tl.j jVar3 = hVar.f46815e;
                com.google.android.gms.internal.consent_sdk.d dVar3 = hVar.l;
                l3.i iVar = (l3.i) dVar3.f22984d;
                kotlin.jvm.internal.n.f(jVar3, "<this>");
                List list2 = jVar3.f51300h;
                boolean zIsEmpty = list2.isEmpty();
                ?? arrayList8 = list2;
                if (zIsEmpty) {
                    arrayList8 = 0;
                }
                if (arrayList8 == 0) {
                    List supertypeIdList = jVar3.f51301i;
                    kotlin.jvm.internal.n.e(supertypeIdList, "supertypeIdList");
                    List<Integer> list3 = supertypeIdList;
                    arrayList8 = new ArrayList(xj.p.W(list3, 10));
                    for (Integer it4 : list3) {
                        kotlin.jvm.internal.n.e(it4, "it");
                        arrayList8.add(iVar.a(it4.intValue()));
                    }
                }
                Iterable iterable = (Iterable) arrayList8;
                ArrayList arrayList9 = new ArrayList(xj.p.W(iterable, 10));
                Iterator it5 = iterable.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((lm.b0) dVar3.f22988h).g((q0) it5.next()));
                }
                ArrayList arrayListB0 = xj.n.B0(((lm.i) dVar3.f22981a).f45549n.d(hVar), arrayList9);
                ArrayList<zk.z> arrayList10 = new ArrayList();
                Iterator it6 = arrayListB0.iterator();
                while (it6.hasNext()) {
                    zk.g gVarE = ((pm.y) it6.next()).P().e();
                    zk.z zVar = gVarE instanceof zk.z ? (zk.z) gVarE : null;
                    if (zVar != null) {
                        arrayList10.add(zVar);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    lm.k kVar3 = ((lm.i) dVar3.f22981a).f45544h;
                    ArrayList arrayList11 = new ArrayList(xj.p.W(arrayList10, 10));
                    for (zk.z zVar2 : arrayList10) {
                        yl.b bVarF = fm.e.f(zVar2);
                        arrayList11.add(bVarF != null ? bVarF.b().b() : zVar2.getName().b());
                    }
                    kVar3.a(hVar, arrayList11);
                }
                return xj.n.N0(arrayListB0);
        }
    }

    @Override // pm.b, pm.n0
    public final zk.g e() {
        switch (this.f46189c) {
            case 0:
                return (j) this.f46191e;
            default:
                return (nm.h) this.f46191e;
        }
    }

    @Override // pm.n0
    public final boolean g() {
        switch (this.f46189c) {
        }
        return true;
    }

    @Override // pm.n0
    public final List getParameters() {
        switch (this.f46189c) {
            case 0:
                break;
        }
        return (List) this.f46190d.invoke();
    }

    @Override // pm.h
    public final k0 h() {
        switch (this.f46189c) {
            case 0:
                return ((ll.a) ((j) this.f46191e).f46195j.f23782b).f45496m;
            default:
                return k0.f54972c;
        }
    }

    @Override // pm.b
    /* JADX INFO: renamed from: m */
    public final zk.e e() {
        switch (this.f46189c) {
            case 0:
                return (j) this.f46191e;
            default:
                return (nm.h) this.f46191e;
        }
    }

    public final String toString() {
        switch (this.f46189c) {
            case 0:
                String strB = ((j) this.f46191e).getName().b();
                kotlin.jvm.internal.n.e(strB, "name.asString()");
                return strB;
            default:
                String str = ((nm.h) this.f46191e).getName().f54514a;
                kotlin.jvm.internal.n.e(str, "name.toString()");
                return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(nm.h hVar) {
        this.f46191e = hVar;
        com.google.android.gms.internal.consent_sdk.d dVar = hVar.l;
        super(((lm.i) dVar.f22981a).f45537a);
        om.l lVar = ((lm.i) dVar.f22981a).f45537a;
        nm.g gVar = new nm.g(hVar, 0);
        lVar.getClass();
        this.f46190d = new om.i(lVar, gVar);
    }
}
