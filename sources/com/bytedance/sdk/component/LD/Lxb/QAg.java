package com.bytedance.sdk.component.LD.Lxb;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class QAg {
    private String LD;
    private String Lxb;

    private QAg(String str) {
        this.Lxb = str;
    }

    public static QAg Lxb(String str) {
        return new QAg(str);
    }

    public String Lxb() {
        return this.Lxb;
    }

    public Charset Lxb(Charset charset) {
        try {
            String str = this.LD;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
