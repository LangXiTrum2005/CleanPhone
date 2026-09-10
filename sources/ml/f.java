package ml;

import cl.x0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import pm.q0;
import zk.j0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements al.c, kl.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f46178h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf f46179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl.d f46180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.h f46181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f46182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final el.g f46183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.i f46184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f46185g;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f46178h = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(f.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(f.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public f(nf c4, fl.d javaAnnotation, boolean z10) {
        kotlin.jvm.internal.n.f(c4, "c");
        kotlin.jvm.internal.n.f(javaAnnotation, "javaAnnotation");
        this.f46179a = c4;
        this.f46180b = javaAnnotation;
        ll.a aVar = (ll.a) c4.f23782b;
        om.o oVar = aVar.f45485a;
        e eVar = new e(this, 1);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46181c = new om.h(lVar, eVar);
        e eVar2 = new e(this, 2);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f46182d = new om.i(lVar2, eVar2);
        this.f46183e = aVar.f45494j.c(javaAnnotation);
        e eVar3 = new e(this, 0);
        om.l lVar3 = (om.l) oVar;
        lVar3.getClass();
        this.f46184f = new om.i(lVar3, eVar3);
        this.f46185g = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dm.g a(pl.a aVar) {
        pl.d hVar;
        pm.y yVarH;
        if (aVar instanceof fl.u) {
            return dm.h.b(null, ((fl.u) aVar).f41008b);
        }
        if (aVar instanceof fl.s) {
            Enum r10 = ((fl.s) aVar).f41006b;
            Class<?> enumClass = r10.getClass();
            if (!enumClass.isEnum()) {
                enumClass = enumClass.getEnclosingClass();
            }
            kotlin.jvm.internal.n.e(enumClass, "enumClass");
            return new dm.i(fl.c.a(enumClass), yl.f.e(r10.name()));
        }
        boolean z10 = aVar instanceof fl.g;
        nf nfVar = this.f46179a;
        if (z10) {
            fl.g gVar = (fl.g) aVar;
            yl.f fVar = gVar.f40990a;
            if (fVar == null) {
                fVar = il.y.f43121b;
            }
            kotlin.jvm.internal.n.e(fVar, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList arrayListA = gVar.a();
            pm.c0 type = (pm.c0) j1.f.w(this.f46182d, f46178h[1]);
            kotlin.jvm.internal.n.e(type, "type");
            if (!pm.c.j(type)) {
                zk.e eVarD = fm.e.d(this);
                kotlin.jvm.internal.n.c(eVarD);
                x0 x0VarR = go.c.r(fVar, eVarD);
                if (x0VarR == null || (yVarH = x0VarR.getType()) == null) {
                    yVarH = ((ll.a) nfVar.f23782b).f45498o.d().h(rm.i.c(rm.h.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(xj.p.W(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    dm.g gVarA = a((pl.a) it.next());
                    if (gVarA == null) {
                        gVarA = new dm.u(null);
                    }
                    arrayList.add(gVarA);
                }
                return new dm.x(arrayList, yVarH);
            }
        } else {
            if (aVar instanceof fl.f) {
                return new dm.a((Object) new f(nfVar, new fl.d(((fl.f) aVar).f40991b), false));
            }
            if (aVar instanceof fl.o) {
                Class cls = ((fl.o) aVar).f41002b;
                if (cls.isPrimitive()) {
                    hVar = new fl.y(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    hVar = new fl.h(cls);
                } else {
                    hVar = cls instanceof WildcardType ? new fl.d0((WildcardType) cls) : new fl.p(cls);
                }
                pm.y yVarL = ((v9.e) nfVar.f23786f).L(hVar, android.support.v4.media.session.a.I(2, false, null, 7));
                if (!pm.c.j(yVarL)) {
                    pm.y yVarB = yVarL;
                    int i10 = 0;
                    while (wk.h.y(yVarB)) {
                        yVarB = ((q0) xj.n.F0(yVarB.t())).b();
                        kotlin.jvm.internal.n.e(yVarB, "type.arguments.single().type");
                        i10++;
                    }
                    zk.g gVarE = yVarB.P().e();
                    if (gVarE instanceof zk.e) {
                        yl.b bVarF = fm.e.f(gVarE);
                        return bVarF == null ? new dm.s(new dm.p(yVarL)) : new dm.s(bVarF, i10);
                    }
                    if (gVarE instanceof m0) {
                        return new dm.s(yl.b.j(wk.l.f53335a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // al.c
    public final j0 c() {
        return this.f46183e;
    }

    @Override // al.c
    public final Map d() {
        return (Map) j1.f.w(this.f46184f, f46178h[2]);
    }

    @Override // al.c
    public final yl.c e() {
        qk.w p10 = f46178h[0];
        om.h hVar = this.f46181c;
        kotlin.jvm.internal.n.f(hVar, "<this>");
        kotlin.jvm.internal.n.f(p10, "p");
        return (yl.c) hVar.invoke();
    }

    @Override // al.c
    public final pm.y getType() {
        return (pm.c0) j1.f.w(this.f46182d, f46178h[1]);
    }

    public final String toString() {
        return am.h.f3706c.x(this, null);
    }
}
