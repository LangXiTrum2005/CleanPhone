package com.bytedance.sdk.component.LD.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public enum sLN {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String JXs;

    sLN(String str) {
        this.JXs = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.JXs;
    }
}
