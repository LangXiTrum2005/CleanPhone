package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f16910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f16911b;

    public AutoValue_SchedulerConfig(Clock clock, HashMap map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f16910a = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f16911b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Clock a() {
        return this.f16910a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map d() {
        return this.f16911b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f16910a.equals(schedulerConfig.a()) && this.f16911b.equals(schedulerConfig.d());
    }

    public final int hashCode() {
        return ((this.f16910a.hashCode() ^ 1000003) * 1000003) ^ this.f16911b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f16910a + ", values=" + this.f16911b + "}";
    }
}
