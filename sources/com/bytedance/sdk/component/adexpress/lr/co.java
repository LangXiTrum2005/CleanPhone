package com.bytedance.sdk.component.adexpress.lr;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class co implements qt.ri {
    private jbs ik;
    private AtomicBoolean ka = new AtomicBoolean(false);
    private List<qt> lr;
    vr ri;

    public co(List<qt> list, jbs jbsVar) {
        this.lr = list;
        this.ik = jbsVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public boolean ik() {
        return this.ka.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public boolean lr(qt qtVar) {
        int iIndexOf = this.lr.indexOf(qtVar);
        return iIndexOf < this.lr.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public void ri() {
        this.ik.ka();
        Iterator<qt> it = this.lr.iterator();
        while (it.hasNext() && !it.next().ri(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public vr lr() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public void ri(qt qtVar) {
        int iIndexOf = this.lr.indexOf(qtVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.lr.size()) {
                return;
            }
        } while (!this.lr.get(iIndexOf).ri(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public void ri(vr vrVar) {
        this.ri = vrVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.qt.ri
    public void ri(boolean z) {
        this.ka.getAndSet(z);
    }
}
