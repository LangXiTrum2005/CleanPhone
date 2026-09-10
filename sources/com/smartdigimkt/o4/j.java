package com.smartdigimkt.o4;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37441a = "exo_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37442b = "exo_redir";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f37443c = "exo_len";

    private j() {
    }

    public static long a(i iVar) {
        return iVar.a(f37443c, -1L);
    }

    public static Uri b(i iVar) {
        String strA = iVar.a(f37442b, (String) null);
        if (strA == null) {
            return null;
        }
        return Uri.parse(strA);
    }

    public static void a(k kVar, long j) {
        kVar.a(f37443c, j);
    }

    public static void a(k kVar) {
        kVar.a(f37443c);
    }

    public static void b(k kVar) {
        kVar.a(f37442b);
    }

    public static void a(k kVar, Uri uri) {
        kVar.a(f37442b, uri.toString());
    }
}
