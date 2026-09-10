package com.chartboost.heliumsdk.network;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.heliumsdk.domain.RewardedCallbackData;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.utils.MacroHelper;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u008a@¨\u0006\u0004"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "com/chartboost/heliumsdk/network/ChartboostMediationNetworking$safeApiCall$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1", f = "ChartboostMediationNetworking.kt", l = {406, TTAdConstant.VIDEO_INFO_CODE}, m = "invokeSuspend")
public final class ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends Unit>>, Object> {
    final /* synthetic */ MacroHelper $macroHelper$inlined;
    final /* synthetic */ RewardedCallbackData $rewardedCallbackData$inlined;
    final /* synthetic */ String $url$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1(Continuation continuation, RewardedCallbackData rewardedCallbackData, String str, MacroHelper macroHelper) {
        super(2, continuation);
        this.$rewardedCallbackData$inlined = rewardedCallbackData;
        this.$url$inlined = str;
        this.$macroHelper$inlined = macroHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1(continuation, this.$rewardedCallbackData$inlined, this.$url$inlined, this.$macroHelper$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r15 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends Unit>> continuation) {
        return ((ChartboostMediationNetworking$makeRewardedCallbackRequest$$inlined$safeApiCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
