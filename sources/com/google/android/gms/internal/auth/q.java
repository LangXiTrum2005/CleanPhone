package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x.e f22892a = new x.e(0);

    public static synchronized Uri a() {
        x.e eVar = f22892a;
        Uri uri = (Uri) eVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        eVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
