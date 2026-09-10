package cl;

import com.ironsource.X3;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends p implements zk.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6659c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zk.j f6660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm.d f6661e;

    public z(zk.e eVar) {
        super(al.i.f3645a, yl.h.f54520d);
        this.f6660d = eVar;
        this.f6661e = new jm.c(eVar);
    }

    public static /* synthetic */ void A0(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = X3.i.X;
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void I0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zk.b
    public final List B() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        I0(7);
        throw null;
    }

    @Override // zk.b
    public final z G() {
        return null;
    }

    @Override // zk.b
    public final z J() {
        return null;
    }

    public final jm.d J0() {
        switch (this.f6659c) {
            case 0:
                jm.c cVar = (jm.c) this.f6661e;
                if (cVar != null) {
                    return cVar;
                }
                z0(1);
                throw null;
            default:
                al.b bVar = (al.b) this.f6661e;
                if (bVar != null) {
                    return bVar;
                }
                A0(7);
                throw null;
        }
    }

    @Override // zk.l0
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final z b(pm.w0 w0Var) {
        if (w0Var == null) {
            I0(3);
            throw null;
        }
        if (!w0Var.f48483a.e()) {
            pm.y yVarI = e() instanceof zk.e ? w0Var.i(3, getType()) : w0Var.i(1, getType());
            if (yVarI == null) {
                return null;
            }
            if (yVarI != getType()) {
                return new z(e(), new jm.e(yVarI), getAnnotations());
            }
        }
        return this;
    }

    @Override // cl.p, zk.j, zk.g
    public final zk.b a() {
        return this;
    }

    @Override // zk.b
    public final boolean a0() {
        return false;
    }

    @Override // zk.k
    public final zk.j0 c() {
        return zk.j0.C9;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.n(this, obj);
    }

    @Override // zk.j
    public final zk.j e() {
        switch (this.f6659c) {
            case 0:
                zk.e eVar = (zk.e) this.f6660d;
                if (eVar != null) {
                    return eVar;
                }
                z0(2);
                throw null;
            default:
                zk.j jVar = this.f6660d;
                if (jVar != null) {
                    return jVar;
                }
                A0(8);
                throw null;
        }
    }

    @Override // zk.b
    public final Collection f() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        I0(8);
        throw null;
    }

    @Override // zk.b
    public final pm.y getReturnType() {
        return getType();
    }

    @Override // al.b, jm.d
    public final pm.y getType() {
        pm.y type = J0().getType();
        if (type != null) {
            return type;
        }
        I0(6);
        throw null;
    }

    @Override // zk.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        I0(5);
        throw null;
    }

    @Override // zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = zk.n.f54979f;
        if (oVar != null) {
            return oVar;
        }
        I0(9);
        throw null;
    }

    @Override // cl.p
    public String toString() {
        switch (this.f6659c) {
            case 0:
                return "class " + ((zk.e) this.f6660d).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // cl.p, zk.j, zk.g
    public final zk.j a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(zk.j jVar, al.b bVar, al.j jVar2) {
        this(jVar, bVar, jVar2, yl.h.f54520d);
        if (jVar == null) {
            A0(0);
            throw null;
        }
        if (jVar2 != null) {
        } else {
            A0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(zk.j jVar, al.b bVar, al.j jVar2, yl.f fVar) {
        super(jVar2, fVar);
        if (jVar == null) {
            A0(3);
            throw null;
        }
        if (jVar2 == null) {
            A0(5);
            throw null;
        }
        if (fVar != null) {
            this.f6660d = jVar;
            this.f6661e = bVar;
            return;
        }
        A0(6);
        throw null;
    }
}
