package com.unity3d.ads.core.domain.exposure;

import ak.f;
import bk.a;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdRefreshState;
import com.unity3d.ads.core.data.model.AdRefreshStateKt;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import t9.e;
import xj.b0;
import zm.i;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "it", "invoke", "([Ljava/lang/Object;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CommonAdViewerExposedFunctionsKt$getAdContext$1 implements ExposedFunction {
    final /* synthetic */ String $adData;
    final /* synthetic */ String $adDataRefreshToken;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ AndroidGetAdPlayerContext $getAndroidAdPlayerContext;
    final /* synthetic */ String $impressionConfig;
    final /* synthetic */ IsOMActivated $isOMActivated;

    public CommonAdViewerExposedFunctionsKt$getAdContext$1(String str, String str2, String str3, AndroidGetAdPlayerContext androidGetAdPlayerContext, AdObject adObject, IsOMActivated isOMActivated) {
        this.$adData = str;
        this.$impressionConfig = str2;
        this.$adDataRefreshToken = str3;
        this.$getAndroidAdPlayerContext = androidGetAdPlayerContext;
        this.$adObject = adObject;
        this.$isOMActivated = isOMActivated;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, jk.c
    public final Object invoke(Object[] objArr, f fVar) throws JSONException {
        CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1;
        String str;
        AdObject adObject;
        Map map;
        Map builder;
        IsOMActivated isOMActivated;
        Map map2;
        AdRefreshState adRefreshState;
        if (fVar instanceof CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1) fVar;
            int i10 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, fVar);
            }
        } else {
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1(this, fVar);
        }
        Object objInvoke = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.result;
        int i11 = commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label;
        if (i11 == 0) {
            e.z(objInvoke);
            String str2 = this.$adData;
            String str3 = this.$impressionConfig;
            String str4 = this.$adDataRefreshToken;
            AndroidGetAdPlayerContext androidGetAdPlayerContext = this.$getAndroidAdPlayerContext;
            AdObject adObject2 = this.$adObject;
            IsOMActivated isOMActivated2 = this.$isOMActivated;
            yj.f fVar2 = new yj.f();
            fVar2.put("adData", str2);
            fVar2.put(HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG, str3);
            fVar2.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, str4);
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0 = adObject2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1 = isOMActivated2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2 = fVar2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3 = fVar2;
            str = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4 = HandleInvocationsFromAdViewer.KEY_NATIVE_CONTEXT;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5 = fVar2;
            commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.label = 1;
            objInvoke = androidGetAdPlayerContext.invoke(commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1);
            a aVar = a.f5708a;
            if (objInvoke == aVar) {
                return aVar;
            }
            adObject = adObject2;
            map = fVar2;
            builder = map;
            isOMActivated = isOMActivated2;
            map2 = builder;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map2 = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$5;
            str = (String) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$4;
            map = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$3;
            builder = (Map) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$2;
            isOMActivated = (IsOMActivated) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$1;
            adObject = (AdObject) commonAdViewerExposedFunctionsKt$getAdContext$1$invoke$1.L$0;
            e.z(objInvoke);
        }
        map2.put(str, objInvoke);
        map.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null));
        JSONObject data = adObject.getLoadOptions().getData();
        if (data != null && data.length() != 0) {
            Iterator<String> itKeys = data.keys();
            n.e(itKeys, "loadOptions.keys()");
            i iVarM = l.M(itKeys);
            JSONObject jSONObject = new JSONObject();
            for (String str5 : (zm.a) iVarM) {
                if (!n.a(str5, "adMarkup") && !n.a(str5, "objectId")) {
                    jSONObject = jSONObject.put(str5, data.get(str5));
                    n.e(jSONObject, "acc.put(key, loadOptions[key])");
                }
            }
            map.put(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, jSONObject);
        }
        if (isOMActivated.invoke()) {
            map.put(HandleInvocationsFromAdViewer.KEY_OMID, b0.Q(new wj.f(HandleInvocationsFromAdViewer.KEY_OMJS_SESSION, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SESSION), new wj.f(HandleInvocationsFromAdViewer.KEY_OMJS_SERVICE, UnityAdsConstants.OpenMeasurement.OM_JS_URL_SERVICE)));
        }
        map.put(HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, Boolean.valueOf(adObject.isHeaderBidding()));
        String string = ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString();
        n.e(string, "adObject.opportunityId.toUUID().toString()");
        map.put("impressionOpportunityId", string);
        AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = adObject.getWebViewLessLoadingRequiredData();
        if (webViewLessLoadingRequiredData != null && (adRefreshState = webViewLessLoadingRequiredData.getAdRefreshState()) != null) {
            map.put(HandleInvocationsFromAdViewer.KEY_AD_REFRESH_INVALIDATION_REASON, AdRefreshStateKt.getInvalidationReason(adRefreshState));
        }
        n.f(builder, "builder");
        return ((yj.f) builder).g();
    }
}
