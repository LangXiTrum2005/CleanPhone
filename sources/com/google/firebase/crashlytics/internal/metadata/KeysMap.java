package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class KeysMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20389a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20390b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20391c;

    public KeysMap(int i2) {
        this.f20391c = i2;
    }

    public static String a(int i2, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i2) {
                return str.substring(0, i2);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean zEquals;
        String strA = a(this.f20391c, "com.crashlytics.version-control-info");
        if (this.f20389a.size() >= this.f20390b && !this.f20389a.containsKey(strA)) {
            Logger.f20289a.f(null, "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f20390b);
            return false;
        }
        String strA2 = a(this.f20391c, str);
        String str2 = (String) this.f20389a.get(strA);
        if (str2 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str2.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        this.f20389a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f20391c, str);
                if (this.f20389a.size() < this.f20390b || this.f20389a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f20389a.put(strA, str2 == null ? "" : a(this.f20391c, str2));
                } else {
                    i2++;
                }
            }
            if (i2 > 0) {
                Logger.f20289a.f(null, "Ignored " + i2 + " entries when adding custom keys. Maximum allowable: " + this.f20390b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
