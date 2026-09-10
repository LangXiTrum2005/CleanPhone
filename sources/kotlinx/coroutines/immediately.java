package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/immediately;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface immediately<S> extends CoroutineContext.Element {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal {
        public static <S, R> R attabal(immediately<S> immediatelyVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.attabal.attabal(immediatelyVar, r, function2);
        }

        public static <S> CoroutineContext dern(immediately<S> immediatelyVar, CoroutineContext.saneness<?> sanenessVar) {
            return CoroutineContext.Element.attabal.dern(immediatelyVar, sanenessVar);
        }

        public static <S, E extends CoroutineContext.Element> E saneness(immediately<S> immediatelyVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) CoroutineContext.Element.attabal.saneness(immediatelyVar, sanenessVar);
        }

        public static <S> CoroutineContext wireman(immediately<S> immediatelyVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.attabal.wireman(immediatelyVar, coroutineContext);
        }
    }

    void restoreThreadContext(CoroutineContext context, S oldState);

    S updateThreadContext(CoroutineContext context);
}
