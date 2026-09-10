package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends y implements zk.i {
    public final boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zk.e eVar, zk.i iVar, al.j jVar, boolean z10, int i10, zk.j0 j0Var) {
        super(i10, jVar, yl.h.f54521e, eVar, iVar, j0Var);
        if (eVar == null) {
            z0(0);
            throw null;
        }
        if (jVar == null) {
            z0(1);
            throw null;
        }
        if (i10 == 0) {
            z0(2);
            throw null;
        }
        if (j0Var == null) {
            z0(3);
            throw null;
        }
        this.D = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
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
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 21 && i10 != 27) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.y
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public l L0(int i10, al.j jVar, yl.f fVar, zk.j jVar2, zk.s sVar, zk.j0 j0Var) {
        if (jVar2 == null) {
            z0(23);
            throw null;
        }
        if (i10 == 0) {
            z0(24);
            throw null;
        }
        if (jVar == null) {
            z0(25);
            throw null;
        }
        if (i10 == 1 || i10 == 4) {
            return new l((zk.e) jVar2, this, jVar, this.D, 1, j0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + jVar2 + "\nkind: " + wi.d.p(i10));
    }

    @Override // cl.y, zk.c
    public final zk.c V(zk.e eVar, int i10, il.o oVar) {
        return (l) K0(eVar, i10, oVar);
    }

    @Override // cl.q, zk.j
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final zk.e e() {
        zk.e eVar = (zk.e) super.e();
        if (eVar != null) {
            return eVar;
        }
        z0(17);
        throw null;
    }

    @Override // cl.y, cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l a() {
        l lVar = (l) super.a();
        if (lVar != null) {
            return lVar;
        }
        z0(19);
        throw null;
    }

    @Override // zk.i
    public final zk.e X() {
        zk.e eVarE = e();
        if (eVarE != null) {
            return eVarE;
        }
        z0(18);
        throw null;
    }

    public final void X0(List list, il.o oVar) {
        if (list == null) {
            z0(13);
            throw null;
        }
        if (oVar != null) {
            Y0(list, oVar, e().i());
        } else {
            z0(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void Y0(List list, il.o oVar, List list2) {
        z zVarY0;
        List listT;
        if (list == null) {
            z0(10);
            throw null;
        }
        if (oVar == null) {
            z0(11);
            throw null;
        }
        if (list2 == null) {
            z0(12);
            throw null;
        }
        zk.e eVarE = e();
        if (eVarE.u()) {
            zk.j jVarE = eVarE.e();
            if (jVarE instanceof zk.e) {
                zVarY0 = ((zk.e) jVarE).y0();
            } else {
                zVarY0 = null;
            }
        } else {
            zVarY0 = null;
        }
        zk.e eVarE2 = e();
        if (eVarE2.T().isEmpty()) {
            listT = Collections.EMPTY_LIST;
            if (listT == null) {
                z0(16);
                throw null;
            }
        } else {
            listT = eVarE2.T();
            if (listT == null) {
                z0(15);
                throw null;
            }
        }
        O0(null, zVarY0, listT, list2, list, null, 1, oVar);
    }

    @Override // cl.y, zk.s, zk.l0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final l b(pm.w0 w0Var) {
        if (w0Var != null) {
            return (l) super.b(w0Var);
        }
        z0(20);
        throw null;
    }

    @Override // cl.y, zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.j(this, obj);
    }

    @Override // cl.y, zk.c, zk.b
    public final Collection f() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        z0(21);
        throw null;
    }

    @Override // cl.y, zk.c
    public final void t0(Collection collection) {
        if (collection != null) {
            return;
        }
        z0(22);
        throw null;
    }
}
