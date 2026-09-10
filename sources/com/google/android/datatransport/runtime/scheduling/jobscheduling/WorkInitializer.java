package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class WorkInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventStore f16935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkScheduler f16936c;
    public final SynchronizationGuard d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f16934a = executor;
        this.f16935b = eventStore;
        this.f16936c = workScheduler;
        this.d = synchronizationGuard;
    }
}
