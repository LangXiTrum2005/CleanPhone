package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f23055a;

    public static p a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new p(strConcat, str2);
    }

    public static void b(int i10, int i11) {
        String strC;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strC = d0.c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(l1.d.e(i11, "negative size: "));
                }
                strC = d0.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void d(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(g(i10, i11, "index"));
        }
    }

    public static void e(Context context, HashSet hashSet) {
        HashMap map;
        e0 e0Var = new e0(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = e0Var.f23009c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            p pVarA = a(context, str);
            if (pVarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = (String) pVarA.f23158a;
                if (!map.containsKey(str2)) {
                    map.put(str2, e0Var.f23008b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove((String) pVarA.f23159b);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static void f(int i10, int i11, int i12) {
        String strG;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strG = g(i10, i12, "start index");
            } else {
                strG = (i11 < 0 || i11 > i12) ? g(i11, i12, "end index") : d0.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static String g(int i10, int i11, String str) {
        if (i10 < 0) {
            return d0.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return d0.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(l1.d.e(i11, "negative size: "));
    }
}
