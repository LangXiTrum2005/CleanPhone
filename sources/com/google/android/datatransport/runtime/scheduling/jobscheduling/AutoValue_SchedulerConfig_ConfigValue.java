package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f16914c;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f16915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f16916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f16917c;

        public final SchedulerConfig.ConfigValue a() {
            String strM = this.f16915a == null ? " delta" : "";
            if (this.f16916b == null) {
                strM = strM.concat(" maxAllowedDelay");
            }
            if (this.f16917c == null) {
                strM = android.support.v4.media.a.m(strM, " flags");
            }
            if (strM.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f16915a.longValue(), this.f16916b.longValue(), this.f16917c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set set) {
        this.f16912a = j;
        this.f16913b = j2;
        this.f16914c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long a() {
        return this.f16912a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final Set b() {
        return this.f16914c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long c() {
        return this.f16913b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f16912a == configValue.a() && this.f16913b == configValue.c() && this.f16914c.equals(configValue.b());
    }

    public final int hashCode() {
        long j = this.f16912a;
        int i2 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f16913b;
        return ((i2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f16914c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f16912a + ", maxAllowedDelay=" + this.f16913b + ", flags=" + this.f16914c + "}";
    }
}
