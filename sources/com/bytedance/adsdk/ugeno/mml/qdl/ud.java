package com.bytedance.adsdk.ugeno.mml.qdl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ud implements lnr {
    private List<mml> qdl = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.mml.qdl.lnr
    public void qdl(mml mmlVar) {
        this.qdl.add(mmlVar);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.qdl.lnr
    public void qdl(String str) {
        if (this.qdl.isEmpty()) {
            return;
        }
        Iterator<mml> it = this.qdl.iterator();
        while (it.hasNext()) {
            it.next().qdl(str);
        }
    }
}
