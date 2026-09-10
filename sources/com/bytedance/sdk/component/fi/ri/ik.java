package com.bytedance.sdk.component.fi.ri;

import com.bytedance.sdk.component.fi.di;
import com.bytedance.sdk.component.fi.xha;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ik<T> implements di {
    private xha fi;
    private T ik;
    private String ka;
    private int lr;
    Map<String, String> ri;

    public ik(int i, T t, String str) {
        this.lr = i;
        this.ik = t;
        this.ka = str;
    }

    @Override // com.bytedance.sdk.component.fi.di
    public String ik() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.fi.di
    public T lr() {
        return this.ik;
    }

    public void ri(xha xhaVar) {
        this.fi = xhaVar;
    }

    @Override // com.bytedance.sdk.component.fi.di
    public int ri() {
        return this.lr;
    }

    public ik(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.ri = map;
    }
}
