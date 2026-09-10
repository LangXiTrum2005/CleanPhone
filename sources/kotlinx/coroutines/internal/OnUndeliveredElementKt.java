package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002**\b\u0000\u0010\u0003\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004"}, d2 = {"E", "Lkotlin/Function1;", "", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OnUndeliveredElementKt {
    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException undeliveredElementException = null;
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            undeliveredElementException = new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
        }
        if (undeliveredElementException != null) {
            CoroutineExceptionHandlerKt.a(coroutineContext, undeliveredElementException);
        }
    }
}
