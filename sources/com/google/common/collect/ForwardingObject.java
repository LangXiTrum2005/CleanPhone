package com.google.common.collect;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingObject {
    public String toString() {
        return w().toString();
    }

    public abstract Object w();
}
