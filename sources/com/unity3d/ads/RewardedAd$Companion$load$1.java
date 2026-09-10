package com.unity3d.ads;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import wj.h;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.ads.RewardedAd$Companion$load$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
public final class RewardedAd$Companion$load$1 extends i implements jk.c {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<RewardedAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener, f fVar) {
        super(2, fVar);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th2) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), "Unity Ads SDK load failed due to unexpected error: " + th2.getMessage()));
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        RewardedAd$Companion$load$1 rewardedAd$Companion$load$1 = new RewardedAd$Companion$load$1(this.$configuration, this.$listener, fVar);
        rewardedAd$Companion$load$1.L$0 = obj;
        return rewardedAd$Companion$load$1;
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((RewardedAd$Companion$load$1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        r rVar = r.f53297a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        LoadConfiguration loadConfiguration = this.$configuration;
        final LoadListener<RewardedAd> loadListener = this.$listener;
        try {
            LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), b0.X(loadConfiguration.getExtras()));
            UUID uuidRandomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(uuidRandomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
            UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$1$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    n.f(error, "error");
                    loadListener.onAdLoaded(null, error);
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    n.f(adObject, "adObject");
                    loadListener.onAdLoaded(new RewardedAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, d0.f44761a.b(SafeCallbackInvoke.class), 1, null))), null);
                }
            });
            objC = rVar;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        LoadListener<RewardedAd> loadListener2 = this.$listener;
        Throwable thA = h.a(objC);
        if (thA != null) {
            Utilities.wrapCustomerListener(new a(loadListener2, thA, 1));
        }
        return rVar;
    }
}
