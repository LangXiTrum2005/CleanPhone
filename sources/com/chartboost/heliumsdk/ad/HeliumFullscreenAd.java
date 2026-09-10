package com.chartboost.heliumsdk.ad;

import android.app.Activity;
import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Keywords;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.FullscreenAdShowingState;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Deprecated;
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
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020%H\u0016J\b\u0010'\u001a\u00020%H\u0016J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020%R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAd;", "Lcom/chartboost/heliumsdk/ad/HeliumAd;", "context", "Landroid/content/Context;", "placementName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "appContext", "kotlin.jvm.PlatformType", "cachedAd", "Lcom/chartboost/heliumsdk/domain/CachedAd;", "getCachedAd", "()Lcom/chartboost/heliumsdk/domain/CachedAd;", "setCachedAd", "(Lcom/chartboost/heliumsdk/domain/CachedAd;)V", "fullscreenAdShowingState", "Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", "getFullscreenAdShowingState", "()Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", "inflightRequest", "Lkotlinx/coroutines/Job;", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "getListener", "()Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;", "setListener", "(Lcom/chartboost/heliumsdk/ad/HeliumFullscreenAdListener;)V", "getPlacementName", "()Ljava/lang/String;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "clearLoaded", "", "destroy", "load", "readyToShow", "", "show", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class HeliumFullscreenAd implements HeliumAd {
    private final Context appContext;
    private CachedAd cachedAd;
    private Job inflightRequest;
    private final Keywords keywords;
    private HeliumFullscreenAdListener listener;
    private final String placementName;
    private final WeakReference<Activity> weakActivity;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$1", f = "HeliumFullscreenAd.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CachedAd $previousLoadedAd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CachedAd cachedAd, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$previousLoadedAd = cachedAd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeliumFullscreenAd.this.new AnonymousClass1(this.$previousLoadedAd, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HeliumFullscreenAdListener listener = HeliumFullscreenAd.this.getListener();
            if (listener != null) {
                listener.onAdCached(HeliumFullscreenAd.this.getPlacementName(), this.$previousLoadedAd.getLoadId(), this.$previousLoadedAd.getWinningBidInfo(), null);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$3", f = "HeliumFullscreenAd.kt", l = {80}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $loadId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HeliumFullscreenAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, HeliumFullscreenAd heliumFullscreenAd, String str, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = heliumFullscreenAd;
            this.$loadId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$context, this.this$0, this.$loadId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0089  */
        /* JADX WARN: Code duplicated, block: B:20:0x008f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0092  */
        /* JADX WARN: Code duplicated, block: B:24:0x009e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Result result;
            CoroutineScope coroutineScope2;
            Object obj2;
            boolean zE;
            Unit unit;
            String str;
            HeliumFullscreenAd heliumFullscreenAd;
            Object obj3;
            Throwable thA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                AdController adController = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController();
                if (adController != null) {
                    Context context = this.$context;
                    Intrinsics.e(context, "context");
                    AdIdentifier adIdentifier = new AdIdentifier(this.this$0.getAdType(), this.this$0.getPlacementName());
                    Keywords keywords = this.this$0.getKeywords();
                    String str2 = this.$loadId;
                    final HeliumFullscreenAd heliumFullscreenAd2 = this.this$0;
                    AdLoadParams adLoadParams = new AdLoadParams(adIdentifier, keywords, str2, null, null, new AdInteractionListener() { // from class: com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$3$loadResult$1
                        @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                        public void onClicked(PartnerAd partnerAd) {
                            Intrinsics.f(partnerAd, "partnerAd");
                            HeliumFullscreenAdListener listener = heliumFullscreenAd2.getListener();
                            if (listener != null) {
                                listener.onAdClicked(partnerAd.getRequest().getChartboostPlacement());
                            }
                        }

                        @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                        public void onDismissed(PartnerAd partnerAd, ChartboostMediationAdException error) {
                            Intrinsics.f(partnerAd, "partnerAd");
                            FullscreenAdShowingState fullscreenAdShowingState = heliumFullscreenAd2.getFullscreenAdShowingState();
                            if (fullscreenAdShowingState != null) {
                                fullscreenAdShowingState.notifyFullscreenAdClosed();
                            }
                            HeliumFullscreenAdListener listener = heliumFullscreenAd2.getListener();
                            if (listener != null) {
                                listener.onAdClosed(heliumFullscreenAd2.getPlacementName(), error);
                            }
                        }

                        @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                        public void onExpired(PartnerAd partnerAd) {
                            Intrinsics.f(partnerAd, "partnerAd");
                            heliumFullscreenAd2.setCachedAd(null);
                        }

                        @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                        public void onImpressionTracked(PartnerAd partnerAd) {
                            Intrinsics.f(partnerAd, "partnerAd");
                        }

                        @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                        public void onRewarded(PartnerAd partnerAd) {
                            Intrinsics.f(partnerAd, "partnerAd");
                            HeliumFullscreenAdListener listener = heliumFullscreenAd2.getListener();
                            if (listener != null) {
                                listener.onAdRewarded(partnerAd.getRequest().getChartboostPlacement());
                            }
                        }
                    }, 8, null);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
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
                zE = CoroutineScopeKt.e(coroutineScope);
                unit = Unit.f43263a;
                if (!zE) {
                    this.this$0.inflightRequest = null;
                    return unit;
                }
                if (result != null) {
                    HeliumFullscreenAd heliumFullscreenAd3 = this.this$0;
                    String str3 = this.$loadId;
                    LogController.INSTANCE.e("Helium is not initialized.");
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$3$1(heliumFullscreenAd3, str3, null), 3);
                    return unit;
                }
                str = this.$loadId;
                heliumFullscreenAd = this.this$0;
                obj3 = result.X;
                thA = Result.a(obj3);
                if (thA == null) {
                    DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$2$1(heliumFullscreenAd, str, thA, null), 3);
                    return unit;
                }
                CachedAd cachedAd = (CachedAd) obj3;
                cachedAd.setLoadId(str);
                heliumFullscreenAd.setCachedAd(cachedAd);
                DefaultScheduler defaultScheduler3 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$1$1(heliumFullscreenAd, str, cachedAd, null), 3);
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
            zE = CoroutineScopeKt.e(coroutineScope);
            unit = Unit.f43263a;
            if (!zE) {
                this.this$0.inflightRequest = null;
                return unit;
            }
            if (result != null) {
                HeliumFullscreenAd heliumFullscreenAd4 = this.this$0;
                String str4 = this.$loadId;
                LogController.INSTANCE.e("Helium is not initialized.");
                DefaultScheduler defaultScheduler4 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$3$1(heliumFullscreenAd4, str4, null), 3);
                return unit;
            }
            str = this.$loadId;
            heliumFullscreenAd = this.this$0;
            obj3 = result.X;
            thA = Result.a(obj3);
            if (thA == null) {
                DefaultScheduler defaultScheduler5 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$2$1(heliumFullscreenAd, str, thA, null), 3);
                return unit;
            }
            CachedAd cachedAd2 = (CachedAd) obj3;
            cachedAd2.setLoadId(str);
            heliumFullscreenAd.setCachedAd(cachedAd2);
            DefaultScheduler defaultScheduler6 = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$load$3$1$1(heliumFullscreenAd, str, cachedAd2, null), 3);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.HeliumFullscreenAd$show$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.HeliumFullscreenAd$show$2", f = "HeliumFullscreenAd.kt", l = {193}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CachedAd $showingAd;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HeliumFullscreenAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, CachedAd cachedAd, HeliumFullscreenAd heliumFullscreenAd, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$showingAd = cachedAd;
            this.this$0 = heliumFullscreenAd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.$showingAd, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0045  */
        /* JADX WARN: Code duplicated, block: B:18:0x0090  */
        /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChartboostMediationAdShowResult chartboostMediationAdShowResult;
            ChartboostMediationError error;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AdController adController = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController();
                if (adController != null) {
                    Context context = this.$context;
                    Intrinsics.e(context, "context");
                    CachedAd cachedAd = this.$showingAd;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = adController.show(context, cachedAd, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    Metrics metrics = new Metrics(null, Endpoints.Sdk.Event.SHOW);
                    metrics.setStart(new Long(System.currentTimeMillis()));
                    metrics.setEnd(new Long(System.currentTimeMillis()));
                    metrics.setDuration(new Long(0L));
                    metrics.setSuccess(false);
                    ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED;
                    metrics.setChartboostMediationError(chartboostMediationError);
                    metrics.setChartboostMediationErrorMessage(chartboostMediationError.getMessage());
                    chartboostMediationAdShowResult = new ChartboostMediationAdShowResult(jSONObject, chartboostMediationError);
                }
                error = chartboostMediationAdShowResult.getError();
                if (error != null) {
                    HeliumFullscreenAd heliumFullscreenAd = this.this$0;
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$show$2$1$1(heliumFullscreenAd, error, null), 3);
                } else {
                    HeliumFullscreenAd heliumFullscreenAd2 = this.this$0;
                    DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$show$2$2$1(heliumFullscreenAd2, null), 3);
                }
                return Unit.f43263a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            chartboostMediationAdShowResult = (ChartboostMediationAdShowResult) obj;
            if (chartboostMediationAdShowResult == null) {
                JSONObject jSONObject2 = new JSONObject();
                Metrics metrics2 = new Metrics(null, Endpoints.Sdk.Event.SHOW);
                metrics2.setStart(new Long(System.currentTimeMillis()));
                metrics2.setEnd(new Long(System.currentTimeMillis()));
                metrics2.setDuration(new Long(0L));
                metrics2.setSuccess(false);
                ChartboostMediationError chartboostMediationError2 = ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED;
                metrics2.setChartboostMediationError(chartboostMediationError2);
                metrics2.setChartboostMediationErrorMessage(chartboostMediationError2.getMessage());
                chartboostMediationAdShowResult = new ChartboostMediationAdShowResult(jSONObject2, chartboostMediationError2);
            }
            error = chartboostMediationAdShowResult.getError();
            if (error != null) {
                HeliumFullscreenAd heliumFullscreenAd3 = this.this$0;
                DefaultScheduler defaultScheduler3 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$show$2$1$1(heliumFullscreenAd3, error, null), 3);
            } else {
                HeliumFullscreenAd heliumFullscreenAd4 = this.this$0;
                DefaultScheduler defaultScheduler4 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$show$2$2$1(heliumFullscreenAd4, null), 3);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public HeliumFullscreenAd(Context context, String placementName) {
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        this.placementName = placementName;
        this.weakActivity = new WeakReference<>(context instanceof Activity ? (Activity) context : null);
        this.appContext = context.getApplicationContext();
        this.keywords = new Keywords();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FullscreenAdShowingState getFullscreenAdShowingState() {
        return HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getFullscreenAdShowingState();
    }

    public final void clearLoaded() {
        Job job = this.inflightRequest;
        if (job != null) {
            job.a(null);
        }
        this.inflightRequest = null;
        this.cachedAd = null;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public void destroy() {
        clearLoaded();
        this.listener = null;
        this.weakActivity.clear();
    }

    public final CachedAd getCachedAd() {
        return this.cachedAd;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public Keywords getKeywords() {
        return this.keywords;
    }

    public final HeliumFullscreenAdListener getListener() {
        return this.listener;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public String getPlacementName() {
        return this.placementName;
    }

    @Override // com.chartboost.heliumsdk.ad.HeliumAd
    public void load() {
        Activity activity = this.weakActivity.get();
        if (activity == null) {
            activity = this.appContext;
        }
        if (this.inflightRequest != null) {
            LogController.INSTANCE.d(ChartboostMediationError.CM_LOAD_FAILURE_LOAD_IN_PROGRESS.getMessage());
            return;
        }
        CachedAd cachedAd = this.cachedAd;
        if (cachedAd != null) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new AnonymousClass1(cachedAd, null), 3);
            return;
        }
        String str = Environment.INSTANCE.getSessionId$Helium_release() + System.currentTimeMillis();
        DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
        this.inflightRequest = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new HeliumFullscreenAd$load$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, this, str), null, new AnonymousClass3(activity, this, str, null), 2);
    }

    public final boolean readyToShow() {
        return this.cachedAd != null;
    }

    public final void setCachedAd(CachedAd cachedAd) {
        this.cachedAd = cachedAd;
    }

    public final void setListener(HeliumFullscreenAdListener heliumFullscreenAdListener) {
        this.listener = heliumFullscreenAdListener;
    }

    public final void show() {
        Activity activity = this.weakActivity.get();
        if (activity == null) {
            activity = this.appContext;
        }
        CachedAd cachedAd = this.cachedAd;
        if (cachedAd == null) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new HeliumFullscreenAd$show$showingAd$1$1(this, null), 3);
        } else {
            this.cachedAd = null;
            DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new HeliumFullscreenAd$show$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, this), null, new AnonymousClass2(activity, cachedAd, this, null), 2);
        }
    }
}
