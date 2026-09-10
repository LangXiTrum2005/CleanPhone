package com.google.firebase.inject;

/* JADX INFO: loaded from: classes4.dex */
public interface Deferred<T> {

    public interface DeferredHandler<T> {
        void c(Provider provider);
    }

    void a(DeferredHandler deferredHandler);
}
