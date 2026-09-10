package androidx.compose.runtime;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/milliradian;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "onFrame", "formularize", "(Lkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface milliradian extends CoroutineContext.Element {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6091kowloon;

    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {
        public static <R> R attabal(milliradian milliradianVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.attabal.attabal(milliradianVar, r, function2);
        }

        public static CoroutineContext dern(milliradian milliradianVar, CoroutineContext.saneness<?> sanenessVar) {
            return CoroutineContext.Element.attabal.dern(milliradianVar, sanenessVar);
        }

        public static <E extends CoroutineContext.Element> E saneness(milliradian milliradianVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) CoroutineContext.Element.attabal.saneness(milliradianVar, sanenessVar);
        }

        public static CoroutineContext wireman(milliradian milliradianVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.attabal.wireman(milliradianVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.milliradian$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/milliradian$saneness;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Landroidx/compose/runtime/milliradian;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<milliradian> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ Companion f6091kowloon = new Companion();
    }

    <R> Object formularize(Function1<? super Long, ? extends R> function1, wretchedly.dern<? super R> dernVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.saneness<?> getKey() {
        return INSTANCE;
    }
}
