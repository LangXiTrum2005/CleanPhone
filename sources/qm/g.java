package qm;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.d0;
import pm.a1;
import pm.c0;
import pm.f0;
import pm.j0;
import pm.n0;
import pm.o0;
import pm.q0;
import pm.r0;
import pm.w0;
import pm.x;
import pm.y;
import pm.y0;
import qk.i0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hn.u f49176a = new hn.u("KotlinTypeRefiner", 4);

    public static boolean A(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return ((n0) receiver).g();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean B(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            return pm.c.j((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean C(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            zk.g gVarE = ((n0) receiver).e();
            zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            return (eVar != null ? eVar.O() : null) instanceof zk.t;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean D(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return receiver instanceof dm.n;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean E(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return receiver instanceof x;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean F(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return ((c0) receiver).Q();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean G(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return wk.h.H((n0) receiver, wk.l.f53337b);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean H(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            return y0.e((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(sm.d dVar) {
        if (dVar instanceof y) {
            return wk.h.F((y) dVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, dVar.getClass(), sb2).toString());
    }

    public static boolean J(sm.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f49182g;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, bVar.getClass(), sb2).toString());
    }

    public static boolean K(q0 receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof q0) {
            return receiver.c();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static c0 N(pm.r rVar) {
        if (rVar instanceof pm.r) {
            return rVar.f48470b;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(rVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, rVar.getClass(), sb2).toString());
    }

    public static a1 O(sm.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f49179d;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, bVar.getClass(), sb2).toString());
    }

    public static a1 P(sm.c cVar) {
        if (cVar instanceof a1) {
            return pm.c.m((a1) cVar, false);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(cVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, cVar.getClass(), sb2).toString());
    }

    public static c0 Q(pm.n nVar) {
        if (nVar instanceof pm.n) {
            return nVar.f48462b;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(nVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, nVar.getClass(), sb2).toString());
    }

    public static int R(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return ((n0) receiver).getParameters().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static Set S(b bVar, sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        n0 n0VarC0 = bVar.C0(receiver);
        if (n0VarC0 instanceof dm.n) {
            return ((dm.n) n0VarC0).f38958a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static q0 T(cm.b receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof i) {
            return ((i) receiver).f49183a;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a U(b bVar, sm.d dVar) {
        if (dVar instanceof c0) {
            y yVar = (y) dVar;
            return new a(bVar, new w0(o0.f48464b.f(yVar.P(), yVar.t())));
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, dVar.getClass(), sb2).toString());
    }

    public static Collection V(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            Collection collectionF = ((n0) receiver).f();
            kotlin.jvm.internal.n.e(collectionF, "this.supertypes");
            return collectionF;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static n0 W(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return ((c0) receiver).P();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static i X(sm.b receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof h) {
            return ((h) receiver).f49178c;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static c0 Y(pm.r rVar) {
        if (rVar instanceof pm.r) {
            return rVar.f48471c;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(rVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, rVar.getClass(), sb2).toString());
    }

    public static c0 Z(sm.d receiver, boolean z10) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return ((c0) receiver).i0(z10);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static sm.c a0(b bVar, sm.c cVar) {
        if (cVar instanceof sm.d) {
            return bVar.M0((sm.d) cVar, true);
        }
        if (!(cVar instanceof pm.r)) {
            throw new IllegalStateException("sealed");
        }
        pm.r rVar = (pm.r) cVar;
        return bVar.k(bVar.M0(bVar.y(rVar), true), bVar.M0(bVar.C(rVar), true));
    }

    public static boolean b(sm.f c4, sm.f c5) {
        kotlin.jvm.internal.n.f(c4, "c1");
        kotlin.jvm.internal.n.f(c5, "c2");
        if (!(c4 instanceof n0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(c4);
            sb2.append(", ");
            throw new IllegalArgumentException(q4.a.k(d0.f44761a, c4.getClass(), sb2).toString());
        }
        if (c5 instanceof n0) {
            return c4.equals(c5);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(c5);
        sb3.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, c5.getClass(), sb3).toString());
    }

    public static int c(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            return ((y) receiver).t().size();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static sm.e d(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            return (sm.e) receiver;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static sm.b e(b bVar, sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            if (receiver instanceof f0) {
                return bVar.O0(((f0) receiver).f48429b);
            }
            if (receiver instanceof h) {
                return (h) receiver;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static pm.n f(sm.d receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof c0) {
            if (receiver instanceof pm.n) {
                return (pm.n) receiver;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static pm.r g(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            a1 a1VarB0 = ((y) receiver).b0();
            if (a1VarB0 instanceof pm.r) {
                return (pm.r) a1VarB0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static c0 h(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            a1 a1VarB0 = ((y) receiver).b0();
            if (a1VarB0 instanceof c0) {
                return (c0) a1VarB0;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static r0 i(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            return i0.d((y) receiver);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static c0 j(sm.d dVar) {
        ArrayList arrayList;
        e eVar;
        d5.u.n(1, "status");
        if (!(dVar instanceof c0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(dVar);
            sb2.append(", ");
            throw new IllegalArgumentException(q4.a.k(d0.f44761a, dVar.getClass(), sb2).toString());
        }
        c0 c0Var = (c0) dVar;
        nm.d dVar2 = null;
        if (c0Var.t().size() != c0Var.P().getParameters().size()) {
            arrayList = null;
        } else {
            List listT = c0Var.t();
            List list = listT;
            if ((list instanceof Collection) && list.isEmpty()) {
                arrayList = null;
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((q0) it.next()).a() != 1) {
                        List parameters = c0Var.P().getParameters();
                        kotlin.jvm.internal.n.e(parameters, "type.constructor.parameters");
                        ArrayList<wj.f> arrayListU0 = xj.n.U0(list, parameters);
                        arrayList = new ArrayList(xj.p.W(arrayListU0, 10));
                        for (wj.f fVar : arrayListU0) {
                            q0 q0VarD = (q0) fVar.f53283a;
                            m0 parameter = (m0) fVar.f53284b;
                            if (q0VarD.a() != 1) {
                                a1 a1VarB0 = (q0VarD.c() || q0VarD.a() != 2) ? null : q0VarD.b().b0();
                                kotlin.jvm.internal.n.e(parameter, "parameter");
                                q0VarD = i0.d(new h(1, new i(q0VarD, dVar2, parameter, 6), a1VarB0, (j0) null, false, 56));
                            }
                            arrayList.add(q0VarD);
                        }
                        w0 w0Var = new w0(o0.f48464b.f(c0Var.P(), arrayList));
                        int size = listT.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            q0 q0Var = (q0) listT.get(i10);
                            q0 q0Var2 = (q0) arrayList.get(i10);
                            if (q0Var.a() != 1) {
                                List upperBounds = ((m0) c0Var.P().getParameters().get(i10)).getUpperBounds();
                                kotlin.jvm.internal.n.e(upperBounds, "type.constructor.parameters[index].upperBounds");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = upperBounds.iterator();
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    eVar = e.f49174a;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    arrayList2.add(eVar.a(w0Var.g(1, (y) it2.next()).b0()));
                                }
                                if (!q0Var.c() && q0Var.a() == 3) {
                                    arrayList2.add(eVar.a(q0Var.b().b0()));
                                }
                                y yVarB = q0Var2.b();
                                kotlin.jvm.internal.n.d(yVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                i iVar = ((h) yVarB).f49178c;
                                iVar.getClass();
                                iVar.f49184b = new nm.d(arrayList2, 2);
                            }
                        }
                    }
                }
                arrayList = null;
            }
        }
        if (arrayList != null) {
            return pm.f.r(arrayList, c0Var.M(), c0Var.P(), c0Var.Q());
        }
        return null;
    }

    public static int k(sm.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f49177b;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, bVar.getClass(), sb2).toString());
    }

    public static pm.m0 l(boolean z10, e eVar, int i10) {
        if ((i10 & 8) != 0) {
            eVar = e.f49174a;
        }
        return new pm.m0(z10, true, m.f49193a, eVar, f.f49175a);
    }

    public static a1 m(b bVar, sm.d lowerBound, sm.d upperBound) {
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
        if (!(lowerBound instanceof c0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(bVar);
            sb2.append(", ");
            throw new IllegalArgumentException(q4.a.k(d0.f44761a, bVar.getClass(), sb2).toString());
        }
        if (upperBound instanceof c0) {
            return pm.f.j((c0) lowerBound, (c0) upperBound);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(bVar);
        sb3.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, bVar.getClass(), sb3).toString());
    }

    public static final String n(n0 n0Var) {
        StringBuilder sb2 = new StringBuilder();
        o(sb2, "type: " + n0Var);
        o(sb2, "hashCode: " + n0Var.hashCode());
        o(sb2, "javaClass: " + n0Var.getClass().getCanonicalName());
        for (zk.j jVarE = n0Var.e(); jVarE != null; jVarE = jVarE.e()) {
            o(sb2, "fqName: ".concat(am.h.f3706c.w(jVarE)));
            o(sb2, "javaClass: " + jVarE.getClass().getCanonicalName());
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void o(StringBuilder sb2, String str) {
        kotlin.jvm.internal.n.f(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    public static q0 p(sm.c receiver, int i10) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof y) {
            return (q0) ((y) receiver).t().get(i10);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static m0 q(sm.f receiver, int i10) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            Object obj = ((n0) receiver).getParameters().get(i10);
            kotlin.jvm.internal.n.e(obj, "this.parameters[index]");
            return (m0) obj;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static a1 r(q0 receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof q0) {
            return receiver.b().b0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static m0 s(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            zk.g gVarE = ((n0) receiver).e();
            if (gVarE instanceof m0) {
                return (m0) gVarE;
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static int t(q0 receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof q0) {
            int iA = receiver.a();
            d5.u.u(iA, "this.projectionKind");
            return j1.f.i(iA);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean u(sm.c receiver, yl.c fqName) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        kotlin.jvm.internal.n.f(fqName, "fqName");
        if (receiver instanceof y) {
            return ((y) receiver).getAnnotations().c(fqName);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean v(m0 m0Var, sm.f fVar) {
        if (fVar == null ? true : fVar instanceof n0) {
            return i0.Q(m0Var, (n0) fVar, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(m0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, m0Var.getClass(), sb2).toString());
    }

    public static boolean w(sm.d a8, sm.d b10) {
        kotlin.jvm.internal.n.f(a8, "a");
        kotlin.jvm.internal.n.f(b10, "b");
        if (!(a8 instanceof c0)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(a8);
            sb2.append(", ");
            throw new IllegalArgumentException(q4.a.k(d0.f44761a, a8.getClass(), sb2).toString());
        }
        if (b10 instanceof c0) {
            return ((c0) a8).t() == ((c0) b10).t();
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(b10);
        sb3.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, b10.getClass(), sb3).toString());
    }

    public static boolean x(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return wk.h.H((n0) receiver, wk.l.f53335a);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean y(sm.f receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        if (receiver instanceof n0) {
            return ((n0) receiver).e() instanceof zk.e;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, receiver.getClass(), sb2).toString());
    }

    public static boolean z(sm.f fVar) {
        if (fVar instanceof n0) {
            zk.g gVarE = ((n0) fVar).e();
            zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            return (eVar == null || eVar.j() != 1 || eVar.l0() == 3 || eVar.l0() == 4 || eVar.l0() == 5) ? false : true;
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar);
        sb2.append(", ");
        throw new IllegalArgumentException(q4.a.k(d0.f44761a, fVar.getClass(), sb2).toString());
    }
}
