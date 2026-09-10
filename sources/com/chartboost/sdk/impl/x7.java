package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class x7 {
    public static final List a(JSONArray jSONArray) {
        Intrinsics.f(jSONArray, "<this>");
        IntRange intRangeE = RangesKt.e(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.n(intRangeE, 10));
        Iterator<Integer> it = intRangeE.iterator();
        while (((IntProgressionIterator) it).Z) {
            arrayList.add(jSONArray.get(((IntIterator) it).a()));
        }
        return arrayList;
    }

    public static final List b(JSONArray jSONArray) throws JSONException {
        Intrinsics.f(jSONArray, "<this>");
        IntRange intRangeE = RangesKt.e(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeE.iterator();
        while (((IntProgressionIterator) it).Z) {
            Object obj = jSONArray.get(((IntIterator) it).a());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final PackageInfo a(PackageManager packageManager, String packageName, int i2) throws PackageManager.NameNotFoundException {
        Intrinsics.f(packageManager, "<this>");
        Intrinsics.f(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i2));
            Intrinsics.c(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i2);
        Intrinsics.c(packageInfo2);
        return packageInfo2;
    }

    public static final String a(PackageManager packageManager, String packageName) {
        Intrinsics.f(packageManager, "<this>");
        Intrinsics.f(packageName, "packageName");
        try {
            String str = w7.getPackageInfoCompat(packageManager, packageName, 128).versionName;
            Intrinsics.c(str);
            return str;
        } catch (Exception e2) {
            za.b("Exception raised getting package manager object", e2);
            return "";
        }
    }

    public static final og a(ng ngVar) {
        Intrinsics.f(ngVar, "<this>");
        return new og(ngVar.a(), ngVar.b(), ngVar.c());
    }

    public static final oe a(a3 a3Var) {
        Intrinsics.f(a3Var, "<this>");
        return new oe(Integer.valueOf(a3Var.a()), Integer.valueOf(a3Var.c().b()), a3Var.b(), a3Var.f());
    }
}
