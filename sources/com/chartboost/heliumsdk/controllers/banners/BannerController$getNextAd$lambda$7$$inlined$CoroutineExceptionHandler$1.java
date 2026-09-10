package com.chartboost.heliumsdk.controllers.banners;

import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.smartdigimkt.x.g;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", g.f39715A, "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BannerController$getNextAd$lambda$7$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ HeliumBannerAd $heliumBannerAd$inlined;
    final /* synthetic */ String $loadId$inlined;
    final /* synthetic */ BannerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerController$getNextAd$lambda$7$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, BannerController bannerController, HeliumBannerAd heliumBannerAd, String str) {
        super(key);
        this.this$0 = bannerController;
        this.$heliumBannerAd$inlined = heliumBannerAd;
        this.$loadId$inlined = str;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        this.this$0.fetchAdJob = null;
        if (this.this$0.isPublisherTriggeredLoad) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new BannerController$getNextAd$1$1$1(this.$heliumBannerAd$inlined, this.$loadId$inlined, exception, this.this$0, null), 3);
        }
    }
}
