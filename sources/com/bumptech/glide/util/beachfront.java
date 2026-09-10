package com.bumptech.glide.util;

/* JADX INFO: compiled from: GlideSuppliers.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: GlideSuppliers.java */
    public class attabal<T> implements saneness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public volatile T f17924attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ saneness f17925saneness;

        public attabal(saneness sanenessVar) {
            this.f17925saneness = sanenessVar;
        }

        @Override // com.bumptech.glide.util.beachfront.saneness
        public T get() {
            if (this.f17924attabal == null) {
                synchronized (this) {
                    try {
                        if (this.f17924attabal == null) {
                            this.f17924attabal = (T) apical.wireman(this.f17925saneness.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f17924attabal;
        }
    }

    /* JADX INFO: compiled from: GlideSuppliers.java */
    public interface saneness<T> {
        T get();
    }

    public static <T> saneness<T> attabal(saneness<T> sanenessVar) {
        return new attabal(sanenessVar);
    }
}
