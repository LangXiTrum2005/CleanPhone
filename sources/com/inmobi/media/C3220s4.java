package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3220s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23980b;

    public C3220s4(ArrayList eventIDs, String payload) {
        Intrinsics.f(eventIDs, "eventIDs");
        Intrinsics.f(payload, "payload");
        this.f23979a = eventIDs;
        this.f23980b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3220s4)) {
            return false;
        }
        C3220s4 c3220s4 = (C3220s4) obj;
        return Intrinsics.a(this.f23979a, c3220s4.f23979a) && Intrinsics.a(this.f23980b, c3220s4.f23980b);
    }

    public final int hashCode() {
        return androidx.datastore.preferences.protobuf.a.b(this.f23980b, this.f23979a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventPayload(eventIDs=");
        sb.append(this.f23979a);
        sb.append(", payload=");
        return android.support.v4.media.a.r(sb, this.f23980b, ", shouldFlushOnFailure=false)");
    }
}
