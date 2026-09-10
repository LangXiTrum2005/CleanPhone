package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;

/* JADX INFO: loaded from: classes3.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultScheduler_Factory f16847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uploader_Factory f16848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkInitializer_Factory f16849c;

    public TransportRuntime_Factory(TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, DefaultScheduler_Factory defaultScheduler_Factory, Uploader_Factory uploader_Factory, WorkInitializer_Factory workInitializer_Factory) {
        this.f16847a = defaultScheduler_Factory;
        this.f16848b = uploader_Factory;
        this.f16849c = workInitializer_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TransportRuntime(new WallTimeClock(), new UptimeClock(), (Scheduler) this.f16847a.get(), (Uploader) this.f16848b.get(), (WorkInitializer) this.f16849c.get());
    }
}
