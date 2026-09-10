package com.codejoy.boom.clap.module.fragment;

import com.inmobi.media.core.config.models.CrashConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PhoneFunctionFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.fragment.PhoneFunctionFragment$refreshNativeAd$2$1", f = "PhoneFunctionFragment.kt", l = {Sdk$SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", v = 1)
public final class PhoneFunctionFragment$refreshNativeAd$2$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ PhoneFunctionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneFunctionFragment$refreshNativeAd$2$1(PhoneFunctionFragment phoneFunctionFragment, wretchedly.dern<? super PhoneFunctionFragment$refreshNativeAd$2$1> dernVar) {
        super(2, dernVar);
        this.this$0 = phoneFunctionFragment;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new PhoneFunctionFragment$refreshNativeAd$2$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            this.label = 1;
            if (splinterproof.attabal(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        this.this$0.preprohormone();
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((PhoneFunctionFragment$refreshNativeAd$2$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
