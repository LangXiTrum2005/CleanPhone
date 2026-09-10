package bm;

import cl.l0;
import cl.n0;
import cl.p0;
import cl.x0;
import cl.z;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import eb.d0;
import il.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import pm.m0;
import pm.y;
import xj.n;
import xj.p;
import zk.g0;
import zk.h0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f5736b = n.N0(ServiceLoader.load(f.class, f.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f5737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5738d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm.c f5739a;

    static {
        c cVar = new c();
        f5738d = cVar;
        f5737c = new l(cVar);
    }

    public l(qm.c cVar) {
        if (cVar != null) {
            this.f5739a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                objArr[0] = "secondParameters";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                objArr[0] = "typeInSuper";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                objArr[0] = "typeInSub";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                objArr[0] = "name";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                objArr[0] = "membersFromSupertypes";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                objArr[0] = "membersFromCurrent";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 64:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 96:
                objArr[0] = "current";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = X3.f.f27739e;
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                objArr[0] = "overriding";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                objArr[0] = "fromSuper";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case InterfaceC0435l1.d.b.f29110g /* 109 */:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
                objArr[0] = "descriptorByHandle";
                break;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case InterfaceC0435l1.d.b.f29108e /* 104 */:
                objArr[0] = "overrider";
                break;
            case 100:
            case InterfaceC0435l1.d.b.f29109f /* 105 */:
                objArr[0] = "extractFrom";
                break;
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                objArr[2] = "createTypeCheckerState";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                objArr[2] = "areTypesEquivalent";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                objArr[2] = "isVisibleForOverride";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
            case InterfaceC0435l1.d.b.f29108e /* 104 */:
            case InterfaceC0435l1.d.b.f29109f /* 105 */:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case InterfaceC0435l1.d.b.f29110g /* 109 */:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(y yVar, y yVar2, m0 m0Var) {
        if (yVar == null) {
            a(46);
            throw null;
        }
        if (yVar2 == null) {
            a(47);
            throw null;
        }
        if (pm.c.j(yVar) && pm.c.j(yVar2)) {
            return true;
        }
        return pm.f.g(m0Var, yVar.b0(), yVar2.b0());
    }

    public static void c(zk.c cVar, LinkedHashSet linkedHashSet) {
        if (cVar == null) {
            a(17);
            throw null;
        }
        if (cVar.getKind() != 2) {
            linkedHashSet.add(cVar);
            return;
        }
        if (cVar.f().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + cVar);
        }
        Iterator it = cVar.f().iterator();
        while (it.hasNext()) {
            c((zk.c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(zk.b bVar) {
        z zVarJ = bVar.J();
        ArrayList arrayList = new ArrayList();
        if (zVarJ != null) {
            arrayList.add(zVarJ.getType());
        }
        Iterator it = bVar.B().iterator();
        while (it.hasNext()) {
            arrayList.add(((x0) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, zk.e eVar, m mVar) {
        if (collection == null) {
            a(85);
            throw null;
        }
        if (eVar == null) {
            a(86);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            int iJ = 1;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        if (eVar.f0() && eVar.j() != 4 && eVar.j() != 2) {
                            z10 = true;
                        }
                        if (z11 && !z12) {
                            iJ = 3;
                            break;
                        }
                        if (!z11 && z12) {
                            iJ = z10 ? eVar.j() : 4;
                            if (iJ != 0) {
                                break;
                            }
                            a(92);
                            throw null;
                        }
                        HashSet<zk.c> hashSet = new HashSet();
                        for (zk.c cVar : collection) {
                            if (cVar == null) {
                                a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c(cVar, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty() && fm.e.j((zk.j) hashSet.iterator().next()).n0(qm.g.f49176a) != null) {
                            throw new ClassCastException();
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    zk.b bVar = (zk.b) obj;
                                    zk.b bVar2 = (zk.b) it3.next();
                                    if (!q(bVar, bVar2)) {
                                        if (q(bVar2, bVar)) {
                                            break;
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        int iJ2 = eVar.j();
                        if (iJ2 == 0) {
                            a(94);
                            throw null;
                        }
                        iJ = 4;
                        for (zk.c cVar2 : hashSet) {
                            int iJ3 = (z10 && cVar2.j() == 4) ? iJ2 : cVar2.j();
                            if (v0.i.a(iJ3, iJ) < 0) {
                                iJ = iJ3;
                            }
                        }
                        if (iJ != 0) {
                            break;
                        }
                        a(95);
                        throw null;
                    }
                    zk.c cVar3 = (zk.c) it2.next();
                    int iC = v0.i.c(cVar3.j());
                    if (iC == 0) {
                        break;
                    }
                    if (iC == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + cVar3);
                    }
                    if (iC == 2) {
                        z11 = true;
                    } else if (iC == 3) {
                        z12 = true;
                    }
                }
                zk.c cVarV = ((zk.c) s(collection, new i(0))).V(eVar, iJ, zIsEmpty ? zk.n.f54981h : zk.n.f54980g);
                mVar.p(cVarV, collection);
                mVar.b(cVarV);
                return;
            }
            Object next = it.next();
            zk.c cVar4 = (zk.c) next;
            if (!zk.n.e(cVar4.getVisibility())) {
                if (cVar4 == null) {
                    zk.n.a(2);
                    throw null;
                }
                if (eVar == null) {
                    zk.n.a(3);
                    throw null;
                }
                if (zk.n.c(zk.n.l, cVar4, eVar) == null) {
                    z10 = true;
                }
            }
            if (z10) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, jk.b bVar, jk.b bVar2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        zk.b bVar3 = (zk.b) bVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            zk.b bVar4 = (zk.b) bVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(bVar3, bVar4);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    bVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static k i(zk.b bVar, zk.b bVar2) {
        boolean z10;
        k kVarD;
        if (bVar == null) {
            a(40);
            throw null;
        }
        if (bVar2 == null) {
            a(41);
            throw null;
        }
        boolean z11 = bVar instanceof s;
        if ((z11 && !(bVar2 instanceof s)) || (((z10 = bVar instanceof h0)) && !(bVar2 instanceof h0))) {
            return k.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return k.d("Name mismatch");
        }
        if ((bVar.J() == null) != (bVar2.J() == null)) {
            kVarD = k.d("Receiver presence mismatch");
        } else {
            kVarD = bVar.B().size() != bVar2.B().size() ? k.d("Value parameter number mismatch") : null;
        }
        if (kVarD != null) {
            return kVarD;
        }
        return null;
    }

    public static int j(zk.b bVar, zk.b bVar2) {
        l lVar = f5737c;
        int iC = lVar.l(bVar2, bVar, null).c();
        int iC2 = lVar.m(bVar, bVar2, null, false).c();
        if (iC == 1 && iC2 == 1) {
            return 1;
        }
        return (iC == 3 || iC2 == 3) ? 3 : 2;
    }

    public static boolean k(zk.b bVar, zk.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 == null) {
            a(68);
            throw null;
        }
        y returnType = bVar.getReturnType();
        y returnType2 = bVar2.getReturnType();
        if (!p(bVar, bVar2)) {
            return false;
        }
        m0 m0VarF = f5737c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof s) {
            return o(bVar, returnType, bVar2, returnType2, m0VarF);
        }
        if (!(bVar instanceof h0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        h0 h0Var = (h0) bVar;
        h0 h0Var2 = (h0) bVar2;
        p0 setter = h0Var.getSetter();
        p0 setter2 = h0Var2.getSetter();
        if (!((setter == null || setter2 == null) ? true : p(setter, setter2))) {
            return false;
        }
        if (h0Var.I() && h0Var2.I()) {
            return pm.f.g(m0VarF, returnType.b0(), returnType2.b0());
        }
        return (h0Var.I() || !h0Var2.I()) && o(bVar, returnType, bVar2, returnType2, m0VarF);
    }

    public static boolean o(zk.b bVar, y yVar, zk.b bVar2, y yVar2, m0 m0Var) {
        if (bVar == null) {
            a(73);
            throw null;
        }
        if (yVar == null) {
            a(74);
            throw null;
        }
        if (bVar2 == null) {
            a(75);
            throw null;
        }
        if (yVar2 != null) {
            return pm.f.n(pm.f.f48428a, m0Var, yVar.b0(), yVar2.b0());
        }
        a(76);
        throw null;
    }

    public static boolean p(zk.b bVar, zk.b bVar2) {
        if (bVar == null) {
            a(69);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = zk.n.b(bVar.getVisibility(), bVar2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(zk.b bVar, zk.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        c cVar = c.f5727a;
        if (!zEquals && cVar.c(bVar.a(), bVar2.a(), false)) {
            return true;
        }
        zk.b bVarA = bVar2.a();
        int i10 = e.f5728a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.b(bVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (cVar.c(bVarA, (zk.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(zk.c cVar, jk.b bVar) {
        o oVar;
        o oVarF;
        o oVar2;
        if (cVar == null) {
            a(107);
            throw null;
        }
        for (zk.c cVar2 : cVar.f()) {
            if (cVar2.getVisibility() == zk.n.f54980g) {
                r(cVar2, bVar);
            }
        }
        if (cVar.getVisibility() != zk.n.f54980g) {
            return;
        }
        Collection<zk.c> collectionF = cVar.f();
        if (collectionF == null) {
            a(InterfaceC0435l1.d.b.f29110g);
            throw null;
        }
        if (!collectionF.isEmpty()) {
            Iterator it = collectionF.iterator();
            loop3: while (true) {
                oVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    o visibility = ((zk.c) it.next()).getVisibility();
                    if (oVar != null) {
                        Integer numB = zk.n.b(visibility, oVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    oVar = visibility;
                }
            }
            if (oVar == null) {
                oVarF = null;
                break;
            }
            Iterator it2 = collectionF.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    oVarF = oVar;
                    break;
                }
                Integer numB2 = zk.n.b(oVar, ((zk.c) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = zk.n.f54983j;
        }
        if (oVarF == null) {
            oVarF = null;
            break;
        }
        if (cVar.getKind() == 2) {
            for (zk.c cVar3 : collectionF) {
                if (cVar3.j() != 4 && !cVar3.getVisibility().equals(oVarF)) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = zk.n.f(oVarF.f43095a.l());
        }
        if (oVarF == null) {
            if (bVar != null) {
                bVar.invoke(cVar);
            }
            oVar2 = zk.n.f54978e;
        } else {
            oVar2 = oVarF;
        }
        if (cVar instanceof n0) {
            n0 n0Var = (n0) cVar;
            if (oVar2 == null) {
                n0.z0(20);
                throw null;
            }
            n0Var.f6564j = oVar2;
            Iterator it3 = ((h0) cVar).l().iterator();
            while (it3.hasNext()) {
                r((g0) it3.next(), oVarF == null ? null : bVar);
            }
            return;
        }
        if (cVar instanceof cl.y) {
            cl.y yVar = (cl.y) cVar;
            if (oVar2 != null) {
                yVar.l = oVar2;
                return;
            } else {
                cl.y.z0(10);
                throw null;
            }
        }
        l0 l0Var = (l0) cVar;
        l0Var.f6541k = oVar2;
        if (oVar2 != l0Var.J0().getVisibility()) {
            l0Var.f6535e = false;
        }
    }

    public static Object s(Collection collection, jk.b bVar) {
        Object next;
        if (collection.size() == 1) {
            Object objN0 = n.n0(collection);
            if (objN0 != null) {
                return objN0;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(p.W(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(bVar.invoke(it.next()));
        }
        Object objN1 = n.n0(collection);
        zk.b bVar2 = (zk.b) bVar.invoke(objN1);
        for (Object obj : collection) {
            zk.b bVar3 = (zk.b) bVar.invoke(obj);
            if (bVar3 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(bVar3, (zk.b) it2.next()));
            if (k(bVar3, bVar2) && !k(bVar2, bVar3)) {
                objN1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objN1 != null) {
                return objN1;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objN2 = n.n0(arrayList);
            if (objN2 != null) {
                return objN2;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (pm.c.k(((zk.b) bVar.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objN3 = n.n0(arrayList);
        if (objN3 != null) {
            return objN3;
        }
        a(84);
        throw null;
    }

    public final m0 f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        qm.e eVar = qm.e.f49174a;
        qm.f fVar = qm.f.f49175a;
        qm.c cVar = this.f5739a;
        if (zIsEmpty) {
            return new m0(true, true, new d0((HashMap) null, cVar), eVar, fVar);
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((zk.m0) list.get(i10)).n(), ((zk.m0) list2.get(i10)).n());
        }
        return new m0(true, true, new d0(map, cVar), eVar, fVar);
    }

    public final void h(yl.f fVar, Collection collection, Collection collection2, zk.e eVar, m mVar) {
        Integer numB;
        if (fVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (eVar == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            zk.c cVar = (zk.c) it.next();
            if (cVar == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            ym.i iVar = new ym.i();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                zk.c cVar2 = (zk.c) it2.next();
                int iC = l(cVar2, cVar, eVar).c();
                boolean z10 = !zk.n.e(cVar2.getVisibility()) && zk.n.c(zk.n.l, cVar2, cVar) == null;
                int iC2 = v0.i.c(iC);
                if (iC2 == 0) {
                    if (z10) {
                        iVar.add(cVar2);
                    }
                    arrayList.add(cVar2);
                } else if (iC2 == 2) {
                    if (z10) {
                        mVar.d(cVar2, cVar);
                    }
                    arrayList.add(cVar2);
                }
            }
            mVar.p(cVar, iVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            zk.j jVarE = ((zk.c) linkedHashSet.iterator().next()).e();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((zk.c) it3.next()).e() != jVarE) {
                        LinkedList<zk.c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            zk.c cVar3 = null;
                            for (zk.c cVar4 : linkedList) {
                                if (cVar3 == null || ((numB = zk.n.b(cVar3.getVisibility(), cVar4.getVisibility())) != null && numB.intValue() < 0)) {
                                    cVar3 = cVar4;
                                }
                            }
                            kotlin.jvm.internal.n.c(cVar3);
                            e(g(cVar3, linkedList, new i(1), new j(mVar, cVar3)), eVar, mVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((zk.c) it4.next()), eVar, mVar);
        }
    }

    public final k l(zk.b bVar, zk.b bVar2, zk.e eVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, eVar, false);
        }
        a(20);
        throw null;
    }

    public final k m(zk.b bVar, zk.b bVar2, zk.e eVar, boolean z10) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        k kVarN = n(bVar, bVar2, z10);
        boolean z11 = kVarN.c() == 1;
        List<f> list = f5736b;
        for (f fVar : list) {
            if (fVar.b() != 1 && (!z11 || fVar.b() != 2)) {
                int iC = v0.i.c(fVar.a(bVar, bVar2, eVar));
                if (iC == 0) {
                    z11 = true;
                } else {
                    if (iC == 1) {
                        return k.b("External condition failed");
                    }
                    if (iC == 2) {
                        return k.d("External condition");
                    }
                }
            }
        }
        if (!z11) {
            return kVarN;
        }
        for (f fVar2 : list) {
            if (fVar2.b() == 1) {
                int iC2 = v0.i.c(fVar2.a(bVar, bVar2, eVar));
                if (iC2 == 0) {
                    throw new IllegalStateException("Contract violation in " + fVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iC2 == 1) {
                    return k.b("External condition failed");
                }
                if (iC2 == 2) {
                    return k.d("External condition");
                }
            }
        }
        k kVar = k.f5734b;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }

    public final k n(zk.b bVar, zk.b bVar2, boolean z10) {
        if (bVar == null) {
            a(30);
            throw null;
        }
        if (bVar2 == null) {
            a(31);
            throw null;
        }
        k kVarI = i(bVar, bVar2);
        if (kVarI != null) {
            return kVarI;
        }
        ArrayList arrayListD = d(bVar);
        ArrayList arrayListD2 = d(bVar2);
        List typeParameters = bVar.getTypeParameters();
        List typeParameters2 = bVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i10 = 0; i10 < arrayListD.size(); i10++) {
                if (!qm.d.f49173a.a((y) arrayListD.get(i10), (y) arrayListD2.get(i10))) {
                    return k.d("Type parameter number mismatch");
                }
            }
            return k.b("Type parameter number mismatch");
        }
        m0 m0VarF = f(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            zk.m0 m0Var = (zk.m0) typeParameters.get(i11);
            zk.m0 m0Var2 = (zk.m0) typeParameters2.get(i11);
            if (m0Var == null) {
                a(49);
                throw null;
            }
            if (m0Var2 == null) {
                a(50);
                throw null;
            }
            List<y> upperBounds = m0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(m0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (y yVar : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(yVar, (y) listIterator.next(), m0VarF));
                    listIterator.remove();
                }
            }
            return k.d("Type parameter bounds mismatch");
        }
        for (int i12 = 0; i12 < arrayListD.size(); i12++) {
            if (!b((y) arrayListD.get(i12), (y) arrayListD2.get(i12), m0VarF)) {
                return k.d("Value parameter type mismatch");
            }
        }
        if ((bVar instanceof s) && (bVar2 instanceof s) && ((s) bVar).isSuspend() != ((s) bVar2).isSuspend()) {
            return k.b("Incompatible suspendability");
        }
        if (z10) {
            y returnType = bVar.getReturnType();
            y returnType2 = bVar2.getReturnType();
            if (returnType != null && returnType2 != null && ((!pm.c.j(returnType2) || !pm.c.j(returnType)) && !pm.f.n(pm.f.f48428a, m0VarF, returnType2.b0(), returnType.b0()))) {
                return k.b("Return type mismatch");
            }
        }
        k kVar = k.f5734b;
        if (kVar != null) {
            return kVar;
        }
        k.a(0);
        throw null;
    }
}
