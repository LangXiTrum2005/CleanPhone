package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w7 {
    public static final <T> List<T> asList(JSONArray jSONArray) {
        return x7.a(jSONArray);
    }

    public static final <T> List<T> asListSkipNull(JSONArray jSONArray) {
        return x7.b(jSONArray);
    }

    public static final PackageInfo getPackageInfoCompat(PackageManager packageManager, String str, int i2) {
        return x7.a(packageManager, str, i2);
    }

    public static final String getPackageVersionName(PackageManager packageManager, String str) {
        return x7.a(packageManager, str);
    }

    public static final og toBodyFields(ng ngVar) {
        return x7.a(ngVar);
    }

    public static final oe toReachabilityBodyFields(a3 a3Var) {
        return x7.a(a3Var);
    }
}
