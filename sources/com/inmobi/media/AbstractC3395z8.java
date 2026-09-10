package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3395z8 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Ki.a());
            C3238t1 c3238t1 = AbstractC3407zk.a;
            Boolean bool = c3238t1 != null ? c3238t1.c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Qi.a.getClass();
            HashMap map2 = new HashMap();
            if (Qi.e && (str = Qi.d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("z8", "TAG");
            e.getMessage();
            return map;
        }
    }
}
