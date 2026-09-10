package ub;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f51976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f51977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f51978c;

    static {
        l lVar = new l("INSTANCE", 0);
        f51976a = lVar;
        f51978c = new l[]{lVar};
        f51977b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f51978c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f51977b.post(runnable);
    }
}
