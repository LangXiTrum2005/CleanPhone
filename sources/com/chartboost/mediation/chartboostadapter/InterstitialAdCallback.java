package com.chartboost.mediation.chartboostadapter;

import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdListener;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.utils.PartnerLogController;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.sv;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001cH\u0016R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/chartboost/mediation/chartboostadapter/InterstitialAdCallback;", "Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "request", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/chartboost/heliumsdk/domain/PartnerAdListener;", "continuationRef", "Ljava/lang/ref/WeakReference;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/Result;", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "(Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;Lcom/chartboost/heliumsdk/domain/PartnerAdListener;Ljava/lang/ref/WeakReference;)V", sv.f, "", "event", "Lcom/chartboost/sdk/events/ClickEvent;", "error", "Lcom/chartboost/sdk/events/ClickError;", "onAdDismiss", "Lcom/chartboost/sdk/events/DismissEvent;", sv.j, "Lcom/chartboost/sdk/events/CacheEvent;", "Lcom/chartboost/sdk/events/CacheError;", "onAdRequestedToShow", "Lcom/chartboost/sdk/events/ShowEvent;", "onAdShown", "Lcom/chartboost/sdk/events/ShowError;", "onImpressionRecorded", "Lcom/chartboost/sdk/events/ImpressionEvent;", "ChartboostAdapter_remoteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class InterstitialAdCallback implements InterstitialCallback {
    private final WeakReference<CancellableContinuation<Result<PartnerAd>>> continuationRef;
    private final PartnerAdListener listener;
    private final PartnerAdLoadRequest request;

    public InterstitialAdCallback(PartnerAdLoadRequest request, PartnerAdListener listener, WeakReference<CancellableContinuation<Result<PartnerAd>>> continuationRef) {
        Intrinsics.f(request, "request");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(continuationRef, "continuationRef");
        this.request = request;
        this.listener = listener;
        this.continuationRef = continuationRef;
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdClicked(ClickEvent event, ClickError error) {
        Intrinsics.f(event, "event");
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.DID_CLICK, null, 2, null);
        this.listener.onPartnerAdClicked(new PartnerAd(event.getAd(), EmptyMap.X, this.request));
    }

    @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
    public void onAdDismiss(DismissEvent event) {
        Intrinsics.f(event, "event");
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.DID_DISMISS, null, 2, null);
        this.listener.onPartnerAdDismissed(new PartnerAd(event.getAd(), EmptyMap.X, this.request), null);
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdLoaded(CacheEvent event, CacheError error) {
        Unit unit;
        Unit unit2;
        Intrinsics.f(event, "event");
        Unit unit3 = Unit.f43263a;
        if (error != null) {
            PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
            companion.log(PartnerLogController.PartnerAdapterEvents.LOAD_FAILED, String.valueOf(error));
            CancellableContinuation<Result<PartnerAd>> cancellableContinuation = this.continuationRef.get();
            if (cancellableContinuation != null) {
                if (cancellableContinuation.isActive()) {
                    cancellableContinuation.resumeWith(new Result(ResultKt.a(new ChartboostMediationAdException(ChartboostAdapter.INSTANCE.getChartboostMediationError$ChartboostAdapter_remoteRelease(error)))));
                }
                unit2 = unit3;
            } else {
                unit2 = null;
            }
            if (unit2 == null) {
                companion.log(PartnerLogController.PartnerAdapterEvents.CUSTOM, "Unable to resume continuation for onAdLoaded. Continuation is null.");
            }
            unit = unit3;
        } else {
            unit = null;
        }
        if (unit == null) {
            PartnerLogController.Companion companion2 = PartnerLogController.INSTANCE;
            PartnerLogController.Companion.log$default(companion2, PartnerLogController.PartnerAdapterEvents.LOAD_SUCCEEDED, null, 2, null);
            CancellableContinuation<Result<PartnerAd>> cancellableContinuation2 = this.continuationRef.get();
            if (cancellableContinuation2 == null) {
                unit3 = null;
            } else if (cancellableContinuation2.isActive()) {
                cancellableContinuation2.resumeWith(new Result(new PartnerAd(event.getAd(), EmptyMap.X, this.request)));
            }
            if (unit3 == null) {
                companion2.log(PartnerLogController.PartnerAdapterEvents.CUSTOM, "Unable to resume continuation for onAdLoaded. Continuation is null.");
            }
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdRequestedToShow(ShowEvent event) {
        Intrinsics.f(event, "event");
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onAdShown(ShowEvent event, ShowError error) {
        Unit unit;
        Intrinsics.f(event, "event");
        if (error != null) {
            ChartboostAdapter.Companion companion = ChartboostAdapter.INSTANCE;
            companion.getOnShowError$ChartboostAdapter_remoteRelease().invoke(event, error);
            companion.setOnShowError$ChartboostAdapter_remoteRelease(new Function2<ShowEvent, ShowError, Unit>() { // from class: com.chartboost.mediation.chartboostadapter.InterstitialAdCallback$onAdShown$1$1
                public final void invoke(ShowEvent showEvent, ShowError showError) {
                    Intrinsics.f(showEvent, "<anonymous parameter 0>");
                    Intrinsics.f(showError, "<anonymous parameter 1>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((ShowEvent) obj, (ShowError) obj2);
                    return Unit.f43263a;
                }
            });
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ChartboostAdapter.Companion companion2 = ChartboostAdapter.INSTANCE;
            companion2.getOnShowSuccess$ChartboostAdapter_remoteRelease().invoke();
            companion2.setOnShowSuccess$ChartboostAdapter_remoteRelease(new Function0<Unit>() { // from class: com.chartboost.mediation.chartboostadapter.InterstitialAdCallback$onAdShown$2$1
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m183invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m183invoke();
                    return Unit.f43263a;
                }
            });
        }
    }

    @Override // com.chartboost.sdk.callbacks.AdCallback
    public void onImpressionRecorded(ImpressionEvent event) {
        Intrinsics.f(event, "event");
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.DID_TRACK_IMPRESSION, null, 2, null);
        this.listener.onPartnerAdImpression(new PartnerAd(event.getAd(), EmptyMap.X, this.request));
    }
}
