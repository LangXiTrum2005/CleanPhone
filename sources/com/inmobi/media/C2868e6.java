package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2868e6 {
    public final ArrayList a;
    public final String b;

    public C2868e6(String payload, ArrayList eventIDs) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.a = eventIDs;
        this.b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2868e6)) {
            return false;
        }
        C2868e6 c2868e6 = (C2868e6) obj;
        return Intrinsics.wireman(this.a, c2868e6.a) && Intrinsics.wireman(this.b, c2868e6.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventPayload(eventIDs=" + this.a + ", payload=" + this.b + ", shouldFlushOnFailure=false)";
    }
}
