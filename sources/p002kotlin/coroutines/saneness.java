package p002kotlin.coroutines;

import com.ironsource.X3;
import kotlin.coroutines.CoroutineContext.Element;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/coroutines/saneness;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$saneness;", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Lkotlin/coroutines/CoroutineContext$saneness;Lkotlin/jvm/functions/Function1;)V", "element", "saneness", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", X3.i.W, "", "attabal", "(Lkotlin/coroutines/CoroutineContext$saneness;)Z", "kowloon", "Lkotlin/jvm/functions/Function1;", "arytenoidectomy", "Lkotlin/coroutines/CoroutineContext$saneness;", "topmostKey", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class saneness<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.saneness<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext.saneness<?> topmostKey;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Function1<CoroutineContext.Element, E> safeCast;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$saneness<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public saneness(CoroutineContext.saneness<B> baseKey, Function1<? super CoroutineContext.Element, ? extends E> safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.safeCast = safeCast;
        this.topmostKey = baseKey instanceof saneness ? (CoroutineContext.saneness<B>) ((saneness) baseKey).topmostKey : baseKey;
    }

    public final boolean attabal(CoroutineContext.saneness<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.topmostKey == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final CoroutineContext.Element saneness(CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (CoroutineContext.Element) this.safeCast.invoke(element);
    }
}
