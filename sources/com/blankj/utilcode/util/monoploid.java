package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SPUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class monoploid {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<String, monoploid> f17494saneness = new HashMap();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public SharedPreferences f17495attabal;

    public monoploid(String str, int i) {
        this.f17495attabal = adultoid.attabal().getSharedPreferences(str, i);
    }

    public static monoploid attabal(String str) {
        return saneness(str, 0);
    }

    public static boolean marial(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static monoploid saneness(String str, int i) {
        monoploid monoploidVar;
        if (marial(str)) {
            str = "spUtils";
        }
        Map<String, monoploid> map = f17494saneness;
        monoploid monoploidVar2 = map.get(str);
        if (monoploidVar2 != null) {
            return monoploidVar2;
        }
        synchronized (monoploid.class) {
            try {
                monoploidVar = map.get(str);
                if (monoploidVar == null) {
                    monoploidVar = new monoploid(str, i);
                    map.put(str, monoploidVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return monoploidVar;
    }

    public void beachfront(String str) {
        competently(str, false);
    }

    public void competently(String str, boolean z) {
        if (z) {
            this.f17495attabal.edit().remove(str).commit();
        } else {
            this.f17495attabal.edit().remove(str).apply();
        }
    }

    public String dern(String str) {
        return wireman(str, "");
    }

    public String wireman(String str, String str2) {
        return this.f17495attabal.getString(str, str2);
    }
}
