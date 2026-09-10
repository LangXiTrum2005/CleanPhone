package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f16907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulingConfigModule_ConfigFactory f16908c;

    public SchedulingModule_WorkSchedulerFactory(InstanceFactory instanceFactory, Provider provider, SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f16906a = instanceFactory;
        this.f16907b = provider;
        this.f16908c = schedulingConfigModule_ConfigFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new JobInfoScheduler((Context) this.f16906a.f16874a, (EventStore) this.f16907b.get(), (SchedulerConfig) this.f16908c.get());
    }
}
