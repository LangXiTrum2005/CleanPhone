package bm;

import cl.n0;
import cl.o0;
import cl.p0;
import cl.q0;
import cl.x0;
import cl.z;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import hn.u;
import il.o;
import im.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import nm.s;
import pm.c0;
import pm.r0;
import pm.y;
import zk.h0;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f5740a = new u("ResolutionAnchorProvider", 4);

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[0] = "enumClass";
                break;
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[0] = "descriptor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(zk.e eVar, LinkedHashSet linkedHashSet, n nVar, boolean z10) {
        for (zk.j jVar : a.a.r(nVar, im.f.f43169o, 2)) {
            if (jVar instanceof zk.e) {
                zk.e eVarJ0 = (zk.e) jVar;
                if (eVarJ0.f0()) {
                    yl.f name = eVarJ0.getName();
                    kotlin.jvm.internal.n.e(name, "descriptor.name");
                    zk.g gVarC = nVar.c(name, hl.b.f42408d);
                    eVarJ0 = gVarC instanceof zk.e ? (zk.e) gVarC : gVarC instanceof s ? ((s) gVarC).J0() : null;
                }
                if (eVarJ0 != null) {
                    int i10 = e.f5728a;
                    Iterator it = eVarJ0.n().f().iterator();
                    while (it.hasNext()) {
                        if (e.p((y) it.next(), eVar.a())) {
                            linkedHashSet.add(eVarJ0);
                            break;
                        }
                    }
                    if (z10) {
                        n nVarN = eVarJ0.N();
                        kotlin.jvm.internal.n.e(nVarN, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        c(eVar, linkedHashSet, nVarN, z10);
                    }
                }
            }
        }
    }

    public static z e(zk.b bVar, y yVar, yl.f fVar, al.j jVar, int i10) {
        if (bVar == null) {
            a(32);
            throw null;
        }
        if (jVar == null) {
            a(33);
            throw null;
        }
        if (yVar == null) {
            return null;
        }
        jm.a aVar = new jm.a(bVar, yVar, fVar);
        an.g gVar = yl.g.f54516a;
        return new z(bVar, aVar, jVar, yl.f.e("_context_receiver_" + i10));
    }

    public static o0 f(h0 h0Var, al.j jVar) {
        return l(h0Var, jVar, true, h0Var.c());
    }

    public static p0 g(h0 h0Var, al.j jVar) {
        j0 j0VarC = h0Var.c();
        if (j0VarC != null) {
            return m(h0Var, jVar, al.i.f3645a, true, h0Var.getVisibility(), j0VarC);
        }
        a(6);
        throw null;
    }

    public static n0 h(cl.c cVar) {
        if (cVar == null) {
            a(26);
            throw null;
        }
        zk.e eVarD = zk.u.d(e.d(cVar), yl.i.f54542t);
        if (eVarD == null) {
            return null;
        }
        o oVar = zk.n.f54978e;
        n0 n0VarK0 = n0.K0(cVar, 1, oVar, false, wk.m.f53364b, 4, cVar.c());
        o0 o0Var = new o0(n0VarK0, al.i.f3645a, 1, oVar, false, false, false, 4, null, cVar.c());
        n0VarK0.N0(o0Var, null, null, null);
        pm.j0.f48443b.getClass();
        pm.j0 attributes = pm.j0.f48444c;
        pm.n0 constructor = eVarD.n();
        List arguments = Collections.singletonList(new r0(1, cVar.g()));
        kotlin.jvm.internal.n.f(attributes, "attributes");
        kotlin.jvm.internal.n.f(constructor, "constructor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        c0 c0VarR = pm.f.r(arguments, attributes, constructor, false);
        List list = Collections.EMPTY_LIST;
        n0VarK0.Q0(c0VarR, list, null, null, list);
        o0Var.M0(n0VarK0.getReturnType());
        return n0VarK0;
    }

    public static q0 i(cl.c cVar) {
        if (cVar == null) {
            a(24);
            throw null;
        }
        q0 q0VarU0 = q0.U0(cVar, wk.m.f53365c, 4, cVar.c());
        x0 x0Var = new x0(q0VarU0, null, 0, al.i.f3645a, yl.f.e(X3.i.X), fm.e.e(cVar).u(), false, false, false, null, cVar.c());
        List list = Collections.EMPTY_LIST;
        return q0VarU0.O0(null, null, list, list, Collections.singletonList(x0Var), cVar.g(), 1, zk.n.f54978e);
    }

    public static q0 j(cl.c cVar) {
        if (cVar == null) {
            a(22);
            throw null;
        }
        q0 q0VarU0 = q0.U0(cVar, wk.m.f53363a, 4, cVar.c());
        List list = Collections.EMPTY_LIST;
        return q0VarU0.O0(null, null, list, list, list, fm.e.e(cVar).h(cVar.g()), 1, zk.n.f54978e);
    }

    public static z k(zk.b bVar, y yVar, al.j jVar) {
        if (yVar == null) {
            return null;
        }
        return new z(bVar, new jm.b(bVar, yVar), jVar);
    }

    public static o0 l(h0 h0Var, al.j jVar, boolean z10, j0 j0Var) {
        if (jVar == null) {
            a(18);
            throw null;
        }
        if (j0Var != null) {
            return new o0(h0Var, jVar, h0Var.j(), h0Var.getVisibility(), z10, false, false, 1, null, j0Var);
        }
        a(19);
        throw null;
    }

    public static p0 m(h0 h0Var, al.j jVar, al.j jVar2, boolean z10, o oVar, j0 j0Var) {
        if (jVar == null) {
            a(8);
            throw null;
        }
        if (jVar2 == null) {
            a(9);
            throw null;
        }
        if (oVar == null) {
            a(10);
            throw null;
        }
        if (j0Var == null) {
            a(11);
            throw null;
        }
        p0 p0Var = new p0(h0Var, jVar, h0Var.j(), oVar, z10, false, false, 1, null, j0Var);
        p0Var.f6585m = p0.L0(p0Var, h0Var.getType(), jVar2);
        return p0Var;
    }

    public static boolean n(zk.s sVar) {
        return sVar.getKind() == 4 && e.n(sVar.e(), 3);
    }

    public static final Collection o(Collection collection, jk.b bVar) {
        kotlin.jvm.internal.n.f(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        ym.i iVar = new ym.i();
        while (!linkedList.isEmpty()) {
            Object objO0 = xj.n.o0(linkedList);
            ym.i iVar2 = new ym.i();
            ArrayList arrayListG = l.g(objO0, linkedList, bVar, new al.f(iVar2, 2));
            if (arrayListG.size() == 1 && iVar2.isEmpty()) {
                Object objE0 = xj.n.E0(arrayListG);
                kotlin.jvm.internal.n.e(objE0, "overridableGroup.single()");
                iVar.add(objE0);
            } else {
                Object objS = l.s(arrayListG, bVar);
                zk.b bVar2 = (zk.b) bVar.invoke(objS);
                for (Object it : arrayListG) {
                    kotlin.jvm.internal.n.e(it, "it");
                    if (!l.k(bVar2, (zk.b) bVar.invoke(it))) {
                        iVar2.add(it);
                    }
                }
                if (!iVar2.isEmpty()) {
                    iVar.addAll(iVar2);
                }
                iVar.add(objS);
            }
        }
        return iVar;
    }

    public abstract void b(zk.c cVar);

    public abstract void d(zk.c cVar, zk.c cVar2);

    public void p(zk.c member, Collection collection) {
        kotlin.jvm.internal.n.f(member, "member");
        member.t0(collection);
    }
}
