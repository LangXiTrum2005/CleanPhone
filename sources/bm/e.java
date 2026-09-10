package bm;

import cl.b0;
import cl.h0;
import cl.p0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import pm.n0;
import pm.y;
import zk.e0;
import zk.k0;
import zk.n;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5728a = 0;

    static {
        new yl.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 60:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 60:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 96:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 60:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[0] = "subClass";
                break;
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case 33:
                objArr[0] = "superClass";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 41:
            case 44:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                objArr[0] = "typeConstructor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                objArr[0] = "innerClassName";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                objArr[1] = "getSuperClassType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                objArr[1] = "getFunctionByName";
                break;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 60:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[2] = "isSubclass";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                objArr[2] = "getInnerClassByName";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                objArr[2] = "isStaticNestedClass";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                objArr[2] = "unwrapFakeOverride";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 60:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(zk.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.a().f().iterator();
        while (it.hasNext()) {
            zk.b bVarA = ((zk.b) it.next()).a();
            b(bVarA, linkedHashSet);
            linkedHashSet.add(bVarA);
        }
    }

    public static zk.e c(y yVar) {
        if (yVar == null) {
            a(45);
            throw null;
        }
        n0 n0VarP = yVar.P();
        if (n0VarP == null) {
            a(46);
            throw null;
        }
        zk.e eVar = (zk.e) n0VarP.e();
        if (eVar != null) {
            return eVar;
        }
        a(47);
        throw null;
    }

    public static w d(zk.j jVar) {
        if (jVar == null) {
            a(21);
            throw null;
        }
        w wVarE = e(jVar);
        if (wVarE != null) {
            return wVarE;
        }
        a(22);
        throw null;
    }

    public static w e(zk.j jVar) {
        if (jVar == null) {
            a(23);
            throw null;
        }
        while (jVar != null) {
            if (jVar instanceof w) {
                return (w) jVar;
            }
            if (jVar instanceof e0) {
                return ((b0) ((e0) jVar)).f6479c;
            }
            jVar = jVar.e();
        }
        return null;
    }

    public static k0 f(zk.j jVar) {
        k0 k0Var = k0.f54971b;
        if (jVar == null) {
            a(82);
            throw null;
        }
        if (jVar instanceof p0) {
            jVar = ((p0) jVar).J0();
        }
        if (jVar instanceof zk.k) {
            ((zk.k) jVar).c().getClass();
        }
        return k0Var;
    }

    public static yl.e g(zk.j jVar) {
        if (jVar != null) {
            yl.c cVarH = h(jVar);
            return cVarH != null ? cVarH.i() : g(jVar.e()).b(jVar.getName());
        }
        a(2);
        throw null;
    }

    public static yl.c h(zk.j jVar) {
        if (jVar == null) {
            a(5);
            throw null;
        }
        if ((jVar instanceof w) || rm.i.f(jVar)) {
            return yl.c.f54504c;
        }
        if (jVar instanceof e0) {
            return ((b0) ((e0) jVar)).f6480d;
        }
        if (jVar instanceof zk.b0) {
            return ((h0) ((zk.b0) jVar)).f6518e;
        }
        return null;
    }

    public static zk.j i(zk.j jVar, Class cls, boolean z10) {
        if (jVar == null) {
            return null;
        }
        if (z10) {
            jVar = jVar.e();
        }
        while (jVar != null) {
            if (cls.isInstance(jVar)) {
                return jVar;
            }
            jVar = jVar.e();
        }
        return null;
    }

    public static zk.e j(zk.e eVar) {
        if (eVar == null) {
            a(44);
            throw null;
        }
        Iterator it = eVar.n().f().iterator();
        while (it.hasNext()) {
            zk.e eVarC = c((y) it.next());
            if (eVarC.l0() != 2) {
                return eVarC;
            }
        }
        return null;
    }

    public static boolean k(zk.j jVar) {
        return n(jVar, 1) && jVar.getName().equals(yl.h.f54517a);
    }

    public static boolean l(zk.j jVar) {
        return n(jVar, 6) && ((zk.e) jVar).W();
    }

    public static boolean m(zk.j jVar) {
        if (jVar != null) {
            return n(jVar, 4);
        }
        a(36);
        throw null;
    }

    public static boolean n(zk.j jVar, int i10) {
        if (i10 != 0) {
            return (jVar instanceof zk.e) && ((zk.e) jVar).l0() == i10;
        }
        a(37);
        throw null;
    }

    public static boolean o(zk.j jVar) {
        if (jVar == null) {
            a(1);
            throw null;
        }
        while (jVar != null) {
            if (k(jVar) || ((jVar instanceof zk.m) && ((zk.m) jVar).getVisibility() == n.f54979f)) {
                return true;
            }
            jVar = jVar.e();
        }
        return false;
    }

    public static boolean p(y yVar, zk.j jVar) {
        if (yVar == null) {
            a(30);
            throw null;
        }
        if (jVar == null) {
            a(31);
            throw null;
        }
        zk.g gVarE = yVar.P().e();
        if (gVarE == null) {
            return false;
        }
        zk.j jVarA = gVarE.a();
        return (jVarA instanceof zk.g) && (jVar instanceof zk.g) && ((zk.g) jVar).n().equals(((zk.g) jVarA).n());
    }

    public static boolean q(zk.j jVar) {
        return (n(jVar, 1) || n(jVar, 2)) && ((zk.e) jVar).j() == 2;
    }

    public static boolean r(y yVar, zk.j jVar) {
        if (yVar == null) {
            a(32);
            throw null;
        }
        if (jVar == null) {
            a(33);
            throw null;
        }
        if (p(yVar, jVar)) {
            return true;
        }
        Iterator it = yVar.P().f().iterator();
        while (it.hasNext()) {
            if (r((y) it.next(), jVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(zk.j jVar) {
        return jVar != null && (jVar.e() instanceof zk.b0);
    }

    public static zk.c t(zk.c cVar) {
        if (cVar == null) {
            a(59);
            throw null;
        }
        while (cVar.getKind() == 2) {
            Collection collectionF = cVar.f();
            if (collectionF.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + cVar);
            }
            cVar = (zk.c) collectionF.iterator().next();
        }
        return cVar;
    }
}
