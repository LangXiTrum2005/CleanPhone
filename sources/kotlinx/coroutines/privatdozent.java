package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import pigboat.CoroutineScope;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001b\u0010\u001c\u001a\u00020\u0018*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/saran;", "Lkotlin/coroutines/CoroutineContext;", "context", "impromptu", "(Lkotlinx/coroutines/saran;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/saran;", "saneness", "()Lkotlinx/coroutines/saran;", "R", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "block", "marial", "(Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "attabal", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/saran;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "dern", "(Lkotlinx/coroutines/saran;Ljava/util/concurrent/CancellationException;)V", "beachfront", "(Lkotlinx/coroutines/saran;)V", "", "competently", "(Lkotlinx/coroutines/saran;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class privatdozent {
    public static final saran attabal(CoroutineContext coroutineContext) {
        if (coroutineContext.get(monroe.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(JobKt__JobKt.saneness(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    public static final void beachfront(saran saranVar) {
        achondroplasia.impromptu(saranVar.getCoroutineContext());
    }

    public static final boolean competently(saran saranVar) {
        monroe monroeVar = (monroe) saranVar.getCoroutineContext().get(monroe.INSTANCE);
        if (monroeVar != null) {
            return monroeVar.isActive();
        }
        return true;
    }

    public static final void dern(saran saranVar, CancellationException cancellationException) {
        monroe monroeVar = (monroe) saranVar.getCoroutineContext().get(monroe.INSTANCE);
        if (monroeVar != null) {
            monroeVar.attabal(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + saranVar).toString());
    }

    public static final saran impromptu(saran saranVar, CoroutineContext coroutineContext) {
        return new CoroutineScope(saranVar.getCoroutineContext().plus(coroutineContext));
    }

    public static final <R> Object marial(Function2<? super saran, ? super wretchedly.dern<? super R>, ? extends Object> function2, wretchedly.dern<? super R> dernVar) {
        pigboat.rotuma rotumaVar = new pigboat.rotuma(dernVar.getContext(), dernVar);
        Object objSaneness = girt.saneness.saneness(rotumaVar, rotumaVar, function2);
        if (objSaneness == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objSaneness;
    }

    public static final saran saneness() {
        return new CoroutineScope(sakeen.saneness(null, 1, null).plus(premeiotic.dern()));
    }

    public static /* synthetic */ void wireman(saran saranVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        dern(saranVar, cancellationException);
    }
}
