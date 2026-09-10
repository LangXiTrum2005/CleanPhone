package com.codejoy.boom.clap.module.vip;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.technofreak;
import loungewear.PurchaseConfigResponse;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: VipActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.vip.VipActivity$initData$1", f = "VipActivity.kt", l = {Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend", v = 1)
public final class VipActivity$initData$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ VipActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipActivity$initData$1(VipActivity vipActivity, wretchedly.dern<? super VipActivity$initData$1> dernVar) {
        super(2, dernVar);
        this.this$0 = vipActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        VipActivity$initData$1 vipActivity$initData$1 = new VipActivity$initData$1(this.this$0, dernVar);
        vipActivity$initData$1.L$0 = obj;
        return vipActivity$initData$1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PurchaseItem purchaseItem;
        saran saranVar = (saran) this.L$0;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                VipActivity vipActivity = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                PurchaseConfigResponse purchaseConfigResponseMarial = reuter.adultoid.f36626attabal.marial();
                vipActivity.currentPurchaseList = purchaseConfigResponseMarial.getPurchasePageBean().getCom.unity3d.ads.BuildConfig.FLAVOR java.lang.String().attabal();
                List list = vipActivity.currentPurchaseList;
                if (list != null && (purchaseItem = (PurchaseItem) CollectionsKt.firstOrNull(list)) != null) {
                    vipActivity.currentPurchaseItem = purchaseItem;
                }
                technofreak technofreakVarDern = premeiotic.dern();
                VipActivity$initData$1$1$2 vipActivity$initData$1$1$2 = new VipActivity$initData$1$1$2(vipActivity, null);
                this.L$0 = igo.impromptu.attabal(saranVar);
                this.L$1 = igo.impromptu.attabal(saranVar);
                this.L$2 = igo.impromptu.attabal(purchaseConfigResponseMarial);
                this.I$0 = 0;
                this.label = 1;
                if (kotlinx.coroutines.impromptu.competently(technofreakVarDern, vipActivity$initData$1$1$2, this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((VipActivity$initData$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
