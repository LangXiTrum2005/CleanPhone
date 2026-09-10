package kotlinx.coroutines;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.time.DurationUnit;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"", "timeMillis", "", "attabal", "(JLwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/time/saneness;", IronSourceConstants.EVENTS_DURATION, "saneness", "wireman", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/mathsort;", "dern", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/mathsort;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class splinterproof {
    public static final Object attabal(long j, wretchedly.dern<? super Unit> dernVar) {
        if (j <= 0) {
            return Unit.f29295attabal;
        }
        kowloon kowloonVar = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        if (j < Long.MAX_VALUE) {
            dern(kowloonVar.getContext()).monoploid(j, kowloonVar);
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
    }

    public static final mathsort dern(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(p002kotlin.coroutines.dern.INSTANCE);
        mathsort mathsortVar = element instanceof mathsort ? (mathsort) element : null;
        return mathsortVar == null ? hydrovane.attabal() : mathsortVar;
    }

    public static final Object saneness(long j, wretchedly.dern<? super Unit> dernVar) {
        Object objAttabal = attabal(wireman(j), dernVar);
        return objAttabal == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objAttabal : Unit.f29295attabal;
    }

    public static final long wireman(long j) {
        boolean zRestrictive = p002kotlin.time.saneness.restrictive(j);
        if (zRestrictive) {
            return p002kotlin.time.saneness.adultoid(p002kotlin.time.saneness.polder(j, p002kotlin.time.dern.graveside(999999L, DurationUnit.NANOSECONDS)));
        }
        if (zRestrictive) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
