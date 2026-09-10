package com.mbridge.msdk.newreward.function.common;

import com.mbridge.msdk.newreward.function.core.request.b;
import com.mbridge.msdk.tracker.network.d0;

/* JADX INFO: loaded from: classes2.dex */
public class VolleyErrorUtils {
    public static b parseVolleyError(d0 d0Var) {
        b bVar = new b(0);
        bVar.a("Network unknown error");
        if (d0Var == null) {
            return bVar;
        }
        int iA = d0Var.a();
        if (iA == 1) {
            d0Var.a("Network error,please check state code " + d0Var.c());
            bVar = new b(1);
        } else if (iA == 7) {
            d0Var.a("The server returns an exception state code " + d0Var.c());
            bVar = new b(2);
        } else if (iA == 2) {
            d0Var.a("unSupportEncodingException");
            bVar = new b(8);
        } else if (iA == 8) {
            d0Var.a("Network error,timeout exception");
            bVar = new b(4);
        } else if (iA == 3) {
            d0Var.a("Network error,I/O exception");
            bVar = new b(3);
        } else if (iA == 4) {
            d0Var.a(880041);
            d0Var.a("Network error,UnknownHostException");
            bVar = new b(5);
        } else if (iA == 6) {
            d0Var.a("Network error,I/O exception response null");
            bVar = new b(7);
        } else if (iA == 5) {
            d0Var.a("Network error,I/O exception");
            bVar = new b(6);
        } else if (iA == 0) {
            d0Var.a("Network error,I/O exception");
            bVar = new b(0);
        } else if (iA == 9) {
            d0Var.a("Network unknown error");
            bVar = new b(1);
        }
        bVar.a(d0Var);
        bVar.a(d0Var.getMessage());
        return bVar;
    }
}
