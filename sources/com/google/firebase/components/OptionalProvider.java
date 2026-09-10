package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.common.net.a f20230c = new com.google.common.net.a(6);
    public static final b d = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Deferred.DeferredHandler f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider f20232b;

    public OptionalProvider(com.google.common.net.a aVar, Provider provider) {
        this.f20231a = aVar;
        this.f20232b = provider;
    }

    @Override // com.google.firebase.inject.Deferred
    public final void a(final Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.f20232b;
        b bVar = d;
        if (provider3 != bVar) {
            deferredHandler.c(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f20232b;
            if (provider != bVar) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f20231a;
                this.f20231a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.e
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void c(Provider provider4) {
                        deferredHandler2.c(provider4);
                        deferredHandler.c(provider4);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.c(provider);
        }
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.f20232b.get();
    }
}
