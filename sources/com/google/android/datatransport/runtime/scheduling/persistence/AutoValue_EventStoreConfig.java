package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16945c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16946e;
    public final int f;

    public static final class Builder extends EventStoreConfig.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f16947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f16948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f16949c;
        public Long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f16950e;
    }

    public AutoValue_EventStoreConfig(int i2, int i3, int i4, long j, long j2) {
        this.f16944b = j;
        this.f16945c = i2;
        this.d = i3;
        this.f16946e = j2;
        this.f = i4;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final long b() {
        return this.f16946e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int c() {
        return this.f16945c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final int d() {
        return this.f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    public final long e() {
        return this.f16944b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        return this.f16944b == eventStoreConfig.e() && this.f16945c == eventStoreConfig.c() && this.d == eventStoreConfig.a() && this.f16946e == eventStoreConfig.b() && this.f == eventStoreConfig.d();
    }

    public final int hashCode() {
        long j = this.f16944b;
        int i2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f16945c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.f16946e;
        return ((i2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f16944b);
        sb.append(", loadBatchSize=");
        sb.append(this.f16945c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f16946e);
        sb.append(", maxBlobByteSizePerRow=");
        return android.support.v4.media.a.i(this.f, "}", sb);
    }
}
