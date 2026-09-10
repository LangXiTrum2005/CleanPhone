package com.google.android.datatransport.runtime.scheduling;

import A.F;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultScheduler implements Scheduler {
    public static final Logger f = Logger.getLogger(TransportRuntime.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkScheduler f16898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f16899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendRegistry f16900c;
    public final EventStore d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SynchronizationGuard f16901e;

    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f16899b = executor;
        this.f16900c = backendRegistry;
        this.f16898a = workScheduler;
        this.d = eventStore;
        this.f16901e = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public final void a(TransportContext transportContext, EventInternal eventInternal, TransportScheduleCallback transportScheduleCallback) {
        this.f16899b.execute(new F(this, transportContext, transportScheduleCallback, eventInternal, 26));
    }
}
