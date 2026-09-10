package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Executor f17941attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Executor f17942saneness = new saneness();

    /* JADX INFO: compiled from: Executors.java */
    public class attabal implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            formularize.gintrap(runnable);
        }
    }

    /* JADX INFO: compiled from: Executors.java */
    public class saneness implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor attabal() {
        return f17942saneness;
    }

    public static Executor saneness() {
        return f17941attabal;
    }
}
