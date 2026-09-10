package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16871c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Factory f16872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16873b;

    public static Provider a(Factory factory) {
        if (factory instanceof DoubleCheck) {
            return factory;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.f16873b = f16871c;
        doubleCheck.f16872a = factory;
        return doubleCheck;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f16873b;
        Object obj3 = f16871c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16873b;
                if (obj == obj3) {
                    obj = this.f16872a.get();
                    Object obj4 = this.f16873b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16873b = obj;
                    this.f16872a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
