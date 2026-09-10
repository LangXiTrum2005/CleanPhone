package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "", "fetch", "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "allowed", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface PrivacyDeviceInfoDataSource {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static /* synthetic */ PiiOuterClass.Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, AllowedPiiOuterClass.AllowedPii allowedPii, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i10 & 1) != 0) {
                allowedPii = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
                n.e(allowedPii, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource.fetch(allowedPii);
        }
    }

    PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowed);
}
