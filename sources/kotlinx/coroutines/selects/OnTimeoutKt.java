package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OnTimeoutKt {
    public static final void a(SelectImplementation selectImplementation, long j, Function1 function1) {
        OnTimeout onTimeout = new OnTimeout(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.X;
        TypeIntrinsics.d(3, onTimeout$selectClause$1);
        SelectClause0Impl selectClause0Impl = new SelectClause0Impl(onTimeout);
        selectImplementation.k(new SelectImplementation.ClauseData(selectClause0Impl.f45077a, onTimeout$selectClause$1, selectClause0Impl.f45079c, SelectKt.f, function1, null), false);
    }
}
