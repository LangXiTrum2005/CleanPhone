package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class qd {
    private static volatile qd ri;
    private Map<String, Map<String, String>> lr = new ConcurrentHashMap();

    private qd() {
    }

    public static qd ri() {
        if (ri == null) {
            synchronized (qd.class) {
                try {
                    if (ri == null) {
                        ri = new qd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public boolean ik(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.lr.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public boolean lr(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.lr.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public void ri(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.lr;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.lr.put(str, concurrentHashMap);
    }

    public String ri(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.lr;
        if (map2 == null || !map2.containsKey(str) || (map = this.lr.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public void ri(String str) {
        Map<String, Map<String, String>> map = this.lr;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.lr.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.lr.remove(str);
        }
    }
}
