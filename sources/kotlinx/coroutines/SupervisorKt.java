package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SupervisorKt {
    public static final CompletableJob a(Job job) {
        return new SupervisorJobImpl(job);
    }

    public static CompletableJob b() {
        return new SupervisorJobImpl(null);
    }
}
