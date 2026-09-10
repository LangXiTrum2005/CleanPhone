package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SingleRunner;", "", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleRunner {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {
        public final SingleRunner X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner runner) {
            super("Cancelled isolated runner");
            Intrinsics.f(runner, "runner");
            this.X = runner;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/SingleRunner$Companion;", "", "", "DEFAULT_PRIORITY", "I", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Holder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Job f7879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7880b;
    }
}
