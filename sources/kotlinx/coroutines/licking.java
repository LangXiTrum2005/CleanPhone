package kotlinx.coroutines;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/licking;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$saneness;", "<init>", "()V", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class licking implements CoroutineContext.Element, CoroutineContext.saneness<licking> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final licking f32351kowloon = new licking();

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) CoroutineContext.Element.attabal.saneness(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return CoroutineContext.Element.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.attabal.wireman(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.saneness<?> getKey() {
        return this;
    }
}
