package wk;

import cl.f0;
import cl.o0;
import cl.p0;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import eb.d0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pm.a1;
import pm.n0;
import pm.q0;
import pm.r0;
import pm.y;
import pm.y0;
import zc.u;
import zk.b0;
import zk.c0;
import zk.h0;
import zk.s;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yl.f f53310e = yl.f.g("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f53311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.i f53312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.e f53313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.l f53314d;

    public h(om.l lVar) {
        this.f53314d = lVar;
        lVar.a(new f(this, 0));
        this.f53312b = new om.i(lVar, new f(this, 1));
        this.f53313c = lVar.b(new cl.a(this, 5));
    }

    public static boolean A(y yVar, yl.e eVar) {
        if (yVar == null) {
            a(97);
            throw null;
        }
        if (eVar != null) {
            return H(yVar.P(), eVar);
        }
        a(98);
        throw null;
    }

    public static boolean B(y yVar, yl.e eVar) {
        if (eVar != null) {
            return A(yVar, eVar) && !yVar.Q();
        }
        a(TsExtractor.TS_STREAM_TYPE_E_AC3);
        throw null;
    }

    public static boolean C(s sVar) {
        if (sVar.a().getAnnotations().c(l.f53349m)) {
            return true;
        }
        if (!(sVar instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) sVar;
        boolean zI = h0Var.I();
        o0 getter = h0Var.getGetter();
        p0 setter = h0Var.getSetter();
        if (getter == null || !C(getter)) {
            return false;
        }
        if (zI) {
            return setter != null && C(setter);
        }
        return true;
    }

    public static boolean D(y yVar, yl.e eVar) {
        if (yVar == null) {
            a(InterfaceC0435l1.d.b.f29109f);
            throw null;
        }
        if (eVar != null) {
            return !yVar.Q() && A(yVar, eVar);
        }
        a(106);
        throw null;
    }

    public static boolean E(y yVar) {
        if (yVar == null) {
            a(136);
            throw null;
        }
        if (yVar != null) {
            return A(yVar, l.f53337b) && !y0.e(yVar);
        }
        a(TsExtractor.TS_STREAM_TYPE_DTS);
        throw null;
    }

    public static boolean F(y yVar) {
        if (yVar.Q()) {
            return false;
        }
        zk.g gVarE = yVar.P().e();
        return (gVarE instanceof zk.e) && t((zk.e) gVarE) != null;
    }

    public static boolean G(y yVar) {
        return D(yVar, l.f53343f);
    }

    public static boolean H(n0 n0Var, yl.e eVar) {
        if (n0Var == null) {
            a(InterfaceC0435l1.d.b.f29105b);
            throw null;
        }
        if (eVar != null) {
            zk.g gVarE = n0Var.e();
            return (gVarE instanceof zk.e) && b((zk.e) gVarE, eVar);
        }
        a(InterfaceC0435l1.d.b.f29106c);
        throw null;
    }

    public static boolean I(zk.g gVar) {
        if (gVar == null) {
            a(10);
            throw null;
        }
        for (zk.j jVarE = gVar; jVarE != null; jVarE = jVarE.e()) {
            if (jVarE instanceof b0) {
                return ((cl.h0) ((b0) jVarE)).f6518e.h(m.f53372j);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 40:
            case 41:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case 44:
            case 45:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 40:
            case 41:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case 44:
            case 45:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 40:
            case 41:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case 44:
            case 45:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 96:
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
            case InterfaceC0435l1.d.b.f29108e /* 104 */:
            case 106:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
            case 95:
            case 97:
            case 99:
            case InterfaceC0435l1.d.b.f29109f /* 105 */:
            case InterfaceC0435l1.d.b.f29110g /* 109 */:
            case InterfaceC0435l1.d.b.f29111h /* 110 */:
            case InterfaceC0435l1.d.b.f29112i /* 111 */:
            case InterfaceC0435l1.d.b.f29114k /* 113 */:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
            case 127:
            case 128:
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
            case 131:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case 136:
            case 137:
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
                objArr[0] = "typeConstructor";
                break;
            case InterfaceC0435l1.d.b.f29113j /* 112 */:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                objArr[1] = "getKMutableProperty1";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                objArr[1] = "getKMutableProperty2";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                objArr[1] = "getNothingType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                objArr[1] = "getNullableAnyType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                objArr[1] = "getDefaultBound";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                objArr[1] = "getNumberType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                objArr[1] = "getByteType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                objArr[1] = "getShortType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                objArr[1] = "getIntType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 40:
            case 41:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case 44:
            case 45:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
            case InterfaceC0435l1.d.b.f29108e /* 104 */:
                objArr[2] = "classFqNameEquals";
                break;
            case InterfaceC0435l1.d.b.f29109f /* 105 */:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case InterfaceC0435l1.d.b.f29110g /* 109 */:
                objArr[2] = "isAny";
                break;
            case InterfaceC0435l1.d.b.f29111h /* 110 */:
            case InterfaceC0435l1.d.b.f29113j /* 112 */:
                objArr[2] = "isBoolean";
                break;
            case InterfaceC0435l1.d.b.f29112i /* 111 */:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case InterfaceC0435l1.d.b.f29114k /* 113 */:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                objArr[2] = "isUShortArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
            case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
            case 27:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 31:
            case 32:
            case 33:
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
            case 36:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
            case 39:
            case 40:
            case 41:
            case 42:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
            case 44:
            case 45:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            case 50:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
            case 60:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
            case 62:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(zk.e eVar, yl.e eVar2) {
        if (eVar == null) {
            a(InterfaceC0435l1.d.b.f29107d);
            throw null;
        }
        if (eVar2 != null) {
            return eVar.getName().equals(eVar2.f()) && eVar2.equals(bm.e.g(eVar));
        }
        a(InterfaceC0435l1.d.b.f29108e);
        throw null;
    }

    public static j r(zk.g gVar) {
        if (gVar == null) {
            a(77);
            throw null;
        }
        if (l.f53336a0.contains(gVar.getName())) {
            return (j) l.f53340c0.get(bm.e.g(gVar));
        }
        return null;
    }

    public static j t(zk.e eVar) {
        if (l.Z.contains(eVar.getName())) {
            return (j) l.f53338b0.get(bm.e.g(eVar));
        }
        return null;
    }

    public static boolean x(y yVar) {
        if (yVar != null) {
            return A(yVar, l.f53335a);
        }
        a(139);
        throw null;
    }

    public static boolean y(y yVar) {
        if (yVar != null) {
            return A(yVar, l.f53344g);
        }
        a(88);
        throw null;
    }

    public static boolean z(zk.j jVar) {
        if (jVar != null) {
            return bm.e.i(jVar, mm.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, wj.d] */
    public final void c() {
        yl.f moduleName = f53310e;
        kotlin.jvm.internal.n.f(moduleName, "moduleName");
        om.l lVar = this.f53314d;
        f0 f0Var = new f0(moduleName, lVar, this, 48);
        this.f53311a = f0Var;
        c.f53303a.getClass();
        c cVar = (c) b.f53302b.getValue();
        f0 builtInsModule = this.f53311a;
        Iterable classDescriptorFactories = l();
        bl.d platformDependentDeclarationFilter = p();
        bl.b additionalClassPartsProvider = d();
        mm.b bVar = (mm.b) cVar;
        bVar.getClass();
        kotlin.jvm.internal.n.f(builtInsModule, "builtInsModule");
        kotlin.jvm.internal.n.f(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.n.f(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.n.f(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<yl.c> packageFqNames = m.f53377p;
        ml.l lVar2 = new ml.l(1, 2, bVar.f46255b);
        kotlin.jvm.internal.n.f(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList(xj.p.W(packageFqNames, 10));
        for (yl.c cVar2 : packageFqNames) {
            mm.a.f46254m.getClass();
            String strA = mm.a.a(cVar2);
            InputStream inputStream = (InputStream) lVar2.invoke(strA);
            if (inputStream == null) {
                throw new IllegalStateException(defpackage.e.n("Resource not found in classpath: ", strA));
            }
            arrayList.add(android.support.v4.media.session.a.m(cVar2, lVar, builtInsModule, inputStream));
        }
        c0 c0Var = new c0(arrayList);
        u uVar = new u(lVar, builtInsModule);
        od.c cVar3 = new od.c(c0Var, 19);
        mm.a aVar = mm.a.f46254m;
        lm.i iVar = new lm.i(lVar, builtInsModule, cVar3, new d0(builtInsModule, uVar, aVar), c0Var, lm.k.f45559a, lm.j.f45557c, classDescriptorFactories, uVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f44716a, null, new ea.b0(lVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((mm.c) it.next()).K0(iVar);
        }
        f0Var.f6503h = c0Var;
        f0 f0Var2 = this.f53311a;
        f0Var2.getClass();
        f0Var2.f6502g = new n5.f(xj.k.C0(new f0[]{f0Var2}), 3);
    }

    public bl.b d() {
        return bl.a.f5718b;
    }

    public final pm.c0 e() {
        pm.c0 c0VarG = j("Any").g();
        if (c0VarG != null) {
            return c0VarG;
        }
        a(50);
        throw null;
    }

    public final y f(y yVar) {
        yl.b bVarF;
        yl.b bVar;
        zk.e eVarD;
        pm.c0 c0VarG = null;
        if (yVar == null) {
            a(67);
            throw null;
        }
        if (y(yVar)) {
            if (yVar.t().size() != 1) {
                throw new IllegalStateException();
            }
            y yVarB = ((q0) yVar.t().get(0)).b();
            if (yVarB != null) {
                return yVarB;
            }
            a(68);
            throw null;
        }
        a1 a1VarG = y0.g(yVar, false);
        y yVar2 = (y) ((g) this.f53312b.invoke()).f53309b.get(a1VarG);
        if (yVar2 != null) {
            return yVar2;
        }
        int i10 = bm.e.f5728a;
        zk.g gVarE = a1VarG.P().e();
        w wVarE = gVarE == null ? null : bm.e.e(gVarE);
        if (wVarE != null) {
            zk.g gVarE2 = a1VarG.P().e();
            if (gVarE2 != null) {
                Set set = q.f53389a;
                yl.f name = gVarE2.getName();
                kotlin.jvm.internal.n.f(name, "name");
                if (q.f53392d.contains(name) && (bVarF = fm.e.f(gVarE2)) != null && (bVar = (yl.b) q.f53390b.get(bVarF)) != null && (eVarD = zk.u.d(wVarE, bVar)) != null) {
                    c0VarG = eVarD.g();
                }
            }
            if (c0VarG != null) {
                return c0VarG;
            }
        }
        throw new IllegalStateException("not array: " + yVar);
    }

    public final pm.c0 g(int i10, y yVar, al.j jVar) {
        if (i10 == 0) {
            a(78);
            throw null;
        }
        if (yVar != null) {
            return pm.f.q(pm.c.x(jVar), j("Array"), Collections.singletonList(new r0(i10, yVar)));
        }
        a(79);
        throw null;
    }

    public final pm.c0 h(a1 a1Var) {
        if (a1Var != null) {
            return g(1, a1Var, al.i.f3645a);
        }
        a(83);
        throw null;
    }

    public final zk.e i(yl.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        zk.e eVarJ = zk.u.j(k(), cVar);
        if (eVarJ != null) {
            return eVarJ;
        }
        a(13);
        throw null;
    }

    public final zk.e j(String str) {
        if (str != null) {
            return (zk.e) this.f53313c.invoke(yl.f.e(str));
        }
        a(14);
        throw null;
    }

    public final f0 k() {
        this.f53311a.getClass();
        f0 f0Var = this.f53311a;
        if (f0Var != null) {
            return f0Var;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new xk.a(this.f53314d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final pm.c0 m() {
        pm.c0 c0VarO = o();
        if (c0VarO != null) {
            return c0VarO;
        }
        a(52);
        throw null;
    }

    public final pm.c0 n() {
        pm.c0 c0VarG = j("Nothing").g();
        if (c0VarG != null) {
            return c0VarG;
        }
        a(48);
        throw null;
    }

    public final pm.c0 o() {
        pm.c0 c0VarZ0 = e().i0(true);
        if (c0VarZ0 != null) {
            return c0VarZ0;
        }
        a(51);
        throw null;
    }

    public bl.d p() {
        return bl.a.f5720d;
    }

    public final pm.c0 q(j jVar) {
        if (jVar == null) {
            a(73);
            throw null;
        }
        pm.c0 c0Var = (pm.c0) ((g) this.f53312b.invoke()).f53308a.get(jVar);
        if (c0Var != null) {
            return c0Var;
        }
        a(74);
        throw null;
    }

    public final pm.c0 s(j jVar) {
        if (jVar == null) {
            a(53);
            throw null;
        }
        pm.c0 c0VarG = j(jVar.f53326a.b()).g();
        if (c0VarG != null) {
            return c0VarG;
        }
        a(54);
        throw null;
    }

    public final pm.c0 u() {
        pm.c0 c0VarG = j("String").g();
        if (c0VarG != null) {
            return c0VarG;
        }
        a(65);
        throw null;
    }

    public final zk.e v(int i10) {
        return i(m.f53367e.c(yl.f.e(xk.e.f53889e.f53894b + i10)));
    }

    public final pm.c0 w() {
        pm.c0 c0VarG = j("Unit").g();
        if (c0VarG != null) {
            return c0VarG;
        }
        a(64);
        throw null;
    }
}
