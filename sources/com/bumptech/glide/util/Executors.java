package com.bumptech.glide.util;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Executors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f12837a = new AnonymousClass1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f12838b = new AnonymousClass2();

    /* JADX INFO: renamed from: com.bumptech.glide.util.Executors$1, reason: invalid class name */
    public class AnonymousClass1 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Util.f().post(runnable);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.Executors$2, reason: invalid class name */
    public class AnonymousClass2 implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
