package com.bytedance.sdk.component.mzz.ud;

import com.bytedance.sdk.component.mzz.mo;
import com.bytedance.sdk.component.mzz.wd;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class lnr<T> implements mo {
    private T lnr;
    private String mml;
    private wd mzz;
    Map<String, String> qdl;
    private int ud;

    public lnr(int i2, T t, String str) {
        this.ud = i2;
        this.lnr = t;
        this.mml = str;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public T lnr() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public String mml() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public Map<String, String> mzz() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public wd qdl() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.mo
    public int ud() {
        return this.ud;
    }

    public void qdl(wd wdVar) {
        this.mzz = wdVar;
    }

    public lnr(int i2, T t, String str, Map<String, String> map) {
        this(i2, t, str);
        this.qdl = map;
    }
}
