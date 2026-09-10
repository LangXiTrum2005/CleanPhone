package oilcan;

import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CompositionErrorContext.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Loilcan/impromptu;", "Loilcan/beachfront;", "Ladultoid/beachfront;", "Lkotlin/coroutines/CoroutineContext$Element;", "Landroidx/compose/runtime/kowloon;", "composer", "<init>", "(Landroidx/compose/runtime/kowloon;)V", "", "", "composeNode", "", "wireman", "(Ljava/lang/Throwable;Ljava/lang/Object;)Z", "", "currentOffset", "", "Loilcan/dern;", "marial", "(Ljava/lang/Integer;)Ljava/util/List;", "kowloon", "Landroidx/compose/runtime/kowloon;", "Lkotlin/coroutines/CoroutineContext$saneness;", "getKey", "()Lkotlin/coroutines/CoroutineContext$saneness;", X3.i.W, "arytenoidectomy", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu implements beachfront, adultoid.beachfront, CoroutineContext.Element {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final int f34099monoploid = 8;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.kowloon composer;

    /* JADX INFO: renamed from: oilcan.impromptu$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CompositionErrorContext.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loilcan/impromptu$attabal;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Loilcan/impromptu;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<impromptu> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        public Companion() {
        }
    }

    public impromptu(androidx.compose.runtime.kowloon kowloonVar) {
        this.composer = kowloonVar;
    }

    public static final List competently(impromptu impromptuVar, Object obj) {
        return impromptuVar.composer.licking(obj);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) CoroutineContext.Element.attabal.saneness(this, sanenessVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.saneness<?> getKey() {
        return INSTANCE;
    }

    @Override // adultoid.beachfront
    public List<ComposeStackTraceFrame> marial(Integer currentOffset) {
        return this.composer.unconsolidated();
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return CoroutineContext.Element.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.attabal.wireman(this, coroutineContext);
    }

    @Override // oilcan.beachfront
    public boolean wireman(Throwable th, final Object obj) {
        return wireman.dern(th, new Function0() { // from class: oilcan.competently
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return impromptu.competently(this.f34092kowloon, obj);
            }
        });
    }
}
