package com.bytedance.adsdk.ud.lnr.qdl;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class rdp<V, O> implements exu<V, O> {
    final List<com.bytedance.adsdk.ud.wd.qdl<V>> qdl;

    public rdp(List<com.bytedance.adsdk.ud.wd.qdl<V>> list) {
        this.qdl = list;
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public List<com.bytedance.adsdk.ud.wd.qdl<V>> lnr() {
        return this.qdl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.qdl.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.qdl.toArray()));
        }
        return sb.toString();
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public boolean ud() {
        return this.qdl.isEmpty() || (this.qdl.size() == 1 && this.qdl.get(0).mzz());
    }
}
