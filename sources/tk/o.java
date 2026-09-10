package tk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f51029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, int i10) {
        super(0);
        this.f51028e = i10;
        this.f51029f = rVar;
    }

    @Override // jk.a
    public final Object invoke() {
        int i10;
        Type[] lowerBounds;
        int i11 = this.f51028e;
        Type type = null;
        int i12 = 0;
        r rVar = this.f51029f;
        switch (i11) {
            case 0:
                int size = (rVar.isSuspend() ? 1 : 0) + rVar.getParameters().size();
                int size2 = (rVar.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = rVar.getParameters().iterator();
                while (it.hasNext()) {
                    s0 s0Var = (s0) ((qk.o) it.next());
                    boolean zE = s0Var.e();
                    int i13 = s0Var.f51058b;
                    if (zE) {
                        k1 k1VarC = s0Var.c();
                        yl.c cVar = v1.f51075a;
                        pm.y yVar = k1VarC.f51002a;
                        if (yVar == null || !bm.g.c(yVar)) {
                            k1 k1VarC2 = s0Var.c();
                            o1 o1Var = k1VarC2.f51003b;
                            Type typeK = o1Var != null ? (Type) o1Var.invoke() : null;
                            if (typeK == null) {
                                typeK = o1Var != null ? (Type) o1Var.invoke() : null;
                                if (typeK == null) {
                                    typeK = qk.i0.k(k1VarC2, false);
                                }
                            }
                            objArr[i13] = v1.e(typeK);
                        }
                    }
                    if (s0Var.f()) {
                        objArr[i13] = r.a(s0Var.c());
                    }
                }
                for (int i14 = 0; i14 < size2; i14++) {
                    objArr[size + i14] = 0;
                }
                return objArr;
            case 1:
                return v1.d(rVar.h());
            case 2:
                zk.c cVarH = rVar.h();
                ArrayList arrayList = new ArrayList();
                if (rVar.j()) {
                    i10 = 0;
                } else {
                    cl.z zVarG = v1.g(cVarH);
                    if (zVarG != null) {
                        arrayList.add(new s0(rVar, 0, qk.n.f49125a, new p(zVarG, 0)));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    cl.z zVarJ = cVarH.J();
                    if (zVarJ != null) {
                        arrayList.add(new s0(rVar, i10, qk.n.f49126b, new p(zVarJ, 1)));
                        i10++;
                    }
                }
                int size3 = cVarH.B().size();
                while (i12 < size3) {
                    arrayList.add(new s0(rVar, i10, qk.n.f49127c, new q(cVarH, i12)));
                    i12++;
                    i10++;
                }
                if (rVar.i() && (cVarH instanceof kl.a) && arrayList.size() > 1) {
                    xj.s.Z(new ae.l(11), arrayList);
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                if (rVar.isSuspend()) {
                    Object objX0 = xj.n.x0(rVar.c().a());
                    ParameterizedType parameterizedType = objX0 instanceof ParameterizedType ? (ParameterizedType) objX0 : null;
                    if (kotlin.jvm.internal.n.a(parameterizedType != null ? parameterizedType.getRawType() : null, ak.f.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        kotlin.jvm.internal.n.e(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object objZ0 = xj.k.z0(actualTypeArguments);
                        WildcardType wildcardType = objZ0 instanceof WildcardType ? (WildcardType) objZ0 : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) xj.k.o0(lowerBounds);
                        }
                    }
                }
                return type == null ? rVar.c().getReturnType() : type;
            case 4:
                pm.y returnType = rVar.h().getReturnType();
                kotlin.jvm.internal.n.c(returnType);
                return new k1(returnType, new o(rVar, 3));
            default:
                List typeParameters = rVar.h().getTypeParameters();
                kotlin.jvm.internal.n.e(typeParameters, "descriptor.typeParameters");
                List<zk.m0> list = typeParameters;
                ArrayList arrayList2 = new ArrayList(xj.p.W(list, 10));
                for (zk.m0 descriptor : list) {
                    kotlin.jvm.internal.n.e(descriptor, "descriptor");
                    arrayList2.add(new l1(rVar, descriptor));
                }
                return arrayList2;
        }
    }
}
