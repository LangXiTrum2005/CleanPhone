package com.bytedance.sdk.component.JXs.LD;

import com.bytedance.sdk.component.JXs.ebl;
import com.bytedance.sdk.component.JXs.lc;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ZU<T> implements lc {
    private ebl JXs;
    private int LD;
    Map<String, String> Lxb;
    private String ZU;
    private T lk;

    public ZU(int i, T t, String str) {
        this.LD = i;
        this.lk = t;
        this.ZU = str;
    }

    @Override // com.bytedance.sdk.component.JXs.lc
    public Map<String, String> JXs() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.JXs.lc
    public int LD() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.JXs.lc
    public ebl Lxb() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.component.JXs.lc
    public String ZU() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.component.JXs.lc
    public T lk() {
        return this.lk;
    }

    public void Lxb(ebl eblVar) {
        this.JXs = eblVar;
    }

    public ZU(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.Lxb = map;
    }
}
