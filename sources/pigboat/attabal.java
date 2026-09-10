package pigboat;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lpigboat/preprohormone;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lpigboat/cord;", "dern", "(Lpigboat/preprohormone;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lpigboat/saneness;", "N", "saneness", "(Lpigboat/saneness;)Lpigboat/saneness;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "Lpigboat/stratoscope;", "attabal", "Lpigboat/stratoscope;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope f35328attabal = new stratoscope("CLOSED");

    public static final <S extends preprohormone<S>> Object dern(S s, long j, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.id >= j && !s.apical()) {
                return cord.attabal(s);
            }
            Object objCompetently = s.competently();
            if (objCompetently == f35328attabal) {
                return cord.attabal(f35328attabal);
            }
            S sInvoke = (S) ((saneness) objCompetently);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.id + 1), s);
                if (s.kowloon(sInvoke)) {
                    if (s.apical()) {
                        s.triweekly();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }

    public static final <N extends saneness<N>> N saneness(N n) {
        while (true) {
            Object objCompetently = n.competently();
            if (objCompetently == f35328attabal) {
                return n;
            }
            saneness sanenessVar = (saneness) objCompetently;
            if (sanenessVar != null) {
                n = (N) sanenessVar;
            } else if (n.impassible()) {
                return n;
            }
        }
    }
}
