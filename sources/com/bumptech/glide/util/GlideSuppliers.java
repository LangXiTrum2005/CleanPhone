package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlideSuppliers {

    public interface GlideSupplier<T> {
        Object get();
    }

    public static GlideSupplier a(final GlideSupplier glideSupplier) {
        return new GlideSupplier<Object>() { // from class: com.bumptech.glide.util.GlideSuppliers.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile Object f12839a;

            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public final Object get() {
                if (this.f12839a == null) {
                    synchronized (this) {
                        try {
                            if (this.f12839a == null) {
                                Object obj = glideSupplier.get();
                                Preconditions.c(obj, "Argument must not be null");
                                this.f12839a = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return this.f12839a;
            }
        };
    }
}
