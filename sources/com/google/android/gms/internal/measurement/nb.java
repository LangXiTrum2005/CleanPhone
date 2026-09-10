package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x.e f23773a = new x.e(0);

    public static synchronized Uri a() {
        x.e eVar = f23773a;
        Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        eVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
        }
        String packageName = context.getPackageName();
        return q4.a.j(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }
}
