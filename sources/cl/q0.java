package cl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class q0 extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zk.j jVar, q0 q0Var, al.j jVar2, yl.f fVar, int i10, zk.j0 j0Var) {
        super(i10, jVar2, fVar, jVar, q0Var, j0Var);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (jVar2 == null) {
            z0(1);
            throw null;
        }
        if (fVar == null) {
            z0(2);
            throw null;
        }
        if (i10 == 0) {
            z0(3);
            throw null;
        }
        if (j0Var != null) {
        } else {
            z0(4);
            throw null;
        }
    }

    public static q0 U0(c cVar, yl.f fVar, int i10, zk.j0 j0Var) {
        if (cVar == null) {
            z0(5);
            throw null;
        }
        if (fVar == null) {
            z0(7);
            throw null;
        }
        if (i10 == 0) {
            z0(8);
            throw null;
        }
        if (j0Var != null) {
            return new q0(cVar, null, al.i.f3645a, fVar, i10, j0Var);
        }
        z0(9);
        throw null;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                break;
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.y
    public y L0(int i10, al.j jVar, yl.f fVar, zk.j jVar2, zk.s sVar, zk.j0 j0Var) {
        if (jVar2 == null) {
            z0(25);
            throw null;
        }
        if (i10 == 0) {
            z0(26);
            throw null;
        }
        if (jVar == null) {
            z0(27);
            throw null;
        }
        q0 q0Var = (q0) sVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new q0(jVar2, q0Var, jVar, fVar, i10, j0Var);
    }

    @Override // cl.y, cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final q0 a() {
        q0 q0Var = (q0) super.a();
        if (q0Var != null) {
            return q0Var;
        }
        z0(24);
        throw null;
    }

    @Override // cl.y
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final q0 O0(z zVar, z zVar2, List list, List list2, List list3, pm.y yVar, int i10, il.o oVar) {
        if (list == null) {
            z0(14);
            throw null;
        }
        if (list2 == null) {
            z0(15);
            throw null;
        }
        if (list3 == null) {
            z0(16);
            throw null;
        }
        if (oVar != null) {
            return X0(zVar, zVar2, list, list2, list3, yVar, i10, oVar, null);
        }
        z0(17);
        throw null;
    }

    public q0 X0(z zVar, z zVar2, List list, List list2, List list3, pm.y yVar, int i10, il.o oVar, Map map) {
        if (list == null) {
            z0(19);
            throw null;
        }
        if (list2 == null) {
            z0(20);
            throw null;
        }
        if (list3 == null) {
            z0(21);
            throw null;
        }
        if (oVar == null) {
            z0(22);
            throw null;
        }
        super.O0(zVar, zVar2, list, list2, list3, yVar, i10, oVar);
        if (map != null && !map.isEmpty()) {
            this.C = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // cl.y, zk.s
    public zk.r v0() {
        return P0(pm.w0.f48482b);
    }
}
