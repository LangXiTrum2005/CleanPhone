package com.unity3d.ads.core.domain.scar;

import ak.f;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H¦Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "", "", "tokenNumber", "Lcom/google/protobuf/ByteString;", "tokenId", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lwj/r;", "invoke", "(ILcom/google/protobuf/ByteString;Lcom/unity3d/ads/TokenConfiguration;Lak/f;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface FetchSignalsAndSendUseCase {
    Object invoke(int i10, ByteString byteString, TokenConfiguration tokenConfiguration, f fVar);
}
