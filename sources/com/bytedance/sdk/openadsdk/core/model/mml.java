package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class mml {
    private com.bytedance.sdk.openadsdk.core.fs.mml qdl = new com.bytedance.sdk.openadsdk.core.fs.mml();
    private Set<com.bytedance.sdk.openadsdk.core.fs.to> ud = new HashSet();

    public com.bytedance.sdk.openadsdk.core.fs.mml qdl() {
        return this.qdl;
    }

    public Set<com.bytedance.sdk.openadsdk.core.fs.to> ud() {
        return this.ud;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.fs.mml mmlVar) {
        if (mmlVar == null) {
            mmlVar = new com.bytedance.sdk.openadsdk.core.fs.mml();
        }
        this.qdl = mmlVar;
    }

    public void ud(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.ud.addAll(set);
    }

    public void qdl(Set<com.bytedance.sdk.openadsdk.core.fs.to> set) {
        this.ud = set;
    }

    public void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.qdl(ljhVar);
        }
    }
}
