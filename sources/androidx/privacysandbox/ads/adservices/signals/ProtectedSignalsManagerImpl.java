package androidx.privacysandbox.ads.adservices.signals;

import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.adselection.a;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManagerImpl;", "Landroidx/privacysandbox/ads/adservices/signals/ProtectedSignalsManager;", "Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "request", "", "a", "(Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext12OptIn
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {
    public static Object b(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        protectedSignalsManagerImpl.getClass();
        a.D();
        updateSignalsRequest.getClass();
        Intrinsics.e(a.m().build(), "Builder(request.updateUri).build()");
        new androidx.arch.core.executor.a(1);
        OutcomeReceiverKt.a(cancellableContinuationImpl);
        throw null;
    }

    public Object a(UpdateSignalsRequest updateSignalsRequest, Continuation<? super Unit> continuation) {
        return b(this, updateSignalsRequest, continuation);
    }
}
