package com.bytedance.adsdk.ugeno.ka.ri;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements ik {
    private List<ka> ri = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.ka.ri.ik
    public void ri(ka kaVar) {
        this.ri.add(kaVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ri.ik
    public void ri(String str) {
        if (this.ri.isEmpty()) {
            return;
        }
        Iterator<ka> it = this.ri.iterator();
        while (it.hasNext()) {
            it.next().ri(str);
        }
    }
}
