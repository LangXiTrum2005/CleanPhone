package com.bytedance.adsdk.qdl.ud.qdl;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private String qdl;
    private Object[] ud;

    public String qdl() {
        return this.qdl;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.qdl + "', args=" + Arrays.toString(this.ud) + AbstractJsonLexerKt.END_OBJ;
    }

    public Object[] ud() {
        return this.ud;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void qdl(Object[] objArr) {
        this.ud = objArr;
    }
}
