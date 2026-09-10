package com.bytedance.sdk.openadsdk.ka.ri;

/* JADX INFO: loaded from: classes2.dex */
class ik implements com.bytedance.sdk.component.di.ri.fi.ik {
    private final com.bytedance.sdk.component.xha.lr.lr ri;

    public ik() {
        com.bytedance.sdk.component.xha.lr.lr lrVarIk = com.bytedance.sdk.openadsdk.ac.lr.lr().ik().ik();
        this.ri = lrVarIk;
        lrVarIk.ri(7);
        lrVarIk.lr("track_url");
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ik
    public void ri(String str) {
        this.ri.ik(str);
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ik
    public void ri(String str, String str2) {
        this.ri.lr(str, str2);
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ik
    public com.bytedance.sdk.component.di.ri.fi.ka ri() {
        return new fi(this.ri.ri());
    }
}
