package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreInMemoryCache<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f4643a = StateFlowKt.a(UnInitialized.f4695b);

    public final State a() {
        return (State) this.f4643a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public final void b(State newState) {
        Object value;
        State state;
        Intrinsics.f(newState, "newState");
        MutableStateFlow mutableStateFlow = this.f4643a;
        do {
            value = mutableStateFlow.getValue();
            state = (State) value;
            if (state instanceof ReadException ? true : Intrinsics.a(state, UnInitialized.f4695b)) {
                state = newState;
            } else if (state instanceof Data) {
                if (newState.f4693a > state.f4693a) {
                    state = newState;
                }
            } else if (!(state instanceof Final)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!mutableStateFlow.compareAndSet(value, state));
    }
}
