package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nd implements vs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final nd f17754b = new nd(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nd f17755c = new nd(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nd f17756d = new nd(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nd f17757e = new nd(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nd f17758f = new nd(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nd f17759g = new nd(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final nd f17760h = new nd(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final nd f17761i = new nd(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final nd f17762j = new nd(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final nd f17763k = new nd(9);
    public static final nd l = new nd(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final nd f17764m = new nd(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final nd f17765n = new nd(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final nd f17766o = new nd(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final nd f17767p = new nd(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final nd f17768q = new nd(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final nd f17769r = new nd(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final nd f17770s = new nd(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final nd f17771t = new nd(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final nd f17772u = new nd(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final nd f17773v = new nd(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final nd f17774w = new nd(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final nd f17775x = new nd(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final nd f17776y = new nd(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final nd f17777z = new nd(24);
    public static final nd A = new nd(25);
    public static final nd B = new nd(26);
    public static final nd C = new nd(27);
    public static final nd D = new nd(28);
    public static final nd E = new nd(29);

    public /* synthetic */ nd(int i10) {
        this.f17778a = i10;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final boolean a(int i10) {
        qj qjVar;
        zj zjVar;
        cl clVar;
        ll llVar;
        switch (this.f17778a) {
            case 0:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 1:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 2:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 4:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 6:
                return i10 == 0 || i10 == 1;
            case 7:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 8:
                return v71.n(i10) != 0;
            case 9:
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
                        return true;
                    default:
                        return false;
                }
            case 10:
                switch (i10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 11:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 1000;
            case 12:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
            case 13:
                return hh.a(i10) != null;
            case 14:
                switch (i10) {
                    case 0:
                        qjVar = qj.AD_INITIATER_UNSPECIFIED;
                        break;
                    case 1:
                        qjVar = qj.BANNER;
                        break;
                    case 2:
                        qjVar = qj.DFP_BANNER;
                        break;
                    case 3:
                        qjVar = qj.INTERSTITIAL;
                        break;
                    case 4:
                        qjVar = qj.DFP_INTERSTITIAL;
                        break;
                    case 5:
                        qjVar = qj.NATIVE_EXPRESS;
                        break;
                    case 6:
                        qjVar = qj.AD_LOADER;
                        break;
                    case 7:
                        qjVar = qj.REWARD_BASED_VIDEO_AD;
                        break;
                    case 8:
                        qjVar = qj.BANNER_SEARCH_ADS;
                        break;
                    case 9:
                        qjVar = qj.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                        break;
                    case 10:
                        qjVar = qj.APP_OPEN;
                        break;
                    case 11:
                        qjVar = qj.REWARDED_INTERSTITIAL;
                        break;
                    default:
                        qjVar = null;
                        break;
                }
                return qjVar != null;
            case 15:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
            case 16:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 17:
                if (i10 == 0) {
                    zjVar = zj.UNSPECIFIED;
                } else if (i10 == 1) {
                    zjVar = zj.CONNECTING;
                } else if (i10 == 2) {
                    zjVar = zj.CONNECTED;
                } else if (i10 == 3) {
                    zjVar = zj.DISCONNECTING;
                } else if (i10 != 4) {
                    zjVar = i10 != 5 ? null : zj.SUSPENDED;
                } else {
                    zjVar = zj.DISCONNECTED;
                }
                return zjVar != null;
            case 18:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
            case 19:
                return i10 == 0 || i10 == 1;
            case 20:
                switch (i10) {
                    case 0:
                        clVar = cl.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        clVar = cl.BANNER;
                        break;
                    case 2:
                        clVar = cl.INTERSTITIAL;
                        break;
                    case 3:
                        clVar = cl.NATIVE_EXPRESS;
                        break;
                    case 4:
                        clVar = cl.NATIVE_CONTENT;
                        break;
                    case 5:
                        clVar = cl.NATIVE_APP_INSTALL;
                        break;
                    case 6:
                        clVar = cl.NATIVE_CUSTOM_TEMPLATE;
                        break;
                    case 7:
                        clVar = cl.DFP_BANNER;
                        break;
                    case 8:
                        clVar = cl.DFP_INTERSTITIAL;
                        break;
                    case 9:
                        clVar = cl.REWARD_BASED_VIDEO_AD;
                        break;
                    case 10:
                        clVar = cl.BANNER_SEARCH_ADS;
                        break;
                    default:
                        clVar = null;
                        break;
                }
                return clVar != null;
            case 21:
                return i10 == 0 || i10 == 1 || i10 == 2;
            case 22:
                if (i10 == 0) {
                    llVar = ll.ENUM_FALSE;
                } else if (i10 != 1) {
                    llVar = i10 != 1000 ? null : ll.ENUM_UNKNOWN;
                } else {
                    llVar = ll.ENUM_TRUE;
                }
                return llVar != null;
            case 23:
                return i10 == 1 || i10 == 2;
            case 24:
                return i10 == 0 || i10 == 1;
            case 25:
                return pi1.o(i10) != 0;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return dv.a(i10) != 0;
            case 27:
                return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 1999) {
                    return true;
                }
                switch (i10) {
                    case 1000:
                    case 1001:
                    case 1002:
                    case 1003:
                    case 1004:
                    case 1005:
                    case 1006:
                    case 1007:
                    case 1008:
                    case 1009:
                    case 1010:
                        return true;
                    default:
                        return false;
                }
            default:
                return i10 == 0 || i10 == 1;
        }
    }
}
