package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.arch.core.executor.a;
import androidx.core.os.OutcomeReceiverKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AppSetIdManagerImplCommon extends AppSetIdManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.adservices.appsetid.AppSetIdManager f7922a;

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager appSetIdManager) {
        this.f7922a = appSetIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation<? super AppSetId> continuation) throws Throwable {
        AppSetIdManagerImplCommon$getAppSetId$1 appSetIdManagerImplCommon$getAppSetId$1;
        if (continuation instanceof AppSetIdManagerImplCommon$getAppSetId$1) {
            appSetIdManagerImplCommon$getAppSetId$1 = (AppSetIdManagerImplCommon$getAppSetId$1) continuation;
            int i2 = appSetIdManagerImplCommon$getAppSetId$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appSetIdManagerImplCommon$getAppSetId$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                appSetIdManagerImplCommon$getAppSetId$1 = new AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, continuation);
            }
        } else {
            appSetIdManagerImplCommon$getAppSetId$1 = new AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, continuation);
        }
        Object objP = appSetIdManagerImplCommon$getAppSetId$1.f7923Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = appSetIdManagerImplCommon$getAppSetId$1.e0;
        if (i3 == 0) {
            ResultKt.b(objP);
            appSetIdManagerImplCommon$getAppSetId$1.X = appSetIdManagerImplCommon;
            appSetIdManagerImplCommon$getAppSetId$1.e0 = 1;
            appSetIdManagerImplCommon.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(appSetIdManagerImplCommon$getAppSetId$1));
            cancellableContinuationImpl.q();
            appSetIdManagerImplCommon.f7922a.getAppSetId(new a(1), OutcomeReceiverKt.a(cancellableContinuationImpl));
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSetIdManagerImplCommon = appSetIdManagerImplCommon$getAppSetId$1.X;
            ResultKt.b(objP);
        }
        android.adservices.appsetid.AppSetId appSetIdN = androidx.privacysandbox.ads.adservices.adid.a.n(objP);
        appSetIdManagerImplCommon.getClass();
        if (appSetIdN.getScope() == 1) {
            String id = appSetIdN.getId();
            Intrinsics.e(id, "response.id");
            return new AppSetId(id, 1);
        }
        String id2 = appSetIdN.getId();
        Intrinsics.e(id2, "response.id");
        return new AppSetId(id2, 2);
    }

    public Object a(Continuation<? super AppSetId> continuation) {
        return b(this, continuation);
    }
}
