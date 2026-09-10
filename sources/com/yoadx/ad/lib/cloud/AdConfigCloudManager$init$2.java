package com.yoadx.ad.lib.cloud;

import android.content.Context;
import igo.wireman;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import wretchedly.dern;

/* JADX INFO: compiled from: AdConfigCloudManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@wireman(c = "com.yoadx.ad.lib.cloud.AdConfigCloudManager$init$2", f = "AdConfigCloudManager.kt", l = {}, m = "invokeSuspend")
public final class AdConfigCloudManager$init$2 extends SuspendLambda implements Function2<saran, dern<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdConfigCloudManager$init$2(Context context, dern<? super AdConfigCloudManager$init$2> dernVar) {
        super(2, dernVar);
        this.$context = context;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern<Unit> create(Object obj, dern<?> dernVar) {
        return new AdConfigCloudManager$init$2(this.$context, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        AdConfigCloudManager adConfigCloudManager = AdConfigCloudManager.f23864attabal;
        adConfigCloudManager.marial(adConfigCloudManager.saneness(this.$context, "ad_config.json"));
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, dern<? super Unit> dernVar) {
        return ((AdConfigCloudManager$init$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
