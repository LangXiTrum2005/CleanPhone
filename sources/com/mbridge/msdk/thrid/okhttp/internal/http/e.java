package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.l;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.s;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f36343a = com.mbridge.msdk.thrid.okio.f.c("\"\\");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.mbridge.msdk.thrid.okio.f f36344b = com.mbridge.msdk.thrid.okio.f.c("\t ,=");

    public static long a(a0 a0Var) {
        return a(a0Var.m());
    }

    public static boolean b(a0 a0Var) {
        if (a0Var.s().e().equals("HEAD")) {
            return false;
        }
        int iK = a0Var.k();
        return (((iK >= 100 && iK < 200) || iK == 204 || iK == 304) && a(a0Var) == -1 && !"chunked".equalsIgnoreCase(a0Var.b("Transfer-Encoding"))) ? false : true;
    }

    public static long a(r rVar) {
        return a(rVar.b("Content-Length"));
    }

    private static long a(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void a(l lVar, s sVar, r rVar) {
        if (lVar == l.f36634a) {
            return;
        }
        List<com.mbridge.msdk.thrid.okhttp.k> listA = com.mbridge.msdk.thrid.okhttp.k.a(sVar, rVar);
        if (listA.isEmpty()) {
            return;
        }
        lVar.a(sVar, listA);
    }

    public static int b(String str, int i10) {
        char cCharAt;
        while (i10 < str.length() && ((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\t')) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int a(String str, int i10) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
