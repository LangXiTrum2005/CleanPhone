package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;

/* JADX INFO: loaded from: classes3.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16863a;

    public CreationContextFactory_Factory(InstanceFactory instanceFactory, TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory) {
        this.f16863a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new CreationContextFactory((Context) this.f16863a.f16874a, new WallTimeClock(), new UptimeClock());
    }
}
