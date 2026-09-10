package com.thinkup.core.common.no.m;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public enum on0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final String on;

    on0(String str) {
        this.on = str;
    }

    private static /* synthetic */ on0[] o() {
        return new on0[]{HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC};
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.on;
    }

    public static on0 o(String str) throws IOException {
        on0 on0Var = HTTP_1_0;
        if (str.equals(on0Var.on)) {
            return on0Var;
        }
        on0 on0Var2 = HTTP_1_1;
        if (str.equals(on0Var2.on)) {
            return on0Var2;
        }
        on0 on0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(on0Var3.on)) {
            return on0Var3;
        }
        on0 on0Var4 = HTTP_2;
        if (str.equals(on0Var4.on)) {
            return on0Var4;
        }
        on0 on0Var5 = SPDY_3;
        if (str.equals(on0Var5.on)) {
            return on0Var5;
        }
        on0 on0Var6 = QUIC;
        if (str.equals(on0Var6.on)) {
            return on0Var6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }
}
