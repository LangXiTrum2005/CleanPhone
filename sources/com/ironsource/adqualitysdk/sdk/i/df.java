package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class df extends cw {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View m1909(List<Object> list) {
        return kq.m2951((Activity) cw.m1805(list, 0, Activity.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m1910(List<Object> list) {
        return (E) kq.m2956((View) cw.m1805(list, 0, View.class), (Class) cw.m1805(list, 1, Class.class), ((Boolean) cw.m1805(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static WebView m1911(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) cw.m1805(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) cw.m1805(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) cw.m1805(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) cw.m1805(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) kq.m2959(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m1912(List<Object> list) {
        return kq.m2954((View) cw.m1805(list, 0, View.class));
    }
}
