package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_StoreConfigFactory f16958a = new EventStoreModule_StoreConfigFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AutoValue_EventStoreConfig autoValue_EventStoreConfig = EventStoreConfig.f16954a;
        if (autoValue_EventStoreConfig != null) {
            return autoValue_EventStoreConfig;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
