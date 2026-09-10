package com.bytedance.adsdk.lr.ik.ri;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class bgr<V, O> implements aw<V, O> {
    final List<com.bytedance.adsdk.lr.xha.ri<V>> ri;

    public bgr(List<com.bytedance.adsdk.lr.xha.ri<V>> list) {
        this.ri = list;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public List<com.bytedance.adsdk.lr.xha.ri<V>> ik() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public boolean lr() {
        return this.ri.isEmpty() || (this.ri.size() == 1 && this.ri.get(0).fi());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ri.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.ri.toArray()));
        }
        return sb.toString();
    }
}
