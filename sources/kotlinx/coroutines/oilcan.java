package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/oilcan;", "S", "Lkotlinx/coroutines/immediately;", "copyForChild", "()Lkotlinx/coroutines/oilcan;", "Lkotlin/coroutines/CoroutineContext$Element;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "mergeForChild", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface oilcan<S> extends immediately<S> {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal {
        public static <S, R> R attabal(oilcan<S> oilcanVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) immediately.attabal.attabal(oilcanVar, r, function2);
        }

        public static <S> CoroutineContext dern(oilcan<S> oilcanVar, CoroutineContext.saneness<?> sanenessVar) {
            return immediately.attabal.dern(oilcanVar, sanenessVar);
        }

        public static <S, E extends CoroutineContext.Element> E saneness(oilcan<S> oilcanVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) immediately.attabal.saneness(oilcanVar, sanenessVar);
        }

        public static <S> CoroutineContext wireman(oilcan<S> oilcanVar, CoroutineContext coroutineContext) {
            return immediately.attabal.wireman(oilcanVar, coroutineContext);
        }
    }

    oilcan<S> copyForChild();

    CoroutineContext mergeForChild(CoroutineContext.Element overwritingElement);
}
