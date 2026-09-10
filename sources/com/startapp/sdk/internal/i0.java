package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.startappsdk.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f41072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f41073b;
    public static final String d;
    public static final Boolean f;
    public static final Boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f41077i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f41078l;
    public static final String[] m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f41074c = "trackdownload";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f41075e = "https://imp.startappservice.com/tracking/adImpression";

    static {
        String str = "get";
        f41072a = str.concat("ads");
        f41073b = str.concat("htmlad");
        d = str.concat("adsmetadata");
        Boolean bool = Boolean.FALSE;
        f = bool;
        g = bool;
        f41076h = R.id.io_start_fullscreen_main;
        f41077i = R.id.io_start_fullscreen_info;
        j = R.id.io_start_list3d_close;
        k = R.id.io_start_video_main;
        f41078l = new String[]{"back_", "back_dark", "browser_icon_dark", "forward_", "forward_dark", "x_dark"};
        m = new String[]{"empty_star", "filled_star", "half_star"};
    }

    public static String a(AdsConstants$AdApiType adsConstants$AdApiType, AdPreferences.Placement placement) {
        String str;
        String strA;
        String str2;
        String str3;
        int iOrdinal = adsConstants$AdApiType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                str3 = null;
                str2 = null;
            } else {
                str = f41072a;
                strA = MetaData.E().a(placement);
            }
            return android.support.v4.media.a.m(str3, str2);
        }
        str = f41073b;
        strA = MetaData.E().a(placement);
        String str4 = strA;
        str2 = str;
        str3 = str4;
        return android.support.v4.media.a.m(str3, str2);
    }
}
