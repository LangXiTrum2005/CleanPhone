package com.unity3d.ads.core.domain;

import ak.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦Bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdRequest;", "", "", "placement", "Lcom/google/protobuf/ByteString;", "impressionOpportunity", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "size", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "loadConfiguration", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lak/f;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface GetAdRequest {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 4) != 0) {
                bannerSize = null;
            }
            if ((i10 & 8) != 0) {
                loadConfigurationInternal = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, loadConfigurationInternal, fVar);
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, f fVar);
}
