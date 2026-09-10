package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f16931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f16932c;
    public final SchedulingModule_WorkSchedulerFactory d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f16933e;
    public final Provider f;
    public final Provider g;

    public Uploader_Factory(InstanceFactory instanceFactory, Provider provider, Provider provider2, SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory, Provider provider3, Provider provider4, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, Provider provider5) {
        this.f16930a = instanceFactory;
        this.f16931b = provider;
        this.f16932c = provider2;
        this.d = schedulingModule_WorkSchedulerFactory;
        this.f16933e = provider3;
        this.f = provider4;
        this.g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Uploader((Context) this.f16930a.f16874a, (BackendRegistry) this.f16931b.get(), (EventStore) this.f16932c.get(), (WorkScheduler) this.d.get(), (Executor) this.f16933e.get(), (SynchronizationGuard) this.f.get(), new WallTimeClock(), new UptimeClock(), (ClientHealthMetricsStore) this.g.get());
    }
}
