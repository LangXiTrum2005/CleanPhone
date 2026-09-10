package p002kotlin.coroutines;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/attabal;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "<init>", "(Lkotlin/coroutines/CoroutineContext$saneness;)V", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class attabal implements CoroutineContext.Element {
    private final CoroutineContext.saneness<?> key;

    public attabal(CoroutineContext.saneness<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) CoroutineContext.Element.attabal.saneness(this, sanenessVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.saneness<?> getKey() {
        return this.key;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return CoroutineContext.Element.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.attabal.wireman(this, coroutineContext);
    }
}
