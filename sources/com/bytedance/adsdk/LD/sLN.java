package com.bytedance.adsdk.LD;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sLN<V> {
    private final Throwable LD;
    private final V Lxb;

    public sLN(V v) {
        this.Lxb = v;
        this.LD = null;
    }

    public Throwable LD() {
        return this.LD;
    }

    public V Lxb() {
        return this.Lxb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sLN)) {
            return false;
        }
        sLN sln = (sLN) obj;
        if (Lxb() != null && Lxb().equals(sln.Lxb())) {
            return true;
        }
        if (LD() == null || sln.LD() == null) {
            return false;
        }
        return LD().toString().equals(LD().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Lxb(), LD()});
    }

    public sLN(Throwable th) {
        this.LD = th;
        this.Lxb = null;
    }
}
