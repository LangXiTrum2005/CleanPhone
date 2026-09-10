package com.bytedance.sdk.component.fi.lr.ik;

import com.bytedance.sdk.component.fi.sf;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ka<T> implements sf {
    private int di;
    private int fi;
    private T ik;
    private boolean jbs;
    private T ka;
    private String lr;
    private boolean mj;
    private com.bytedance.sdk.component.fi.xha qt;
    private String ri;
    private int sf;
    private Map<String, String> xha;

    @Override // com.bytedance.sdk.component.fi.sf
    public boolean di() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public boolean fi() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public T ik() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public Map<String, String> ka() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public T lr() {
        return this.ik;
    }

    public ka ri(ik ikVar, T t) {
        this.ik = t;
        this.ri = ikVar.mj();
        this.lr = ikVar.ri();
        this.fi = ikVar.lr();
        this.di = ikVar.ik();
        this.jbs = ikVar.co();
        this.qt = ikVar.bgr();
        this.sf = ikVar.vr();
        return this;
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public int xha() {
        return this.sf;
    }

    public ka ri(ik ikVar, T t, Map<String, String> map, boolean z) {
        this.xha = map;
        this.mj = z;
        return ri(ikVar, t);
    }

    @Override // com.bytedance.sdk.component.fi.sf
    public String ri() {
        return this.lr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.fi.sf
    public void ri(Object obj) {
        this.ka = this.ik;
        this.ik = obj;
    }
}
