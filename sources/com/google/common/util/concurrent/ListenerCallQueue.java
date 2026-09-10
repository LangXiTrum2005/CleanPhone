package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ListenerCallQueue<L> {

    public interface Event<L> {
    }

    public static final class PerListenerQueue<L> implements Runnable {
        public boolean X;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                synchronized (this) {
                    Preconditions.p(this.X);
                    throw null;
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.X = false;
                    throw th;
                }
            }
        }
    }

    static {
        new LazyLogger(ListenerCallQueue.class);
    }
}
