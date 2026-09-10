package com.unity3d.ads.core.domain;

import ak.f;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦Bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "webviewConfiguration", "Lwj/r;", "invoke", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lak/f;)Ljava/lang/Object;", "", "", "Ljava/io/File;", "getCached", "()Ljava/util/Map;", "cached", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface CacheWebViewAssets {
    Map<String, File> getCached();

    Object invoke(WebViewConfiguration webViewConfiguration, f fVar);
}
