package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public class Lazy<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20225c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f20226a = f20225c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider f20227b;

    public Lazy(Provider provider) {
        this.f20227b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f20226a;
        Object obj3 = f20225c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f20226a;
                if (obj == obj3) {
                    obj = this.f20227b.get();
                    this.f20226a = obj;
                    this.f20227b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
