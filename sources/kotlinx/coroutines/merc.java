package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00132\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lkotlinx/coroutines/merc;", "Lkotlin/coroutines/attabal;", "Lkotlin/coroutines/dern;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "nosophobia", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lerp", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwretchedly/dern;", "continuation", "timberyard", "(Lwretchedly/dern;)Lwretchedly/dern;", "kattegat", "(Lwretchedly/dern;)V", "toString", "()Ljava/lang/String;", "kowloon", "attabal", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class merc extends p002kotlin.coroutines.attabal implements p002kotlin.coroutines.dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kotlinx.coroutines.merc$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/merc$attabal;", "Lkotlin/coroutines/saneness;", "Lkotlin/coroutines/dern;", "Lkotlinx/coroutines/merc;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion extends p002kotlin.coroutines.saneness<p002kotlin.coroutines.dern, merc> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final merc wireman(CoroutineContext.Element element) {
            if (element instanceof merc) {
                return (merc) element;
            }
            return null;
        }

        public Companion() {
            super(p002kotlin.coroutines.dern.INSTANCE, new Function1() { // from class: kotlinx.coroutines.restrictive
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return merc.Companion.wireman((CoroutineContext.Element) obj);
                }
            });
        }
    }

    public merc() {
        super(p002kotlin.coroutines.dern.INSTANCE);
    }

    public static /* synthetic */ merc coi(merc mercVar, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return mercVar.sayid(i, str);
    }

    @Override // p002kotlin.coroutines.attabal, kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) kotlin.coroutines.dern.attabal.attabal(this, sanenessVar);
    }

    public abstract void itchy(CoroutineContext context, Runnable block);

    @Override // p002kotlin.coroutines.dern
    public final void kattegat(wretchedly.dern<?> continuation) {
        Intrinsics.competently(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((pigboat.competently) continuation).dovishness();
    }

    public void lerp(CoroutineContext context, Runnable block) {
        pigboat.impromptu.dern(this, context, block);
    }

    @Override // p002kotlin.coroutines.attabal, p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return kotlin.coroutines.dern.attabal.saneness(this, sanenessVar);
    }

    public boolean nosophobia(CoroutineContext context) {
        return true;
    }

    public merc sayid(int parallelism, String name) {
        pigboat.apical.attabal(parallelism);
        return new pigboat.cutely(this, parallelism, name);
    }

    @Override // p002kotlin.coroutines.dern
    public final <T> wretchedly.dern<T> timberyard(wretchedly.dern<? super T> continuation) {
        return new pigboat.competently(this, continuation);
    }

    public String toString() {
        return creditor.attabal(this) + '@' + creditor.saneness(this);
    }
}
