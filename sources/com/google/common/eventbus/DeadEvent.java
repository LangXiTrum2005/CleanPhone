package com.google.common.eventbus;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class DeadEvent {
    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.b(null, "source");
        toStringHelperB.b(null, "event");
        return toStringHelperB.toString();
    }
}
