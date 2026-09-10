package com.unity3d.ads;

import ak.f;
import android.app.Activity;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wj.r;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@UnityAdsExperimental
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/InterstitialAd;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/ShowConfiguration;", "configuration", "Lcom/unity3d/ads/InterstitialShowListener;", "listener", "Lwj/r;", "show", "(Landroid/app/Activity;Lcom/unity3d/ads/ShowConfiguration;Lcom/unity3d/ads/InterstitialShowListener;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/AdExpiredListener;", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InterstitialAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<InterstitialAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/InterstitialAd$Companion;", "", "<init>", "()V", "Lcom/unity3d/ads/LoadConfiguration;", "configuration", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/InterstitialAd;", "listener", "Lwj/r;", "load", "(Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/LoadListener;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void load(LoadConfiguration configuration, LoadListener<InterstitialAd> listener) {
            n.f(configuration, "configuration");
            n.f(listener, "listener");
            d0.w((a0) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class))), null, new InterstitialAd$Companion$load$1(configuration, listener, null), 3);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.InterstitialAd$show$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.InterstitialAd$show$1", f = "InterstitialAd.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements jk.c {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ShowConfiguration $configuration;
        final /* synthetic */ InterstitialShowListener $listener;
        int label;
        final /* synthetic */ InterstitialAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShowConfiguration showConfiguration, InterstitialAd interstitialAd, Activity activity, InterstitialShowListener interstitialShowListener, f fVar) {
            super(2, fVar);
            this.$configuration = showConfiguration;
            this.this$0 = interstitialAd;
            this.$activity = activity;
            this.$listener = interstitialShowListener;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$configuration, this.this$0, this.$activity, this.$listener, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            Map<String, String> extras;
            Map<String, String> extras2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            ShowConfiguration showConfiguration = this.$configuration;
            IServiceProvider iServiceProvider = null;
            byte b10 = 0;
            String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
            ShowConfiguration showConfiguration2 = this.$configuration;
            if (showConfiguration2 == null || (extras = showConfiguration2.getExtras()) == null) {
                extras = w.f53867a;
            }
            ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, extras);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(this.this$0.adObject.getOpportunityId()).toString());
            unityAdsShowOptions.showConfiguration = showConfigurationInternal;
            MetaData metaData = new MetaData(this.$activity);
            ShowConfiguration showConfiguration3 = this.$configuration;
            if (showConfiguration3 != null && (extras2 = showConfiguration3.getExtras()) != null) {
                for (Map.Entry<String, String> entry : extras2.entrySet()) {
                    metaData.set(entry.getKey(), entry.getValue());
                }
            }
            metaData.commit();
            this.this$0.adObject.setShowConfiguration(this.$configuration);
            AdObject adObject = this.this$0.adObject;
            ShowConfiguration showConfiguration4 = this.$configuration;
            adObject.setPlayerServerId(showConfiguration4 != null ? showConfiguration4.getCustomRewardString() : null);
            this.this$0.adObject.setActivity(new WeakReference<>(this.$activity));
            UnityAdsSDK unityAdsSDK = new UnityAdsSDK(iServiceProvider, 1, b10 == true ? 1 : 0);
            String placementId = this.this$0.adObject.getPlacementId();
            final InterstitialShowListener interstitialShowListener = this.$listener;
            final InterstitialAd interstitialAd = this.this$0;
            unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.InterstitialAd.show.1.2

                /* JADX INFO: renamed from: com.unity3d.ads.InterstitialAd$show$1$2$WhenMappings */
                /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String placementId2) {
                    n.f(placementId2, "placementId");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onClicked(interstitialAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String placementId2, UnityAds.UnityAdsShowCompletionState state) {
                    ShowFinishState showFinishState;
                    n.f(placementId2, "placementId");
                    n.f(state, "state");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        InterstitialAd interstitialAd2 = interstitialAd;
                        int i10 = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
                        if (i10 == 1) {
                            showFinishState = ShowFinishState.COMPLETED;
                        } else {
                            if (i10 != 2) {
                                throw new aa.b((byte) 0, 20);
                            }
                            showFinishState = ShowFinishState.SKIPPED;
                        }
                        interstitialShowListener2.onCompleted(interstitialAd2, showFinishState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String placementId2, UnityAds.UnityAdsShowError error, String message) {
                    ErrorOuterClass.PublicErrorCode publicErrorCode;
                    n.f(placementId2, "placementId");
                    n.f(error, "error");
                    n.f(message, "message");
                    int i10 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i10 == 1) {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                    } else if (i10 != 2) {
                        publicErrorCode = i10 != 3 ? ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                    } else {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                    }
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onFailed(interstitialAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String placementId2) {
                    n.f(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(String str) {
                    Listeners.DefaultImpls.onRewarded(this, str);
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String placementId2) {
                    n.f(placementId2, "placementId");
                    InterstitialShowListener interstitialShowListener2 = interstitialShowListener;
                    if (interstitialShowListener2 != null) {
                        interstitialShowListener2.onStarted(interstitialAd);
                    }
                }
            });
            return r.f53297a;
        }
    }

    public InterstitialAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        a0 scope;
        n.f(adObject, "adObject");
        n.f(safeCallbackInvoke, "safeCallbackInvoke");
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        d0.w(scope, null, new InterstitialAd$1$1(this, null), 3);
    }

    public static final void load(LoadConfiguration loadConfiguration, LoadListener<InterstitialAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(InterstitialAd interstitialAd, Activity activity, ShowConfiguration showConfiguration, InterstitialShowListener interstitialShowListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            showConfiguration = null;
        }
        if ((i10 & 4) != 0) {
            interstitialShowListener = null;
        }
        interstitialAd.show(activity, showConfiguration, interstitialShowListener);
    }

    public final AdExpiredListener<InterstitialAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<InterstitialAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(Activity activity, ShowConfiguration configuration, InterstitialShowListener listener) {
        n.f(activity, "activity");
        d0.w((a0) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class))), null, new AnonymousClass1(configuration, this, activity, listener, null), 3);
    }
}
