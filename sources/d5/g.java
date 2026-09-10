package d5;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f38693b;

    static {
        g gVar = new g("INSTANCE", 0);
        f38692a = gVar;
        f38693b = new g[]{gVar};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f38693b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.n.f(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
