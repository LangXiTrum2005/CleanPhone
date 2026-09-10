package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes3.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_DbNameFactory f16955a = new EventStoreModule_DbNameFactory();
    }

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }
}
