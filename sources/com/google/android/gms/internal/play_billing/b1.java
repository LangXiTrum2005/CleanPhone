package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f24222b = new b1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f24223c = new b1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f24224d = new b1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b1 f24225e = new b1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b1 f24226f = new b1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b1 f24227g = new b1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b1 f24228h = new b1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b1 f24229i = new b1(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24230a;

    public /* synthetic */ b1(int i10) {
        this.f24230a = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.w1
    public final boolean a(int i10) {
        m3 m3Var;
        switch (this.f24230a) {
            case 0:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i10) {
                    default:
                        switch (i10) {
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
                                break;
                            default:
                                return false;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
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
                        return true;
                }
                break;
            case 2:
                return j3.a(i10) != null;
            case 3:
                if (i10 == 0) {
                    m3Var = m3.BROADCAST_ACTION_UNSPECIFIED;
                } else if (i10 == 1) {
                    m3Var = m3.PURCHASES_UPDATED_ACTION;
                } else if (i10 != 2) {
                    m3Var = i10 != 3 ? null : m3.ALTERNATIVE_BILLING_ACTION;
                } else {
                    m3Var = m3.LOCAL_PURCHASES_UPDATED_ACTION;
                }
                return m3Var != null;
            case 4:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
            case 5:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                return i10 == 0 || i10 == 1;
        }
    }
}
