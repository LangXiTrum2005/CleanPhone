package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16965a;

    public SchemaManager_Factory(InstanceFactory instanceFactory) {
        this.f16965a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new SchemaManager((Context) this.f16965a.f16874a, "com.google.android.datatransport.events", Integer.valueOf(SchemaManager.e0).intValue());
    }
}
