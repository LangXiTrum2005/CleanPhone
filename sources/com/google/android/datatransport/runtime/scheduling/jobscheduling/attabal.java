package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal extends SchedulerConfig {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final bramley.attabal f19311attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.saneness> f19312saneness;

    public attabal(bramley.attabal attabalVar, Map<Priority, SchedulerConfig.saneness> map) {
        if (attabalVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f19311attabal = attabalVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f19312saneness = map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.f19311attabal.equals(schedulerConfig.marial()) && this.f19312saneness.equals(schedulerConfig.impromptu())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19311attabal.hashCode() ^ 1000003) * 1000003) ^ this.f19312saneness.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.saneness> impromptu() {
        return this.f19312saneness;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public bramley.attabal marial() {
        return this.f19311attabal;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f19311attabal + ", values=" + this.f19312saneness + "}";
    }
}
