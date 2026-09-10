package com.ironsource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface B4 {
    static /* synthetic */ String a(B4 b10, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return b10.a(str, str2);
    }

    String a(String str, String str2);

    void a(String str);

    Map<String, ?> allData();

    void b(String str, String str2);
}
