package com.unity3d.ads.core.domain;

import com.unity3d.ads.MediationInfo;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonMediationInfoConverter;", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "mediationProviderParser", "Lcom/unity3d/ads/core/domain/MediationProviderParser;", "(Lcom/unity3d/ads/core/domain/MediationProviderParser;)V", "invoke", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfoData", "Lcom/unity3d/ads/MediationInfo;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonMediationInfoConverter implements MediationInfoConverter {
    private final MediationProviderParser mediationProviderParser;

    public CommonMediationInfoConverter(MediationProviderParser mediationProviderParser) {
        n.f(mediationProviderParser, "mediationProviderParser");
        this.mediationProviderParser = mediationProviderParser;
    }

    @Override // com.unity3d.ads.core.domain.MediationInfoConverter
    public MediationInfoOuterClass.MediationInfo invoke(MediationInfo mediationInfoData) {
        n.f(mediationInfoData, "mediationInfoData");
        ClientInfoOuterClass.MediationProvider mediationProviderInvoke = this.mediationProviderParser.invoke(mediationInfoData.getName());
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.INSTANCE;
        MediationInfoOuterClass.MediationInfo.Builder builderNewBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        MediationInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProvider(mediationProviderInvoke);
        if (mediationProviderInvoke == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            dsl_create.setCustomName(mediationInfoData.getName());
        }
        dsl_create.setVersion(mediationInfoData.getVersion());
        dsl_create.setAdapterVersion(mediationInfoData.getAdapterVersion());
        return dsl_create._build();
    }
}
