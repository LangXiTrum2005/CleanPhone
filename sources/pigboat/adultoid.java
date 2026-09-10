package pigboat;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "saneness", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/CoroutineContext;", "context", "attabal", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class adultoid {
    public static final <E> void attabal(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) throws IllegalAccessException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionSaneness = saneness(function1, e, null);
        if (undeliveredElementExceptionSaneness != null) {
            kotlinx.coroutines.seminary.attabal(coroutineContext, undeliveredElementExceptionSaneness);
        }
    }

    public static /* synthetic */ UndeliveredElementException dern(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return saneness(function1, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException saneness(Function1<? super E, Unit> function1, E e, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, InvocationTargetException {
        try {
            function1.invoke(e);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                patroclinal.marial.attabal(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
        }
    }
}
