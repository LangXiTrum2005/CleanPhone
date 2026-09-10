package com.chartboost.heliumsdk.controllers.banners;

import android.content.Context;
import android.util.Size;
import android.view.View;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.network.model.BannerAdDimensions;
import com.chartboost.heliumsdk.network.model.BannerSizeBody;
import com.chartboost.heliumsdk.utils.Dips;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$swapAd$1$1$onVisibilityThresholdMet$2", f = "BannerController.kt", l = {679, 681, 716}, m = "invokeSuspend")
public final class BannerController$swapAd$1$1$onVisibilityThresholdMet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HeliumBannerAd $heliumBannerAd;
    final /* synthetic */ CachedAd $nextAd;
    final /* synthetic */ View $nextBannerAdView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BannerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerController$swapAd$1$1$onVisibilityThresholdMet$2(CachedAd cachedAd, BannerController bannerController, View view, HeliumBannerAd heliumBannerAd, Continuation<? super BannerController$swapAd$1$1$onVisibilityThresholdMet$2> continuation) {
        super(2, continuation);
        this.$nextAd = cachedAd;
        this.this$0 = bannerController;
        this.$nextBannerAdView = view;
        this.$heliumBannerAd = heliumBannerAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BannerController$swapAd$1$1$onVisibilityThresholdMet$2 bannerController$swapAd$1$1$onVisibilityThresholdMet$2 = new BannerController$swapAd$1$1$onVisibilityThresholdMet$2(this.$nextAd, this.this$0, this.$nextBannerAdView, this.$heliumBannerAd, continuation);
        bannerController$swapAd$1$1$onVisibilityThresholdMet$2.L$0 = obj;
        return bannerController$swapAd$1$1$onVisibilityThresholdMet$2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int iPixelsToIntDips;
        int iPixelsToIntDips2;
        int iPixelsToIntDips3;
        int iPixelsToIntDips4;
        PartnerAd partnerAd;
        int height;
        int width;
        PartnerAd partnerAd2;
        ChartboostMediationNetworking chartboostMediationNetworking;
        String loadId;
        BannerSizeBody bannerSizeBody;
        PartnerAdLoadRequest request;
        Size size;
        PartnerAdLoadRequest request2;
        Size size2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        Unit unit = Unit.f43263a;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ChartboostMediationNetworking chartboostMediationNetworking2 = ChartboostMediationNetworking.INSTANCE;
            String auctionId = this.$nextAd.getAuctionId();
            String loadId2 = this.$nextAd.getLoadId();
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (chartboostMediationNetworking2.trackChartboostImpression(auctionId, loadId2, this) != coroutineSingletons) {
                coroutineScope = coroutineScope2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        } else if (i2 == 2) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            if (!CoroutineScopeKt.e(coroutineScope)) {
                return unit;
            }
            Dips dips = Dips.INSTANCE;
            int width2 = this.$nextBannerAdView.getWidth();
            Context context = this.$nextBannerAdView.getContext();
            Intrinsics.e(context, "nextBannerAdView.context");
            iPixelsToIntDips = dips.pixelsToIntDips(width2, context);
            int height2 = this.$nextBannerAdView.getHeight();
            Context context2 = this.$nextBannerAdView.getContext();
            Intrinsics.e(context2, "nextBannerAdView.context");
            iPixelsToIntDips2 = dips.pixelsToIntDips(height2, context2);
            int width3 = this.$heliumBannerAd.getWidth();
            Context context3 = this.$heliumBannerAd.getContext();
            Intrinsics.e(context3, "heliumBannerAd.context");
            iPixelsToIntDips3 = dips.pixelsToIntDips(width3, context3);
            int height3 = this.$heliumBannerAd.getHeight();
            Context context4 = this.$heliumBannerAd.getContext();
            Intrinsics.e(context4, "heliumBannerAd.context");
            iPixelsToIntDips4 = dips.pixelsToIntDips(height3, context4);
            if (iPixelsToIntDips > iPixelsToIntDips3 && iPixelsToIntDips2 <= iPixelsToIntDips4) {
                return unit;
            }
            partnerAd = this.$nextAd.getPartnerAd();
            height = 0;
            if (partnerAd != null || (request2 = partnerAd.getRequest()) == null || (size2 = request2.getSize()) == null) {
                width = 0;
            } else {
                width = size2.getWidth();
            }
            partnerAd2 = this.$nextAd.getPartnerAd();
            if (partnerAd2 != null && (request = partnerAd2.getRequest()) != null && (size = request.getSize()) != null) {
                height = size.getHeight();
            }
            chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
            loadId = this.$nextAd.getLoadId();
            bannerSizeBody = new BannerSizeBody(this.$nextAd.getAuctionId(), new BannerAdDimensions(iPixelsToIntDips, iPixelsToIntDips2), new BannerAdDimensions(iPixelsToIntDips3, iPixelsToIntDips4), new BannerAdDimensions(width, height));
            this.L$0 = null;
            this.label = 3;
            if (chartboostMediationNetworking.trackAdaptiveBannerSize(loadId, bannerSizeBody, this) != coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
        long timeToVerifyAdSizeJobMillis = this.this$0.getTimeToVerifyAdSizeJobMillis();
        this.L$0 = coroutineScope;
        this.label = 2;
        if (DelayKt.a(timeToVerifyAdSizeJobMillis, this) != coroutineSingletons) {
            if (!CoroutineScopeKt.e(coroutineScope)) {
                return unit;
            }
            Dips dips2 = Dips.INSTANCE;
            int width4 = this.$nextBannerAdView.getWidth();
            Context context5 = this.$nextBannerAdView.getContext();
            Intrinsics.e(context5, "nextBannerAdView.context");
            iPixelsToIntDips = dips2.pixelsToIntDips(width4, context5);
            int height4 = this.$nextBannerAdView.getHeight();
            Context context6 = this.$nextBannerAdView.getContext();
            Intrinsics.e(context6, "nextBannerAdView.context");
            iPixelsToIntDips2 = dips2.pixelsToIntDips(height4, context6);
            int width5 = this.$heliumBannerAd.getWidth();
            Context context7 = this.$heliumBannerAd.getContext();
            Intrinsics.e(context7, "heliumBannerAd.context");
            iPixelsToIntDips3 = dips2.pixelsToIntDips(width5, context7);
            int height5 = this.$heliumBannerAd.getHeight();
            Context context8 = this.$heliumBannerAd.getContext();
            Intrinsics.e(context8, "heliumBannerAd.context");
            iPixelsToIntDips4 = dips2.pixelsToIntDips(height5, context8);
            if (iPixelsToIntDips > iPixelsToIntDips3) {
            }
            partnerAd = this.$nextAd.getPartnerAd();
            height = 0;
            if (partnerAd != null) {
                width = 0;
            } else {
                width = 0;
            }
            partnerAd2 = this.$nextAd.getPartnerAd();
            if (partnerAd2 != null) {
                height = size.getHeight();
            }
            chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
            loadId = this.$nextAd.getLoadId();
            bannerSizeBody = new BannerSizeBody(this.$nextAd.getAuctionId(), new BannerAdDimensions(iPixelsToIntDips, iPixelsToIntDips2), new BannerAdDimensions(iPixelsToIntDips3, iPixelsToIntDips4), new BannerAdDimensions(width, height));
            this.L$0 = null;
            this.label = 3;
            if (chartboostMediationNetworking.trackAdaptiveBannerSize(loadId, bannerSizeBody, this) != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerController$swapAd$1$1$onVisibilityThresholdMet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
