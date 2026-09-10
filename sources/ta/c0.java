package ta;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f50592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c0[] f50593b;

    static {
        c0 c0Var = new c0("INSTANCE", 0);
        f50592a = c0Var;
        f50593b = new c0[]{c0Var};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f50593b.clone();
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
