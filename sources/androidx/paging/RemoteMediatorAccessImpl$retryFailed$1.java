package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "accessorState", "Landroidx/paging/AccessorState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class RemoteMediatorAccessImpl$retryFailed$1 extends Lambda implements Function1<AccessorState<Object, Object>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessorState accessorState = (AccessorState) obj;
        Intrinsics.f(accessorState, "accessorState");
        LoadState loadStateB = accessorState.b(LoadType.X);
        new LoadStates(loadStateB, accessorState.b(LoadType.f7815Y), accessorState.b(LoadType.Z));
        boolean z2 = loadStateB instanceof LoadState.Error;
        throw null;
    }
}
