package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Y4 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Vc.a());
            Boolean boolC = C3246te.f24014a.c();
            if (boolC != null) {
                map.put("u-id-adt", boolC.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Zc.f23411a.getClass();
            HashMap map2 = new HashMap();
            if (Zc.f23414e && (str = Zc.d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
        } catch (Exception unused) {
        }
        return map;
    }
}
