package com.chartboost.heliumsdk.controllers.banners;

import android.util.Size;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.ad.HeliumBannerAdListener;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$getNextAd$1$1$1", f = "BannerController.kt", l = {}, m = "invokeSuspend")
public final class BannerController$getNextAd$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $error;
    final /* synthetic */ HeliumBannerAd $heliumBannerAd;
    final /* synthetic */ String $loadId;
    int label;
    final /* synthetic */ BannerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerController$getNextAd$1$1$1(HeliumBannerAd heliumBannerAd, String str, Throwable th, BannerController bannerController, Continuation<? super BannerController$getNextAd$1$1$1> continuation) {
        super(2, continuation);
        this.$heliumBannerAd = heliumBannerAd;
        this.$loadId = str;
        this.$error = th;
        this.this$0 = bannerController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerController$getNextAd$1$1$1(this.$heliumBannerAd, this.$loadId, this.$error, this.this$0, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Size sizeAsSize;
        PartnerAd partnerAd;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        HeliumBannerAdListener heliumBannerAdListener = this.$heliumBannerAd.getHeliumBannerAdListener();
        if (heliumBannerAdListener != null) {
            String placementName = this.$heliumBannerAd.getPlacementName();
            String str = this.$loadId;
            Map<String, String> map = EmptyMap.X;
            Throwable th = this.$error;
            ChartboostMediationAdException chartboostMediationAdException = th instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) th : new ChartboostMediationAdException(ChartboostMediationError.CM_UNKNOWN_ERROR);
            CachedAd cachedAd = this.this$0.currentlyShowingAd;
            if (cachedAd == null || (partnerAd = cachedAd.getPartnerAd()) == null) {
                sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
            } else {
                PartnerAdUtils partnerAdUtils = PartnerAdUtils.INSTANCE;
                Size size = partnerAd.getRequest().getSize();
                if (size == null) {
                    size = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                }
                sizeAsSize = partnerAdUtils.getCreativeSizeFromPartnerAdDetails(partnerAd, size);
                if (sizeAsSize == null) {
                    sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                }
            }
            heliumBannerAdListener.onAdCached(placementName, str, map, chartboostMediationAdException, sizeAsSize);
        }
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerController$getNextAd$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
