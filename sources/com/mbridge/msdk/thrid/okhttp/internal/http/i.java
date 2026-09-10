package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.y;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static String a(y yVar, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(yVar.e());
        sb2.append(' ');
        if (b(yVar, type)) {
            sb2.append(yVar.g());
        } else {
            sb2.append(a(yVar.g()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    private static boolean b(y yVar, Proxy.Type type) {
        return !yVar.d() && type == Proxy.Type.HTTP;
    }

    public static String a(s sVar) {
        String strC = sVar.c();
        String strE = sVar.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
