package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f24441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ p0[] f24442b;

    static {
        p0 p0Var = new p0("INSTANCE", 0);
        f24441a = p0Var;
        f24442b = new p0[]{p0Var};
    }

    public static p0[] values() {
        return (p0[]) f24442b.clone();
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
