package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseExecutors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DirectExecutor implements Executor {
        public static final DirectExecutor X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ DirectExecutor[] f20253Y;

        static {
            DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
            X = directExecutor;
            f20253Y = new DirectExecutor[]{directExecutor};
        }

        public static DirectExecutor valueOf(String str) {
            return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
        }

        public static DirectExecutor[] values() {
            return (DirectExecutor[]) f20253Y.clone();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return DirectExecutor.X;
    }

    public static Executor b(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
