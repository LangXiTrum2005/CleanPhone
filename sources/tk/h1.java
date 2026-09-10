package tk;

import ea.f2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f50984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(i1 i1Var, int i10) {
        super(0);
        this.f50983e = i10;
        this.f50984f = i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    @Override // jk.a
    public final Object invoke() throws IOException {
        cl.w wVarO0;
        boolean zC;
        boolean z10;
        Class<?> enclosingClass;
        int i10 = this.f50983e;
        i1 i1Var = this.f50984f;
        boolean z11 = true;
        switch (i10) {
            case 0:
                c0 c0Var = i1Var.f50988f;
                String name = i1Var.f50989g;
                String signature = i1Var.f50990h;
                c0Var.getClass();
                kotlin.jvm.internal.n.f(name, "name");
                kotlin.jvm.internal.n.f(signature, "signature");
                an.g gVar = c0.f50957a;
                gVar.getClass();
                Matcher matcher = gVar.f3789a.matcher(signature);
                kotlin.jvm.internal.n.e(matcher, "matcher(...)");
                f2 f2Var = matcher.matches() ? new f2(matcher, signature) : null;
                if (f2Var != null) {
                    if (((an.e) f2Var.f39410c) == null) {
                        f2Var.f39410c = new an.e(f2Var);
                    }
                    an.e eVar = (an.e) f2Var.f39410c;
                    kotlin.jvm.internal.n.c(eVar);
                    String str = (String) eVar.get(1);
                    zk.h0 h0VarI = c0Var.i(Integer.parseInt(str));
                    if (h0VarI != null) {
                        return h0VarI;
                    }
                    StringBuilder sbK = d5.u.k("Local property #", str, " not found in ");
                    sbK.append(c0Var.a());
                    throw new cn.c0(sbK.toString(), 3);
                }
                Collection collectionL = c0Var.l(yl.f.e(name));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionL) {
                    if (kotlin.jvm.internal.n.a(t1.b((zk.h0) obj).c(), signature)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbV = defpackage.e.v("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbV.append(c0Var);
                    throw new cn.c0(sbV.toString(), 3);
                }
                if (arrayList.size() == 1) {
                    return (zk.h0) xj.n.F0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    il.o visibility = ((zk.h0) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new ae.l(12));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                kotlin.jvm.internal.n.e(collectionValues, "properties\n             …\n                }.values");
                List list = (List) xj.n.v0(collectionValues);
                if (list.size() == 1) {
                    return (zk.h0) xj.n.o0(list);
                }
                String strU0 = xj.n.u0(c0Var.l(yl.f.e(name)), "\n", null, null, b.f50950k, 30);
                StringBuilder sbV2 = defpackage.e.v("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbV2.append(c0Var);
                sbV2.append(':');
                sbV2.append(strU0.length() == 0 ? " no members found" : "\n".concat(strU0));
                throw new cn.c0(sbV2.toString(), 3);
            default:
                yl.b bVar = t1.f51065a;
                zk.h0 h0VarH = i1Var.h();
                c0 c0Var2 = i1Var.f50988f;
                q1 q1VarB = t1.b(h0VarH);
                if (!(q1VarB instanceof m)) {
                    if (q1VarB instanceof k) {
                        return ((k) q1VarB).f50999b;
                    }
                    if ((q1VarB instanceof l) || (q1VarB instanceof n)) {
                        return null;
                    }
                    throw new aa.b((byte) 0, 20);
                }
                m mVar = (m) q1VarB;
                tl.g0 g0Var = mVar.f51015c;
                zk.h0 h0Var = mVar.f51014b;
                zl.g gVar2 = xl.h.f53909a;
                xl.d dVarB = xl.h.b(g0Var, mVar.f51017e, mVar.f51018f, true);
                if (dVarB == null) {
                    return null;
                }
                if (h0Var.getKind() != 2) {
                    zk.j jVarE = h0Var.e();
                    if (jVarE == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (bm.e.l(jVarE)) {
                        zk.j jVarE2 = jVarE.e();
                        if (bm.e.n(jVarE2, 1) || bm.e.n(jVarE2, 3)) {
                            zk.e eVar2 = (zk.e) jVarE;
                            LinkedHashSet linkedHashSet = wk.d.f53304a;
                            LinkedHashSet linkedHashSet2 = wk.d.f53304a;
                            if (bm.e.l(eVar2)) {
                                LinkedHashSet linkedHashSet3 = wk.d.f53304a;
                                yl.b bVarF = fm.e.f(eVar2);
                                if (xj.n.i0(linkedHashSet3, bVarF != null ? bVarF.f() : null)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (bm.e.l(h0Var.e())) {
                                    wVarO0 = h0Var.o0();
                                    if (wVarO0 == null && wVarO0.getAnnotations().c(il.x.f43118a)) {
                                        zC = true;
                                    } else {
                                        zC = h0Var.getAnnotations().c(il.x.f43118a);
                                    }
                                    if (!zC) {
                                        z11 = false;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                        } else if (bm.e.l(h0Var.e())) {
                            z11 = false;
                        } else {
                            wVarO0 = h0Var.o0();
                            if (wVarO0 == null) {
                                zC = h0Var.getAnnotations().c(il.x.f43118a);
                            } else {
                                zC = h0Var.getAnnotations().c(il.x.f43118a);
                            }
                            if (!zC) {
                                z11 = false;
                            }
                        }
                    } else if (bm.e.l(h0Var.e())) {
                        z11 = false;
                    } else {
                        wVarO0 = h0Var.o0();
                        if (wVarO0 == null) {
                            zC = h0Var.getAnnotations().c(il.x.f43118a);
                        } else {
                            zC = h0Var.getAnnotations().c(il.x.f43118a);
                        }
                        if (!zC) {
                            z11 = false;
                        }
                    }
                } else {
                    z11 = false;
                }
                if (z11 || xl.h.d(g0Var)) {
                    enclosingClass = c0Var2.a().getEnclosingClass();
                } else {
                    zk.j jVarE3 = h0Var.e();
                    enclosingClass = jVarE3 instanceof zk.e ? v1.j((zk.e) jVarE3) : c0Var2.a();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(dVarB.f53898d);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
        }
    }
}
