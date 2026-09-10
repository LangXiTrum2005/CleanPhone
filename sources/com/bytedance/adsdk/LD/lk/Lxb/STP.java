package com.bytedance.adsdk.LD.lk.Lxb;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class STP<V, O> implements NXR<V, O> {
    final List<com.bytedance.adsdk.LD.ebl.Lxb<V>> Lxb;

    public STP(List<com.bytedance.adsdk.LD.ebl.Lxb<V>> list) {
        this.Lxb = list;
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public boolean LD() {
        return this.Lxb.isEmpty() || (this.Lxb.size() == 1 && this.Lxb.get(0).JXs());
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public List<com.bytedance.adsdk.LD.ebl.Lxb<V>> lk() {
        return this.Lxb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.Lxb.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.Lxb.toArray()));
        }
        return sb.toString();
    }
}
