package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class DirectExecutor implements Executor {
    public static final DirectExecutor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f20121Y;

    static {
        DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
        X = directExecutor;
        f20121Y = new DirectExecutor[]{directExecutor};
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f20121Y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
