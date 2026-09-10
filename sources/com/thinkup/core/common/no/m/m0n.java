package com.thinkup.core.common.no.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public enum m0n {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String om;

    m0n(String str) {
        this.om = str;
    }

    private static /* synthetic */ m0n[] m() {
        return new m0n[]{TLS_1_3, TLS_1_2, TLS_1_1, TLS_1_0, SSL_3_0};
    }

    public static m0n o(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    public static List<m0n> o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private String o() {
        return this.om;
    }
}
