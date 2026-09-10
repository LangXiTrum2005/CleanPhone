package com.startapp.sdk.internal;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bd {
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    public static HashMap a(String str) {
        String strSubstring = str.substring(8);
        HashMap map = new HashMap();
        int iIndexOf = strSubstring.indexOf(63);
        boolean zContainsKey = true;
        if (iIndexOf != -1) {
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            for (String str2 : strSubstring.substring(iIndexOf + 1).split(com.ironsource.d9.i.f24749c)) {
                int iIndexOf2 = str2.indexOf(61);
                map.put(str2.substring(0, iIndexOf2), str2.substring(iIndexOf2 + 1));
            }
            strSubstring = strSubstring2;
        }
        if (!Arrays.asList("close", "createCalendarEvent", "expand", MRAIDPresenter.OPEN, "playVideo", "resize", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "setResizeProperties", "storePicture", "useCustomClose").contains(strSubstring)) {
            return null;
        }
        if (strSubstring.equals("createCalendarEvent")) {
            zContainsKey = map.containsKey("eventJSON");
        } else if (strSubstring.equals(MRAIDPresenter.OPEN) || strSubstring.equals("playVideo") || strSubstring.equals("storePicture")) {
            zContainsKey = map.containsKey("url");
        } else if (strSubstring.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
            if (!map.containsKey("allowOrientationChange") || !map.containsKey("forceOrientation")) {
                zContainsKey = false;
            }
        } else if (strSubstring.equals("setResizeProperties")) {
            if (!map.containsKey("width") || !map.containsKey("height") || !map.containsKey("offsetX") || !map.containsKey("offsetY") || !map.containsKey("customClosePosition") || !map.containsKey("allowOffscreen")) {
                zContainsKey = false;
            }
        } else if (strSubstring.equals("useCustomClose")) {
            zContainsKey = map.containsKey("useCustomClose");
        }
        if (!zContainsKey) {
            return null;
        }
        HashMap map2 = new HashMap();
        map2.put(com.ironsource.sdk.controller.f.b.g, strSubstring);
        map2.putAll(map);
        return map2;
    }
}
