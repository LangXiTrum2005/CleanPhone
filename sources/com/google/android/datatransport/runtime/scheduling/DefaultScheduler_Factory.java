package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f16902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f16903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SchedulingModule_WorkSchedulerFactory f16904c;
    public final Provider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f16905e;

    public DefaultScheduler_Factory(Provider provider, Provider provider2, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, Provider provider3, Provider provider4) {
        this.f16902a = provider;
        this.f16903b = provider2;
        this.f16904c = schedulingModule_WorkSchedulerFactory;
        this.d = provider3;
        this.f16905e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DefaultScheduler((Executor) this.f16902a.get(), (BackendRegistry) this.f16903b.get(), (WorkScheduler) this.f16904c.get(), (EventStore) this.d.get(), (SynchronizationGuard) this.f16905e.get());
    }
}
