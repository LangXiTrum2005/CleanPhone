package yemenite;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MotionDurationScale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lyemenite/dern;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "triweekly", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface dern extends CoroutineContext.Element {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f39734kowloon;

    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {
        public static <R> R attabal(dern dernVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.attabal.attabal(dernVar, r, function2);
        }

        public static CoroutineContext dern(dern dernVar, CoroutineContext.saneness<?> sanenessVar) {
            return CoroutineContext.Element.attabal.dern(dernVar, sanenessVar);
        }

        public static <E extends CoroutineContext.Element> E saneness(dern dernVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) CoroutineContext.Element.attabal.saneness(dernVar, sanenessVar);
        }

        public static CoroutineContext wireman(dern dernVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.attabal.wireman(dernVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: yemenite.dern$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyemenite/dern$saneness;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Lyemenite/dern;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<dern> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ Companion f39734kowloon = new Companion();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.saneness<?> getKey() {
        return INSTANCE;
    }
}
