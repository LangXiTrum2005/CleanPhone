package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u00042\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "prependHint", "Landroidx/paging/HintHandler$HintFlow;", "Landroidx/paging/HintHandler;", "appendHint", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class HintHandler$processHint$1 extends Lambda implements Function2<HintHandler.HintFlow, HintHandler.HintFlow, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HintHandler.HintFlow prependHint = (HintHandler.HintFlow) obj;
        HintHandler.HintFlow appendHint = (HintHandler.HintFlow) obj2;
        Intrinsics.f(prependHint, "prependHint");
        Intrinsics.f(appendHint, "appendHint");
        if (HintHandlerKt.a(null, prependHint.f7805a, LoadType.f7815Y)) {
            prependHint.f7805a = null;
            throw null;
        }
        if (!HintHandlerKt.a(null, appendHint.f7805a, LoadType.Z)) {
            return Unit.f43263a;
        }
        appendHint.f7805a = null;
        throw null;
    }
}
