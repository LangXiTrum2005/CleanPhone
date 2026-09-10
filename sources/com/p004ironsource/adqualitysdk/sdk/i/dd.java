package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dd extends cz {
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View m1809(List<Object> list) {
        return ke.m2797((Activity) cz.m1785(list, 0, Activity.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m1810(List<Object> list) {
        return ke.m2792((View) cz.m1785(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m1811(List<Object> list) {
        return (E) ke.m2789((View) cz.m1785(list, 0, View.class), (Class) cz.m1785(list, 1, Class.class), ((Boolean) cz.m1785(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static WebView m1812(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) cz.m1785(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) cz.m1785(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) cz.m1785(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) cz.m1785(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) ke.m2788(activity, WebView.class, iIntValue, arrayList, str);
    }
}
