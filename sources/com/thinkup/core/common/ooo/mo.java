package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private static String o = "mo";

    public static Map<String, Object> o(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (TextUtils.equals(key, "key_width") || TextUtils.equals(key, "key_height")) {
                        try {
                            value = Integer.valueOf((int) Double.parseDouble(value.toString()));
                        } catch (Throwable unused) {
                        }
                    }
                    concurrentHashMap.put(key, value);
                }
            } catch (Throwable unused2) {
            }
            return concurrentHashMap;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public static void o(Map<String, Object> map, Map<String, Object> map2) {
        if (map == null || map2 == null) {
            return;
        }
        try {
            if (map2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    map.put(key, value);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
