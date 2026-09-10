package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.AdRevenueAdFormat;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueDataKt;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidGetAdRevenueEventData;", "Lcom/unity3d/ads/core/domain/events/GetAdRevenueEventData;", "()V", "invoke", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "data", "Lcom/unity3d/ads/core/data/model/AdRevenueData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetAdRevenueEventData implements GetAdRevenueEventData {
    @Override // com.unity3d.ads.core.domain.events.GetAdRevenueEventData
    public AdRevenueEventRequestOuterClass.AdRevenueData invoke(AdRevenueData data) {
        AdFormatOuterClass.AdFormat proto;
        n.f(data, "data");
        AdRevenueDataKt.Dsl.Companion companion = AdRevenueDataKt.Dsl.INSTANCE;
        AdRevenueEventRequestOuterClass.AdRevenueData.Builder builderNewBuilder = AdRevenueEventRequestOuterClass.AdRevenueData.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        AdRevenueDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setEventId(ProtobufExtensionsKt.toByteString(data.getEventId()));
        Double revenue = data.getRevenue();
        if (revenue != null) {
            dsl_create.setRevenue(revenue.doubleValue());
        }
        String countryCode = data.getCountryCode();
        if (countryCode != null) {
            dsl_create.setCountryCode(countryCode);
        }
        String networkName = data.getNetworkName();
        if (networkName != null) {
            dsl_create.setNetworkName(networkName);
        }
        String adUnitId = data.getAdUnitId();
        if (adUnitId != null) {
            dsl_create.setAdUnitId(adUnitId);
        }
        String thirdPartyAdPlacementId = data.getThirdPartyAdPlacementId();
        if (thirdPartyAdPlacementId != null) {
            dsl_create.setThirdPartyAdPlacementId(thirdPartyAdPlacementId);
        }
        AdRevenueAdFormat adFormat = data.getAdFormat();
        if (adFormat == null || (proto = AndroidGetAdRevenueEventDataKt.toProto(adFormat)) == null) {
            proto = AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        dsl_create.setAdFormat(proto);
        return dsl_create._build();
    }
}
