package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ReleaseResourcesReason {
        public static final /* synthetic */ ReleaseResourcesReason[] X = {new ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0), new ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ReleaseResourcesReason EF5;

        public static ReleaseResourcesReason valueOf(String str) {
            return (ReleaseResourcesReason) Enum.valueOf(ReleaseResourcesReason.class, str);
        }

        public static ReleaseResourcesReason[] values() {
            return (ReleaseResourcesReason[]) X.clone();
        }
    }

    static {
        new LazyLogger(AggregateFuture.class);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void d() {
        r();
        boolean z2 = this.X instanceof AbstractFuture.Cancellation;
    }

    public void r() {
    }
}
