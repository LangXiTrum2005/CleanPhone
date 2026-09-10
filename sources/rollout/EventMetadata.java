package rollout;

import com.ironsource.C3414a2;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rollout.dern, reason: from toString */
/* JADX INFO: compiled from: EventMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lrollout/dern;", "", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "timestamp", "", "additionalCustomKeys", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "saneness", "J", "dern", "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventMetadata {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String sessionId;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final Map<String, String> additionalCustomKeys;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventMetadata(String sessionId, long j) {
        this(sessionId, j, null, 4, null);
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
    }

    public final Map<String, String> attabal() {
        return this.additionalCustomKeys;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return Intrinsics.wireman(this.sessionId, eventMetadata.sessionId) && this.timestamp == eventMetadata.timestamp && Intrinsics.wireman(this.additionalCustomKeys, eventMetadata.additionalCustomKeys);
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.additionalCustomKeys.hashCode();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", additionalCustomKeys=" + this.additionalCustomKeys + ')';
    }

    public EventMetadata(String sessionId, long j, Map<String, String> additionalCustomKeys) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.sessionId = sessionId;
        this.timestamp = j;
        this.additionalCustomKeys = additionalCustomKeys;
    }

    public /* synthetic */ EventMetadata(String str, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? seminary.taiyuan() : map);
    }
}
