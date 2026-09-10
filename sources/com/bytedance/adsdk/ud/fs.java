package com.bytedance.adsdk.ud;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fs<V> {
    private final V qdl;
    private final Throwable ud;

    public fs(V v) {
        this.qdl = v;
        this.ud = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        if (qdl() != null && qdl().equals(fsVar.qdl())) {
            return true;
        }
        if (ud() == null || fsVar.ud() == null) {
            return false;
        }
        return ud().toString().equals(ud().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{qdl(), ud()});
    }

    public V qdl() {
        return this.qdl;
    }

    public Throwable ud() {
        return this.ud;
    }

    public fs(Throwable th) {
        this.ud = th;
        this.qdl = null;
    }
}
