package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.WallTimeClock;

/* JADX INFO: loaded from: classes3.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    @Override // javax.inject.Provider
    public final Object get() {
        return SchedulerConfig.b(new WallTimeClock());
    }
}
