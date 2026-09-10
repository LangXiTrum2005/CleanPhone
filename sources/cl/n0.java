package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class n0 extends y0 implements zk.h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public om.h f6561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jk.a f6562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public il.o f6564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Collection f6565k;
    public final zk.h0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f6572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f6573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z f6574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f6575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o0 f6576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p0 f6577x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w f6578y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public w f6579z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(zk.j jVar, zk.h0 h0Var, al.j jVar2, int i10, il.o oVar, boolean z10, yl.f fVar, int i11, zk.j0 j0Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(jVar, jVar2, fVar, null, j0Var);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (jVar2 == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (oVar == null) {
            z0(3);
            throw null;
        }
        if (fVar == null) {
            z0(4);
            throw null;
        }
        if (i11 == 0) {
            z0(5);
            throw null;
        }
        if (j0Var == null) {
            z0(6);
            throw null;
        }
        this.f6560f = z10;
        this.f6565k = null;
        this.f6572s = Collections.EMPTY_LIST;
        this.f6563i = i10;
        this.f6564j = oVar;
        this.l = h0Var == null ? this : h0Var;
        this.f6566m = i11;
        this.f6567n = z11;
        this.f6568o = z12;
        this.f6569p = z13;
        this.f6570q = z14;
        this.f6571r = z15;
    }

    public static n0 K0(zk.j jVar, int i10, il.o oVar, boolean z10, yl.f fVar, int i11, zk.j0 j0Var) {
        if (jVar == null) {
            z0(7);
            throw null;
        }
        if (i10 == 0) {
            z0(9);
            throw null;
        }
        if (oVar == null) {
            z0(10);
            throw null;
        }
        if (fVar == null) {
            z0(11);
            throw null;
        }
        if (i11 == 0) {
            z0(12);
            throw null;
        }
        if (j0Var != null) {
            return new n0(jVar, null, al.i.f3645a, i10, oVar, z10, fVar, i11, j0Var, false, false, false, false, false);
        }
        z0(13);
        throw null;
    }

    public static zk.s M0(pm.w0 w0Var, zk.g0 g0Var) {
        if (g0Var == null) {
            z0(31);
            throw null;
        }
        zk.s sVar = ((l0) g0Var).l;
        if (sVar != null) {
            return sVar.b(w0Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[0] = "copyConfiguration";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i10 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i10 == 38) {
            objArr[1] = "getOriginal";
        } else if (i10 == 39) {
            objArr[1] = "getKind";
        } else if (i10 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 42) {
            switch (i10) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[2] = "doSubstitute";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 28 && i10 != 38 && i10 != 39 && i10 != 41 && i10 != 42) {
            switch (i10) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.y0, zk.b
    public final z G() {
        return this.f6573t;
    }

    @Override // zk.p0
    public final boolean I() {
        return this.f6560f;
    }

    @Override // cl.y0, zk.b
    public final z J() {
        return this.f6574u;
    }

    @Override // zk.c
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public final n0 V(zk.j jVar, int i10, il.o oVar) {
        m0 m0Var = new m0(this);
        if (jVar == null) {
            m0.a(0);
            throw null;
        }
        m0Var.f6544a = jVar;
        m0Var.f6547d = null;
        if (i10 == 0) {
            m0.a(6);
            throw null;
        }
        m0Var.f6545b = i10;
        if (oVar == null) {
            m0.a(8);
            throw null;
        }
        m0Var.f6546c = oVar;
        m0Var.f6548e = 2;
        m0Var.f6550g = false;
        n0 n0VarB = m0Var.b();
        if (n0VarB != null) {
            return n0VarB;
        }
        z0(42);
        throw null;
    }

    @Override // zk.h0
    public final w K() {
        return this.f6579z;
    }

    public n0 L0(zk.j jVar, int i10, il.o oVar, zk.h0 h0Var, int i11, yl.f fVar) {
        if (jVar == null) {
            z0(32);
            throw null;
        }
        if (i10 == 0) {
            z0(33);
            throw null;
        }
        if (oVar == null) {
            z0(34);
            throw null;
        }
        if (i11 == 0) {
            z0(35);
            throw null;
        }
        if (fVar == null) {
            z0(36);
            throw null;
        }
        return new n0(jVar, h0Var, getAnnotations(), i10, oVar, this.f6560f, fVar, i11, zk.j0.C9, this.f6567n, isConst(), this.f6569p, isExternal(), this.f6571r);
    }

    public final void N0(o0 o0Var, p0 p0Var, w wVar, w wVar2) {
        this.f6576w = o0Var;
        this.f6577x = p0Var;
        this.f6578y = wVar;
        this.f6579z = wVar2;
    }

    public final void O0(om.h hVar, jk.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f6562h = aVar;
        if (hVar == null) {
            hVar = (om.h) aVar.invoke();
        }
        this.f6561g = hVar;
    }

    public final void Q0(pm.y yVar, List list, z zVar, z zVar2, List list2) {
        if (yVar == null) {
            z0(17);
            throw null;
        }
        if (list == null) {
            z0(18);
            throw null;
        }
        if (list2 == null) {
            z0(19);
            throw null;
        }
        this.f6658e = yVar;
        this.f6575v = new ArrayList(list);
        this.f6574u = zVar2;
        this.f6573t = zVar;
        this.f6572s = list2;
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.r(this, obj);
    }

    @Override // zk.b
    public Object d0(zk.a aVar) {
        return null;
    }

    @Override // zk.b
    public final Collection f() {
        Collection collection = this.f6565k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        z0(41);
        throw null;
    }

    @Override // zk.v
    public final boolean f0() {
        return this.f6569p;
    }

    @Override // zk.h0
    public final o0 getGetter() {
        return this.f6576w;
    }

    @Override // zk.c
    public final int getKind() {
        int i10 = this.f6566m;
        if (i10 != 0) {
            return i10;
        }
        z0(39);
        throw null;
    }

    @Override // cl.y0, zk.b
    public final pm.y getReturnType() {
        pm.y type = getType();
        if (type != null) {
            return type;
        }
        z0(23);
        throw null;
    }

    @Override // zk.h0
    public final p0 getSetter() {
        return this.f6577x;
    }

    @Override // cl.y0, zk.b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f6575v;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(p.H0(this)));
    }

    @Override // zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = this.f6564j;
        if (oVar != null) {
            return oVar;
        }
        z0(25);
        throw null;
    }

    @Override // zk.p0
    public final dm.g h0() {
        om.h hVar = this.f6561g;
        if (hVar != null) {
            return (dm.g) hVar.invoke();
        }
        return null;
    }

    @Override // zk.p0
    public boolean isConst() {
        return this.f6568o;
    }

    @Override // zk.v
    public boolean isExternal() {
        return this.f6570q;
    }

    @Override // zk.v
    public final int j() {
        int i10 = this.f6563i;
        if (i10 != 0) {
            return i10;
        }
        z0(24);
        throw null;
    }

    @Override // zk.h0
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList(2);
        o0 o0Var = this.f6576w;
        if (o0Var != null) {
            arrayList.add(o0Var);
        }
        p0 p0Var = this.f6577x;
        if (p0Var != null) {
            arrayList.add(p0Var);
        }
        return arrayList;
    }

    @Override // zk.h0
    public final w o0() {
        return this.f6578y;
    }

    @Override // zk.b
    public final List p0() {
        List list = this.f6572s;
        if (list != null) {
            return list;
        }
        z0(22);
        throw null;
    }

    @Override // zk.p0
    public final boolean q0() {
        return this.f6567n;
    }

    @Override // zk.c
    public final void t0(Collection collection) {
        if (collection != null) {
            this.f6565k = collection;
        } else {
            z0(40);
            throw null;
        }
    }

    @Override // zk.h0
    public final boolean w() {
        return this.f6571r;
    }

    @Override // zk.l0
    public final zk.h0 b(pm.w0 w0Var) {
        if (w0Var == null) {
            z0(27);
            throw null;
        }
        if (w0Var.f48483a.e()) {
            return this;
        }
        m0 m0Var = new m0(this);
        pm.t0 t0VarF = w0Var.f();
        if (t0VarF == null) {
            m0.a(15);
            throw null;
        }
        m0Var.f6549f = t0VarF;
        m0Var.f6547d = a();
        return m0Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zk.h0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.h0 a() {
        zk.h0 h0VarA;
        zk.h0 h0Var = this.l;
        ?? r2 = this;
        if (h0Var != this) {
            h0VarA = h0Var.a();
        }
        if (r2 != 0) {
            r2 = h0VarA;
            return r2;
        }
        r2 = h0VarA;
        z0(38);
        throw null;
    }

    public void P0(pm.y yVar) {
    }
}
