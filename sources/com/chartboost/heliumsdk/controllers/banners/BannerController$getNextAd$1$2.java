package com.chartboost.heliumsdk.controllers.banners;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.ad.HeliumBannerAdListener;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Keywords;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.utils.LogController;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$getNextAd$1$2", f = "BannerController.kt", l = {386}, m = "invokeSuspend")
public final class BannerController$getNextAd$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ HeliumBannerAd $heliumBannerAd;
    final /* synthetic */ String $loadId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BannerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerController$getNextAd$1$2(HeliumBannerAd heliumBannerAd, String str, BannerController bannerController, boolean z2, Continuation<? super BannerController$getNextAd$1$2> continuation) {
        super(2, continuation);
        this.$heliumBannerAd = heliumBannerAd;
        this.$loadId = str;
        this.this$0 = bannerController;
        this.$forceRefresh = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BannerController$getNextAd$1$2 bannerController$getNextAd$1$2 = new BannerController$getNextAd$1$2(this.$heliumBannerAd, this.$loadId, this.this$0, this.$forceRefresh, continuation);
        bannerController$getNextAd$1$2.L$0 = obj;
        return bannerController$getNextAd$1$2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Result result;
        CoroutineScope coroutineScope2;
        Object obj2;
        boolean zE;
        Unit unit;
        boolean z2;
        BannerController bannerController;
        String str;
        Object obj3;
        Throwable thA;
        CachedAd cachedAd;
        PartnerAd partnerAd;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AdController adController = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController();
            if (adController != null) {
                Context context = this.$heliumBannerAd.getContext();
                Intrinsics.e(context, "heliumBannerAd.context");
                AdIdentifier adIdentifier = new AdIdentifier(this.$heliumBannerAd.getAdType(), this.$heliumBannerAd.getPlacementName());
                Keywords keywords = this.$heliumBannerAd.getKeywords();
                String str2 = this.$loadId;
                HeliumBannerAd.HeliumBannerSize size = this.$heliumBannerAd.getSize();
                final BannerController bannerController2 = this.this$0;
                AdLoadParams adLoadParams = new AdLoadParams(adIdentifier, keywords, str2, null, size, new AdInteractionListener() { // from class: com.chartboost.heliumsdk.controllers.banners.BannerController$getNextAd$1$2$loadResult$1
                    @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                    public void onClicked(PartnerAd partnerAd2) {
                        HeliumBannerAdListener heliumBannerAdListener;
                        Intrinsics.f(partnerAd2, "partnerAd");
                        HeliumBannerAd heliumBannerAd = (HeliumBannerAd) bannerController2.heliumBannerAdRef.get();
                        if (heliumBannerAd == null || (heliumBannerAdListener = heliumBannerAd.getHeliumBannerAdListener()) == null) {
                            return;
                        }
                        heliumBannerAdListener.onAdClicked(partnerAd2.getRequest().getChartboostPlacement());
                    }

                    @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                    public void onDismissed(PartnerAd partnerAd2, ChartboostMediationAdException error) {
                        Intrinsics.f(partnerAd2, "partnerAd");
                        LogController.INSTANCE.e(partnerAd2.getRequest().getChartboostPlacement() + " Banner received dismissed callback?");
                    }

                    @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                    public void onExpired(PartnerAd partnerAd2) {
                        Intrinsics.f(partnerAd2, "partnerAd");
                        LogController.INSTANCE.e(partnerAd2.getRequest().getChartboostPlacement() + " Banner received expired callback?");
                    }

                    @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                    public void onImpressionTracked(PartnerAd partnerAd2) {
                        Intrinsics.f(partnerAd2, "partnerAd");
                    }

                    @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                    public void onRewarded(PartnerAd partnerAd2) {
                        Intrinsics.f(partnerAd2, "partnerAd");
                        LogController.INSTANCE.e(partnerAd2.getRequest().getChartboostPlacement() + " Banner received rewarded callback?");
                    }
                }, 8, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                Object objM161loadBWLJW6A = adController.m161loadBWLJW6A(context, adLoadParams, linkedHashSet, this);
                if (objM161loadBWLJW6A == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope2 = coroutineScope;
                obj2 = objM161loadBWLJW6A;
            } else {
                result = null;
            }
            this.this$0.fetchAdJob = null;
            zE = CoroutineScopeKt.e(coroutineScope);
            unit = Unit.f43263a;
            if (!zE) {
                return unit;
            }
            if (result != null) {
                HeliumBannerAd heliumBannerAd = this.$heliumBannerAd;
                String str3 = this.$loadId;
                BannerController bannerController3 = this.this$0;
                LogController.INSTANCE.e("Helium is not initialized.");
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new BannerController$getNextAd$1$2$3$1(heliumBannerAd, str3, bannerController3, null), 3);
                return unit;
            }
            z2 = this.$forceRefresh;
            bannerController = this.this$0;
            str = this.$loadId;
            obj3 = result.X;
            thA = Result.a(obj3);
            if (thA == null) {
                bannerController.handleLoadFailure(str, thA);
                return unit;
            }
            cachedAd = (CachedAd) obj3;
            partnerAd = cachedAd.getPartnerAd();
            if ((partnerAd != null ? partnerAd.getInlineView() : null) != null) {
                bannerController.handleLoadFailure(str, new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_NO_INLINE_VIEW));
                return unit;
            }
            if (z2) {
                bannerController.shownDurationMillis = ((long) bannerController.getRefreshTimeMillis()) + 1;
            }
            bannerController.handleLoadSuccess(cachedAd, str);
            return unit;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope2 = (CoroutineScope) this.L$0;
        ResultKt.b(obj);
        obj2 = ((Result) obj).X;
        result = new Result(obj2);
        coroutineScope = coroutineScope2;
        this.this$0.fetchAdJob = null;
        zE = CoroutineScopeKt.e(coroutineScope);
        unit = Unit.f43263a;
        if (!zE) {
            return unit;
        }
        if (result != null) {
            HeliumBannerAd heliumBannerAd2 = this.$heliumBannerAd;
            String str4 = this.$loadId;
            BannerController bannerController4 = this.this$0;
            LogController.INSTANCE.e("Helium is not initialized.");
            DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new BannerController$getNextAd$1$2$3$1(heliumBannerAd2, str4, bannerController4, null), 3);
            return unit;
        }
        z2 = this.$forceRefresh;
        bannerController = this.this$0;
        str = this.$loadId;
        obj3 = result.X;
        thA = Result.a(obj3);
        if (thA == null) {
            bannerController.handleLoadFailure(str, thA);
            return unit;
        }
        cachedAd = (CachedAd) obj3;
        partnerAd = cachedAd.getPartnerAd();
        if ((partnerAd != null ? partnerAd.getInlineView() : null) != null) {
            bannerController.handleLoadFailure(str, new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_NO_INLINE_VIEW));
            return unit;
        }
        if (z2) {
            bannerController.shownDurationMillis = ((long) bannerController.getRefreshTimeMillis()) + 1;
        }
        bannerController.handleLoadSuccess(cachedAd, str);
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerController$getNextAd$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
