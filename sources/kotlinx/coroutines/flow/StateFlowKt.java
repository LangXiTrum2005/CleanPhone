package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StateFlowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f44986a = new Symbol("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Symbol f44987b = new Symbol("PENDING");

    public static final MutableStateFlow a(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f45018a;
        }
        return new StateFlowImpl(obj);
    }
}
