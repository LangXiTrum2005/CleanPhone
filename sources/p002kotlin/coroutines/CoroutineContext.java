package p002kotlin.coroutines;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "get", "(Lkotlin/coroutines/CoroutineContext$saneness;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$saneness;)Lkotlin/coroutines/CoroutineContext;", "saneness", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CoroutineContext {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "get", "(Lkotlin/coroutines/CoroutineContext$saneness;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        /* JADX INFO: compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class attabal {
            public static <R> R attabal(Element element, R r, Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r, element);
            }

            public static CoroutineContext dern(Element element, saneness<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.wireman(element.getKey(), key) ? EmptyCoroutineContext.INSTANCE : element;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E saneness(Element element, saneness<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.wireman(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.competently(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext wireman(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return attabal.saneness(element, context);
            }
        }

        @Override // p002kotlin.coroutines.CoroutineContext
        <E extends Element> E get(saneness<E> key);

        saneness<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {
        public static CoroutineContext dern(CoroutineContext acc, Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            CoroutineContext coroutineContextMinusKey = acc.minusKey(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (coroutineContextMinusKey == emptyCoroutineContext) {
                return element;
            }
            dern.Companion sanenessVar = dern.INSTANCE;
            dern dernVar = (dern) coroutineContextMinusKey.get(sanenessVar);
            if (dernVar == null) {
                return new CombinedContext(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(sanenessVar);
            return coroutineContextMinusKey2 == emptyCoroutineContext ? new CombinedContext(element, dernVar) : new CombinedContext(new CombinedContext(coroutineContextMinusKey2, element), dernVar);
        }

        public static CoroutineContext saneness(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2() { // from class: wretchedly.marial
                @Override // p002kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.attabal.dern((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$saneness;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface saneness<E extends Element> {
    }

    <R> R fold(R initial, Function2<? super R, ? super Element, ? extends R> operation);

    <E extends Element> E get(saneness<E> key);

    CoroutineContext minusKey(saneness<?> key);

    CoroutineContext plus(CoroutineContext context);
}
