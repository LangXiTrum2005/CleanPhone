package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import com.google.android.datatransport.runtime.time.UptimeClock;
import com.google.android.datatransport.runtime.time.WallTimeClock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemaManager_Factory f16962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f16963b;

    public SQLiteEventStore_Factory(TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, SchemaManager_Factory schemaManager_Factory, Provider provider) {
        this.f16962a = schemaManager_Factory;
        this.f16963b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SQLiteEventStore(new WallTimeClock(), new UptimeClock(), (EventStoreConfig) EventStoreModule_StoreConfigFactory.InstanceHolder.f16958a.get(), (SchemaManager) this.f16962a.get(), this.f16963b);
    }
}
