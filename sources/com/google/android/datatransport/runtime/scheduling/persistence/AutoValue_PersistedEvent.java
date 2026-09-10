package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f16952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventInternal f16953c;

    public AutoValue_PersistedEvent(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.f16951a = j;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f16952b = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.f16953c = eventInternal;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal a() {
        return this.f16953c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long b() {
        return this.f16951a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext c() {
        return this.f16952b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f16951a == persistedEvent.b() && this.f16952b.equals(persistedEvent.c()) && this.f16953c.equals(persistedEvent.a());
    }

    public final int hashCode() {
        long j = this.f16951a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f16952b.hashCode()) * 1000003) ^ this.f16953c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f16951a + ", transportContext=" + this.f16952b + ", event=" + this.f16953c + "}";
    }
}
