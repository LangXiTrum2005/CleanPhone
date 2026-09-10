package com.bytedance.adsdk.ugeno.ZU.Lxb;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class LD implements lk {
    private List<ZU> Lxb = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.ZU.Lxb.lk
    public void Lxb(ZU zu) {
        this.Lxb.add(zu);
    }

    @Override // com.bytedance.adsdk.ugeno.ZU.Lxb.lk
    public void Lxb(String str) {
        if (this.Lxb.isEmpty()) {
            return;
        }
        Iterator<ZU> it = this.Lxb.iterator();
        while (it.hasNext()) {
            it.next().Lxb(str);
        }
    }
}
