package q7;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f48749a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f48750b = new HashMap();

    public static final void a(m mVar, n feature) {
        kotlin.jvm.internal.n.f(feature, "feature");
        q.d(new o(mVar, feature));
    }

    public static final boolean b(n feature) {
        n nVarA;
        boolean z10;
        kotlin.jvm.internal.n.f(feature, "feature");
        boolean z11 = false;
        if (n.Unknown != feature) {
            if (n.Core != feature) {
                String string = l7.s.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + feature, null);
                if (string == null || !string.equals("18.3.0")) {
                    int i10 = feature.f48746a;
                    if ((i10 & 255) > 0) {
                        nVarA = f.a(i10 & (-256));
                    } else if ((65280 & i10) > 0) {
                        nVarA = f.a(i10 & (-65536));
                    } else {
                        nVarA = (16711680 & i10) > 0 ? f.a(i10 & (-16777216)) : f.a(0);
                    }
                    if (nVarA == feature) {
                        switch (feature.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
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
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            case 39:
                            case 40:
                            case 41:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                            case 44:
                            case 45:
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z11 = true;
                                break;
                        }
                        return q.b("FBSDKFeature" + feature, l7.s.c(), z11);
                    }
                    if (b(nVarA)) {
                        switch (feature.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
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
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            case 39:
                            case 40:
                            case 41:
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                            case 44:
                            case 45:
                                z10 = false;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            case 36:
                            case 37:
                            case 42:
                            default:
                                z10 = true;
                                break;
                        }
                        if (q.b("FBSDKFeature" + feature, l7.s.c(), z10)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
