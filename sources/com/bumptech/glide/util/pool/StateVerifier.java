package com.bumptech.glide.util.pool;

/* JADX INFO: loaded from: classes.dex */
public abstract class StateVerifier {

    public static class DebugStateVerifier extends StateVerifier {
        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void b() {
            throw null;
        }
    }

    public static class DefaultStateVerifier extends StateVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f12859a;

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public final void b() {
            if (this.f12859a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static StateVerifier a() {
        return new DefaultStateVerifier();
    }

    public abstract void b();
}
