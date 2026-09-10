package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_SchemaVersionFactory f16957a = new EventStoreModule_SchemaVersionFactory();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return Integer.valueOf(SchemaManager.e0);
    }
}
