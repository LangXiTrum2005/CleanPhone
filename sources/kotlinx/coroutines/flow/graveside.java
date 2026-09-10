package kotlinx.coroutines.flow;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/flow/graveside;", "", "Lkotlinx/coroutines/flow/dovishness;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/dern;", "Lkotlinx/coroutines/flow/SharingCommand;", "attabal", "(Lkotlinx/coroutines/flow/dovishness;)Lkotlinx/coroutines/flow/dern;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32277attabal;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.graveside$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/graveside$attabal;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/graveside;", "attabal", "(JJ)Lkotlinx/coroutines/flow/graveside;", "saneness", "Lkotlinx/coroutines/flow/graveside;", "dern", "()Lkotlinx/coroutines/flow/graveside;", "Eagerly", "wireman", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f32277attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final graveside Eagerly = new adultoid();

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public static final graveside Lazily = new StartedLazily();

        public static /* synthetic */ graveside saneness(Companion companion, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return companion.attabal(j, j2);
        }

        public final graveside attabal(long stopTimeoutMillis, long replayExpirationMillis) {
            return new StartedWhileSubscribed(stopTimeoutMillis, replayExpirationMillis);
        }

        public final graveside dern() {
            return Eagerly;
        }

        public final graveside wireman() {
            return Lazily;
        }
    }

    dern<SharingCommand> attabal(dovishness<Integer> subscriptionCount);
}
