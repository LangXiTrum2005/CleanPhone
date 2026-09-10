package p002kotlin.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/coroutines/dern;", "Lkotlin/coroutines/CoroutineContext$Element;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwretchedly/dern;", "continuation", "timberyard", "(Lwretchedly/dern;)Lwretchedly/dern;", "", "kattegat", "(Lwretchedly/dern;)V", "competently", "saneness", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface dern extends CoroutineContext.Element {

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f29364kowloon;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {
        public static <E extends CoroutineContext.Element> E attabal(dern dernVar, CoroutineContext.saneness<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof saneness)) {
                if (dern.INSTANCE != key) {
                    return null;
                }
                Intrinsics.competently(dernVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dernVar;
            }
            saneness sanenessVar = (saneness) key;
            if (sanenessVar.attabal(dernVar.getKey())) {
                E e = (E) sanenessVar.saneness(dernVar);
                if (e instanceof CoroutineContext.Element) {
                    return e;
                }
            }
            return null;
        }

        public static CoroutineContext saneness(dern dernVar, CoroutineContext.saneness<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof saneness)) {
                return dern.INSTANCE == key ? EmptyCoroutineContext.INSTANCE : dernVar;
            }
            saneness sanenessVar = (saneness) key;
            return (!sanenessVar.attabal(dernVar.getKey()) || sanenessVar.saneness(dernVar) == null) ? dernVar : EmptyCoroutineContext.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.dern$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/dern$saneness;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Lkotlin/coroutines/dern;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<dern> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ Companion f29364kowloon = new Companion();
    }

    void kattegat(wretchedly.dern<?> continuation);

    <T> wretchedly.dern<T> timberyard(wretchedly.dern<? super T> continuation);
}
