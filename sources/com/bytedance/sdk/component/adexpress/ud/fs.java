package com.bytedance.sdk.component.adexpress.ud;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class fs implements to.qdl {
    private tvp lnr;
    private AtomicBoolean mml = new AtomicBoolean(false);
    bjy qdl;
    private List<to> ud;

    public fs(List<to> list, tvp tvpVar) {
        this.ud = list;
        this.lnr = tvpVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public boolean lnr() {
        return this.mml.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl() {
        this.lnr.mml();
        Iterator<to> it = this.ud.iterator();
        while (it.hasNext() && !it.next().qdl(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public boolean ud(to toVar) {
        int iIndexOf = this.ud.indexOf(toVar);
        return iIndexOf < this.ud.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public bjy ud() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(to toVar) {
        int iIndexOf = this.ud.indexOf(toVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.ud.size()) {
                return;
            }
        } while (!this.ud.get(iIndexOf).qdl(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(bjy bjyVar) {
        this.qdl = bjyVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ud.to.qdl
    public void qdl(boolean z2) {
        this.mml.getAndSet(z2);
    }
}
