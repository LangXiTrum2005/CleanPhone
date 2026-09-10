package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "saneness", "(Lkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/milliradian;", "attabal", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/milliradian;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class treadless {
    public static final milliradian attabal(CoroutineContext coroutineContext) {
        milliradian milliradianVar = (milliradian) coroutineContext.get(milliradian.INSTANCE);
        if (milliradianVar != null) {
            return milliradianVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final <R> Object saneness(Function1<? super Long, ? extends R> function1, wretchedly.dern<? super R> dernVar) {
        return attabal(dernVar.getContext()).formularize(function1, dernVar);
    }
}
