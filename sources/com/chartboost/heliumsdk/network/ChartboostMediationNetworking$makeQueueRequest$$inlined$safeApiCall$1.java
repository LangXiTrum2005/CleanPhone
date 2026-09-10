package com.chartboost.heliumsdk.network;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.network.model.ChartboostMediationHeaderMap;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.network.model.QueueRequestBody;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.ads.RequestConfiguration;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.Headers;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u008a@¨\u0006\u0004"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "com/chartboost/heliumsdk/network/ChartboostMediationNetworking$safeApiCall$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1", f = "ChartboostMediationNetworking.kt", l = {TTAdConstant.IMAGE_URL_CODE}, m = "invokeSuspend")
public final class ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends Unit>>, Object> {
    final /* synthetic */ Integer $actualMaxQueueSize$inlined;
    final /* synthetic */ String $appSetId$inlined;
    final /* synthetic */ boolean $isRunning$inlined;
    final /* synthetic */ String $placementName$inlined;
    final /* synthetic */ int $queueCapacity$inlined;
    final /* synthetic */ int $queueDepth$inlined;
    final /* synthetic */ String $queueId$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1(Continuation continuation, String str, Integer num, int i2, int i3, String str2, boolean z2, String str3) {
        super(2, continuation);
        this.$placementName$inlined = str;
        this.$actualMaxQueueSize$inlined = num;
        this.$queueCapacity$inlined = i2;
        this.$queueDepth$inlined = i3;
        this.$queueId$inlined = str2;
        this.$isRunning$inlined = z2;
        this.$appSetId$inlined = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1(continuation, this.$placementName$inlined, this.$actualMaxQueueSize$inlined, this.$queueCapacity$inlined, this.$queueDepth$inlined, this.$queueId$inlined, this.$isRunning$inlined, this.$appSetId$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChartboostMediationNetworkingResult.Failure failure;
        String endpoint;
        Object objTrackQueueRequest;
        Object jsonParsingFailure;
        Object objDecodeFromString;
        ChartboostMediationError chartboostMediationError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                QueueRequestBody queueRequestBody = new QueueRequestBody((String) null, this.$placementName$inlined, this.$actualMaxQueueSize$inlined, this.$queueCapacity$inlined, this.$queueDepth$inlined, this.$queueId$inlined, 1, (DefaultConstructorMarker) null);
                ChartboostMediationApi api = ChartboostMediationNetworking.INSTANCE.getApi();
                boolean z2 = this.$isRunning$inlined;
                if (z2) {
                    endpoint = Endpoints.Sdk.Event.START_QUEUE.getEndpoint();
                } else {
                    if (z2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    endpoint = Endpoints.Sdk.Event.END_QUEUE.getEndpoint();
                }
                ChartboostMediationHeaderMap.ChartboostQueueRequestMediationHeaderMap chartboostQueueRequestMediationHeaderMap = new ChartboostMediationHeaderMap.ChartboostQueueRequestMediationHeaderMap(this.$queueId$inlined, this.$appSetId$inlined);
                this.label = 1;
                objTrackQueueRequest = api.trackQueueRequest(endpoint, chartboostQueueRequestMediationHeaderMap, queueRequestBody, this);
                if (objTrackQueueRequest == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objTrackQueueRequest = obj;
            }
            Response response = (Response) objTrackQueueRequest;
            ChartboostMediationNetworkingResult.Companion companion = ChartboostMediationNetworkingResult.INSTANCE;
            NetworkError networkErrorTransform = NetworkErrorTransformer.INSTANCE.transform(response);
            if (response.isSuccessful()) {
                try {
                    int iCode = response.code();
                    Headers headers = response.headers();
                    Intrinsics.e(headers, "response.headers()");
                    if (response.code() == 200) {
                        Json heliumJson = HeliumJsonKt.getHeliumJson();
                        KSerializer nullable = BuiltinSerializersKt.getNullable(UnitSerializer.INSTANCE);
                        String str = (String) response.body();
                        if (str == null) {
                            str = "";
                        }
                        objDecodeFromString = heliumJson.decodeFromString(nullable, str);
                    } else {
                        objDecodeFromString = null;
                    }
                    return new ChartboostMediationNetworkingResult.Success(iCode, headers, objDecodeFromString);
                } catch (SerializationException e2) {
                    Headers headers2 = response.headers();
                    Intrinsics.e(headers2, "response.headers()");
                    jsonParsingFailure = new ChartboostMediationNetworkingResult.JsonParsingFailure(-1, headers2, ChartboostMediationError.CM_INTERNAL_ERROR, e2);
                } catch (Throwable th) {
                    failure = new ChartboostMediationNetworkingResult.Failure(-1, response.headers(), ChartboostMediationError.CM_INTERNAL_ERROR, th);
                    return failure;
                }
            } else {
                int iCode2 = response.code();
                Headers headers3 = response.headers();
                if (networkErrorTransform == null || (chartboostMediationError = networkErrorTransform.getChartboostMediationError()) == null) {
                    chartboostMediationError = ChartboostMediationError.CM_INTERNAL_ERROR;
                }
                jsonParsingFailure = new ChartboostMediationNetworkingResult.Failure(iCode2, headers3, chartboostMediationError, null, 8, null);
            }
            return jsonParsingFailure;
        } catch (Throwable th2) {
            LogController.INSTANCE.e("Error making network request: " + th2.getMessage());
            failure = new ChartboostMediationNetworkingResult.Failure(-1, null, th2 instanceof UnknownHostException ? ChartboostMediationError.CM_NO_CONNECTIVITY : ChartboostMediationError.CM_UNKNOWN_ERROR, th2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends Unit>> continuation) {
        return ((ChartboostMediationNetworking$makeQueueRequest$$inlined$safeApiCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
