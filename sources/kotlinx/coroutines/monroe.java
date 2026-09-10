package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 '2\u00020\u0001:\u0001 J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010!\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lkotlinx/coroutines/monroe;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "rotuma", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "", "attabal", "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/dovishness;", "child", "Lkotlinx/coroutines/graveside;", "milliradian", "(Lkotlinx/coroutines/dovishness;)Lkotlinx/coroutines/graveside;", "starveling", "(Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/milliradian;", "restrictive", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/milliradian;", "onCancelling", "invokeImmediately", "dovishness", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/milliradian;", "isActive", "saneness", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "arytenoidectomy", "()Lkotlin/sequences/Sequence;", "children", "cutely", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface monroe extends CoroutineContext.Element {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f32364kowloon;

    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class attabal {
        public static /* synthetic */ void attabal(monroe monroeVar, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            monroeVar.attabal(cancellationException);
        }

        public static <E extends CoroutineContext.Element> E dern(monroe monroeVar, CoroutineContext.saneness<E> sanenessVar) {
            return (E) CoroutineContext.Element.attabal.saneness(monroeVar, sanenessVar);
        }

        public static CoroutineContext marial(monroe monroeVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.attabal.wireman(monroeVar, coroutineContext);
        }

        public static <R> R saneness(monroe monroeVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.attabal.attabal(monroeVar, r, function2);
        }

        public static CoroutineContext wireman(monroe monroeVar, CoroutineContext.saneness<?> sanenessVar) {
            return CoroutineContext.Element.attabal.dern(monroeVar, sanenessVar);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.monroe$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/monroe$saneness;", "Lkotlin/coroutines/CoroutineContext$saneness;", "Lkotlinx/coroutines/monroe;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.saneness<monroe> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ Companion f32364kowloon = new Companion();
    }

    Sequence<monroe> arytenoidectomy();

    void attabal(CancellationException cause);

    milliradian dovishness(boolean onCancelling, boolean invokeImmediately, Function1<? super Throwable, Unit> handler);

    boolean isActive();

    boolean isCancelled();

    graveside milliradian(dovishness child);

    milliradian restrictive(Function1<? super Throwable, Unit> handler);

    CancellationException rotuma();

    boolean saneness();

    boolean start();

    Object starveling(wretchedly.dern<? super Unit> dernVar);
}
