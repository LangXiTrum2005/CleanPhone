package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstanceFactory f16956a;

    public EventStoreModule_PackageNameFactory(InstanceFactory instanceFactory) {
        this.f16956a = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        String packageName = ((Context) this.f16956a.f16874a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
