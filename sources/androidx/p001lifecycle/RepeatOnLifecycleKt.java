package androidx.p001lifecycle;

import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "", "", "block", "attabal", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "Landroidx/lifecycle/arytenoidectomy;", "saneness", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RepeatOnLifecycleKt {
    public static final Object attabal(Lifecycle lifecycle, Lifecycle.State state, Function2<? super saran, ? super dern<? super Unit>, ? extends Object> function2, dern<? super Unit> dernVar) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.f29295attabal;
        }
        Object objMarial = privatdozent.marial(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), dernVar);
        return objMarial == attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }

    public static final Object saneness(arytenoidectomy arytenoidectomyVar, Lifecycle.State state, Function2<? super saran, ? super dern<? super Unit>, ? extends Object> function2, dern<? super Unit> dernVar) {
        Object objAttabal = attabal(arytenoidectomyVar.getLifecycle(), state, function2, dernVar);
        return objAttabal == attabal.beachfront() ? objAttabal : Unit.f29295attabal;
    }
}
