package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
class LazySet<T> implements Provider<Set<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f20228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f20229b;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        if (this.f20229b == null) {
            synchronized (this) {
                try {
                    if (this.f20229b == null) {
                        this.f20229b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f20228a.iterator();
                                while (it.hasNext()) {
                                    this.f20229b.add(((Provider) it.next()).get());
                                }
                                this.f20228a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f20229b);
    }
}
