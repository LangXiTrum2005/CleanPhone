package com.unity3d.ads.core.domain;

import ak.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "mediationInfoConverter", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "", "placement", "Lcom/google/protobuf/ByteString;", "opportunityId", "configToken", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "loadConfiguration", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final MediationInfoConverter mediationInfoConverter;

    public AndroidGetAdPlayerConfigRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, MediationInfoConverter mediationInfoConverter) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(mediationInfoConverter, "mediationInfoConverter");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayerConfigRequest
    public Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, LoadConfigurationInternal loadConfigurationInternal, f fVar) {
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.INSTANCE;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builderNewBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        final AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConfigurationToken(byteString2);
        dsl_create.setPlacementId(str);
        dsl_create.setImpressionOpportunityId(byteString);
        if (adFormat != null) {
            dsl_create.setAdFormat(adFormat);
        }
        if (loadConfigurationInternal != null) {
            String mediationAdUnitId = loadConfigurationInternal.getMediationAdUnitId();
            if (mediationAdUnitId != null) {
                new q(dsl_create) { // from class: com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest$invoke$request$1$2$2
                    @Override // qk.r
                    public Object get() {
                        return ((AdPlayerConfigRequestKt.Dsl) this.receiver).getMediationAdUnitId();
                    }

                    @Override // qk.j
                    public void set(Object obj) {
                        ((AdPlayerConfigRequestKt.Dsl) this.receiver).setMediationAdUnitId((String) obj);
                    }
                }.set(mediationAdUnitId);
            }
            MediationInfo mediationInfo = loadConfigurationInternal.getMediationInfo();
            if (mediationInfo != null) {
                dsl_create.setMediationInfo(this.mediationInfoConverter.invoke(mediationInfo));
            }
            dsl_create.putAllExtras(dsl_create.getExtrasMap(), loadConfigurationInternal.getExtras());
        }
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest_build = dsl_create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        n.e(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdPlayerConfigRequest(adPlayerConfigRequest_build);
        return this.getUniversalRequestForPayLoad.invoke(dsl_create2._build(), fVar);
    }
}
