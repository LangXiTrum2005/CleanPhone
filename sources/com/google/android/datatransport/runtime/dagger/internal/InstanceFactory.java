package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16874a;

    public InstanceFactory(Object obj) {
        this.f16874a = obj;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f16874a;
    }
}
