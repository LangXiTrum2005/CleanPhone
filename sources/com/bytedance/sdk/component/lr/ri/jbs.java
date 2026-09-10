package com.bytedance.sdk.component.lr.ri;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class jbs {
    private String lr;
    private String ri;

    private jbs(String str) {
        this.ri = str;
    }

    public static jbs ri(String str) {
        return new jbs(str);
    }

    public String ri() {
        return this.ri;
    }

    public Charset ri(Charset charset) {
        try {
            String str = this.lr;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
