package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f16937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f16938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulingModule_WorkSchedulerFactory f16939c;
    public final Provider d;

    public WorkInitializer_Factory(Provider provider, Provider provider2, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, Provider provider3) {
        this.f16937a = provider;
        this.f16938b = provider2;
        this.f16939c = schedulingModule_WorkSchedulerFactory;
        this.d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new WorkInitializer((Executor) this.f16937a.get(), (EventStore) this.f16938b.get(), (WorkScheduler) this.f16939c.get(), (SynchronizationGuard) this.d.get());
    }
}
