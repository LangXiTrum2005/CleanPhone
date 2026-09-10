package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final td1 f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ td1[] f20334b;

    static {
        td1 td1Var = new td1("INSTANCE", 0);
        f20333a = td1Var;
        f20334b = new td1[]{td1Var};
    }

    public static td1[] values() {
        return (td1[]) f20334b.clone();
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
