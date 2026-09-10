package com.bytedance.sdk.openadsdk.ka.ri;

/* JADX INFO: loaded from: classes2.dex */
class fi implements com.bytedance.sdk.component.di.ri.fi.ka {
    private final com.bytedance.sdk.component.xha.lr ri;

    public fi(com.bytedance.sdk.component.xha.lr lrVar) {
        this.ri = lrVar;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ka
    public String ik() {
        com.bytedance.sdk.component.xha.lr lrVar = this.ri;
        return lrVar != null ? lrVar.lr() : "";
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ka
    public int lr() {
        com.bytedance.sdk.component.xha.lr lrVar = this.ri;
        if (lrVar != null) {
            return lrVar.ri();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.di.ri.fi.ka
    public boolean ri() {
        com.bytedance.sdk.component.xha.lr lrVar = this.ri;
        if (lrVar != null) {
            return lrVar.di();
        }
        return false;
    }
}
