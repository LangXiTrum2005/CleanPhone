package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectImplementation;", "R", "Lkotlinx/coroutines/selects/SelectImplementation;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UnbiasedSelectImplementation<R> extends SelectImplementation<R> {
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // kotlinx.coroutines.selects.SelectImplementation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r1) {
        /*
            r0 = this;
            r1 = 0
            java.util.Collections.shuffle(r1)     // Catch: java.lang.Throwable -> L5
            throw r1     // Catch: java.lang.Throwable -> L5
        L5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.UnbiasedSelectImplementation.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.SelectImplementation
    public final void j(SelectClause1 selectClause1, Function2 function2) {
        throw null;
    }
}
