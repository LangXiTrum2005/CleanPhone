package com.bytedance.adsdk.ri.lr.lr.ri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bu implements com.bytedance.adsdk.ri.lr.lr.ri {
    protected com.bytedance.adsdk.ri.lr.ka.ik ik;
    protected com.bytedance.adsdk.ri.lr.lr.ri lr;
    protected com.bytedance.adsdk.ri.lr.lr.ri ri;

    public bu(com.bytedance.adsdk.ri.lr.ka.ik ikVar) {
        this.ik = ikVar;
    }

    public void lr(com.bytedance.adsdk.ri.lr.lr.ri riVar) {
        this.lr = riVar;
    }

    public void ri(com.bytedance.adsdk.ri.lr.lr.ri riVar) {
        this.ri = riVar;
    }

    public String toString() {
        return lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return this.ri.lr() + this.ik.ri() + this.lr.lr();
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.di.OPERATOR_RESULT;
    }
}
