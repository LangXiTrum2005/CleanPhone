package com.bytedance.adsdk.lr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class co<V> {
    private final Throwable lr;
    private final V ri;

    public co(V v) {
        this.ri = v;
        this.lr = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        if (ri() != null && ri().equals(coVar.ri())) {
            return true;
        }
        if (lr() == null || coVar.lr() == null) {
            return false;
        }
        return lr().toString().equals(lr().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{ri(), lr()});
    }

    public Throwable lr() {
        return this.lr;
    }

    public V ri() {
        return this.ri;
    }

    public co(Throwable th) {
        this.lr = th;
        this.ri = null;
    }
}
