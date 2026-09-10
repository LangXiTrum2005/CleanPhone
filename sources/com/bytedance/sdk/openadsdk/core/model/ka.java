package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private com.bytedance.sdk.openadsdk.core.aw.ka ri = new com.bytedance.sdk.openadsdk.core.aw.ka();
    private Set<com.bytedance.sdk.openadsdk.core.aw.qt> lr = new HashSet();

    public Set<com.bytedance.sdk.openadsdk.core.aw.qt> lr() {
        return this.lr;
    }

    public com.bytedance.sdk.openadsdk.core.aw.ka ri() {
        return this.ri;
    }

    public void lr(Set<com.bytedance.sdk.openadsdk.core.aw.qt> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.lr.addAll(set);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.aw.ka kaVar) {
        if (kaVar == null) {
            kaVar = new com.bytedance.sdk.openadsdk.core.aw.ka();
        }
        this.ri = kaVar;
    }

    public void ri(Set<com.bytedance.sdk.openadsdk.core.aw.qt> set) {
        this.lr = set;
    }

    public void ri(wjv wjvVar) {
        com.bytedance.sdk.openadsdk.core.aw.ka kaVar = this.ri;
        if (kaVar != null) {
            kaVar.ri(wjvVar);
        }
    }
}
