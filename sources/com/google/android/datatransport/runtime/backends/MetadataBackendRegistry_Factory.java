package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationContextFactory_Factory f16870b;

    public MetadataBackendRegistry_Factory(InstanceFactory instanceFactory, CreationContextFactory_Factory creationContextFactory_Factory) {
        this.f16869a = instanceFactory;
        this.f16870b = creationContextFactory_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MetadataBackendRegistry((Context) this.f16869a.f16874a, (CreationContextFactory) this.f16870b.get());
    }
}
