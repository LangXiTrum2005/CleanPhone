package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends SchedulerConfig.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f19313attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f19314dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f19315saneness;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    public static final class C0293saneness extends SchedulerConfig.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Long f19316attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f19317dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Long f19318saneness;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness.attabal
        public SchedulerConfig.saneness attabal() {
            String str = "";
            if (this.f19316attabal == null) {
                str = " delta";
            }
            if (this.f19318saneness == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f19317dern == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new saneness(this.f19316attabal.longValue(), this.f19318saneness.longValue(), this.f19317dern);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness.attabal
        public SchedulerConfig.saneness.attabal dern(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f19317dern = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness.attabal
        public SchedulerConfig.saneness.attabal saneness(long j) {
            this.f19316attabal = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness.attabal
        public SchedulerConfig.saneness.attabal wireman(long j) {
            this.f19318saneness = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness
    public Set<SchedulerConfig.Flag> dern() {
        return this.f19314dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.saneness) {
            SchedulerConfig.saneness sanenessVar = (SchedulerConfig.saneness) obj;
            if (this.f19313attabal == sanenessVar.saneness() && this.f19315saneness == sanenessVar.wireman() && this.f19314dern.equals(sanenessVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f19313attabal;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f19315saneness;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19314dern.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness
    public long saneness() {
        return this.f19313attabal;
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f19313attabal + ", maxAllowedDelay=" + this.f19315saneness + ", flags=" + this.f19314dern + "}";
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.saneness
    public long wireman() {
        return this.f19315saneness;
    }

    public saneness(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f19313attabal = j;
        this.f19315saneness = j2;
        this.f19314dern = set;
    }
}
