package com.bytedance.sdk.component.di.ri.ka.ri;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements com.bytedance.sdk.component.di.ri.ka.ri {
    private long di;
    private long fi;
    private byte ik;
    private byte jbs;
    private byte ka;
    private lr lr;
    private String mj;
    private String qt;
    protected JSONObject ri;
    private int sf;
    private long xha;

    public ri(String str, JSONObject jSONObject) {
        this.mj = str;
        this.ri = jSONObject;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public synchronized JSONObject di() {
        lr lrVar;
        try {
            if (this.ri == null && (lrVar = this.lr) != null) {
                this.ri = lrVar.ri(qt());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public byte fi() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public String ik() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public int jbs() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public byte ka() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public byte lr() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public long mj() {
        return this.di;
    }

    public String qt() {
        return this.qt;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public lr ri() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public long xha() {
        return this.fi;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public void ik(long j) {
        this.xha = j;
    }

    public void lr(byte b) {
        this.ik = b;
    }

    public void ri(byte b) {
        this.jbs = b;
    }

    public void ik(byte b) {
        this.ka = b;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public void lr(long j) {
        this.di = j;
    }

    @Override // com.bytedance.sdk.component.di.ri.ka.ri
    public void ri(long j) {
        this.fi = j;
    }

    public ri(String str, lr lrVar) {
        this.mj = str;
        this.lr = lrVar;
    }

    public void ri(int i) {
        this.sf = i;
    }

    private ri() {
    }
}
