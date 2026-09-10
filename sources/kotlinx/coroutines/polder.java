package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/polder;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "taiyuan", "saneness", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface polder extends CoroutineContext.Element {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32379kowloon;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal {
        public static <R> R attabal(polder polderVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.attabal.attabal(polderVar, r, function2);
        }

        public static CoroutineContext dern(polder polderVar, CoroutineContext.saneness<?> sanenessVar) {
            return CoroutineContext.Element.attabal.dern(polderVar, sanenessVar);
        }

        public static <E extends CoroutineContext.Element> E saneness(polder polderVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) CoroutineContext.Element.attabal.saneness(polderVar, sanenessVar);
        }

        public static CoroutineContext wireman(polder polderVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.attabal.wireman(polderVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.polder$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/polder$saneness;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Lkotlinx/coroutines/polder;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<polder> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ Companion f32379kowloon = new Companion();
    }

    void handleException(CoroutineContext context, Throwable exception);
}
