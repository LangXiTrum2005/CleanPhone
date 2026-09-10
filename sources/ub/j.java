package ub;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f51968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f51969b;

    static {
        j jVar = new j("INSTANCE", 0);
        f51968a = jVar;
        f51969b = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f51969b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
