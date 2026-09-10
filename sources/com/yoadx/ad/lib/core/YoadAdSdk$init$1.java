package com.yoadx.ad.lib.core;

import android.app.Application;
import com.appsflyer.adrevenue.AppsFlyerAdRevenue;
import com.yoadx.ad.lib.bean.SdkConfig;
import com.yoadx.ad.lib.bean.SdkState;
import com.yoadx.ad.lib.cloud.AdConfigCloudManager;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: YoadAdSdk.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 0, 0})
@igo.wireman(c = "com.yoadx.ad.lib.core.YoadAdSdk$init$1", f = "YoadAdSdk.kt", l = {68}, m = "invokeSuspend")
public final class YoadAdSdk$init$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ SdkConfig $config;
    final /* synthetic */ Application $context;
    final /* synthetic */ artsy.wireman $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoadAdSdk$init$1(Application application, SdkConfig sdkConfig, artsy.wireman wiremanVar, wretchedly.dern<? super YoadAdSdk$init$1> dernVar) {
        super(2, dernVar);
        this.$context = application;
        this.$config = sdkConfig;
        this.$listener = wiremanVar;
    }

    public static final void triweekly(artsy.wireman wiremanVar, eddy.saneness sanenessVar) {
        YoadAdSdk yoadAdSdk = YoadAdSdk.f23874attabal;
        yoadAdSdk.monoploid(SdkState.INIT_COMPLETE);
        if (wiremanVar != null) {
            wiremanVar.attabal();
        }
        yoadAdSdk.taiyuan();
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new YoadAdSdk$init$1(this.$context, this.$config, this.$listener, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AdConfigCloudManager adConfigCloudManager = AdConfigCloudManager.f23864attabal;
            Application application = this.$context;
            this.label = 1;
            if (adConfigCloudManager.wireman(application, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        AppsFlyerAdRevenue.initialize(new AppsFlyerAdRevenue.Builder(this.$context).build());
        danae.attabal.Companion companion = danae.attabal.INSTANCE;
        Application application2 = this.$context;
        eddy.attabal attabalVarAttabal = new eddy.attabal.C0594attabal(this.$config.getAdmobPubId()).attabal();
        final artsy.wireman wiremanVar = this.$listener;
        companion.dern(application2, attabalVarAttabal, new eddy.dern() { // from class: com.yoadx.ad.lib.core.taiyuan
            @Override // eddy.dern
            public final void attabal(eddy.saneness sanenessVar) {
                YoadAdSdk$init$1.triweekly(wiremanVar, sanenessVar);
            }
        });
        YoadAdSdk yoadAdSdk = YoadAdSdk.f23874attabal;
        yoadAdSdk.monoploid(SdkState.INIT);
        artsy.wireman wiremanVar2 = this.$listener;
        if (wiremanVar2 != null) {
            wiremanVar2.saneness();
        }
        yoadAdSdk.apical();
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((YoadAdSdk$init$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
