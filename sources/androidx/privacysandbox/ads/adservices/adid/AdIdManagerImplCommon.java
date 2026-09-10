package androidx.privacysandbox.ads.adservices.adid;

import androidx.core.os.OutcomeReceiverKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AdIdManagerImplCommon extends AdIdManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.adid.AdIdManager f7903a;

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager adIdManager) {
        this.f7903a = adIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(AdIdManagerImplCommon adIdManagerImplCommon, Continuation<? super AdId> continuation) throws Throwable {
        AdIdManagerImplCommon$getAdId$1 adIdManagerImplCommon$getAdId$1;
        if (continuation instanceof AdIdManagerImplCommon$getAdId$1) {
            adIdManagerImplCommon$getAdId$1 = (AdIdManagerImplCommon$getAdId$1) continuation;
            int i2 = adIdManagerImplCommon$getAdId$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adIdManagerImplCommon$getAdId$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, continuation);
            }
        } else {
            adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, continuation);
        }
        Object objP = adIdManagerImplCommon$getAdId$1.f7904Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = adIdManagerImplCommon$getAdId$1.e0;
        if (i3 == 0) {
            ResultKt.b(objP);
            adIdManagerImplCommon$getAdId$1.X = adIdManagerImplCommon;
            adIdManagerImplCommon$getAdId$1.e0 = 1;
            adIdManagerImplCommon.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(adIdManagerImplCommon$getAdId$1));
            cancellableContinuationImpl.q();
            adIdManagerImplCommon.f7903a.getAdId(new androidx.arch.core.executor.a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adIdManagerImplCommon = adIdManagerImplCommon$getAdId$1.X;
            ResultKt.b(objP);
        }
        android.adservices.adid.AdId adIdC = a.c(objP);
        adIdManagerImplCommon.getClass();
        String adId = adIdC.getAdId();
        Intrinsics.e(adId, "response.adId");
        return new AdId(adId, adIdC.isLimitAdTrackingEnabled());
    }

    public Object a(Continuation<? super AdId> continuation) {
        return b(this, continuation);
    }
}
