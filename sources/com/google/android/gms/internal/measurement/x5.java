package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface x5 {
    static b6 h(x5 x5Var, e6 e6Var, d8 d8Var, ArrayList arrayList) {
        String str = e6Var.f23417a;
        if (x5Var.zzj(str)) {
            b6 b6VarZzk = x5Var.zzk(str);
            if (b6VarZzk instanceof p4) {
                return ((p4) b6VarZzk).a(d8Var, arrayList);
            }
            throw new IllegalArgumentException(wi.d.h(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(defpackage.e.n("Object has no function ", str));
        }
        yg.c(1, "hasOwnProperty", arrayList);
        return x5Var.zzj(((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0)).zzc()) ? b6.X8 : b6.Y8;
    }

    void b(String str, b6 b6Var);

    boolean zzj(String str);

    b6 zzk(String str);
}
