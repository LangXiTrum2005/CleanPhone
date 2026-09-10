package com.google.firebase.crashlytics.internal.metadata;

import com.applovin.impl.Z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/metadata/EventMetadata;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20388c;

    public EventMetadata(String str, long j) {
        Map map = EmptyMap.X;
        this.f20386a = str;
        this.f20387b = j;
        this.f20388c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return Intrinsics.a(this.f20386a, eventMetadata.f20386a) && this.f20387b == eventMetadata.f20387b && Intrinsics.a(this.f20388c, eventMetadata.f20388c);
    }

    public final int hashCode() {
        return this.f20388c.hashCode() + androidx.media3.extractor.text.ttml.a.b(this.f20386a.hashCode() * 31, 31, this.f20387b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.f20386a);
        sb.append(", timestamp=");
        sb.append(this.f20387b);
        sb.append(", additionalCustomKeys=");
        return Z.o(sb, this.f20388c, ')');
    }
}
