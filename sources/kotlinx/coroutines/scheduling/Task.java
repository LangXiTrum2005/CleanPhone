package kotlinx.coroutines.scheduling;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/scheduling/Task;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Task implements Runnable {
    public long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f45065Y;

    public Task(long j, boolean z2) {
        this.X = j;
        this.f45065Y = z2;
    }
}
