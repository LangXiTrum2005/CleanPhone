package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/monroe;", "parent", "Lkotlinx/coroutines/cord;", "attabal", "(Lkotlinx/coroutines/monroe;)Lkotlinx/coroutines/cord;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/saran;", "Lwretchedly/dern;", "", "block", "dern", "(Lkotlin/jvm/functions/Function2;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sakeen {
    public static final cord attabal(monroe monroeVar) {
        return new molet(monroeVar);
    }

    public static final <R> Object dern(Function2<? super saran, ? super wretchedly.dern<? super R>, ? extends Object> function2, wretchedly.dern<? super R> dernVar) {
        deadwork deadworkVar = new deadwork(dernVar.getContext(), dernVar);
        Object objSaneness = girt.saneness.saneness(deadworkVar, deadworkVar, function2);
        if (objSaneness == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objSaneness;
    }

    public static /* synthetic */ cord saneness(monroe monroeVar, int i, Object obj) {
        if ((i & 1) != 0) {
            monroeVar = null;
        }
        return attabal(monroeVar);
    }
}
