package com.chartboost.heliumsdk.network;

import com.chartboost.heliumsdk.domain.AppConfig;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.network.model.ChartboostMediationHeaderMap;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.ads.RequestConfiguration;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import okhttp3.Headers;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u008a@¨\u0006\u0004"}, d2 = {"<anonymous>", "Lcom/chartboost/heliumsdk/network/model/ChartboostMediationNetworkingResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "com/chartboost/heliumsdk/network/ChartboostMediationNetworking$safeApiCall$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.network.ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1", f = "ChartboostMediationNetworking.kt", l = {405}, m = "invokeSuspend")
public final class ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends AppConfig>>, Object> {
    final /* synthetic */ String $appId$inlined;
    final /* synthetic */ String $appSetId$inlined;
    final /* synthetic */ String $initHash$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1(Continuation continuation, String str, String str2, String str3) {
        super(2, continuation);
        this.$appId$inlined = str;
        this.$initHash$inlined = str2;
        this.$appSetId$inlined = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1(continuation, this.$appId$inlined, this.$initHash$inlined, this.$appSetId$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objDecodeFromString;
        ChartboostMediationError chartboostMediationError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationApi api = ChartboostMediationNetworking.INSTANCE.getApi();
                String str = Endpoints.Sdk.SDK_INIT.getEndpoint() + IOUtils.DIR_SEPARATOR_UNIX + this.$appId$inlined;
                ChartboostMediationHeaderMap.ChartboostMediationAppConfigHeaderMap chartboostMediationAppConfigHeaderMap = new ChartboostMediationHeaderMap.ChartboostMediationAppConfigHeaderMap(this.$initHash$inlined, this.$appSetId$inlined);
                this.label = 1;
                obj = api.getConfig(str, chartboostMediationAppConfigHeaderMap, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            Response response = (Response) obj;
            ChartboostMediationNetworkingResult.Companion companion = ChartboostMediationNetworkingResult.INSTANCE;
            NetworkError networkErrorTransform = NetworkErrorTransformer.INSTANCE.transform(response);
            if (!response.isSuccessful()) {
                int iCode = response.code();
                Headers headers = response.headers();
                if (networkErrorTransform == null || (chartboostMediationError = networkErrorTransform.getChartboostMediationError()) == null) {
                    chartboostMediationError = ChartboostMediationError.CM_INTERNAL_ERROR;
                }
                return new ChartboostMediationNetworkingResult.Failure(iCode, headers, chartboostMediationError, null, 8, null);
            }
            try {
                try {
                    int iCode2 = response.code();
                    Headers headers2 = response.headers();
                    Intrinsics.e(headers2, "response.headers()");
                    if (response.code() == 200) {
                        Json heliumJson = HeliumJsonKt.getHeliumJson();
                        KSerializer nullable = BuiltinSerializersKt.getNullable(AppConfig.INSTANCE.serializer());
                        String str2 = (String) response.body();
                        if (str2 == null) {
                            str2 = "";
                        }
                        objDecodeFromString = heliumJson.decodeFromString(nullable, str2);
                    } else {
                        objDecodeFromString = null;
                    }
                    return new ChartboostMediationNetworkingResult.Success(iCode2, headers2, objDecodeFromString);
                } catch (SerializationException e2) {
                    Headers headers3 = response.headers();
                    Intrinsics.e(headers3, "response.headers()");
                    return new ChartboostMediationNetworkingResult.JsonParsingFailure(-1, headers3, ChartboostMediationError.CM_INTERNAL_ERROR, e2);
                }
            } catch (Throwable th) {
                return new ChartboostMediationNetworkingResult.Failure(-1, response.headers(), ChartboostMediationError.CM_INTERNAL_ERROR, th);
            }
        } catch (Throwable th2) {
            LogController.INSTANCE.e("Error making network request: " + th2.getMessage());
            return new ChartboostMediationNetworkingResult.Failure(-1, null, th2 instanceof UnknownHostException ? ChartboostMediationError.CM_NO_CONNECTIVITY : ChartboostMediationError.CM_UNKNOWN_ERROR, th2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartboostMediationNetworkingResult<? extends AppConfig>> continuation) {
        return ((ChartboostMediationNetworking$getAppConfig$$inlined$safeApiCall$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
