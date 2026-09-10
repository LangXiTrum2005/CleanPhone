package cl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f6488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm.w0 f6489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pm.w0 f6490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f6491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f6492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pm.k f6493f;

    public c0(d0 d0Var, pm.w0 w0Var) {
        this.f6488a = d0Var;
        this.f6489b = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void s(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[1] = "getSource";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // zk.e
    public final im.n E(pm.t0 t0Var) {
        fm.e.i(bm.e.d(this));
        return k(t0Var, qm.f.f49175a);
    }

    @Override // zk.e
    public final im.n N() {
        im.n nVarN = this.f6488a.N();
        if (nVarN != null) {
            return nVarN;
        }
        s(28);
        throw null;
    }

    @Override // zk.e
    public final zk.n0 O() {
        zk.n0 n0VarO = this.f6488a.O();
        if (n0VarO == null) {
            return null;
        }
        boolean z10 = n0VarO instanceof zk.t;
        pm.w0 w0Var = this.f6489b;
        if (z10) {
            zk.t tVar = (zk.t) n0VarO;
            yl.f fVar = tVar.f54998a;
            pm.c0 c0Var = (pm.c0) tVar.f54999b;
            if (c0Var != null && !w0Var.f48483a.e()) {
                c0Var = (pm.c0) t().i(1, c0Var);
            }
            return new zk.t(fVar, c0Var);
        }
        if (!(n0VarO instanceof zk.x)) {
            throw new aa.b((byte) 0, 20);
        }
        ArrayList<wj.f> arrayList = ((zk.x) n0VarO).f55005a;
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        for (wj.f fVar2 : arrayList) {
            yl.f fVar3 = (yl.f) fVar2.f53283a;
            pm.c0 c0Var2 = (pm.c0) ((sm.d) fVar2.f53284b);
            if (c0Var2 != null && !w0Var.f48483a.e()) {
                c0Var2 = (pm.c0) t().i(1, c0Var2);
            }
            arrayList2.add(new wj.f(fVar3, c0Var2));
        }
        return new zk.x(arrayList2);
    }

    @Override // zk.e
    public final im.n R() {
        fm.e.i(bm.e.d(this.f6488a));
        return o(qm.f.f49175a);
    }

    @Override // zk.v
    public final boolean S() {
        return this.f6488a.S();
    }

    @Override // zk.e
    public final List T() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s(17);
        throw null;
    }

    @Override // zk.e
    public final boolean W() {
        return this.f6488a.W();
    }

    @Override // zk.e
    public final boolean Y() {
        return this.f6488a.Y();
    }

    @Override // cl.d0, zk.e, zk.j, zk.g
    public final zk.e a() {
        zk.e eVarA = this.f6488a.a();
        if (eVarA != null) {
            return eVarA;
        }
        s(21);
        throw null;
    }

    @Override // zk.l0
    public final zk.k b(pm.w0 w0Var) {
        if (w0Var != null) {
            return w0Var.f48483a.e() ? this : new c0(this, pm.w0.e(w0Var.f(), t().f()));
        }
        s(23);
        throw null;
    }

    @Override // zk.k
    public final zk.j0 c() {
        return zk.j0.C9;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.e(this, obj);
    }

    @Override // zk.j
    public final zk.j e() {
        zk.j jVarE = this.f6488a.e();
        if (jVarE != null) {
            return jVarE;
        }
        s(22);
        throw null;
    }

    @Override // zk.e
    public final boolean e0() {
        return this.f6488a.e0();
    }

    @Override // zk.v
    public final boolean f0() {
        return this.f6488a.f0();
    }

    @Override // zk.e, zk.g
    public final pm.c0 g() {
        pm.j0 j0VarG;
        List listD = pm.y0.d(n().getParameters());
        al.j annotations = getAnnotations();
        if (annotations.isEmpty()) {
            pm.j0.f48443b.getClass();
            j0VarG = pm.j0.f48444c;
        } else {
            s1 s1Var = pm.j0.f48443b;
            List listC = j1.f.C(new pm.i(annotations));
            s1Var.getClass();
            j0VarG = s1.g(listC);
        }
        return pm.f.s(R(), listD, j0VarG, n(), false);
    }

    @Override // zk.e
    public final im.n g0() {
        im.n nVarG0 = this.f6488a.g0();
        if (nVarG0 != null) {
            return nVarG0;
        }
        s(15);
        throw null;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        al.j annotations = this.f6488a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        s(19);
        throw null;
    }

    @Override // zk.j
    public final yl.f getName() {
        yl.f name = this.f6488a.getName();
        if (name != null) {
            return name;
        }
        s(20);
        throw null;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        il.o visibility = this.f6488a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        s(27);
        throw null;
    }

    @Override // zk.e, zk.h
    public final List i() {
        t();
        ArrayList arrayList = this.f6492e;
        if (arrayList != null) {
            return arrayList;
        }
        s(30);
        throw null;
    }

    @Override // zk.v
    public final boolean isExternal() {
        return this.f6488a.isExternal();
    }

    @Override // zk.e
    public final boolean isInline() {
        return this.f6488a.isInline();
    }

    @Override // zk.e, zk.v
    public final int j() {
        int iJ = this.f6488a.j();
        if (iJ != 0) {
            return iJ;
        }
        s(26);
        throw null;
    }

    @Override // cl.d0
    public final im.n k(pm.t0 t0Var, qm.f fVar) {
        im.n nVarK = this.f6488a.k(t0Var, fVar);
        if (!this.f6489b.f48483a.e()) {
            return new im.s(nVarK, t());
        }
        if (nVarK != null) {
            return nVarK;
        }
        s(7);
        throw null;
    }

    @Override // zk.e
    public final int l0() {
        int iL0 = this.f6488a.l0();
        if (iL0 != 0) {
            return iL0;
        }
        s(25);
        throw null;
    }

    @Override // zk.g
    public final pm.n0 n() {
        pm.n0 n0VarN = this.f6488a.n();
        if (this.f6489b.f48483a.e()) {
            if (n0VarN != null) {
                return n0VarN;
            }
            s(0);
            throw null;
        }
        if (this.f6493f == null) {
            pm.w0 w0VarT = t();
            Collection collectionF = n0VarN.f();
            ArrayList arrayList = new ArrayList(collectionF.size());
            Iterator it = collectionF.iterator();
            while (it.hasNext()) {
                arrayList.add(w0VarT.i(1, (pm.y) it.next()));
            }
            this.f6493f = new pm.k(this, this.f6491d, arrayList, om.l.f47582e);
        }
        pm.k kVar = this.f6493f;
        if (kVar != null) {
            return kVar;
        }
        s(1);
        throw null;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        im.n nVarO = this.f6488a.o(fVar);
        if (!this.f6489b.f48483a.e()) {
            return new im.s(nVarO, t());
        }
        if (nVarO != null) {
            return nVarO;
        }
        s(14);
        throw null;
    }

    @Override // zk.e
    public final Collection p() {
        Collection<l> collectionP = this.f6488a.p();
        ArrayList arrayList = new ArrayList(collectionP.size());
        for (l lVar : collectionP) {
            l lVar2 = lVar;
            lVar2.getClass();
            x xVarP0 = lVar2.P0(pm.w0.f48482b);
            xVarP0.f6612e = lVar.I0();
            xVarP0.q(lVar2.j());
            xVarP0.y(lVar2.getVisibility());
            xVarP0.e(lVar2.getKind());
            xVarP0.f6619m = false;
            arrayList.add(((l) xVarP0.f6630x.M0(xVarP0)).b(t()));
        }
        return arrayList;
    }

    @Override // zk.e
    public final Collection r() {
        Collection collectionR = this.f6488a.r();
        if (collectionR != null) {
            return collectionR;
        }
        s(31);
        throw null;
    }

    public final pm.w0 t() {
        if (this.f6490c == null) {
            pm.w0 w0Var = this.f6489b;
            if (w0Var.f48483a.e()) {
                this.f6490c = w0Var;
            } else {
                List parameters = this.f6488a.n().getParameters();
                this.f6491d = new ArrayList(parameters.size());
                this.f6490c = pm.c.v(parameters, w0Var.f(), this, this.f6491d);
                ArrayList arrayList = this.f6491d;
                kotlin.jvm.internal.n.f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((zk.m0) obj).L()) {
                        arrayList2.add(obj);
                    }
                }
                this.f6492e = arrayList2;
            }
        }
        return this.f6490c;
    }

    @Override // zk.h
    public final boolean u() {
        return this.f6488a.u();
    }

    @Override // zk.e
    public final boolean x0() {
        return this.f6488a.x0();
    }

    @Override // zk.e
    public final l y() {
        return this.f6488a.y();
    }

    @Override // zk.e
    public final z y0() {
        throw new UnsupportedOperationException();
    }
}
