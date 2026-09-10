package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f20245Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.Z = obj;
        this.f20245Y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Deferred.DeferredHandler deferredHandler;
        switch (this.X) {
            case 0:
                OptionalProvider optionalProvider = (OptionalProvider) this.Z;
                Provider provider = (Provider) this.f20245Y;
                if (optionalProvider.f20232b != OptionalProvider.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (optionalProvider) {
                    deferredHandler = optionalProvider.f20231a;
                    optionalProvider.f20231a = null;
                    optionalProvider.f20232b = provider;
                    break;
                }
                deferredHandler.c(provider);
                return;
            case 1:
                LazySet lazySet = (LazySet) this.Z;
                Provider provider2 = (Provider) this.f20245Y;
                synchronized (lazySet) {
                    try {
                        if (lazySet.f20229b == null) {
                            lazySet.f20228a.add(provider2);
                        } else {
                            lazySet.f20229b.add(provider2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((EventHandler) ((Map.Entry) this.Z).getKey()).a((Event) this.f20245Y);
                throw null;
        }
    }
}
