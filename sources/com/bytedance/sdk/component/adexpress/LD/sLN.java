package com.bytedance.sdk.component.adexpress.LD;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class sLN implements nBu.Lxb {

    @NonNull
    private List<nBu> LD;
    IeN Lxb;
    private AtomicBoolean ZU = new AtomicBoolean(false);
    private QAg lk;

    public sLN(List<nBu> list, QAg qAg) {
        this.LD = list;
        this.lk = qAg;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public boolean LD(nBu nbu) {
        int iIndexOf = this.LD.indexOf(nbu);
        return iIndexOf < this.LD.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public void Lxb() {
        this.lk.ZU();
        Iterator<nBu> it = this.LD.iterator();
        while (it.hasNext() && !it.next().Lxb(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public boolean lk() {
        return this.ZU.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public IeN LD() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public void Lxb(nBu nbu) {
        int iIndexOf = this.LD.indexOf(nbu);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.LD.size()) {
                return;
            }
        } while (!this.LD.get(iIndexOf).Lxb(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public void Lxb(IeN ieN) {
        this.Lxb = ieN;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.nBu.Lxb
    public void Lxb(boolean z) {
        this.ZU.getAndSet(z);
    }
}
